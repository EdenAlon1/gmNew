package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class bvhv extends dtrr {
    public ConversationIdType a;

    public bvhv() {
        super(bvin.b());
        this.a = bdgq.a;
    }

    public final bvht a() {
        bvhu bvhuVar = new bvhu();
        bvhuVar.aC(aB());
        bvhuVar.a = this.a;
        bvhuVar.cK = aC();
        return bvhuVar;
    }

    public final void b(ConversationIdType conversationIdType) {
        aE(0);
        this.a = conversationIdType;
    }
}
