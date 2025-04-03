package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cyci extends dtrs {
    final /* synthetic */ ConversationIdType a;
    final /* synthetic */ cycj b;

    public cyci(cycj cycjVar, ConversationIdType conversationIdType) {
        this.a = conversationIdType;
        this.b = cycjVar;
    }

    @Override // defpackage.dtrs
    public final /* bridge */ /* synthetic */ void gb(dtyq dtyqVar) {
        this.b.b.a(elfo.e(null), "ADD_CONTACT_BANNER_STATE_KEY".concat(this.a.toString()));
    }
}
