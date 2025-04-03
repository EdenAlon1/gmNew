package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dwcl implements dvzb {
    private final dvxe a;
    private final dvzc b;
    private dvxe c;
    private List d;
    private boolean e = false;
    private int f = 1;

    public dwcl(dvxe dvxeVar) {
        this.a = dvxeVar;
        this.b = dvxeVar.e;
    }

    private final void a(dvxe dvxeVar) {
        dvzb dvzbVar = dvxeVar.f;
        if (this.e) {
            emxf.a(dvzbVar.o());
            dvzbVar.i();
        }
        dvzbVar.f();
    }

    @Override // defpackage.dvzb
    public final /* synthetic */ Object d() {
        return this.c;
    }

    @Override // defpackage.dvzb
    public final /* bridge */ /* synthetic */ void e(Object obj) {
        if (this.d == null) {
            this.d = new ArrayList();
        }
        dvzb dvzbVar = ((dvxe) obj).f;
        dvzbVar.k(this.a);
        emxf.a(this.d.add(obj));
        if (this.e) {
            dvzbVar.h();
        }
    }

    @Override // defpackage.dvzb
    public final void f() {
        emxf.p(this.c != null, "No parent override to unset: %s", this.a);
        this.c = null;
    }

    @Override // defpackage.dvzb
    public final void g() {
        List list = this.d;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                a((dvxe) it.next());
            }
            this.d.clear();
            this.d = null;
        }
        dvxe dvxeVar = this.c;
        if (dvxeVar != null) {
            dvxeVar.f.j(this.a);
        }
    }

    @Override // defpackage.dvzb
    public final void h() {
        emxf.l(!this.e);
        this.e = true;
        this.b.b(this.a);
        List list = this.d;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((dvxe) it.next()).f.h();
            }
        }
    }

    @Override // defpackage.dvzb
    public final void i() {
        emxf.l(this.e);
        this.e = false;
        List list = this.d;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((dvxe) it.next()).f.i();
            }
        }
        this.b.c(this.a);
    }

    @Override // defpackage.dvzb
    public final /* bridge */ /* synthetic */ void j(Object obj) {
        emxf.a(this.d.remove(obj));
        a((dvxe) obj);
    }

    @Override // defpackage.dvzb
    public final /* bridge */ /* synthetic */ void k(Object obj) {
        obj.getClass();
        emxf.p(this.c == null, "Already has a parent override: %s", this.a);
        this.c = (dvxe) obj;
    }

    @Override // defpackage.dvzb
    public final void l() {
        int b = epnz.b(this.a.a().e);
        if (b == 0) {
            b = 1;
        }
        this.f = b;
    }

    @Override // defpackage.dvzb
    public final void n(dvza dvzaVar) {
        List list = this.d;
        if (list == null) {
            return;
        }
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            } else {
                dvzaVar.b((dvxe) this.d.get(size));
            }
        }
    }

    @Override // defpackage.dvzb
    public final boolean o() {
        return this.e;
    }

    @Override // defpackage.dvzb
    public final boolean p() {
        return this.c == null;
    }

    @Override // defpackage.dvzb
    public final int t() {
        return this.f;
    }

    @Override // defpackage.dvzb
    public final void u(int i) {
        int i2 = this.f;
        this.f = i;
        if (!this.e || i2 == i) {
            return;
        }
        this.b.f(this.a, i2, i);
    }
}
