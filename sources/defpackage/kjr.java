package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
final class kjr {
    public static int a;
    kjv b;
    final ArrayList c = new ArrayList();

    public kjr(kjv kjvVar) {
        this.b = null;
        a++;
        this.b = kjvVar;
    }

    public final long a(kjk kjkVar, long j) {
        kjv kjvVar = kjkVar.d;
        if (kjvVar instanceof kjp) {
            return j;
        }
        int size = kjkVar.j.size();
        long j2 = j;
        for (int i = 0; i < size; i++) {
            kji kjiVar = (kji) kjkVar.j.get(i);
            if (kjiVar instanceof kjk) {
                kjk kjkVar2 = (kjk) kjiVar;
                if (kjkVar2.d != kjvVar) {
                    j2 = Math.min(j2, a(kjkVar2, kjkVar2.e + j));
                }
            }
        }
        if (kjkVar != kjvVar.j) {
            return j2;
        }
        long a2 = j - kjvVar.a();
        return Math.min(Math.min(j2, a(kjvVar.i, a2)), a2 - kjvVar.i.e);
    }

    public final long b(kjk kjkVar, long j) {
        kjv kjvVar = kjkVar.d;
        if (kjvVar instanceof kjp) {
            return j;
        }
        int size = kjkVar.j.size();
        long j2 = j;
        for (int i = 0; i < size; i++) {
            kji kjiVar = (kji) kjkVar.j.get(i);
            if (kjiVar instanceof kjk) {
                kjk kjkVar2 = (kjk) kjiVar;
                if (kjkVar2.d != kjvVar) {
                    j2 = Math.max(j2, b(kjkVar2, kjkVar2.e + j));
                }
            }
        }
        if (kjkVar != kjvVar.i) {
            return j2;
        }
        long a2 = j + kjvVar.a();
        return Math.max(Math.max(j2, b(kjvVar.j, a2)), a2 - kjvVar.j.e);
    }
}
