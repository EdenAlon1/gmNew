package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cuvu extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cuwf b;
    final /* synthetic */ boolean c;
    Object d;
    Object e;
    private /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cuvu(ffgu ffguVar, cuwf cuwfVar, boolean z) {
        super(2, ffguVar);
        this.b = cuwfVar;
        this.c = z;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cuvu) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        fbct a;
        ffss b;
        fcfo fcfoVar;
        fcek fcekVar;
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        if (i == 0) {
            ffci.b(obj);
            ffsk ffskVar = (ffsk) this.f;
            a = ((cuvq) this.b.c.b()).a();
            if (a == null) {
                return null;
            }
            fcfo b2 = this.b.b();
            ffhe ffheVar = ffhe.a;
            ffss b3 = ffra.b(ffskVar, ekxi.a(ffheVar), ffsm.a, new cuvv(null, this.b, this.c));
            ffhe ffheVar2 = ffhe.a;
            b = ffra.b(ffskVar, ekxi.a(ffheVar2), ffsm.a, new cuvw(null, this.b, this.c));
            this.f = b;
            this.d = b2;
            this.e = a;
            this.a = 1;
            obj = b3.c(this);
            if (obj != ffhhVar) {
                fcfoVar = b2;
            }
            return ffhhVar;
        }
        if (i != 1) {
            fcekVar = (fcek) this.e;
            a = (fbct) this.d;
            fcfoVar = (fcfo) this.f;
            ffci.b(obj);
            return new cuvs(a, fcfoVar, fcekVar, (fcfw) obj);
        }
        a = (fbct) this.e;
        fcfoVar = (fcfo) this.d;
        b = (ffss) this.f;
        ffci.b(obj);
        fcek fcekVar2 = (fcek) obj;
        this.f = fcfoVar;
        this.d = a;
        this.e = fcekVar2;
        this.a = 2;
        Object c = b.c(this);
        if (c != ffhhVar) {
            fcekVar = fcekVar2;
            obj = c;
            return new cuvs(a, fcfoVar, fcekVar, (fcfw) obj);
        }
        return ffhhVar;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        cuvu cuvuVar = new cuvu(ffguVar, this.b, this.c);
        cuvuVar.f = obj;
        return cuvuVar;
    }
}
