package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dqra {
    private static final dqgm c = new dqgm(0);
    private static final enru d = enru.c("com/google/android/libraries/compose/emoji/data/gboard/FrecentEmojiProvider");
    public final duqi a;
    public final dqiz b;
    private final ffbz e;

    public dqra(duqi duqiVar, dqiz dqizVar) {
        duqiVar.getClass();
        this.a = duqiVar;
        this.b = dqizVar;
        this.e = ffca.a(new ffix() { // from class: dqqy
            @Override // defpackage.ffix
            public final Object invoke() {
                return dqra.this.b.a(new dqkd(31));
            }
        });
    }

    public final dqiy a() {
        return (dqiy) this.e.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0097 A[LOOP:0: B:11:0x0091->B:13:0x0097, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(int r7, defpackage.ffgu r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.dqqz
            if (r0 == 0) goto L13
            r0 = r8
            dqqz r0 = (defpackage.dqqz) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            dqqz r0 = new dqqz
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.b
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            int r7 = r0.a
            dqra r0 = r0.e
            defpackage.ffci.b(r8)
            goto L4d
        L2b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L33:
            defpackage.ffci.b(r8)
            dqiy r8 = r6.a()
            dqgm r2 = defpackage.dqra.c
            ffxx r8 = r8.b(r2)
            r0.e = r6
            r0.a = r7
            r0.d = r3
            java.lang.Object r8 = defpackage.fgbj.a(r8, r0)
            if (r8 == r1) goto La9
            r0 = r6
        L4d:
            ffnl r8 = (defpackage.ffnl) r8
            enru r1 = defpackage.dqra.d
            ensk r1 = r1.e()
            java.lang.String r2 = "getFrecents"
            r3 = 34
            java.lang.String r4 = "com/google/android/libraries/compose/emoji/data/gboard/FrecentEmojiProvider"
            java.lang.String r5 = "FrecentEmojiProvider.kt"
            ensk r1 = r1.h(r4, r2, r3, r5)
            enrr r1 = (defpackage.enrr) r1
            java.util.Iterator r2 = r8.a()
            boolean r2 = r2.hasNext()
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            java.lang.String r3 = "Has frecent emojis: %b"
            r1.t(r3, r2)
            dqqx r1 = new dqqx
            r1.<init>()
            ffnl r8 = defpackage.ffno.i(r8, r1)
            ffna r0 = new ffna
            r0.<init>(r8)
            ffnl r7 = defpackage.ffno.k(r0, r7)
            int r8 = defpackage.engw.d
            engr r8 = new engr
            r8.<init>()
            java.util.Iterator r7 = r7.a()
        L91:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto La1
            java.lang.Object r0 = r7.next()
            java.lang.String r0 = (java.lang.String) r0
            r8.h(r0)
            goto L91
        La1:
            engw r7 = r8.g()
            r7.getClass()
            return r7
        La9:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dqra.b(int, ffgu):java.lang.Object");
    }
}
