package defpackage;

import com.google.android.apps.messaging.ui.debug.cloudstore.analysisui.CmsSyncAnalysisActivity;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class dbam extends cwps {
    private boolean n = false;

    public dbam() {
        y(new dbal(this));
    }

    @Override // defpackage.cwqf
    protected final void B() {
        if (this.n) {
            return;
        }
        this.n = true;
        CmsSyncAnalysisActivity cmsSyncAnalysisActivity = (CmsSyncAnalysisActivity) this;
        akgb akgbVar = (akgb) aX();
        cmsSyncAnalysisActivity.t = (cqoh) akgbVar.b.cz.b();
        cmsSyncAnalysisActivity.u = (cwqc) akgbVar.e.b();
        cmsSyncAnalysisActivity.v = akgbVar.g;
        cmsSyncAnalysisActivity.w = (bcqg) akgbVar.b.cZ.b();
        cmsSyncAnalysisActivity.x = (crjx) akgbVar.b.a.r.b();
        cmsSyncAnalysisActivity.y = akgbVar.h;
        cmsSyncAnalysisActivity.z = akgbVar.b.b.nH;
    }
}
