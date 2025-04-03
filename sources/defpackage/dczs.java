package defpackage;

import com.google.android.apps.messaging.ui.rcs.setup.manual.CountryCodePickerActivity;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class dczs extends cwqd {
    private boolean n = false;

    public dczs() {
        y(new dczr(this));
    }

    @Override // defpackage.cwqj, defpackage.cwqh, defpackage.cwqf
    protected final void B() {
        if (this.n) {
            return;
        }
        this.n = true;
        CountryCodePickerActivity countryCodePickerActivity = (CountryCodePickerActivity) this;
        akgb akgbVar = (akgb) aX();
        countryCodePickerActivity.t = (cqoh) akgbVar.b.cz.b();
        countryCodePickerActivity.u = (cwqc) akgbVar.e.b();
        countryCodePickerActivity.v = akgbVar.g;
        countryCodePickerActivity.w = (bcqg) akgbVar.b.cZ.b();
        countryCodePickerActivity.x = (crjx) akgbVar.b.a.r.b();
        countryCodePickerActivity.y = akgbVar.h;
        akis akisVar = akgbVar.b;
        countryCodePickerActivity.z = akisVar.b.nH;
        akkp akkpVar = akisVar.a;
        countryCodePickerActivity.A = akkpVar.DA;
        countryCodePickerActivity.B = akkpVar.ft;
        countryCodePickerActivity.C = akisVar.cT;
        countryCodePickerActivity.D = akgbVar.j;
        countryCodePickerActivity.E = (elbx) akisVar.aJ.b();
        countryCodePickerActivity.F = akgbVar.e;
        ((cwqd) countryCodePickerActivity).H = akgbVar.c.bn;
        countryCodePickerActivity.I = akgbVar.b.a.Sa;
        countryCodePickerActivity.J = (eg) akgbVar.f.b();
    }
}
