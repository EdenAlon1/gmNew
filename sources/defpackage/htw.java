package defpackage;

import java.lang.reflect.Method;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class htw {
    public static final void a(Throwable th, ffix ffixVar) {
        Collection c;
        Object invoke;
        hud hudVar;
        th.getClass();
        if (ffid.a()) {
            Throwable[] suppressed = th.getSuppressed();
            suppressed.getClass();
            c = ffdo.c(suppressed);
        } else {
            Method method = ffhz.b;
            c = (method == null || (invoke = method.invoke(th, new Object[0])) == null) ? ffel.a : ffdo.c((Throwable[]) invoke);
        }
        if (!c.isEmpty()) {
            Iterator it = c.iterator();
            while (it.hasNext()) {
                if (((Throwable) it.next()) instanceof hud) {
                    return;
                }
            }
        }
        try {
            List list = (List) ffixVar.invoke();
            hudVar = !list.isEmpty() ? new hud(list) : null;
        } catch (Throwable th2) {
            hudVar = th2;
        }
        if (hudVar != null) {
            ffbt.a(th, hudVar);
        }
    }
}
