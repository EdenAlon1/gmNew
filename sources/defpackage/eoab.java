package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eoab extends eoac {
    private final eobb[] a;

    public eoab(eobb[] eobbVarArr) {
        this.a = eobbVarArr;
    }

    @Override // defpackage.eoac
    public final int a() {
        return this.a.length;
    }

    @Override // defpackage.eoac
    public final eobb b(int i) {
        return this.a[i];
    }
}
