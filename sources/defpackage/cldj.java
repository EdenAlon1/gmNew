package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cldj extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cldk b;
    final /* synthetic */ ConversationIdType c;
    final /* synthetic */ awui d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cldj(cldk cldkVar, ConversationIdType conversationIdType, awui awuiVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = cldkVar;
        this.c = conversationIdType;
        this.d = awuiVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cldj) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        cldk cldkVar = this.b;
        ConversationIdType conversationIdType = this.c;
        awui awuiVar = this.d;
        this.a = 1;
        Object b = cldkVar.b(conversationIdType, awuiVar, this);
        return b == ffhhVar ? ffhhVar : b;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cldj(this.b, this.c, this.d, ffguVar);
    }
}
