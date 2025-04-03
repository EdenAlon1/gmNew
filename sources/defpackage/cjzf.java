package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjzf {
    private final ffbr a;

    public cjzf(ffbr ffbrVar) {
        ffbrVar.getClass();
        this.a = ffbrVar;
    }

    public static final void b(bvpo bvpoVar, String str, String str2) {
        bvpoVar.getClass();
        if ((str == null || str.length() == 0) && (str2 == null || str2.length() == 0)) {
            bvpoVar.G(cjwi.PROFILE_UNSPECIFIED_SOURCE);
            bvpoVar.u(null);
            bvpoVar.t(null);
        } else {
            bvpoVar.G(cjwi.PROFILE_CONTACT_SOURCE);
            bvpoVar.u(str);
            bvpoVar.t(str2);
        }
    }

    public final void a(bvpo bvpoVar, String str) {
        bvpoVar.getClass();
        if (str == null || str.length() == 0) {
            bvpoVar.n(null);
        } else {
            bvpoVar.n(Uri.parse(str));
        }
        cjwi cjwiVar = bvpoVar.Q;
        cjwi cjwiVar2 = cjwi.PROFILE_PEOPLE_SHARING_SOURCE;
        if (cjwiVar == cjwiVar2) {
            return;
        }
        if (cjwiVar == cjwiVar2) {
        }
        if (str == null || str.length() == 0) {
            bvpoVar.K(cjwi.PROFILE_UNSPECIFIED_SOURCE);
            bvpoVar.N(null);
        } else {
            bvpoVar.K(cjwi.PROFILE_CONTACT_SOURCE);
            bvpoVar.N(Uri.parse(str));
        }
    }
}
