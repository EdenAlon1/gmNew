package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class czo implements cyl {
    private final czn a;

    public czo(czn cznVar) {
        this.a = cznVar;
    }

    @Override // defpackage.cyl
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final ddc a(dbv dbvVar) {
        long[] jArr;
        int i;
        long[] jArr2;
        char c;
        cnv cnvVar = new cnv(this.a.b.e + 2);
        cnw cnwVar = new cnw(this.a.b.e);
        cnw cnwVar2 = this.a.b;
        int[] iArr = cnwVar2.b;
        Object[] objArr = cnwVar2.c;
        long[] jArr3 = cnwVar2.a;
        int length = jArr3.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j = jArr3[i2];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = i2 - length;
                    int i4 = 0;
                    while (true) {
                        i = 8 - ((~i3) >>> 31);
                        if (i4 >= i) {
                            break;
                        }
                        if ((255 & j) < 128) {
                            int i5 = (i2 << 3) + i4;
                            int i6 = iArr[i5];
                            czm czmVar = (czm) objArr[i5];
                            cnvVar.e(i6);
                            c = '\b';
                            jArr2 = jArr3;
                            cyb cybVar = (cyb) dbvVar.b().invoke(czmVar.a);
                            cym cymVar = czmVar.b;
                            int i7 = czmVar.c;
                            cnwVar.f(i6, new ddb(cybVar, cymVar));
                        } else {
                            jArr2 = jArr3;
                            c = '\b';
                        }
                        j >>= c;
                        i4++;
                        jArr3 = jArr2;
                    }
                    jArr = jArr3;
                    if (i != 8) {
                        break;
                    }
                } else {
                    jArr = jArr3;
                }
                if (i2 == length) {
                    break;
                }
                i2++;
                jArr3 = jArr;
            }
        }
        if (!this.a.b.b(0)) {
            if (cnvVar.b < 0) {
                cpx.c("Index must be between 0 and size");
            }
            cnvVar.d(cnvVar.b + 1);
            int[] iArr2 = cnvVar.a;
            int i8 = cnvVar.b;
            if (i8 != 0) {
                ffdo.l(iArr2, iArr2, 1, 0, i8);
            }
            iArr2[0] = 0;
            cnvVar.b++;
        }
        czn cznVar = this.a;
        if (!cznVar.b.b(cznVar.a)) {
            cnvVar.e(this.a.a);
        }
        int i9 = cnvVar.b;
        if (i9 != 0) {
            int[] iArr3 = cnvVar.a;
            iArr3.getClass();
            Arrays.sort(iArr3, 0, i9);
        }
        return new ddc(cnvVar, cnwVar, this.a.a, cyp.d);
    }
}
