/*
 * SymmetricDS is an open source database synchronization solution.
 *   
 * Copyright (C) Chris Henson <chenson42@users.sourceforge.net>,
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, see
 * <http://www.gnu.org/licenses/>.
 */
package org.jumpmind.symmetric;

import org.jumpmind.symmetric.db.IDbDialect;

public class ActivityListenerSupport implements IActivityListener {

    public boolean createConfigurationTables(IDbDialect dbDialect) {
        return true;
    }

    public boolean upgradeNeeded(String oldVersion, String newVersion) {
        return false;
    }

    public void dataBatchReceived(DataEvent event) {
    }

    public void dataBatchSent(DataEvent event) {
    }

    public void loaded() {
    }

    public void nodeRegistered(String nodeId) {
    }

    public void registered() {
    }

    public void registrationOpened(String nodeId) {
    }

    public void tablesCreated() {
    }

}
