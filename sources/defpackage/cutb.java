package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cutb extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cutc b;
    final /* synthetic */ String c;
    final /* synthetic */ cujo d;
    final /* synthetic */ int e;
    private /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cutb(ffgu ffguVar, cutc cutcVar, String str, cujo cujoVar, int i) {
        super(2, ffguVar);
        this.b = cutcVar;
        this.c = str;
        this.d = cujoVar;
        this.e = i;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cutb) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        cuwf cuwfVar = (cuwf) this.b.e.b();
        String str = this.c;
        cujo cujoVar = this.d;
        int i2 = this.e;
        this.a = 1;
        Object a = ffra.a(ekxi.a(cuwfVar.i), new cuwa(null, str, cujoVar.h, cuwfVar, i2), this);
        return a == ffhhVar ? ffhhVar : a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        cutb cutbVar = new cutb(ffguVar, this.b, this.c, this.d, this.e);
        cutbVar.f = obj;
        return cutbVar;
    }
}
