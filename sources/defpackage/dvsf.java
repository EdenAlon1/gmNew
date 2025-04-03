package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dvsf {
    private final Context a;
    private final eauy b;

    public dvsf(Context context, eauy eauyVar) {
        this.a = context;
        this.b = eauyVar;
    }

    private final void c(List list, String str, int i, int i2) {
        if (str.isEmpty()) {
            return;
        }
        eauy eauyVar = this.b;
        easr g = east.g();
        g.c(str);
        g.d(i);
        g.b(i2);
        list.add(eauyVar.a.a(eauyVar.b, g.a()));
    }

    private static final void d(List list, String str) {
        if (str.isEmpty()) {
            return;
        }
        list.add(erre.a);
    }

    public final List a(evxu evxuVar) {
        ArrayList arrayList = new ArrayList();
        Context context = this.a;
        int b = dvsl.b(evxuVar, context);
        int a = dvsl.a(evxuVar, context);
        c(arrayList, evxuVar.c == 5 ? (String) evxuVar.d : "", b, a);
        Iterator<E> it = evxuVar.k.iterator();
        while (it.hasNext()) {
            evxy evxyVar = ((evzn) it.next()).e;
            if (evxyVar == null) {
                evxyVar = evxy.a;
            }
            c(arrayList, evxyVar.b == 1 ? (String) evxyVar.c : "", b, a);
        }
        return arrayList;
    }

    public final List b(evxu evxuVar) {
        ArrayList arrayList = new ArrayList();
        Context context = this.a;
        dvsl.b(evxuVar, context);
        dvsl.a(evxuVar, context);
        d(arrayList, evxuVar.c == 5 ? (String) evxuVar.d : "");
        Iterator<E> it = evxuVar.k.iterator();
        while (it.hasNext()) {
            evxy evxyVar = ((evzn) it.next()).e;
            if (evxyVar == null) {
                evxyVar = evxy.a;
            }
            d(arrayList, evxyVar.b == 1 ? (String) evxyVar.c : "");
        }
        return arrayList;
    }
}
