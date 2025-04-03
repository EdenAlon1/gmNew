package defpackage;

import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fw extends lml {
    public static final lms a = new fv();
    public final boolean e;
    public final HashMap b = new HashMap();
    public final HashMap c = new HashMap();
    public final HashMap d = new HashMap();
    public boolean f = false;
    public boolean g = false;

    public fw(boolean z) {
        this.e = z;
    }

    private final void k(String str, boolean z) {
        fw fwVar = (fw) this.c.get(str);
        if (fwVar != null) {
            if (z) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(fwVar.c.keySet());
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    fwVar.c((String) arrayList.get(i), true);
                }
            }
            fwVar.fD();
            this.c.remove(str);
        }
        lmx lmxVar = (lmx) this.d.get(str);
        if (lmxVar != null) {
            lmxVar.c();
            this.d.remove(str);
        }
    }

    final void a(ea eaVar) {
        if (this.g) {
            if (fr.af(2)) {
                Log.v("FragmentManager", "Ignoring addRetainedFragment as the state is already saved");
            }
        } else {
            if (this.b.containsKey(eaVar.l)) {
                return;
            }
            this.b.put(eaVar.l, eaVar);
            if (fr.af(2)) {
                Objects.toString(eaVar);
                Log.v("FragmentManager", "Updating retained Fragments: Added ".concat(String.valueOf(eaVar)));
            }
        }
    }

    final void b(ea eaVar, boolean z) {
        if (fr.af(3)) {
            Objects.toString(eaVar);
            Log.d("FragmentManager", "Clearing non-config state for ".concat(String.valueOf(eaVar)));
        }
        k(eaVar.l, z);
    }

    final void c(String str, boolean z) {
        if (fr.af(3)) {
            Log.d("FragmentManager", "Clearing non-config state for saved state of Fragment ".concat(String.valueOf(str)));
        }
        k(str, z);
    }

    final void e(ea eaVar) {
        if (this.g) {
            if (fr.af(2)) {
                Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
            }
        } else {
            if (this.b.remove(eaVar.l) == null || !fr.af(2)) {
                return;
            }
            Objects.toString(eaVar);
            Log.v("FragmentManager", "Updating retained Fragments: Removed ".concat(String.valueOf(eaVar)));
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            fw fwVar = (fw) obj;
            if (this.b.equals(fwVar.b) && this.c.equals(fwVar.c) && this.d.equals(fwVar.d)) {
                return true;
            }
        }
        return false;
    }

    final boolean f(ea eaVar) {
        if (this.b.containsKey(eaVar.l) && this.e) {
            return this.f;
        }
        return true;
    }

    @Override // defpackage.lml
    protected final void fD() {
        if (fr.af(3)) {
            toString();
            Log.d("FragmentManager", "onCleared called for ".concat(toString()));
        }
        this.f = true;
    }

    public final int hashCode() {
        return (((this.b.hashCode() * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator it = this.b.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator it2 = this.c.keySet().iterator();
        while (it2.hasNext()) {
            sb.append((String) it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator it3 = this.d.keySet().iterator();
        while (it3.hasNext()) {
            sb.append((String) it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
