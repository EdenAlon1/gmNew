package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class csrk extends ffhv implements ffjm {
    Object a;
    int b;
    final /* synthetic */ csrv c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public csrk(csrv csrvVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.c = csrvVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((csrk) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        Object obj2;
        ffhh ffhhVar = ffhh.a;
        if (this.b != 0) {
            obj2 = this.a;
            ffci.b(obj);
        } else {
            ffci.b(obj);
            csrv csrvVar = this.c;
            cssu cssuVar = (cssu) csrvVar.f.b();
            this.a = csrvVar;
            this.b = 1;
            Object a = cssuVar.a(this);
            if (a == ffhhVar) {
                return ffhhVar;
            }
            obj2 = csrvVar;
            obj = a;
        }
        cfly cflyVar = (cfly) obj;
        enru enruVar = csrv.a;
        csrv csrvVar2 = (csrv) obj2;
        csrvVar2.j(cflyVar.c);
        csrvVar2.h(cflyVar.d);
        csrvVar2.e(cflyVar.e);
        csrvVar2.g(cflyVar.f);
        csrvVar2.i(cflyVar.g);
        csrvVar2.f(cflyVar.h);
        csrvVar2.m(cflyVar.i);
        if ((cflyVar.b & 128) != 0) {
            csrvVar2.k(cflyVar.j);
        }
        if ((cflyVar.b & 256) != 0) {
            csrvVar2.l(cflyVar.k);
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new csrk(this.c, ffguVar);
    }
}
