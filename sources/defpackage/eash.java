package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class eash {
    static void a(exxp exxpVar, int i, boolean z) {
        if (((exxq) exxpVar.instance).b.size() <= 0) {
            if (!z) {
                return;
            }
            while (((exxq) exxpVar.instance).b.size() <= 0) {
                exxpVar.copyOnWrite();
                exxq exxqVar = (exxq) exxpVar.instance;
                exxqVar.a();
                exxqVar.b.g(0L);
            }
        }
        long a = ((exxq) exxpVar.instance).b.a(0);
        long j = 1 << i;
        long j2 = z ? a | j : (~j) & a;
        exxpVar.copyOnWrite();
        exxq exxqVar2 = (exxq) exxpVar.instance;
        exxqVar2.a();
        exxqVar2.b.d(0, j2);
    }
}
