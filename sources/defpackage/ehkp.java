package defpackage;

import android.content.Context;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.MenuItem;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehkp implements oq {
    public ehkm a;
    public boolean b = false;
    public int c;

    @Override // defpackage.oq
    public final int a() {
        return this.c;
    }

    @Override // defpackage.oq
    public final void c(Context context, od odVar) {
        this.a.a(odVar);
    }

    @Override // defpackage.oq
    public final Parcelable dF() {
        ehko ehkoVar = new ehko();
        ehkm ehkmVar = this.a;
        ehkoVar.a = ehkmVar.f;
        SparseArray sparseArray = ehkmVar.q;
        ehik ehikVar = new ehik();
        for (int i = 0; i < sparseArray.size(); i++) {
            int keyAt = sparseArray.keyAt(i);
            ehab ehabVar = (ehab) sparseArray.valueAt(i);
            ehikVar.put(keyAt, ehabVar != null ? ehabVar.b.a : null);
        }
        ehkoVar.b = ehikVar;
        return ehkoVar;
    }

    @Override // defpackage.oq
    public final void e(op opVar) {
        throw null;
    }

    @Override // defpackage.oq
    public final void f(boolean z) {
        ehkj ehkjVar;
        int i;
        paz pazVar;
        if (this.b) {
            return;
        }
        if (z) {
            this.a.e();
            return;
        }
        ehkm ehkmVar = this.a;
        ehkj ehkjVar2 = ehkmVar.G;
        if (ehkjVar2 == null || ehkmVar.e == null) {
            return;
        }
        ehkmVar.F.b = true;
        ehkjVar2.c();
        ehkmVar.F.b = false;
        if (ehkmVar.e != null && (ehkjVar = ehkmVar.G) != null && ehkjVar.a() == ehkmVar.e.length) {
            for (0; i < ehkmVar.e.length; i + 1) {
                if (!(ehkmVar.G.b(i) instanceof ehkb) || (ehkmVar.e[i] instanceof ehkc)) {
                    i = ((ehkmVar.G.b(i) instanceof ehkb) || !((ehkmVar.G.b(i).hasSubMenu() && !(ehkmVar.e[i] instanceof ehkq)) || ((ehkmVar.G.b(i).hasSubMenu() || (ehkmVar.e[i] instanceof ehkh)) ? false : true))) ? i + 1 : 0;
                }
            }
            int i2 = ehkmVar.f;
            int a = ehkmVar.G.a();
            for (int i3 = 0; i3 < a; i3++) {
                MenuItem b = ehkmVar.G.b(i3);
                if (b.isChecked()) {
                    ehkmVar.f(b);
                    ehkmVar.f = b.getItemId();
                    ehkmVar.g = i3;
                }
            }
            if (i2 != ehkmVar.f && (pazVar = ehkmVar.b) != null) {
                pav.b(ehkmVar, pazVar);
            }
            boolean h = ehkmVar.h(ehkmVar.c, ehkmVar.c());
            for (int i4 = 0; i4 < a; i4++) {
                ehkmVar.F.b = true;
                ehkmVar.e[i4].c();
                ehkk ehkkVar = ehkmVar.e[i4];
                if (ehkkVar instanceof ehkh) {
                    ehkh ehkhVar = (ehkh) ehkkVar;
                    ehkhVar.E(ehkmVar.c);
                    ehkhVar.y(ehkmVar.d);
                    ehkhVar.x(ehkmVar.C);
                    ehkhVar.G(h);
                }
                if (ehkmVar.G.b(i4) instanceof og) {
                    ehkmVar.e[i4].f((og) ehkmVar.G.b(i4));
                }
                ehkmVar.F.b = false;
            }
            return;
        }
        ehkmVar.e();
    }

    @Override // defpackage.oq
    public final boolean g() {
        return false;
    }

    @Override // defpackage.oq
    public final boolean h(oy oyVar) {
        return false;
    }

    @Override // defpackage.oq
    public final boolean i(og ogVar) {
        return false;
    }

    @Override // defpackage.oq
    public final boolean j(og ogVar) {
        return false;
    }

    @Override // defpackage.oq
    public final void n(Parcelable parcelable) {
        if (parcelable instanceof ehko) {
            ehkm ehkmVar = this.a;
            ehko ehkoVar = (ehko) parcelable;
            int i = ehkoVar.a;
            int a = ehkmVar.G.a();
            int i2 = 0;
            while (true) {
                if (i2 >= a) {
                    break;
                }
                MenuItem b = ehkmVar.G.b(i2);
                if (i == b.getItemId()) {
                    ehkmVar.f = i;
                    ehkmVar.g = i2;
                    ehkmVar.f(b);
                    break;
                }
                i2++;
            }
            Context context = this.a.getContext();
            ehik ehikVar = ehkoVar.b;
            SparseArray sparseArray = new SparseArray(ehikVar.size());
            for (int i3 = 0; i3 < ehikVar.size(); i3++) {
                int keyAt = ehikVar.keyAt(i3);
                ehad ehadVar = (ehad) ehikVar.valueAt(i3);
                sparseArray.put(keyAt, ehadVar != null ? new ehab(context, ehadVar) : null);
            }
            ehkm ehkmVar2 = this.a;
            for (int i4 = 0; i4 < sparseArray.size(); i4++) {
                int keyAt2 = sparseArray.keyAt(i4);
                if (ehkmVar2.q.indexOfKey(keyAt2) < 0) {
                    ehkmVar2.q.append(keyAt2, (ehab) sparseArray.get(keyAt2));
                }
            }
            ehkk[] ehkkVarArr = ehkmVar2.e;
            if (ehkkVarArr != null) {
                for (ehkk ehkkVar : ehkkVarArr) {
                    if (ehkkVar instanceof ehkh) {
                        ehkh ehkhVar = (ehkh) ehkkVar;
                        ehab ehabVar = (ehab) ehkmVar2.q.get(ehkhVar.getId());
                        if (ehabVar != null) {
                            ehkhVar.p(ehabVar);
                        }
                    }
                }
            }
        }
    }

    @Override // defpackage.oq
    public final void d(od odVar, boolean z) {
    }
}
