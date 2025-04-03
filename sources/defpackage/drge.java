package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class drge extends ffhv implements ffji {
    int a;
    final /* synthetic */ drgf b;
    final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public drge(drgf drgfVar, Object obj, ffgu ffguVar) {
        super(1, ffguVar);
        this.b = drgfVar;
        this.c = obj;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        drgf drgfVar = this.b;
        Object obj2 = this.c;
        this.a = 1;
        Object a = drgfVar.a.a(obj2, this);
        return a == ffhhVar ? ffhhVar : a;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new drge(this.b, this.c, (ffgu) obj).b(ffcu.a);
    }
}
