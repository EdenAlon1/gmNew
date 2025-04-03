package defpackage;

import android.database.Cursor;
import android.net.Uri;
import j$.time.Instant;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bvoq extends dtsr implements bvms {
    @Deprecated
    public bvoq(dtve dtveVar, Cursor cursor, String[] strArr, dtzj[] dtzjVarArr, dtyo dtyoVar, dtvs dtvsVar, bvou bvouVar) {
        super(dtveVar, cursor, strArr, dtzjVarArr, bvoy.a, dtyoVar, dtvsVar, bvouVar);
    }

    public final cjwi A() {
        return cjwi.b(getInt(cM(45, bvoy.a)));
    }

    public final csgg B() {
        csgg[] values = csgg.values();
        int i = getInt(cM(41, bvoy.a));
        if (i < values.length) {
            return values[i];
        }
        throw new IllegalArgumentException();
    }

    public final Instant C() {
        return bdgw.b(getLong(cM(1, bvoy.a)));
    }

    public final String D() {
        return getString(cM(30, bvoy.a));
    }

    public final String E() {
        return getString(cM(33, bvoy.a));
    }

    public final String F() {
        return getString(cM(11, bvoy.a));
    }

    public final String G() {
        return getString(cM(27, bvoy.a));
    }

    public final String H() {
        return getString(cM(12, bvoy.a));
    }

    public final String I() {
        return getString(cM(10, bvoy.a));
    }

    public final String J() {
        return getString(cM(40, bvoy.a));
    }

    public final String K() {
        return getString(cM(16, bvoy.a));
    }

    public final String L() {
        return getString(cM(15, bvoy.a));
    }

    public final String M() {
        return getString(cM(0, bvoy.a));
    }

    public final String N() {
        return getString(cM(20, bvoy.a));
    }

    public final String O() {
        return getString(cM(8, bvoy.a));
    }

    public final String P() {
        return getString(cM(3, bvoy.a));
    }

    public final String Q() {
        return getString(cM(35, bvoy.a));
    }

    public final String R() {
        return getString(cM(14, bvoy.a));
    }

    public final String S() {
        return getString(cM(9, bvoy.a));
    }

    public final String T() {
        return getString(cM(25, bvoy.a));
    }

    public final boolean U() {
        return getInt(cM(24, bvoy.a)) == 1;
    }

    public final boolean V() {
        return getInt(cM(38, bvoy.a)) == 1;
    }

    public final boolean W() {
        return getInt(cM(48, bvoy.a)) == 1;
    }

    public final boolean X() {
        return getInt(cM(31, bvoy.a)) == 1;
    }

    public final boolean Y() {
        return getInt(cM(39, bvoy.a)) == 1;
    }

    public final byte[] Z() {
        return getBlob(cM(36, bvoy.a));
    }

    @Override // defpackage.dtsr
    protected final /* synthetic */ dtro b() {
        return new bvis();
    }

    public final int c() {
        return getInt(cM(21, bvoy.a));
    }

    public final int e() {
        return getInt(cM(22, bvoy.a));
    }

    public final int f() {
        return getInt(cM(23, bvoy.a));
    }

    @Override // defpackage.dtsr
    public final engw fI(dtvn dtvnVar) {
        Instant[] instantArr;
        azsu[] azsuVarArr;
        azsu[] azsuVarArr2;
        int i;
        String[] strArr;
        long[] jArr;
        String[] strArr2;
        String[] strArr3;
        String[] strArr4;
        String[] strArr5;
        String[] strArr6;
        String[] strArr7;
        String[] strArr8;
        String[] strArr9;
        azsu[] azsuVarArr3;
        String[] strArr10;
        String[] strArr11;
        String[] strArr12;
        String[] strArr13;
        String[] strArr14;
        String[] strArr15;
        String[] strArr16;
        Uri[] uriArr;
        Uri[] uriArr2;
        Uri[] uriArr3;
        long[] jArr2;
        String[] strArr17;
        String[] strArr18;
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        int[] iArr4;
        boolean[] zArr;
        boolean[] zArr2;
        int[] iArr5;
        String[] strArr19;
        String[] strArr20;
        Uri[] uriArr4;
        String[] strArr21;
        int[] iArr6;
        int[] iArr7;
        int[] iArr8;
        String[] strArr22;
        String[] strArr23;
        boolean[] zArr3;
        int[] iArr9;
        int[] iArr10;
        String[] strArr24;
        String[] strArr25;
        String[] strArr26;
        boolean z;
        String[] strArr27;
        byzi[] byziVarArr;
        String[] strArr28;
        boolean[] zArr4;
        boolean[] zArr5;
        boolean[] zArr6;
        boolean[] zArr7;
        byte[][] bArr;
        String[] strArr29;
        String[] strArr30;
        byzi[] byziVarArr2;
        long[] jArr3;
        csgg[] csggVarArr;
        aorb[] aorbVarArr;
        bdpy[] bdpyVarArr;
        bdpy[] bdpyVarArr2;
        aorb[] aorbVarArr2;
        cjwi[] cjwiVarArr;
        cjwi[] cjwiVarArr2;
        cjwi[] cjwiVarArr3;
        cjwi[] cjwiVarArr4;
        cjwe[] cjweVarArr;
        cjwe[] cjweVarArr2;
        aqkt[] aqktVarArr;
        int i2;
        boolean[] zArr8;
        boolean[] zArr9;
        aqkt[] aqktVarArr2;
        int i3;
        Iterator it;
        aqkt aqktVar;
        dtyq dtyqVar = dtvnVar.a;
        long[] dB = dB(getString(dtvnVar.h + 1));
        int length = dB.length;
        if (length == 0 || (length == 1 && dB[0] == -1)) {
            int i4 = engw.d;
            return enou.a;
        }
        HashSet hashSet = new HashSet();
        dtvs dtvsVar = this.d;
        boolean di = di(0);
        boolean z2 = dtvsVar.b;
        String[] strArr31 = di ? z2 ? (String[]) dtub.C(null, dt(getString(cM(0, bvoy.a))), new String[0]) : new String[]{M()} : null;
        dtsr.dz(length, strArr31, new emyl() { // from class: bvmt
            @Override // defpackage.emyl
            public final Object get() {
                return "_id:".concat(String.valueOf(bvoq.this.getString(0)));
            }
        });
        if (!di(1)) {
            instantArr = null;
        } else if (z2) {
            long[] ds = ds(getString(cM(1, bvoy.a)));
            int length2 = ds.length;
            Instant[] instantArr2 = new Instant[length2];
            for (int i5 = 0; i5 < length2; i5++) {
                instantArr2[i5] = bdgw.b(ds[i5]);
            }
            instantArr = (Instant[]) dtub.C(null, instantArr2, new Instant[0]);
        } else {
            instantArr = new Instant[]{C()};
        }
        dtsr.dz(length, instantArr, new emyl() { // from class: bvmv
            @Override // defpackage.emyl
            public final Object get() {
                return "operation_datetime:".concat(String.valueOf(bvoq.this.getString(1)));
            }
        });
        long[] B = di(2) ? z2 ? dtub.B(null, ds(getString(cM(2, bvoy.a)))) : new long[]{o()} : null;
        dtsr.dy(length, B, new emyl() { // from class: bvnh
            @Override // defpackage.emyl
            public final Object get() {
                return "operation_type:".concat(String.valueOf(bvoq.this.getString(2)));
            }
        });
        String[] strArr32 = di(3) ? z2 ? (String[]) dtub.C(null, dt(getString(cM(3, bvoy.a))), new String[0]) : new String[]{P()} : null;
        dtsr.dz(length, strArr32, new emyl() { // from class: bvnt
            @Override // defpackage.emyl
            public final Object get() {
                return "participant_id:".concat(String.valueOf(bvoq.this.getString(3)));
            }
        });
        if (!di(4)) {
            azsuVarArr = null;
        } else if (z2) {
            String[] dt = dt(getString(cM(4, bvoy.a)));
            int length3 = dt.length;
            azsu[] azsuVarArr4 = new azsu[length3];
            for (int i6 = 0; i6 < length3; i6++) {
                azsuVarArr4[i6] = azsv.a(dt[i6]);
            }
            azsuVarArr = (azsu[]) dtub.C(null, azsuVarArr4, new azsu[0]);
        } else {
            azsuVarArr = new azsu[]{u()};
        }
        dtsr.dz(length, azsuVarArr, new emyl() { // from class: bvoe
            @Override // defpackage.emyl
            public final Object get() {
                return "my_identity_token:".concat(String.valueOf(bvoq.this.getString(4)));
            }
        });
        if (!di(5)) {
            azsuVarArr2 = null;
        } else if (z2) {
            String[] dt2 = dt(getString(cM(5, bvoy.a)));
            int length4 = dt2.length;
            azsu[] azsuVarArr5 = new azsu[length4];
            for (int i7 = 0; i7 < length4; i7++) {
                azsuVarArr5[i7] = azsv.a(dt2[i7]);
            }
            azsuVarArr2 = (azsu[]) dtub.C(null, azsuVarArr5, new azsu[0]);
        } else {
            azsuVarArr2 = new azsu[]{v()};
        }
        dtsr.dz(length, azsuVarArr2, new emyl() { // from class: bvof
            @Override // defpackage.emyl
            public final Object get() {
                return "my_identity_token_foreign_key:".concat(String.valueOf(bvoq.this.getString(5)));
            }
        });
        int[] z3 = di(6) ? z2 ? dtub.z(null, dr(getString(cM(6, bvoy.a)))) : new int[]{j()} : null;
        dtsr.dx(length, z3, new emyl() { // from class: bvog
            @Override // defpackage.emyl
            public final Object get() {
                return "sub_id:".concat(String.valueOf(bvoq.this.getString(6)));
            }
        });
        int[] z4 = di(7) ? z2 ? dtub.z(null, dr(getString(cM(7, bvoy.a)))) : new int[]{i()} : null;
        dtsr.dx(length, z4, new emyl() { // from class: bvoh
            @Override // defpackage.emyl
            public final Object get() {
                return "sim_slot_id:".concat(String.valueOf(bvoq.this.getString(7)));
            }
        });
        if (!di(8)) {
            i = 0;
            strArr = null;
        } else if (z2) {
            i = 0;
            strArr = (String[]) dtub.C(null, dt(getString(cM(8, bvoy.a))), new String[0]);
        } else {
            i = 0;
            strArr = new String[]{O()};
        }
        dtsr.dz(length, strArr, new emyl() { // from class: bvoi
            @Override // defpackage.emyl
            public final Object get() {
                return "normalized_destination:".concat(String.valueOf(bvoq.this.getString(8)));
            }
        });
        if (!di(9)) {
            jArr = dB;
            strArr2 = null;
        } else if (z2) {
            jArr = dB;
            strArr2 = (String[]) dtub.C(null, dt(getString(cM(9, bvoy.a))), new String[i]);
        } else {
            jArr = dB;
            String[] strArr33 = new String[1];
            strArr33[i] = S();
            strArr2 = strArr33;
        }
        dtsr.dz(length, strArr2, new emyl() { // from class: bvoj
            @Override // defpackage.emyl
            public final Object get() {
                return "send_destination:".concat(String.valueOf(bvoq.this.getString(9)));
            }
        });
        if (!di(10)) {
            strArr3 = strArr2;
            strArr4 = null;
        } else if (z2) {
            strArr3 = strArr2;
            strArr4 = (String[]) dtub.C(null, dt(getString(cM(10, bvoy.a))), new String[0]);
        } else {
            strArr3 = strArr2;
            strArr4 = new String[]{I()};
        }
        dtsr.dz(length, strArr4, new emyl() { // from class: bvne
            @Override // defpackage.emyl
            public final Object get() {
                return "display_destination:".concat(String.valueOf(bvoq.this.getString(10)));
            }
        });
        if (!di(11)) {
            strArr5 = strArr4;
            strArr6 = null;
        } else if (z2) {
            strArr5 = strArr4;
            strArr6 = (String[]) dtub.C(null, dt(getString(cM(11, bvoy.a))), new String[0]);
        } else {
            strArr5 = strArr4;
            strArr6 = new String[]{F()};
        }
        dtsr.dz(length, strArr6, new emyl() { // from class: bvnp
            @Override // defpackage.emyl
            public final Object get() {
                return "comparable_destination:".concat(String.valueOf(bvoq.this.getString(11)));
            }
        });
        if (!di(12)) {
            strArr7 = strArr6;
            strArr8 = null;
        } else if (z2) {
            strArr7 = strArr6;
            strArr8 = (String[]) dtub.C(null, dt(getString(cM(12, bvoy.a))), new String[0]);
        } else {
            strArr7 = strArr6;
            strArr8 = new String[]{H()};
        }
        dtsr.dz(length, strArr8, new emyl() { // from class: bvoa
            @Override // defpackage.emyl
            public final Object get() {
                return "country_code:".concat(String.valueOf(bvoq.this.getString(12)));
            }
        });
        long[] B2 = di(13) ? z2 ? dtub.B(null, ds(getString(cM(13, bvoy.a)))) : new long[]{p()} : null;
        dtsr.dy(length, B2, new emyl() { // from class: bvok
            @Override // defpackage.emyl
            public final Object get() {
                return "recipient_id:".concat(String.valueOf(bvoq.this.getString(13)));
            }
        });
        if (!di(14)) {
            strArr9 = strArr8;
            azsuVarArr3 = azsuVarArr2;
            strArr10 = null;
        } else if (z2) {
            strArr9 = strArr8;
            azsuVarArr3 = azsuVarArr2;
            strArr10 = (String[]) dtub.C(null, dt(getString(cM(14, bvoy.a))), new String[0]);
        } else {
            strArr9 = strArr8;
            azsuVarArr3 = azsuVarArr2;
            strArr10 = new String[]{R()};
        }
        dtsr.dz(length, strArr10, new emyl() { // from class: bvol
            @Override // defpackage.emyl
            public final Object get() {
                return "recipient_canonical_address:".concat(String.valueOf(bvoq.this.getString(14)));
            }
        });
        if (!di(15)) {
            strArr11 = strArr10;
            strArr12 = null;
        } else if (z2) {
            strArr11 = strArr10;
            strArr12 = (String[]) dtub.C(null, dt(getString(cM(15, bvoy.a))), new String[0]);
        } else {
            strArr11 = strArr10;
            strArr12 = new String[]{L()};
        }
        dtsr.dz(length, strArr12, new emyl() { // from class: bvom
            @Override // defpackage.emyl
            public final Object get() {
                return "full_name:".concat(String.valueOf(bvoq.this.getString(15)));
            }
        });
        if (!di(16)) {
            strArr13 = strArr12;
            strArr14 = null;
        } else if (z2) {
            strArr13 = strArr12;
            strArr14 = (String[]) dtub.C(null, dt(getString(cM(16, bvoy.a))), new String[0]);
        } else {
            strArr13 = strArr12;
            strArr14 = new String[]{K()};
        }
        dtsr.dz(length, strArr14, new emyl() { // from class: bvon
            @Override // defpackage.emyl
            public final Object get() {
                return "first_name:".concat(String.valueOf(bvoq.this.getString(16)));
            }
        });
        if (!di(17)) {
            strArr15 = strArr14;
            strArr16 = strArr;
            uriArr = null;
        } else if (z2) {
            String[] dt3 = dt(getString(cM(17, bvoy.a)));
            int length5 = dt3.length;
            strArr15 = strArr14;
            Uri[] uriArr5 = new Uri[length5];
            strArr16 = strArr;
            int i8 = 0;
            int i9 = 0;
            while (i8 < length5) {
                String str = dt3[i8];
                int i10 = i9 + 1;
                uriArr5[i9] = (str == null || str.length() == 0) ? null : Uri.parse(str);
                i8++;
                i9 = i10;
            }
            uriArr = (Uri[]) dtub.C(null, uriArr5, new Uri[0]);
        } else {
            strArr15 = strArr14;
            strArr16 = strArr;
            uriArr = new Uri[]{r()};
        }
        dtsr.dz(length, uriArr, new emyl() { // from class: bvoo
            @Override // defpackage.emyl
            public final Object get() {
                return "profile_photo_uri:".concat(String.valueOf(bvoq.this.getString(17)));
            }
        });
        if (!di(18)) {
            uriArr2 = null;
        } else if (z2) {
            String[] dt4 = dt(getString(cM(18, bvoy.a)));
            int length6 = dt4.length;
            Uri[] uriArr6 = new Uri[length6];
            int i11 = 0;
            int i12 = 0;
            while (i11 < length6) {
                String str2 = dt4[i11];
                int i13 = i12 + 1;
                uriArr6[i12] = (str2 == null || str2.length() == 0) ? null : Uri.parse(str2);
                i11++;
                i12 = i13;
            }
            uriArr2 = (Uri[]) dtub.C(null, uriArr6, new Uri[0]);
        } else {
            uriArr2 = new Uri[]{q()};
        }
        dtsr.dz(length, uriArr2, new emyl() { // from class: bvop
            @Override // defpackage.emyl
            public final Object get() {
                return "contact_photo_uri:".concat(String.valueOf(bvoq.this.getString(18)));
            }
        });
        long[] B3 = di(19) ? z2 ? dtub.B(null, ds(getString(cM(19, bvoy.a)))) : new long[]{m()} : null;
        dtsr.dy(length, B3, new emyl() { // from class: bvmu
            @Override // defpackage.emyl
            public final Object get() {
                return "contact_id:".concat(String.valueOf(bvoq.this.getString(19)));
            }
        });
        if (!di(20)) {
            uriArr3 = uriArr2;
            jArr2 = B3;
            strArr17 = null;
        } else if (z2) {
            uriArr3 = uriArr2;
            jArr2 = B3;
            strArr17 = (String[]) dtub.C(null, dt(getString(cM(20, bvoy.a))), new String[0]);
        } else {
            uriArr3 = uriArr2;
            jArr2 = B3;
            strArr17 = new String[]{N()};
        }
        dtsr.dz(length, strArr17, new emyl() { // from class: bvmw
            @Override // defpackage.emyl
            public final Object get() {
                return "lookup_key:".concat(String.valueOf(bvoq.this.getString(20)));
            }
        });
        int[] z5 = di(21) ? z2 ? dtub.z(null, dr(getString(cM(21, bvoy.a)))) : new int[]{c()} : null;
        dtsr.dx(length, z5, new emyl() { // from class: bvmx
            @Override // defpackage.emyl
            public final Object get() {
                return "color_palette_index:".concat(String.valueOf(bvoq.this.getString(21)));
            }
        });
        if (!di(22)) {
            strArr18 = strArr17;
            iArr = null;
        } else if (z2) {
            strArr18 = strArr17;
            iArr = dtub.z(null, dr(getString(cM(22, bvoy.a))));
        } else {
            strArr18 = strArr17;
            iArr = new int[]{e()};
        }
        dtsr.dx(length, iArr, new emyl() { // from class: bvmy
            @Override // defpackage.emyl
            public final Object get() {
                return "color_type:".concat(String.valueOf(bvoq.this.getString(22)));
            }
        });
        if (!di(23)) {
            iArr2 = iArr;
            iArr3 = null;
        } else if (z2) {
            iArr2 = iArr;
            iArr3 = dtub.z(null, dr(getString(cM(23, bvoy.a))));
        } else {
            iArr2 = iArr;
            iArr3 = new int[]{f()};
        }
        dtsr.dx(length, iArr3, new emyl() { // from class: bvmz
            @Override // defpackage.emyl
            public final Object get() {
                return "extended_color:".concat(String.valueOf(bvoq.this.getString(23)));
            }
        });
        if (!di(24)) {
            iArr4 = iArr3;
            zArr = null;
        } else if (z2) {
            iArr4 = iArr3;
            zArr = dtub.D(null, du(getString(cM(24, bvoy.a))));
        } else {
            iArr4 = iArr3;
            zArr = new boolean[]{U()};
        }
        dtsr.dA(length, zArr, new emyl() { // from class: bvna
            @Override // defpackage.emyl
            public final Object get() {
                return "blocked:".concat(String.valueOf(bvoq.this.getString(24)));
            }
        });
        if (!di(25)) {
            zArr2 = zArr;
            iArr5 = z5;
            strArr19 = null;
        } else if (z2) {
            zArr2 = zArr;
            iArr5 = z5;
            strArr19 = (String[]) dtub.C(null, dt(getString(cM(25, bvoy.a))), new String[0]);
        } else {
            zArr2 = zArr;
            iArr5 = z5;
            strArr19 = new String[]{T()};
        }
        dtsr.dz(length, strArr19, new emyl() { // from class: bvnb
            @Override // defpackage.emyl
            public final Object get() {
                return "subscription_name:".concat(String.valueOf(bvoq.this.getString(25)));
            }
        });
        int[] z6 = di(26) ? z2 ? dtub.z(null, dr(getString(cM(26, bvoy.a)))) : new int[]{k()} : null;
        dtsr.dx(length, z6, new emyl() { // from class: bvnc
            @Override // defpackage.emyl
            public final Object get() {
                return "subscription_color:".concat(String.valueOf(bvoq.this.getString(26)));
            }
        });
        if (!di(27)) {
            strArr20 = strArr19;
            uriArr4 = uriArr;
            strArr21 = null;
        } else if (z2) {
            strArr20 = strArr19;
            uriArr4 = uriArr;
            strArr21 = (String[]) dtub.C(null, dt(getString(cM(27, bvoy.a))), new String[0]);
        } else {
            strArr20 = strArr19;
            uriArr4 = uriArr;
            strArr21 = new String[]{G()};
        }
        dtsr.dz(length, strArr21, new emyl() { // from class: bvnd
            @Override // defpackage.emyl
            public final Object get() {
                return "contact_destination:".concat(String.valueOf(bvoq.this.getString(27)));
            }
        });
        int[] z7 = di(28) ? z2 ? dtub.z(null, dr(getString(cM(28, bvoy.a)))) : new int[]{h()} : null;
        dtsr.dx(length, z7, new emyl() { // from class: bvnf
            @Override // defpackage.emyl
            public final Object get() {
                return "participant_type:".concat(String.valueOf(bvoq.this.getString(28)));
            }
        });
        if (!di(29)) {
            iArr6 = z7;
            iArr7 = null;
        } else if (z2) {
            iArr6 = z7;
            iArr7 = dtub.z(null, dr(getString(cM(29, bvoy.a))));
        } else {
            iArr6 = z7;
            iArr7 = new int[]{l()};
        }
        dtsr.dx(length, iArr7, new emyl() { // from class: bvng
            @Override // defpackage.emyl
            public final Object get() {
                return "video_reachability:".concat(String.valueOf(bvoq.this.getString(29)));
            }
        });
        if (!di(30)) {
            iArr8 = iArr7;
            strArr22 = strArr21;
            strArr23 = null;
        } else if (z2) {
            iArr8 = iArr7;
            strArr22 = strArr21;
            strArr23 = (String[]) dtub.C(null, dt(getString(cM(30, bvoy.a))), new String[0]);
        } else {
            iArr8 = iArr7;
            strArr22 = strArr21;
            strArr23 = new String[]{D()};
        }
        dtsr.dz(length, strArr23, new emyl() { // from class: bvni
            @Override // defpackage.emyl
            public final Object get() {
                return "alias:".concat(String.valueOf(bvoq.this.getString(30)));
            }
        });
        boolean[] D = di(31) ? z2 ? dtub.D(null, du(getString(cM(31, bvoy.a)))) : new boolean[]{X()} : null;
        dtsr.dA(length, D, new emyl() { // from class: bvnj
            @Override // defpackage.emyl
            public final Object get() {
                return "is_spam:".concat(String.valueOf(bvoq.this.getString(31)));
            }
        });
        if (!di(32)) {
            zArr3 = D;
            iArr9 = null;
        } else if (z2) {
            zArr3 = D;
            iArr9 = dtub.z(null, dr(getString(cM(32, bvoy.a))));
        } else {
            zArr3 = D;
            iArr9 = new int[]{g()};
        }
        dtsr.dx(length, iArr9, new emyl() { // from class: bvnk
            @Override // defpackage.emyl
            public final Object get() {
                return "is_spam_source:".concat(String.valueOf(bvoq.this.getString(32)));
            }
        });
        if (!di(33)) {
            iArr10 = iArr9;
            strArr24 = strArr23;
            strArr25 = null;
        } else if (z2) {
            iArr10 = iArr9;
            strArr24 = strArr23;
            strArr25 = (String[]) dtub.C(null, dt(getString(cM(33, bvoy.a))), new String[0]);
        } else {
            iArr10 = iArr9;
            strArr24 = strArr23;
            strArr25 = new String[]{E()};
        }
        dtsr.dz(length, strArr25, new emyl() { // from class: bvnl
            @Override // defpackage.emyl
            public final Object get() {
                return "cms_id:".concat(String.valueOf(bvoq.this.getString(33)));
            }
        });
        if (!di(34)) {
            strArr26 = strArr25;
            z = z2;
            strArr27 = strArr31;
            byziVarArr = null;
        } else if (z2) {
            int[] dr = dr(getString(cM(34, bvoy.a)));
            byzi[] values = byzi.values();
            strArr26 = strArr25;
            int length7 = values.length;
            byzi[] byziVarArr3 = new byzi[dr.length];
            z = z2;
            strArr27 = strArr31;
            for (int i14 = 0; i14 < dr.length; i14++) {
                int i15 = dr[i14];
                if (i15 >= length7) {
                    throw new IllegalStateException();
                }
                byziVarArr3[i14] = values[i15];
            }
            byziVarArr = (byzi[]) dtub.C(null, byziVarArr3, new byzi[0]);
        } else {
            strArr26 = strArr25;
            z = z2;
            strArr27 = strArr31;
            byziVarArr = new byzi[]{x()};
        }
        dtsr.dz(length, byziVarArr, new emyl() { // from class: bvnm
            @Override // defpackage.emyl
            public final Object get() {
                return "latest_verification_status:".concat(String.valueOf(bvoq.this.getString(34)));
            }
        });
        String[] strArr34 = di(35) ? z ? (String[]) dtub.C(null, dt(getString(cM(35, bvoy.a))), new String[0]) : new String[]{Q()} : null;
        dtsr.dz(length, strArr34, new emyl() { // from class: bvnn
            @Override // defpackage.emyl
            public final Object get() {
                return "profile_photo_blob_id:".concat(String.valueOf(bvoq.this.getString(35)));
            }
        });
        byte[][] E = di(36) ? z ? dtub.E(null, dC(getString(cM(36, bvoy.a)))) : new byte[][]{Z()} : null;
        dtsr.dz(length, E, new emyl() { // from class: bvno
            @Override // defpackage.emyl
            public final Object get() {
                return "profile_photo_encryption_key:".concat(String.valueOf(bvoq.this.getString(36)));
            }
        });
        long[] B4 = di(37) ? z ? dtub.B(null, ds(getString(cM(37, bvoy.a)))) : new long[]{n()} : null;
        dtsr.dy(length, B4, new emyl() { // from class: bvnq
            @Override // defpackage.emyl
            public final Object get() {
                return "directory_id:".concat(String.valueOf(bvoq.this.getString(37)));
            }
        });
        if (!di(38)) {
            strArr28 = strArr34;
            zArr4 = null;
        } else if (z) {
            strArr28 = strArr34;
            zArr4 = dtub.D(null, du(getString(cM(38, bvoy.a))));
        } else {
            strArr28 = strArr34;
            zArr4 = new boolean[]{V()};
        }
        dtsr.dA(length, zArr4, new emyl() { // from class: bvnr
            @Override // defpackage.emyl
            public final Object get() {
                return "is_check_constraint_enabled_via_phenotype:".concat(String.valueOf(bvoq.this.getString(38)));
            }
        });
        if (!di(39)) {
            zArr5 = zArr4;
            zArr6 = null;
        } else if (z) {
            zArr5 = zArr4;
            zArr6 = dtub.D(null, du(getString(cM(39, bvoy.a))));
        } else {
            zArr5 = zArr4;
            zArr6 = new boolean[]{Y()};
        }
        dtsr.dA(length, zArr6, new emyl() { // from class: bvns
            @Override // defpackage.emyl
            public final Object get() {
                return "is_valid_phone_number_data:".concat(String.valueOf(bvoq.this.getString(39)));
            }
        });
        if (!di(40)) {
            zArr7 = zArr6;
            bArr = E;
            strArr29 = null;
        } else if (z) {
            zArr7 = zArr6;
            bArr = E;
            strArr29 = (String[]) dtub.C(null, dt(getString(cM(40, bvoy.a))), new String[0]);
        } else {
            zArr7 = zArr6;
            bArr = E;
            strArr29 = new String[]{J()};
        }
        dtsr.dz(length, strArr29, new emyl() { // from class: bvnu
            @Override // defpackage.emyl
            public final Object get() {
                return "duplicate_of:".concat(String.valueOf(bvoq.this.getString(40)));
            }
        });
        if (!di(41)) {
            strArr30 = strArr29;
            byziVarArr2 = byziVarArr;
            jArr3 = B4;
            csggVarArr = null;
        } else if (z) {
            int[] dr2 = dr(getString(cM(41, bvoy.a)));
            csgg[] values2 = csgg.values();
            strArr30 = strArr29;
            int length8 = values2.length;
            byziVarArr2 = byziVarArr;
            csgg[] csggVarArr2 = new csgg[dr2.length];
            jArr3 = B4;
            for (int i16 = 0; i16 < dr2.length; i16++) {
                int i17 = dr2[i16];
                if (i17 >= length8) {
                    throw new IllegalStateException();
                }
                csggVarArr2[i16] = values2[i17];
            }
            csggVarArr = (csgg[]) dtub.C(null, csggVarArr2, new csgg[0]);
        } else {
            strArr30 = strArr29;
            byziVarArr2 = byziVarArr;
            jArr3 = B4;
            csggVarArr = new csgg[]{B()};
        }
        dtsr.dz(length, csggVarArr, new emyl() { // from class: bvnv
            @Override // defpackage.emyl
            public final Object get() {
                return "cms_life_cycle:".concat(String.valueOf(bvoq.this.getString(41)));
            }
        });
        if (!di(42)) {
            aorbVarArr = null;
        } else if (z) {
            int[] dr3 = dr(getString(cM(42, bvoy.a)));
            aorb[] aorbVarArr3 = new aorb[dr3.length];
            for (int i18 = 0; i18 < dr3.length; i18++) {
                aorb b = aorb.b(dr3[i18]);
                if (b == null) {
                    throw new IllegalStateException();
                }
                aorbVarArr3[i18] = b;
            }
            aorbVarArr = (aorb[]) dtub.C(null, aorbVarArr3, new aorb[0]);
        } else {
            aorbVarArr = new aorb[]{s()};
        }
        dtsr.dz(length, aorbVarArr, new emyl() { // from class: bvnw
            @Override // defpackage.emyl
            public final Object get() {
                return "norm_ui_status:".concat(String.valueOf(bvoq.this.getString(42)));
            }
        });
        if (!di(43)) {
            bdpyVarArr = null;
        } else if (z) {
            String[] dt5 = dt(getString(cM(43, bvoy.a)));
            int length9 = dt5.length;
            bdpy[] bdpyVarArr3 = new bdpy[length9];
            for (int i19 = 0; i19 < length9; i19++) {
                bdpyVarArr3[i19] = bdqb.a(dt5[i19]);
            }
            bdpyVarArr = (bdpy[]) dtub.C(null, bdpyVarArr3, new bdpy[0]);
        } else {
            bdpyVarArr = new bdpy[]{w()};
        }
        dtsr.dz(length, bdpyVarArr, new emyl() { // from class: bvnx
            @Override // defpackage.emyl
            public final Object get() {
                return "last_modified_by_key:".concat(String.valueOf(bvoq.this.getString(43)));
            }
        });
        if (!di(44)) {
            bdpyVarArr2 = bdpyVarArr;
            aorbVarArr2 = aorbVarArr;
            cjwiVarArr = null;
        } else if (z) {
            int[] dr4 = dr(getString(cM(44, bvoy.a)));
            cjwi[] cjwiVarArr5 = new cjwi[dr4.length];
            bdpyVarArr2 = bdpyVarArr;
            aorbVarArr2 = aorbVarArr;
            for (int i20 = 0; i20 < dr4.length; i20++) {
                cjwi b2 = cjwi.b(dr4[i20]);
                if (b2 == null) {
                    throw new IllegalStateException();
                }
                cjwiVarArr5[i20] = b2;
            }
            cjwiVarArr = (cjwi[]) dtub.C(null, cjwiVarArr5, new cjwi[0]);
        } else {
            bdpyVarArr2 = bdpyVarArr;
            aorbVarArr2 = aorbVarArr;
            cjwiVarArr = new cjwi[]{z()};
        }
        dtsr.dz(length, cjwiVarArr, new emyl() { // from class: bvny
            @Override // defpackage.emyl
            public final Object get() {
                return "name_source:".concat(String.valueOf(bvoq.this.getString(44)));
            }
        });
        if (!di(45)) {
            cjwiVarArr2 = cjwiVarArr;
            cjwiVarArr3 = null;
        } else if (z) {
            int[] dr5 = dr(getString(cM(45, bvoy.a)));
            cjwi[] cjwiVarArr6 = new cjwi[dr5.length];
            cjwiVarArr2 = cjwiVarArr;
            for (int i21 = 0; i21 < dr5.length; i21++) {
                cjwi b3 = cjwi.b(dr5[i21]);
                if (b3 == null) {
                    throw new IllegalStateException();
                }
                cjwiVarArr6[i21] = b3;
            }
            cjwiVarArr3 = (cjwi[]) dtub.C(null, cjwiVarArr6, new cjwi[0]);
        } else {
            cjwiVarArr2 = cjwiVarArr;
            cjwiVarArr3 = new cjwi[]{A()};
        }
        dtsr.dz(length, cjwiVarArr3, new emyl() { // from class: bvnz
            @Override // defpackage.emyl
            public final Object get() {
                return "photo_source:".concat(String.valueOf(bvoq.this.getString(45)));
            }
        });
        if (!di(46)) {
            cjwiVarArr4 = cjwiVarArr3;
            cjweVarArr = null;
        } else if (z) {
            int[] dr6 = dr(getString(cM(46, bvoy.a)));
            cjwe[] cjweVarArr3 = new cjwe[dr6.length];
            cjwiVarArr4 = cjwiVarArr3;
            for (int i22 = 0; i22 < dr6.length; i22++) {
                cjwe b4 = cjwe.b(dr6[i22]);
                if (b4 == null) {
                    throw new IllegalStateException();
                }
                cjweVarArr3[i22] = b4;
            }
            cjweVarArr = (cjwe[]) dtub.C(null, cjweVarArr3, new cjwe[0]);
        } else {
            cjwiVarArr4 = cjwiVarArr3;
            cjweVarArr = new cjwe[]{y()};
        }
        dtsr.dz(length, cjweVarArr, new emyl() { // from class: bvob
            @Override // defpackage.emyl
            public final Object get() {
                return "profile_photo_user_preference:".concat(String.valueOf(bvoq.this.getString(46)));
            }
        });
        if (!di(47)) {
            cjweVarArr2 = cjweVarArr;
            aqktVarArr = null;
        } else if (z) {
            List de = de(getString(cM(47, bvoy.a)));
            aqkt[] aqktVarArr3 = new aqkt[de.size()];
            Iterator it2 = de.iterator();
            int i23 = 0;
            while (it2.hasNext()) {
                cjwe[] cjweVarArr4 = cjweVarArr;
                try {
                    byte[] y = dtub.y((String) it2.next());
                    int i24 = i23 + 1;
                    if (y == null) {
                        it = it2;
                        aqktVar = null;
                    } else {
                        it = it2;
                        try {
                            aqktVar = (aqkt) eyfy.parseFrom(aqkt.a, y);
                        } catch (Throwable unused) {
                            i23 = i24;
                            aqktVarArr3[i23] = null;
                            i23++;
                            cjweVarArr = cjweVarArr4;
                            it2 = it;
                        }
                    }
                    aqktVarArr3[i23] = aqktVar;
                    i23 = i24;
                } catch (Throwable unused2) {
                    it = it2;
                }
                cjweVarArr = cjweVarArr4;
                it2 = it;
            }
            cjweVarArr2 = cjweVarArr;
            aqktVarArr = (aqkt[]) dtub.C(null, aqktVarArr3, new aqkt[0]);
        } else {
            cjweVarArr2 = cjweVarArr;
            aqktVarArr = new aqkt[]{t()};
        }
        dtsr.dz(length, aqktVarArr, new emyl() { // from class: bvoc
            @Override // defpackage.emyl
            public final Object get() {
                return "contact_metadata:".concat(String.valueOf(bvoq.this.getString(47)));
            }
        });
        if (!di(48)) {
            i2 = 0;
            zArr8 = null;
        } else if (z) {
            zArr8 = dtub.D(null, du(getString(cM(48, bvoy.a))));
            i2 = 0;
        } else {
            i2 = 0;
            zArr8 = new boolean[]{W()};
        }
        dtsr.dA(length, zArr8, new emyl() { // from class: bvod
            @Override // defpackage.emyl
            public final Object get() {
                return "is_enterprise_contact:".concat(String.valueOf(bvoq.this.getString(48)));
            }
        });
        engr engrVar = new engr();
        int i25 = i2;
        while (i25 < length) {
            long j = jArr[i25];
            if (j <= 0 || hashSet.contains(Long.valueOf(j))) {
                zArr9 = zArr8;
                aqktVarArr2 = aqktVarArr;
                i3 = length;
            } else {
                hashSet.add(Long.valueOf(jArr[i25]));
                String[] strArr35 = bvoy.a;
                bviu bviuVar = new bviu();
                bviuVar.aF();
                bviuVar.aD();
                long j2 = jArr[i25];
                zArr9 = zArr8;
                if (strArr27 != null) {
                    bviuVar.t(strArr27[i25]);
                }
                if (instantArr != null) {
                    bviuVar.H(instantArr[i25]);
                }
                aqktVarArr2 = aqktVarArr;
                if (B != null) {
                    bviuVar.I(B[i25]);
                }
                if (strArr32 != null) {
                    bviuVar.J(strArr32[i25]);
                }
                if (azsuVarArr != null) {
                    bviuVar.C(azsuVarArr[i25]);
                }
                if (azsuVarArr3 != null) {
                    bviuVar.D(azsuVarArr3[i25]);
                }
                if (z3 != null) {
                    int i26 = z3[i25];
                    bviuVar.aE(6);
                    bviuVar.g = i26;
                }
                if (z4 != null) {
                    int i27 = z4[i25];
                    bviuVar.aE(7);
                    bviuVar.h = i27;
                }
                if (strArr16 != null) {
                    bviuVar.G(strArr16[i25]);
                }
                if (strArr3 != null) {
                    String str3 = strArr3[i25];
                    bviuVar.aE(9);
                    bviuVar.j = str3;
                }
                if (strArr5 != null) {
                    bviuVar.o(strArr5[i25]);
                }
                if (strArr7 != null) {
                    bviuVar.h(strArr7[i25]);
                }
                if (strArr9 != null) {
                    bviuVar.m(strArr9[i25]);
                }
                if (B2 != null) {
                    long j3 = B2[i25];
                    i3 = length;
                    bviuVar.aE(13);
                    bviuVar.n = j3;
                } else {
                    i3 = length;
                }
                if (strArr11 != null) {
                    String str4 = strArr11[i25];
                    bviuVar.aE(14);
                    bviuVar.o = str4;
                }
                if (strArr13 != null) {
                    bviuVar.s(strArr13[i25]);
                }
                if (strArr15 != null) {
                    bviuVar.r(strArr15[i25]);
                }
                if (uriArr4 != null) {
                    Uri uri = uriArr4[i25];
                    bviuVar.aE(17);
                    bviuVar.r = uri;
                }
                if (uriArr3 != null) {
                    bviuVar.l(uriArr3[i25]);
                }
                if (jArr2 != null) {
                    bviuVar.j(jArr2[i25]);
                }
                if (strArr18 != null) {
                    bviuVar.B(strArr18[i25]);
                }
                if (iArr5 != null) {
                    bviuVar.f(iArr5[i25]);
                }
                if (iArr2 != null) {
                    bviuVar.g(iArr2[i25]);
                }
                if (iArr4 != null) {
                    bviuVar.q(iArr4[i25]);
                }
                if (zArr2 != null) {
                    bviuVar.c(zArr2[i25]);
                }
                if (strArr20 != null) {
                    String str5 = strArr20[i25];
                    bviuVar.aE(25);
                    bviuVar.z = str5;
                }
                if (z6 != null) {
                    int i28 = z6[i25];
                    bviuVar.aE(26);
                    bviuVar.A = i28;
                }
                if (strArr22 != null) {
                    bviuVar.i(strArr22[i25]);
                }
                if (iArr6 != null) {
                    bviuVar.K(iArr6[i25]);
                }
                if (iArr8 != null) {
                    int i29 = iArr8[i25];
                    bviuVar.aE(29);
                    bviuVar.D = i29;
                }
                if (strArr24 != null) {
                    bviuVar.b(strArr24[i25]);
                }
                if (zArr3 != null) {
                    bviuVar.w(zArr3[i25]);
                }
                if (iArr10 != null) {
                    bviuVar.x(iArr10[i25]);
                }
                if (strArr26 != null) {
                    bviuVar.d(strArr26[i25]);
                }
                if (byziVarArr2 != null) {
                    bviuVar.A(byziVarArr2[i25]);
                }
                if (strArr28 != null) {
                    bviuVar.M(strArr28[i25]);
                }
                if (bArr != null) {
                    bviuVar.N(bArr[i25]);
                }
                if (jArr3 != null) {
                    bviuVar.n(jArr3[i25]);
                }
                if (zArr5 != null) {
                    bviuVar.u(zArr5[i25]);
                }
                if (zArr7 != null) {
                    bviuVar.y(zArr7[i25]);
                }
                if (strArr30 != null) {
                    bviuVar.p(strArr30[i25]);
                }
                if (csggVarArr != null) {
                    bviuVar.e(csggVarArr[i25]);
                }
                if (aorbVarArr2 != null) {
                    bviuVar.F(aorbVarArr2[i25]);
                }
                if (bdpyVarArr2 != null) {
                    bviuVar.z(bdpyVarArr2[i25]);
                }
                if (cjwiVarArr2 != null) {
                    bviuVar.E(cjwiVarArr2[i25]);
                }
                if (cjwiVarArr4 != null) {
                    bviuVar.L(cjwiVarArr4[i25]);
                }
                if (cjweVarArr2 != null) {
                    bviuVar.O(cjweVarArr2[i25]);
                }
                if (aqktVarArr2 != null) {
                    bviuVar.k(aqktVarArr2[i25]);
                }
                if (zArr9 != null) {
                    bviuVar.v(zArr9[i25]);
                }
                engrVar.h(bviuVar.a());
            }
            i25++;
            length = i3;
            zArr8 = zArr9;
            aqktVarArr = aqktVarArr2;
        }
        return engrVar.g();
    }

    public final int g() {
        return getInt(cM(32, bvoy.a));
    }

    public final int h() {
        return getInt(cM(28, bvoy.a));
    }

    public final int i() {
        return getInt(cM(7, bvoy.a));
    }

    public final int j() {
        return getInt(cM(6, bvoy.a));
    }

    public final int k() {
        return getInt(cM(26, bvoy.a));
    }

    public final int l() {
        return getInt(cM(29, bvoy.a));
    }

    public final long m() {
        return getLong(cM(19, bvoy.a));
    }

    public final long n() {
        return getLong(cM(37, bvoy.a));
    }

    public final long o() {
        return getLong(cM(2, bvoy.a));
    }

    public final long p() {
        return getLong(cM(13, bvoy.a));
    }

    public final Uri q() {
        String string = getString(cM(18, bvoy.a));
        if (string == null) {
            return null;
        }
        return Uri.parse(string);
    }

    public final Uri r() {
        String string = getString(cM(17, bvoy.a));
        if (string == null) {
            return null;
        }
        return Uri.parse(string);
    }

    public final aorb s() {
        return aorb.b(getInt(cM(42, bvoy.a)));
    }

    public final aqkt t() {
        byte[] blob = getBlob(cM(47, bvoy.a));
        if (blob == null) {
            return null;
        }
        try {
            return (aqkt) eyfy.parseFrom(aqkt.a, blob, eyfc.a());
        } catch (Throwable unused) {
            return aqkt.a;
        }
    }

    public final azsu u() {
        return azsv.a(getString(cM(4, bvoy.a)));
    }

    public final azsu v() {
        return azsv.a(getString(cM(5, bvoy.a)));
    }

    public final bdpy w() {
        return bdqb.a(getString(cM(43, bvoy.a)));
    }

    public final byzi x() {
        byzi[] values = byzi.values();
        int i = getInt(cM(34, bvoy.a));
        if (i < values.length) {
            return values[i];
        }
        throw new IllegalArgumentException();
    }

    public final cjwe y() {
        return cjwe.b(getInt(cM(46, bvoy.a)));
    }

    public final cjwi z() {
        return cjwi.b(getInt(cM(44, bvoy.a)));
    }

    @Override // defpackage.dtsu
    public final Cursor a() {
        return this;
    }
}
