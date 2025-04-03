package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bzcc implements aqko {
    final /* synthetic */ bzce a;

    public bzcc(bzce bzceVar) {
        this.a = bzceVar;
    }

    @Override // defpackage.ctbf
    public final /* bridge */ /* synthetic */ elfl a(Object obj) {
        Optional optional = (Optional) obj;
        if (optional.isEmpty()) {
            ((cgzv) this.a.e.b()).C(bdgq.a);
        } else {
            bzce bzceVar = this.a;
            if (bzceVar.b != null && bzceVar.c != null) {
                ((cgzv) bzceVar.e.b()).C(((BugleConversationId) optional.get()).a);
            }
        }
        return elfo.e(null);
    }
}
