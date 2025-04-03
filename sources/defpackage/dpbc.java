package defpackage;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.media.MediaCodec;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dpbc extends ffhv implements ffjm {
    Object a;
    int b;
    final /* synthetic */ dpbd c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dpbc(dpbd dpbdVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.c = dpbdVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dpbc) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
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
            dpbd dpbdVar = this.c;
            this.a = bufferInfo;
            this.b = 1;
            Object c = dpbdVar.c(bufferInfo, this);
            if (c == ffhhVar) {
                return ffhhVar;
            }
            obj2 = bufferInfo;
            obj = c;
        }
        int intValue = ((Number) obj).intValue();
        MediaCodec mediaCodec = null;
        if (intValue == -2) {
            dpbd dpbdVar2 = this.c;
            if (dpbdVar2.f == null) {
                Context context = dpbdVar2.c;
                dpbe dpbeVar = dpbdVar2.d;
                dpbdVar2.f = new AssetFileDescriptor.AutoCloseOutputStream(eepn.a(context, dpbeVar.a, "wt", dpbeVar.b));
                dpbdVar2.h += 6;
                AssetFileDescriptor.AutoCloseOutputStream autoCloseOutputStream = dpbdVar2.f;
                if (autoCloseOutputStream == null) {
                    ffkj.c("outputStream");
                    autoCloseOutputStream = null;
                }
                autoCloseOutputStream.getChannel().write(ByteBuffer.wrap(dpbd.b));
            }
            intValue = -2;
        }
        if (intValue < 0) {
            return obj2;
        }
        MediaCodec mediaCodec2 = this.c.e;
        if (mediaCodec2 == null) {
            ffkj.c("mediaCodec");
            mediaCodec2 = null;
        }
        ByteBuffer outputBuffer = mediaCodec2.getOutputBuffer(intValue);
        if (outputBuffer == null) {
            throw new IllegalStateException("Output buffer should have been dequeued");
        }
        dpbd dpbdVar3 = this.c;
        if (!dpbdVar3.i) {
            int i = ((MediaCodec.BufferInfo) obj2).size;
            if (dpbdVar3.d.f != null) {
                if (dpbdVar3.h + i > r9.intValue()) {
                    dpbdVar3.i = true;
                }
            }
            dpbdVar3.h += r7.size;
            AssetFileDescriptor.AutoCloseOutputStream autoCloseOutputStream2 = dpbdVar3.f;
            if (autoCloseOutputStream2 == null) {
                ffkj.c("outputStream");
                autoCloseOutputStream2 = null;
            }
            autoCloseOutputStream2.getChannel().write(outputBuffer);
        }
        MediaCodec mediaCodec3 = this.c.e;
        if (mediaCodec3 == null) {
            ffkj.c("mediaCodec");
        } else {
            mediaCodec = mediaCodec3;
        }
        mediaCodec.releaseOutputBuffer(intValue, false);
        return obj2;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dpbc(this.c, ffguVar);
    }
}
