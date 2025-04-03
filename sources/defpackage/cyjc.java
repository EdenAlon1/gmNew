package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cyjc extends dtrs {
    final /* synthetic */ ConversationIdType a;
    final /* synthetic */ cyjd b;

    public cyjc(cyjd cyjdVar, ConversationIdType conversationIdType) {
        this.a = conversationIdType;
        this.b = cyjdVar;
    }

    @Override // defpackage.dtrs
    public final /* bridge */ /* synthetic */ void gb(dtyq dtyqVar) {
        this.b.a.a(elfo.e(null), "SPAM_BANNER_STATE_KEY".concat(String.valueOf(String.valueOf(this.a))));
    }
}
