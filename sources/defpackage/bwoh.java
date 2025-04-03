package defpackage;

import android.database.Cursor;
import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ProfilesTable;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bwoh extends dtsr implements bwnm {
    @Deprecated
    public bwoh(dtve dtveVar, Cursor cursor, String[] strArr, dtzj[] dtzjVarArr, dtyo dtyoVar, dtvs dtvsVar, bwom bwomVar) {
        super(dtveVar, cursor, strArr, dtzjVarArr, ProfilesTable.a, dtyoVar, dtvsVar, bwomVar);
    }

    @Override // defpackage.dtsr
    protected final /* synthetic */ dtro b() {
        return new bwls();
    }

    @Override // defpackage.bwnm
    public final engw c() {
        engr engrVar = new engr();
        while (moveToNext()) {
            h();
            engrVar.h(Long.valueOf(h()));
        }
        return engrVar.g();
    }

    public final long e() {
        return getLong(cM(19, ProfilesTable.a));
    }

    public final long f() {
        return getLong(cM(0, ProfilesTable.a));
    }

    @Override // defpackage.dtsr
    public final engw fI(dtvn dtvnVar) {
        aqgx[] aqgxVarArr;
        cjwo[] cjwoVarArr;
        long[] jArr;
        cjwo[] cjwoVarArr2;
        Uri[] uriArr;
        Uri[] uriArr2;
        String[] strArr;
        String[] strArr2;
        String[] strArr3;
        String[] strArr4;
        String[] strArr5;
        String[] strArr6;
        boolean[] zArr;
        boolean[] zArr2;
        long[] jArr2;
        long[] jArr3;
        long[] jArr4;
        long[] jArr5;
        boolean[] zArr3;
        int i;
        boolean[] zArr4;
        String[] strArr7;
        int i2;
        cjwo cjwoVar;
        dtyq dtyqVar = dtvnVar.a;
        long[] dB = dB(getString(dtvnVar.h + 1));
        int length = dB.length;
        if (length != 0) {
            int i3 = 0;
            if (length != 1 || dB[0] != -1) {
                HashSet hashSet = new HashSet();
                dtvs dtvsVar = this.d;
                boolean di = di(0);
                boolean z = dtvsVar.b;
                long[] B = di ? z ? dtub.B(null, ds(getString(cM(0, ProfilesTable.a)))) : new long[]{f()} : null;
                dtsr.dy(length, B, new emyl() { // from class: bwnn
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "_id:".concat(String.valueOf(bwoh.this.getString(0)));
                    }
                });
                long[] B2 = di(1) ? z ? dtub.B(null, ds(getString(cM(1, ProfilesTable.a)))) : new long[]{h()} : null;
                dtsr.dy(length, B2, new emyl() { // from class: bwnp
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "participant_id:".concat(String.valueOf(bwoh.this.getString(1)));
                    }
                });
                String[] strArr8 = di(2) ? z ? (String[]) dtub.C(null, dt(getString(cM(2, ProfilesTable.a))), new String[0]) : new String[]{q()} : null;
                dtsr.dz(length, strArr8, new emyl() { // from class: bwnq
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "person_id:".concat(String.valueOf(bwoh.this.getString(2)));
                    }
                });
                String[] strArr9 = di(3) ? z ? (String[]) dtub.C(null, dt(getString(cM(3, ProfilesTable.a))), new String[0]) : new String[]{s()} : null;
                dtsr.dz(length, strArr9, new emyl() { // from class: bwnr
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "profile_access_token:".concat(String.valueOf(bwoh.this.getString(3)));
                    }
                });
                if (!di(4)) {
                    aqgxVarArr = null;
                } else if (z) {
                    int[] dr = dr(getString(cM(4, ProfilesTable.a)));
                    aqgx[] values = aqgx.values();
                    int length2 = values.length;
                    aqgx[] aqgxVarArr2 = new aqgx[dr.length];
                    for (int i4 = 0; i4 < dr.length; i4++) {
                        int i5 = dr[i4];
                        if (i5 >= length2) {
                            throw new IllegalStateException();
                        }
                        aqgxVarArr2[i4] = values[i5];
                    }
                    aqgxVarArr = (aqgx[]) dtub.C(null, aqgxVarArr2, new aqgx[0]);
                } else {
                    aqgxVarArr = new aqgx[]{k()};
                }
                dtsr.dz(length, aqgxVarArr, new emyl() { // from class: bwns
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "sending_self_profile_interaction_state:".concat(String.valueOf(bwoh.this.getString(4)));
                    }
                });
                if (!di(5)) {
                    cjwoVarArr = null;
                } else if (z) {
                    List de = de(getString(cM(5, ProfilesTable.a)));
                    cjwo[] cjwoVarArr3 = new cjwo[de.size()];
                    Iterator it = de.iterator();
                    int i6 = 0;
                    while (it.hasNext()) {
                        try {
                            byte[] y = dtub.y((String) it.next());
                            int i7 = i6 + 1;
                            if (y == null) {
                                cjwoVar = null;
                            } else {
                                try {
                                    cjwoVar = (cjwo) eyfy.parseFrom(cjwo.a, y);
                                } catch (Throwable unused) {
                                    i6 = i7;
                                    cjwoVarArr3[i6] = null;
                                    i6++;
                                    i3 = 0;
                                }
                            }
                            cjwoVarArr3[i6] = cjwoVar;
                            i6 = i7;
                        } catch (Throwable unused2) {
                        }
                        i3 = 0;
                    }
                    cjwoVarArr = (cjwo[]) dtub.C(null, cjwoVarArr3, new cjwo[i3]);
                } else {
                    cjwoVarArr = new cjwo[]{l()};
                }
                dtsr.dz(length, cjwoVarArr, new emyl() { // from class: bwnt
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "self_profile_sharing_metadata:".concat(String.valueOf(bwoh.this.getString(5)));
                    }
                });
                String[] strArr10 = di(6) ? z ? (String[]) dtub.C(null, dt(getString(cM(6, ProfilesTable.a))), new String[0]) : new String[]{o()} : null;
                dtsr.dz(length, strArr10, new emyl() { // from class: bwnu
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "first_name:".concat(String.valueOf(bwoh.this.getString(6)));
                    }
                });
                String[] strArr11 = di(7) ? z ? (String[]) dtub.C(null, dt(getString(cM(7, ProfilesTable.a))), new String[0]) : new String[]{p()} : null;
                dtsr.dz(length, strArr11, new emyl() { // from class: bwnv
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "last_name:".concat(String.valueOf(bwoh.this.getString(7)));
                    }
                });
                String[] strArr12 = di(8) ? z ? (String[]) dtub.C(null, dt(getString(cM(8, ProfilesTable.a))), new String[0]) : new String[]{n()} : null;
                dtsr.dz(length, strArr12, new emyl() { // from class: bwnw
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "display_name:".concat(String.valueOf(bwoh.this.getString(8)));
                    }
                });
                if (!di(9)) {
                    jArr = dB;
                    cjwoVarArr2 = cjwoVarArr;
                    uriArr = null;
                } else if (z) {
                    String[] dt = dt(getString(cM(9, ProfilesTable.a)));
                    int length3 = dt.length;
                    jArr = dB;
                    Uri[] uriArr3 = new Uri[length3];
                    cjwoVarArr2 = cjwoVarArr;
                    int i8 = 0;
                    int i9 = 0;
                    while (i8 < length3) {
                        String str = dt[i8];
                        int i10 = i9 + 1;
                        uriArr3[i9] = (str == null || str.length() == 0) ? null : Uri.parse(str);
                        i8++;
                        i9 = i10;
                    }
                    uriArr = (Uri[]) dtub.C(null, uriArr3, new Uri[0]);
                } else {
                    jArr = dB;
                    cjwoVarArr2 = cjwoVarArr;
                    uriArr = new Uri[]{j()};
                }
                dtsr.dz(length, uriArr, new emyl() { // from class: bwnx
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "photo_uri:".concat(String.valueOf(bwoh.this.getString(9)));
                    }
                });
                String[] strArr13 = di(10) ? z ? (String[]) dtub.C(null, dt(getString(cM(10, ProfilesTable.a))), new String[0]) : new String[]{t()} : null;
                dtsr.dz(length, strArr13, new emyl() { // from class: bwny
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "sender_last_updated_time:".concat(String.valueOf(bwoh.this.getString(10)));
                    }
                });
                if (!di(11)) {
                    uriArr2 = uriArr;
                    strArr = null;
                } else if (z) {
                    uriArr2 = uriArr;
                    strArr = (String[]) dtub.C(null, dt(getString(cM(11, ProfilesTable.a))), new String[0]);
                } else {
                    uriArr2 = uriArr;
                    strArr = new String[]{u()};
                }
                dtsr.dz(length, strArr, new emyl() { // from class: bwnz
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "sender_last_updated_time_from_rcs:".concat(String.valueOf(bwoh.this.getString(11)));
                    }
                });
                if (!di(12)) {
                    strArr2 = strArr;
                    strArr3 = null;
                } else if (z) {
                    strArr2 = strArr;
                    strArr3 = (String[]) dtub.C(null, dt(getString(cM(12, ProfilesTable.a))), new String[0]);
                } else {
                    strArr2 = strArr;
                    strArr3 = new String[]{m()};
                }
                dtsr.dz(length, strArr3, new emyl() { // from class: bwoa
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "contact_lookup_key:".concat(String.valueOf(bwoh.this.getString(12)));
                    }
                });
                if (!di(13)) {
                    strArr4 = strArr3;
                    strArr5 = null;
                } else if (z) {
                    strArr4 = strArr3;
                    strArr5 = (String[]) dtub.C(null, dt(getString(cM(13, ProfilesTable.a))), new String[0]);
                } else {
                    strArr4 = strArr3;
                    strArr5 = new String[]{r()};
                }
                dtsr.dz(length, strArr5, new emyl() { // from class: bwob
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "phone_number:".concat(String.valueOf(bwoh.this.getString(13)));
                    }
                });
                boolean[] D = di(14) ? z ? dtub.D(null, du(getString(cM(14, ProfilesTable.a)))) : new boolean[]{x()} : null;
                dtsr.dA(length, D, new emyl() { // from class: bwoc
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "is_self_profile_shareable:".concat(String.valueOf(bwoh.this.getString(14)));
                    }
                });
                if (!di(15)) {
                    strArr6 = strArr5;
                    zArr = null;
                } else if (z) {
                    strArr6 = strArr5;
                    zArr = dtub.D(null, du(getString(cM(15, ProfilesTable.a))));
                } else {
                    strArr6 = strArr5;
                    zArr = new boolean[]{w()};
                }
                dtsr.dA(length, zArr, new emyl() { // from class: bwod
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "has_shared_access_token_with_user:".concat(String.valueOf(bwoh.this.getString(15)));
                    }
                });
                if (!di(16)) {
                    zArr2 = zArr;
                    jArr2 = null;
                } else if (z) {
                    zArr2 = zArr;
                    jArr2 = dtub.B(null, ds(getString(cM(16, ProfilesTable.a))));
                } else {
                    zArr2 = zArr;
                    jArr2 = new long[]{g()};
                }
                dtsr.dy(length, jArr2, new emyl() { // from class: bwoe
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "name_timestamp:".concat(String.valueOf(bwoh.this.getString(16)));
                    }
                });
                if (!di(17)) {
                    jArr3 = jArr2;
                    jArr4 = null;
                } else if (z) {
                    jArr3 = jArr2;
                    jArr4 = dtub.B(null, ds(getString(cM(17, ProfilesTable.a))));
                } else {
                    jArr3 = jArr2;
                    jArr4 = new long[]{i()};
                }
                dtsr.dy(length, jArr4, new emyl() { // from class: bwof
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "photo_timestamp:".concat(String.valueOf(bwoh.this.getString(17)));
                    }
                });
                if (!di(18)) {
                    jArr5 = jArr4;
                    zArr3 = null;
                } else if (z) {
                    jArr5 = jArr4;
                    zArr3 = dtub.D(null, du(getString(cM(18, ProfilesTable.a))));
                } else {
                    jArr5 = jArr4;
                    zArr3 = new boolean[]{v()};
                }
                dtsr.dA(length, zArr3, new emyl() { // from class: bwog
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "belongs_to_self_gaia:".concat(String.valueOf(bwoh.this.getString(18)));
                    }
                });
                long[] B3 = di(19) ? z ? dtub.B(null, ds(getString(cM(19, ProfilesTable.a)))) : new long[]{e()} : null;
                dtsr.dy(length, B3, new emyl() { // from class: bwno
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "gaia_update_timestamp:".concat(String.valueOf(bwoh.this.getString(19)));
                    }
                });
                engr engrVar = new engr();
                int i11 = 0;
                while (i11 < length) {
                    long j = jArr[i11];
                    if (j > 0) {
                        i = i11;
                        if (!hashSet.contains(Long.valueOf(j))) {
                            hashSet.add(Long.valueOf(jArr[i]));
                            String[] strArr14 = ProfilesTable.a;
                            bwlu bwluVar = new bwlu();
                            bwluVar.aF();
                            bwluVar.aD();
                            long j2 = jArr[i];
                            zArr4 = zArr3;
                            strArr7 = strArr13;
                            if (B != null) {
                                long j3 = B[i];
                                i2 = length;
                                bwluVar.aE(0);
                                bwluVar.a = j3;
                            } else {
                                i2 = length;
                            }
                            if (B2 != null) {
                                bwluVar.i(B2[i]);
                            }
                            if (strArr8 != null) {
                                bwluVar.j(strArr8[i]);
                            }
                            if (strArr9 != null) {
                                bwluVar.m(strArr9[i]);
                            }
                            if (aqgxVarArr != null) {
                                aqgx aqgxVar = aqgxVarArr[i];
                                int i12 = bwluVar.aB;
                                if (i12 < 60200) {
                                    dtub.w("sending_self_profile_interaction_state", i12);
                                }
                                bwluVar.aE(4);
                                bwluVar.e = aqgxVar;
                            }
                            if (cjwoVarArr2 != null) {
                                bwluVar.n(cjwoVarArr2[i]);
                            }
                            if (strArr10 != null) {
                                bwluVar.e(strArr10[i]);
                            }
                            if (strArr11 != null) {
                                bwluVar.h(strArr11[i]);
                            }
                            if (strArr12 != null) {
                                bwluVar.d(strArr12[i]);
                            }
                            if (uriArr2 != null) {
                                bwluVar.l(uriArr2[i]);
                            }
                            if (strArr7 != null) {
                                bwluVar.o(strArr7[i]);
                            }
                            if (strArr2 != null) {
                                bwluVar.p(strArr2[i]);
                            }
                            if (strArr4 != null) {
                                bwluVar.c(strArr4[i]);
                            }
                            if (strArr6 != null) {
                                bwluVar.k(strArr6[i]);
                            }
                            if (D != null) {
                                bwluVar.g(D[i]);
                            }
                            if (zArr2 != null) {
                                boolean z2 = zArr2[i];
                                int i13 = bwluVar.aB;
                                if (i13 < 60170) {
                                    dtub.w("has_shared_access_token_with_user", i13);
                                }
                                bwluVar.aE(15);
                                bwluVar.p = z2;
                            }
                            if (jArr3 != null) {
                                long j4 = jArr3[i];
                                bwluVar.aE(16);
                                bwluVar.q = j4;
                            }
                            if (jArr5 != null) {
                                long j5 = jArr5[i];
                                bwluVar.aE(17);
                                bwluVar.r = j5;
                            }
                            if (zArr4 != null) {
                                bwluVar.b(zArr4[i]);
                            }
                            if (B3 != null) {
                                bwluVar.f(B3[i]);
                            }
                            engrVar.h(bwluVar.a());
                            i11 = i + 1;
                            strArr13 = strArr7;
                            zArr3 = zArr4;
                            length = i2;
                        }
                    } else {
                        i = i11;
                    }
                    zArr4 = zArr3;
                    strArr7 = strArr13;
                    i2 = length;
                    i11 = i + 1;
                    strArr13 = strArr7;
                    zArr3 = zArr4;
                    length = i2;
                }
                return engrVar.g();
            }
        }
        int i14 = engw.d;
        return enou.a;
    }

    public final long g() {
        return getLong(cM(16, ProfilesTable.a));
    }

    public final long h() {
        return getLong(cM(1, ProfilesTable.a));
    }

    public final long i() {
        return getLong(cM(17, ProfilesTable.a));
    }

    public final Uri j() {
        String string = getString(cM(9, ProfilesTable.a));
        if (string == null) {
            return null;
        }
        return Uri.parse(string);
    }

    public final aqgx k() {
        aqgx[] values = aqgx.values();
        int i = getInt(cM(4, ProfilesTable.a));
        if (i < values.length) {
            return values[i];
        }
        throw new IllegalArgumentException();
    }

    public final cjwo l() {
        byte[] blob = getBlob(cM(5, ProfilesTable.a));
        if (blob == null) {
            return null;
        }
        try {
            return (cjwo) eyfy.parseFrom(cjwo.a, blob, eyfc.a());
        } catch (Throwable unused) {
            return cjwo.a;
        }
    }

    public final String m() {
        return getString(cM(12, ProfilesTable.a));
    }

    public final String n() {
        return getString(cM(8, ProfilesTable.a));
    }

    public final String o() {
        return getString(cM(6, ProfilesTable.a));
    }

    public final String p() {
        return getString(cM(7, ProfilesTable.a));
    }

    public final String q() {
        return getString(cM(2, ProfilesTable.a));
    }

    public final String r() {
        return getString(cM(13, ProfilesTable.a));
    }

    public final String s() {
        return getString(cM(3, ProfilesTable.a));
    }

    public final String t() {
        return getString(cM(10, ProfilesTable.a));
    }

    public final String u() {
        return getString(cM(11, ProfilesTable.a));
    }

    public final boolean v() {
        return getInt(cM(18, ProfilesTable.a)) == 1;
    }

    public final boolean w() {
        return getInt(cM(15, ProfilesTable.a)) == 1;
    }

    public final boolean x() {
        return getInt(cM(14, ProfilesTable.a)) == 1;
    }

    @Override // defpackage.dtsu
    public final Cursor a() {
        return this;
    }
}
