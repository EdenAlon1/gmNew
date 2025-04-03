package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.api.messaging.MessageId;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sjn implements sjb {
    public static final entd a = entd.c("BugleVmt");
    public final Context b;
    public final alye c;
    private final ffsk d;
    private final siz e;
    private final ajjc f;
    private final aigz g;
    private final ablq h;

    public sjn(Context context, ffsk ffskVar, siz sizVar, ablq ablqVar, ajjc ajjcVar, aigz aigzVar, alye alyeVar) {
        context.getClass();
        ffskVar.getClass();
        ablqVar.getClass();
        ajjcVar.getClass();
        aigzVar.getClass();
        alyeVar.getClass();
        this.b = context;
        this.d = ffskVar;
        this.e = sizVar;
        this.h = ablqVar;
        this.f = ajjcVar;
        this.g = aigzVar;
        this.c = alyeVar;
    }

    private final Object k(int i, int i2, int i3, ffgu ffguVar) {
        ffrh ffrhVar = new ffrh(ffhi.c(ffguVar), 1);
        ffrhVar.B();
        this.f.d(true, new sje(this, i, i2, i3, ffrhVar));
        return ffrhVar.m();
    }

    @Override // defpackage.sjb
    public final void a(MessageId messageId) {
        axol.k(this.d, null, new sjk(messageId, this, null), 3);
    }

    public final int b(ardy ardyVar) {
        if (ardyVar instanceof ardw) {
            ardr ardrVar = ((ardw) ardyVar).a;
            if (ardrVar instanceof ardq) {
                return R.string.install_transcription_host_snackbar;
            }
            if (ardrVar instanceof ardp) {
                return R.string.update_transcription_host_snackbar;
            }
            throw new ffcd();
        }
        if (!(ardyVar instanceof ardx)) {
            throw new ffcd();
        }
        ardx ardxVar = (ardx) ardyVar;
        int i = ardxVar.b - 1;
        if (i == 0) {
            return R.string.language_model_unsupported_snackbar;
        }
        if (i == 2 || i == 3) {
            return R.string.language_model_downloading_snackbar;
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
            boolean r0 = r6 instanceof defpackage.sjf
            if (r0 == 0) goto L13
            r0 = r6
            sjf r0 = (defpackage.sjf) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            sjf r0 = new sjf
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
            sjn r2 = (defpackage.sjn) r2
            defpackage.ffci.b(r6)
            goto L53
        L3c:
            defpackage.ffci.b(r6)
            r0.a = r5
            r0.d = r4
            r6 = 2132084960(0x7f1508e0, float:1.9810105E38)
            r2 = 2132084953(0x7f1508d9, float:1.9810091E38)
            r4 = 2132084954(0x7f1508da, float:1.9810093E38)
            java.lang.Object r6 = r5.k(r4, r6, r2, r0)
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
            java.lang.Object r0 = r2.g(r3, r0)
            if (r0 != r1) goto L69
            goto L6a
        L69:
            return r6
        L6a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sjn.c(ffgu):java.lang.Object");
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
            boolean r0 = r6 instanceof defpackage.sjg
            if (r0 == 0) goto L13
            r0 = r6
            sjg r0 = (defpackage.sjg) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            sjg r0 = new sjg
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
            sjn r2 = (defpackage.sjn) r2
            defpackage.ffci.b(r6)
            goto L53
        L3c:
            defpackage.ffci.b(r6)
            r0.a = r5
            r0.d = r4
            r6 = 2132088748(0x7f1517ac, float:1.9817788E38)
            r2 = 2132088733(0x7f15179d, float:1.9817758E38)
            r4 = 2132088734(0x7f15179e, float:1.981776E38)
            java.lang.Object r6 = r5.k(r4, r6, r2, r0)
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
            java.lang.Object r0 = r2.g(r3, r0)
            if (r0 != r1) goto L69
            goto L6a
        L69:
            return r6
        L6a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sjn.d(ffgu):java.lang.Object");
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
            boolean r0 = r6 instanceof defpackage.sjh
            if (r0 == 0) goto L13
            r0 = r6
            sjh r0 = (defpackage.sjh) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            sjh r0 = new sjh
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
            sjn r2 = (defpackage.sjn) r2
            defpackage.ffci.b(r6)
            goto L53
        L3c:
            defpackage.ffci.b(r6)
            r0.a = r5
            r0.d = r4
            r6 = 2132084960(0x7f1508e0, float:1.9810105E38)
            r2 = 2132084958(0x7f1508de, float:1.9810101E38)
            r4 = 2132084959(0x7f1508df, float:1.9810103E38)
            java.lang.Object r6 = r5.k(r4, r6, r2, r0)
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
            java.lang.Object r0 = r2.g(r3, r0)
            if (r0 != r1) goto L69
            goto L6a
        L69:
            return r6
        L6a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sjn.e(ffgu):java.lang.Object");
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
            boolean r0 = r6 instanceof defpackage.sji
            if (r0 == 0) goto L13
            r0 = r6
            sji r0 = (defpackage.sji) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            sji r0 = new sji
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
            sjn r2 = (defpackage.sjn) r2
            defpackage.ffci.b(r6)
            goto L53
        L3c:
            defpackage.ffci.b(r6)
            r0.a = r5
            r0.d = r4
            r6 = 2132088748(0x7f1517ac, float:1.9817788E38)
            r2 = 2132088736(0x7f1517a0, float:1.9817764E38)
            r4 = 2132088737(0x7f1517a1, float:1.9817766E38)
            java.lang.Object r6 = r5.k(r4, r6, r2, r0)
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
            java.lang.Object r0 = r2.g(r3, r0)
            if (r0 != r1) goto L69
            goto L6a
        L69:
            return r6
        L6a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sjn.f(ffgu):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00a7, code lost:
    
        if (r12 == r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(java.lang.String r11, defpackage.ffgu r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof defpackage.sjj
            if (r0 == 0) goto L13
            r0 = r12
            sjj r0 = (defpackage.sjj) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            sjj r0 = new sjj
            r0.<init>(r10, r12)
        L18:
            java.lang.Object r12 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            java.lang.String r3 = "android.intent.action.VIEW"
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3d
            if (r2 == r5) goto L35
            if (r2 != r4) goto L2d
            defpackage.ffci.b(r12)
            goto Laa
        L2d:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L35:
            java.lang.String r11 = r0.e
            sjn r2 = r0.d
            defpackage.ffci.b(r12)     // Catch: android.content.ActivityNotFoundException -> L7b
            goto L77
        L3d:
            defpackage.ffci.b(r12)
            entd r12 = defpackage.sjn.a
            ensk r12 = r12.h()
            ensz r12 = (defpackage.ensz) r12
            java.lang.String r2 = "Opening marketplace for package %s"
            r12.t(r2, r11)
            aigz r12 = r10.g     // Catch: android.content.ActivityNotFoundException -> L7a
            aiir r2 = new aiir     // Catch: android.content.ActivityNotFoundException -> L7a
            java.lang.String r6 = "App Marketplace"
            ael r7 = new ael     // Catch: android.content.ActivityNotFoundException -> L7a
            r7.<init>()     // Catch: android.content.ActivityNotFoundException -> L7a
            android.content.Intent r8 = new android.content.Intent     // Catch: android.content.ActivityNotFoundException -> L7a
            java.lang.String r9 = "market://details?id="
            java.lang.String r9 = defpackage.a.t(r11, r9)     // Catch: android.content.ActivityNotFoundException -> L7a
            android.net.Uri r9 = android.net.Uri.parse(r9)     // Catch: android.content.ActivityNotFoundException -> L7a
            r8.<init>(r3, r9)     // Catch: android.content.ActivityNotFoundException -> L7a
            r2.<init>(r6, r7, r8)     // Catch: android.content.ActivityNotFoundException -> L7a
            r0.d = r10     // Catch: android.content.ActivityNotFoundException -> L7a
            r0.e = r11     // Catch: android.content.ActivityNotFoundException -> L7a
            r0.c = r5     // Catch: android.content.ActivityNotFoundException -> L7a
            java.lang.Object r12 = r12.f(r2, r0)     // Catch: android.content.ActivityNotFoundException -> L7a
            if (r12 == r1) goto La9
            r2 = r10
        L77:
            ade r12 = (defpackage.ade) r12     // Catch: android.content.ActivityNotFoundException -> L7b
            goto Lac
        L7a:
            r2 = r10
        L7b:
            aigz r12 = r2.g
            aiir r2 = new aiir
            ael r5 = new ael
            r5.<init>()
            android.content.Intent r6 = new android.content.Intent
            java.lang.String r7 = "https://play.google.com/store/apps/details?id="
            java.lang.String r11 = java.lang.String.valueOf(r11)
            java.lang.String r11 = r7.concat(r11)
            android.net.Uri r11 = android.net.Uri.parse(r11)
            r6.<init>(r3, r11)
            java.lang.String r11 = "App Marketplace Web"
            r2.<init>(r11, r5, r6)
            r11 = 0
            r0.d = r11
            r0.e = r11
            r0.c = r4
            java.lang.Object r12 = r12.f(r2, r0)
            if (r12 != r1) goto Laa
        La9:
            return r1
        Laa:
            ade r12 = (defpackage.ade) r12
        Lac:
            ffcu r11 = defpackage.ffcu.a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sjn.g(java.lang.String, ffgu):java.lang.Object");
    }

    public final Object h(int i, ffgu ffguVar) {
        String string = this.b.getString(i);
        string.getClass();
        Object a2 = this.h.a(new ablt(string, null, true, 0, null, 117), ffguVar);
        return a2 == ffhh.a ? a2 : ffcu.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x005c, code lost:
    
        if (r9.a(r8, r0) == r1) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0095, code lost:
    
        if (r9 != r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(java.util.Locale r8, defpackage.ffgu r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.sjl
            if (r0 == 0) goto L13
            r0 = r9
            sjl r0 = (defpackage.sjl) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            sjl r0 = new sjl
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.ffci.b(r9)
            goto L97
        L2a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L32:
            defpackage.ffci.b(r9)
            goto L5f
        L36:
            defpackage.ffci.b(r9)
            cfup r9 = defpackage.shv.a
            android.content.Context r9 = r7.b
            boolean r9 = defpackage.shv.a(r9)
            if (r9 == 0) goto L62
            entd r9 = defpackage.sjn.a
            ensk r9 = r9.h()
            ensz r9 = (defpackage.ensz) r9
            java.lang.String r2 = r8.toLanguageTag()
            java.lang.String r3 = "Triggering AiAi language model download for locale %s"
            r9.t(r3, r2)
            siz r9 = r7.e
            r0.c = r4
            java.lang.Object r8 = r9.a(r8, r0)
            if (r8 != r1) goto L5f
            goto L9c
        L5f:
            ffcu r8 = defpackage.ffcu.a
            return r8
        L62:
            entd r9 = defpackage.sjn.a
            ensk r9 = r9.h()
            ensz r9 = (defpackage.ensz) r9
            java.lang.String r2 = r8.toLanguageTag()
            java.lang.String r4 = "Triggering host app language model download for locale %s"
            r9.t(r4, r2)
            aigz r9 = r7.g
            aiir r2 = new aiir
            java.lang.String r4 = r8.toLanguageTag()
            java.lang.String r4 = java.lang.String.valueOf(r4)
            siz r5 = r7.e
            siv r6 = new siv
            r6.<init>(r5)
            java.lang.String r5 = "soda_download_"
            java.lang.String r4 = r5.concat(r4)
            r2.<init>(r4, r6, r8)
            r0.c = r3
            java.lang.Object r9 = r9.f(r2, r0)
            if (r9 == r1) goto L9c
        L97:
            sdv r9 = (defpackage.sdv) r9
            ffcu r8 = defpackage.ffcu.a
            return r8
        L9c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sjn.i(java.util.Locale, ffgu):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0061, code lost:
    
        if (r2.h(r6, r0) != r1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0063, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004e, code lost:
    
        if (i(r7, r0) == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(defpackage.ardx r6, defpackage.ffgu r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.sjm
            if (r0 == 0) goto L13
            r0 = r7
            sjm r0 = (defpackage.sjm) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            sjm r0 = new sjm
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.ffci.b(r7)
            goto L64
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            ardx r6 = r0.e
            sjn r2 = r0.d
            defpackage.ffci.b(r7)
            goto L52
        L3a:
            defpackage.ffci.b(r7)
            int r7 = r6.b
            r2 = 4
            if (r7 != r2) goto L51
            java.util.Locale r7 = r6.a
            r0.d = r5
            r0.e = r6
            r0.c = r4
            java.lang.Object r7 = r5.i(r7, r0)
            if (r7 != r1) goto L51
            goto L63
        L51:
            r2 = r5
        L52:
            int r6 = r2.b(r6)
            r7 = 0
            r0.d = r7
            r0.e = r7
            r0.c = r3
            java.lang.Object r6 = r2.h(r6, r0)
            if (r6 != r1) goto L64
        L63:
            return r1
        L64:
            r6 = 0
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sjn.j(ardx, ffgu):java.lang.Object");
    }
}
