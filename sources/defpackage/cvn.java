package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cvn {
    public final Object a;
    public final hho b = new hic(null, hla.a);

    public cvn(Object obj) {
        this.a = obj;
    }

    public final cvf a() {
        return (cvf) this.b.a();
    }

    public final cvf b() {
        cvf a = a();
        if (a != null) {
            return a;
        }
        throw new IllegalArgumentException("Error: SharedContentState has not been added to a sharedElement/sharedBoundsmodifier yet. Therefore the internal state has not bee initialized.");
    }

    public final boolean c() {
        cvd d;
        cvf a = a();
        if (a == null || (d = a.d()) == null) {
            return false;
        }
        return d.i();
    }
}
