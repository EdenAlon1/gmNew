package defpackage;

import android.util.Pair;
import j$.util.Objects;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class mxi extends mxl {
    protected abstract Pair k(mxh mxhVar, int[][][] iArr, int[] iArr2);

    @Override // defpackage.mxl
    public final mxm n(mij[] mijVarArr, mvo mvoVar) {
        int length;
        boolean z;
        engw engwVar;
        int length2;
        int[] iArr;
        mvo mvoVar2 = mvoVar;
        boolean z2 = true;
        int length3 = mijVarArr.length + 1;
        int[] iArr2 = new int[length3];
        lrv[][] lrvVarArr = new lrv[length3][];
        int[][][] iArr3 = new int[length3][][];
        for (int i = 0; i < length3; i++) {
            int i2 = mvoVar2.b;
            lrvVarArr[i] = new lrv[i2];
            iArr3[i] = new int[i2][];
        }
        int length4 = mijVarArr.length;
        int[] iArr4 = new int[length4];
        for (int i3 = 0; i3 < length4; i3++) {
            iArr4[i3] = mijVarArr[i3].e();
        }
        int i4 = 0;
        while (i4 < mvoVar2.b) {
            lrv b = mvoVar2.b(i4);
            int i5 = b.c;
            int length5 = mijVarArr.length;
            boolean z3 = z2;
            int i6 = 0;
            int i7 = 0;
            while (true) {
                length2 = mijVarArr.length;
                if (i6 >= length2) {
                    break;
                }
                mij mijVar = mijVarArr[i6];
                boolean z4 = z2;
                int i8 = 0;
                for (int i9 = 0; i9 < b.a; i9++) {
                    i8 = Math.max(i8, mih.e(mijVar.V(b.a(i9))));
                }
                boolean z5 = iArr2[i6] == 0 ? z4 : false;
                if (i8 > i7) {
                    z3 = z5;
                    length5 = i6;
                    i7 = i8;
                } else if (i8 == i7 && i5 == 5 && !z3 && z5) {
                    length5 = i6;
                    i7 = i8;
                    z3 = z4;
                }
                i6++;
                z2 = z4;
            }
            boolean z6 = z2;
            if (length5 == length2) {
                iArr = new int[b.a];
            } else {
                mij mijVar2 = mijVarArr[length5];
                int[] iArr5 = new int[b.a];
                for (int i10 = 0; i10 < b.a; i10++) {
                    iArr5[i10] = mijVar2.V(b.a(i10));
                }
                iArr = iArr5;
            }
            int i11 = iArr2[length5];
            lrvVarArr[length5][i11] = b;
            iArr3[length5][i11] = iArr;
            iArr2[length5] = i11 + 1;
            i4++;
            mvoVar2 = mvoVar;
            z2 = z6;
        }
        boolean z7 = z2;
        int length6 = mijVarArr.length;
        mvo[] mvoVarArr = new mvo[length6];
        String[] strArr = new String[length6];
        int[] iArr6 = new int[length6];
        int i12 = 0;
        while (true) {
            length = mijVarArr.length;
            if (i12 >= length) {
                break;
            }
            int i13 = iArr2[i12];
            mvoVarArr[i12] = new mvo((lrv[]) lvf.af(lrvVarArr[i12], i13));
            iArr3[i12] = (int[][]) lvf.af(iArr3[i12], i13);
            strArr[i12] = mijVarArr[i12].R();
            iArr6[i12] = mijVarArr[i12].eL();
            i12++;
        }
        mxh mxhVar = new mxh(iArr6, mvoVarArr, iArr4, iArr3, new mvo((lrv[]) lvf.af(lrvVarArr[length], iArr2[length])));
        Pair k = k(mxhVar, iArr3, iArr4);
        mxj[] mxjVarArr = (mxj[]) k.second;
        List[] listArr = new List[mxjVarArr.length];
        for (int i14 = 0; i14 < mxjVarArr.length; i14++) {
            mxj mxjVar = mxjVarArr[i14];
            if (mxjVar != null) {
                engwVar = engw.r(mxjVar);
            } else {
                int i15 = engw.d;
                engwVar = enou.a;
            }
            listArr[i14] = engwVar;
        }
        engr engrVar = new engr();
        for (int i16 = 0; i16 < mxhVar.a; i16++) {
            mvo c = mxhVar.c(i16);
            List list = listArr[i16];
            int i17 = 0;
            while (i17 < c.b) {
                lrv b2 = c.b(i17);
                int i18 = mxhVar.b[i16].b(i17).a;
                int[] iArr7 = new int[i18];
                int i19 = 0;
                for (int i20 = 0; i20 < i18; i20++) {
                    if (mxhVar.b(i16, i17, i20) == 4) {
                        iArr7[i19] = i20;
                        i19++;
                    }
                }
                int[] copyOf = Arrays.copyOf(iArr7, i19);
                String str = null;
                int i21 = 16;
                int i22 = 0;
                boolean z8 = false;
                int i23 = 0;
                while (i22 < copyOf.length) {
                    List[] listArr2 = listArr;
                    String str2 = mxhVar.b[i16].b(i17).a(copyOf[i22]).o;
                    int i24 = i23 + 1;
                    if (i23 == 0) {
                        str = str2;
                    } else {
                        z8 |= !Objects.equals(str, str2);
                    }
                    i21 = Math.min(i21, mxhVar.d[i16][i17][i22] & 24);
                    i22++;
                    i23 = i24;
                    listArr = listArr2;
                }
                List[] listArr3 = listArr;
                if (z8) {
                    i21 = Math.min(i21, mxhVar.c[i16]);
                }
                boolean z9 = i21 != 0 ? z7 : false;
                int i25 = b2.a;
                int[] iArr8 = new int[i25];
                boolean[] zArr = new boolean[i25];
                for (int i26 = 0; i26 < b2.a; i26++) {
                    iArr8[i26] = mxhVar.b(i16, i17, i26);
                    int i27 = 0;
                    while (true) {
                        if (i27 >= list.size()) {
                            z = false;
                            break;
                        }
                        mxj mxjVar2 = (mxj) list.get(i27);
                        if (mxjVar2.g().equals(b2) && mxjVar2.c(i26) != -1) {
                            z = z7;
                            break;
                        }
                        i27++;
                    }
                    zArr[i26] = z;
                }
                engrVar.h(new lsa(b2, z9, iArr8, zArr));
                i17++;
                listArr = listArr3;
            }
        }
        mvo mvoVar3 = mxhVar.e;
        for (int i28 = 0; i28 < mvoVar3.b; i28++) {
            lrv b3 = mvoVar3.b(i28);
            int[] iArr9 = new int[b3.a];
            Arrays.fill(iArr9, 0);
            engrVar.h(new lsa(b3, false, iArr9, new boolean[b3.a]));
        }
        return new mxm((mik[]) k.first, (mxf[]) k.second, new lsb(engrVar.g()), mxhVar);
    }

    @Override // defpackage.mxl
    public final void m() {
    }
}
