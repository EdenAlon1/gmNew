package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cutc implements cukg, cukq {
    public static final cfva a;
    public static final cfup b;
    public static final cfup c;
    public static final emyl d;
    private static final enru g = enru.c("com/google/android/apps/messaging/shared/util/spam/safeurl/SafeUrlSpamProtection");
    public final ffbr e;
    public final ffbr f;
    private final ffbr h;
    private final ffbr i;
    private final ffbr j;
    private final ffhd k;

    static {
        ecwh ecwhVar = cfvl.b;
        ezgt ezgtVar = (ezgt) ezgu.a.createBuilder();
        ezgtVar.a(30);
        ezgtVar.a(30);
        ezgtVar.a(30);
        a = cfvl.u(ecwhVar, "safe_url_recheck_delay_array_seconds", ezgtVar.build(), new ecwg() { // from class: cuss
            @Override // defpackage.ecwg
            public final Object a(byte[] bArr) {
                return (ezgu) eyfy.parseFrom(ezgu.a, bArr);
            }
        });
        b = cfvl.n(cfvl.b, "enable_safe_url_on_click_prevent_redundant_check", true);
        c = cfvl.n(cfvl.b, "enable_safe_url_reclassify_after_verdict", false);
        d = cfvl.w("safe_url_optimize_reclassification");
    }

    public cutc(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, ffbr ffbrVar6, ffhd ffhdVar) {
        ffbrVar.getClass();
        ffbrVar2.getClass();
        ffbrVar3.getClass();
        ffbrVar4.getClass();
        ffbrVar5.getClass();
        ffbrVar6.getClass();
        ffhdVar.getClass();
        this.e = ffbrVar;
        this.f = ffbrVar2;
        this.h = ffbrVar3;
        this.i = ffbrVar4;
        this.j = ffbrVar5;
        this.k = ffhdVar;
    }

    @Override // defpackage.cukg
    public final cukx a() {
        return cukx.g;
    }

    @Override // defpackage.cukg
    public final ekzz b() {
        return eleg.f("SafeUrlSpamProtection.classify");
    }

    @Override // defpackage.cukg
    public final ekzz c() {
        return eleg.f("SafeUrlSpamProtection.reclassify");
    }

    @Override // defpackage.cukg
    public final Object d(cujo cujoVar, ffgu ffguVar) {
        return ffra.a(ekxi.a(this.k), new cusv(null, this, cujoVar), ffguVar);
    }

    @Override // defpackage.cukg
    public final Object e(cujo cujoVar, int i, ffgu ffguVar) {
        return ffra.a(ekxi.a(this.k), new cusy(null, this, cujoVar, i), ffguVar);
    }

    @Override // defpackage.cukg
    public final /* synthetic */ boolean f() {
        return false;
    }

    @Override // defpackage.cukq
    public final ekzz g() {
        return eleg.f("SafeUrlSpamProtection.classifyOnClickTrace");
    }

    @Override // defpackage.cukq
    public final Object h(cujo cujoVar, String str, ffgu ffguVar) {
        if (str.length() > 0) {
            return ffra.a(ekxi.a(this.k), new cusw(null, this, cujoVar, str), ffguVar);
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ef A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(defpackage.cujo r8, java.util.List r9, defpackage.ffgu r10) {
        /*
            Method dump skipped, instructions count: 325
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cutc.i(cujo, java.util.List, ffgu):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x010f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(defpackage.cujo r15, java.util.List r16, defpackage.erdy r17, java.lang.Integer r18, defpackage.ffgu r19) {
        /*
            Method dump skipped, instructions count: 352
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cutc.j(cujo, java.util.List, erdy, java.lang.Integer, ffgu):java.lang.Object");
    }

    public final boolean k() {
        if (((ahor) this.j.b()).c()) {
            return true;
        }
        ensk e = g.e();
        e.Y(ente.a, "BugleSpam");
        ((enrr) e.h("com/google/android/apps/messaging/shared/util/spam/safeurl/SafeUrlSpamProtection", "allowedToCheckUrls", 288, "SafeUrlSpamProtection.kt")).q("Link preview disabled, skipping URL check");
        return false;
    }

    public final Object l(cujo cujoVar) {
        if (k()) {
            String str = cujoVar.i;
            if (str != null && str.length() != 0) {
                List c2 = cglt.c(str);
                if (c2 != null && !c2.isEmpty()) {
                    return c2;
                }
                ensk e = g.e();
                e.Y(ente.a, "BugleSpam");
                ((enrr) e.h("com/google/android/apps/messaging/shared/util/spam/safeurl/SafeUrlSpamProtection", "getUrlsFromMessage", 304, "SafeUrlSpamProtection.kt")).q("No urls found, skipping bad urls check.");
                return null;
            }
            ensk e2 = g.e();
            e2.Y(ente.a, "BugleSpam");
            ((enrr) e2.h("com/google/android/apps/messaging/shared/util/spam/safeurl/SafeUrlSpamProtection", "getUrlsFromMessage", 298, "SafeUrlSpamProtection.kt")).q("No text in the message, skipping URL check.");
        }
        return null;
    }
}
