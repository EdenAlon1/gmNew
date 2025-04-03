package defpackage;

import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class opq extends ord implements oqs {
    public final oqf b;
    public final opp c;
    public final opo d;
    public oqo e;
    public final oqt a = new oqt();
    private final List f = new ArrayList(1);

    public opq(oqf oqfVar) {
        ksw.a(true);
        ksw.a(true);
        ksw.a(true);
        ksw.a(true);
        ksw.a(true);
        this.b = oqfVar;
        this.c = new opp(this);
        this.d = new opo(this);
    }

    @Override // defpackage.ord
    public final void a(orc orcVar) {
        ksw.a(orcVar != null);
        this.f.add(orcVar);
    }

    public final void b() {
        Iterator it = this.a.b.iterator();
        while (it.hasNext()) {
            d(it.next(), false);
        }
        this.a.b();
    }

    public final void c() {
        this.e = null;
        b();
    }

    public final void d(Object obj, boolean z) {
        ksw.a(obj != null);
        int size = this.f.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            } else {
                ((orc) this.f.get(size)).a(obj, z);
            }
        }
    }

    public final void e() {
        int size = this.f.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
        }
    }

    final void f() {
        if (this.a.d()) {
            Log.d("DefaultSelectionTracker", "Ignoring onDataSetChange. No active selection.");
            return;
        }
        this.a.b();
        for (int size = this.f.size() - 1; size >= 0; size--) {
        }
        Iterator it = this.a.iterator();
        ArrayList arrayList = null;
        while (it.hasNext()) {
            Object next = it.next();
            if (this.b.a(next) != -1) {
                for (int size2 = this.f.size() - 1; size2 >= 0; size2--) {
                    ((orc) this.f.get(size2)).a(next, true);
                }
            } else {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(next);
            }
        }
        if (arrayList != null) {
            int size3 = arrayList.size();
            for (int i = 0; i < size3; i++) {
                m(arrayList.get(i));
            }
        }
        e();
    }

    @Override // defpackage.oqs
    public final void g() {
        h();
        this.e = null;
    }

    @Override // defpackage.ord
    public final boolean h() {
        if (!i()) {
            return false;
        }
        b();
        if (i()) {
            this.e = null;
            oqt oqtVar = new oqt();
            if (i()) {
                oqt oqtVar2 = this.a;
                oqtVar.a.clear();
                oqtVar.a.addAll(oqtVar2.a);
                oqtVar.b.clear();
                oqtVar.b.addAll(oqtVar2.b);
                this.a.a.clear();
            }
            Iterator it = oqtVar.a.iterator();
            while (it.hasNext()) {
                d(it.next(), false);
            }
            Iterator it2 = oqtVar.b.iterator();
            while (it2.hasNext()) {
                d(it2.next(), false);
            }
            e();
        }
        Iterator it3 = this.f.iterator();
        while (it3.hasNext()) {
            ((orc) it3.next()).b();
        }
        return true;
    }

    @Override // defpackage.ord
    public final boolean i() {
        return !this.a.d();
    }

    @Override // defpackage.ord
    public final boolean j() {
        return this.e != null;
    }

    @Override // defpackage.oqs
    public final boolean k() {
        return i() || j();
    }

    @Override // defpackage.ord
    public final boolean l(Object obj) {
        return this.a.c(obj);
    }

    @Override // defpackage.ord
    public final void m(Object obj) {
        ksw.a(obj != null);
        if (this.a.c(obj)) {
            this.a.a.remove(obj);
            d(obj, false);
            e();
            if (this.a.d() && j()) {
                c();
            }
        }
    }
}
