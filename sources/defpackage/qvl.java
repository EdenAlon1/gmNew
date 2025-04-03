package defpackage;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qvl {
    public final List a = new ArrayList();
    public final List b = new ArrayList();
    public qpz c;
    public Object d;
    public int e;
    public int f;
    public Class g;
    public qtu h;
    public Map i;
    public Class j;
    public boolean k;
    public boolean l;
    public qtp m;
    public qqe n;
    public qvx o;
    public boolean p;
    public boolean q;
    public qwc r;

    final qty a(Class cls) {
        qty qtyVar = (qty) this.i.get(cls);
        if (qtyVar == null) {
            Iterator it = this.i.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                if (((Class) entry.getKey()).isAssignableFrom(cls)) {
                    qtyVar = (qty) entry.getValue();
                    break;
                }
            }
        }
        if (qtyVar != null) {
            return qtyVar;
        }
        if (this.i.isEmpty() && this.p) {
            throw new IllegalArgumentException(a.F(cls, "Missing transformation for ", ". If you wish to ignore unknown resource types, use the optional transformation methods."));
        }
        return rck.b;
    }

    final qws b(Class cls) {
        qws qwsVar;
        Class cls2;
        Class cls3;
        Class cls4 = cls;
        qqk a = this.c.a();
        rhr rhrVar = a.g;
        AtomicReference atomicReference = rhrVar.c;
        Class cls5 = this.g;
        Class cls6 = this.j;
        qws qwsVar2 = null;
        rke rkeVar = (rke) atomicReference.getAndSet(null);
        if (rkeVar == null) {
            rkeVar = new rke();
        }
        rkeVar.a(cls, cls5, cls6);
        synchronized (rhrVar.b) {
            qwsVar = (qws) rhrVar.b.get(rkeVar);
        }
        rhrVar.c.set(rkeVar);
        rhr rhrVar2 = a.g;
        if (rhr.a.equals(qwsVar)) {
            return null;
        }
        if (qwsVar != null) {
            return qwsVar;
        }
        ArrayList arrayList = new ArrayList();
        for (Class cls7 : a.c.b(cls, cls5)) {
            for (Class cls8 : a.e.b(cls7, cls6)) {
                arrayList.add(new qvr(cls4, cls7, cls8, a.c.a(cls, cls7), a.e.a(cls7, cls8), a.h));
                cls4 = cls;
            }
            cls4 = cls;
        }
        if (arrayList.isEmpty()) {
            cls2 = cls5;
            cls3 = cls6;
        } else {
            cls2 = cls5;
            cls3 = cls6;
            qwsVar2 = new qws(cls, cls2, cls3, arrayList, a.h);
        }
        rhr rhrVar3 = a.g;
        synchronized (rhrVar3.b) {
            rhrVar3.b.put(new rke(cls, cls2, cls3), qwsVar2 != null ? qwsVar2 : rhr.a);
        }
        return qwsVar2;
    }

    final qxd c() {
        return this.c.b;
    }

    final qxv d() {
        return this.r.a();
    }

    final List e() {
        if (!this.l) {
            this.l = true;
            this.b.clear();
            List f = f();
            int size = f.size();
            for (int i = 0; i < size; i++) {
                ran ranVar = (ran) f.get(i);
                if (!this.b.contains(ranVar.a)) {
                    this.b.add(ranVar.a);
                }
                for (int i2 = 0; i2 < ranVar.b.size(); i2++) {
                    if (!this.b.contains(ranVar.b.get(i2))) {
                        this.b.add((qtp) ranVar.b.get(i2));
                    }
                }
            }
        }
        return this.b;
    }

    final List f() {
        if (!this.k) {
            this.k = true;
            this.a.clear();
            List c = this.c.a().c(this.d);
            int size = c.size();
            for (int i = 0; i < size; i++) {
                ran a = ((rao) c.get(i)).a(this.d, this.e, this.f, this.h);
                if (a != null) {
                    this.a.add(a);
                }
            }
        }
        return this.a;
    }

    final List g(File file) {
        return this.c.a().c(file);
    }

    final boolean h(Class cls) {
        return b(cls) != null;
    }
}
