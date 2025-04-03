package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class defj extends ffhv implements ffjm {
    int a;
    final /* synthetic */ defp b;
    final /* synthetic */ ConversationIdType c;
    final /* synthetic */ long d;
    final /* synthetic */ int e;
    private /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public defj(ffgu ffguVar, defp defpVar, ConversationIdType conversationIdType, long j, int i) {
        super(2, ffguVar);
        this.b = defpVar;
        this.c = conversationIdType;
        this.d = j;
        this.e = i;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((defj) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        defp defpVar = this.b;
        agkk i2 = defpVar.a().i(deff.b(this.c, this.d, this.e), (cqoh) defpVar.b.b());
        this.a = 1;
        Object c = defpVar.c(i2, this);
        return c == ffhhVar ? ffhhVar : c;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        defj defjVar = new defj(ffguVar, this.b, this.c, this.d, this.e);
        defjVar.f = obj;
        return defjVar;
    }
}
