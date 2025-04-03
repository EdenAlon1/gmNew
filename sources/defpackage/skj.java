package defpackage;

import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaExtractor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class skj {
    public final Context a;
    public final ffhd b;
    public MediaExtractor c;
    public MediaCodec d;
    public final eoel e;
    private final fazb f;

    public skj(Context context, ffhd ffhdVar, fazb fazbVar) {
        context.getClass();
        ffhdVar.getClass();
        fazbVar.getClass();
        this.a = context;
        this.b = ffhdVar;
        this.f = fazbVar;
        this.e = new eoel();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0055 -> B:11:0x009b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x0081 -> B:10:0x0086). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(android.media.MediaCodec.BufferInfo r11, java.nio.channels.FileChannel r12, defpackage.ffgu r13) {
        /*
            r10 = this;
            boolean r0 = r13 instanceof defpackage.skg
            if (r0 == 0) goto L13
            r0 = r13
            skg r0 = (defpackage.skg) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f = r1
            goto L18
        L13:
            skg r0 = new skg
            r0.<init>(r10, r13)
        L18:
            java.lang.Object r13 = r0.d
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.f
            r3 = 1
            r4 = 0
            java.lang.String r5 = "mediaCodec"
            if (r2 == 0) goto L3c
            if (r2 != r3) goto L34
            int r11 = r0.c
            java.lang.Object r12 = r0.b
            java.lang.Object r2 = r0.a
            android.media.MediaCodec$BufferInfo r6 = r0.h
            skj r7 = r0.g
            defpackage.ffci.b(r13)
            goto L86
        L34:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L3c:
            defpackage.ffci.b(r13)
            r7 = r10
        L40:
            android.media.MediaCodec r13 = r7.d
            if (r13 != 0) goto L48
            defpackage.ffkj.c(r5)
            r13 = r4
        L48:
            r8 = 0
            int r13 = r13.dequeueOutputBuffer(r11, r8)
            if (r13 >= 0) goto L53
            ffcu r11 = defpackage.ffcu.a
            return r11
        L53:
            int r2 = r11.size
            if (r2 <= 0) goto L9b
            android.media.MediaCodec r2 = r7.d
            if (r2 != 0) goto L5f
            defpackage.ffkj.c(r5)
            r2 = r4
        L5f:
            java.nio.ByteBuffer r2 = r2.getOutputBuffer(r13)
            if (r2 == 0) goto L93
            fazb r6 = r7.f
            java.lang.Object r6 = r6.b()
            axub r6 = (defpackage.axub) r6
            int r8 = r11.size
            r0.g = r7
            r0.h = r11
            r0.a = r12
            r0.b = r2
            r0.c = r13
            r0.f = r3
            java.lang.Object r6 = r6.a(r8, r0)
            if (r6 == r1) goto L92
            r6 = r2
            r2 = r12
            r12 = r6
            r6 = r11
            r11 = r13
        L86:
            r13 = r2
            java.nio.channels.FileChannel r13 = (java.nio.channels.FileChannel) r13
            java.nio.ByteBuffer r12 = (java.nio.ByteBuffer) r12
            r13.write(r12)
            r13 = r11
            r12 = r2
            r11 = r6
            goto L9b
        L92:
            return r1
        L93:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "Output buffer should have been dequeued"
            r11.<init>(r12)
            throw r11
        L9b:
            android.media.MediaCodec r2 = r7.d
            if (r2 != 0) goto La3
            defpackage.ffkj.c(r5)
            r2 = r4
        La3:
            r6 = 0
            r2.releaseOutputBuffer(r13, r6)
            goto L40
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.skj.a(android.media.MediaCodec$BufferInfo, java.nio.channels.FileChannel, ffgu):java.lang.Object");
    }

    public final void b() {
        MediaCodec mediaCodec = this.d;
        if (mediaCodec != null) {
            mediaCodec.stop();
            MediaCodec mediaCodec2 = this.d;
            if (mediaCodec2 == null) {
                ffkj.c("mediaCodec");
                mediaCodec2 = null;
            }
            mediaCodec2.release();
        }
        MediaExtractor mediaExtractor = this.c;
        if (mediaExtractor != null) {
            mediaExtractor.release();
        }
        this.e.close();
    }

    public final boolean c() {
        return (this.c == null || this.d == null) ? false : true;
    }
}
