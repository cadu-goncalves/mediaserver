/*
 * TeleStax, Open Source Cloud Communications
 * Copyright 2011-2016, Telestax Inc and individual contributors
 * by the @authors tag. 
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */

package org.mobicents.media.server.bootstrap.config;

/**
 * Configuration related to Resources Pools.
 * 
 * @author Henrique Rosa (henrique.rosa@telestax.com)
 *
 */
public class ResourcesConfiguration {

    private int localConnectionCount;
    private int remoteConnectionCount;
    private int playerCount;
    private int recorderCount;
    private int dtmfDetectorCount;
    private int dtmfDetectorDbi;
    private int dtmfGeneratorCount;
    private int dtmfGeneratorToneVolume;
    private int dtmfGeneratorToneDuration;
    private int signalDetectorCount;
    private int signalGeneratorCount;

    public ResourcesConfiguration() {
        this.localConnectionCount = 100;
        this.remoteConnectionCount = 50;
        this.playerCount = 50;
        this.recorderCount = 50;
        this.dtmfDetectorCount = 50;
        this.dtmfDetectorDbi = -35;
        this.dtmfGeneratorCount = 50;
        this.dtmfGeneratorToneVolume = -20;
        this.dtmfGeneratorToneDuration = 80;
        this.signalDetectorCount = 0;
        this.signalGeneratorCount = 0;
    }

    public int getLocalConnectionCount() {
        return localConnectionCount;
    }

    public void setLocalConnectionCount(int localConnectionCount) {
        if (localConnectionCount < 0) {
            throw new IllegalArgumentException("Local Connection count cannot be negative");
        }
        this.localConnectionCount = localConnectionCount;
    }

    public int getRemoteConnectionCount() {
        return remoteConnectionCount;
    }

    public void setRemoteConnectionCount(int remoteConnectionCount) {
        if (remoteConnectionCount < 0) {
            throw new IllegalArgumentException("Remote Connection count cannot be negative");
        }
        this.remoteConnectionCount = remoteConnectionCount;
    }

    public int getPlayerCount() {
        return playerCount;
    }

    public void setPlayerCount(int playerCount) {
        if (playerCount < 0) {
            throw new IllegalArgumentException("Player count cannot be negative");
        }
        this.playerCount = playerCount;
    }

    public int getRecorderCount() {
        return recorderCount;
    }

    public void setRecorderCount(int recorderCount) {
        if (recorderCount < 0) {
            throw new IllegalArgumentException("Recorder count cannot be negative");
        }
        this.recorderCount = recorderCount;
    }

    public int getDtmfDetectorCount() {
        return dtmfDetectorCount;
    }

    public void setDtmfDetectorCount(int dtmfDetectorCount) {
        if (dtmfDetectorCount < 0) {
            throw new IllegalArgumentException("DTMF Detector count cannot be negative");
        }
        this.dtmfDetectorCount = dtmfDetectorCount;
    }

    public int getDtmfDetectorDbi() {
        return dtmfDetectorDbi;
    }

    public void setDtmfDetectorDbi(int dtmfDetectorDbi) {
        if (dtmfDetectorDbi > 0 || dtmfDetectorDbi < -36) {
            throw new IllegalArgumentException("DTMF Detector Dbi must be negative and greater than -36");
        }
        this.dtmfDetectorDbi = dtmfDetectorDbi;
    }

    public int getDtmfGeneratorCount() {
        return dtmfGeneratorCount;
    }

    public void setDtmfGeneratorCount(int dtmfGeneratorCount) {
        if (dtmfGeneratorCount < 0) {
            throw new IllegalArgumentException("DTMF Generator count cannot be negative");
        }
        this.dtmfGeneratorCount = dtmfGeneratorCount;
    }

    public int getDtmfGeneratorToneVolume() {
        return dtmfGeneratorToneVolume;
    }

    public void setDtmfGeneratorToneVolume(int dtmfGeneratorToneVolume) {
        if (dtmfGeneratorToneVolume > 0) {
            throw new IllegalArgumentException("DTMF Generator Tone Volume cannot be positive");
        }
        this.dtmfGeneratorToneVolume = dtmfGeneratorToneVolume;
    }

    public int getDtmfGeneratorToneDuration() {
        return dtmfGeneratorToneDuration;
    }

    public void setDtmfGeneratorToneDuration(int dtmfGeneratorToneDuration) {
        if (dtmfGeneratorToneDuration < 0) {
            throw new IllegalArgumentException("DTMF Generator Tone Duration cannot be negative");
        }
        this.dtmfGeneratorToneDuration = dtmfGeneratorToneDuration;
    }

    public int getSignalDetectorCount() {
        return signalDetectorCount;
    }

    public void setSignalDetectorCount(int signalDetectorCount) {
        if (signalDetectorCount < 0) {
            throw new IllegalArgumentException("Signal Detector count cannot be negative");
        }
        this.signalDetectorCount = signalDetectorCount;
    }

    public int getSignalGeneratorCount() {
        return signalGeneratorCount;
    }

    public void setSignalGeneratorCount(int signalGeneratorCount) {
        if (signalGeneratorCount < 0) {
            throw new IllegalArgumentException("Signal Generator count cannot be negative");
        }
        this.signalGeneratorCount = signalGeneratorCount;
    }

}
