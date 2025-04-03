package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class defm extends ffhv implements ffjm {
    int a;
    final /* synthetic */ defp b;
    final /* synthetic */ ConversationIdType c;
    final /* synthetic */ long d;
    final /* synthetic */ int e;
    private /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public defm(ffgu ffguVar, defp defpVar, ConversationIdType conversationIdType, long j, int i) {
        super(2, ffguVar);
        this.b = defpVar;
        this.c = conversationIdType;
        this.d = j;
        this.e = i;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((defm) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
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
        agkk j = defpVar.a().j(deff.b(this.c, this.d, this.e), (cqoh) defpVar.b.b());
        this.a = 1;
        Object c = defpVar.c(j, this);
        return c == ffhhVar ? ffhhVar : c;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        defm defmVar = new defm(ffguVar, this.b, this.c, this.d, this.e);
        defmVar.f = obj;
        return defmVar;
    }
}
