package defpackage;

import android.graphics.Bitmap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.zip.Inflater;
import org.chromium.net.PrivateKeyType;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nlk implements nkj {
    private final luv a = new luv();
    private final luv b = new luv();
    private final nlj c = new nlj();
    private Inflater d;

    @Override // defpackage.nkj
    public final /* synthetic */ njw a(byte[] bArr, int i, int i2) {
        return nkf.a(this, bArr, i2);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // defpackage.nkj
    public final void b(byte[] bArr, int i, int i2, nki nkiVar, lts ltsVar) {
        lsz lszVar;
        luv luvVar;
        luv luvVar2;
        int i3;
        int i4;
        int l;
        nlk nlkVar = this;
        nlkVar.a.I(bArr, i + i2);
        nlkVar.a.K(i);
        if (nlkVar.d == null) {
            nlkVar.d = new Inflater();
        }
        if (lvf.ac(nlkVar.a, nlkVar.b, nlkVar.d)) {
            luv luvVar3 = nlkVar.a;
            luv luvVar4 = nlkVar.b;
            luvVar3.I(luvVar4.a, luvVar4.c);
        }
        nlkVar.c.a();
        ArrayList arrayList = new ArrayList();
        while (true) {
            luv luvVar5 = nlkVar.a;
            if (luvVar5.b() < 3) {
                ltsVar.a(new njp(arrayList, -9223372036854775807L, -9223372036854775807L));
                return;
            }
            nlj nljVar = nlkVar.c;
            int i5 = luvVar5.c;
            int j = luvVar5.j();
            int n = luvVar5.n();
            int i6 = luvVar5.b + n;
            if (i6 > i5) {
                luvVar5.K(i5);
                lszVar = null;
            } else {
                if (j != 128) {
                    switch (j) {
                        case 20:
                            if (n % 5 == 2) {
                                luvVar5.L(2);
                                Arrays.fill(nljVar.b, 0);
                                int i7 = n / 5;
                                int i8 = 0;
                                while (i8 < i7) {
                                    int j2 = luvVar5.j();
                                    int j3 = luvVar5.j();
                                    int j4 = luvVar5.j();
                                    double d = j3;
                                    double d2 = j4 - 128;
                                    double j5 = luvVar5.j() - 128;
                                    nljVar.b[j2] = lvf.d((int) (d + (j5 * 1.772d)), 0, PrivateKeyType.INVALID) | (luvVar5.j() << 24) | (lvf.d((int) (d + (1.402d * d2)), 0, PrivateKeyType.INVALID) << 16) | (lvf.d((int) ((d - (0.34414d * j5)) - (d2 * 0.71414d)), 0, PrivateKeyType.INVALID) << 8);
                                    i8++;
                                    luvVar5 = luvVar5;
                                }
                                nljVar.c = true;
                                luvVar = luvVar5;
                                break;
                            }
                            luvVar = luvVar5;
                            break;
                        case 21:
                            if (n >= 4) {
                                luvVar5.L(3);
                                int i9 = n - 4;
                                if ((luvVar5.j() & 128) != 0) {
                                    if (i9 >= 7 && (l = luvVar5.l()) >= 4) {
                                        nljVar.h = luvVar5.n();
                                        nljVar.i = luvVar5.n();
                                        nljVar.a.G(l - 4);
                                        i9 = n - 11;
                                    }
                                }
                                luv luvVar6 = nljVar.a;
                                int i10 = luvVar6.b;
                                int i11 = luvVar6.c;
                                if (i10 < i11 && i9 > 0) {
                                    int min = Math.min(i9, i11 - i10);
                                    luvVar5.F(luvVar6.a, i10, min);
                                    nljVar.a.K(i10 + min);
                                }
                            }
                            luvVar = luvVar5;
                            break;
                        case 22:
                            if (n >= 19) {
                                nljVar.d = luvVar5.n();
                                nljVar.e = luvVar5.n();
                                luvVar5.L(11);
                                nljVar.f = luvVar5.n();
                                nljVar.g = luvVar5.n();
                            }
                            luvVar = luvVar5;
                            break;
                        default:
                            luvVar = luvVar5;
                            break;
                    }
                    lszVar = null;
                } else {
                    if (nljVar.d == 0 || nljVar.e == 0 || nljVar.h == 0 || nljVar.i == 0 || (i3 = (luvVar2 = nljVar.a).c) == 0 || luvVar2.b != i3 || !nljVar.c) {
                        lszVar = null;
                    } else {
                        luvVar2.K(0);
                        int i12 = nljVar.h * nljVar.i;
                        int[] iArr = new int[i12];
                        int i13 = 0;
                        while (i13 < i12) {
                            int j6 = nljVar.a.j();
                            if (j6 != 0) {
                                i4 = i13 + 1;
                                iArr[i13] = nljVar.b[j6];
                            } else {
                                int j7 = nljVar.a.j();
                                if (j7 != 0) {
                                    int i14 = j7 & 63;
                                    if ((j7 & 64) != 0) {
                                        i14 = (i14 << 8) | nljVar.a.j();
                                    }
                                    i4 = i14 + i13;
                                    Arrays.fill(iArr, i13, i4, (j7 & 128) == 0 ? nljVar.b[0] : nljVar.b[nljVar.a.j()]);
                                }
                            }
                            i13 = i4;
                        }
                        Bitmap createBitmap = Bitmap.createBitmap(iArr, nljVar.h, nljVar.i, Bitmap.Config.ARGB_8888);
                        lsy lsyVar = new lsy();
                        lsyVar.b = createBitmap;
                        lsyVar.f = nljVar.f / nljVar.d;
                        lsyVar.g = 0;
                        lsyVar.c(nljVar.g / nljVar.e, 0);
                        lsyVar.e = 0;
                        lsyVar.h = nljVar.h / nljVar.d;
                        lsyVar.i = nljVar.i / nljVar.e;
                        lszVar = lsyVar.a();
                    }
                    nljVar.a();
                    luvVar = luvVar5;
                }
                luvVar.K(i6);
            }
            if (lszVar != null) {
                arrayList.add(lszVar);
            }
            nlkVar = this;
        }
    }

    @Override // defpackage.nkj
    public final /* synthetic */ void c() {
    }
}
