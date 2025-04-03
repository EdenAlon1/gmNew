package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class faed {
    public static void a(faeb faebVar, faec faecVar) {
        if (faebVar != null) {
            faebVar.hK(faecVar);
        } else {
            faecVar.a(0L);
        }
    }

    public static void b(final List list, final long[] jArr, final fads fadsVar, final int i) {
        faec faecVar = new faec() { // from class: faea
            @Override // defpackage.faec
            public final void a(long j) {
                long[] jArr2 = jArr;
                int i2 = i;
                jArr2[i2] = j;
                List list2 = list;
                int size = list2.size() - 1;
                fads fadsVar2 = fadsVar;
                if (i2 == size) {
                    fadsVar2.a(jArr2);
                } else {
                    faed.b(list2, jArr2, fadsVar2, i2 + 1);
                }
            }
        };
        faeb faebVar = (faeb) list.get(i);
        if (faebVar != null) {
            faebVar.hK(faecVar);
        } else {
            faecVar.a(0L);
        }
    }
}
