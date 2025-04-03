package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjvd implements aqjx {
    private final ffbr a;
    private final ffbr b;
    private final ResolvedRecipient c;
    private final cjwc d;
    private final aqkh e;
    private final cjvu f;
    private final aqkv g;

    public cjvd(ffbr ffbrVar, cjvl cjvlVar, ffbr ffbrVar2, ResolvedRecipient resolvedRecipient, cjwc cjwcVar) {
        this.a = ffbrVar;
        this.b = ffbrVar2;
        this.c = resolvedRecipient;
        this.d = cjwcVar;
        h(resolvedRecipient, cjwcVar);
        this.f = e(resolvedRecipient, cjwcVar);
        this.e = cjwcVar == null ? null : cjvlVar.a(cjwcVar);
        h(resolvedRecipient, null);
        e(resolvedRecipient, null);
        this.g = resolvedRecipient.F();
    }

    public static final boolean d(ResolvedRecipient resolvedRecipient) {
        String a = cjvc.a(resolvedRecipient.b());
        if (a.length() == 0) {
            return false;
        }
        String s = crjm.s(Uri.parse(a));
        return (resolvedRecipient.p() == cjwi.PROFILE_PEOPLE_SHARING_SOURCE || ffkj.e(s, "d") || ffkj.e(s, "l")) ? false : true;
    }

    private final cjvu e(ResolvedRecipient resolvedRecipient, cjwc cjwcVar) {
        if (resolvedRecipient.o() == cjwe.PREFER_CONTACT_PHOTO) {
            if (resolvedRecipient.d() != null) {
                return new cjvu(resolvedRecipient.d(), cjwi.PROFILE_CONTACT_SOURCE, false, 4);
            }
            if (d(resolvedRecipient)) {
                return new cjvu(Uri.parse(cjvc.a(resolvedRecipient.b())), resolvedRecipient.p(), false, 4);
            }
            if (cjwcVar != null) {
                cjvz cjvzVar = cjwcVar.d;
                if (cjvzVar == null) {
                    cjvzVar = cjvz.a;
                }
                String str = cjvzVar.c;
                str.getClass();
                if (str.length() > 0) {
                    cjvz cjvzVar2 = cjwcVar.d;
                    if (cjvzVar2 == null) {
                        cjvzVar2 = cjvz.a;
                    }
                    cjvzVar2.getClass();
                    return cjvs.b(cjvzVar2);
                }
            } else {
                cjwcVar = null;
            }
            if (cjwcVar != null) {
                cjvw cjvwVar = cjwcVar.c;
                if (cjvwVar == null) {
                    cjvwVar = cjvw.a;
                }
                String str2 = cjvwVar.e;
                str2.getClass();
                if (str2.length() > 0) {
                    crji crjiVar = (crji) this.a.b();
                    cjvw cjvwVar2 = cjwcVar.c;
                    if (cjvwVar2 == null) {
                        cjvwVar2 = cjvw.a;
                    }
                    return new cjvu(crjiVar.e(cjvwVar2.e, resolvedRecipient.g(), resolvedRecipient.J()), cjwi.PROFILE_UNSPECIFIED_SOURCE, false, 4);
                }
            }
            return new cjvu(null, cjwi.PROFILE_UNSPECIFIED_SOURCE, false, 4);
        }
        if (cjwcVar != null) {
            cjvz cjvzVar3 = cjwcVar.d;
            if (cjvzVar3 == null) {
                cjvzVar3 = cjvz.a;
            }
            String str3 = cjvzVar3.c;
            str3.getClass();
            if (str3.length() > 0) {
                cjvz cjvzVar4 = cjwcVar.d;
                if (cjvzVar4 == null) {
                    cjvzVar4 = cjvz.a;
                }
                cjvzVar4.getClass();
                return cjvs.b(cjvzVar4);
            }
        } else {
            cjwcVar = null;
        }
        if (resolvedRecipient.d() != null) {
            return new cjvu(resolvedRecipient.d(), cjwi.PROFILE_CONTACT_SOURCE, false, 4);
        }
        if (d(resolvedRecipient)) {
            return new cjvu(Uri.parse(cjvc.a(resolvedRecipient.b())), resolvedRecipient.p(), false, 4);
        }
        if (cjwcVar != null) {
            cjvw cjvwVar3 = cjwcVar.c;
            if (cjvwVar3 == null) {
                cjvwVar3 = cjvw.a;
            }
            String str4 = cjvwVar3.e;
            str4.getClass();
            if (str4.length() > 0) {
                crji crjiVar2 = (crji) this.a.b();
                cjvw cjvwVar4 = cjwcVar.c;
                if (cjvwVar4 == null) {
                    cjvwVar4 = cjvw.a;
                }
                return new cjvu(crjiVar2.e(cjvwVar4.e, resolvedRecipient.g(), resolvedRecipient.J()), cjwi.PROFILE_UNSPECIFIED_SOURCE, false, 4);
            }
        }
        return new cjvu(null, cjwi.PROFILE_UNSPECIFIED_SOURCE, false, 4);
    }

    private static final void h(ResolvedRecipient resolvedRecipient, cjwc cjwcVar) {
        String x = resolvedRecipient.x(true);
        if (x != null && x.length() != 0 && !ffkj.e(x, resolvedRecipient.g().o())) {
            new cjvt(null, null, resolvedRecipient.w(), cjwi.PROFILE_CONTACT_SOURCE, false, 19);
            return;
        }
        if (cjwcVar != null) {
            cjvw cjvwVar = cjwcVar.c;
            if (cjvwVar == null) {
                cjvwVar = cjvw.a;
            }
            if (cjvwVar != null) {
                cjvs.a(cjvwVar);
                return;
            }
        }
        new cjvt(null, null, null, cjwi.PROFILE_UNSPECIFIED_SOURCE, false, 23);
    }

    @Override // defpackage.aqjx
    public final aqkh a() {
        return this.e;
    }

    @Override // defpackage.aqjx
    public final ResolvedRecipient b() {
        return this.c;
    }

    @Override // defpackage.aqjx
    public final aqkv c() {
        return this.g;
    }

    @Override // defpackage.aqkj
    public final cjvt f() {
        throw null;
    }

    @Override // defpackage.aqkj
    public final cjvu g() {
        return this.f;
    }
}
