package defpackage;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dpbb extends ffhv implements ffjm {
    int a;
    final /* synthetic */ ByteBuffer b;
    final /* synthetic */ dpbd c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dpbb(ByteBuffer byteBuffer, dpbd dpbdVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = byteBuffer;
        this.c = dpbdVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dpbb) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0079, code lost:
    
        if (defpackage.ffvt.a(r10) == r0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0023, code lost:
    
        if (r11 != r0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0084, code lost:
    
        return r0;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0023 -> B:5:0x0025). Please report as a decompilation issue!!! */
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
            goto L25
        Le:
            defpackage.ffci.b(r11)
        L11:
            java.nio.ByteBuffer r11 = r10.b
            int r11 = r11.remaining()
            if (r11 <= 0) goto L85
            dpbd r11 = r10.c
            r10.a = r2
            enru r1 = defpackage.dpbd.a
            java.lang.Object r11 = r11.b(r10)
            if (r11 == r0) goto L84
        L25:
            java.lang.Number r11 = (java.lang.Number) r11
            int r4 = r11.intValue()
            enru r11 = defpackage.dpbd.a
            dpbd r11 = r10.c
            android.media.MediaCodec r11 = r11.e
            r1 = 0
            java.lang.String r3 = "mediaCodec"
            if (r11 != 0) goto L3a
            defpackage.ffkj.c(r3)
            r11 = r1
        L3a:
            java.nio.ByteBuffer r11 = r11.getInputBuffer(r4)
            if (r11 == 0) goto L7c
            java.nio.ByteBuffer r5 = r10.b
            int r5 = r5.remaining()
            int r6 = r11.remaining()
            int r6 = java.lang.Math.min(r5, r6)
            java.nio.ByteBuffer r5 = r10.b
            defpackage.dpce.a(r11, r5, r6)
            dpbd r11 = r10.c
            android.media.MediaCodec r11 = r11.e
            if (r11 != 0) goto L5e
            defpackage.ffkj.c(r3)
            r3 = r1
            goto L5f
        L5e:
            r3 = r11
        L5f:
            dpbd r11 = r10.c
            long r7 = r11.a()
            r9 = 0
            r5 = 0
            r3.queueInputBuffer(r4, r5, r6, r7, r9)
            dpbd r11 = r10.c
            long r3 = (long) r6
            long r5 = r11.g
            long r5 = r5 + r3
            r11.g = r5
            r11 = 2
            r10.a = r11
            java.lang.Object r11 = defpackage.ffvt.a(r10)
            if (r11 != r0) goto L11
            goto L84
        L7c:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "Input buffer should have been dequeued"
            r11.<init>(r0)
            throw r11
        L84:
            return r0
        L85:
            ffcu r11 = defpackage.ffcu.a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dpbb.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dpbb(this.b, this.c, ffguVar);
    }
}
