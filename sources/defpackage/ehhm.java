package defpackage;

import android.view.View;
import com.google.android.material.chip.ChipGroup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehhm {
    public final Map a = new HashMap();
    public final Set b = new HashSet();
    public boolean c;
    public boolean d;
    public ehdi e;

    public final int a() {
        if (!this.c || this.b.isEmpty()) {
            return -1;
        }
        return ((Integer) this.b.iterator().next()).intValue();
    }

    public final Set b() {
        return new HashSet(this.b);
    }

    public final void c() {
        ehdi ehdiVar = this.e;
        if (ehdiVar != null) {
            b();
            ChipGroup chipGroup = ehdiVar.a;
            ehdj ehdjVar = chipGroup.b;
            if (ehdjVar != null) {
                Set b = chipGroup.a.b();
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < chipGroup.getChildCount(); i++) {
                    View childAt = chipGroup.getChildAt(i);
                    if ((childAt instanceof ehib) && b.contains(Integer.valueOf(childAt.getId()))) {
                        arrayList.add(Integer.valueOf(childAt.getId()));
                    }
                }
                ChipGroup chipGroup2 = ehdjVar.a;
                if (chipGroup2.a.c) {
                    ahkj ahkjVar = ehdjVar.b;
                    chipGroup2.a();
                    iv ivVar = ahkjVar.b;
                    ekzm b2 = ahkjVar.a.i.b("SuperSortRecategorizer#ChipGroup#labelSelected");
                    try {
                        ivVar.b(-1).setEnabled(true);
                        b2.close();
                    } catch (Throwable th) {
                        try {
                            b2.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
            }
        }
    }

    public final boolean d(ehib ehibVar) {
        Integer valueOf = Integer.valueOf(ehibVar.getId());
        if (this.b.contains(valueOf)) {
            return false;
        }
        ehib ehibVar2 = (ehib) this.a.get(Integer.valueOf(a()));
        if (ehibVar2 != null) {
            e(ehibVar2, false);
        }
        boolean add = this.b.add(valueOf);
        if (!ehibVar.isChecked()) {
            ehibVar.setChecked(true);
        }
        return add;
    }

    public final boolean e(ehib ehibVar, boolean z) {
        Integer valueOf = Integer.valueOf(ehibVar.getId());
        if (!this.b.contains(valueOf)) {
            return false;
        }
        if (z && this.b.size() == 1 && this.b.contains(valueOf)) {
            ehibVar.setChecked(true);
            return false;
        }
        boolean remove = this.b.remove(valueOf);
        if (ehibVar.isChecked()) {
            ehibVar.setChecked(false);
        }
        return remove;
    }
}
