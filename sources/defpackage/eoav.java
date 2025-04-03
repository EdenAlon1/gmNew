package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
abstract class eoav extends eobb {
    private final int a;
    private final int[] b;

    public eoav(int i, int[] iArr) {
        this.a = i;
        this.b = iArr;
    }

    @Override // defpackage.eobb
    public final int c(int i) {
        return this.b[i];
    }

    @Override // defpackage.eobb
    public final int d() {
        return this.b.length;
    }

    @Override // defpackage.eobb
    public final int e() {
        return this.a;
    }
}
