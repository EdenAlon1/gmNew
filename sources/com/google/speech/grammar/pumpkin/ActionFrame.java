package com.google.speech.grammar.pumpkin;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class ActionFrame {
    public long a;
    private final Object b = new Object();

    public ActionFrame(long j) {
        if (j == 0) {
            throw new IllegalArgumentException("Can't initialize ActionFrame wrapper with a null ActionFrame");
        }
        this.a = j;
    }

    private static native void nativeDelete(long j);

    protected final void finalize() {
        synchronized (this.b) {
            long j = this.a;
            if (j != 0) {
                nativeDelete(j);
                this.a = 0L;
            }
        }
    }
}
