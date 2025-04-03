package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class enya implements Iterable, Serializable, enzo {
    private static final long serialVersionUID = 1;
    public ArrayList a = new ArrayList();

    public static int a(List list, enxz enxzVar, int i) {
        int size = list.size() - 1;
        while (i <= size) {
            int i2 = (i + size) >> 1;
            int compareTo = ((enxz) list.get(i2)).compareTo(enxzVar);
            if (compareTo < 0) {
                i = i2 + 1;
            } else {
                if (compareTo <= 0) {
                    return i2;
                }
                size = i2 - 1;
            }
        }
        return i;
    }

    public final int b() {
        return this.a.size();
    }

    public final void c() {
        ArrayList arrayList = this.a;
        Collections.sort(arrayList);
        int i = 0;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            enxz enxzVar = (enxz) arrayList.get(i2);
            if (i <= 0 || !((enxz) arrayList.get(i - 1)).B(enxzVar)) {
                while (i > 0) {
                    int i3 = i - 1;
                    if (!enxzVar.B((enxz) arrayList.get(i3))) {
                        break;
                    } else {
                        i = i3;
                    }
                }
                while (i >= 3) {
                    int i4 = i - 3;
                    int i5 = i - 2;
                    int i6 = i - 1;
                    if (((((enxz) arrayList.get(i4)).d ^ ((enxz) arrayList.get(i5)).d) ^ ((enxz) arrayList.get(i6)).d) != enxzVar.d) {
                        break;
                    }
                    long l = enxzVar.l();
                    long j = l + l;
                    long j2 = enxzVar.d;
                    long j3 = ~(j + j + j);
                    long j4 = j2 & j3;
                    if ((((enxz) arrayList.get(i4)).d & j3) != j4 || (((enxz) arrayList.get(i5)).d & j3) != j4 || (j3 & ((enxz) arrayList.get(i6)).d) != j4 || enxzVar.E()) {
                        break;
                    }
                    i = i4;
                    enxzVar = new enxz(enxz.n(enxzVar.d));
                }
                arrayList.set(i, enxzVar);
                i++;
            }
        }
        int size = arrayList.size();
        while (i < size) {
            size--;
            arrayList.remove(size);
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof enya) {
            return this.a.equals(((enya) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        Iterator<enxz> it = iterator();
        int i = 17;
        while (it.hasNext()) {
            i = (i * 37) + it.next().hashCode();
        }
        return i;
    }

    @Override // java.lang.Iterable
    public final Iterator<enxz> iterator() {
        return this.a.iterator();
    }

    public final String toString() {
        return this.a.toString();
    }
}
