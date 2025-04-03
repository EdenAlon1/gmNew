package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class defn extends ffhv implements ffjm {
    int a;
    final /* synthetic */ defp b;
    final /* synthetic */ List c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public defn(ffgu ffguVar, defp defpVar, List list) {
        super(2, ffguVar);
        this.b = defpVar;
        this.c = list;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((defn) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        ensz enszVar = (ensz) defp.a.h();
        enszVar.Y(csux.O, "ConversationsPageDataBuilder");
        enszVar.q("Loading conversations and their messages.");
        defp defpVar = this.b;
        agkk g = defpVar.a().g(deff.a(20), (cqoh) defpVar.b.b());
        List list = this.c;
        this.a = 1;
        Object a = ffra.a(ekxi.a(defpVar.c), new defi(null, g, defpVar, list), this);
        return a == ffhhVar ? ffhhVar : a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        defn defnVar = new defn(ffguVar, this.b, this.c);
        defnVar.d = obj;
        return defnVar;
    }
}
