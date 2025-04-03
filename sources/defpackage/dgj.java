package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dgj extends hvh implements ixv {
    public static final dgi a = new dgi();
    private final ffji b;
    private final Object c = a;

    public dgj(ffji ffjiVar) {
        this.b = ffjiVar;
    }

    public final void a(ioc iocVar) {
        this.b.invoke(iocVar);
        dgj dgjVar = (dgj) ixw.a(this);
        if (dgjVar != null) {
            dgjVar.a(iocVar);
        }
    }

    @Override // defpackage.ixv
    public final Object e() {
        return this.c;
    }
}
