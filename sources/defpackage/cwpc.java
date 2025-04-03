package defpackage;

import com.google.android.apps.messaging.ui.PermissionCheckActivity;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class cwpc extends cwps {
    private boolean n = false;

    public cwpc() {
        y(new cwpb(this));
    }

    @Override // defpackage.cwqf
    protected final void B() {
        if (this.n) {
            return;
        }
        this.n = true;
        PermissionCheckActivity permissionCheckActivity = (PermissionCheckActivity) this;
        akgb akgbVar = (akgb) aX();
        permissionCheckActivity.t = (cqoh) akgbVar.b.cz.b();
        permissionCheckActivity.u = (cwqc) akgbVar.e.b();
        permissionCheckActivity.v = akgbVar.g;
        permissionCheckActivity.w = (bcqg) akgbVar.b.cZ.b();
        permissionCheckActivity.x = (crjx) akgbVar.b.a.r.b();
        permissionCheckActivity.y = akgbVar.h;
        permissionCheckActivity.z = akgbVar.b.b.nH;
    }
}
