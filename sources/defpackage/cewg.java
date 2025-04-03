package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cewg extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cewk b;
    final /* synthetic */ poj c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cewg(ffgu ffguVar, cewk cewkVar, poj pojVar) {
        super(2, ffguVar);
        this.b = cewkVar;
        this.c = pojVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cewg) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        Object b;
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        cewk cewkVar = this.b;
        poj pojVar = this.c;
        this.a = 1;
        int i2 = pojVar.j;
        if (i2 == 1) {
            b = true;
        } else {
            int i3 = i2 - 1;
            b = i3 != 1 ? i3 != 2 ? i3 != 3 ? false : cewkVar.b.b(this) : cewkVar.b.c(this) : cewkVar.b.a(this);
        }
        return b == ffhhVar ? ffhhVar : b;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        cewg cewgVar = new cewg(ffguVar, this.b, this.c);
        cewgVar.d = obj;
        return cewgVar;
    }
}
