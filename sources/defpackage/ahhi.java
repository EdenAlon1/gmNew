package defpackage;

import com.google.android.apps.messaging.label.settings.SuperSortSettingsActivity;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class ahhi extends aktz {
    private boolean K = false;

    public ahhi() {
        y(new ahhh(this));
    }

    @Override // defpackage.akug, defpackage.cwqj, defpackage.cwqh, defpackage.cwqf
    protected final void B() {
        if (this.K) {
            return;
        }
        this.K = true;
        SuperSortSettingsActivity superSortSettingsActivity = (SuperSortSettingsActivity) this;
        akgb akgbVar = (akgb) aX();
        superSortSettingsActivity.t = (cqoh) akgbVar.b.cz.b();
        superSortSettingsActivity.u = (cwqc) akgbVar.e.b();
        superSortSettingsActivity.v = akgbVar.g;
        superSortSettingsActivity.w = (bcqg) akgbVar.b.cZ.b();
        superSortSettingsActivity.x = (crjx) akgbVar.b.a.r.b();
        superSortSettingsActivity.y = akgbVar.h;
        akis akisVar = akgbVar.b;
        superSortSettingsActivity.z = akisVar.b.nH;
        akkp akkpVar = akisVar.a;
        superSortSettingsActivity.A = akkpVar.DA;
        superSortSettingsActivity.B = akkpVar.ft;
        superSortSettingsActivity.C = akisVar.cT;
        superSortSettingsActivity.D = akgbVar.j;
        superSortSettingsActivity.E = (elbx) akisVar.aJ.b();
        superSortSettingsActivity.F = akgbVar.e;
        ((cwqd) superSortSettingsActivity).H = akgbVar.c.bn;
        superSortSettingsActivity.I = akgbVar.b.a.Sa;
        superSortSettingsActivity.J = (eg) akgbVar.f.b();
        ((aktz) superSortSettingsActivity).n = akgbVar.b.a.RR;
    }
}
