package defpackage;

import android.media.MediaCodec;
import android.media.MediaExtractor;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dpbh extends ffhv implements ffjm {
    final /* synthetic */ dpbj a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dpbh(dpbj dpbjVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = dpbjVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dpbh) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        MediaCodec mediaCodec;
        MediaCodec mediaCodec2;
        ffci.b(obj);
        dpbj dpbjVar = this.a;
        if (!dpbjVar.a()) {
            throw new IllegalStateException("This instance needs to be prepared before filling input buffers");
        }
        MediaCodec mediaCodec3 = dpbjVar.d;
        MediaExtractor mediaExtractor = null;
        if (mediaCodec3 == null) {
            ffkj.c("mediaCodec");
            mediaCodec3 = null;
        }
        int dequeueInputBuffer = mediaCodec3.dequeueInputBuffer(0L);
        if (dequeueInputBuffer < 0) {
            return dpbm.b;
        }
        MediaCodec mediaCodec4 = this.a.d;
        if (mediaCodec4 == null) {
            ffkj.c("mediaCodec");
            mediaCodec4 = null;
        }
        ByteBuffer inputBuffer = mediaCodec4.getInputBuffer(dequeueInputBuffer);
        if (inputBuffer == null) {
            throw new IllegalStateException("Input buffer should have been dequeued");
        }
        MediaExtractor mediaExtractor2 = this.a.c;
        if (mediaExtractor2 == null) {
            ffkj.c("mediaExtractor");
            mediaExtractor2 = null;
        }
        int readSampleData = mediaExtractor2.readSampleData(inputBuffer, 0);
        if (readSampleData < 0) {
            MediaCodec mediaCodec5 = this.a.d;
            if (mediaCodec5 == null) {
                ffkj.c("mediaCodec");
                mediaCodec2 = null;
            } else {
                mediaCodec2 = mediaCodec5;
            }
            mediaCodec2.queueInputBuffer(dequeueInputBuffer, 0, 0, 0L, 4);
            return dpbm.c;
        }
        MediaCodec mediaCodec6 = this.a.d;
        if (mediaCodec6 == null) {
            ffkj.c("mediaCodec");
            mediaCodec = null;
        } else {
            mediaCodec = mediaCodec6;
        }
        MediaExtractor mediaExtractor3 = this.a.c;
        if (mediaExtractor3 == null) {
            ffkj.c("mediaExtractor");
            mediaExtractor3 = null;
        }
        mediaCodec.queueInputBuffer(dequeueInputBuffer, 0, readSampleData, mediaExtractor3.getSampleTime(), 0);
        MediaExtractor mediaExtractor4 = this.a.c;
        if (mediaExtractor4 == null) {
            ffkj.c("mediaExtractor");
        } else {
            mediaExtractor = mediaExtractor4;
        }
        mediaExtractor.advance();
        return dpbm.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dpbh(this.a, ffguVar);
    }
}
