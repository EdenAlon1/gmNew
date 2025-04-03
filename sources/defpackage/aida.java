package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aida implements ffjn {
    final /* synthetic */ List a;

    public aida(List list) {
        this.a = list;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        hvi d;
        hvi c;
        long j;
        hfd hfdVar = (hfd) obj2;
        ((Number) obj3).intValue();
        ((crw) obj).getClass();
        d = ebs.d(hvi.e, 1.0f);
        c = dix.c(cry.b(d), dix.a(0, hfdVar, 0, 1), false & ((r6 & 8) == 0), (r6 & 2) != 0, true);
        hfdVar.v(-1871483588);
        hfdVar.v(-1871479623);
        boolean booleanValue = ((Boolean) hfdVar.e(fyc.b)).booleanValue();
        hfdVar.o();
        if (booleanValue) {
            hfdVar.v(2113684249);
            j = gft.a(hfdVar).p;
            hfdVar.o();
        } else {
            hfdVar.v(2113745040);
            j = gft.a(hfdVar).F;
            hfdVar.o();
        }
        long j2 = j;
        hfdVar.o();
        gpa.c(c, null, j2, 0L, true != ((Boolean) hfdVar.e(fyc.b)).booleanValue() ? 0.0f : 3.0f, 0.0f, null, hpx.d(674583525, new aicz(this.a), hfdVar), hfdVar, 106);
        return ffcu.a;
    }
}
