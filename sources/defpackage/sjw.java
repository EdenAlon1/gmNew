package defpackage;

import android.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sjw implements sjo {
    public static final entd a = entd.c("BugleVmt");
    public final ared b;
    private final ea c;
    private final siz d;
    private final ffsk e;

    public sjw(ea eaVar, ared aredVar, siz sizVar, ffsk ffskVar) {
        ffskVar.getClass();
        this.c = eaVar;
        this.b = aredVar;
        this.d = sizVar;
        this.e = ffskVar;
    }

    private final Object i(final int i, int i2, int i3, ffgu ffguVar) {
        eg fe = this.c.fe();
        ffji ffjiVar = new ffji() { // from class: sjp
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                ehft ehftVar = (ehft) obj;
                entd entdVar = sjw.a;
                ehftVar.getClass();
                ehftVar.x(i);
                return ffcu.a;
            }
        };
        Integer valueOf = Integer.valueOf(R.string.cancel);
        String string = fe.getString(i2);
        string.getClass();
        String string2 = fe.getString(i3);
        string2.getClass();
        return dsko.a(fe, string, string2, fe.getString(valueOf.intValue()), true, ffjiVar, ffguVar);
    }

    private final Object j(String str, ffgu ffguVar) {
        ((ensz) a.h()).t("Opening marketplace for package %s", str);
        Object a2 = dski.a(this.c.fe(), str, ffguVar);
        return a2 == ffhh.a ? a2 : ffcu.a;
    }

    @Override // defpackage.sjo
    public final void a(aree areeVar) {
        axol.k(this.e, null, new sju(areeVar, this, null), 3);
    }

    public final int b(ardy ardyVar) {
        if (ardyVar instanceof ardw) {
            ardr ardrVar = ((ardw) ardyVar).a;
            if (ardrVar instanceof ardq) {
                return com.google.android.apps.messaging.R.string.install_transcription_host_snackbar;
            }
            if (ardrVar instanceof ardp) {
                return com.google.android.apps.messaging.R.string.update_transcription_host_snackbar;
            }
            throw new ffcd();
        }
        if (!(ardyVar instanceof ardx)) {
            throw new ffcd();
        }
        ardx ardxVar = (ardx) ardyVar;
        int i = ardxVar.b - 1;
        if (i == 0) {
            return com.google.android.apps.messaging.R.string.language_model_unsupported_snackbar;
        }
        if (i == 2 || i == 3) {
            return com.google.android.apps.messaging.R.string.language_model_downloading_snackbar;
        }
        throw new IllegalStateException("Language pack for " + ardxVar.a.toLanguageTag() + " is available, an error should not have been returned.");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.ffgu r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.sjq
            if (r0 == 0) goto L13
            r0 = r6
            sjq r0 = (defpackage.sjq) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            sjq r0 = new sjq
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.b
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            java.lang.Object r0 = r0.a
            defpackage.ffci.b(r6)
            return r0
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L34:
            java.lang.Object r2 = r0.a
            sjw r2 = (defpackage.sjw) r2
            defpackage.ffci.b(r6)
            goto L53
        L3c:
            defpackage.ffci.b(r6)
            r0.a = r5
            r0.d = r4
            r6 = 2132084960(0x7f1508e0, float:1.9810105E38)
            r2 = 2132084953(0x7f1508d9, float:1.9810091E38)
            r4 = 2132084954(0x7f1508da, float:1.9810093E38)
            java.lang.Object r6 = r5.i(r4, r6, r2, r0)
            if (r6 == r1) goto L6a
            r2 = r5
        L53:
            r4 = r6
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L69
            r0.a = r6
            r0.d = r3
            java.lang.String r3 = "com.google.android.googlequicksearchbox"
            java.lang.Object r0 = r2.j(r3, r0)
            if (r0 != r1) goto L69
            goto L6a
        L69:
            return r6
        L6a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sjw.c(ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.ffgu r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.sjr
            if (r0 == 0) goto L13
            r0 = r6
            sjr r0 = (defpackage.sjr) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            sjr r0 = new sjr
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.b
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            java.lang.Object r0 = r0.a
            defpackage.ffci.b(r6)
            return r0
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L34:
            java.lang.Object r2 = r0.a
            sjw r2 = (defpackage.sjw) r2
            defpackage.ffci.b(r6)
            goto L53
        L3c:
            defpackage.ffci.b(r6)
            r0.a = r5
            r0.d = r4
            r6 = 2132088748(0x7f1517ac, float:1.9817788E38)
            r2 = 2132088733(0x7f15179d, float:1.9817758E38)
            r4 = 2132088734(0x7f15179e, float:1.981776E38)
            java.lang.Object r6 = r5.i(r4, r6, r2, r0)
            if (r6 == r1) goto L6a
            r2 = r5
        L53:
            r4 = r6
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L69
            r0.a = r6
            r0.d = r3
            java.lang.String r3 = "com.google.android.googlequicksearchbox"
            java.lang.Object r0 = r2.j(r3, r0)
            if (r0 != r1) goto L69
            goto L6a
        L69:
            return r6
        L6a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sjw.d(ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.ffgu r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.sjs
            if (r0 == 0) goto L13
            r0 = r6
            sjs r0 = (defpackage.sjs) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            sjs r0 = new sjs
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.b
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            java.lang.Object r0 = r0.a
            defpackage.ffci.b(r6)
            return r0
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L34:
            java.lang.Object r2 = r0.a
            sjw r2 = (defpackage.sjw) r2
            defpackage.ffci.b(r6)
            goto L53
        L3c:
            defpackage.ffci.b(r6)
            r0.a = r5
            r0.d = r4
            r6 = 2132084960(0x7f1508e0, float:1.9810105E38)
            r2 = 2132084958(0x7f1508de, float:1.9810101E38)
            r4 = 2132084959(0x7f1508df, float:1.9810103E38)
            java.lang.Object r6 = r5.i(r4, r6, r2, r0)
            if (r6 == r1) goto L6a
            r2 = r5
        L53:
            r4 = r6
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L69
            r0.a = r6
            r0.d = r3
            java.lang.String r3 = "com.google.android.tts"
            java.lang.Object r0 = r2.j(r3, r0)
            if (r0 != r1) goto L69
            goto L6a
        L69:
            return r6
        L6a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sjw.e(ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(defpackage.ffgu r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.sjt
            if (r0 == 0) goto L13
            r0 = r6
            sjt r0 = (defpackage.sjt) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            sjt r0 = new sjt
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.b
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            java.lang.Object r0 = r0.a
            defpackage.ffci.b(r6)
            return r0
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L34:
            java.lang.Object r2 = r0.a
            sjw r2 = (defpackage.sjw) r2
            defpackage.ffci.b(r6)
            goto L53
        L3c:
            defpackage.ffci.b(r6)
            r0.a = r5
            r0.d = r4
            r6 = 2132088748(0x7f1517ac, float:1.9817788E38)
            r2 = 2132088736(0x7f1517a0, float:1.9817764E38)
            r4 = 2132088737(0x7f1517a1, float:1.9817766E38)
            java.lang.Object r6 = r5.i(r4, r6, r2, r0)
            if (r6 == r1) goto L6a
            r2 = r5
        L53:
            r4 = r6
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L69
            r0.a = r6
            r0.d = r3
            java.lang.String r3 = "com.google.android.tts"
            java.lang.Object r0 = r2.j(r3, r0)
            if (r0 != r1) goto L69
            goto L6a
        L69:
            return r6
        L6a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sjw.f(ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(defpackage.ardx r7, defpackage.ffgu r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.sjv
            if (r0 == 0) goto L13
            r0 = r8
            sjv r0 = (defpackage.sjv) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            sjv r0 = new sjv
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            ardx r7 = r0.e
            sjw r0 = r0.d
            defpackage.ffci.b(r8)
            goto Laa
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L34:
            defpackage.ffci.b(r8)
            int r8 = r7.b
            r2 = 4
            if (r8 != r2) goto La9
            java.util.Locale r8 = r7.a
            r0.d = r6
            r0.e = r7
            r0.c = r3
            cfup r2 = defpackage.shv.a
            ea r2 = r6.c
            android.content.Context r2 = r2.A()
            boolean r2 = defpackage.shv.a(r2)
            if (r2 == 0) goto L70
            entd r2 = defpackage.sjw.a
            ensk r2 = r2.h()
            ensz r2 = (defpackage.ensz) r2
            java.lang.String r3 = r8.toLanguageTag()
            java.lang.String r4 = "Triggering AiAi language model download for locale %s"
            r2.t(r4, r3)
            siz r2 = r6.d
            java.lang.Object r8 = r2.a(r8, r0)
            ffhh r0 = defpackage.ffhh.a
            if (r8 == r0) goto La6
            ffcu r8 = defpackage.ffcu.a
            goto La6
        L70:
            entd r2 = defpackage.sjw.a
            ensk r2 = r2.h()
            ensz r2 = (defpackage.ensz) r2
            java.lang.String r3 = r8.toLanguageTag()
            java.lang.String r4 = "Triggering host app language model download for locale %s"
            r2.t(r4, r3)
            ea r2 = r6.c
            eg r2 = r2.fe()
            java.lang.String r3 = r8.toLanguageTag()
            java.lang.String r3 = java.lang.String.valueOf(r3)
            siz r4 = r6.d
            siv r5 = new siv
            r5.<init>(r4)
            java.lang.String r4 = "soda_download_"
            java.lang.String r3 = r4.concat(r3)
            java.lang.Object r8 = defpackage.dski.e(r2, r3, r5, r8, r0)
            ffhh r0 = defpackage.ffhh.a
            if (r8 == r0) goto La6
            ffcu r8 = defpackage.ffcu.a
        La6:
            if (r8 != r1) goto La9
            return r1
        La9:
            r0 = r6
        Laa:
            int r7 = r0.b(r7)
            r0.h(r7)
            r7 = 0
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sjw.g(ardx, ffgu):java.lang.Object");
    }

    public final void h(int i) {
        String Y = this.c.Y(i);
        Y.getClass();
        ellj.f(new sjx(Y), this.c);
    }
}
