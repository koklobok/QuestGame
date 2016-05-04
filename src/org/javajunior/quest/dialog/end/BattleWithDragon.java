package org.javajunior.quest.dialog.end;

import org.javajunior.quest.character.Player;
import org.javajunior.quest.character.PlayerAware;
import org.javajunior.quest.character.Weapon;
import org.javajunior.quest.dialog.SelectOptionDialogLink;
import org.javajunior.quest.dialog.DialogLink;
import org.javajunior.quest.util.Input;
import org.javajunior.quest.util.ThreadUtils;

import java.util.Random;

public class BattleWithDragon extends SelectOptionDialogLink {
    private Random random = new Random(17);

    @Override
    protected void printHello() {}

    @Override
    public String getDescription() {
        return "Сразится с драконом";
    }

    @Override
    public DialogLink nextDialog(DialogLink previousState, PlayerAware playerAware) {
        int dragonHealth = 100;
        int maxHitDragon = 20;

        Player player = playerAware.getPlayer();

        while ((player.getHealth() > 0) && (dragonHealth > 0)) {
            System.out.println("Выбери оружие для удара:");
            int inputNumber = 0;
            while (true) {
                Weapon[] weapons = Weapon.values();
                for (int i = 0; i < weapons.length; i++) {
                    System.out.println("" + (i + 1) + " - " + weapons[i]);
                }
                inputNumber = Input.readInt();
                if ((inputNumber > 0) && (inputNumber <= weapons.length)) {
                    break;
                }
            }
            Weapon weapon = Weapon.values()[inputNumber - 1];

            int playerHit = player.getHitValue(weapon);
            System.out.println("\nC помощью " + weapon + " ты наносишь " + playerHit + " пунктов удара.");
            dragonHealth -= playerHit;
            if (dragonHealth <= 0) {
                break;
            }

            int dragonHit = random.nextInt(maxHitDragon);
            player.consumeHit(dragonHit);
            System.out.println("\nДракон наносит " + dragonHit + " пунктов удара.");
            if (player.getHealth() <= 0 ) {
                break;
            }

            System.out.println("У тебя осталось: " + player.getHealth() + " здоровья; у дракона: " + dragonHealth
                    +"\n***********************\n");
            ThreadUtils.sleep(3500);
        }

        if (dragonHealth <= 0) {
            return new EndGamePlayerWins();
        } else {
            return new EndGameDragonWins();
        }
    }
}
