package defpackage;

import android.util.SparseArray;
import java.util.List;
import org.chromium.net.PrivateKeyType;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nnz implements nco {
    private boolean e;
    private boolean f;
    private boolean g;
    private long h;
    private nnw i;
    private ncr j;
    private boolean k;
    private final lvc a = new lvc(0);
    private final luv c = new luv(4096);
    private final SparseArray b = new SparseArray();
    private final nnx d = new nnx();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5 */
    @Override // defpackage.nco
    public final int a(ncp ncpVar, ndk ndkVar) {
        ?? r11;
        int i;
        long j;
        long j2;
        char c;
        nnb nnbVar;
        long j3;
        long j4;
        lti.g(this.j);
        nce nceVar = (nce) ncpVar;
        long j5 = nceVar.a;
        if (j5 != -1) {
            nnx nnxVar = this.d;
            if (!nnxVar.c) {
                if (!nnxVar.e) {
                    int min = (int) Math.min(20000L, j5);
                    long j6 = j5 - min;
                    if (nceVar.b != j6) {
                        ndkVar.a = j6;
                        return 1;
                    }
                    nnxVar.b.G(min);
                    ncpVar.k();
                    ncpVar.i(nnxVar.b.a, 0, min);
                    luv luvVar = nnxVar.b;
                    int i2 = luvVar.b;
                    int i3 = luvVar.c - 4;
                    while (true) {
                        if (i3 < i2) {
                            j4 = -9223372036854775807L;
                            break;
                        }
                        if (nnx.c(luvVar.a, i3) == 442) {
                            luvVar.K(i3 + 4);
                            j4 = nnx.a(luvVar);
                            if (j4 != -9223372036854775807L) {
                                break;
                            }
                        }
                        i3--;
                    }
                    nnxVar.g = j4;
                    nnxVar.e = true;
                    return 0;
                }
                if (nnxVar.g == -9223372036854775807L) {
                    nnxVar.b(ncpVar);
                    return 0;
                }
                if (nnxVar.d) {
                    long j7 = nnxVar.f;
                    if (j7 == -9223372036854775807L) {
                        nnxVar.b(ncpVar);
                        return 0;
                    }
                    lvc lvcVar = nnxVar.a;
                    nnxVar.h = lvcVar.c(nnxVar.g) - lvcVar.b(j7);
                    nnxVar.b(ncpVar);
                    return 0;
                }
                int min2 = (int) Math.min(20000L, j5);
                if (nceVar.b != 0) {
                    ndkVar.a = 0L;
                    return 1;
                }
                nnxVar.b.G(min2);
                ncpVar.k();
                ncpVar.i(nnxVar.b.a, 0, min2);
                luv luvVar2 = nnxVar.b;
                int i4 = luvVar2.b;
                int i5 = luvVar2.c;
                while (true) {
                    if (i4 >= i5 - 3) {
                        j3 = -9223372036854775807L;
                        break;
                    }
                    if (nnx.c(luvVar2.a, i4) == 442) {
                        luvVar2.K(i4 + 4);
                        j3 = nnx.a(luvVar2);
                        if (j3 != -9223372036854775807L) {
                            break;
                        }
                    }
                    i4++;
                }
                nnxVar.f = j3;
                nnxVar.d = true;
                return 0;
            }
        }
        if (this.k) {
            r11 = 1;
            i = 0;
        } else {
            this.k = true;
            nnx nnxVar2 = this.d;
            i = 0;
            long j8 = nnxVar2.h;
            if (j8 != -9223372036854775807L) {
                r11 = 1;
                nnw nnwVar = new nnw(nnxVar2.a, j8, j5);
                this.i = nnwVar;
                this.j.w(nnwVar.a);
            } else {
                r11 = 1;
                this.j.w(new ndm(-9223372036854775807L));
            }
        }
        nnw nnwVar2 = this.i;
        if (nnwVar2 != null && nnwVar2.c()) {
            return nnwVar2.a(ncpVar, ndkVar);
        }
        ncpVar.k();
        long e = j5 != -1 ? j5 - ncpVar.e() : -1L;
        if ((e != -1 && e < 4) || !ncpVar.n(this.c.a, i, 4, r11)) {
            return -1;
        }
        this.c.K(i);
        int e2 = this.c.e();
        if (e2 == 441) {
            return -1;
        }
        if (e2 == 442) {
            ncpVar.i(this.c.a, i, 10);
            this.c.K(9);
            ncpVar.l((this.c.j() & 7) + 14);
            return i;
        }
        if (e2 == 443) {
            ncpVar.i(this.c.a, i, 2);
            this.c.K(i);
            ncpVar.l(this.c.n() + 6);
            return i;
        }
        if ((e2 >> 8) != r11) {
            ncpVar.l(r11);
            return i;
        }
        int i6 = e2 & PrivateKeyType.INVALID;
        nny nnyVar = (nny) this.b.get(i6);
        if (!this.e) {
            if (nnyVar == null) {
                if (i6 == 189) {
                    nnbVar = new nmt("video/mp2p");
                    this.f = r11;
                    this.h = nceVar.b;
                } else if ((e2 & 224) == 192) {
                    nnbVar = new nno(null, i, "video/mp2p");
                    this.f = r11;
                    this.h = nceVar.b;
                } else if ((e2 & 240) == 224) {
                    nnbVar = new nnd(null, "video/mp2p");
                    this.g = r11;
                    this.h = nceVar.b;
                } else {
                    nnbVar = null;
                }
                if (nnbVar != null) {
                    nnbVar.b(this.j, new nom(i6, 256));
                    nny nnyVar2 = new nny(nnbVar, this.a);
                    this.b.put(i6, nnyVar2);
                    nnyVar = nnyVar2;
                }
            }
            long j9 = 1048576;
            if (this.f && this.g) {
                j9 = this.h + 8192;
            }
            if (nceVar.b > j9) {
                this.e = r11;
                this.j.r();
            }
        }
        ncpVar.i(this.c.a, i, 2);
        this.c.K(i);
        int n = this.c.n() + 6;
        if (nnyVar == null) {
            ncpVar.l(n);
            return i;
        }
        this.c.G(n);
        ncpVar.j(this.c.a, i, n);
        this.c.K(6);
        luv luvVar3 = this.c;
        luvVar3.F(nnyVar.c.a, i, 3);
        nnyVar.c.l(i);
        nnyVar.c.n(8);
        nnyVar.d = nnyVar.c.p();
        nnyVar.e = nnyVar.c.p();
        nnyVar.c.n(6);
        luvVar3.F(nnyVar.c.a, i, nnyVar.c.d(8));
        nnyVar.c.l(i);
        if (nnyVar.d) {
            nnyVar.c.n(4);
            long d = nnyVar.c.d(3);
            nnyVar.c.n(r11);
            int d2 = nnyVar.c.d(15) << 15;
            nnyVar.c.n(r11);
            long d3 = nnyVar.c.d(15);
            nnyVar.c.n(r11);
            if (nnyVar.f || !nnyVar.e) {
                j2 = d;
                c = 30;
            } else {
                nnyVar.c.n(4);
                c = 30;
                nnyVar.c.n(r11);
                int d4 = nnyVar.c.d(15) << 15;
                nnyVar.c.n(r11);
                j2 = d;
                long d5 = nnyVar.c.d(15);
                nnyVar.c.n(r11);
                nnyVar.b.b(d5 | d4 | (nnyVar.c.d(3) << 30));
                nnyVar.f = true;
            }
            j = nnyVar.b.b((j2 << c) | d2 | d3);
        } else {
            j = 0;
        }
        nnyVar.a.d(j, 4);
        nnyVar.a.a(luvVar3);
        nnyVar.a.c(false);
        luv luvVar4 = this.c;
        luvVar4.J(luvVar4.c());
        return 0;
    }

    @Override // defpackage.nco
    public final void c(ncr ncrVar) {
        this.j = ncrVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001f, code lost:
    
        if (r0 != r7) goto L10;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0035 A[LOOP:0: B:13:0x002d->B:15:0x0035, LOOP_END] */
    @Override // defpackage.nco
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(long r5, long r7) {
        /*
            r4 = this;
            lvc r5 = r4.a
            long r0 = r5.f()
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 == 0) goto L21
            long r0 = r5.d()
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 == 0) goto L24
            r2 = 0
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 == 0) goto L24
            int r6 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r6 == 0) goto L24
        L21:
            r5.i(r7)
        L24:
            nnw r5 = r4.i
            r6 = 0
            if (r5 == 0) goto L2c
            r5.b(r7)
        L2c:
            r5 = r6
        L2d:
            android.util.SparseArray r7 = r4.b
            int r7 = r7.size()
            if (r5 >= r7) goto L47
            android.util.SparseArray r7 = r4.b
            java.lang.Object r7 = r7.valueAt(r5)
            nny r7 = (defpackage.nny) r7
            r7.f = r6
            nnb r7 = r7.a
            r7.e()
            int r5 = r5 + 1
            goto L2d
        L47:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nnz.e(long, long):void");
    }

    @Override // defpackage.nco
    public final boolean f(ncp ncpVar) {
        byte[] bArr = new byte[14];
        ncpVar.i(bArr, 0, 14);
        if ((((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) != 442 || (bArr[4] & 196) != 68 || (bArr[6] & 4) != 4 || (bArr[8] & 4) != 4 || (bArr[9] & 1) != 1 || (bArr[12] & 3) != 3) {
            return false;
        }
        ncpVar.g(bArr[13] & 7);
        ncpVar.i(bArr, 0, 3);
        return ((((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8)) | (bArr[2] & 255)) == 1;
    }

    @Override // defpackage.nco
    public final /* synthetic */ List x() {
        int i = engw.d;
        return enou.a;
    }

    @Override // defpackage.nco
    public final void d() {
    }

    @Override // defpackage.nco
    public final /* synthetic */ void g() {
    }
}
