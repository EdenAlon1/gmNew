package defpackage;

import android.util.SparseIntArray;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dfwl {
    public final SparseIntArray a;
    public dfpj b;

    public dfwl() {
        this(dfpi.a);
    }

    public final void a() {
        synchronized (this.a) {
            this.a.clear();
        }
    }

    public final int b(int i) {
        int i2;
        synchronized (this.a) {
            i2 = this.a.get(i, -1);
        }
        return i2;
    }

    public dfwl(dfpj dfpjVar) {
        this.a = new SparseIntArray();
        dfwv.n(dfpjVar);
        this.b = dfpjVar;
    }
}
