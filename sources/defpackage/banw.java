package defpackage;

import com.google.android.apps.messaging.shared.datamodel.action.ProcessPendingRevocationsAction;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class banw implements emwl {
    final /* synthetic */ ProcessPendingRevocationsAction a;

    public banw(ProcessPendingRevocationsAction processPendingRevocationsAction) {
        this.a = processPendingRevocationsAction;
    }

    @Override // defpackage.emwl
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        Boolean bool = (Boolean) obj;
        if (bool != null && bool.booleanValue()) {
            return null;
        }
        this.a.a.b();
        return null;
    }
}
