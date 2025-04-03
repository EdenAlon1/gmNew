package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.List;
import org.chromium.net.PrivateKeyType;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nli implements nkj {
    private static final byte[] a = {0, 7, 8, 15};
    private static final byte[] b = {0, 119, -120, -1};
    private static final byte[] c = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};
    private final Paint d;
    private final Paint e;
    private final Canvas f;
    private final nlb g;
    private final nla h;
    private final nlh i;
    private Bitmap j;

    public nli(List list) {
        luv luvVar = new luv((byte[]) list.get(0));
        int n = luvVar.n();
        int n2 = luvVar.n();
        Paint paint = new Paint();
        this.d = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint.setPathEffect(null);
        Paint paint2 = new Paint();
        this.e = paint2;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        paint2.setPathEffect(null);
        this.f = new Canvas();
        this.g = new nlb(719, 575, 0, 719, 0, 575);
        this.h = new nla(0, i(), j(), k());
        this.i = new nlh(n, n2);
    }

    private static int d(int i, int i2, int i3, int i4) {
        return (i << 24) | (i2 << 16) | (i3 << 8) | i4;
    }

    private static nla e(luu luuVar, int i) {
        int d;
        int d2;
        int i2;
        int i3;
        luu luuVar2 = luuVar;
        int i4 = 8;
        int d3 = luuVar2.d(8);
        luuVar2.n(8);
        int[] i5 = i();
        int[] j = j();
        int[] k = k();
        int i6 = i - 2;
        while (i6 > 0) {
            int d4 = luuVar2.d(i4);
            int d5 = luuVar2.d(i4);
            int[] iArr = (d5 & 128) != 0 ? i5 : (d5 & 64) != 0 ? j : k;
            if ((d5 & 1) != 0) {
                i2 = luuVar2.d(i4);
                i3 = luuVar2.d(i4);
                d = luuVar2.d(i4);
                d2 = luuVar2.d(i4);
                i6 -= 6;
            } else {
                int d6 = luuVar2.d(6) << 2;
                int d7 = luuVar2.d(4) << 4;
                i6 -= 4;
                d = luuVar2.d(4) << 4;
                d2 = luuVar2.d(2) << 6;
                i2 = d6;
                i3 = d7;
            }
            if (i2 == 0) {
                d2 = 255;
            }
            if (i2 == 0) {
                d = 0;
            }
            if (i2 == 0) {
                i3 = 0;
            }
            double d8 = i2;
            double d9 = i3 - 128;
            double d10 = d - 128;
            iArr[d4] = d((byte) (255 - (d2 & PrivateKeyType.INVALID)), lvf.d((int) (d8 + (1.402d * d9)), 0, PrivateKeyType.INVALID), lvf.d((int) ((d8 - (0.34414d * d10)) - (d9 * 0.71414d)), 0, PrivateKeyType.INVALID), lvf.d((int) (d8 + (d10 * 1.772d)), 0, PrivateKeyType.INVALID));
            luuVar2 = luuVar;
            d3 = d3;
            i4 = 8;
        }
        return new nla(d3, i5, j, k);
    }

    private static nlc f(luu luuVar) {
        int d = luuVar.d(16);
        luuVar.n(4);
        int d2 = luuVar.d(2);
        boolean p = luuVar.p();
        luuVar.n(1);
        byte[] bArr = lvf.c;
        byte[] bArr2 = lvf.c;
        if (d2 == 1) {
            luuVar.n(luuVar.d(8) * 16);
        } else if (d2 == 0) {
            int d3 = luuVar.d(16);
            int d4 = luuVar.d(16);
            if (d3 > 0) {
                bArr = new byte[d3];
                luuVar.r(bArr, d3);
            }
            if (d4 > 0) {
                bArr2 = new byte[d4];
                luuVar.r(bArr2, d4);
            } else {
                bArr2 = bArr;
            }
        }
        return new nlc(d, p, bArr, bArr2);
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01d3 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0202 A[LOOP:3: B:84:0x0164->B:96:0x0202, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01fe A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void g(byte[] r22, int[] r23, int r24, int r25, int r26, android.graphics.Paint r27, android.graphics.Canvas r28) {
        /*
            Method dump skipped, instructions count: 550
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nli.g(byte[], int[], int, int, int, android.graphics.Paint, android.graphics.Canvas):void");
    }

    private static byte[] h(int i, int i2, luu luuVar) {
        byte[] bArr = new byte[i];
        for (int i3 = 0; i3 < i; i3++) {
            bArr[i3] = (byte) luuVar.d(i2);
        }
        return bArr;
    }

    private static int[] i() {
        return new int[]{0, -1, -16777216, -8421505};
    }

    private static int[] j() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i = 1; i < 16; i++) {
            int i2 = i & 4;
            int i3 = i & 2;
            int i4 = i & 1;
            if (i < 8) {
                iArr[i] = d(PrivateKeyType.INVALID, 1 != i4 ? 0 : 255, i3 != 0 ? 255 : 0, i2 != 0 ? 255 : 0);
            } else {
                iArr[i] = d(PrivateKeyType.INVALID, 1 != i4 ? 0 : 127, i3 != 0 ? 127 : 0, i2 == 0 ? 0 : 127);
            }
        }
        return iArr;
    }

    private static int[] k() {
        int[] iArr = new int[256];
        iArr[0] = 0;
        for (int i = 0; i < 256; i++) {
            int i2 = PrivateKeyType.INVALID;
            if (i < 8) {
                int i3 = i & 2;
                int i4 = i & 4;
                int i5 = 1 != (i & 1) ? 0 : 255;
                int i6 = i3 != 0 ? 255 : 0;
                if (i4 == 0) {
                    i2 = 0;
                }
                iArr[i] = d(63, i5, i6, i2);
            } else {
                int i7 = i & 136;
                if (i7 == 0) {
                    iArr[i] = d(PrivateKeyType.INVALID, (1 != (i & 1) ? 0 : 85) + ((i & 16) != 0 ? 170 : 0), ((i & 2) != 0 ? 85 : 0) + ((i & 32) != 0 ? 170 : 0), ((i & 4) == 0 ? 0 : 85) + ((i & 64) == 0 ? 0 : 170));
                } else if (i7 == 8) {
                    iArr[i] = d(127, (1 != (i & 1) ? 0 : 85) + ((i & 16) != 0 ? 170 : 0), ((i & 2) != 0 ? 85 : 0) + ((i & 32) != 0 ? 170 : 0), ((i & 4) == 0 ? 0 : 85) + ((i & 64) == 0 ? 0 : 170));
                } else if (i7 == 128) {
                    iArr[i] = d(PrivateKeyType.INVALID, (1 != (i & 1) ? 0 : 43) + 127 + ((i & 16) != 0 ? 85 : 0), ((i & 2) != 0 ? 43 : 0) + 127 + ((i & 32) != 0 ? 85 : 0), ((i & 4) == 0 ? 0 : 43) + 127 + ((i & 64) == 0 ? 0 : 85));
                } else if (i7 == 136) {
                    iArr[i] = d(PrivateKeyType.INVALID, (1 != (i & 1) ? 0 : 43) + ((i & 16) != 0 ? 85 : 0), ((i & 2) != 0 ? 43 : 0) + ((i & 32) != 0 ? 85 : 0), ((i & 4) == 0 ? 0 : 43) + ((i & 64) == 0 ? 0 : 85));
                }
            }
        }
        return iArr;
    }

    @Override // defpackage.nkj
    public final /* synthetic */ njw a(byte[] bArr, int i, int i2) {
        return nkf.a(this, bArr, i2);
    }

    @Override // defpackage.nkj
    public final void b(byte[] bArr, int i, int i2, nki nkiVar, lts ltsVar) {
        boolean z;
        njp njpVar;
        float f;
        char c2;
        int i3;
        nlf nlfVar;
        int i4;
        int i5;
        int i6;
        int i7;
        luu luuVar = new luu(bArr, i + i2);
        luuVar.l(i);
        while (true) {
            z = true;
            if (luuVar.a() >= 48 && luuVar.d(8) == 15) {
                nlh nlhVar = this.i;
                int d = luuVar.d(8);
                int d2 = luuVar.d(16);
                int d3 = luuVar.d(16);
                int b2 = luuVar.b() + d3;
                if (d3 * 8 > luuVar.a()) {
                    luj.f("DvbParser", "Data field length exceeds limit");
                    luuVar.n(luuVar.a());
                } else {
                    switch (d) {
                        case 16:
                            if (d2 == nlhVar.a) {
                                nld nldVar = nlhVar.i;
                                luuVar.d(8);
                                int d4 = luuVar.d(4);
                                int d5 = luuVar.d(2);
                                luuVar.n(2);
                                SparseArray sparseArray = new SparseArray();
                                for (int i8 = d3 - 2; i8 > 0; i8 -= 6) {
                                    int d6 = luuVar.d(8);
                                    luuVar.n(8);
                                    sparseArray.put(d6, new nle(luuVar.d(16), luuVar.d(16)));
                                }
                                nld nldVar2 = new nld(d4, d5, sparseArray);
                                if (nldVar2.b != 0) {
                                    nlhVar.i = nldVar2;
                                    nlhVar.c.clear();
                                    nlhVar.d.clear();
                                    nlhVar.e.clear();
                                    break;
                                } else if (nldVar != null) {
                                    if (nldVar.a != nldVar2.a) {
                                        nlhVar.i = nldVar2;
                                        break;
                                    }
                                }
                            }
                            break;
                        case 17:
                            nld nldVar3 = nlhVar.i;
                            if (d2 == nlhVar.a && nldVar3 != null) {
                                int d7 = luuVar.d(8);
                                luuVar.n(4);
                                boolean p = luuVar.p();
                                luuVar.n(3);
                                int d8 = luuVar.d(16);
                                int d9 = luuVar.d(16);
                                luuVar.d(3);
                                int d10 = luuVar.d(3);
                                luuVar.n(2);
                                int d11 = luuVar.d(8);
                                int d12 = luuVar.d(8);
                                int d13 = luuVar.d(4);
                                int d14 = luuVar.d(2);
                                luuVar.n(2);
                                int i9 = d3 - 10;
                                SparseArray sparseArray2 = new SparseArray();
                                while (i9 > 0) {
                                    int d15 = luuVar.d(16);
                                    int d16 = luuVar.d(2);
                                    luuVar.d(2);
                                    int d17 = luuVar.d(12);
                                    luuVar.n(4);
                                    int d18 = luuVar.d(12);
                                    int i10 = i9 - 6;
                                    if (d16 == 1 || d16 == 2) {
                                        luuVar.d(8);
                                        luuVar.d(8);
                                        i9 -= 8;
                                    } else {
                                        i9 = i10;
                                    }
                                    sparseArray2.put(d15, new nlg(d17, d18));
                                }
                                nlf nlfVar2 = new nlf(d7, p, d8, d9, d10, d11, d12, d13, d14, sparseArray2);
                                if (nldVar3.b == 0 && (nlfVar = (nlf) nlhVar.c.get(nlfVar2.a)) != null) {
                                    int i11 = 0;
                                    while (true) {
                                        SparseArray sparseArray3 = nlfVar.j;
                                        if (i11 < sparseArray3.size()) {
                                            nlfVar2.j.put(sparseArray3.keyAt(i11), (nlg) sparseArray3.valueAt(i11));
                                            i11++;
                                        }
                                    }
                                }
                                nlhVar.c.put(nlfVar2.a, nlfVar2);
                                break;
                            }
                            break;
                        case 18:
                            if (d2 == nlhVar.a) {
                                nla e = e(luuVar, d3);
                                nlhVar.d.put(e.a, e);
                                break;
                            } else if (d2 == nlhVar.b) {
                                nla e2 = e(luuVar, d3);
                                nlhVar.f.put(e2.a, e2);
                                break;
                            }
                            break;
                        case 19:
                            if (d2 == nlhVar.a) {
                                nlc f2 = f(luuVar);
                                nlhVar.e.put(f2.a, f2);
                                break;
                            } else if (d2 == nlhVar.b) {
                                nlc f3 = f(luuVar);
                                nlhVar.g.put(f3.a, f3);
                                break;
                            }
                            break;
                        case 20:
                            if (d2 == nlhVar.a) {
                                luuVar.n(4);
                                boolean p2 = luuVar.p();
                                luuVar.n(3);
                                int d19 = luuVar.d(16);
                                int d20 = luuVar.d(16);
                                if (p2) {
                                    int d21 = luuVar.d(16);
                                    i4 = luuVar.d(16);
                                    i7 = luuVar.d(16);
                                    i6 = d21;
                                    i5 = luuVar.d(16);
                                } else {
                                    i4 = d19;
                                    i5 = d20;
                                    i6 = 0;
                                    i7 = 0;
                                }
                                nlhVar.h = new nlb(d19, d20, i6, i4, i7, i5);
                                break;
                            }
                            break;
                    }
                    luuVar.o(b2 - luuVar.b());
                }
            }
        }
        nlh nlhVar2 = this.i;
        nld nldVar4 = nlhVar2.i;
        if (nldVar4 == null) {
            int i12 = engw.d;
            njpVar = new njp(enou.a, -9223372036854775807L, -9223372036854775807L);
        } else {
            nlb nlbVar = nlhVar2.h;
            if (nlbVar == null) {
                nlbVar = this.g;
            }
            Bitmap bitmap = this.j;
            if (bitmap == null || nlbVar.a + 1 != bitmap.getWidth() || nlbVar.b + 1 != this.j.getHeight()) {
                Bitmap createBitmap = Bitmap.createBitmap(nlbVar.a + 1, nlbVar.b + 1, Bitmap.Config.ARGB_8888);
                this.j = createBitmap;
                this.f.setBitmap(createBitmap);
            }
            ArrayList arrayList = new ArrayList();
            SparseArray sparseArray4 = nldVar4.c;
            int i13 = 0;
            while (i13 < sparseArray4.size()) {
                this.f.save();
                nle nleVar = (nle) sparseArray4.valueAt(i13);
                nlf nlfVar3 = (nlf) this.i.c.get(sparseArray4.keyAt(i13));
                int i14 = nleVar.a + nlbVar.c;
                int i15 = nleVar.b + nlbVar.e;
                this.f.clipRect(i14, i15, Math.min(nlfVar3.c + i14, nlbVar.d), Math.min(nlfVar3.d + i15, nlbVar.f));
                nla nlaVar = (nla) this.i.d.get(nlfVar3.f);
                if (nlaVar == null) {
                    nlaVar = (nla) this.i.f.get(nlfVar3.f);
                    if (nlaVar == null) {
                        nlaVar = this.h;
                    }
                }
                SparseArray sparseArray5 = nlfVar3.j;
                int i16 = 0;
                while (i16 < sparseArray5.size()) {
                    int keyAt = sparseArray5.keyAt(i16);
                    nlg nlgVar = (nlg) sparseArray5.valueAt(i16);
                    boolean z2 = z;
                    nlc nlcVar = (nlc) this.i.e.get(keyAt);
                    if (nlcVar == null) {
                        nlcVar = (nlc) this.i.g.get(keyAt);
                    }
                    if (nlcVar != null) {
                        Paint paint = nlcVar.b ? null : this.d;
                        int i17 = nlfVar3.e;
                        int i18 = i14 + nlgVar.a;
                        int i19 = i15 + nlgVar.b;
                        Canvas canvas = this.f;
                        int[] iArr = i17 == 3 ? nlaVar.d : i17 == 2 ? nlaVar.c : nlaVar.b;
                        g(nlcVar.c, iArr, i17, i18, i19, paint, canvas);
                        g(nlcVar.d, iArr, i17, i18, i19 + 1, paint, canvas);
                    }
                    i16++;
                    z = z2;
                }
                boolean z3 = z;
                float f4 = i15;
                float f5 = i14;
                if (nlfVar3.b) {
                    int i20 = nlfVar3.e;
                    if (i20 == 3) {
                        i3 = nlaVar.d[nlfVar3.g];
                        c2 = 2;
                    } else {
                        c2 = 2;
                        i3 = i20 == 2 ? nlaVar.c[nlfVar3.h] : nlaVar.b[nlfVar3.i];
                    }
                    this.e.setColor(i3);
                    f = f4;
                    this.f.drawRect(f5, f, nlfVar3.c + i14, nlfVar3.d + i15, this.e);
                } else {
                    f = f4;
                    c2 = 2;
                }
                lsy lsyVar = new lsy();
                lsyVar.b = Bitmap.createBitmap(this.j, i14, i15, nlfVar3.c, nlfVar3.d);
                lsyVar.f = f5 / nlbVar.a;
                lsyVar.g = 0;
                lsyVar.c(f / nlbVar.b, 0);
                lsyVar.e = 0;
                lsyVar.h = nlfVar3.c / nlbVar.a;
                lsyVar.i = nlfVar3.d / nlbVar.b;
                arrayList.add(lsyVar.a());
                this.f.drawColor(0, PorterDuff.Mode.CLEAR);
                this.f.restore();
                i13++;
                z = z3;
            }
            njpVar = new njp(arrayList, -9223372036854775807L, -9223372036854775807L);
        }
        ltsVar.a(njpVar);
    }

    @Override // defpackage.nkj
    public final void c() {
        nlh nlhVar = this.i;
        nlhVar.c.clear();
        nlhVar.d.clear();
        nlhVar.e.clear();
        nlhVar.f.clear();
        nlhVar.g.clear();
        nlhVar.h = null;
        nlhVar.i = null;
    }
}
