package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dqko extends ffhv implements ffjm {
    int a;
    final /* synthetic */ ffjn b;
    final /* synthetic */ Object c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dqko(ffjn ffjnVar, Object obj, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = ffjnVar;
        this.c = obj;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dqko) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        ffsk ffskVar = (ffsk) this.d;
        ffjn ffjnVar = this.b;
        Object obj2 = this.c;
        obj2.getClass();
        this.a = 1;
        Object a = ffjnVar.a(ffskVar, obj2, this);
        return a == ffhhVar ? ffhhVar : a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        dqko dqkoVar = new dqko(this.b, this.c, ffguVar);
        dqkoVar.d = obj;
        return dqkoVar;
    }
}
