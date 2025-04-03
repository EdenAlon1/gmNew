package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class brc {
    public abstract brd a();

    public abstract but b();

    public abstract void c();

    public abstract void d(but butVar);

    public final void e(ksp kspVar) {
        bqu bquVar = new bqu(b());
        kspVar.accept(bquVar);
        d(bquVar.a());
    }
}
