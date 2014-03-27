/*
 * Copyright (C) 2007-2014 Crafter Software Corporation.
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

package org.craftercms.studio.commons.exception;

import org.springframework.beans.factory.annotation.Required;

/**
 * @author Dejan Brkic
 */
public class ErrorMessageLoader {

    private ErrorManager errorManager;
    private String moduleId;
    private String errorMessageLocation;

    public void init() {
        errorManager.registerError(moduleId, errorMessageLocation);
    }

    @Required
    public void setErrorManager(final ErrorManager errorManager) {
        this.errorManager = errorManager;
    }

    @Required
    public void setModuleId(final String moduleId) {
        this.moduleId = moduleId;
    }

    @Required
    public void setErrorMessageLocation(final String errorMessageLocation) {
        this.errorMessageLocation = errorMessageLocation;
    }
}
