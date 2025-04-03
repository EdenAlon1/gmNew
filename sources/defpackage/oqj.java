package defpackage;

import android.util.Log;

/* compiled from: PG */
/* loaded from: classes.dex */
final class oqj implements oqs {
    final /* synthetic */ oql a;

    public oqj(oql oqlVar) {
        this.a = oqlVar;
    }

    @Override // defpackage.oqs
    public final void g() {
        oql oqlVar = this.a;
        synchronized (oqlVar.c) {
            if (oqlVar.b > 0) {
                Log.w("OperationMonitor", "Resetting OperationMonitor with " + oqlVar.b + " active operations.");
            }
            oqlVar.b = 0;
            oqlVar.a();
        }
    }

    @Override // defpackage.oqs
    public final boolean k() {
        boolean z;
        oql oqlVar = this.a;
        synchronized (oqlVar.c) {
            synchronized (oqlVar.c) {
                z = oqlVar.b > 0;
            }
        }
        return z;
    }
}
