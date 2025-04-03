package defpackage;

import com.google.android.apps.messaging.ui.debug.database.DatabaseActivity;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class dblo extends cwps {
    private boolean n = false;

    public dblo() {
        y(new dbln(this));
    }

    @Override // defpackage.cwqf
    protected final void B() {
        if (this.n) {
            return;
        }
        this.n = true;
        DatabaseActivity databaseActivity = (DatabaseActivity) this;
        akgb akgbVar = (akgb) aX();
        databaseActivity.t = (cqoh) akgbVar.b.cz.b();
        databaseActivity.u = (cwqc) akgbVar.e.b();
        databaseActivity.v = akgbVar.g;
        databaseActivity.w = (bcqg) akgbVar.b.cZ.b();
        databaseActivity.x = (crjx) akgbVar.b.a.r.b();
        databaseActivity.y = akgbVar.h;
        databaseActivity.z = akgbVar.b.b.nH;
    }
}
