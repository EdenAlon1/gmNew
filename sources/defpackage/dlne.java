package defpackage;

import android.util.Log;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dlne implements dlnd {
    private boolean a;

    public final void c(dloe dloeVar) {
        boolean z;
        Log.v("AppIntegCallbackExt", "#onVoicePlateStateChanged()");
        int a = dlod.a(dloeVar.b);
        if (a != 0 && a == 2) {
            if (this.a) {
                return;
            } else {
                z = true;
            }
        } else if (!this.a) {
            return;
        } else {
            z = false;
        }
        this.a = z;
    }

    @Override // defpackage.dlnd
    public final void a() {
    }

    @Override // defpackage.dlnd
    public final void b() {
    }
}
