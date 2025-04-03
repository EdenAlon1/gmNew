package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dcxg extends abo {
    private final iy a;
    private final Runnable d;

    public dcxg(iy iyVar, Runnable runnable) {
        super(true);
        this.a = iyVar;
        this.d = runnable;
        iyVar.gE().b(iyVar, this);
    }

    @Override // defpackage.abo
    public final void b() {
        this.d.run();
        h(false);
        this.a.gE().d();
    }
}
