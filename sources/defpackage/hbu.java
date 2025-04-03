package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hbu extends hvh implements ixv, ixn {
    public ffji a;
    public boolean b;
    private final Object c = hbv.a;

    public hbu(ffji ffjiVar) {
        this.a = ffjiVar;
    }

    @Override // defpackage.ixn
    public final void dO(jkv jkvVar) {
        if (this.b) {
            return;
        }
        this.a.invoke(jkvVar);
    }

    @Override // defpackage.ixn
    public final /* synthetic */ boolean dZ() {
        return false;
    }

    @Override // defpackage.ixv
    public final Object e() {
        return this.c;
    }

    @Override // defpackage.ixn
    public final boolean ea() {
        return true;
    }
}
