package defpackage;

import java.io.File;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class qvg implements qvk, quc {
    private final List a;
    private final qvl b;
    private final qvj c;
    private int d = -1;
    private qtp e;
    private List f;
    private int g;
    private volatile ran h;
    private File i;

    public qvg(List list, qvl qvlVar, qvj qvjVar) {
        this.a = list;
        this.b = qvlVar;
        this.c = qvjVar;
    }

    private final boolean d() {
        return this.g < this.f.size();
    }

    @Override // defpackage.qvk
    public final void a() {
        ran ranVar = this.h;
        if (ranVar != null) {
            ranVar.c.d();
        }
    }

    @Override // defpackage.qvk
    public final boolean b() {
        while (true) {
            boolean z = false;
            if (this.f != null && d()) {
                this.h = null;
                while (!z && d()) {
                    List list = this.f;
                    int i = this.g;
                    this.g = i + 1;
                    rao raoVar = (rao) list.get(i);
                    File file = this.i;
                    qvl qvlVar = this.b;
                    this.h = raoVar.a(file, qvlVar.e, qvlVar.f, qvlVar.h);
                    if (this.h != null && this.b.h(this.h.c.a())) {
                        this.h.c.g(this.b.n, this);
                        z = true;
                    }
                }
                return z;
            }
            int i2 = this.d + 1;
            this.d = i2;
            if (i2 >= this.a.size()) {
                return false;
            }
            qtp qtpVar = (qtp) this.a.get(this.d);
            qvl qvlVar2 = this.b;
            File a = qvlVar2.d().a(new qvh(qtpVar, qvlVar2.m));
            this.i = a;
            if (a != null) {
                this.e = qtpVar;
                this.f = this.b.g(a);
                this.g = 0;
            }
        }
    }

    @Override // defpackage.quc
    public final void c(Object obj) {
        this.c.d(this.e, obj, this.h.c, qsy.DATA_DISK_CACHE, this.e);
    }

    @Override // defpackage.quc
    public final void f(Exception exc) {
        this.c.c(this.e, exc, this.h.c, qsy.DATA_DISK_CACHE);
    }
}
