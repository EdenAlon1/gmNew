package defpackage;

import android.content.Context;
import androidx.work.impl.WorkDatabase;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pua {
    public final pyj a;
    public final Context b;
    public final String c;
    public final pod d;
    public final WorkDatabase e;
    public final pyk f;
    public final pwz g;
    public final String h;
    public final qbc i;
    public final ffuf j;
    private final pre k;
    private final pwt l;
    private final List m;

    public pua(ptp ptpVar) {
        pyj pyjVar = ptpVar.d;
        this.a = pyjVar;
        this.b = ptpVar.f;
        String str = pyjVar.c;
        this.c = str;
        this.k = ptpVar.g;
        this.i = ptpVar.h;
        this.d = ptpVar.a;
        this.l = ptpVar.b;
        WorkDatabase workDatabase = ptpVar.c;
        this.e = workDatabase;
        this.f = workDatabase.D();
        this.g = workDatabase.x();
        List list = ptpVar.e;
        this.m = list;
        this.h = "Work [ id=" + str + ", tags={ " + ffdx.aA(list, ",", null, null, null, 62) + " } ]";
        this.j = new ffuf(null);
    }

    public final pxs a() {
        return pzh.a(this.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.ffgu r21) {
        /*
            Method dump skipped, instructions count: 613
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pua.b(ffgu):java.lang.Object");
    }

    public final void c(int i) {
        this.f.m(pqp.ENQUEUED, this.c);
        this.f.h(this.c, System.currentTimeMillis());
        this.f.g(this.c, this.a.x);
        this.f.l(this.c, -1L);
        this.f.j(this.c, i);
    }

    public final void d() {
        this.f.h(this.c, System.currentTimeMillis());
        this.f.m(pqp.ENQUEUED, this.c);
        pyk pykVar = this.f;
        pzg pzgVar = (pzg) pykVar;
        pzgVar.a.m();
        oyf d = pzgVar.g.d();
        d.g(1, this.c);
        try {
            ((pzg) pykVar).a.n();
            try {
                d.a();
                ((pzg) pykVar).a.q();
                pzgVar.g.f(d);
                this.f.g(this.c, this.a.x);
                pykVar = this.f;
                String str = this.c;
                pzg pzgVar2 = (pzg) pykVar;
                pzgVar2.a.m();
                oyf d2 = pzgVar2.e.d();
                d2.g(1, str);
                try {
                    ((pzg) pykVar).a.n();
                    try {
                        d2.a();
                        ((pzg) pykVar).a.q();
                        pzgVar2.e.f(d2);
                        this.f.l(this.c, -1L);
                    } finally {
                    }
                } catch (Throwable th) {
                    pzgVar2.e.f(d2);
                    throw th;
                }
            } finally {
            }
        } catch (Throwable th2) {
            pzgVar.g.f(d);
            throw th2;
        }
    }

    public final void e(ppq ppqVar) {
        List i = ffdx.i(this.c);
        while (!i.isEmpty()) {
            String str = (String) ffdx.s(i);
            if (this.f.a(str) != pqp.CANCELLED) {
                this.f.m(pqp.FAILED, str);
            }
            i.addAll(this.g.a(str));
        }
        pot potVar = ((ppn) ppqVar).a;
        potVar.getClass();
        this.f.g(this.c, this.a.x);
        this.f.i(this.c, potVar);
    }
}
