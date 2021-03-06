package cn.sakuratown.jeremyhu.sakuraarchitecture.commands.handlers;

import org.bukkit.entity.Player;

import static cn.sakuratown.jeremyhu.sakuraarchitecture.utils.ConfigUtil.*;
import static cn.sakuratown.jeremyhu.sakuraarchitecture.utils.KeyUtil.PLUGIN;
import static cn.sakuratown.jeremyhu.sakuraarchitecture.utils.MessageUtil.*;

public class SelectHandler extends CommandHandler {
    @Override
    public void handle(Player player, String[] args) {
        if (args.length == 1){
            PLUGIN.selectionMap.get(player).getBlocks();
            sendColorMsg(player, getSelectedMessage());
            sendMaterialListMsg(player,PLUGIN.selectionMap.get(player).getMaterials());
        }
    }
}
