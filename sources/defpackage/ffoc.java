package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes6.dex */
public class ffoc extends ffnx {
    public static final Object f(ffnl ffnlVar) {
        ffnlVar.getClass();
        Iterator a = ffnlVar.a();
        if (a.hasNext()) {
            return a.next();
        }
        return null;
    }

    public static final List g(ffnl ffnlVar) {
        Iterator a = ffnlVar.a();
        if (!a.hasNext()) {
            return ffel.a;
        }
        Object next = a.next();
        if (!a.hasNext()) {
            return ffdx.g(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (a.hasNext()) {
            arrayList.add(a.next());
        }
        return arrayList;
    }

    public static final ffnl h(ffnl ffnlVar, int i) {
        if (i >= 0) {
            return i != 0 ? ffnlVar instanceof ffnd ? ((ffnd) ffnlVar).b(i) : new ffnc(ffnlVar, i) : ffnlVar;
        }
        throw new IllegalArgumentException(a.f(i, "Requested element count ", " is less than zero."));
    }

    public static final ffnl i(ffnl ffnlVar, ffji ffjiVar) {
        ffnlVar.getClass();
        return new ffok(ffnlVar, ffjiVar);
    }

    public static final ffnl j(ffnl ffnlVar, ffji ffjiVar) {
        ffnlVar.getClass();
        return new ffng(new ffok(ffnlVar, ffjiVar), false, ffoa.a);
    }

    public static final ffnl k(ffnl ffnlVar, int i) {
        if (i >= 0) {
            return i == 0 ? ffne.a : ffnlVar instanceof ffnd ? ((ffnd) ffnlVar).c(i) : new ffog(ffnlVar, i);
        }
        throw new IllegalArgumentException(a.f(i, "Requested element count ", " is less than zero."));
    }

    public static /* synthetic */ String l(ffnl ffnlVar, CharSequence charSequence, int i) {
        if (1 == (i & 1)) {
            charSequence = ", ";
        }
        charSequence.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        Iterator a = ffnlVar.a();
        int i2 = 0;
        while (a.hasNext()) {
            Object next = a.next();
            i2++;
            if (i2 > 1) {
                sb.append(charSequence);
            }
            ffpc.a(sb, next, null);
        }
        sb.append((CharSequence) "");
        return sb.toString();
    }
}
