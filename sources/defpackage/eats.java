package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class eats implements eatl {
    private final ennd a;
    private final Map b = null;

    public eats(ennd enndVar) {
        this.a = enndVar;
    }

    @Override // defpackage.eatl
    public final /* synthetic */ Map a() {
        return eatk.a(this);
    }

    @Override // defpackage.eatl
    public final void b(enhd enhdVar) {
        ennd enndVar = this.a;
        if (enndVar.A()) {
            return;
        }
        for (Object obj : enndVar.x()) {
            obj.getClass();
            String str = (String) obj;
            enhdVar.k(new eatf(str), new easw(ffdx.ar(((encs) this.a).c(str))));
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eats)) {
            return false;
        }
        eats eatsVar = (eats) obj;
        if (!ffkj.e(this.a, eatsVar.a)) {
            return false;
        }
        Map map = eatsVar.b;
        return ffkj.e(null, null);
    }

    public final int hashCode() {
        return this.a.hashCode() * 31;
    }

    public final String toString() {
        return "GnpSignedInRegistrationData(gaiaAccounts=" + this.a + ", delegatedGaiaAccounts=null)";
    }
}
