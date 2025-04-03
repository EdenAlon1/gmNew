package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dxk implements dxj {
    @Override // defpackage.dxi
    public final float a() {
        return 0.0f;
    }

    @Override // defpackage.dxi
    public final void b(jzn jznVar, int i, int[] iArr, kah kahVar, int[] iArr2) {
        if (kahVar == kah.a) {
            dxu.d(i, iArr, iArr2, false);
        } else {
            dxu.d(i, iArr, iArr2, true);
        }
    }

    public final String toString() {
        return "Arrangement#SpaceAround";
    }

    @Override // defpackage.dxq
    public final void b(jzn jznVar, int i, int[] iArr, int[] iArr2) {
        dxu.d(i, iArr, iArr2, false);
    }
}
