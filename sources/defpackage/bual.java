package defpackage;

import android.database.Cursor;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bual extends dtsr implements buad {
    @Deprecated
    public bual(dtve dtveVar, Cursor cursor, String[] strArr, dtzj[] dtzjVarArr, dtyo dtyoVar, dtvs dtvsVar, buap buapVar) {
        super(dtveVar, cursor, strArr, dtzjVarArr, buaw.a, dtyoVar, dtvsVar, buapVar);
    }

    @Override // defpackage.dtsr
    protected final /* synthetic */ dtro b() {
        return new btzi();
    }

    @Override // defpackage.buad
    public final int c() {
        return getInt(cM(2, buaw.a));
    }

    @Override // defpackage.buad
    public final MessageIdType e() {
        return new MessageIdType(getLong(cM(1, buaw.a)));
    }

    @Override // defpackage.buad
    public final buax f() {
        buax[] values = buax.values();
        int i = getInt(cM(3, buaw.a));
        if (i < values.length) {
            return values[i];
        }
        throw new IllegalArgumentException();
    }

    @Override // defpackage.dtsr
    public final engw fI(dtvn dtvnVar) {
        MessageIdType[] messageIdTypeArr;
        buax[] buaxVarArr;
        buay[] buayVarArr;
        String[] strArr;
        String[] strArr2;
        dtyq dtyqVar = dtvnVar.a;
        long[] dB = dB(getString(dtvnVar.h + 1));
        int length = dB.length;
        if (length == 0 || (length == 1 && dB[0] == -1)) {
            int i = engw.d;
            return enou.a;
        }
        HashSet hashSet = new HashSet();
        dtvs dtvsVar = this.d;
        boolean di = di(0);
        boolean z = dtvsVar.b;
        String[] strArr3 = di ? z ? (String[]) dtub.C(null, dt(getString(cM(0, buaw.a))), new String[0]) : new String[]{k()} : null;
        dtsr.dz(length, strArr3, new emyl() { // from class: buae
            @Override // defpackage.emyl
            public final Object get() {
                return "_id:".concat(String.valueOf(bual.this.getString(0)));
            }
        });
        if (!di(1)) {
            messageIdTypeArr = null;
        } else if (z) {
            long[] ds = ds(getString(cM(1, buaw.a)));
            int length2 = ds.length;
            MessageIdType[] messageIdTypeArr2 = new MessageIdType[length2];
            for (int i2 = 0; i2 < length2; i2++) {
                messageIdTypeArr2[i2] = new MessageIdType(ds[i2]);
            }
            messageIdTypeArr = (MessageIdType[]) dtub.C(null, messageIdTypeArr2, new MessageIdType[0]);
        } else {
            messageIdTypeArr = new MessageIdType[]{e()};
        }
        dtsr.dz(length, messageIdTypeArr, new emyl() { // from class: buaf
            @Override // defpackage.emyl
            public final Object get() {
                return "message_id:".concat(String.valueOf(bual.this.getString(1)));
            }
        });
        int[] z2 = di(2) ? z ? dtub.z(null, dr(getString(cM(2, buaw.a)))) : new int[]{c()} : null;
        dtsr.dx(length, z2, new emyl() { // from class: buag
            @Override // defpackage.emyl
            public final Object get() {
                return "label:".concat(String.valueOf(bual.this.getString(2)));
            }
        });
        if (!di(3)) {
            buaxVarArr = null;
        } else if (z) {
            int[] dr = dr(getString(cM(3, buaw.a)));
            buax[] values = buax.values();
            int length3 = values.length;
            buax[] buaxVarArr2 = new buax[dr.length];
            for (int i3 = 0; i3 < dr.length; i3++) {
                int i4 = dr[i3];
                if (i4 >= length3) {
                    throw new IllegalStateException();
                }
                buaxVarArr2[i3] = values[i4];
            }
            buaxVarArr = (buax[]) dtub.C(null, buaxVarArr2, new buax[0]);
        } else {
            buaxVarArr = new buax[]{f()};
        }
        dtsr.dz(length, buaxVarArr, new emyl() { // from class: buah
            @Override // defpackage.emyl
            public final Object get() {
                return "confidence:".concat(String.valueOf(bual.this.getString(3)));
            }
        });
        if (!di(4)) {
            buayVarArr = null;
        } else if (z) {
            int[] dr2 = dr(getString(cM(4, buaw.a)));
            buay[] values2 = buay.values();
            int length4 = values2.length;
            buay[] buayVarArr2 = new buay[dr2.length];
            for (int i5 = 0; i5 < dr2.length; i5++) {
                int i6 = dr2[i5];
                if (i6 >= length4) {
                    throw new IllegalStateException();
                }
                buayVarArr2[i5] = values2[i6];
            }
            buayVarArr = (buay[]) dtub.C(null, buayVarArr2, new buay[0]);
        } else {
            buayVarArr = new buay[]{g()};
        }
        dtsr.dz(length, buayVarArr, new emyl() { // from class: buai
            @Override // defpackage.emyl
            public final Object get() {
                return "source:".concat(String.valueOf(bual.this.getString(4)));
            }
        });
        if (!di(5)) {
            strArr = null;
        } else if (!z) {
            strArr = new String[]{i()};
        } else {
            if (isNull(cM(5, buaw.a))) {
                throw new IllegalStateException("found null in cursor for column intent");
            }
            strArr = (String[]) dtub.C(null, dt(getString(cM(5, buaw.a))), new String[0]);
        }
        dtsr.dz(length, strArr, new emyl() { // from class: buaj
            @Override // defpackage.emyl
            public final Object get() {
                return "intent:".concat(String.valueOf(bual.this.getString(5)));
            }
        });
        if (!di(6)) {
            strArr2 = null;
        } else if (!z) {
            strArr2 = new String[]{j()};
        } else {
            if (isNull(cM(6, buaw.a))) {
                throw new IllegalStateException("found null in cursor for column model_id");
            }
            strArr2 = (String[]) dtub.C(null, dt(getString(cM(6, buaw.a))), new String[0]);
        }
        dtsr.dz(length, strArr2, new emyl() { // from class: buak
            @Override // defpackage.emyl
            public final Object get() {
                return "model_id:".concat(String.valueOf(bual.this.getString(6)));
            }
        });
        engr engrVar = new engr();
        for (int i7 = 0; i7 < length; i7++) {
            long j = dB[i7];
            if (j > 0 && !hashSet.contains(Long.valueOf(j))) {
                hashSet.add(Long.valueOf(dB[i7]));
                String[] strArr4 = buaw.a;
                btzk btzkVar = new btzk();
                btzkVar.aF();
                btzkVar.aD();
                long j2 = dB[i7];
                if (strArr3 != null) {
                    String str = strArr3[i7];
                    btzkVar.aE(0);
                    btzkVar.a = str;
                }
                if (messageIdTypeArr != null) {
                    btzkVar.e(messageIdTypeArr[i7]);
                }
                if (z2 != null) {
                    btzkVar.d(z2[i7]);
                }
                if (buaxVarArr != null) {
                    btzkVar.b(buaxVarArr[i7]);
                }
                if (buayVarArr != null) {
                    btzkVar.g(buayVarArr[i7]);
                }
                if (strArr != null) {
                    btzkVar.c(strArr[i7]);
                }
                if (strArr2 != null) {
                    btzkVar.f(strArr2[i7]);
                }
                engrVar.h(btzkVar.a());
            }
        }
        return engrVar.g();
    }

    @Override // defpackage.buad
    public final buay g() {
        buay[] values = buay.values();
        int i = getInt(cM(4, buaw.a));
        if (i < values.length) {
            return values[i];
        }
        throw new IllegalArgumentException();
    }

    @Override // defpackage.buad
    public final engw h() {
        engr engrVar = new engr();
        while (moveToNext()) {
            e();
            engrVar.h(e());
        }
        return engrVar.g();
    }

    @Override // defpackage.buad
    public final String i() {
        if (isNull(cM(5, buaw.a))) {
            throw new IllegalStateException("found null in cursor for column intent");
        }
        return getString(cM(5, buaw.a));
    }

    @Override // defpackage.buad
    public final String j() {
        if (isNull(cM(6, buaw.a))) {
            throw new IllegalStateException("found null in cursor for column model_id");
        }
        return getString(cM(6, buaw.a));
    }

    public final String k() {
        return getString(cM(0, buaw.a));
    }

    @Override // defpackage.dtsu
    public final Cursor a() {
        return this;
    }
}
