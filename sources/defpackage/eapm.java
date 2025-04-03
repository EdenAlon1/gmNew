package defpackage;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import java.net.URL;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class eapm implements eaov {
    public static final entd a = entd.c("GnpSdk");
    private static final eaix c = eaix.b("X-Goog-Api-Key");
    private static final eaix d = eaix.b("X-Android-Cert");
    private static final eaix e = eaix.b("X-Android-Package");
    private static final eaix f = eaix.b("Authorization");
    private static final eaix g = eaix.b("Cookie");
    public final ffhd b;
    private final eaiw h;
    private final eagn i;
    private final String j;
    private final eaku k;
    private final Context l;
    private final String m;
    private final ffsk n;

    static {
        eaix.b("X-Goog-Visitor-Id");
        eaix.b("X-Goog-Fitbit-Oauth-Token");
    }

    public eapm(eaiw eaiwVar, eagn eagnVar, String str, eaku eakuVar, Context context, String str2, ffhd ffhdVar, ffsk ffskVar) {
        eakuVar.getClass();
        context.getClass();
        ffhdVar.getClass();
        ffskVar.getClass();
        this.h = eaiwVar;
        this.i = eagnVar;
        this.j = str;
        this.k = eakuVar;
        this.l = context;
        this.m = str2;
        this.b = ffhdVar;
        this.n = ffskVar;
    }

    @Override // defpackage.eaov
    public final ListenableFuture a(easy easyVar, String str, exuu exuuVar) {
        ListenableFuture b;
        exuuVar.getClass();
        b = fgfz.b(this.n, ffhe.a, ffsm.a, new eapl(this, easyVar, str, exuuVar, null));
        return b;
    }

    @Override // defpackage.eaov
    public final Object b(List list, String str, exuk exukVar, ffgu ffguVar) {
        return ffra.a(this.b, new eapj(this, list, str, exukVar, null), ffguVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x00d5, code lost:
    
        if (r13 != r1) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x015d, code lost:
    
        if (r10 != r1) goto L49;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.exuj r9, java.lang.String r10, defpackage.eagt r11, boolean r12, defpackage.ffgu r13) {
        /*
            Method dump skipped, instructions count: 721
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eapm.c(exuj, java.lang.String, eagt, boolean, ffgu):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00f4 -> B:10:0x00f9). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(java.util.List r21, java.lang.String r22, defpackage.exuk r23, boolean r24, defpackage.ffgu r25) {
        /*
            Method dump skipped, instructions count: 365
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eapm.d(java.util.List, java.lang.String, exuk, boolean, ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.eaiy r5, defpackage.easy r6, java.lang.String r7, boolean r8, defpackage.ffgu r9) {
        /*
            Method dump skipped, instructions count: 281
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eapm.e(eaiy, easy, java.lang.String, boolean, ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(defpackage.easy r5, java.lang.String r6, java.net.URL r7, defpackage.eyhs r8, boolean r9, defpackage.ffgu r10) {
        /*
            r4 = this;
            boolean r0 = r10 instanceof defpackage.eape
            if (r0 == 0) goto L13
            r0 = r10
            eape r0 = (defpackage.eape) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            eape r0 = new eape
            r0.<init>(r4, r10)
        L18:
            r10 = r0
            java.lang.Object r0 = r10.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r10.c
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            eais r5 = r10.d
            defpackage.ffci.b(r0)
            goto L63
        L2a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L32:
            defpackage.ffci.b(r0)
            r0 = r8
            r8 = r6
            eais r6 = new eais
            r6.<init>()
            r6.e = r3
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            r6.c = r2
            r2 = 2
            r6.e = r2
            if (r7 == 0) goto L7c
            r6.a = r7
            java.lang.String r7 = "application/x-protobuf"
            r6.b = r7
            byte[] r7 = r0.toByteArray()
            r6.d = r7
            r10.d = r6
            r10.c = r3
            r7 = r5
            r5 = r4
            java.lang.Object r0 = r5.e(r6, r7, r8, r9, r10)
            if (r0 == r1) goto L7b
            r5 = r6
        L63:
            eafl r0 = (defpackage.eafl) r0
            boolean r6 = r0.e()
            if (r6 == 0) goto L71
            r0.getClass()
            eafh r0 = (defpackage.eafh) r0
            return r0
        L71:
            eafo r6 = new eafo
            eaja r5 = r5.a()
            r6.<init>(r5)
            return r6
        L7b:
            return r1
        L7c:
            java.lang.NullPointerException r5 = new java.lang.NullPointerException
            java.lang.String r6 = "Null url"
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eapm.f(easy, java.lang.String, java.net.URL, eyhs, boolean, ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(java.util.List r10, java.lang.String r11, defpackage.exuk r12, boolean r13, defpackage.ffgu r14) {
        /*
            r9 = this;
            boolean r0 = r14 instanceof defpackage.eapf
            if (r0 == 0) goto L13
            r0 = r14
            eapf r0 = (defpackage.eapf) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            eapf r0 = new eapf
            r0.<init>(r9, r14)
        L18:
            r6 = r0
            java.lang.Object r14 = r6.b
            ffhh r0 = defpackage.ffhh.a
            int r1 = r6.d
            r7 = 2
            r2 = 1
            if (r1 == 0) goto L3c
            if (r1 == r2) goto L33
            if (r1 != r7) goto L2b
            defpackage.ffci.b(r14)
            return r14
        L2b:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L33:
            boolean r13 = r6.a
            eapm r10 = r6.e
            defpackage.ffci.b(r14)
            r1 = r10
            goto L52
        L3c:
            defpackage.ffci.b(r14)
            r6.e = r9
            r6.a = r13
            r6.d = r2
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            java.lang.Object r14 = r1.d(r2, r3, r4, r5, r6)
            if (r14 == r0) goto L81
            r1 = r9
            r13 = r5
        L52:
            eafl r14 = (defpackage.eafl) r14
            boolean r10 = r14 instanceof defpackage.eafo
            java.lang.String r11 = "/v1/multiloginupdate"
            java.net.URL r4 = r1.k(r11)
            if (r10 == 0) goto L7b
            eafo r14 = (defpackage.eafo) r14
            java.lang.Object r10 = r14.a
            r5 = r10
            eyhs r5 = (defpackage.eyhs) r5
            r8 = r6
            exus r6 = defpackage.exus.a
            r6.getClass()
            r10 = 0
            r8.e = r10
            r8.d = r7
            r2 = 0
            r3 = 0
            r7 = r13
            java.lang.Object r10 = r1.h(r2, r3, r4, r5, r6, r7, r8)
            if (r10 != r0) goto L7a
            goto L81
        L7a:
            return r10
        L7b:
            r14.getClass()
            eafh r14 = (defpackage.eafh) r14
            return r14
        L81:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eapm.g(java.util.List, java.lang.String, exuk, boolean, ffgu):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0162 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(defpackage.easy r11, java.lang.String r12, java.net.URL r13, defpackage.eyhs r14, defpackage.eyhs r15, boolean r16, defpackage.ffgu r17) {
        /*
            Method dump skipped, instructions count: 396
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eapm.h(easy, java.lang.String, java.net.URL, eyhs, eyhs, boolean, ffgu):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0098 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(defpackage.easy r12, java.lang.String r13, java.net.URL r14, defpackage.eyhs r15, defpackage.eyhs r16, defpackage.ffgu r17) {
        /*
            r11 = this;
            r0 = r17
            boolean r1 = r0 instanceof defpackage.eaph
            if (r1 == 0) goto L15
            r1 = r0
            eaph r1 = (defpackage.eaph) r1
            int r2 = r1.d
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.d = r2
            goto L1a
        L15:
            eaph r1 = new eaph
            r1.<init>(r11, r0)
        L1a:
            r9 = r1
            java.lang.Object r0 = r9.b
            ffhh r1 = defpackage.ffhh.a
            int r2 = r9.d
            r10 = 2
            r3 = 1
            if (r2 == 0) goto L4d
            if (r2 == r3) goto L35
            if (r2 != r10) goto L2d
            defpackage.ffci.b(r0)
            return r0
        L2d:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L35:
            exuw r12 = r9.i
            exuu r13 = r9.h
            java.net.URL r2 = r9.g
            java.lang.String r3 = r9.f
            java.lang.Object r4 = r9.a
            eapm r5 = r9.e
            defpackage.ffci.b(r0)
            r6 = r5
            r5 = r2
            r2 = r6
            r6 = r4
            r4 = r3
            r3 = r6
            r7 = r12
            r6 = r13
            goto L7a
        L4d:
            defpackage.ffci.b(r0)
            r9.e = r11
            r9.a = r12
            r9.f = r13
            r9.g = r14
            r0 = r15
            exuu r0 = (defpackage.exuu) r0
            r9.h = r0
            r0 = r16
            exuw r0 = (defpackage.exuw) r0
            r9.i = r0
            r9.d = r3
            r8 = 0
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            r7 = r16
            java.lang.Object r0 = r2.h(r3, r4, r5, r6, r7, r8, r9)
            if (r0 == r1) goto L99
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            r7 = r16
        L7a:
            eafl r0 = (defpackage.eafl) r0
            boolean r12 = r0 instanceof defpackage.eaoq
            if (r12 == 0) goto L98
            r12 = 0
            r9.e = r12
            r9.a = r12
            r9.f = r12
            r9.g = r12
            r9.h = r12
            r9.i = r12
            r9.d = r10
            r8 = 1
            java.lang.Object r12 = r2.h(r3, r4, r5, r6, r7, r8, r9)
            if (r12 != r1) goto L97
            goto L99
        L97:
            return r12
        L98:
            return r0
        L99:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eapm.i(easy, java.lang.String, java.net.URL, eyhs, eyhs, ffgu):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(java.lang.String r5, defpackage.easy r6, boolean r7, defpackage.ffgu r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof defpackage.eapi
            if (r0 == 0) goto L13
            r0 = r8
            eapi r0 = (defpackage.eapi) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            eapi r0 = new eapi
            r0.<init>(r4, r8)
        L18:
            java.lang.Object r8 = r0.b
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            java.lang.Object r6 = r0.a
            defpackage.ffci.b(r8)
            goto L45
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            defpackage.ffci.b(r8)
            if (r7 == 0) goto L48
            eaku r7 = r4.k
            r0.a = r6
            r0.d = r3
            java.lang.String r8 = "oauth2:https://www.googleapis.com/auth/notifications"
            java.lang.Object r8 = r7.a(r5, r8, r0)
            if (r8 != r1) goto L45
            return r1
        L45:
            eafl r8 = (defpackage.eafl) r8
            goto L4e
        L48:
            eaku r7 = r4.k
            eafl r8 = r7.d(r5)
        L4e:
            boolean r5 = r8 instanceof defpackage.eakt
            if (r5 == 0) goto L5c
            eaon r5 = new eaon
            eakt r8 = (defpackage.eakt) r8
            java.io.IOException r7 = r8.a
            r5.<init>(r7, r6)
            return r5
        L5c:
            boolean r5 = r8 instanceof defpackage.eakr
            if (r5 == 0) goto L6a
            eaol r5 = new eaol
            eakr r8 = (defpackage.eakr) r8
            java.lang.Throwable r7 = r8.a
            r5.<init>(r7, r6)
            return r5
        L6a:
            boolean r5 = r8 instanceof defpackage.eaks
            if (r5 == 0) goto L78
            eaol r5 = new eaol
            eaks r8 = (defpackage.eaks) r8
            com.google.android.gms.auth.UserRecoverableAuthException r7 = r8.a
            r5.<init>(r7, r6)
            return r5
        L78:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eapm.j(java.lang.String, easy, boolean, ffgu):java.lang.Object");
    }

    public final URL k(String str) {
        return new URL(this.j.concat(str));
    }
}
