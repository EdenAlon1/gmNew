package com.google.speech.grammar.pumpkin;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class ActionFrameManager {
    public long a;
    private final Object b = new Object();

    public ActionFrameManager() {
        long nativeCreate = nativeCreate();
        this.a = nativeCreate;
        if (nativeCreate == 0) {
            throw new IllegalArgumentException("Couldn't create action_frame_manager from the provided config");
        }
    }

    private static native long nativeCreate();

    private static native void nativeDelete(long j);

    public static native long nativeLoadActionFrame(long j, byte[] bArr);

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
