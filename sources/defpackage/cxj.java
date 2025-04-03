package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cxj {
    public final dbv a;
    public final cxv b;
    public final hho c;
    private final Object d;
    private final hho e;
    private final czw f;
    private final dac g;
    private final cyb h;
    private final cyb i;
    private cyb j;
    private cyb k;

    public cxj(Object obj, dbv dbvVar, Object obj2) {
        this.a = dbvVar;
        this.d = obj2;
        this.b = new cxv(dbvVar, obj, null, 60);
        this.c = new hic(false, hla.a);
        this.e = new hic(obj, hla.a);
        this.f = new czw();
        this.g = new dac(0.0f, obj2, 3);
        cyb a = a();
        cyb cybVar = a instanceof cxx ? cxk.e : a instanceof cxy ? cxk.f : a instanceof cxz ? cxk.g : cxk.h;
        this.h = cybVar;
        cyb a2 = a();
        cyb cybVar2 = a2 instanceof cxx ? cxk.a : a2 instanceof cxy ? cxk.b : a2 instanceof cxz ? cxk.c : cxk.d;
        this.i = cybVar2;
        this.j = cybVar;
        this.k = cybVar2;
    }

    public static /* synthetic */ Object j(cxj cxjVar, Object obj, cxt cxtVar, ffji ffjiVar, ffgu ffguVar, int i) {
        Object a;
        if ((i & 2) != 0) {
            cxtVar = cxjVar.g;
        }
        cxt cxtVar2 = cxtVar;
        Object invoke = (i & 4) != 0 ? cxjVar.a.a().invoke(cxjVar.a()) : null;
        ffji ffjiVar2 = (i & 8) != 0 ? null : ffjiVar;
        Object d = cxjVar.d();
        dbv dbvVar = cxjVar.a;
        a = ffsl.a(new czv(czr.a, cxjVar.f, new cxg(cxjVar, invoke, new daq(cxtVar2, dbvVar, d, obj, (cyb) dbvVar.b().invoke(invoke)), cxjVar.b.c, ffjiVar2, null), null), ffguVar);
        return a;
    }

    public final cyb a() {
        return this.b.b;
    }

    public final Object b(Object obj) {
        if (ffkj.e(this.j, this.h) && ffkj.e(this.k, this.i)) {
            return obj;
        }
        cyb cybVar = (cyb) this.a.b().invoke(obj);
        int b = cybVar.b();
        boolean z = false;
        for (int i = 0; i < b; i++) {
            if (cybVar.a(i) < this.j.a(i) || cybVar.a(i) > this.k.a(i)) {
                cybVar.e(i, ffmk.e(cybVar.a(i), this.j.a(i), this.k.a(i)));
                z = true;
            }
        }
        return z ? this.a.a().invoke(cybVar) : obj;
    }

    public final Object c() {
        return this.e.a();
    }

    public final Object d() {
        return this.b.a();
    }

    public final Object e(Object obj, ffgu ffguVar) {
        Object a;
        a = ffsl.a(new czv(czr.a, this.f, new cxh(this, obj, null), null), ffguVar);
        return a == ffhh.a ? a : ffcu.a;
    }

    public final Object f(ffgu ffguVar) {
        Object a;
        a = ffsl.a(new czv(czr.a, this.f, new cxi(this, null), null), ffguVar);
        return a == ffhh.a ? a : ffcu.a;
    }

    public final void g() {
        cxv cxvVar = this.b;
        cxvVar.b.d();
        cxvVar.c = Long.MIN_VALUE;
        h(false);
    }

    public final void h(boolean z) {
        this.c.b(Boolean.valueOf(z));
    }

    public final void i(Object obj) {
        this.e.b(obj);
    }

    public /* synthetic */ cxj(Object obj, dbv dbvVar, Object obj2, int i) {
        this(obj, dbvVar, (i & 4) != 0 ? null : obj2);
    }
}
