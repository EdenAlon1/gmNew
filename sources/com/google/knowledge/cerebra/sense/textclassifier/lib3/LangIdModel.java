package com.google.knowledge.cerebra.sense.textclassifier.lib3;

import defpackage.ewvk;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class LangIdModel implements AutoCloseable {
    public long a;
    private final AtomicBoolean b = new AtomicBoolean(false);

    /* compiled from: PG */
    public static final class LanguageResult {
        public final String a;
        public final float b;

        LanguageResult(String str, float f) {
            this.a = str;
            this.b = f;
        }
    }

    static {
        ewvk.a();
    }

    public LangIdModel(int i, long j, long j2) {
        long nativeNewWithOffset = nativeNewWithOffset(i, j, j2);
        this.a = nativeNewWithOffset;
        if (nativeNewWithOffset == 0) {
            throw new IllegalArgumentException("Couldn't initialize LangId from given file descriptor.");
        }
    }

    private native void nativeClose(long j);

    private native float nativeGetLangIdNoiseThreshold(long j);

    private native int nativeGetMinTextSizeInBytes(long j);

    private native int nativeGetVersion(long j);

    private static native long nativeNewWithOffset(int i, long j, long j2);

    public final int a() {
        return nativeGetVersion(this.a);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (this.b.compareAndSet(false, true)) {
            nativeClose(this.a);
            this.a = 0L;
        }
    }

    protected final void finalize() {
        try {
            close();
        } finally {
            super.finalize();
        }
    }

    float getLangIdNoiseThreshold() {
        return nativeGetLangIdNoiseThreshold(this.a);
    }

    int getMinTextSizeInBytes() {
        return nativeGetMinTextSizeInBytes(this.a);
    }

    public native LanguageResult[] nativeDetectLanguages(long j, String str);

    public native float nativeGetLangIdThreshold(long j);
}
