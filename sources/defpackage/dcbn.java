package defpackage;

import com.google.android.apps.messaging.ui.mediapicker.c2o.customization.CategoryCustomizationActivity;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class dcbn extends dbxx {
    private boolean K = false;

    public dcbn() {
        y(new dcbm(this));
    }

    @Override // defpackage.dbya, defpackage.cwqh, defpackage.cwqf
    protected final void B() {
        if (this.K) {
            return;
        }
        this.K = true;
        CategoryCustomizationActivity categoryCustomizationActivity = (CategoryCustomizationActivity) this;
        akgb akgbVar = (akgb) aX();
        categoryCustomizationActivity.t = (cqoh) akgbVar.b.cz.b();
        categoryCustomizationActivity.u = (cwqc) akgbVar.e.b();
        categoryCustomizationActivity.v = akgbVar.g;
        categoryCustomizationActivity.w = (bcqg) akgbVar.b.cZ.b();
        categoryCustomizationActivity.x = (crjx) akgbVar.b.a.r.b();
        categoryCustomizationActivity.y = akgbVar.h;
        akis akisVar = akgbVar.b;
        categoryCustomizationActivity.z = akisVar.b.nH;
        akkp akkpVar = akisVar.a;
        categoryCustomizationActivity.A = akkpVar.DA;
        categoryCustomizationActivity.B = akkpVar.ft;
        categoryCustomizationActivity.C = akisVar.cT;
        categoryCustomizationActivity.D = akgbVar.j;
        categoryCustomizationActivity.E = (elbx) akisVar.aJ.b();
        categoryCustomizationActivity.F = akgbVar.e;
        categoryCustomizationActivity.I = (alct) akgbVar.bk.b();
        categoryCustomizationActivity.J = (cqoh) akgbVar.b.cz.b();
    }
}
