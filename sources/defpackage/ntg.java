package defpackage;

import android.util.SparseLongArray;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ntg implements mhd {
    private final SparseLongArray a = new SparseLongArray();
    private long b;

    @Override // defpackage.mhd
    public final long a() {
        return this.b;
    }

    @Override // defpackage.mhd
    public final lri b() {
        return lri.a;
    }

    public final void c(int i, long j) {
        long j2 = this.a.get(i, -9223372036854775807L);
        if (j2 == -9223372036854775807L || j > j2) {
            this.a.put(i, j);
            if (j2 == -9223372036854775807L || j2 == this.b) {
                SparseLongArray sparseLongArray = this.a;
                int i2 = lvf.a;
                if (sparseLongArray.size() == 0) {
                    throw new NoSuchElementException();
                }
                long j3 = Long.MAX_VALUE;
                for (int i3 = 0; i3 < sparseLongArray.size(); i3++) {
                    j3 = Math.min(j3, sparseLongArray.valueAt(i3));
                }
                this.b = j3;
            }
        }
    }

    @Override // defpackage.mhd
    public final /* synthetic */ boolean g() {
        return false;
    }

    @Override // defpackage.mhd
    public final void d(lri lriVar) {
    }
}
