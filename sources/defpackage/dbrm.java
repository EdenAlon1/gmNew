package defpackage;

import com.google.android.apps.messaging.ui.ditto.DittoActivity;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class dbrm extends cwqd {
    private boolean n = false;

    public dbrm() {
        y(new dbrl(this));
    }

    @Override // defpackage.cwqj, defpackage.cwqh, defpackage.cwqf
    protected final void B() {
        if (this.n) {
            return;
        }
        this.n = true;
        DittoActivity dittoActivity = (DittoActivity) this;
        akgb akgbVar = (akgb) aX();
        dittoActivity.t = (cqoh) akgbVar.b.cz.b();
        dittoActivity.u = (cwqc) akgbVar.e.b();
        dittoActivity.v = akgbVar.g;
        dittoActivity.w = (bcqg) akgbVar.b.cZ.b();
        dittoActivity.x = (crjx) akgbVar.b.a.r.b();
        dittoActivity.y = akgbVar.h;
        akis akisVar = akgbVar.b;
        dittoActivity.z = akisVar.b.nH;
        akkp akkpVar = akisVar.a;
        dittoActivity.A = akkpVar.DA;
        dittoActivity.B = akkpVar.ft;
        dittoActivity.C = akisVar.cT;
        dittoActivity.D = akgbVar.j;
        dittoActivity.E = (elbx) akisVar.aJ.b();
        dittoActivity.F = akgbVar.e;
        ((cwqd) dittoActivity).H = akgbVar.c.bn;
        dittoActivity.I = akgbVar.b.a.Sa;
        dittoActivity.J = (eg) akgbVar.f.b();
    }
}
