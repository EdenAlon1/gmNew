package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class amqv extends ffhv implements ffjm {
    final /* synthetic */ amqw a;
    final /* synthetic */ ConversationIdType b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public amqv(amqw amqwVar, ConversationIdType conversationIdType, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = amqwVar;
        this.b = conversationIdType;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((amqv) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        String[] strArr = bsom.a;
        bsoe bsoeVar = new bsoe();
        bsoeVar.z("android.resource://" + this.a.a.getPackageName() + "/2131231285");
        bsoeVar.f(this.b);
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new amqv(this.a, this.b, ffguVar);
    }
}
