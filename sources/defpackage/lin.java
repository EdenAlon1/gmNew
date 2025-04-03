package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lin {
    public static final /* synthetic */ int a = 0;
    private static final lim b = lim.a;

    public static final void a(ea eaVar, String str) {
        eaVar.getClass();
        lij lijVar = new lij(eaVar, str);
        d(lijVar);
        lim b2 = b(eaVar);
        if (b2.b.contains(lil.DETECT_FRAGMENT_REUSE) && e(b2, eaVar.getClass(), lijVar.getClass())) {
            c(b2, lijVar);
        }
    }

    public static final lim b(ea eaVar) {
        while (eaVar != null) {
            if (eaVar.aF()) {
                eaVar.J();
            }
            eaVar = eaVar.E;
        }
        return b;
    }

    public static final void c(lim limVar, final lix lixVar) {
        ea eaVar = lixVar.a;
        final String name = eaVar.getClass().getName();
        if (limVar.b.contains(lil.PENALTY_LOG)) {
            Log.d("FragmentStrictMode", "Policy violation in ".concat(String.valueOf(name)), lixVar);
        }
        if (limVar.b.contains(lil.PENALTY_DEATH)) {
            Runnable runnable = new Runnable() { // from class: lik
                @Override // java.lang.Runnable
                public final void run() {
                    int i = lin.a;
                    String concat = "Policy violation with PENALTY_DEATH in ".concat(String.valueOf(name));
                    lix lixVar2 = lixVar;
                    Log.e("FragmentStrictMode", concat, lixVar2);
                    throw lixVar2;
                }
            };
            if (!eaVar.aF()) {
                runnable.run();
                return;
            }
            Handler handler = eaVar.J().o.d;
            if (ffkj.e(handler.getLooper(), Looper.myLooper())) {
                runnable.run();
            } else {
                handler.post(runnable);
            }
        }
    }

    public static final void d(lix lixVar) {
        if (fr.af(3)) {
            Log.d("FragmentManager", "StrictMode violation in ".concat(String.valueOf(lixVar.a.getClass().getName())), lixVar);
        }
    }

    public static final boolean e(lim limVar, Class cls, Class cls2) {
        Set set = (Set) limVar.c.get(cls.getName());
        if (set == null) {
            return true;
        }
        return (ffkj.e(cls2.getSuperclass(), lix.class) || !ffdx.au(set, cls2.getSuperclass())) && !set.contains(cls2);
    }
}
