package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fgrw extends ffhv implements ffjm {
    int a;
    final /* synthetic */ dris b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fgrw(ffgu ffguVar, dris drisVar) {
        super(2, ffguVar);
        this.b = drisVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((fgrw) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        dris drisVar = this.b;
        fgrx fgrxVar = new fgrx(null);
        int i2 = fgau.a;
        fgap fgapVar = new fgap(drisVar.a, fgrxVar);
        if (i2 <= 0) {
            throw new IllegalArgumentException("Expected positive concurrency level, but had " + i2);
        }
        ffxx fgaqVar = i2 == 1 ? new fgaq(fgapVar) : new fgef(fgapVar, i2, ffhe.a, -2, 1);
        fgry fgryVar = new fgry(null);
        this.a = 1;
        Object d = fgbj.d(fgaqVar, fgryVar, this);
        return d == ffhhVar ? ffhhVar : d;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        fgrw fgrwVar = new fgrw(ffguVar, this.b);
        fgrwVar.c = obj;
        return fgrwVar;
    }
}
