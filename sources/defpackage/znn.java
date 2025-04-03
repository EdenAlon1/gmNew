package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class znn implements PointerInputEventHandler {
    final /* synthetic */ ffsk a;
    final /* synthetic */ cxj b;
    final /* synthetic */ zmz c;
    final /* synthetic */ hkx d;
    final /* synthetic */ hjx e;

    public znn(ffsk ffskVar, hjx hjxVar, cxj cxjVar, zmz zmzVar, hkx hkxVar) {
        this.a = ffskVar;
        this.e = hjxVar;
        this.b = cxjVar;
        this.c = zmzVar;
        this.d = hkxVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x00b8, code lost:
    
        if (r1 == r3) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(defpackage.ild r20, defpackage.ffgu<? super defpackage.ffcu> r21) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            r2 = r21
            boolean r3 = r2 instanceof defpackage.znm
            if (r3 == 0) goto L19
            r3 = r2
            znm r3 = (defpackage.znm) r3
            int r4 = r3.c
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L19
            int r4 = r4 - r5
            r3.c = r4
            goto L1e
        L19:
            znm r3 = new znm
            r3.<init>(r0, r2)
        L1e:
            r9 = r3
            java.lang.Object r2 = r9.a
            ffhh r3 = defpackage.ffhh.a
            int r4 = r9.c
            r5 = 2
            r6 = 1
            if (r4 == 0) goto L47
            if (r4 == r6) goto L3a
            if (r4 != r5) goto L32
            defpackage.ffci.b(r2)
            goto Lbb
        L32:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L3a:
            imf r1 = r9.e
            znn r4 = r9.d
            defpackage.ffci.b(r2)
            r18 = r4
            r4 = r1
            r1 = r18
            goto L87
        L47:
            defpackage.ffci.b(r2)
            ffsk r2 = r0.a
            hjx r4 = r0.e
            cxj r7 = r0.b
            zmz r8 = r0.c
            zpa r10 = new zpa
            akzt r8 = r8.h
            r10.<init>(r2, r4, r7, r8)
            zmz r2 = r0.c
            r9.d = r0
            r4 = r1
            imf r4 = (defpackage.imf) r4
            r9.e = r4
            r9.c = r6
            ffsk r13 = r10.a
            hho r14 = r10.b
            cxj r4 = r10.c
            akzt r15 = r10.d
            zmy r2 = r2.s
            zox r11 = new zox
            boolean r12 = r2.d
            r17 = 0
            r16 = r4
            r11.<init>(r12, r13, r14, r15, r16, r17)
            java.lang.Object r2 = defpackage.dpu.b(r1, r11, r9)
            ffhh r4 = defpackage.ffhh.a
            if (r2 == r4) goto L83
            ffcu r2 = defpackage.ffcu.a
        L83:
            if (r2 == r3) goto Lbe
            r4 = r1
            r1 = r0
        L87:
            hkx r2 = r1.d
            java.lang.Object r2 = r2.a()
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto Lbb
            ffsk r2 = r1.a
            cxj r1 = r1.b
            znk r6 = new znk
            r6.<init>()
            r1 = 0
            r9.d = r1
            r9.e = r1
            r9.c = r5
            znc r8 = new znc
            r8.<init>()
            r10 = 7
            r5 = 0
            r6 = 0
            r7 = 0
            java.lang.Object r1 = defpackage.dtr.i(r4, r5, r6, r7, r8, r9, r10)
            ffhh r2 = defpackage.ffhh.a
            if (r1 == r2) goto Lb8
            ffcu r1 = defpackage.ffcu.a
        Lb8:
            if (r1 != r3) goto Lbb
            goto Lbe
        Lbb:
            ffcu r1 = defpackage.ffcu.a
            return r1
        Lbe:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.znn.invoke(ild, ffgu):java.lang.Object");
    }
}
