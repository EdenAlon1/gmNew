package defpackage;

import android.database.Cursor;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bbok extends dtsr implements bbnp {
    @Deprecated
    public bbok(dtve dtveVar, Cursor cursor, String[] strArr, dtzj[] dtzjVarArr, dtyo dtyoVar, dtvs dtvsVar, bbor bborVar) {
        super(dtveVar, cursor, strArr, dtzjVarArr, bbov.a, dtyoVar, dtvsVar, bborVar);
    }

    @Override // defpackage.dtsr
    protected final /* synthetic */ dtro b() {
        return new bblv();
    }

    public final int c() {
        return getInt(cM(16, bbov.a));
    }

    public final int e() {
        return getInt(cM(15, bbov.a));
    }

    public final int f() {
        return getInt(cM(17, bbov.a));
    }

    @Override // defpackage.dtsr
    public final engw fI(dtvn dtvnVar) {
        ConversationIdType[] conversationIdTypeArr;
        azsu[] azsuVarArr;
        byyt[] byytVarArr;
        long[] jArr;
        boolean z;
        byyy[] byyyVarArr;
        String[] strArr;
        String[] strArr2;
        String[] strArr3;
        boolean[] zArr;
        byyy[] byyyVarArr2;
        ConversationIdType[] conversationIdTypeArr2;
        cknh[] cknhVarArr;
        ayhd[] ayhdVarArr;
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        ayhd[] ayhdVarArr2;
        String[] strArr4;
        String[] strArr5;
        String[] strArr6;
        cknh[] cknhVarArr2;
        csgg[] csggVarArr;
        int i;
        int i2;
        engr engrVar;
        dtyq dtyqVar = dtvnVar.a;
        long[] dB = dB(getString(dtvnVar.h + 1));
        int length = dB.length;
        if (length == 0 || (length == 1 && dB[0] == -1)) {
            int i3 = engw.d;
            return enou.a;
        }
        HashSet hashSet = new HashSet();
        dtvs dtvsVar = this.d;
        boolean di = di(0);
        boolean z2 = dtvsVar.b;
        if (!di) {
            conversationIdTypeArr = null;
        } else if (z2) {
            long[] ds = ds(getString(cM(0, bbov.a)));
            int length2 = ds.length;
            ConversationIdType[] conversationIdTypeArr3 = new ConversationIdType[length2];
            for (int i4 = 0; i4 < length2; i4++) {
                conversationIdTypeArr3[i4] = new ConversationIdType(ds[i4]);
            }
            conversationIdTypeArr = (ConversationIdType[]) dtub.C(null, conversationIdTypeArr3, new ConversationIdType[0]);
        } else {
            conversationIdTypeArr = new ConversationIdType[]{k()};
        }
        dtsr.dz(length, conversationIdTypeArr, new emyl() { // from class: bbnq
            @Override // defpackage.emyl
            public final Object get() {
                return "_id:".concat(String.valueOf(bbok.this.getString(0)));
            }
        });
        if (!di(1)) {
            azsuVarArr = null;
        } else if (z2) {
            String[] dt = dt(getString(cM(1, bbov.a)));
            int length3 = dt.length;
            azsu[] azsuVarArr2 = new azsu[length3];
            for (int i5 = 0; i5 < length3; i5++) {
                azsuVarArr2[i5] = azsv.a(dt[i5]);
            }
            azsuVarArr = (azsu[]) dtub.C(null, azsuVarArr2, new azsu[0]);
        } else {
            azsuVarArr = new azsu[]{j()};
        }
        dtsr.dz(length, azsuVarArr, new emyl() { // from class: bbns
            @Override // defpackage.emyl
            public final Object get() {
                return "current_my_identity:".concat(String.valueOf(bbok.this.getString(1)));
            }
        });
        String[] strArr7 = di(2) ? z2 ? (String[]) dtub.C(null, dt(getString(cM(2, bbov.a))), new String[0]) : new String[]{u()} : null;
        dtsr.dz(length, strArr7, new emyl() { // from class: bbnt
            @Override // defpackage.emyl
            public final Object get() {
                return "snippet_text:".concat(String.valueOf(bbok.this.getString(2)));
            }
        });
        if (!di(3)) {
            byytVarArr = null;
        } else if (z2) {
            int[] dr = dr(getString(cM(3, bbov.a)));
            byyt[] byytVarArr2 = new byyt[dr.length];
            for (int i6 = 0; i6 < dr.length; i6++) {
                byyt a = byyt.a(dr[i6]);
                if (a == null) {
                    throw new IllegalStateException();
                }
                byytVarArr2[i6] = a;
            }
            byytVarArr = (byyt[]) dtub.C(null, byytVarArr2, new byyt[0]);
        } else {
            byytVarArr = new byyt[]{l()};
        }
        dtsr.dz(length, byytVarArr, new emyl() { // from class: bbnu
            @Override // defpackage.emyl
            public final Object get() {
                return "archive_status:".concat(String.valueOf(bbok.this.getString(3)));
            }
        });
        long[] B = di(4) ? z2 ? dtub.B(null, ds(getString(cM(4, bbov.a)))) : new long[]{g()} : null;
        dtsr.dy(length, B, new emyl() { // from class: bbnv
            @Override // defpackage.emyl
            public final Object get() {
                return "most_recent_timestamp_ms:".concat(String.valueOf(bbok.this.getString(4)));
            }
        });
        String[] strArr8 = di(5) ? z2 ? (String[]) dtub.C(null, dt(getString(cM(5, bbov.a))), new String[0]) : new String[]{v()} : null;
        dtsr.dz(length, strArr8, new emyl() { // from class: bbnw
            @Override // defpackage.emyl
            public final Object get() {
                return "subject:".concat(String.valueOf(bbok.this.getString(5)));
            }
        });
        String[] strArr9 = di(6) ? z2 ? (String[]) dtub.C(null, dt(getString(cM(6, bbov.a))), new String[0]) : new String[]{q()} : null;
        dtsr.dz(length, strArr9, new emyl() { // from class: bbnx
            @Override // defpackage.emyl
            public final Object get() {
                return "name:".concat(String.valueOf(bbok.this.getString(6)));
            }
        });
        if (!di(7)) {
            jArr = dB;
            z = z2;
            byyyVarArr = null;
        } else if (z2) {
            int[] dr2 = dr(getString(cM(7, bbov.a)));
            byyy[] values = byyy.values();
            int length4 = values.length;
            byyy[] byyyVarArr3 = new byyy[dr2.length];
            jArr = dB;
            z = z2;
            for (int i7 = 0; i7 < dr2.length; i7++) {
                int i8 = dr2[i7];
                if (i8 >= length4) {
                    throw new IllegalStateException();
                }
                byyyVarArr3[i7] = values[i8];
            }
            byyyVarArr = (byyy[]) dtub.C(null, byyyVarArr3, new byyy[0]);
        } else {
            jArr = dB;
            z = z2;
            byyyVarArr = new byyy[]{m()};
        }
        dtsr.dz(length, byyyVarArr, new emyl() { // from class: bbny
            @Override // defpackage.emyl
            public final Object get() {
                return "name_is_automatic:".concat(String.valueOf(bbok.this.getString(7)));
            }
        });
        boolean[] D = di(8) ? z ? dtub.D(null, du(getString(cM(8, bbov.a)))) : new boolean[]{w()} : null;
        dtsr.dA(length, D, new emyl() { // from class: bbnz
            @Override // defpackage.emyl
            public final Object get() {
                return "has_rbm_participant:".concat(String.valueOf(bbok.this.getString(8)));
            }
        });
        String[] strArr10 = di(9) ? z ? (String[]) dtub.C(null, dt(getString(cM(9, bbov.a))), new String[0]) : new String[]{t()} : null;
        dtsr.dz(length, strArr10, new emyl() { // from class: bboa
            @Override // defpackage.emyl
            public final Object get() {
                return "rcs_group_self_msisdn:".concat(String.valueOf(bbok.this.getString(9)));
            }
        });
        String[] strArr11 = di(10) ? z ? (String[]) dtub.C(null, dt(getString(cM(10, bbov.a))), new String[0]) : new String[]{s()} : null;
        dtsr.dz(length, strArr11, new emyl() { // from class: bbob
            @Override // defpackage.emyl
            public final Object get() {
                return "rcs_group_id:".concat(String.valueOf(bbok.this.getString(10)));
            }
        });
        if (!di(11)) {
            strArr = strArr11;
            strArr2 = null;
        } else if (z) {
            strArr = strArr11;
            strArr2 = (String[]) dtub.C(null, dt(getString(cM(11, bbov.a))), new String[0]);
        } else {
            strArr = strArr11;
            strArr2 = new String[]{r()};
        }
        dtsr.dz(length, strArr2, new emyl() { // from class: bboc
            @Override // defpackage.emyl
            public final Object get() {
                return "rcs_conference_uri:".concat(String.valueOf(bbok.this.getString(11)));
            }
        });
        if (!di(12)) {
            strArr3 = strArr2;
            zArr = D;
            byyyVarArr2 = byyyVarArr;
            conversationIdTypeArr2 = conversationIdTypeArr;
            cknhVarArr = null;
        } else if (z) {
            long[] ds2 = ds(getString(cM(12, bbov.a)));
            int length5 = ds2.length;
            strArr3 = strArr2;
            cknh[] cknhVarArr3 = new cknh[length5];
            zArr = D;
            int i9 = 0;
            while (i9 < length5) {
                int i10 = i9;
                cknhVarArr3[i10] = new cknh(ds2[i9]);
                i9 = i10 + 1;
                conversationIdTypeArr = conversationIdTypeArr;
                byyyVarArr = byyyVarArr;
            }
            byyyVarArr2 = byyyVarArr;
            conversationIdTypeArr2 = conversationIdTypeArr;
            cknhVarArr = (cknh[]) dtub.C(null, cknhVarArr3, new cknh[0]);
        } else {
            strArr3 = strArr2;
            zArr = D;
            byyyVarArr2 = byyyVarArr;
            conversationIdTypeArr2 = conversationIdTypeArr;
            cknhVarArr = new cknh[]{n()};
        }
        dtsr.dz(length, cknhVarArr, new emyl() { // from class: bbod
            @Override // defpackage.emyl
            public final Object get() {
                return "rcs_group_capabilities:".concat(String.valueOf(bbok.this.getString(12)));
            }
        });
        if (!di(13)) {
            ayhdVarArr = null;
        } else if (z) {
            int[] dr3 = dr(getString(cM(13, bbov.a)));
            ayhd[] ayhdVarArr3 = new ayhd[dr3.length];
            for (int i11 = 0; i11 < dr3.length; i11++) {
                ayhd b = ayhd.b(dr3[i11]);
                if (b == null) {
                    throw new IllegalStateException();
                }
                ayhdVarArr3[i11] = b;
            }
            ayhdVarArr = (ayhd[]) dtub.C(null, ayhdVarArr3, new ayhd[0]);
        } else {
            ayhdVarArr = new ayhd[]{i()};
        }
        dtsr.dz(length, ayhdVarArr, new emyl() { // from class: bboe
            @Override // defpackage.emyl
            public final Object get() {
                return "error_state:".concat(String.valueOf(bbok.this.getString(13)));
            }
        });
        long[] B2 = di(14) ? z ? dtub.B(null, ds(getString(cM(14, bbov.a)))) : new long[]{h()} : null;
        dtsr.dy(length, B2, new emyl() { // from class: bbof
            @Override // defpackage.emyl
            public final Object get() {
                return "rcs_subject_change_timestamp_ms:".concat(String.valueOf(bbok.this.getString(14)));
            }
        });
        int[] z3 = di(15) ? z ? dtub.z(null, dr(getString(cM(15, bbov.a)))) : new int[]{e()} : null;
        dtsr.dx(length, z3, new emyl() { // from class: bbog
            @Override // defpackage.emyl
            public final Object get() {
                return "join_state:".concat(String.valueOf(bbok.this.getString(15)));
            }
        });
        int[] z4 = di(16) ? z ? dtub.z(null, dr(getString(cM(16, bbov.a)))) : new int[]{c()} : null;
        dtsr.dx(length, z4, new emyl() { // from class: bboh
            @Override // defpackage.emyl
            public final Object get() {
                return "conversation_type:".concat(String.valueOf(bbok.this.getString(16)));
            }
        });
        if (!di(17)) {
            iArr = z4;
            iArr2 = null;
        } else if (z) {
            iArr = z4;
            iArr2 = dtub.z(null, dr(getString(cM(17, bbov.a))));
        } else {
            iArr = z4;
            iArr2 = new int[]{f()};
        }
        dtsr.dx(length, iArr2, new emyl() { // from class: bboi
            @Override // defpackage.emyl
            public final Object get() {
                return "send_mode:".concat(String.valueOf(bbok.this.getString(17)));
            }
        });
        if (!di(18)) {
            iArr3 = iArr2;
            ayhdVarArr2 = ayhdVarArr;
            strArr4 = null;
        } else if (z) {
            iArr3 = iArr2;
            ayhdVarArr2 = ayhdVarArr;
            strArr4 = (String[]) dtub.C(null, dt(getString(cM(18, bbov.a))), new String[0]);
        } else {
            iArr3 = iArr2;
            ayhdVarArr2 = ayhdVarArr;
            strArr4 = new String[]{p()};
        }
        dtsr.dz(length, strArr4, new emyl() { // from class: bboj
            @Override // defpackage.emyl
            public final Object get() {
                return "cms_id:".concat(String.valueOf(bbok.this.getString(18)));
            }
        });
        if (!di(19)) {
            strArr5 = strArr4;
            strArr6 = strArr10;
            cknhVarArr2 = cknhVarArr;
            csggVarArr = null;
        } else if (z) {
            int[] dr4 = dr(getString(cM(19, bbov.a)));
            csgg[] values2 = csgg.values();
            strArr5 = strArr4;
            int length6 = values2.length;
            csgg[] csggVarArr2 = new csgg[dr4.length];
            strArr6 = strArr10;
            cknhVarArr2 = cknhVarArr;
            for (int i12 = 0; i12 < dr4.length; i12++) {
                int i13 = dr4[i12];
                if (i13 >= length6) {
                    throw new IllegalStateException();
                }
                csggVarArr2[i12] = values2[i13];
            }
            csggVarArr = (csgg[]) dtub.C(null, csggVarArr2, new csgg[0]);
        } else {
            strArr5 = strArr4;
            strArr6 = strArr10;
            cknhVarArr2 = cknhVarArr;
            csggVarArr = new csgg[]{o()};
        }
        dtsr.dz(length, csggVarArr, new emyl() { // from class: bbnr
            @Override // defpackage.emyl
            public final Object get() {
                return "cms_life_cycle:".concat(String.valueOf(bbok.this.getString(19)));
            }
        });
        engr engrVar2 = new engr();
        int i14 = 0;
        while (i14 < length) {
            long j = jArr[i14];
            if (j <= 0 || hashSet.contains(Long.valueOf(j))) {
                i = i14;
                i2 = length;
                engrVar = engrVar2;
            } else {
                hashSet.add(Long.valueOf(jArr[i14]));
                String[] strArr12 = bbov.a;
                bblx bblxVar = new bblx();
                bblxVar.aF();
                bblxVar.aD();
                long j2 = jArr[i14];
                if (conversationIdTypeArr2 != null) {
                    ConversationIdType conversationIdType = conversationIdTypeArr2[i14];
                    bblxVar.aE(0);
                    bblxVar.a = conversationIdType;
                }
                if (azsuVarArr != null) {
                    azsu azsuVar = azsuVarArr[i14];
                    int i15 = bblxVar.aB;
                    i = i14;
                    if (i15 < 110) {
                        dtub.w("current_my_identity", i15);
                    }
                    bblxVar.aE(1);
                    bblxVar.b = azsuVar;
                } else {
                    i = i14;
                }
                if (strArr7 != null) {
                    String str = strArr7[i];
                    int i16 = bblxVar.aB;
                    if (i16 < 0) {
                        dtub.w("snippet_text", i16);
                    }
                    bblxVar.aE(2);
                    bblxVar.c = str;
                }
                if (byytVarArr != null) {
                    byyt byytVar = byytVarArr[i];
                    int i17 = bblxVar.aB;
                    if (i17 < 0) {
                        dtub.w("archive_status", i17);
                    }
                    bblxVar.aE(3);
                    bblxVar.d = byytVar;
                }
                if (B != null) {
                    long j3 = B[i];
                    int i18 = bblxVar.aB;
                    i2 = length;
                    if (i18 < 0) {
                        dtub.w("most_recent_timestamp_ms", i18);
                    }
                    bblxVar.aE(4);
                    bblxVar.e = j3;
                } else {
                    i2 = length;
                }
                if (strArr8 != null) {
                    String str2 = strArr8[i];
                    int i19 = bblxVar.aB;
                    if (i19 < 0) {
                        dtub.w("subject", i19);
                    }
                    bblxVar.aE(5);
                    bblxVar.f = str2;
                }
                if (strArr9 != null) {
                    String str3 = strArr9[i];
                    int i20 = bblxVar.aB;
                    if (i20 < 0) {
                        dtub.w("name", i20);
                    }
                    bblxVar.aE(6);
                    bblxVar.g = str3;
                }
                if (byyyVarArr2 != null) {
                    byyy byyyVar = byyyVarArr2[i];
                    int i21 = bblxVar.aB;
                    if (i21 < 0) {
                        dtub.w("name_is_automatic", i21);
                    }
                    bblxVar.aE(7);
                    bblxVar.h = byyyVar;
                }
                if (zArr != null) {
                    boolean z5 = zArr[i];
                    int i22 = bblxVar.aB;
                    if (i22 < 0) {
                        dtub.w("has_rbm_participant", i22);
                    }
                    bblxVar.aE(8);
                    bblxVar.i = z5;
                }
                if (strArr6 != null) {
                    String str4 = strArr6[i];
                    int i23 = bblxVar.aB;
                    if (i23 < 0) {
                        dtub.w("rcs_group_self_msisdn", i23);
                    }
                    bblxVar.aE(9);
                    bblxVar.j = str4;
                }
                if (strArr != null) {
                    String str5 = strArr[i];
                    int i24 = bblxVar.aB;
                    if (i24 < 0) {
                        dtub.w("rcs_group_id", i24);
                    }
                    bblxVar.aE(10);
                    bblxVar.k = str5;
                }
                if (strArr3 != null) {
                    String str6 = strArr3[i];
                    int i25 = bblxVar.aB;
                    if (i25 < 0) {
                        dtub.w("rcs_conference_uri", i25);
                    }
                    bblxVar.aE(11);
                    bblxVar.l = str6;
                }
                if (cknhVarArr2 != null) {
                    cknh cknhVar = cknhVarArr2[i];
                    int i26 = bblxVar.aB;
                    if (i26 < 0) {
                        dtub.w("rcs_group_capabilities", i26);
                    }
                    bblxVar.aE(12);
                    bblxVar.m = cknhVar;
                }
                if (ayhdVarArr2 != null) {
                    ayhd ayhdVar = ayhdVarArr2[i];
                    int i27 = bblxVar.aB;
                    if (i27 < 0) {
                        dtub.w("error_state", i27);
                    }
                    bblxVar.aE(13);
                    bblxVar.n = ayhdVar;
                }
                engr engrVar3 = engrVar2;
                if (B2 != null) {
                    long j4 = B2[i];
                    int i28 = bblxVar.aB;
                    if (i28 < 0) {
                        dtub.w("rcs_subject_change_timestamp_ms", i28);
                    }
                    bblxVar.aE(14);
                    bblxVar.o = j4;
                }
                if (z3 != null) {
                    int i29 = z3[i];
                    int i30 = bblxVar.aB;
                    if (i30 < 0) {
                        dtub.w("join_state", i30);
                    }
                    bblxVar.aE(15);
                    bblxVar.p = i29;
                }
                if (iArr != null) {
                    int i31 = iArr[i];
                    int i32 = bblxVar.aB;
                    if (i32 < 0) {
                        dtub.w("conversation_type", i32);
                    }
                    bblxVar.aE(16);
                    bblxVar.q = i31;
                }
                if (iArr3 != null) {
                    int i33 = iArr3[i];
                    int i34 = bblxVar.aB;
                    if (i34 < 0) {
                        dtub.w("send_mode", i34);
                    }
                    bblxVar.aE(17);
                    bblxVar.r = i33;
                }
                if (strArr5 != null) {
                    String str7 = strArr5[i];
                    int i35 = bblxVar.aB;
                    if (i35 < 0) {
                        dtub.w("cms_id", i35);
                    }
                    bblxVar.aE(18);
                    bblxVar.s = str7;
                }
                if (csggVarArr != null) {
                    csgg csggVar = csggVarArr[i];
                    int i36 = bblxVar.aB;
                    if (i36 < 0) {
                        dtub.w("cms_life_cycle", i36);
                    }
                    bblxVar.aE(19);
                    bblxVar.t = csggVar;
                }
                bblv bblvVar = new bblv();
                bblvVar.aC(bblxVar.aB());
                bblvVar.a = bblxVar.a;
                bblvVar.b = bblxVar.b;
                bblvVar.c = bblxVar.c;
                bblvVar.d = bblxVar.d;
                bblvVar.e = bblxVar.e;
                bblvVar.f = bblxVar.f;
                bblvVar.g = bblxVar.g;
                bblvVar.h = bblxVar.h;
                bblvVar.i = bblxVar.i;
                bblvVar.j = bblxVar.j;
                bblvVar.k = bblxVar.k;
                bblvVar.l = bblxVar.l;
                bblvVar.m = bblxVar.m;
                bblvVar.n = bblxVar.n;
                bblvVar.o = bblxVar.o;
                bblvVar.p = bblxVar.p;
                bblvVar.q = bblxVar.q;
                bblvVar.r = bblxVar.r;
                bblvVar.s = bblxVar.s;
                bblvVar.t = bblxVar.t;
                bblvVar.cK = bblxVar.aC();
                engrVar = engrVar3;
                engrVar.h(bblvVar);
            }
            engrVar2 = engrVar;
            length = i2;
            i14 = i + 1;
        }
        return engrVar2.g();
    }

    public final long g() {
        return getLong(cM(4, bbov.a));
    }

    public final long h() {
        return getLong(cM(14, bbov.a));
    }

    public final ayhd i() {
        return ayhd.b(getInt(cM(13, bbov.a)));
    }

    public final azsu j() {
        return azsv.a(getString(cM(1, bbov.a)));
    }

    public final ConversationIdType k() {
        return new ConversationIdType(getLong(cM(0, bbov.a)));
    }

    public final byyt l() {
        return byyt.a(getInt(cM(3, bbov.a)));
    }

    public final byyy m() {
        byyy[] values = byyy.values();
        int i = getInt(cM(7, bbov.a));
        if (i < values.length) {
            return values[i];
        }
        throw new IllegalArgumentException();
    }

    public final cknh n() {
        return new cknh(getLong(cM(12, bbov.a)));
    }

    public final csgg o() {
        csgg[] values = csgg.values();
        int i = getInt(cM(19, bbov.a));
        if (i < values.length) {
            return values[i];
        }
        throw new IllegalArgumentException();
    }

    public final String p() {
        return getString(cM(18, bbov.a));
    }

    public final String q() {
        return getString(cM(6, bbov.a));
    }

    public final String r() {
        return getString(cM(11, bbov.a));
    }

    public final String s() {
        return getString(cM(10, bbov.a));
    }

    public final String t() {
        return getString(cM(9, bbov.a));
    }

    public final String u() {
        return getString(cM(2, bbov.a));
    }

    public final String v() {
        return getString(cM(5, bbov.a));
    }

    public final boolean w() {
        return getInt(cM(8, bbov.a)) == 1;
    }

    @Override // defpackage.dtsu
    public final Cursor a() {
        return this;
    }
}
