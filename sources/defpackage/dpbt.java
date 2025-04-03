package defpackage;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.media.MediaCodec;
import android.media.MediaMuxer;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dpbt extends ffhv implements ffjm {
    Object a;
    int b;
    final /* synthetic */ dpbu c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dpbt(dpbu dpbuVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.c = dpbuVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dpbt) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        Object obj2;
        ffhh ffhhVar = ffhh.a;
        if (this.b != 0) {
            obj2 = this.a;
            ffci.b(obj);
        } else {
            ffci.b(obj);
            MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
            dpbu dpbuVar = this.c;
            this.a = bufferInfo;
            this.b = 1;
            Object c = dpbuVar.c(bufferInfo, this);
            if (c == ffhhVar) {
                return ffhhVar;
            }
            obj2 = bufferInfo;
            obj = c;
        }
        int intValue = ((Number) obj).intValue();
        if (intValue < 0) {
            return obj2;
        }
        MediaCodec.BufferInfo bufferInfo2 = (MediaCodec.BufferInfo) obj2;
        MediaCodec mediaCodec = null;
        if (dpcd.a(bufferInfo2)) {
            MediaCodec mediaCodec2 = this.c.d;
            if (mediaCodec2 == null) {
                ffkj.c("mediaCodec");
            } else {
                mediaCodec = mediaCodec2;
            }
            mediaCodec.releaseOutputBuffer(intValue, false);
            return obj2;
        }
        MediaCodec mediaCodec3 = this.c.d;
        if (mediaCodec3 == null) {
            ffkj.c("mediaCodec");
            mediaCodec3 = null;
        }
        ByteBuffer outputBuffer = mediaCodec3.getOutputBuffer(intValue);
        if (outputBuffer == null) {
            throw new IllegalStateException("Output buffer should have been dequeued");
        }
        dpbu dpbuVar2 = this.c;
        if (!dpbuVar2.j) {
            int i = bufferInfo2.size;
            if (dpbuVar2.c.f != null) {
                if (dpbuVar2.i + i > r9.intValue()) {
                    dpbuVar2.j = true;
                }
            }
            if (dpbuVar2.e == null) {
                if (bufferInfo2.size > 0) {
                    Context context = dpbuVar2.b;
                    dpbv dpbvVar = dpbuVar2.c;
                    dpbuVar2.f = eepn.a(context, dpbvVar.a, "wt", dpbvVar.b);
                    AssetFileDescriptor assetFileDescriptor = dpbuVar2.f;
                    if (assetFileDescriptor == null) {
                        ffkj.c("fileDescriptor");
                        assetFileDescriptor = null;
                    }
                    dpbuVar2.e = new MediaMuxer(assetFileDescriptor.getFileDescriptor(), 0);
                    MediaMuxer mediaMuxer = dpbuVar2.e;
                    if (mediaMuxer == null) {
                        ffkj.c("mediaMuxer");
                        mediaMuxer = null;
                    }
                    MediaCodec mediaCodec4 = dpbuVar2.d;
                    if (mediaCodec4 == null) {
                        ffkj.c("mediaCodec");
                        mediaCodec4 = null;
                    }
                    dpbuVar2.g = mediaMuxer.addTrack(mediaCodec4.getOutputFormat());
                    MediaMuxer mediaMuxer2 = dpbuVar2.e;
                    if (mediaMuxer2 == null) {
                        ffkj.c("mediaMuxer");
                        mediaMuxer2 = null;
                    }
                    mediaMuxer2.start();
                }
            }
            dpbuVar2.i += bufferInfo2.size;
            MediaMuxer mediaMuxer3 = dpbuVar2.e;
            if (mediaMuxer3 == null) {
                ffkj.c("mediaMuxer");
                mediaMuxer3 = null;
            }
            mediaMuxer3.writeSampleData(dpbuVar2.g, outputBuffer, bufferInfo2);
        }
        MediaCodec mediaCodec5 = this.c.d;
        if (mediaCodec5 == null) {
            ffkj.c("mediaCodec");
        } else {
            mediaCodec = mediaCodec5;
        }
        mediaCodec.releaseOutputBuffer(intValue, false);
        return obj2;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dpbt(this.c, ffguVar);
    }
}
