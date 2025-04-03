package defpackage;

import android.util.Log;

/* compiled from: PG */
/* loaded from: classes.dex */
final class loq implements llh {
    public final lox a;
    public final lon b;
    public boolean c = false;

    public loq(lox loxVar, lon lonVar) {
        this.a = loxVar;
        this.b = lonVar;
    }

    @Override // defpackage.llh
    public final void a(Object obj) {
        if (lot.e(2)) {
            Log.v("LoaderManager", "  onLoadFinished in " + this.a + ": " + lox.r(obj));
        }
        this.c = true;
        this.b.b(this.a, obj);
    }

    public final String toString() {
        return this.b.toString();
    }
}
