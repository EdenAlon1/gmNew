package defpackage;

import android.content.Context;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dvrn {
    public static synchronized evzm a(Context context) {
        synchronized (dvrn.class) {
            int i = context.getResources().getConfiguration().uiMode & 48;
            if (i == 16) {
                return evzm.LIGHT;
            }
            if (i != 32) {
                return evzm.UNSPECIFIED;
            }
            return evzm.DARK;
        }
    }

    public static final evzm b(evzm evzmVar, evxu evxuVar) {
        if (d(evzmVar, evxuVar.k)) {
            return evzm.UNSPECIFIED;
        }
        c(evzmVar, evxuVar.k);
        Iterator<E> it = evxuVar.h.iterator();
        while (it.hasNext()) {
            c(evzmVar, ((evxi) it.next()).i);
        }
        return evzmVar;
    }

    public static final evzn c(evzm evzmVar, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            evzn evznVar = (evzn) it.next();
            evzm b = evzm.b(evznVar.c);
            if (b == null) {
                b = evzm.UNSPECIFIED;
            }
            if (b.equals(evzmVar)) {
                return evznVar;
            }
        }
        throw new dvrm();
    }

    public static boolean d(evzm evzmVar, List list) {
        if (evzmVar == evzm.UNSPECIFIED) {
            return true;
        }
        return list.isEmpty();
    }
}
