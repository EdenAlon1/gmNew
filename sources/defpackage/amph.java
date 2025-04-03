package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import j$.util.Collection;
import java.util.Set;

/* compiled from: PG */
@Deprecated
/* loaded from: classes6.dex */
final class amph implements aqge {
    private final aqge a;

    public amph(Set set, ConversationId conversationId) {
        if (set.size() != 1) {
            throw new UnsupportedOperationException("ConversationDisableModeObservableSupplier does not yet support multibindings with multiple (or zero) ConversationDisableModeObserverFactory's");
        }
        this.a = ((ampj) Collection.EL.stream(set).findFirst().get()).a(conversationId);
    }

    @Override // defpackage.aqge
    public final ctbx a(aqgd aqgdVar) {
        return this.a.a(aqgdVar);
    }

    @Override // defpackage.aqge
    public final elfl b() {
        return this.a.b();
    }

    @Override // defpackage.aqge
    public final /* bridge */ /* synthetic */ Object c() {
        return (ampg) this.a.c();
    }
}
