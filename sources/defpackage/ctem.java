package defpackage;

import android.media.MediaCodec;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ctem {
    public final MediaCodec a;
    public final MediaCodec.BufferInfo b = new MediaCodec.BufferInfo();
    public ByteBuffer[] c;
    public ByteBuffer[] d;
    public boolean e;

    public ctem(MediaCodec mediaCodec) {
        this.a = mediaCodec;
        if (mediaCodec != null) {
            this.c = mediaCodec.getInputBuffers();
            this.d = mediaCodec.getOutputBuffers();
        }
        this.e = mediaCodec == null;
    }
}
