package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lnk {
    public static final hkx a(fgdj fgdjVar, hfd hfdVar) {
        lkr lkrVar = (lkr) hfdVar.e(lnr.a);
        lkj lkjVar = lkj.STARTED;
        ffhe ffheVar = ffhe.a;
        Object c = fgdjVar.c();
        lkk P = lkrVar.P();
        Object[] objArr = {fgdjVar, P, lkjVar, ffheVar};
        boolean F = hfdVar.F(P) | hfdVar.D(lkjVar) | hfdVar.F(ffheVar) | hfdVar.F(fgdjVar);
        Object f = hfdVar.f();
        if (F || f == hfc.a) {
            Object lnjVar = new lnj(P, lkjVar, ffheVar, fgdjVar, null);
            hfdVar.y(lnjVar);
            f = lnjVar;
        }
        ffjm ffjmVar = (ffjm) f;
        Object f2 = hfdVar.f();
        if (f2 == hfc.a) {
            Object hicVar = new hic(c, hla.a);
            hfdVar.y(hicVar);
            f2 = hicVar;
        }
        hho hhoVar = (hho) f2;
        Object[] copyOf = Arrays.copyOf(objArr, 4);
        boolean F2 = hfdVar.F(ffjmVar);
        Object f3 = hfdVar.f();
        if (F2 || f3 == hfc.a) {
            f3 = new hkj(ffjmVar, hhoVar, null);
            hfdVar.y(f3);
        }
        hgs.h(copyOf, (ffjm) f3, hfdVar);
        return hhoVar;
    }
}
