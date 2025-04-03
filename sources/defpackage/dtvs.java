package defpackage;

import android.util.ArrayMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dtvs {
    public final List a;
    public final boolean b;
    private final Map c;
    private final engr d;
    private final AtomicInteger e;

    public dtvs() {
        this(false);
    }

    public static dtyo a(final int i) {
        return i == 0 ? new dtyo() { // from class: dtvq
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return (String) obj;
            }
        } : new dtyo() { // from class: dtvr
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return "JT_" + i + "_" + ((String) obj);
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void f(dtzu dtzuVar, engw engwVar) {
        for (int i = 0; i < ((enou) engwVar).c; i++) {
            dtvn dtvnVar = (dtvn) engwVar.get(i);
            e(dtvnVar.e);
            f(dtzuVar, dtvnVar.a.m.c());
        }
    }

    public final dtyo b(String str) {
        return (dtyo) this.c.get(str);
    }

    public final engw c() {
        return this.d.g();
    }

    public final boolean d() {
        return this.b;
    }

    public final void e(String str) {
        if (this.c.containsKey(str)) {
        } else {
            this.c.put(str, a(this.e.getAndIncrement()));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public dtvs(dtzu dtzuVar, dtza dtzaVar, boolean z) {
        this(z);
        dtrj dtrjVar = (dtrj) dtzaVar;
        enqv it = dtrjVar.r.iterator();
        while (it.hasNext()) {
            dtvn dtvnVar = (dtvn) it.next();
            this.d.h(dtvnVar);
            this.a.add(dtvnVar.a.o);
        }
        f(dtzuVar, dtrjVar.r);
    }

    public dtvs(boolean z) {
        this.c = new ArrayMap();
        int i = engw.d;
        this.d = new engr();
        this.a = new ArrayList();
        this.e = new AtomicInteger(1);
        this.b = z;
    }
}
