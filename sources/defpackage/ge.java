package defpackage;

import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ge {
    public final ArrayList a = new ArrayList();
    public final HashMap b = new HashMap();
    public final HashMap c = new HashMap();
    public fw d;

    final Bundle a(String str, Bundle bundle) {
        return bundle != null ? (Bundle) this.c.put(str, bundle) : (Bundle) this.c.remove(str);
    }

    final ea b(String str) {
        gc gcVar = (gc) this.b.get(str);
        if (gcVar != null) {
            return gcVar.a;
        }
        return null;
    }

    final ea c(String str) {
        for (gc gcVar : this.b.values()) {
            if (gcVar != null) {
                ea eaVar = gcVar.a;
                if (!str.equals(eaVar.l)) {
                    eaVar = eaVar.D.b.c(str);
                }
                if (eaVar != null) {
                    return eaVar;
                }
            }
        }
        return null;
    }

    final gc d(String str) {
        return (gc) this.b.get(str);
    }

    final List e() {
        ArrayList arrayList = new ArrayList();
        for (gc gcVar : this.b.values()) {
            if (gcVar != null) {
                arrayList.add(gcVar);
            }
        }
        return arrayList;
    }

    final List f() {
        ArrayList arrayList = new ArrayList();
        for (gc gcVar : this.b.values()) {
            if (gcVar != null) {
                arrayList.add(gcVar.a);
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    final List g() {
        ArrayList arrayList;
        if (this.a.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        synchronized (this.a) {
            arrayList = new ArrayList(this.a);
        }
        return arrayList;
    }

    final void h(ea eaVar) {
        if (this.a.contains(eaVar)) {
            Objects.toString(eaVar);
            throw new IllegalStateException("Fragment already added: ".concat(String.valueOf(eaVar)));
        }
        synchronized (this.a) {
            this.a.add(eaVar);
        }
        eaVar.r = true;
    }

    final void i() {
        this.b.values().removeAll(Collections.singleton(null));
    }

    final void j(gc gcVar) {
        ea eaVar = gcVar.a;
        if (m(eaVar.l)) {
            return;
        }
        this.b.put(eaVar.l, gcVar);
        if (eaVar.L) {
            if (eaVar.K) {
                this.d.a(eaVar);
            } else {
                this.d.e(eaVar);
            }
            eaVar.L = false;
        }
        if (fr.af(2)) {
            Objects.toString(eaVar);
            Log.v("FragmentManager", "Added fragment to active set ".concat(String.valueOf(eaVar)));
        }
    }

    final void k(gc gcVar) {
        ea eaVar = gcVar.a;
        if (eaVar.K) {
            this.d.e(eaVar);
        }
        if (this.b.get(eaVar.l) == gcVar && ((gc) this.b.put(eaVar.l, null)) != null && fr.af(2)) {
            Objects.toString(eaVar);
            Log.v("FragmentManager", "Removed fragment from active set ".concat(String.valueOf(eaVar)));
        }
    }

    final void l(ea eaVar) {
        synchronized (this.a) {
            this.a.remove(eaVar);
        }
        eaVar.r = false;
    }

    final boolean m(String str) {
        return this.b.get(str) != null;
    }
}
