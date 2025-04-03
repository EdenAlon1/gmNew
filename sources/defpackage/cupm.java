package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cupm extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cupo b;
    final /* synthetic */ cupq c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cupm(ffgu ffguVar, cupo cupoVar, cupq cupqVar) {
        super(2, ffguVar);
        this.b = cupoVar;
        this.c = cupqVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cupm) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        dkzo dkzoVar = (dkzo) this.b.a.b();
        cupq cupqVar = this.c;
        this.a = 1;
        Object a = dkzoVar.a(cupqVar.c, this);
        return a == ffhhVar ? ffhhVar : a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        cupm cupmVar = new cupm(ffguVar, this.b, this.c);
        cupmVar.d = obj;
        return cupmVar;
    }
}
