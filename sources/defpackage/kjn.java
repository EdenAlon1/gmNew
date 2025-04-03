package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kjn {
    public static kju a(kiu kiuVar, int i, ArrayList arrayList, kju kjuVar) {
        int i2;
        int i3 = i == 0 ? kiuVar.ay : kiuVar.az;
        if (i3 != -1 && (kjuVar == null || i3 != kjuVar.c)) {
            int i4 = 0;
            while (true) {
                if (i4 >= arrayList.size()) {
                    break;
                }
                kju kjuVar2 = (kju) arrayList.get(i4);
                if (kjuVar2.c == i3) {
                    if (kjuVar != null) {
                        kjuVar.c(i, kjuVar2);
                        arrayList.remove(kjuVar);
                    }
                    kjuVar = kjuVar2;
                } else {
                    i4++;
                }
            }
        } else if (i3 != -1) {
            return kjuVar;
        }
        if (kjuVar == null) {
            if (kiuVar instanceof kiz) {
                kiz kizVar = (kiz) kiuVar;
                int i5 = 0;
                while (true) {
                    if (i5 >= kizVar.aM) {
                        i2 = -1;
                        break;
                    }
                    kiu kiuVar2 = kizVar.aL[i5];
                    if (i == 0) {
                        i2 = kiuVar2.ay;
                        if (i2 != -1) {
                            break;
                        }
                        i5++;
                    } else {
                        i2 = kiuVar2.az;
                        if (i2 != -1) {
                            break;
                        }
                        i5++;
                    }
                }
                if (i2 != -1) {
                    int i6 = 0;
                    while (true) {
                        if (i6 >= arrayList.size()) {
                            break;
                        }
                        kju kjuVar3 = (kju) arrayList.get(i6);
                        if (kjuVar3.c == i2) {
                            kjuVar = kjuVar3;
                            break;
                        }
                        i6++;
                    }
                }
            }
            if (kjuVar == null) {
                kjuVar = new kju(i);
            }
            arrayList.add(kjuVar);
        }
        if (kjuVar.d(kiuVar)) {
            if (kiuVar instanceof kiy) {
                kiy kiyVar = (kiy) kiuVar;
                kiyVar.d.d(kiyVar.e == 0 ? 1 : 0, arrayList, kjuVar);
            }
            if (i == 0) {
                kiuVar.ay = kjuVar.c;
                kiuVar.T.d(0, arrayList, kjuVar);
                kiuVar.V.d(0, arrayList, kjuVar);
            } else {
                kiuVar.az = kjuVar.c;
                kiuVar.U.d(1, arrayList, kjuVar);
                kiuVar.X.d(1, arrayList, kjuVar);
                kiuVar.W.d(1, arrayList, kjuVar);
            }
            kiuVar.aa.d(i, arrayList, kjuVar);
        }
        return kjuVar;
    }

    public static kju b(ArrayList arrayList, int i) {
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            kju kjuVar = (kju) arrayList.get(i2);
            if (i == kjuVar.c) {
                return kjuVar;
            }
        }
        return null;
    }

    public static boolean c(int i, int i2, int i3, int i4) {
        return (i3 == 1 || i3 == 2 || (i3 == 4 && i != 2)) || (i4 == 1 || i4 == 2 || (i4 == 4 && i2 != 2));
    }
}
