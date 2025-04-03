package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ctka extends ffhv implements ffjm {
    int a;
    final /* synthetic */ ctko b;
    final /* synthetic */ ConversationIdType c;
    final /* synthetic */ long d;
    final /* synthetic */ eooi e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ctka(ctko ctkoVar, ConversationIdType conversationIdType, long j, eooi eooiVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = ctkoVar;
        this.c = conversationIdType;
        this.d = j;
        this.e = eooiVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ctka) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        Object obj2 = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return null;
        }
        ctko ctkoVar = this.b;
        ConversationIdType conversationIdType = this.c;
        long j = this.d;
        eooi eooiVar = this.e;
        this.a = 1;
        Object a = ffra.a(ekxi.a(ctkoVar.c), new ctjw(null, ctkoVar, conversationIdType, j, eooiVar), this);
        if (a != ffhh.a) {
            a = ffcu.a;
        }
        if (a == obj2) {
            return obj2;
        }
        return null;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new ctka(this.b, this.c, this.d, this.e, ffguVar);
    }
}
