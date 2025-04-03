package defpackage;

import com.google.android.apps.messaging.shared.datamodel.action.EnsureConnectivityStabilizedAction;
import com.google.android.apps.messaging.shared.datamodel.action.common.ThrottledAction;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cymd implements csmx {
    final /* synthetic */ cymi a;

    public cymd(cymi cymiVar) {
        this.a = cymiVar;
    }

    @Override // defpackage.csmx
    public final void y() {
        this.a.a();
        badt badtVar = this.a.k;
        csjk csjkVar = (csjk) badtVar.a.b();
        csjkVar.getClass();
        akzt akztVar = (akzt) badtVar.b.b();
        akztVar.getClass();
        ThrottledAction ensureConnectivityStabilizedAction = new EnsureConnectivityStabilizedAction(csjkVar, akztVar);
        long j = ThrottledAction.r;
        ensureConnectivityStabilizedAction.H().d(ensureConnectivityStabilizedAction, 114, j, j, true);
    }
}
