package defpackage;

import android.util.Log;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class duku implements Runnable {
    final /* synthetic */ List a;
    final /* synthetic */ int b;
    final /* synthetic */ dukv c;

    public duku(dukv dukvVar, List list, int i) {
        this.a = list;
        this.b = i;
        this.c = dukvVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        eg G = this.c.d.G();
        boolean isDestroyed = G.isDestroyed();
        if (G == 0 || G.isFinishing() || isDestroyed) {
            Log.w("HatsLibMultiChoiceFrag", "Activity was null, finishing or destroyed while attempting to navigate to the next next page. Likely the user rotated the device before the Runnable executed.");
            return;
        }
        this.c.d.d = ((eujx) this.a.get(this.b)).b;
        dukv dukvVar = this.c;
        int i = this.b;
        dukw dukwVar = dukvVar.d;
        dukwVar.e = i;
        dukwVar.ag.b();
        Log.d("HatsLibMultiChoiceFrag", "User selected response: ".concat(String.valueOf(String.valueOf(this.a.get(this.b)))));
        ((dula) G).D();
        dukb.c().b().b = false;
    }
}
