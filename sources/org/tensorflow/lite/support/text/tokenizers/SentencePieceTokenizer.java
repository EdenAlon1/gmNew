package org.tensorflow.lite.support.text.tokenizers;

import java.nio.MappedByteBuffer;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class SentencePieceTokenizer implements AutoCloseable {
    private static volatile boolean c;
    public long a;
    public boolean b;

    public SentencePieceTokenizer(MappedByteBuffer mappedByteBuffer) {
        this.b = true;
        if (!c) {
            System.loadLibrary("sentencepiece_jni");
            c = true;
        }
        this.a = nativeLoadResource(mappedByteBuffer);
        this.b = true;
    }

    private native long nativeLoadResource(MappedByteBuffer mappedByteBuffer);

    private native long nativeUnloadResource(long j);

    @Override // java.lang.AutoCloseable
    public final void close() {
        long j = this.a;
        if (j != 0) {
            this.a = nativeUnloadResource(j);
        }
    }

    public native String[] nativeTokenize(long j, String str);
}
