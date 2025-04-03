package defpackage;

import android.support.v7.widget.RecyclerView;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public class we {
    public final SparseArray a = new SparseArray();
    public int b = 0;
    final Set c = Collections.newSetFromMap(new IdentityHashMap());

    static final long g(long j, long j2) {
        return j == 0 ? j2 : ((j / 4) * 3) + (j2 / 4);
    }

    public final wd a(int i) {
        wd wdVar = (wd) this.a.get(i);
        if (wdVar != null) {
            return wdVar;
        }
        wd wdVar2 = new wd();
        this.a.put(i, wdVar2);
        return wdVar2;
    }

    public wr b(int i) {
        wd wdVar = (wd) this.a.get(i);
        if (wdVar == null || wdVar.a.isEmpty()) {
            return null;
        }
        ArrayList arrayList = wdVar.a;
        int size = arrayList.size();
        do {
            size--;
            if (size < 0) {
                return null;
            }
        } while (((wr) arrayList.get(size)).r());
        return (wr) arrayList.remove(size);
    }

    public final void c() {
        this.b++;
    }

    public final void d() {
        this.b--;
    }

    public void e(wr wrVar) {
        int i = wrVar.f;
        ArrayList arrayList = a(i).a;
        if (((wd) this.a.get(i)).b <= arrayList.size()) {
            kzq.b(wrVar.a);
            return;
        }
        int i2 = RecyclerView.ab;
        wrVar.l();
        arrayList.add(wrVar);
    }

    public final void f(int i, int i2) {
        wd a = a(i);
        a.b = i2;
        ArrayList arrayList = a.a;
        while (arrayList.size() > i2) {
            arrayList.remove(arrayList.size() - 1);
        }
    }
}
