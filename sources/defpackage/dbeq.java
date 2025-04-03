package defpackage;

import com.google.android.apps.messaging.ui.debug.cloudstore.keyretrievalclient.KeyRetrievalClientActivity;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class dbeq extends cwps {
    private boolean n = false;

    public dbeq() {
        y(new dbep(this));
    }

    @Override // defpackage.cwqf
    protected final void B() {
        if (this.n) {
            return;
        }
        this.n = true;
        KeyRetrievalClientActivity keyRetrievalClientActivity = (KeyRetrievalClientActivity) this;
        akgb akgbVar = (akgb) aX();
        keyRetrievalClientActivity.t = (cqoh) akgbVar.b.cz.b();
        keyRetrievalClientActivity.u = (cwqc) akgbVar.e.b();
        keyRetrievalClientActivity.v = akgbVar.g;
        keyRetrievalClientActivity.w = (bcqg) akgbVar.b.cZ.b();
        keyRetrievalClientActivity.x = (crjx) akgbVar.b.a.r.b();
        keyRetrievalClientActivity.y = akgbVar.h;
        keyRetrievalClientActivity.z = akgbVar.b.b.nH;
    }
}
