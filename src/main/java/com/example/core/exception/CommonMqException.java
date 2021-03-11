package com.example.core.exception;

import javax.sound.midi.Sequence;
import javax.sound.midi.Sequencer;

/**
 * @Description:
 * @Author: luw
 * @Date: 2021/3/11 20:26
 */

public class CommonMqException extends RuntimeException {

    public CommonMqException(String message) {
        super(message);
    }
}
