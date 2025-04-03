package defpackage;

import android.util.SparseArray;
import com.android.vcard.VCardConfig;
import j$.util.DesugarCollections;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import org.chromium.net.PrivateKeyType;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nhd implements nco {
    public static final Map c;
    private final nhf C;
    private final SparseArray D;
    private final boolean E;
    private final nkh F;
    private final luv G;
    private final luv H;
    private final luv I;
    private final luv J;
    private final luv K;
    private final luv L;
    private final luv M;
    private final luv N;
    private final luv O;
    private final luv P;
    private ByteBuffer Q;
    private long R;
    private boolean S;
    private int T;
    private long U;
    private int V;
    private int W;
    private int[] X;
    private int Y;
    private int Z;
    private int aa;
    private int ab;
    private int ac;
    private int ad;
    private boolean ae;
    private boolean af;
    private boolean ag;
    private int ah;
    private byte ai;
    private boolean aj;
    private final nha ak;
    public final boolean d;
    public long e;
    public long f;
    public long g;
    public long h;
    public long i;
    public boolean j;
    public nhc k;
    public boolean l;
    public int m;
    public long n;
    public boolean o;
    public long p;
    public long q;
    public luk r;
    public luk s;
    public boolean t;
    public long u;
    public int v;
    public boolean w;
    public long x;
    public ncr y;
    private static final byte[] z = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};
    public static final byte[] a = lvf.ae("Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text");
    private static final byte[] A = {68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
    private static final byte[] B = {87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 10};
    public static final UUID b = new UUID(72057594037932032L, -9223371306706625679L);

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("htc_video_rotA-000", 0);
        hashMap.put("htc_video_rotA-090", 90);
        hashMap.put("htc_video_rotA-180", 180);
        hashMap.put("htc_video_rotA-270", 270);
        c = DesugarCollections.unmodifiableMap(hashMap);
    }

    @Deprecated
    public nhd() {
        this(new nha(), 2, nkh.a);
    }

    private final int n() {
        int i = this.ac;
        s();
        return i;
    }

    private final int o(ncp ncpVar, nhc nhcVar, int i, boolean z2) {
        int i2;
        if ("S_TEXT/UTF8".equals(nhcVar.c)) {
            t(ncpVar, z, i);
            return n();
        }
        if ("S_TEXT/ASS".equals(nhcVar.c)) {
            t(ncpVar, A, i);
            return n();
        }
        if ("S_TEXT/WEBVTT".equals(nhcVar.c)) {
            t(ncpVar, B, i);
            return n();
        }
        ndu nduVar = nhcVar.Z;
        if (!this.ae) {
            if (nhcVar.i) {
                this.aa &= -1073741825;
                if (!this.af) {
                    ncpVar.j(this.I.a, 0, 1);
                    this.ab++;
                    byte b2 = this.I.a[0];
                    if ((b2 & 128) == 128) {
                        throw new lrg("Extension bit is set in signal byte", null, true, 1);
                    }
                    this.ai = b2;
                    this.af = true;
                }
                byte b3 = this.ai;
                if ((b3 & 1) == 1) {
                    int i3 = b3 & 2;
                    this.aa |= 1073741824;
                    if (!this.aj) {
                        ncpVar.j(this.N.a, 0, 8);
                        this.ab += 8;
                        this.aj = true;
                        luv luvVar = this.I;
                        luvVar.a[0] = (byte) ((i3 != 2 ? 0 : 128) | 8);
                        luvVar.K(0);
                        nduVar.n(this.I, 1, 1);
                        this.ac++;
                        this.N.K(0);
                        nduVar.n(this.N, 8, 1);
                        this.ac += 8;
                    }
                    if (i3 == 2) {
                        if (!this.ag) {
                            ncpVar.j(this.I.a, 0, 1);
                            this.ab++;
                            this.I.K(0);
                            this.ah = this.I.j();
                            this.ag = true;
                        }
                        int i4 = this.ah * 4;
                        this.I.G(i4);
                        ncpVar.j(this.I.a, 0, i4);
                        this.ab += i4;
                        int i5 = (this.ah >> 1) + 1;
                        int i6 = (i5 * 6) + 2;
                        ByteBuffer byteBuffer = this.Q;
                        if (byteBuffer == null || byteBuffer.capacity() < i6) {
                            this.Q = ByteBuffer.allocate(i6);
                        }
                        this.Q.position(0);
                        this.Q.putShort((short) i5);
                        int i7 = 0;
                        int i8 = 0;
                        while (true) {
                            i2 = this.ah;
                            if (i7 >= i2) {
                                break;
                            }
                            int m = this.I.m();
                            int i9 = m - i8;
                            if (i7 % 2 == 0) {
                                this.Q.putShort((short) i9);
                            } else {
                                this.Q.putInt(i9);
                            }
                            i7++;
                            i8 = m;
                        }
                        int i10 = (i - this.ab) - i8;
                        if ((i2 & 1) == 1) {
                            this.Q.putInt(i10);
                        } else {
                            this.Q.putShort((short) i10);
                            this.Q.putInt(0);
                        }
                        this.O.I(this.Q.array(), i6);
                        nduVar.n(this.O, i6, 1);
                        this.ac += i6;
                    }
                }
            } else {
                byte[] bArr = nhcVar.j;
                if (bArr != null) {
                    this.L.I(bArr, bArr.length);
                }
            }
            if (!"A_OPUS".equals(nhcVar.c) ? nhcVar.g > 0 : z2) {
                this.aa |= VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES;
                this.P.G(0);
                int i11 = (this.L.c + i) - this.ab;
                this.I.G(4);
                luv luvVar2 = this.I;
                byte[] bArr2 = luvVar2.a;
                bArr2[0] = (byte) ((i11 >> 24) & PrivateKeyType.INVALID);
                bArr2[1] = (byte) ((i11 >> 16) & PrivateKeyType.INVALID);
                bArr2[2] = (byte) ((i11 >> 8) & PrivateKeyType.INVALID);
                bArr2[3] = (byte) (i11 & PrivateKeyType.INVALID);
                nduVar.n(luvVar2, 4, 2);
                this.ac += 4;
            }
            this.ae = true;
        }
        int i12 = i + this.L.c;
        if (!"V_MPEG4/ISO/AVC".equals(nhcVar.c) && !"V_MPEGH/ISO/HEVC".equals(nhcVar.c)) {
            if (nhcVar.V != null) {
                lti.c(this.L.c == 0);
                nhcVar.V.d(ncpVar);
            }
            while (true) {
                int i13 = this.ab;
                if (i13 >= i12) {
                    break;
                }
                int p = p(ncpVar, nduVar, i12 - i13);
                this.ab += p;
                this.ac += p;
            }
        } else {
            byte[] bArr3 = this.H.a;
            bArr3[0] = 0;
            bArr3[1] = 0;
            bArr3[2] = 0;
            int i14 = nhcVar.aa;
            int i15 = 4 - i14;
            while (this.ab < i12) {
                int i16 = this.ad;
                if (i16 == 0) {
                    int min = Math.min(i14, this.L.b());
                    ncpVar.j(bArr3, i15 + min, i14 - min);
                    if (min > 0) {
                        this.L.F(bArr3, i15, min);
                    }
                    this.ab += i14;
                    this.H.K(0);
                    this.ad = this.H.m();
                    this.G.K(0);
                    nduVar.m(this.G, 4);
                    this.ac += 4;
                } else {
                    int p2 = p(ncpVar, nduVar, i16);
                    this.ab += p2;
                    this.ac += p2;
                    this.ad -= p2;
                }
            }
        }
        if ("A_VORBIS".equals(nhcVar.c)) {
            this.J.K(0);
            nduVar.m(this.J, 4);
            this.ac += 4;
        }
        return n();
    }

    private final int p(ncp ncpVar, ndu nduVar, int i) {
        int b2 = this.L.b();
        if (b2 <= 0) {
            return nduVar.e(ncpVar, i, false);
        }
        int min = Math.min(i, b2);
        nduVar.m(this.L, min);
        return min;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d4 A[EDGE_INSN: B:50:0x00d4->B:49:0x00d4 BREAK  A[LOOP:0: B:42:0x00c1->B:46:0x00d1], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00b1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void q(defpackage.nhc r18, long r19, int r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nhd.q(nhc, long, int, int, int):void");
    }

    private final void r(ncp ncpVar, int i) {
        luv luvVar = this.I;
        if (luvVar.c >= i) {
            return;
        }
        if (luvVar.c() < i) {
            luv luvVar2 = this.I;
            int c2 = luvVar2.c();
            luvVar2.D(Math.max(c2 + c2, i));
        }
        luv luvVar3 = this.I;
        byte[] bArr = luvVar3.a;
        int i2 = luvVar3.c;
        ncpVar.j(bArr, i2, i - i2);
        this.I.J(i);
    }

    private final void s() {
        this.ab = 0;
        this.ac = 0;
        this.ad = 0;
        this.ae = false;
        this.af = false;
        this.ag = false;
        this.ah = 0;
        this.ai = (byte) 0;
        this.aj = false;
        this.L.G(0);
    }

    private final void t(ncp ncpVar, byte[] bArr, int i) {
        int length = bArr.length;
        int i2 = length + i;
        if (this.M.c() < i2) {
            this.M.H(Arrays.copyOf(bArr, i2 + i));
        } else {
            System.arraycopy(bArr, 0, this.M.a, 0, length);
        }
        ncpVar.j(this.M.a, length, i);
        this.M.K(0);
        this.M.J(i2);
    }

    private static byte[] u(long j, String str, long j2) {
        lti.a(j != -9223372036854775807L);
        Locale locale = Locale.US;
        int i = (int) (j / 3600000000L);
        Integer valueOf = Integer.valueOf(i);
        long j3 = j - (i * 3600000000L);
        int i2 = (int) (j3 / 60000000);
        Integer valueOf2 = Integer.valueOf(i2);
        long j4 = j3 - (i2 * 60000000);
        int i3 = (int) (j4 / 1000000);
        return lvf.ae(String.format(locale, str, valueOf, valueOf2, Integer.valueOf(i3), Integer.valueOf((int) ((j4 - (i3 * 1000000)) / j2))));
    }

    private static int[] v(int[] iArr, int i) {
        if (iArr == null) {
            return new int[i];
        }
        int length = iArr.length;
        return length >= i ? iArr : new int[Math.max(length + length, i)];
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0c40, code lost:
    
        r2 = ((defpackage.nce) r36).b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0c47, code lost:
    
        if (r35.o == false) goto L632;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0c59, code lost:
    
        if (r35.l == false) goto L659;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0c5b, code lost:
    
        r4 = r35.R;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0c5f, code lost:
    
        if (r4 == (-1)) goto L660;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0c61, code lost:
    
        r37.a = r4;
        r35.R = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:?, code lost:
    
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0c69, code lost:
    
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0c49, code lost:
    
        r35.R = r2;
        r37.a = r35.p;
        r35.o = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0c53, code lost:
    
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:671:0x0a97, code lost:
    
        if (r2 == 1) goto L551;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0711  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x072b  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x073a  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0935  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0949  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x094c  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0747  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x077d  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x086e  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0888  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x08d9  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0869  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x072d  */
    /* JADX WARN: Type inference failed for: r14v11, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v96 */
    @Override // defpackage.nco
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int a(defpackage.ncp r36, defpackage.ndk r37) {
        /*
            Method dump skipped, instructions count: 4012
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nhd.a(ncp, ndk):int");
    }

    @Override // defpackage.nco
    public final void c(ncr ncrVar) {
        if (this.E) {
            ncrVar = new nkk(ncrVar, this.F);
        }
        this.y = ncrVar;
    }

    @Override // defpackage.nco
    public final void e(long j, long j2) {
        this.q = -9223372036854775807L;
        this.T = 0;
        nha nhaVar = this.ak;
        nhaVar.d = 0;
        nhaVar.b.clear();
        nhaVar.c.d();
        this.C.d();
        s();
        for (int i = 0; i < this.D.size(); i++) {
            ndv ndvVar = ((nhc) this.D.valueAt(i)).V;
            if (ndvVar != null) {
                ndvVar.b();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0092, code lost:
    
        return false;
     */
    @Override // defpackage.nco
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean f(defpackage.ncp r14) {
        /*
            r13 = this;
            nhe r0 = new nhe
            r0.<init>()
            r1 = r14
            nce r1 = (defpackage.nce) r1
            long r1 = r1.a
            r3 = -1
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            r4 = 1024(0x400, double:5.06E-321)
            if (r3 == 0) goto L18
            int r6 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r6 <= 0) goto L17
            goto L18
        L17:
            r4 = r1
        L18:
            luv r6 = r0.a
            byte[] r6 = r6.a
            r7 = 0
            r8 = 4
            r14.i(r6, r7, r8)
            luv r6 = r0.a
            long r9 = r6.r()
            r0.b = r8
        L29:
            r11 = 440786851(0x1a45dfa3, double:2.1777764E-315)
            int r6 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            r8 = 1
            if (r6 == 0) goto L54
            int r6 = (int) r4
            int r11 = r0.b
            int r11 = r11 + r8
            r0.b = r11
            if (r11 != r6) goto L3a
            goto L92
        L3a:
            luv r6 = r0.a
            byte[] r6 = r6.a
            r14.i(r6, r7, r8)
            r6 = 8
            long r8 = r9 << r6
            luv r6 = r0.a
            byte[] r6 = r6.a
            r6 = r6[r7]
            r6 = r6 & 255(0xff, float:3.57E-43)
            r10 = -256(0xffffffffffffff00, double:NaN)
            long r8 = r8 & r10
            long r10 = (long) r6
            long r8 = r8 | r10
            r9 = r8
            goto L29
        L54:
            long r4 = r0.a(r14)
            int r6 = r0.b
            long r9 = (long) r6
            r11 = -9223372036854775808
            int r6 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            if (r6 == 0) goto L92
            long r9 = r9 + r4
            if (r3 != 0) goto L65
            goto L6a
        L65:
            int r1 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r1 < 0) goto L6a
            goto L92
        L6a:
            int r1 = r0.b
            long r1 = (long) r1
            int r1 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r1 >= 0) goto L8f
            long r1 = r0.a(r14)
            int r1 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r1 == 0) goto L92
            long r1 = r0.a(r14)
            r3 = 0
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 < 0) goto L92
            if (r3 == 0) goto L6a
            int r1 = (int) r1
            r14.g(r1)
            int r2 = r0.b
            int r2 = r2 + r1
            r0.b = r2
            goto L6a
        L8f:
            if (r1 != 0) goto L92
            return r8
        L92:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nhd.f(ncp):boolean");
    }

    public final long h(long j) {
        long j2 = this.g;
        if (j2 != -9223372036854775807L) {
            return lvf.w(j, j2, 1000L);
        }
        throw new lrg("Can't scale timecode prior to timecodeScale being set.", null, true, 1);
    }

    protected final nhc i(int i) {
        k(i);
        return this.k;
    }

    public final void j(int i) {
        if (this.r == null || this.s == null) {
            throw new lrg(a.f(i, "Element ", " must be in a Cues"), null, true, 1);
        }
    }

    public final void k(int i) {
        if (this.k == null) {
            throw new lrg(a.f(i, "Element ", " must be in a TrackEntry"), null, true, 1);
        }
    }

    public final void l() {
        lti.g(this.y);
    }

    /* JADX WARN: Code restructure failed: missing block: B:134:0x0258, code lost:
    
        throw new defpackage.lrg("EBML lacing sample size out of range.", null, true, 1);
     */
    /* JADX WARN: Removed duplicated region for block: B:65:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x02a4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final void m(int r25, int r26, defpackage.ncp r27) {
        /*
            Method dump skipped, instructions count: 771
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nhd.m(int, int, ncp):void");
    }

    @Override // defpackage.nco
    public final /* synthetic */ List x() {
        int i = engw.d;
        return enou.a;
    }

    public nhd(nha nhaVar, int i, nkh nkhVar) {
        this.f = -1L;
        this.g = -9223372036854775807L;
        this.h = -9223372036854775807L;
        this.i = -9223372036854775807L;
        this.p = -1L;
        this.R = -1L;
        this.q = -9223372036854775807L;
        this.ak = nhaVar;
        nhaVar.g = new nhb(this);
        this.F = nkhVar;
        this.d = 1 == ((i & 1) ^ 1);
        this.E = (i & 2) == 0;
        this.C = new nhf();
        this.D = new SparseArray();
        this.I = new luv(4);
        this.J = new luv(ByteBuffer.allocate(4).putInt(-1).array());
        this.K = new luv(4);
        this.G = new luv(lwa.a);
        this.H = new luv(4);
        this.L = new luv();
        this.M = new luv();
        this.N = new luv(8);
        this.O = new luv();
        this.P = new luv();
        this.X = new int[1];
    }

    @Override // defpackage.nco
    public final void d() {
    }

    @Override // defpackage.nco
    public final /* synthetic */ void g() {
    }
}
