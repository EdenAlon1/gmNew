package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dkuo implements eeht {
    private final Set a;

    public dkuo(Set set) {
        this.a = set;
    }

    @Override // defpackage.eeht
    public final void a(eenj eenjVar) {
        String b = emxe.b(eenjVar.a.i());
        boolean s = eenjVar.a.s();
        if (this.a.contains(b) && s) {
            eenjVar.t("Session-Expires");
            eenjVar.t("Min-SE");
        }
    }
}
