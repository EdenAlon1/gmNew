package com.google.mediapipe.framework;

import defpackage.exlp;
import java.nio.charset.StandardCharsets;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class MediaPipeException extends RuntimeException {
    public MediaPipeException(int i, String str) {
        super(exlp.values()[i].s + ": " + str);
        exlp exlpVar = exlp.values()[i];
    }

    MediaPipeException(int i, byte[] bArr) {
        this(i, new String(bArr, StandardCharsets.UTF_8));
    }
}
