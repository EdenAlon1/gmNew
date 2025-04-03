package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cylt extends dtrs {
    final /* synthetic */ ConversationIdType a;
    final /* synthetic */ cylu b;

    public cylt(cylu cyluVar, ConversationIdType conversationIdType) {
        this.a = conversationIdType;
        this.b = cyluVar;
    }

    @Override // defpackage.dtrs
    public final /* bridge */ /* synthetic */ void gb(dtyq dtyqVar) {
        this.b.a.a(elfo.e(null), "UNVERIFIED_SMS_BANNER_STATE_KEY".concat(this.a.toString()));
    }
}
