package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
class eoal extends eobb {
    private final int a;

    public eoal(int i) {
        this.a = i;
    }

    @Override // defpackage.eobb
    public final int c(int i) {
        throw new ArrayIndexOutOfBoundsException();
    }

    @Override // defpackage.eobb
    public final int d() {
        return 0;
    }

    @Override // defpackage.eobb
    public final int e() {
        return this.a;
    }

    @Override // defpackage.eobb
    public final boolean f() {
        return true;
    }
}
