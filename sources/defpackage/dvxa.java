package defpackage;

import android.util.Log;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class dvxa {
    private final erhj d;
    public dvxl b = dvxe.a;
    public dvxe c = null;
    public final dvxq a = (dvxq) dvxr.a.createBuilder();

    /* JADX WARN: Multi-variable type inference failed */
    protected dvxa(dvxd dvxdVar) {
        this.d = dvxdVar.a;
        a(((erhk) dvxdVar.a.instance).d);
    }

    private final void a(int i) {
        dvxq dvxqVar = this.a;
        long j = ((dvxr) dvxqVar.instance).g + i;
        dvxqVar.copyOnWrite();
        dvxr dvxrVar = (dvxr) dvxqVar.instance;
        dvxrVar.b |= 8;
        dvxrVar.g = j;
    }

    private final void b(int i) {
        dvxq dvxqVar = this.a;
        long j = ((dvxr) dvxqVar.instance).h + i;
        dvxqVar.copyOnWrite();
        dvxr dvxrVar = (dvxr) dvxqVar.instance;
        dvxrVar.b |= 16;
        dvxrVar.h = j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final dvxe e(dvzc dvzcVar) {
        emxf.m(this.c == null, "Cannot create CVE twice.");
        dvxq dvxqVar = this.a;
        dvxqVar.copyOnWrite();
        dvxr dvxrVar = (dvxr) dvxqVar.instance;
        erhk erhkVar = (erhk) this.d.build();
        dvxr dvxrVar2 = dvxr.a;
        erhkVar.getClass();
        dvxrVar.d = erhkVar;
        dvxrVar.b = 1 | dvxrVar.b;
        dvxe dvxeVar = new dvxe((dvxq) ((dvxr) this.a.build()).toBuilder(), this.b, dvzcVar);
        this.c = dvxeVar;
        dvzc dvzcVar2 = dvxeVar.e;
        if (!dvzcVar2.a.isEmpty()) {
            if (Log.isLoggable("GIL", 2)) {
                Log.v("GIL", "Instrumented: ".concat(String.valueOf(String.valueOf(dvxeVar))));
            }
            Iterator it = dvzcVar2.a.iterator();
            while (it.hasNext()) {
                ((dvyz) it.next()).e();
            }
        }
        return this.c;
    }

    public final void f(dvxb dvxbVar) {
        dvxe dvxeVar = this.c;
        emxf.p(dvxeVar == null, "CVE %s has already been built.", dvxeVar);
        erhk erhkVar = ((dvxr) this.a.instance).d;
        if (erhkVar == null) {
            erhkVar = erhk.a;
        }
        emxf.l(!((erhkVar.b & 2048) != 0));
        if (!this.a.d(dvxbVar.a)) {
            dvxq dvxqVar = this.a;
            int a = dvxbVar.a.a();
            dvxqVar.copyOnWrite();
            dvxr dvxrVar = (dvxr) dvxqVar.instance;
            eygi eygiVar = dvxrVar.c;
            if (!eygiVar.c()) {
                dvxrVar.c = eyfy.mutableCopy(eygiVar);
            }
            dvxrVar.c.h(a);
        }
        this.a.e(dvxbVar.a, dvxbVar.b);
        a(dvxbVar.a.a());
        a(dvxbVar.a.hashCode());
        a(dvxbVar.b.hashCode());
    }

    public final void g(dvxc dvxcVar) {
        dvxe dvxeVar = this.c;
        emxf.p(dvxeVar == null, "CVE %s has already been built.", dvxeVar);
        this.a.e(dvxcVar.a, dvxcVar.b);
        b(dvxcVar.a.a());
        b(dvxcVar.a.hashCode());
        b(dvxcVar.b.hashCode());
    }
}
