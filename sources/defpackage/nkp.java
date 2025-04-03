package defpackage;

import androidx.car.app.hardware.info.EnergyProfile;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nkp extends nky {
    private boolean A;
    private long B;
    private final int l;
    private final int m;
    private final int n;
    private final long o;
    private List r;
    private List s;
    private int t;
    private int u;
    private boolean v;
    private boolean w;
    private byte x;
    private byte y;
    private static final int[] d = {11, 1, 3, 12, 14, 5, 7, 9};
    private static final int[] e = {0, 4, 8, 12, 16, 20, 24, 28};
    public static final int[] a = {-1, -16711936, -16776961, -16711681, -65536, -256, -65281};
    private static final int[] f = {32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 225, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 233, 93, 237, 243, 250, 97, 98, 99, 100, EnergyProfile.EVCONNECTOR_TYPE_OTHER, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 231, 247, 209, 241, 9632};
    private static final int[] g = {174, 176, 189, 191, 8482, 162, 163, 9834, 224, 32, 232, 226, 234, 238, 244, 251};
    private static final int[] h = {193, BasePaymentResult.ERROR_REQUEST_TIMEOUT, 211, 218, 220, 252, 8216, 161, 42, 39, 8212, 169, 8480, 8226, 8220, 8221, 192, 194, 199, BasePaymentResult.ERROR_REQUEST_FAILED, BasePaymentResult.ERROR_REQUEST_CONNECTION_FAILED, BasePaymentResult.ERROR_BOT_DOMAIN_NOT_WHITELISTED, 235, 206, 207, 239, 212, 217, 249, 219, 171, 187};
    private static final int[] i = {195, 227, 205, 204, 236, 210, 242, 213, 245, 123, 125, 92, 94, 95, 124, 126, 196, 228, 214, 246, 223, 165, 164, 9474, 197, 229, 216, 248, 9484, 9488, 9492, 9496};
    private static final boolean[] j = {false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false};
    private final luv k = new luv();
    private final ArrayList p = new ArrayList();
    private nko q = new nko(0, 4);
    private int z = 0;

    public nkp(String str, int i2) {
        lti.a(true);
        this.o = 16000000L;
        this.l = true != "application/x-mp4-cea-608".equals(str) ? 3 : 2;
        if (i2 == 1) {
            this.n = 0;
        } else {
            if (i2 != 2) {
                if (i2 == 3) {
                    this.n = 0;
                } else {
                    if (i2 != 4) {
                        luj.f("Cea608Decoder", "Invalid channel. Defaulting to CC1.");
                        this.n = 0;
                        this.m = 0;
                        n(0);
                        m();
                        this.A = true;
                        this.B = -9223372036854775807L;
                    }
                    this.n = 1;
                }
                this.m = 1;
                n(0);
                m();
                this.A = true;
                this.B = -9223372036854775807L;
            }
            this.n = 1;
        }
        this.m = 0;
        n(0);
        m();
        this.A = true;
        this.B = -9223372036854775807L;
    }

    private static char k(byte b) {
        return (char) f[b - 32];
    }

    private final List l() {
        int size = this.p.size();
        ArrayList arrayList = new ArrayList(size);
        int i2 = 2;
        for (int i3 = 0; i3 < size; i3++) {
            lsz b = ((nko) this.p.get(i3)).b(Integer.MIN_VALUE);
            arrayList.add(b);
            if (b != null) {
                i2 = Math.min(i2, b.B);
            }
        }
        ArrayList arrayList2 = new ArrayList(size);
        for (int i4 = 0; i4 < size; i4++) {
            lsz lszVar = (lsz) arrayList.get(i4);
            if (lszVar != null) {
                if (lszVar.B != i2) {
                    lszVar = ((nko) this.p.get(i4)).b(i2);
                    lti.f(lszVar);
                }
                arrayList2.add(lszVar);
            }
        }
        return arrayList2;
    }

    private final void m() {
        this.q.e(this.t);
        this.p.clear();
        this.p.add(this.q);
    }

    private final void n(int i2) {
        int i3 = this.t;
        if (i3 == i2) {
            return;
        }
        this.t = i2;
        if (i2 == 3) {
            for (int i4 = 0; i4 < this.p.size(); i4++) {
                ((nko) this.p.get(i4)).g = 3;
            }
            return;
        }
        m();
        if (i3 == 3 || i2 == 1 || i2 == 0) {
            this.r = Collections.EMPTY_LIST;
        }
    }

    private final void o(int i2) {
        this.u = i2;
        this.q.h = i2;
    }

    private static boolean p(byte b) {
        return (b & 224) == 0;
    }

    @Override // defpackage.nky, defpackage.lxw
    public final /* bridge */ /* synthetic */ Object b() {
        return b();
    }

    @Override // defpackage.nky, defpackage.lxw
    public final void c() {
        super.c();
        this.r = null;
        this.s = null;
        n(0);
        o(4);
        m();
        this.v = false;
        this.w = false;
        this.x = (byte) 0;
        this.y = (byte) 0;
        this.z = 0;
        this.A = true;
        this.B = -9223372036854775807L;
    }

    @Override // defpackage.nky
    protected final njw g() {
        List list = this.r;
        this.s = list;
        lti.f(list);
        return new nkz(list);
    }

    @Override // defpackage.nky
    /* renamed from: h */
    public final nkd b() {
        nkd nkdVar;
        nkd b = super.b();
        if (b != null) {
            return b;
        }
        long j2 = this.o;
        long j3 = this.B;
        if (j3 == -9223372036854775807L || this.c - j3 < j2 || (nkdVar = (nkd) this.b.pollFirst()) == null) {
            return null;
        }
        this.r = Collections.EMPTY_LIST;
        this.B = -9223372036854775807L;
        nkdVar.i(this.c, g(), Long.MAX_VALUE);
        return nkdVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:157:0x0085 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008c A[SYNTHETIC] */
    @Override // defpackage.nky
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final void i(defpackage.nkc r17) {
        /*
            Method dump skipped, instructions count: 648
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nkp.i(nkc):void");
    }

    @Override // defpackage.nky
    protected final boolean j() {
        return this.r != this.s;
    }

    @Override // defpackage.nky, defpackage.lxw
    public final void e() {
    }
}
