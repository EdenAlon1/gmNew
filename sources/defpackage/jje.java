package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jje extends hvh implements ixn {
    public boolean a;
    public ffji b;
    private final boolean c;

    public jje(boolean z, boolean z2, ffji ffjiVar) {
        this.a = z;
        this.c = z2;
        this.b = ffjiVar;
    }

    @Override // defpackage.ixn
    public final void dO(jkv jkvVar) {
        this.b.invoke(jkvVar);
    }

    @Override // defpackage.ixn
    public final boolean dZ() {
        return this.c;
    }

    @Override // defpackage.ixn
    public final boolean ea() {
        return this.a;
    }
}
