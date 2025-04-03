package defpackage;

import com.google.android.apps.messaging.ui.conversationlist.ShareIntentActivity;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class czyq extends cwps {
    private boolean n = false;

    public czyq() {
        y(new czyp(this));
    }

    @Override // defpackage.cwqf
    protected final void B() {
        if (this.n) {
            return;
        }
        this.n = true;
        ShareIntentActivity shareIntentActivity = (ShareIntentActivity) this;
        akgb akgbVar = (akgb) aX();
        shareIntentActivity.t = (cqoh) akgbVar.b.cz.b();
        shareIntentActivity.u = (cwqc) akgbVar.e.b();
        shareIntentActivity.v = akgbVar.g;
        shareIntentActivity.w = (bcqg) akgbVar.b.cZ.b();
        shareIntentActivity.x = (crjx) akgbVar.b.a.r.b();
        shareIntentActivity.y = akgbVar.h;
        shareIntentActivity.z = akgbVar.b.b.nH;
    }
}
