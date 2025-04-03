package defpackage;

import android.database.Cursor;
import android.net.Uri;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class awff extends dtsr implements awew {
    @Deprecated
    public awff(dtve dtveVar, Cursor cursor, String[] strArr, dtzj[] dtzjVarArr, dtyo dtyoVar, dtvs dtvsVar, awfk awfkVar) {
        super(dtveVar, cursor, strArr, dtzjVarArr, awfq.a, dtyoVar, dtvsVar, awfkVar);
    }

    @Override // defpackage.dtsr
    protected final /* synthetic */ dtro b() {
        return new aweb();
    }

    public final Uri c() {
        String string = getString(cM(2, awfq.a));
        if (string == null) {
            return null;
        }
        return Uri.parse(string);
    }

    public final awap e() {
        return awao.a(getString(cM(0, awfq.a)));
    }

    public final awfr f() {
        awfr[] values = awfr.values();
        int i = getInt(cM(1, awfq.a));
        if (i < values.length) {
            return values[i];
        }
        throw new IllegalArgumentException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.dtsr
    public final engw fI(dtvn dtvnVar) {
        awap[] awapVarArr;
        awfr[] awfrVarArr;
        Uri[] uriArr;
        awup[] awupVarArr;
        fayi[] fayiVarArr;
        awvb[] awvbVarArr;
        int i;
        espg[] espgVarArr;
        long[] jArr;
        espg espgVar;
        awvb awvbVar;
        fayi fayiVar;
        awup awupVar;
        dtyq dtyqVar = dtvnVar.a;
        long[] dB = dB(getString(dtvnVar.h + 1));
        int length = dB.length;
        if (length != 0) {
            int i2 = 0;
            if (length != 1 || dB[0] != -1) {
                HashSet hashSet = new HashSet();
                boolean z = this.d.b;
                awvb awvbVar2 = null;
                if (!di(0)) {
                    awapVarArr = null;
                } else if (z) {
                    String[] dt = dt(getString(cM(0, awfq.a)));
                    int length2 = dt.length;
                    awap[] awapVarArr2 = new awap[length2];
                    for (int i3 = 0; i3 < length2; i3++) {
                        awapVarArr2[i3] = awao.a(dt[i3]);
                    }
                    awapVarArr = (awap[]) dtub.C(null, awapVarArr2, new awap[0]);
                } else {
                    awapVarArr = new awap[]{e()};
                }
                dtsr.dz(length, awapVarArr, new emyl() { // from class: awex
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "processing_id:".concat(String.valueOf(awff.this.getString(0)));
                    }
                });
                if (!di(1)) {
                    awfrVarArr = null;
                } else if (z) {
                    int[] dr = dr(getString(cM(1, awfq.a)));
                    awfr[] values = awfr.values();
                    int length3 = values.length;
                    awfr[] awfrVarArr2 = new awfr[dr.length];
                    for (int i4 = 0; i4 < dr.length; i4++) {
                        int i5 = dr[i4];
                        if (i5 >= length3) {
                            throw new IllegalStateException();
                        }
                        awfrVarArr2[i4] = values[i5];
                    }
                    awfrVarArr = (awfr[]) dtub.C(null, awfrVarArr2, new awfr[0]);
                } else {
                    awfrVarArr = new awfr[]{f()};
                }
                dtsr.dz(length, awfrVarArr, new emyl() { // from class: awey
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "file_type:".concat(String.valueOf(awff.this.getString(1)));
                    }
                });
                if (!di(2)) {
                    uriArr = null;
                } else if (z) {
                    String[] dt2 = dt(getString(cM(2, awfq.a)));
                    int length4 = dt2.length;
                    Uri[] uriArr2 = new Uri[length4];
                    int i6 = 0;
                    int i7 = 0;
                    while (i6 < length4) {
                        String str = dt2[i6];
                        int i8 = i7 + 1;
                        uriArr2[i7] = (str == null || str.length() == 0) ? null : Uri.parse(str);
                        i6++;
                        i7 = i8;
                    }
                    uriArr = (Uri[]) dtub.C(null, uriArr2, new Uri[0]);
                } else {
                    uriArr = new Uri[]{c()};
                }
                dtsr.dz(length, uriArr, new emyl() { // from class: awez
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "file_uri:".concat(String.valueOf(awff.this.getString(2)));
                    }
                });
                if (!di(3)) {
                    awupVarArr = null;
                } else if (z) {
                    List de = de(getString(cM(3, awfq.a)));
                    awup[] awupVarArr2 = new awup[de.size()];
                    Iterator it = de.iterator();
                    int i9 = 0;
                    while (it.hasNext()) {
                        try {
                            byte[] y = dtub.y((String) it.next());
                            int i10 = i9 + 1;
                            if (y == null) {
                                awupVar = null;
                            } else {
                                try {
                                    awupVar = (awup) eyfy.parseFrom(awup.a, y);
                                } catch (Throwable unused) {
                                    i9 = i10;
                                    awupVarArr2[i9] = null;
                                    i9++;
                                }
                            }
                            awupVarArr2[i9] = awupVar;
                            i9 = i10;
                        } catch (Throwable unused2) {
                        }
                    }
                    awupVarArr = (awup[]) dtub.C(null, awupVarArr2, new awup[0]);
                } else {
                    awupVarArr = new awup[]{g()};
                }
                dtsr.dz(length, awupVarArr, new emyl() { // from class: awfa
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "content_type:".concat(String.valueOf(awff.this.getString(3)));
                    }
                });
                if (!di(4)) {
                    fayiVarArr = null;
                } else if (z) {
                    List de2 = de(getString(cM(4, awfq.a)));
                    fayi[] fayiVarArr2 = new fayi[de2.size()];
                    Iterator it2 = de2.iterator();
                    int i11 = 0;
                    while (it2.hasNext()) {
                        try {
                            byte[] y2 = dtub.y((String) it2.next());
                            int i12 = i11 + 1;
                            if (y2 == null) {
                                fayiVar = null;
                            } else {
                                try {
                                    fayiVar = (fayi) eyfy.parseFrom(fayi.a, y2);
                                } catch (Throwable unused3) {
                                    i11 = i12;
                                    fayiVarArr2[i11] = null;
                                    i11++;
                                }
                            }
                            fayiVarArr2[i11] = fayiVar;
                            i11 = i12;
                        } catch (Throwable unused4) {
                        }
                    }
                    fayiVarArr = (fayi[]) dtub.C(null, fayiVarArr2, new fayi[0]);
                } else {
                    fayiVarArr = new fayi[]{j()};
                }
                dtsr.dz(length, fayiVarArr, new emyl() { // from class: awfb
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "encryption_metadata:".concat(String.valueOf(awff.this.getString(4)));
                    }
                });
                String[] strArr = di(5) ? z ? (String[]) dtub.C(null, dt(getString(cM(5, awfq.a))), new String[0]) : new String[]{k()} : null;
                dtsr.dz(length, strArr, new emyl() { // from class: awfc
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "transfer_handle:".concat(String.valueOf(awff.this.getString(5)));
                    }
                });
                if (!di(6)) {
                    awvbVarArr = null;
                } else if (z) {
                    List de3 = de(getString(cM(6, awfq.a)));
                    awvb[] awvbVarArr2 = new awvb[de3.size()];
                    Iterator it3 = de3.iterator();
                    int i13 = 0;
                    while (it3.hasNext()) {
                        awvb awvbVar3 = awvbVar2;
                        try {
                            byte[] y3 = dtub.y((String) it3.next());
                            int i14 = i13 + 1;
                            if (y3 == null) {
                                awvbVar = awvbVar3;
                            } else {
                                try {
                                    awvbVar = (awvb) eyfy.parseFrom(awvb.a, y3);
                                } catch (Throwable unused5) {
                                    i13 = i14;
                                    awvbVarArr2[i13] = awvbVar3;
                                    i13++;
                                    awvbVar2 = awvbVar3;
                                    i2 = 0;
                                }
                            }
                            awvbVarArr2[i13] = awvbVar;
                            i13 = i14;
                        } catch (Throwable unused6) {
                        }
                        awvbVar2 = awvbVar3;
                        i2 = 0;
                    }
                    awvbVarArr = (awvb[]) dtub.C(awvbVar2, awvbVarArr2, new awvb[i2]);
                } else {
                    awvbVarArr = new awvb[]{h()};
                }
                dtsr.dz(length, awvbVarArr, new emyl() { // from class: awfd
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "upload_result:".concat(String.valueOf(awff.this.getString(6)));
                    }
                });
                if (!di(7)) {
                    i = 0;
                    espgVarArr = null;
                } else if (z) {
                    List de4 = de(getString(cM(7, awfq.a)));
                    espg[] espgVarArr2 = new espg[de4.size()];
                    Iterator it4 = de4.iterator();
                    int i15 = 0;
                    while (it4.hasNext()) {
                        try {
                            byte[] y4 = dtub.y((String) it4.next());
                            int i16 = i15 + 1;
                            if (y4 == null) {
                                espgVar = null;
                            } else {
                                try {
                                    espgVar = (espg) eyfy.parseFrom(espg.a, y4);
                                } catch (Throwable unused7) {
                                    i15 = i16;
                                    espgVarArr2[i15] = null;
                                    i15++;
                                }
                            }
                            espgVarArr2[i15] = espgVar;
                            i15 = i16;
                        } catch (Throwable unused8) {
                        }
                    }
                    i = 0;
                    espgVarArr = (espg[]) dtub.C(null, espgVarArr2, new espg[0]);
                } else {
                    i = 0;
                    espgVarArr = new espg[]{i()};
                }
                dtsr.dz(length, espgVarArr, new emyl() { // from class: awfe
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "mls_file_metadata:".concat(String.valueOf(awff.this.getString(7)));
                    }
                });
                engr engrVar = new engr();
                while (i < length) {
                    long j = dB[i];
                    if (j <= 0 || hashSet.contains(Long.valueOf(j))) {
                        jArr = dB;
                    } else {
                        hashSet.add(Long.valueOf(dB[i]));
                        String[] strArr2 = awfq.a;
                        awed awedVar = new awed();
                        awedVar.aF();
                        awedVar.aD();
                        long j2 = dB[i];
                        if (awapVarArr != null) {
                            awedVar.d(awapVarArr[i]);
                        }
                        if (awfrVarArr != null) {
                            awedVar.c(awfrVarArr[i]);
                        }
                        if (uriArr != null) {
                            Uri uri = uriArr[i];
                            awedVar.aE(2);
                            awedVar.c = uri;
                        }
                        if (awupVarArr != null) {
                            awup awupVar2 = awupVarArr[i];
                            awedVar.aE(3);
                            awedVar.d = awupVar2;
                        }
                        if (fayiVarArr != null) {
                            awedVar.b(fayiVarArr[i]);
                        }
                        if (strArr != null) {
                            awedVar.e(strArr[i]);
                        }
                        if (awvbVarArr != null) {
                            awedVar.f(awvbVarArr[i]);
                        }
                        if (espgVarArr != null) {
                            espg espgVar2 = espgVarArr[i];
                            int i17 = awedVar.aB;
                            jArr = dB;
                            if (i17 < 60700) {
                                dtub.w("mls_file_metadata", i17);
                            }
                            awedVar.aE(7);
                            awedVar.h = espgVar2;
                        } else {
                            jArr = dB;
                        }
                        engrVar.h(awedVar.a());
                    }
                    i++;
                    dB = jArr;
                }
                return engrVar.g();
            }
        }
        int i18 = engw.d;
        return enou.a;
    }

    public final awup g() {
        byte[] blob = getBlob(cM(3, awfq.a));
        if (blob == null) {
            return null;
        }
        try {
            return (awup) eyfy.parseFrom(awup.a, blob, eyfc.a());
        } catch (Throwable unused) {
            return awup.a;
        }
    }

    public final awvb h() {
        byte[] blob = getBlob(cM(6, awfq.a));
        if (blob == null) {
            return null;
        }
        try {
            return (awvb) eyfy.parseFrom(awvb.a, blob, eyfc.a());
        } catch (Throwable unused) {
            return awvb.a;
        }
    }

    public final espg i() {
        byte[] blob = getBlob(cM(7, awfq.a));
        if (blob == null) {
            return null;
        }
        try {
            return (espg) eyfy.parseFrom(espg.a, blob, eyfc.a());
        } catch (Throwable unused) {
            return espg.a;
        }
    }

    public final fayi j() {
        byte[] blob = getBlob(cM(4, awfq.a));
        if (blob == null) {
            return null;
        }
        try {
            return (fayi) eyfy.parseFrom(fayi.a, blob, eyfc.a());
        } catch (Throwable unused) {
            return fayi.a;
        }
    }

    public final String k() {
        return getString(cM(5, awfq.a));
    }

    @Override // defpackage.dtsu
    public final Cursor a() {
        return this;
    }
}
