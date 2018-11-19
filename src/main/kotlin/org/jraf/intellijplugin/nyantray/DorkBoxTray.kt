/*
 * This source is part of the
 *      _____  ___   ____
 *  __ / / _ \/ _ | / __/___  _______ _
 * / // / , _/ __ |/ _/_/ _ \/ __/ _ `/
 * \___/_/|_/_/ |_/_/ (_)___/_/  \_, /
 *                              /___/
 * repository.
 *
 * Copyright (C) 2018 Benoit 'BoD' Lubek (BoD@JRAF.org)
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package org.jraf.intellijplugin.nyantray

import dorkbox.systemTray.SystemTray
import dorkbox.util.CacheUtil
import groovy.util.logging.Log4j

object DorkBoxTray: BaseTray {
    override fun hideIcon() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun showIcon() {
        SystemTray.FORCE_GTK2 = true
        SystemTray.DEBUG = true;

        CacheUtil.clear();
        SystemTray.get().setImage(Images.sonic[0])
        SystemTray.get().trayImageSize
    }

}