package defpackage;

import android.database.Cursor;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cqsy extends dtsr implements cqsp {
    @Deprecated
    public cqsy(dtve dtveVar, Cursor cursor, String[] strArr, dtzj[] dtzjVarArr, dtyo dtyoVar, dtvs dtvsVar, cqtd cqtdVar) {
        super(dtveVar, cursor, strArr, dtzjVarArr, cqtj.a, dtyoVar, dtvsVar, cqtdVar);
    }

    @Override // defpackage.dtsr
    protected final /* synthetic */ dtro b() {
        return new cqrt();
    }

    @Override // defpackage.cqsp
    public final engw c() {
        engr engrVar = new engr();
        while (moveToNext()) {
            h();
            engrVar.h(h());
        }
        return engrVar.g();
    }

    public final awvb e() {
        byte[] blob = getBlob(cM(4, cqtj.a));
        if (blob == null) {
            return null;
        }
        try {
            return (awvb) eyfy.parseFrom(awvb.a, blob, eyfc.a());
        } catch (Throwable unused) {
            return awvb.a;
        }
    }

    public final awvb f() {
        byte[] blob = getBlob(cM(5, cqtj.a));
        if (blob == null) {
            return null;
        }
        try {
            return (awvb) eyfy.parseFrom(awvb.a, blob, eyfc.a());
        } catch (Throwable unused) {
            return awvb.a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.dtsr
    public final engw fI(dtvn dtvnVar) {
        MessageIdType[] messageIdTypeArr;
        cqtk[] cqtkVarArr;
        awvd[] awvdVarArr;
        awvb[] awvbVarArr;
        awvb[] awvbVarArr2;
        long[] jArr;
        char c;
        awvb awvbVar;
        awvb awvbVar2;
        awvd awvdVar;
        dtyq dtyqVar = dtvnVar.a;
        long[] dB = dB(getString(dtvnVar.h + 1));
        int length = dB.length;
        if (length != 0) {
            int i = 0;
            if (length != 1 || dB[0] != -1) {
                HashSet hashSet = new HashSet();
                dtvs dtvsVar = this.d;
                boolean di = di(0);
                boolean z = dtvsVar.b;
                awvb awvbVar3 = null;
                if (!di) {
                    messageIdTypeArr = null;
                } else if (z) {
                    long[] ds = ds(getString(cM(0, cqtj.a)));
                    int length2 = ds.length;
                    MessageIdType[] messageIdTypeArr2 = new MessageIdType[length2];
                    for (int i2 = 0; i2 < length2; i2++) {
                        messageIdTypeArr2[i2] = new MessageIdType(ds[i2]);
                    }
                    messageIdTypeArr = (MessageIdType[]) dtub.C(null, messageIdTypeArr2, new MessageIdType[0]);
                } else {
                    messageIdTypeArr = new MessageIdType[]{h()};
                }
                dtsr.dz(length, messageIdTypeArr, new emyl() { // from class: cqsq
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "message_id:".concat(String.valueOf(cqsy.this.getString(0)));
                    }
                });
                String[] strArr = di(1) ? z ? (String[]) dtub.C(null, dt(getString(cM(1, cqtj.a))), new String[0]) : new String[]{k()} : null;
                dtsr.dz(length, strArr, new emyl() { // from class: cqsr
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "transfer_id:".concat(String.valueOf(cqsy.this.getString(1)));
                    }
                });
                if (!di(2)) {
                    cqtkVarArr = null;
                } else if (z) {
                    int[] dr = dr(getString(cM(2, cqtj.a)));
                    cqtk[] values = cqtk.values();
                    int length3 = values.length;
                    cqtk[] cqtkVarArr2 = new cqtk[dr.length];
                    for (int i3 = 0; i3 < dr.length; i3++) {
                        int i4 = dr[i3];
                        if (i4 >= length3) {
                            throw new IllegalStateException();
                        }
                        cqtkVarArr2[i3] = values[i4];
                    }
                    cqtkVarArr = (cqtk[]) dtub.C(null, cqtkVarArr2, new cqtk[0]);
                } else {
                    cqtkVarArr = new cqtk[]{i()};
                }
                dtsr.dz(length, cqtkVarArr, new emyl() { // from class: cqss
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "transfer_type:".concat(String.valueOf(cqsy.this.getString(2)));
                    }
                });
                if (!di(3)) {
                    awvdVarArr = null;
                } else if (z) {
                    List de = de(getString(cM(3, cqtj.a)));
                    awvd[] awvdVarArr2 = new awvd[de.size()];
                    Iterator it = de.iterator();
                    int i5 = 0;
                    while (it.hasNext()) {
                        try {
                            byte[] y = dtub.y((String) it.next());
                            int i6 = i5 + 1;
                            if (y == null) {
                                awvdVar = null;
                            } else {
                                try {
                                    awvdVar = (awvd) eyfy.parseFrom(awvd.a, y);
                                } catch (Throwable unused) {
                                    i5 = i6;
                                    awvdVarArr2[i5] = null;
                                    i5++;
                                }
                            }
                            awvdVarArr2[i5] = awvdVar;
                            i5 = i6;
                        } catch (Throwable unused2) {
                        }
                    }
                    awvdVarArr = (awvd[]) dtub.C(null, awvdVarArr2, new awvd[0]);
                } else {
                    awvdVarArr = new awvd[]{g()};
                }
                dtsr.dz(length, awvdVarArr, new emyl() { // from class: cqst
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "attachment_upload_response:".concat(String.valueOf(cqsy.this.getString(3)));
                    }
                });
                if (!di(4)) {
                    awvbVarArr = null;
                } else if (z) {
                    List de2 = de(getString(cM(4, cqtj.a)));
                    awvb[] awvbVarArr3 = new awvb[de2.size()];
                    Iterator it2 = de2.iterator();
                    int i7 = 0;
                    while (it2.hasNext()) {
                        try {
                            byte[] y2 = dtub.y((String) it2.next());
                            int i8 = i7 + 1;
                            if (y2 == null) {
                                awvbVar2 = null;
                            } else {
                                try {
                                    awvbVar2 = (awvb) eyfy.parseFrom(awvb.a, y2);
                                } catch (Throwable unused3) {
                                    i7 = i8;
                                    awvbVarArr3[i7] = null;
                                    i7++;
                                }
                            }
                            awvbVarArr3[i7] = awvbVar2;
                            i7 = i8;
                        } catch (Throwable unused4) {
                        }
                    }
                    awvbVarArr = (awvb[]) dtub.C(null, awvbVarArr3, new awvb[0]);
                } else {
                    awvbVarArr = new awvb[]{e()};
                }
                dtsr.dz(length, awvbVarArr, new emyl() { // from class: cqsu
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "file_information:".concat(String.valueOf(cqsy.this.getString(4)));
                    }
                });
                if (!di(5)) {
                    awvbVarArr2 = null;
                } else if (z) {
                    List de3 = de(getString(cM(5, cqtj.a)));
                    awvb[] awvbVarArr4 = new awvb[de3.size()];
                    Iterator it3 = de3.iterator();
                    int i9 = 0;
                    while (it3.hasNext()) {
                        try {
                            byte[] y3 = dtub.y((String) it3.next());
                            int i10 = i9 + 1;
                            if (y3 == null) {
                                awvbVar = awvbVar3;
                            } else {
                                awvbVar = awvbVar3;
                                try {
                                    awvbVar3 = (awvb) eyfy.parseFrom(awvb.a, y3);
                                } catch (Throwable unused5) {
                                    i9 = i10;
                                    awvbVarArr4[i9] = awvbVar;
                                    i9++;
                                    awvbVar3 = awvbVar;
                                }
                            }
                            awvbVarArr4[i9] = awvbVar3;
                            i9 = i10;
                        } catch (Throwable unused6) {
                            awvbVar = awvbVar3;
                        }
                        awvbVar3 = awvbVar;
                    }
                    awvbVarArr2 = (awvb[]) dtub.C(awvbVar3, awvbVarArr4, new awvb[0]);
                } else {
                    awvbVarArr2 = new awvb[]{f()};
                }
                dtsr.dz(length, awvbVarArr2, new emyl() { // from class: cqsv
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "thumbnail_information:".concat(String.valueOf(cqsy.this.getString(5)));
                    }
                });
                char c2 = 6;
                String[] strArr2 = di(6) ? z ? (String[]) dtub.C(null, dt(getString(cM(6, cqtj.a))), new String[0]) : new String[]{j()} : null;
                dtsr.dz(length, strArr2, new emyl() { // from class: cqsw
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "transfer_handle:".concat(String.valueOf(cqsy.this.getString(6)));
                    }
                });
                byte[][] E = di(7) ? z ? dtub.E(null, dC(getString(cM(7, cqtj.a)))) : new byte[][]{l()} : null;
                dtsr.dz(length, E, new emyl() { // from class: cqsx
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "opaque_data:".concat(String.valueOf(cqsy.this.getString(7)));
                    }
                });
                engr engrVar = new engr();
                while (i < length) {
                    long j = dB[i];
                    if (j <= 0 || hashSet.contains(Long.valueOf(j))) {
                        jArr = dB;
                        c = c2;
                    } else {
                        hashSet.add(Long.valueOf(dB[i]));
                        String[] strArr3 = cqtj.a;
                        cqrv cqrvVar = new cqrv();
                        cqrvVar.aF();
                        cqrvVar.aD();
                        long j2 = dB[i];
                        if (messageIdTypeArr != null) {
                            cqrvVar.c(messageIdTypeArr[i]);
                        }
                        if (strArr != null) {
                            cqrvVar.e(strArr[i]);
                        }
                        if (cqtkVarArr != null) {
                            cqrvVar.f(cqtkVarArr[i]);
                        }
                        if (awvdVarArr != null) {
                            awvd awvdVar2 = awvdVarArr[i];
                            cqrvVar.aE(3);
                            cqrvVar.d = awvdVar2;
                        }
                        if (awvbVarArr != null) {
                            cqrvVar.b(awvbVarArr[i]);
                        }
                        if (awvbVarArr2 != null) {
                            awvb awvbVar4 = awvbVarArr2[i];
                            int i11 = cqrvVar.aB;
                            jArr = dB;
                            if (i11 < 59910) {
                                dtub.w("thumbnail_information", i11);
                            }
                            cqrvVar.aE(5);
                            cqrvVar.f = awvbVar4;
                        } else {
                            jArr = dB;
                        }
                        if (strArr2 != null) {
                            String str = strArr2[i];
                            int i12 = cqrvVar.aB;
                            if (i12 < 55030) {
                                dtub.w("transfer_handle", i12);
                            }
                            c = 6;
                            cqrvVar.aE(6);
                            cqrvVar.g = str;
                        } else {
                            c = 6;
                        }
                        if (E != null) {
                            cqrvVar.d(E[i]);
                        }
                        engrVar.h(cqrvVar.a());
                    }
                    i++;
                    c2 = c;
                    dB = jArr;
                }
                return engrVar.g();
            }
        }
        int i13 = engw.d;
        return enou.a;
    }

    public final awvd g() {
        byte[] blob = getBlob(cM(3, cqtj.a));
        if (blob == null) {
            return null;
        }
        try {
            return (awvd) eyfy.parseFrom(awvd.a, blob, eyfc.a());
        } catch (Throwable unused) {
            return awvd.a;
        }
    }

    public final MessageIdType h() {
        return new MessageIdType(getLong(cM(0, cqtj.a)));
    }

    public final cqtk i() {
        cqtk[] values = cqtk.values();
        int i = getInt(cM(2, cqtj.a));
        if (i < values.length) {
            return values[i];
        }
        throw new IllegalArgumentException();
    }

    public final String j() {
        return getString(cM(6, cqtj.a));
    }

    public final String k() {
        return getString(cM(1, cqtj.a));
    }

    public final byte[] l() {
        return getBlob(cM(7, cqtj.a));
    }

    @Override // defpackage.dtsu
    public final Cursor a() {
        return this;
    }
}
