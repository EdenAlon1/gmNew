package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kja {
    static final boolean[] a = new boolean[3];

    static void a(kiv kivVar, kgz kgzVar, kiu kiuVar) {
        kiuVar.z = -1;
        kiuVar.A = -1;
        if (kivVar.aA[0] != 2 && kiuVar.aA[0] == 4) {
            kit kitVar = kiuVar.T;
            int i = kitVar.f;
            int j = kivVar.j() - kiuVar.V.f;
            kitVar.h = kgzVar.b(kitVar);
            kit kitVar2 = kiuVar.V;
            kitVar2.h = kgzVar.b(kitVar2);
            kgzVar.f(kiuVar.T.h, i);
            kgzVar.f(kiuVar.V.h, j);
            kiuVar.z = 2;
            kiuVar.aj = i;
            int i2 = j - i;
            kiuVar.af = i2;
            int i3 = kiuVar.am;
            if (i2 < i3) {
                kiuVar.af = i3;
            }
        }
        if (kivVar.aA[1] == 2 || kiuVar.aA[1] != 4) {
            return;
        }
        kit kitVar3 = kiuVar.U;
        int i4 = kitVar3.f;
        int h = kivVar.h() - kiuVar.W.f;
        kitVar3.h = kgzVar.b(kitVar3);
        kit kitVar4 = kiuVar.W;
        kitVar4.h = kgzVar.b(kitVar4);
        kgzVar.f(kiuVar.U.h, i4);
        kgzVar.f(kiuVar.W.h, h);
        if (kiuVar.al > 0 || kiuVar.ar == 8) {
            kit kitVar5 = kiuVar.X;
            kitVar5.h = kgzVar.b(kitVar5);
            kgzVar.f(kiuVar.X.h, kiuVar.al + i4);
        }
        kiuVar.A = 2;
        kiuVar.ak = i4;
        int i5 = h - i4;
        kiuVar.ag = i5;
        int i6 = kiuVar.an;
        if (i5 < i6) {
            kiuVar.ag = i6;
        }
    }

    public static final boolean b(int i, int i2) {
        return (i & i2) == i2;
    }
}
