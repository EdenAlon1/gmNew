package defpackage;

import android.media.MediaCodec;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dpbi extends ffhv implements ffjm {
    final /* synthetic */ dpbj a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dpbi(dpbj dpbjVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = dpbjVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dpbi) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        if (!this.a.a()) {
            throw new IllegalStateException("This instance needs to be prepared before reading output buffers");
        }
        MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
        MediaCodec mediaCodec = this.a.d;
        MediaCodec mediaCodec2 = null;
        if (mediaCodec == null) {
            ffkj.c("mediaCodec");
            mediaCodec = null;
        }
        int dequeueOutputBuffer = mediaCodec.dequeueOutputBuffer(bufferInfo, 0L);
        if (dequeueOutputBuffer < 0) {
            return new dpbx(null, bufferInfo);
        }
        if (bufferInfo.size <= 0) {
            MediaCodec mediaCodec3 = this.a.d;
            if (mediaCodec3 == null) {
                ffkj.c("mediaCodec");
                mediaCodec3 = null;
            }
            mediaCodec3.releaseOutputBuffer(dequeueOutputBuffer, false);
            return new dpbx(null, bufferInfo);
        }
        MediaCodec mediaCodec4 = this.a.d;
        if (mediaCodec4 == null) {
            ffkj.c("mediaCodec");
            mediaCodec4 = null;
        }
        ByteBuffer outputBuffer = mediaCodec4.getOutputBuffer(dequeueOutputBuffer);
        if (outputBuffer == null) {
            throw new IllegalStateException("Output buffer should have been dequeued");
        }
        ByteBuffer allocate = ByteBuffer.allocate(outputBuffer.limit());
        allocate.getClass();
        outputBuffer.rewind();
        allocate.put(outputBuffer);
        outputBuffer.rewind();
        allocate.flip();
        MediaCodec mediaCodec5 = this.a.d;
        if (mediaCodec5 == null) {
            ffkj.c("mediaCodec");
        } else {
            mediaCodec2 = mediaCodec5;
        }
        mediaCodec2.releaseOutputBuffer(dequeueOutputBuffer, false);
        return new dpbx(allocate, bufferInfo);
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dpbi(this.a, ffguVar);
    }
}
