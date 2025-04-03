package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class wmh extends ffhv implements ffji {
    boolean a;
    boolean b;
    boolean c;
    boolean d;
    boolean e;
    boolean f;
    boolean g;
    boolean h;
    Object i;
    Object j;
    Object k;
    Object l;
    int m;
    final /* synthetic */ boolean n;
    final /* synthetic */ wmn o;
    final /* synthetic */ boolean p;
    final /* synthetic */ boolean q;
    final /* synthetic */ boolean r;
    final /* synthetic */ boolean s;
    final /* synthetic */ boolean t;
    final /* synthetic */ boolean u;
    final /* synthetic */ boolean v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wmh(boolean z, wmn wmnVar, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, ffgu ffguVar) {
        super(1, ffguVar);
        this.n = z;
        this.o = wmnVar;
        this.p = z2;
        this.q = z3;
        this.r = z4;
        this.s = z5;
        this.t = z6;
        this.u = z7;
        this.v = z8;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        ffhh ffhhVar = ffhh.a;
        if (this.m != 0) {
            z8 = this.h;
            z7 = this.g;
            z6 = this.f;
            z5 = this.e;
            z4 = this.d;
            z3 = this.c;
            z2 = this.b;
            z = this.a;
            Object obj6 = this.l;
            obj2 = this.k;
            obj3 = this.j;
            Object obj7 = this.i;
            ffci.b(obj);
            obj5 = obj6;
            obj4 = obj7;
        } else {
            ffci.b(obj);
            eolu eoluVar = (eolu) eolv.a.createBuilder();
            eolt eoltVar = eolt.MAGIC_COMPOSE_DISPLAY;
            eoluVar.copyOnWrite();
            eolv eolvVar = (eolv) eoluVar.instance;
            eolvVar.j = eoltVar.dk;
            eolvVar.b |= 1;
            z = this.n;
            wmn wmnVar = this.o;
            z2 = this.p;
            z3 = this.q;
            z4 = this.r;
            z5 = this.s;
            z6 = this.t;
            z7 = this.u;
            boolean z9 = this.v;
            eqsh eqshVar = (eqsh) eqsk.a.createBuilder();
            eqshVar.getClass();
            eqth eqthVar = new eqth(eqshVar);
            eqsh eqshVar2 = eqthVar.a;
            eqshVar2.copyOnWrite();
            eqsk eqskVar = (eqsk) eqshVar2.instance;
            eqskVar.b |= 2;
            eqskVar.d = z;
            comc comcVar = (comc) wmnVar.c.b();
            this.i = eqthVar;
            this.j = eqthVar;
            this.k = eqthVar;
            this.l = eoluVar;
            this.a = z;
            this.b = z2;
            this.c = z3;
            this.d = z4;
            this.e = z5;
            this.f = z6;
            this.g = z7;
            this.h = z9;
            this.m = 1;
            obj = comcVar.c(this);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
            z8 = z9;
            obj2 = eqthVar;
            obj3 = obj2;
            obj5 = eoluVar;
            obj4 = eqthVar;
        }
        boolean z10 = ((czuk) obj).c;
        eqsh eqshVar3 = ((eqth) obj2).a;
        eqshVar3.copyOnWrite();
        eqsk eqskVar2 = (eqsk) eqshVar3.instance;
        eqsk eqskVar3 = eqsk.a;
        eqskVar2.b |= 4;
        eqskVar2.e = z10;
        if (!z) {
            eqsi eqsiVar = (eqsi) eqsj.a.createBuilder();
            eqsiVar.getClass();
            eqsiVar.copyOnWrite();
            eqsj eqsjVar = (eqsj) eqsiVar.instance;
            eqsjVar.b |= 1;
            eqsjVar.c = z3;
            eqsiVar.copyOnWrite();
            eqsj eqsjVar2 = (eqsj) eqsiVar.instance;
            eqsjVar2.b |= 4;
            eqsjVar2.d = z4;
            eqsiVar.copyOnWrite();
            eqsj eqsjVar3 = (eqsj) eqsiVar.instance;
            eqsjVar3.b |= 8;
            eqsjVar3.e = z5;
            boolean z11 = z6 || z7;
            eqsiVar.copyOnWrite();
            eqsj eqsjVar4 = (eqsj) eqsiVar.instance;
            eqsjVar4.b |= 16;
            eqsjVar4.f = z11;
            if (z2 && z8) {
                eqsiVar.copyOnWrite();
                eqsj eqsjVar5 = (eqsj) eqsiVar.instance;
                eqsjVar5.b |= 32;
                eqsjVar5.g = true;
            }
            eyfy build = eqsiVar.build();
            build.getClass();
            eqsh eqshVar4 = ((eqth) obj3).a;
            eqshVar4.copyOnWrite();
            eqsk eqskVar4 = (eqsk) eqshVar4.instance;
            eqskVar4.c = (eqsj) build;
            eqskVar4.b |= 1;
        }
        if (z2) {
            boolean p = wmn.p();
            eqsh eqshVar5 = ((eqth) obj3).a;
            eqshVar5.copyOnWrite();
            eqsk eqskVar5 = (eqsk) eqshVar5.instance;
            eqskVar5.b |= 8;
            eqskVar5.f = p;
        }
        eyfy build2 = ((eqth) obj4).a.build();
        build2.getClass();
        ((eyfq) obj5).copyOnWrite();
        eolv eolvVar2 = (eolv) ((eolu) obj5).instance;
        eolv eolvVar3 = eolv.a;
        eolvVar2.bM = (eqsk) build2;
        eolvVar2.g |= 262144;
        return obj5;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new wmh(this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.v, (ffgu) obj).b(ffcu.a);
    }
}
