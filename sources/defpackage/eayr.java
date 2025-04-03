package defpackage;

import android.util.Log;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class eayr implements eayo {
    private static final String e = "eayr";
    public boolean c;
    public ebqz d;
    private final eave i;
    private engw j;
    private eavo k;
    private final CopyOnWriteArrayList f = new CopyOnWriteArrayList();
    private final Object g = new Object();
    private final Map h = new HashMap();
    public boolean a = true;
    public emxc b = emux.a;

    public eayr(eave eaveVar) {
        int i = engw.d;
        this.j = enou.a;
        this.i = eaveVar;
    }

    private static Object j(eavo eavoVar) {
        if (eavoVar != null) {
            return eavoVar.c();
        }
        return null;
    }

    private static void k(String str) {
        String str2 = e;
        if (Log.isLoggable(str2, 3)) {
            Log.d(str2, str);
        }
    }

    private final void l() {
        if (this.c) {
            return;
        }
        this.c = true;
        Iterator it = this.f.iterator();
        while (it.hasNext()) {
            ((eays) it.next()).a();
        }
    }

    private final void m(int i) {
        Iterator it = this.f.iterator();
        while (it.hasNext()) {
            eays eaysVar = (eays) it.next();
            Object j = j(this.k);
            eaysVar.b(j);
            eaysVar.d(j, i);
        }
    }

    @Override // defpackage.eayo
    public final Object a() {
        return j(this.k);
    }

    @Override // defpackage.eayo
    public final void c(eays eaysVar) {
        this.f.add(eaysVar);
    }

    @Override // defpackage.eayo
    public final void d(eays eaysVar) {
        this.f.remove(eaysVar);
    }

    @Override // defpackage.eayo
    public final boolean e() {
        return this.c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.eayo
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final engw b() {
        engw g;
        engr engrVar = new engr();
        synchronized (this.g) {
            enqv it = this.j.iterator();
            while (it.hasNext()) {
                engrVar.h(((eavo) it.next()).c());
            }
            g = engrVar.g();
        }
        return g;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0105 A[Catch: all -> 0x0193, TryCatch #0 {, blocks: (B:27:0x00a8, B:29:0x00b0, B:32:0x00d5, B:35:0x0101, B:37:0x0105, B:39:0x010d, B:43:0x00e2, B:46:0x00f9, B:47:0x00b9, B:50:0x0123, B:51:0x012f), top: B:26:0x00a8 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(defpackage.engw r12) {
        /*
            Method dump skipped, instructions count: 409
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eayr.g(engw):void");
    }

    @Deprecated
    public final void h(Object obj) {
        i(obj, 2);
    }

    public final void i(Object obj, int i) {
        eavo eavoVar;
        if (obj == null) {
            if (this.k != null) {
                this.k = null;
                m(i);
                return;
            }
            return;
        }
        eavo eavoVar2 = this.k;
        eave eaveVar = this.i;
        Object obj2 = this.g;
        String b = eaveVar.b(obj);
        synchronized (obj2) {
            eavoVar = (eavo) this.h.get(b);
        }
        emxf.b(eavoVar != null, "Selected account must be an available account");
        this.k = eavoVar;
        if (eavoVar.equals(eavoVar2)) {
            return;
        }
        m(i);
    }
}
