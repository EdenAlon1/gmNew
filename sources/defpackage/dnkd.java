package defpackage;

import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dnkd implements ffjm {
    final /* synthetic */ dnkl a;

    public dnkd(dnkl dnklVar) {
        this.a = dnklVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) != 2 || !hfdVar.I()) {
            dnkl dnklVar = this.a;
            for (dnkm dnkmVar : dnklVar.b) {
                if (ffkj.e(dnkmVar.a, dnklVar.a)) {
                    dwjt.b(dnkmVar.b, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, hfdVar, 0, 0, 131070);
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
        hfdVar.s();
        return ffcu.a;
    }
}
