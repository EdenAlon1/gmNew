package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class him {
    public static final void a(hjv hjvVar, List list, hiq hiqVar) {
        if (list.isEmpty()) {
            return;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            int a = hjvVar.a((hen) list.get(i));
            int n = hjvVar.n(hjvVar.b, hjvVar.h(a));
            Object obj = n < hjvVar.c(hjvVar.b, hjvVar.h(a + 1)) ? hjvVar.c[hjvVar.d(n)] : hfc.a;
            hio hioVar = obj instanceof hio ? (hio) obj : null;
            if (hioVar != null) {
                hioVar.b = hiqVar;
            }
        }
    }
}
