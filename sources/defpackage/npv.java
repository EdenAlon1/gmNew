package defpackage;

import android.util.SparseArray;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class npv {
    public int b;
    public long h;
    public long j;
    public final SparseArray a = new SparseArray();
    public lsp c = lsp.a;
    public int d = -1;
    public npt[] e = new npt[0];
    public long f = -9223372036854775807L;
    public long g = -1;
    public long i = Long.MAX_VALUE;

    public final npt a(long j) {
        ByteBuffer order = ByteBuffer.allocateDirect(this.d * this.c.e).order(ByteOrder.nativeOrder());
        order.mark();
        return new npt(order, j, j + this.d);
    }

    public final npu b(int i) {
        lti.d(lvf.T(this.a, i), "Source not found.");
        return (npu) this.a.get(i);
    }

    public final void c() {
        lti.d(!this.c.equals(lsp.a), "Audio mixer is not configured.");
    }

    public final void d() {
        this.g = Math.min(this.i, this.h + this.d);
    }

    public final boolean e() {
        c();
        long j = this.h;
        if (j < this.i) {
            return j >= this.j && this.a.size() == 0;
        }
        return true;
    }
}
