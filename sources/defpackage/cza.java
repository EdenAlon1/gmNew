package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cza implements hkx {
    public Object a;
    public Object b;
    public final dbv c;
    public cxt d;
    public daq e;
    public boolean f;
    public boolean g;
    public long h;
    final /* synthetic */ czg i;
    private final hho j;

    public cza(czg czgVar, Object obj, Object obj2, dbv dbvVar, cxt cxtVar) {
        this.i = czgVar;
        this.a = obj;
        this.b = obj2;
        this.c = dbvVar;
        this.j = new hic(obj, hla.a);
        this.d = cxtVar;
        this.e = new daq(this.d, dbvVar, this.a, this.b);
    }

    @Override // defpackage.hkx
    public final Object a() {
        return this.j.a();
    }

    public final void b(Object obj) {
        this.j.b(obj);
    }
}
