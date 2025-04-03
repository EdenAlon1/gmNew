package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class rdd extends rdi {
    @Override // defpackage.rdi
    public final float a(int i, int i2, int i3, int i4) {
        int ceil = (int) Math.ceil(Math.max(i2 / i4, i / i3));
        return 1.0f / (r2 << (Math.max(1, Integer.highestOneBit(ceil)) >= ceil ? 0 : 1));
    }

    @Override // defpackage.rdi
    public final int b(int i, int i2, int i3, int i4) {
        return 1;
    }
}
