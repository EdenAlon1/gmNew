package defpackage;

import android.util.SparseIntArray;

/* compiled from: PG */
/* loaded from: classes.dex */
final class zo implements zs {
    final uu a;
    final /* synthetic */ zp b;
    private final SparseIntArray c = new SparseIntArray(1);
    private final SparseIntArray d = new SparseIntArray(1);

    public zo(zp zpVar, uu uuVar) {
        this.b = zpVar;
        this.a = uuVar;
    }

    @Override // defpackage.zs
    public final int a(int i) {
        int indexOfKey = this.d.indexOfKey(i);
        if (indexOfKey >= 0) {
            return this.d.valueAt(indexOfKey);
        }
        throw new IllegalStateException("requested global type " + i + " does not belong to the adapter:" + this.a.b);
    }

    @Override // defpackage.zs
    public final int b(int i) {
        int indexOfKey = this.c.indexOfKey(i);
        if (indexOfKey >= 0) {
            return this.c.valueAt(indexOfKey);
        }
        zp zpVar = this.b;
        uu uuVar = this.a;
        int i2 = zpVar.b;
        zpVar.b = i2 + 1;
        zpVar.a.put(i2, uuVar);
        this.c.put(i, i2);
        this.d.put(i2, i);
        return i2;
    }
}
