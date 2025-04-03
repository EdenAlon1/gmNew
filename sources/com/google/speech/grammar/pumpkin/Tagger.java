package com.google.speech.grammar.pumpkin;

import defpackage.faqe;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class Tagger {
    public static final Logger a = Logger.getLogger(Tagger.class.getName());
    public long b;
    private final Object c;

    public Tagger(faqe faqeVar) {
        byte[] byteArray = faqeVar.toByteArray();
        this.c = new Object();
        this.b = nativeConstruct(byteArray);
    }

    private static native long nativeConstruct(byte[] bArr);

    private static native void nativeDelete(long j);

    public static native byte[] nativeTagAndGetNBest(long j, long j2, long j3, String str, int i);

    protected final void finalize() {
        synchronized (this.c) {
            long j = this.b;
            if (j != 0) {
                nativeDelete(j);
                this.b = 0L;
            }
        }
    }
}
