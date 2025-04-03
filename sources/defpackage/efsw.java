package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efsw extends fy {
    public final List a;
    public final efmg b;
    private final Integer c;
    private enhk d;

    public efsw(fr frVar, faje fajeVar, Integer num, boolean z, boolean z2, efmg efmgVar, int i) {
        super(frVar);
        ArrayList arrayList = new ArrayList(fajeVar.g.size());
        for (fajr fajrVar : fajeVar.g) {
            int a = fajq.a(fajrVar.i);
            int i2 = (a == 0 ? 1 : a) - 2;
            if (i2 == 1) {
                arrayList.add(new efrr(fajrVar));
            } else if (i2 == 2) {
                arrayList.add(new efpg(fajrVar));
            } else if (i2 == 3) {
                arrayList.add(new efqw(fajrVar));
            } else if (i2 == 4) {
                arrayList.add(new efpu(fajrVar));
            }
        }
        efpb efpbVar = efor.c;
        if (!efor.c(fdvv.b(efor.b))) {
            fahq fahqVar = fajeVar.d;
            arrayList.add(new eftb(fahqVar == null ? fahq.b : fahqVar));
        } else if (efmgVar == efmg.CARD) {
            fahq fahqVar2 = fajeVar.d;
            arrayList.add(new eftb(fahqVar2 == null ? fahq.b : fahqVar2));
        }
        this.a = arrayList;
        int i3 = 0;
        if (z && !arrayList.isEmpty()) {
            arrayList.remove(0);
            i--;
        }
        if (efor.a() && i > 0) {
            arrayList.subList(0, i).clear();
        }
        if (z2 && !arrayList.isEmpty()) {
            arrayList.subList(0, arrayList.size() - 1).clear();
        }
        enhd enhdVar = new enhd();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            int i4 = ((efsk) it.next()).b;
            if (i4 == 0) {
                throw null;
            }
            if (i4 != 5) {
                enhdVar.k(Integer.valueOf(r9.a.e - 1), Integer.valueOf(i3));
                i3++;
            }
        }
        this.d = enhdVar.c();
        if (this.a.isEmpty()) {
            throw new NullPointerException("Questions were missing!");
        }
        this.c = num;
        this.b = efmgVar;
    }

    public static int m(ea eaVar) {
        Bundle bundle = eaVar.m;
        if (bundle != null) {
            return bundle.getInt("QuestionIndex", -1);
        }
        return -1;
    }

    @Override // defpackage.fy
    public final ea b(int i) {
        ea a = ((efsk) this.a.get(i)).a(this.c, i);
        a.m.putInt("QuestionIndex", i);
        return a;
    }

    @Override // defpackage.pco
    public final int j() {
        return this.a.size();
    }

    public final int n(int i) {
        return ((Integer) this.d.get(Integer.valueOf(i))).intValue();
    }

    public final fajr o(int i) {
        return ((efsk) this.a.get(i)).a;
    }
}
