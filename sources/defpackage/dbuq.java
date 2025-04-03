package defpackage;

import android.content.Intent;
import com.google.android.gms.auth.UserRecoverableAuthException;

/* compiled from: PG */
/* loaded from: classes3.dex */
class dbuq implements ejwd<cgdh> {
    final /* synthetic */ dbuw a;

    public dbuq(dbuw dbuwVar) {
        this.a = dbuwVar;
    }

    @Override // defpackage.ejwd
    public final void a(Throwable th) {
        ensk j = dbuw.a.j();
        j.Y(ente.a, "BugleGDitto");
        ((enrr) ((enrr) ((enrr) j).g(th)).h("com/google/android/apps/messaging/ui/gaia/GaiaPairingSettingsFragmentPeer$1", "onError", (char) 213, "GaiaPairingSettingsFragmentPeer.java")).q("Failed to get Gaia auth check result");
    }

    @Override // defpackage.ejwd
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        cgdh cgdhVar = (cgdh) obj;
        if (cgdhVar instanceof cgdg) {
            cgdg cgdgVar = (cgdg) cgdhVar;
            if (this.a.b.equals(cgdgVar.a)) {
                dbuw dbuwVar = this.a;
                UserRecoverableAuthException userRecoverableAuthException = new UserRecoverableAuthException("Recoverable auth error when loading device pairing page", cgdgVar.b);
                dbud dbudVar = dbuwVar.c;
                dbudVar.getClass();
                ea h = dbudVar.I().h("GaiaAuthFailureDialogFragment");
                if (h != null) {
                    cg cgVar = new cg(dbudVar.I());
                    cgVar.q(h);
                    cgVar.c();
                } else {
                    int i = cgdt.g;
                    Intent a = userRecoverableAuthException.a();
                    a.getClass();
                    cgds.a(a, 4).t(dbudVar.I(), "GaiaAuthFailureDialogFragment");
                }
            }
        }
    }

    @Override // defpackage.ejwd
    public final /* synthetic */ void hB() {
    }
}
