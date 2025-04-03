package defpackage;

import android.util.Log;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class fazg {
    /* JADX WARN: Multi-variable type inference failed */
    public static void a(ea eaVar) {
        fazf fazfVar;
        ea eaVar2 = eaVar;
        while (true) {
            eaVar2 = eaVar2.E;
            if (eaVar2 == 0) {
                eg G = eaVar.G();
                if (G instanceof fazf) {
                    fazfVar = (fazf) G;
                } else {
                    if (!(G.getApplication() instanceof fazf)) {
                        throw new IllegalArgumentException(String.format("No injector was found for %s", eaVar.getClass().getCanonicalName()));
                    }
                    fazfVar = (fazf) G.getApplication();
                }
            } else if (eaVar2 instanceof fazf) {
                fazfVar = (fazf) eaVar2;
                break;
            }
        }
        if (Log.isLoggable("dagger.android.support", 3)) {
            Log.d("dagger.android.support", String.format("An injector for %s was found in %s", eaVar.getClass().getCanonicalName(), fazfVar.getClass().getCanonicalName()));
        }
        faze ab = fazfVar.ab();
        fazfVar.getClass();
        ab.getClass();
        ab.a(eaVar);
    }
}
