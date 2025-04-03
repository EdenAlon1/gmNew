package defpackage;

import android.database.Cursor;
import android.net.Uri;
import j$.time.Instant;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class btcd extends dtsr implements btbk {
    @Deprecated
    public btcd(dtve dtveVar, Cursor cursor, String[] strArr, dtzj[] dtzjVarArr, dtyo dtyoVar, dtvs dtvsVar, btcg btcgVar) {
        super(dtveVar, cursor, strArr, dtzjVarArr, btck.a, dtyoVar, dtvsVar, btcgVar);
    }

    @Override // defpackage.dtsr
    protected final /* synthetic */ dtro b() {
        return new bszt();
    }

    @Override // defpackage.btbk
    public final int c() {
        return getInt(cM(6, btck.a));
    }

    @Override // defpackage.btbk
    public final int e() {
        return getInt(cM(3, btck.a));
    }

    @Override // defpackage.btbk
    public final bdhg f() {
        return bdhg.a(getString(cM(0, btck.a)));
    }

    @Override // defpackage.dtsr
    public final engw fI(dtvn dtvnVar) {
        bdhg[] bdhgVarArr;
        Instant[] instantArr;
        long[] jArr;
        Uri[] uriArr;
        String[] strArr;
        byte[][] bArr;
        byte[][] bArr2;
        Uri[] uriArr2;
        String[] strArr2;
        String[] strArr3;
        byte[][] bArr3;
        Instant[] instantArr2;
        Instant[] instantArr3;
        String[] strArr4;
        String[] strArr5;
        String[] strArr6;
        String[] strArr7;
        int i;
        espe[] espeVarArr;
        int i2;
        String[] strArr8;
        String[] strArr9;
        espe espeVar;
        dtyq dtyqVar = dtvnVar.a;
        long[] dB = dB(getString(dtvnVar.h + 1));
        int length = dB.length;
        if (length != 0) {
            if (length != 1 || dB[0] != -1) {
                HashSet hashSet = new HashSet();
                dtvs dtvsVar = this.d;
                boolean di = di(0);
                boolean z = dtvsVar.b;
                if (!di) {
                    bdhgVarArr = null;
                } else if (z) {
                    String[] dt = dt(getString(cM(0, btck.a)));
                    int length2 = dt.length;
                    bdhg[] bdhgVarArr2 = new bdhg[length2];
                    for (int i3 = 0; i3 < length2; i3++) {
                        bdhgVarArr2[i3] = bdhg.a(dt[i3]);
                    }
                    bdhgVarArr = (bdhg[]) dtub.C(null, bdhgVarArr2, new bdhg[0]);
                } else {
                    bdhgVarArr = new bdhg[]{f()};
                }
                dtsr.dz(length, bdhgVarArr, new emyl() { // from class: btbl
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "rcs_message_id:".concat(String.valueOf(btcd.this.getString(0)));
                    }
                });
                byte[][] E = di(1) ? z ? dtub.E(null, dC(getString(cM(1, btck.a)))) : new byte[][]{n()} : null;
                dtsr.dz(length, E, new emyl() { // from class: btcc
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "preview_etouffee:".concat(String.valueOf(btcd.this.getString(1)));
                    }
                });
                byte[][] E2 = di(2) ? z ? dtub.E(null, dC(getString(cM(2, btck.a)))) : new byte[][]{m()} : null;
                dtsr.dz(length, E2, new emyl() { // from class: btbm
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "preview_summary:".concat(String.valueOf(btcd.this.getString(2)));
                    }
                });
                int[] z2 = di(3) ? z ? dtub.z(null, dr(getString(cM(3, btck.a)))) : new int[]{e()} : null;
                dtsr.dx(length, z2, new emyl() { // from class: btbn
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "preview_version:".concat(String.valueOf(btcd.this.getString(3)));
                    }
                });
                byte[][] E3 = di(4) ? z ? dtub.E(null, dC(getString(cM(4, btck.a)))) : new byte[][]{l()} : null;
                dtsr.dz(length, E3, new emyl() { // from class: btbo
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "attachment_etouffee:".concat(String.valueOf(btcd.this.getString(4)));
                    }
                });
                byte[][] E4 = di(5) ? z ? dtub.E(null, dC(getString(cM(5, btck.a)))) : new byte[][]{k()} : null;
                dtsr.dz(length, E4, new emyl() { // from class: btbp
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "attachment_summary:".concat(String.valueOf(btcd.this.getString(5)));
                    }
                });
                int[] z3 = di(6) ? z ? dtub.z(null, dr(getString(cM(6, btck.a)))) : new int[]{c()} : null;
                dtsr.dx(length, z3, new emyl() { // from class: btbq
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "attachment_version:".concat(String.valueOf(btcd.this.getString(6)));
                    }
                });
                if (!di(7)) {
                    instantArr = null;
                } else if (z) {
                    long[] ds = ds(getString(cM(7, btck.a)));
                    int length3 = ds.length;
                    Instant[] instantArr4 = new Instant[length3];
                    for (int i4 = 0; i4 < length3; i4++) {
                        instantArr4[i4] = bdgw.b(ds[i4]);
                    }
                    instantArr = (Instant[]) dtub.C(null, instantArr4, new Instant[0]);
                } else {
                    instantArr = new Instant[]{p()};
                }
                dtsr.dz(length, instantArr, new emyl() { // from class: btbr
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "creation_timestamp:".concat(String.valueOf(btcd.this.getString(7)));
                    }
                });
                if (!di(8)) {
                    jArr = dB;
                    uriArr = null;
                } else if (z) {
                    String[] dt2 = dt(getString(cM(8, btck.a)));
                    int length4 = dt2.length;
                    Uri[] uriArr3 = new Uri[length4];
                    jArr = dB;
                    int i5 = 0;
                    int i6 = 0;
                    while (i5 < length4) {
                        String str = dt2[i5];
                        int i7 = i6 + 1;
                        uriArr3[i6] = (str == null || str.length() == 0) ? null : Uri.parse(str);
                        i5++;
                        i6 = i7;
                    }
                    uriArr = (Uri[]) dtub.C(null, uriArr3, new Uri[0]);
                } else {
                    jArr = dB;
                    uriArr = new Uri[]{o()};
                }
                dtsr.dz(length, uriArr, new emyl() { // from class: btbs
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "attachment_uri:".concat(String.valueOf(btcd.this.getString(8)));
                    }
                });
                String[] strArr10 = di(9) ? z ? (String[]) dtub.C(null, dt(getString(cM(9, btck.a))), new String[0]) : new String[]{r()} : null;
                dtsr.dz(length, strArr10, new emyl() { // from class: btbt
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "custom_delivery_receipt_mime_type:".concat(String.valueOf(btcd.this.getString(9)));
                    }
                });
                byte[][] E5 = di(10) ? z ? dtub.E(null, dC(getString(cM(10, btck.a)))) : new byte[][]{t()} : null;
                dtsr.dz(length, E5, new emyl() { // from class: btbu
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "custom_delivery_receipt_content:".concat(String.valueOf(btcd.this.getString(10)));
                    }
                });
                if (!di(11)) {
                    strArr = strArr10;
                    bArr = null;
                } else if (z) {
                    strArr = strArr10;
                    bArr = dtub.E(null, dC(getString(cM(11, btck.a))));
                } else {
                    strArr = strArr10;
                    bArr = new byte[][]{u()};
                }
                dtsr.dz(length, bArr, new emyl() { // from class: btbv
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "file_uploaded_xml_from_content_server:".concat(String.valueOf(btcd.this.getString(11)));
                    }
                });
                if (!di(12)) {
                    bArr2 = bArr;
                    uriArr2 = uriArr;
                    strArr2 = null;
                } else if (z) {
                    bArr2 = bArr;
                    uriArr2 = uriArr;
                    strArr2 = (String[]) dtub.C(null, dt(getString(cM(12, btck.a))), new String[0]);
                } else {
                    bArr2 = bArr;
                    uriArr2 = uriArr;
                    strArr2 = new String[]{s()};
                }
                dtsr.dz(length, strArr2, new emyl() { // from class: btbw
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "file_uploaded_fallback_uri:".concat(String.valueOf(btcd.this.getString(12)));
                    }
                });
                if (!di(13)) {
                    strArr3 = strArr2;
                    bArr3 = E5;
                    instantArr2 = null;
                } else if (z) {
                    long[] ds2 = ds(getString(cM(13, btck.a)));
                    int length5 = ds2.length;
                    strArr3 = strArr2;
                    Instant[] instantArr5 = new Instant[length5];
                    bArr3 = E5;
                    for (int i8 = 0; i8 < length5; i8++) {
                        instantArr5[i8] = bdgw.b(ds2[i8]);
                    }
                    instantArr2 = (Instant[]) dtub.C(null, instantArr5, new Instant[0]);
                } else {
                    strArr3 = strArr2;
                    bArr3 = E5;
                    instantArr2 = new Instant[]{q()};
                }
                dtsr.dz(length, instantArr2, new emyl() { // from class: btbx
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "file_uploaded_expiry:".concat(String.valueOf(btcd.this.getString(13)));
                    }
                });
                String[] strArr11 = di(14) ? z ? (String[]) dtub.C(null, dt(getString(cM(14, btck.a))), new String[0]) : new String[]{i()} : null;
                dtsr.dz(length, strArr11, new emyl() { // from class: btby
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "plaintext_attachment_name:".concat(String.valueOf(btcd.this.getString(14)));
                    }
                });
                if (!di(15)) {
                    instantArr3 = instantArr2;
                    strArr4 = null;
                } else if (z) {
                    instantArr3 = instantArr2;
                    strArr4 = (String[]) dtub.C(null, dt(getString(cM(15, btck.a))), new String[0]);
                } else {
                    instantArr3 = instantArr2;
                    strArr4 = new String[]{h()};
                }
                dtsr.dz(length, strArr4, new emyl() { // from class: btbz
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "plaintext_attachment_content_type:".concat(String.valueOf(btcd.this.getString(15)));
                    }
                });
                if (!di(16)) {
                    strArr5 = strArr4;
                    strArr6 = null;
                } else if (z) {
                    strArr5 = strArr4;
                    strArr6 = (String[]) dtub.C(null, dt(getString(cM(16, btck.a))), new String[0]);
                } else {
                    strArr5 = strArr4;
                    strArr6 = new String[]{j()};
                }
                dtsr.dz(length, strArr6, new emyl() { // from class: btca
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "plaintext_thumbnail_content_type:".concat(String.valueOf(btcd.this.getString(16)));
                    }
                });
                if (!di(17)) {
                    strArr7 = strArr6;
                    i = 0;
                    espeVarArr = null;
                } else if (z) {
                    List de = de(getString(cM(17, btck.a)));
                    espe[] espeVarArr2 = new espe[de.size()];
                    Iterator it = de.iterator();
                    int i9 = 0;
                    while (it.hasNext()) {
                        try {
                            byte[] y = dtub.y((String) it.next());
                            int i10 = i9 + 1;
                            if (y == null) {
                                strArr9 = strArr6;
                                espeVar = null;
                            } else {
                                strArr9 = strArr6;
                                try {
                                    espeVar = (espe) eyfy.parseFrom(espe.a, y);
                                } catch (Throwable unused) {
                                    i9 = i10;
                                    espeVarArr2[i9] = null;
                                    i9++;
                                    strArr6 = strArr9;
                                }
                            }
                            espeVarArr2[i9] = espeVar;
                            i9 = i10;
                        } catch (Throwable unused2) {
                            strArr9 = strArr6;
                        }
                        strArr6 = strArr9;
                    }
                    strArr7 = strArr6;
                    i = 0;
                    espeVarArr = (espe[]) dtub.C(null, espeVarArr2, new espe[0]);
                } else {
                    strArr7 = strArr6;
                    i = 0;
                    espeVarArr = new espe[]{g()};
                }
                dtsr.dz(length, espeVarArr, new emyl() { // from class: btcb
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "mls_file_info:".concat(String.valueOf(btcd.this.getString(17)));
                    }
                });
                engr engrVar = new engr();
                while (i < length) {
                    long j = jArr[i];
                    if (j <= 0 || hashSet.contains(Long.valueOf(j))) {
                        i2 = i;
                        strArr8 = strArr11;
                    } else {
                        hashSet.add(Long.valueOf(jArr[i]));
                        String[] strArr12 = btck.a;
                        bszx bszxVar = new bszx();
                        bszxVar.aF();
                        bszxVar.aD();
                        long j2 = jArr[i];
                        if (bdhgVarArr != null) {
                            bszxVar.p(bdhgVarArr[i]);
                        }
                        if (E != null) {
                            bszxVar.n(E[i]);
                        }
                        if (E2 != null) {
                            bszxVar.m(E2[i]);
                        }
                        if (z2 != null) {
                            bszxVar.o(z2[i]);
                        }
                        if (E3 != null) {
                            bszxVar.d(E3[i]);
                        }
                        if (E4 != null) {
                            bszxVar.c(E4[i]);
                        }
                        if (z3 != null) {
                            bszxVar.e(z3[i]);
                        }
                        if (instantArr != null) {
                            bszxVar.g(instantArr[i]);
                        }
                        if (uriArr2 != null) {
                            bszxVar.f(uriArr2[i]);
                        }
                        if (strArr != null) {
                            bszxVar.i(strArr[i]);
                        }
                        if (bArr3 != null) {
                            bszxVar.h(bArr3[i]);
                        }
                        i2 = i;
                        if (bArr2 != null) {
                            byte[] bArr4 = bArr2[i2];
                            strArr8 = strArr11;
                            int i11 = bszxVar.aB;
                            if (i11 < 48010) {
                                dtub.w("file_uploaded_xml_from_content_server", i11);
                            }
                            bszxVar.aE(11);
                            bszxVar.l = bArr4;
                        } else {
                            strArr8 = strArr11;
                        }
                        if (strArr3 != null) {
                            String str2 = strArr3[i2];
                            int i12 = bszxVar.aB;
                            if (i12 < 48010) {
                                dtub.w("file_uploaded_fallback_uri", i12);
                            }
                            bszxVar.aE(12);
                            bszxVar.m = str2;
                        }
                        if (instantArr3 != null) {
                            Instant instant = instantArr3[i2];
                            int i13 = bszxVar.aB;
                            if (i13 < 48010) {
                                dtub.w("file_uploaded_expiry", i13);
                            }
                            bszxVar.aE(13);
                            bszxVar.n = instant;
                        }
                        if (strArr8 != null) {
                            bszxVar.k(strArr8[i2]);
                        }
                        if (strArr5 != null) {
                            bszxVar.j(strArr5[i2]);
                        }
                        if (strArr7 != null) {
                            bszxVar.l(strArr7[i2]);
                        }
                        if (espeVarArr != null) {
                            espe espeVar2 = espeVarArr[i2];
                            int i14 = bszxVar.aB;
                            if (i14 < 60700) {
                                dtub.w("mls_file_info", i14);
                            }
                            bszxVar.aE(17);
                            bszxVar.r = espeVar2;
                        }
                        engrVar.h(bszxVar.a(new Supplier() { // from class: bszv
                            @Override // java.util.function.Supplier
                            public final Object get() {
                                return new bszt();
                            }
                        }));
                    }
                    i = i2 + 1;
                    strArr11 = strArr8;
                }
                return engrVar.g();
            }
        }
        int i15 = engw.d;
        return enou.a;
    }

    @Override // defpackage.btbk
    public final espe g() {
        byte[] blob = getBlob(cM(17, btck.a));
        if (blob == null) {
            return null;
        }
        try {
            return (espe) eyfy.parseFrom(espe.a, blob, eyfc.a());
        } catch (Throwable unused) {
            return espe.a;
        }
    }

    @Override // defpackage.btbk
    public final String h() {
        return getString(cM(15, btck.a));
    }

    @Override // defpackage.btbk
    public final String i() {
        return getString(cM(14, btck.a));
    }

    @Override // defpackage.btbk
    public final String j() {
        return getString(cM(16, btck.a));
    }

    @Override // defpackage.btbk
    public final byte[] k() {
        return getBlob(cM(5, btck.a));
    }

    @Override // defpackage.btbk
    public final byte[] l() {
        return getBlob(cM(4, btck.a));
    }

    @Override // defpackage.btbk
    public final byte[] m() {
        return getBlob(cM(2, btck.a));
    }

    @Override // defpackage.btbk
    public final byte[] n() {
        return getBlob(cM(1, btck.a));
    }

    public final Uri o() {
        String string = getString(cM(8, btck.a));
        if (string == null) {
            return null;
        }
        return Uri.parse(string);
    }

    public final Instant p() {
        return bdgw.b(getLong(cM(7, btck.a)));
    }

    public final Instant q() {
        return bdgw.b(getLong(cM(13, btck.a)));
    }

    public final String r() {
        return getString(cM(9, btck.a));
    }

    public final String s() {
        return getString(cM(12, btck.a));
    }

    public final byte[] t() {
        return getBlob(cM(10, btck.a));
    }

    public final byte[] u() {
        return getBlob(cM(11, btck.a));
    }

    @Override // defpackage.dtsu
    public final Cursor a() {
        return this;
    }
}
