package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bgs {
    private final List a = new ArrayList();

    private static void c(List list, int i, int[] iArr, int i2) {
        if (i2 >= iArr.length) {
            list.add((int[]) iArr.clone());
            return;
        }
        for (int i3 = 0; i3 < i; i3++) {
            int i4 = 0;
            while (true) {
                if (i4 >= i2) {
                    iArr[i2] = i3;
                    c(list, i, iArr, i2 + 1);
                    break;
                } else if (i3 == iArr[i4]) {
                    break;
                } else {
                    i4++;
                }
            }
        }
    }

    public final List a(List list) {
        if (list.isEmpty()) {
            return new ArrayList();
        }
        if (list.size() != this.a.size()) {
            return null;
        }
        int size = this.a.size();
        ArrayList<int[]> arrayList = new ArrayList();
        c(arrayList, size, new int[size], 0);
        bgu[] bguVarArr = new bgu[list.size()];
        for (int[] iArr : arrayList) {
            boolean z = true;
            for (int i = 0; i < this.a.size(); i++) {
                if (iArr[i] < list.size()) {
                    bgu bguVar = (bgu) this.a.get(i);
                    bgu bguVar2 = (bgu) list.get(iArr[i]);
                    z &= bguVar2.b().i <= bguVar.b().i && bguVar2.c() == bguVar.c();
                    if (!z) {
                        break;
                    }
                    bguVarArr[iArr[i]] = (bgu) this.a.get(i);
                }
            }
            if (z) {
                return Arrays.asList(bguVarArr);
            }
        }
        return null;
    }

    public final void b(bgu bguVar) {
        this.a.add(bguVar);
    }
}
