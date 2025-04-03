package defpackage;

import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fo implements fm {
    final /* synthetic */ fr a;

    public fo(fr frVar) {
        this.a = frVar;
    }

    @Override // defpackage.fm
    public final boolean h(ArrayList arrayList, ArrayList arrayList2) {
        ArrayList arrayList3;
        ArrayList arrayList4;
        boolean al;
        int i;
        fr frVar = this.a;
        if (fr.af(2)) {
            ArrayList arrayList5 = frVar.a;
            Objects.toString(arrayList5);
            Log.v("FragmentManager", "FragmentManager has the following pending actions inside of prepareBackStackState: ".concat(arrayList5.toString()));
        }
        int i2 = 0;
        if (frVar.c.isEmpty()) {
            Log.i("FragmentManager", "Ignoring call to start back stack pop because the back stack is empty.");
            arrayList3 = arrayList;
            arrayList4 = arrayList2;
            al = false;
        } else {
            frVar.f = (cg) frVar.c.get(r1.size() - 1);
            ArrayList arrayList6 = frVar.f.e;
            int size = arrayList6.size();
            for (int i3 = 0; i3 < size; i3++) {
                ea eaVar = ((gf) arrayList6.get(i3)).b;
                if (eaVar != null) {
                    eaVar.t = true;
                }
            }
            arrayList3 = arrayList;
            arrayList4 = arrayList2;
            al = frVar.al(arrayList3, arrayList4, null, -1, 0);
        }
        if (!this.a.k.isEmpty() && arrayList3.size() > 0) {
            boolean booleanValue = ((Boolean) arrayList4.get(arrayList3.size() - 1)).booleanValue();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int size2 = arrayList3.size();
            for (int i4 = 0; i4 < size2; i4++) {
                linkedHashSet.addAll(fr.ao((cg) arrayList3.get(i4)));
            }
            ArrayList arrayList7 = this.a.k;
            int size3 = arrayList7.size();
            while (i2 < size3) {
                fl flVar = (fl) arrayList7.get(i2);
                Iterator it = linkedHashSet.iterator();
                while (true) {
                    i = i2 + 1;
                    if (it.hasNext()) {
                        flVar.c((ea) it.next(), booleanValue);
                    }
                }
                i2 = i;
            }
        }
        return al;
    }
}
