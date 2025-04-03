package defpackage;

import android.content.Context;
import android.net.Uri;
import android.provider.Telephony;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cutp implements cutd {
    public static final enru a = enru.c("com/google/android/apps/messaging/shared/util/spam/spatula/HaasProxyImpl");
    public final Context b;
    public final ffbr c;
    private final ffsk d;
    private final ffhd e;
    private final atwp f;
    private final ffbr g;
    private final String h;

    public cutp(Context context, ffsk ffskVar, ffhd ffhdVar, ffbr ffbrVar, atwp atwpVar, ffbr ffbrVar2) {
        context.getClass();
        ffskVar.getClass();
        ffhdVar.getClass();
        ffbrVar.getClass();
        atwpVar.getClass();
        ffbrVar2.getClass();
        this.b = context;
        this.d = ffskVar;
        this.e = ffhdVar;
        this.c = ffbrVar;
        this.f = atwpVar;
        this.g = ffbrVar2;
        this.h = "com.android.providers.telephony";
    }

    private final boolean g(dlka dlkaVar) {
        return dlkaVar != null && dlkaVar.a.a == 3;
    }

    @Override // defpackage.cutd
    public final Object a(Uri uri, ffgu ffguVar) {
        return ffra.a(ekxi.a(this.e), new cutf(null, this, uri), ffguVar);
    }

    @Override // defpackage.cutd
    public final Object b(ffgu ffguVar) {
        return ffra.a(ekxi.a(this.e), new cutk(null, this), ffguVar);
    }

    public final eepm c(Uri uri) {
        String uri2 = uri.toString();
        uri2.getClass();
        String uri3 = Telephony.Mms.CONTENT_URI.toString();
        uri3.getClass();
        boolean t = ffpc.t(uri2, uri3);
        if (!this.f.a()) {
            return eepm.a(t ? this.h : "com.google.android.apps.messaging");
        }
        if (t) {
            return eepm.a(this.h);
        }
        if (ffkj.e(uri.getScheme(), "content")) {
            return eepm.a("com.google.android.apps.messaging");
        }
        if (!ffkj.e(uri.getScheme(), "file")) {
            Objects.toString(uri);
            throw new UnsupportedOperationException("Unsupported URI format: ".concat(String.valueOf(uri)));
        }
        eepm eepmVar = eepm.c;
        eepmVar.getClass();
        return eepmVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(android.net.Uri r9, defpackage.ffgu r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof defpackage.cutg
            if (r0 == 0) goto L13
            r0 = r10
            cutg r0 = (defpackage.cutg) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            cutg r0 = new cutg
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.b
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.d
            r3 = 2
            r4 = 3
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L48
            if (r2 == r5) goto L40
            if (r2 == r3) goto L36
            if (r2 != r4) goto L2e
            defpackage.ffci.b(r10)
            return r10
        L2e:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L36:
            cutp r9 = r0.e
            java.lang.Object r2 = r0.a
            ffss r2 = (defpackage.ffss) r2
            defpackage.ffci.b(r10)
            goto Lab
        L40:
            java.lang.Object r9 = r0.a
            cutp r9 = (defpackage.cutp) r9
            defpackage.ffci.b(r10)
            goto L88
        L48:
            defpackage.ffci.b(r10)
            cfva r10 = defpackage.cubs.G
            java.lang.Object r10 = r10.e()
            java.lang.String r10 = (java.lang.String) r10
            r10.getClass()
            int r2 = r10.length()
            if (r2 != 0) goto L93
            enru r10 = defpackage.cutp.a
            ensk r10 = r10.e()
            ensn r2 = defpackage.ente.a
            java.lang.String r3 = "BugleSpam"
            r10.Y(r2, r3)
            java.lang.String r2 = "classifyImageCore"
            r3 = 91
            java.lang.String r4 = "com/google/android/apps/messaging/shared/util/spam/spatula/HaasProxyImpl"
            java.lang.String r6 = "HaasProxyImpl.kt"
            ensk r10 = r10.h(r4, r2, r3, r6)
            enrr r10 = (defpackage.enrr) r10
            java.lang.String r2 = "Skip test image check"
            r10.q(r2)
            r0.a = r8
            r0.d = r5
            java.lang.Object r10 = r8.e(r9, r0)
            if (r10 != r1) goto L87
            goto Lc6
        L87:
            r9 = r8
        L88:
            dlka r10 = (defpackage.dlka) r10
            boolean r9 = r9.g(r10)
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r9)
            return r9
        L93:
            ffsk r2 = r8.d
            cuth r7 = new cuth
            r7.<init>(r8, r9, r10, r6)
            ffss r2 = defpackage.ffqy.c(r2, r6, r7, r4)
            r0.a = r2
            r0.e = r8
            r0.d = r3
            java.lang.Object r10 = r8.e(r9, r0)
            if (r10 == r1) goto Lc6
            r9 = r8
        Lab:
            dlka r10 = (defpackage.dlka) r10
            boolean r9 = r9.g(r10)
            if (r9 != 0) goto Lc1
            r0.a = r6
            r0.e = r6
            r0.d = r4
            java.lang.Object r9 = r2.c(r0)
            if (r9 != r1) goto Lc0
            goto Lc6
        Lc0:
            return r9
        Lc1:
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r5)
            return r9
        Lc6:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cutp.d(android.net.Uri, ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(android.net.Uri r12, defpackage.ffgu r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof defpackage.cuti
            if (r0 == 0) goto L13
            r0 = r13
            cuti r0 = (defpackage.cuti) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cuti r0 = new cuti
            r0.<init>(r11, r13)
        L18:
            java.lang.Object r13 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 0
            r4 = 1
            java.lang.String r5 = "classifyImageWithSafetyCore"
            java.lang.String r6 = "com/google/android/apps/messaging/shared/util/spam/spatula/HaasProxyImpl"
            java.lang.String r7 = "HaasProxyImpl.kt"
            java.lang.String r8 = "BugleSpam"
            if (r2 == 0) goto L3c
            if (r2 != r4) goto L34
            cutp r12 = r0.d
            defpackage.ffci.b(r13)     // Catch: java.lang.Exception -> L32
            return r13
        L32:
            r13 = move-exception
            goto L8f
        L34:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L3c:
            defpackage.ffci.b(r13)
            enru r13 = defpackage.cutp.a
            ensk r13 = r13.h()
            ensn r2 = defpackage.ente.a
            r13.Y(r2, r8)
            r2 = 149(0x95, float:2.09E-43)
            ensk r13 = r13.h(r6, r5, r2, r7)
            enrr r13 = (defpackage.enrr) r13
            java.lang.String r2 = "Calling SafetyCore"
            r13.q(r2)
            ffbr r13 = r11.g
            java.lang.Object r13 = r13.b()
            akzt r13 = (defpackage.akzt) r13
            java.lang.String r2 = "Bugle.Spatula.Classification.Trigger.Counts"
            r13.c(r2)
            long r9 = defpackage.ffpw.a     // Catch: java.lang.Exception -> L8c
            cfva r13 = defpackage.cubs.E     // Catch: java.lang.Exception -> L8c
            java.lang.Object r13 = r13.e()     // Catch: java.lang.Exception -> L8c
            r13.getClass()     // Catch: java.lang.Exception -> L8c
            java.lang.Number r13 = (java.lang.Number) r13     // Catch: java.lang.Exception -> L8c
            long r9 = r13.longValue()     // Catch: java.lang.Exception -> L8c
            ffpz r13 = defpackage.ffpz.d     // Catch: java.lang.Exception -> L8c
            long r9 = defpackage.ffpy.e(r9, r13)     // Catch: java.lang.Exception -> L8c
            cutj r13 = new cutj     // Catch: java.lang.Exception -> L8c
            r13.<init>(r11, r12, r3)     // Catch: java.lang.Exception -> L8c
            r0.d = r11     // Catch: java.lang.Exception -> L8c
            r0.c = r4     // Catch: java.lang.Exception -> L8c
            java.lang.Object r12 = defpackage.ffvm.b(r9, r13, r0)     // Catch: java.lang.Exception -> L8c
            if (r12 != r1) goto L8b
            return r1
        L8b:
            return r12
        L8c:
            r12 = move-exception
            r13 = r12
            r12 = r11
        L8f:
            ffbr r12 = r12.g
            java.lang.Object r12 = r12.b()
            akzt r12 = (defpackage.akzt) r12
            java.lang.String r0 = "Bugle.Spatula.Classification.Failure.Counts"
            r12.c(r0)
            emyl r12 = defpackage.cubs.H
            java.lang.Object r12 = r12.get()
            cfup r12 = (defpackage.cfup) r12
            java.lang.Object r12 = r12.e()
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            java.lang.String r0 = "Call failed."
            if (r12 == 0) goto Lcf
            enru r12 = defpackage.cutp.a
            ensk r12 = r12.j()
            ensn r1 = defpackage.ente.a
            r12.Y(r1, r8)
            enrr r12 = (defpackage.enrr) r12
            ensk r12 = r12.g(r13)
            r13 = 162(0xa2, float:2.27E-43)
            ensk r12 = r12.h(r6, r5, r13, r7)
            enrr r12 = (defpackage.enrr) r12
            r12.q(r0)
            goto Le5
        Lcf:
            enru r12 = defpackage.cutp.a
            ensk r12 = r12.j()
            ensn r13 = defpackage.ente.a
            r12.Y(r13, r8)
            r13 = 164(0xa4, float:2.3E-43)
            ensk r12 = r12.h(r6, r5, r13, r7)
            enrr r12 = (defpackage.enrr) r12
            r12.q(r0)
        Le5:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cutp.e(android.net.Uri, ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(android.net.Uri r11, java.lang.String r12, defpackage.ffgu r13) {
        /*
            r10 = this;
            boolean r0 = r13 instanceof defpackage.cutn
            if (r0 == 0) goto L13
            r0 = r13
            cutn r0 = (defpackage.cutn) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cutn r0 = new cutn
            r0.<init>(r10, r13)
        L18:
            java.lang.Object r13 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            java.lang.String r3 = "isTestImage"
            java.lang.String r4 = "com/google/android/apps/messaging/shared/util/spam/spatula/HaasProxyImpl"
            java.lang.String r5 = "HaasProxyImpl.kt"
            java.lang.String r6 = "BugleSpam"
            r7 = 0
            r8 = 1
            if (r2 == 0) goto L3a
            if (r2 != r8) goto L32
            defpackage.ffci.b(r13)     // Catch: java.lang.Exception -> L30
            return r13
        L30:
            r11 = move-exception
            goto L78
        L32:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L3a:
            defpackage.ffci.b(r13)
            android.content.Context r13 = r10.b
            boolean r13 = defpackage.cbgi.k(r11, r13)
            if (r13 == 0) goto L4a
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r7)
            return r11
        L4a:
            enru r13 = defpackage.cutp.a     // Catch: java.lang.Exception -> L30
            ensk r13 = r13.h()     // Catch: java.lang.Exception -> L30
            ensn r2 = defpackage.ente.a     // Catch: java.lang.Exception -> L30
            r13.Y(r2, r6)     // Catch: java.lang.Exception -> L30
            r2 = 108(0x6c, float:1.51E-43)
            ensk r13 = r13.h(r4, r3, r2, r5)     // Catch: java.lang.Exception -> L30
            enrr r13 = (defpackage.enrr) r13     // Catch: java.lang.Exception -> L30
            java.lang.String r2 = "checking against test image"
            r13.q(r2)     // Catch: java.lang.Exception -> L30
            ffhd r13 = r10.e     // Catch: java.lang.Exception -> L30
            ffhd r13 = defpackage.ekxi.a(r13)     // Catch: java.lang.Exception -> L30
            cutm r2 = new cutm     // Catch: java.lang.Exception -> L30
            r9 = 0
            r2.<init>(r9, r10, r11, r12)     // Catch: java.lang.Exception -> L30
            r0.c = r8     // Catch: java.lang.Exception -> L30
            java.lang.Object r11 = defpackage.ffra.a(r13, r2, r0)     // Catch: java.lang.Exception -> L30
            if (r11 != r1) goto L77
            return r1
        L77:
            return r11
        L78:
            enru r12 = defpackage.cutp.a
            ensk r12 = r12.j()
            ensn r13 = defpackage.ente.a
            r12.Y(r13, r6)
            enrr r12 = (defpackage.enrr) r12
            ensk r11 = r12.g(r11)
            enrr r11 = (defpackage.enrr) r11
            ensy r12 = defpackage.ensy.FULL
            r11.aa(r12)
            r12 = 120(0x78, float:1.68E-43)
            ensk r11 = r11.h(r4, r3, r12, r5)
            enrr r11 = (defpackage.enrr) r11
            java.lang.String r12 = "check against test image failed."
            r11.q(r12)
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r7)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cutp.f(android.net.Uri, java.lang.String, ffgu):java.lang.Object");
    }
}
