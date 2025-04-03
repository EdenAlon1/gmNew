package defpackage;

import android.util.Log;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dvxe {
    public static final dvxl a = new dvxl() { // from class: dvwx
        @Override // defpackage.dvxl
        public final void a(dvxe dvxeVar) {
            dvxeVar.b();
        }
    };
    public static final dvxl b = new dvxl() { // from class: dvwy
        @Override // defpackage.dvxl
        public final void a(dvxe dvxeVar) {
            dvxeVar.c();
        }
    };
    public final dvxq c;
    public final dvxl d;
    public final dvzc e;
    public dvzb f;
    public int g = -1;

    public dvxe(dvxq dvxqVar, dvxl dvxlVar, dvzc dvzcVar) {
        this.c = dvxqVar;
        this.d = dvxlVar;
        this.e = dvzcVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final dvxr a() {
        return (dvxr) this.c.build();
    }

    final void b() {
        boolean o = this.f.o();
        if (o) {
            this.e.c(this);
        }
        this.c.clear();
        if (o) {
            this.e.b(this);
        }
    }

    final void c() {
        this.f.g();
        emxf.l(!this.f.o());
        this.f = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    final void d(dvxe dvxeVar) {
        emxf.l(dvxeVar.f == null);
        emxf.l(!e());
        emxf.l(this.d == dvxeVar.d);
        boolean o = this.f.o();
        if (o) {
            this.e.c(this);
        }
        this.c.clear();
        this.c.mergeFrom((dvxq) dvxeVar.c.build());
        if (o) {
            this.e.b(this);
        }
    }

    public final boolean e() {
        erhk erhkVar = ((dvxr) this.c.instance).d;
        if (erhkVar == null) {
            erhkVar = erhk.a;
        }
        return (erhkVar.b & 8) != 0;
    }

    public final boolean f() {
        erhk erhkVar = ((dvxr) this.c.instance).d;
        if (erhkVar == null) {
            erhkVar = erhk.a;
        }
        return (erhkVar.b & 2048) != 0;
    }

    public final void g() {
        dvzc dvzcVar = this.e;
        if (!dvzcVar.a.isEmpty()) {
            if (Log.isLoggable("GIL", 2)) {
                Log.v("GIL", "ImpressionCleared: ".concat(toString()));
            }
            Iterator it = dvzcVar.a.iterator();
            while (it.hasNext()) {
                ((dvyz) it.next()).a(this);
            }
        }
        dvxq dvxqVar = this.c;
        erhk erhkVar = ((dvxr) dvxqVar.instance).d;
        if (erhkVar == null) {
            erhkVar = erhk.a;
        }
        erhj erhjVar = (erhj) erhkVar.toBuilder();
        erhjVar.copyOnWrite();
        erhk erhkVar2 = (erhk) erhjVar.instance;
        erhkVar2.e = null;
        erhkVar2.b &= -2049;
        erhjVar.copyOnWrite();
        erhk erhkVar3 = (erhk) erhjVar.instance;
        erhkVar3.b &= -2;
        erhkVar3.c = -1;
        erhk erhkVar4 = (erhk) erhjVar.build();
        dvxqVar.copyOnWrite();
        dvxr dvxrVar = (dvxr) dvxqVar.instance;
        erhkVar4.getClass();
        dvxrVar.d = erhkVar4;
        dvxrVar.b |= 1;
    }

    public final int h() {
        return this.f.t();
    }

    public final void i(int i) {
        if (i != 1) {
            i = 2;
        }
        emxf.b(true, "Repressed visibility is not yet supported.");
        this.f.u(i);
    }

    public final String toString() {
        dvzb dvzbVar = this.f;
        String concat = dvzbVar != null ? ".".concat(String.valueOf(dvzbVar.getClass().getSimpleName())) : "";
        erhk erhkVar = ((dvxr) this.c.instance).d;
        if (erhkVar == null) {
            erhkVar = erhk.a;
        }
        return "CVE" + concat + "#" + erhkVar.d + " [" + Integer.toHexString(hashCode()) + "]";
    }
}
