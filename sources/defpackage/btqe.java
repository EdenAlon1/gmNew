package defpackage;

import android.database.Cursor;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class btqe extends dtsr implements btps {
    @Deprecated
    public btqe(dtve dtveVar, Cursor cursor, String[] strArr, dtzj[] dtzjVarArr, dtyo dtyoVar, dtvs dtvsVar, btqk btqkVar) {
        super(dtveVar, cursor, strArr, dtzjVarArr, btqq.a, dtyoVar, dtvsVar, btqkVar);
    }

    @Override // defpackage.dtsr
    protected final /* synthetic */ dtro b() {
        return new btoo();
    }

    public final long c() {
        return getLong(cM(3, btqq.a));
    }

    public final long e() {
        return getLong(cM(0, btqq.a));
    }

    public final MessageIdType f() {
        return new MessageIdType(getLong(cM(1, btqq.a)));
    }

    @Override // defpackage.dtsr
    public final engw fI(dtvn dtvnVar) {
        MessageIdType[] messageIdTypeArr;
        String[] strArr;
        String[] strArr2;
        int i;
        String[] strArr3;
        boolean[] zArr;
        boolean[] zArr2;
        int i2;
        long[] jArr;
        String[] strArr4;
        int i3;
        int i4;
        dtyq dtyqVar = dtvnVar.a;
        long[] dB = dB(getString(dtvnVar.h + 1));
        int length = dB.length;
        if (length == 0 || (length == 1 && dB[0] == -1)) {
            int i5 = engw.d;
            return enou.a;
        }
        HashSet hashSet = new HashSet();
        dtvs dtvsVar = this.d;
        boolean di = di(0);
        boolean z = dtvsVar.b;
        long[] B = di ? z ? dtub.B(null, ds(getString(cM(0, btqq.a)))) : new long[]{e()} : null;
        dtsr.dy(length, B, new emyl() { // from class: btpt
            @Override // defpackage.emyl
            public final Object get() {
                return "_id:".concat(String.valueOf(btqe.this.getString(0)));
            }
        });
        if (!di(1)) {
            messageIdTypeArr = null;
        } else if (z) {
            long[] ds = ds(getString(cM(1, btqq.a)));
            int length2 = ds.length;
            MessageIdType[] messageIdTypeArr2 = new MessageIdType[length2];
            for (int i6 = 0; i6 < length2; i6++) {
                messageIdTypeArr2[i6] = new MessageIdType(ds[i6]);
            }
            messageIdTypeArr = (MessageIdType[]) dtub.C(null, messageIdTypeArr2, new MessageIdType[0]);
        } else {
            messageIdTypeArr = new MessageIdType[]{f()};
        }
        dtsr.dz(length, messageIdTypeArr, new emyl() { // from class: btpw
            @Override // defpackage.emyl
            public final Object get() {
                return "message_id:".concat(String.valueOf(btqe.this.getString(1)));
            }
        });
        String[] strArr5 = di(2) ? z ? (String[]) dtub.C(null, dt(getString(cM(2, btqq.a))), new String[0]) : new String[]{l()} : null;
        dtsr.dz(length, strArr5, new emyl() { // from class: btpx
            @Override // defpackage.emyl
            public final Object get() {
                return "trigger_url:".concat(String.valueOf(btqe.this.getString(2)));
            }
        });
        long[] B2 = di(3) ? z ? dtub.B(null, ds(getString(cM(3, btqq.a)))) : new long[]{c()} : null;
        dtsr.dy(length, B2, new emyl() { // from class: btpy
            @Override // defpackage.emyl
            public final Object get() {
                return "expiration_time_millis:".concat(String.valueOf(btqe.this.getString(3)));
            }
        });
        if (!di(4)) {
            strArr = null;
        } else if (z) {
            String[] dt = dt(getString(cM(4, btqq.a)));
            for (int i7 = 0; i7 < dt.length; i7++) {
                dt[i7] = cuxs.a(dt[i7]);
            }
            strArr = (String[]) dtub.C(null, dt, new String[0]);
        } else {
            strArr = new String[]{k()};
        }
        dtsr.dz(length, strArr, new emyl() { // from class: btpz
            @Override // defpackage.emyl
            public final Object get() {
                return "link_title:".concat(String.valueOf(btqe.this.getString(4)));
            }
        });
        if (!di(5)) {
            strArr2 = null;
        } else if (z) {
            String[] dt2 = dt(getString(cM(5, btqq.a)));
            for (int i8 = 0; i8 < dt2.length; i8++) {
                dt2[i8] = cuxs.a(dt2[i8]);
            }
            strArr2 = (String[]) dtub.C(null, dt2, new String[0]);
        } else {
            strArr2 = new String[]{h()};
        }
        dtsr.dz(length, strArr2, new emyl() { // from class: btqa
            @Override // defpackage.emyl
            public final Object get() {
                return "link_description:".concat(String.valueOf(btqe.this.getString(5)));
            }
        });
        String[] strArr6 = di(6) ? z ? (String[]) dtub.C(null, dt(getString(cM(6, btqq.a))), new String[0]) : new String[]{j()} : null;
        dtsr.dz(length, strArr6, new emyl() { // from class: btqb
            @Override // defpackage.emyl
            public final Object get() {
                return "link_image_url:".concat(String.valueOf(btqe.this.getString(6)));
            }
        });
        String[] strArr7 = di(7) ? z ? (String[]) dtub.C(null, dt(getString(cM(7, btqq.a))), new String[0]) : new String[]{i()} : null;
        dtsr.dz(length, strArr7, new emyl() { // from class: btqc
            @Override // defpackage.emyl
            public final Object get() {
                return "link_domain:".concat(String.valueOf(btqe.this.getString(7)));
            }
        });
        if (!di(8)) {
            i = 0;
            strArr3 = null;
        } else if (z) {
            i = 0;
            strArr3 = (String[]) dtub.C(null, dt(getString(cM(8, btqq.a))), new String[0]);
        } else {
            i = 0;
            strArr3 = new String[]{g()};
        }
        dtsr.dz(length, strArr3, new emyl() { // from class: btqd
            @Override // defpackage.emyl
            public final Object get() {
                return "link_canonical_url:".concat(String.valueOf(btqe.this.getString(8)));
            }
        });
        if (!di(9)) {
            zArr = null;
        } else if (z) {
            zArr = dtub.D(null, du(getString(cM(9, btqq.a))));
        } else {
            zArr = new boolean[1];
            zArr[i] = n();
        }
        dtsr.dA(length, zArr, new emyl() { // from class: btpu
            @Override // defpackage.emyl
            public final Object get() {
                return "link_preview_prevented:".concat(String.valueOf(btqe.this.getString(9)));
            }
        });
        if (!di(10)) {
            zArr2 = null;
        } else if (z) {
            zArr2 = dtub.D(null, du(getString(cM(10, btqq.a))));
        } else {
            zArr2 = new boolean[1];
            zArr2[i] = m();
        }
        dtsr.dA(length, zArr2, new emyl() { // from class: btpv
            @Override // defpackage.emyl
            public final Object get() {
                return "link_preview_failed:".concat(String.valueOf(btqe.this.getString(10)));
            }
        });
        engr engrVar = new engr();
        int i9 = i;
        while (i9 < length) {
            long j = dB[i9];
            if (j > 0) {
                i2 = i9;
                if (!hashSet.contains(Long.valueOf(j))) {
                    hashSet.add(Long.valueOf(dB[i2]));
                    btor a = btqq.a();
                    a.aD();
                    long j2 = dB[i2];
                    jArr = dB;
                    strArr4 = strArr7;
                    if (B != null) {
                        long j3 = B[i2];
                        i3 = length;
                        i4 = i;
                        a.aE(i4);
                        a.a = j3;
                    } else {
                        i3 = length;
                        i4 = i;
                    }
                    if (messageIdTypeArr != null) {
                        a.m(messageIdTypeArr[i2]);
                    }
                    if (strArr5 != null) {
                        a.n(strArr5[i2]);
                    }
                    if (B2 != null) {
                        a.e(B2[i2]);
                    }
                    if (strArr != null) {
                        a.l(strArr[i2]);
                    }
                    if (strArr2 != null) {
                        a.g(strArr2[i2]);
                    }
                    if (strArr6 != null) {
                        a.i(strArr6[i2]);
                    }
                    if (strArr4 != null) {
                        a.h(strArr4[i2]);
                    }
                    if (strArr3 != null) {
                        a.f(strArr3[i2]);
                    }
                    if (zArr != null) {
                        a.k(zArr[i2]);
                    }
                    if (zArr2 != null) {
                        a.j(zArr2[i2]);
                    }
                    engrVar.h(a.a());
                    i9 = i2 + 1;
                    dB = jArr;
                    i = i4;
                    strArr7 = strArr4;
                    length = i3;
                }
            } else {
                i2 = i9;
            }
            jArr = dB;
            strArr4 = strArr7;
            i3 = length;
            i4 = i;
            i9 = i2 + 1;
            dB = jArr;
            i = i4;
            strArr7 = strArr4;
            length = i3;
        }
        return engrVar.g();
    }

    public final String g() {
        return getString(cM(8, btqq.a));
    }

    public final String h() {
        return cuxs.a(getString(cM(5, btqq.a)));
    }

    public final String i() {
        return getString(cM(7, btqq.a));
    }

    public final String j() {
        return getString(cM(6, btqq.a));
    }

    public final String k() {
        return cuxs.a(getString(cM(4, btqq.a)));
    }

    public final String l() {
        return getString(cM(2, btqq.a));
    }

    public final boolean m() {
        return getInt(cM(10, btqq.a)) == 1;
    }

    public final boolean n() {
        return getInt(cM(9, btqq.a)) == 1;
    }

    @Override // defpackage.dtsu
    public final Cursor a() {
        return this;
    }
}
