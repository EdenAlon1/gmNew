package defpackage;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dpbs extends ffhv implements ffjm {
    int a;
    final /* synthetic */ ByteBuffer b;
    final /* synthetic */ dpbu c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dpbs(ByteBuffer byteBuffer, dpbu dpbuVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = byteBuffer;
        this.c = dpbuVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dpbs) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0075, code lost:
    
        if (defpackage.ffvt.a(r10) == r0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0021, code lost:
    
        if (r11 != r0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0080, code lost:
    
        return r0;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0021 -> B:5:0x0023). Please report as a decompilation issue!!! */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r11) {
        /*
            r10 = this;
            ffhh r0 = defpackage.ffhh.a
            int r1 = r10.a
            r2 = 1
            if (r1 == 0) goto Le
            if (r1 == r2) goto La
            goto Le
        La:
            defpackage.ffci.b(r11)
            goto L23
        Le:
            defpackage.ffci.b(r11)
        L11:
            java.nio.ByteBuffer r11 = r10.b
            int r11 = r11.remaining()
            if (r11 <= 0) goto L81
            dpbu r11 = r10.c
            r10.a = r2
            java.lang.Object r11 = r11.b(r10)
            if (r11 == r0) goto L80
        L23:
            java.lang.Number r11 = (java.lang.Number) r11
            int r4 = r11.intValue()
            dpbu r11 = r10.c
            android.media.MediaCodec r11 = r11.d
            r1 = 0
            java.lang.String r3 = "mediaCodec"
            if (r11 != 0) goto L36
            defpackage.ffkj.c(r3)
            r11 = r1
        L36:
            java.nio.ByteBuffer r11 = r11.getInputBuffer(r4)
            if (r11 == 0) goto L78
            java.nio.ByteBuffer r5 = r10.b
            int r5 = r5.remaining()
            int r6 = r11.remaining()
            int r6 = java.lang.Math.min(r5, r6)
            java.nio.ByteBuffer r5 = r10.b
            defpackage.dpce.a(r11, r5, r6)
            dpbu r11 = r10.c
            android.media.MediaCodec r11 = r11.d
            if (r11 != 0) goto L5a
            defpackage.ffkj.c(r3)
            r3 = r1
            goto L5b
        L5a:
            r3 = r11
        L5b:
            dpbu r11 = r10.c
            long r7 = r11.a()
            r9 = 0
            r5 = 0
            r3.queueInputBuffer(r4, r5, r6, r7, r9)
            dpbu r11 = r10.c
            long r3 = (long) r6
            long r5 = r11.h
            long r5 = r5 + r3
            r11.h = r5
            r11 = 2
            r10.a = r11
            java.lang.Object r11 = defpackage.ffvt.a(r10)
            if (r11 != r0) goto L11
            goto L80
        L78:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "Input buffer should have been dequeued"
            r11.<init>(r0)
            throw r11
        L80:
            return r0
        L81:
            ffcu r11 = defpackage.ffcu.a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dpbs.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dpbs(this.b, this.c, ffguVar);
    }
}
