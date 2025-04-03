package defpackage;

import j$.util.DesugarCollections;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class qww implements qvk, quc {
    private final qvj a;
    private final qvl b;
    private int c;
    private int d = -1;
    private qtp e;
    private List f;
    private int g;
    private volatile ran h;
    private File i;
    private qwx j;

    public qww(qvl qvlVar, qvj qvjVar) {
        this.b = qvlVar;
        this.a = qvjVar;
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
        List list;
        List e = this.b.e();
        boolean z = false;
        if (e.isEmpty()) {
            return false;
        }
        qvl qvlVar = this.b;
        qqk a = qvlVar.c.a();
        Class<?> cls = qvlVar.d.getClass();
        Class cls2 = qvlVar.g;
        Class cls3 = qvlVar.j;
        rhs rhsVar = a.f;
        rke rkeVar = (rke) rhsVar.a.getAndSet(null);
        if (rkeVar == null) {
            rkeVar = new rke(cls, cls2, cls3);
        } else {
            rkeVar.a(cls, cls2, cls3);
        }
        synchronized (rhsVar.b) {
            list = (List) rhsVar.b.get(rkeVar);
        }
        rhsVar.a.set(rkeVar);
        if (list == null) {
            list = new ArrayList();
            Iterator it = a.a.a(cls).iterator();
            while (it.hasNext()) {
                for (Class cls4 : a.c.b((Class) it.next(), cls2)) {
                    if (!a.e.b(cls4, cls3).isEmpty() && !list.contains(cls4)) {
                        list.add(cls4);
                    }
                }
            }
            rhs rhsVar2 = a.f;
            List unmodifiableList = DesugarCollections.unmodifiableList(list);
            synchronized (rhsVar2.b) {
                rhsVar2.b.put(new rke(cls, cls2, cls3), unmodifiableList);
            }
        }
        if (list.isEmpty()) {
            if (File.class.equals(this.b.j)) {
                return false;
            }
            throw new IllegalStateException("Failed to find any load path from " + String.valueOf(this.b.d.getClass()) + " to " + String.valueOf(this.b.j));
        }
        while (true) {
            if (this.f != null && d()) {
                this.h = null;
                while (!z && d()) {
                    List list2 = this.f;
                    int i = this.g;
                    this.g = i + 1;
                    rao raoVar = (rao) list2.get(i);
                    File file = this.i;
                    qvl qvlVar2 = this.b;
                    this.h = raoVar.a(file, qvlVar2.e, qvlVar2.f, qvlVar2.h);
                    if (this.h != null && this.b.h(this.h.c.a())) {
                        this.h.c.g(this.b.n, this);
                        z = true;
                    }
                }
                return z;
            }
            int i2 = this.d + 1;
            this.d = i2;
            if (i2 >= list.size()) {
                int i3 = this.c + 1;
                this.c = i3;
                if (i3 >= e.size()) {
                    return false;
                }
                this.d = 0;
            }
            qtp qtpVar = (qtp) e.get(this.c);
            Class cls5 = (Class) list.get(this.d);
            qty a2 = this.b.a(cls5);
            qxd c = this.b.c();
            qvl qvlVar3 = this.b;
            this.j = new qwx(c, qtpVar, qvlVar3.m, qvlVar3.e, qvlVar3.f, a2, cls5, qvlVar3.h);
            File a3 = qvlVar3.d().a(this.j);
            this.i = a3;
            if (a3 != null) {
                this.e = qtpVar;
                this.f = this.b.g(a3);
                this.g = 0;
            }
        }
    }

    @Override // defpackage.quc
    public final void c(Object obj) {
        this.a.d(this.e, obj, this.h.c, qsy.RESOURCE_DISK_CACHE, this.j);
    }

    @Override // defpackage.quc
    public final void f(Exception exc) {
        this.a.c(this.j, exc, this.h.c, qsy.RESOURCE_DISK_CACHE);
    }
}
