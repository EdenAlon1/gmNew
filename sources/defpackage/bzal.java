package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bzal implements aqko {
    final /* synthetic */ bzan a;

    public bzal(bzan bzanVar) {
        this.a = bzanVar;
    }

    @Override // defpackage.ctbf
    public final /* bridge */ /* synthetic */ elfl a(Object obj) {
        Optional optional = (Optional) obj;
        if (optional.isEmpty()) {
            this.a.e.C(bdgq.a);
        } else {
            bzan bzanVar = this.a;
            if (bzanVar.b != null && bzanVar.c != null) {
                bzanVar.e.C(((BugleConversationId) optional.get()).a);
            }
        }
        return elfo.e(null);
    }
}
