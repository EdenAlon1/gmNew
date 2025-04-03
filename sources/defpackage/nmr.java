package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class nmr implements njw {
    private final List a;
    private final long[] b;
    private final long[] c;

    public nmr(List list) {
        this.a = DesugarCollections.unmodifiableList(new ArrayList(list));
        int size = list.size();
        this.b = new long[size + size];
        for (int i = 0; i < list.size(); i++) {
            nmh nmhVar = (nmh) list.get(i);
            long[] jArr = this.b;
            int i2 = i + i;
            jArr[i2] = nmhVar.b;
            jArr[i2 + 1] = nmhVar.c;
        }
        long[] jArr2 = this.b;
        long[] copyOf = Arrays.copyOf(jArr2, jArr2.length);
        this.c = copyOf;
        Arrays.sort(copyOf);
    }

    @Override // defpackage.njw
    public final int a() {
        return this.c.length;
    }

    @Override // defpackage.njw
    public final int b(long j) {
        long[] jArr = this.c;
        int aj = lvf.aj(jArr, j, false);
        if (aj < jArr.length) {
            return aj;
        }
        return -1;
    }

    @Override // defpackage.njw
    public final long c(int i) {
        lti.a(i >= 0);
        lti.a(i < this.c.length);
        return this.c[i];
    }

    @Override // defpackage.njw
    public final List e(long j) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < this.a.size(); i++) {
            long[] jArr = this.b;
            int i2 = i + i;
            if (jArr[i2] <= j && j < jArr[i2 + 1]) {
                nmh nmhVar = (nmh) this.a.get(i);
                lsz lszVar = nmhVar.a;
                if (lszVar.x == -3.4028235E38f) {
                    arrayList2.add(nmhVar);
                } else {
                    arrayList.add(lszVar);
                }
            }
        }
        Collections.sort(arrayList2, new Comparator() { // from class: nmq
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return Long.compare(((nmh) obj).b, ((nmh) obj2).b);
            }
        });
        for (int i3 = 0; i3 < arrayList2.size(); i3++) {
            lsy lsyVar = new lsy(((nmh) arrayList2.get(i3)).a);
            lsyVar.c((-1) - i3, 1);
            arrayList.add(lsyVar.a());
        }
        return arrayList;
    }
}
