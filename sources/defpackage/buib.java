package defpackage;

import android.database.Cursor;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import java.util.HashSet;
import java.util.UUID;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class buib extends dtsr implements buhn {
    @Deprecated
    public buib(dtve dtveVar, Cursor cursor, String[] strArr, dtzj[] dtzjVarArr, dtyo dtyoVar, dtvs dtvsVar, buif buifVar) {
        super(dtveVar, cursor, strArr, dtzjVarArr, buik.a, dtyoVar, dtvsVar, buifVar);
    }

    @Override // defpackage.dtsr
    protected final /* synthetic */ dtro b() {
        return new bugf();
    }

    @Override // defpackage.buhn
    public final engw c() {
        engr engrVar = new engr();
        while (moveToNext()) {
            if (q() != null) {
                engrVar.h(q());
            }
        }
        return engrVar.g();
    }

    public final long e() {
        return getLong(cM(3, buik.a));
    }

    public final long f() {
        return getLong(cM(2, buik.a));
    }

    @Override // defpackage.dtsr
    public final engw fI(dtvn dtvnVar) {
        UUID[] uuidArr;
        MessageIdType[] messageIdTypeArr;
        byzj[] byzjVarArr;
        int i;
        String[] strArr;
        long[] jArr;
        String[] strArr2;
        String[] strArr3;
        String[] strArr4;
        String[] strArr5;
        String[] strArr6;
        int i2;
        String[] strArr7;
        String[] strArr8;
        String[] strArr9;
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
        boolean z = dtvsVar.b;
        if (!di) {
            uuidArr = null;
        } else if (z) {
            String[] dt = dt(getString(cM(0, buik.a)));
            int length2 = dt.length;
            UUID[] uuidArr2 = new UUID[length2];
            for (int i4 = 0; i4 < length2; i4++) {
                uuidArr2[i4] = UUID.fromString(dt[i4]);
            }
            uuidArr = (UUID[]) dtub.C(null, uuidArr2, new UUID[0]);
        } else {
            uuidArr = new UUID[]{q()};
        }
        dtsr.dz(length, uuidArr, new emyl() { // from class: buho
            @Override // defpackage.emyl
            public final Object get() {
                return "_id:".concat(String.valueOf(buib.this.getString(0)));
            }
        });
        if (!di(1)) {
            messageIdTypeArr = null;
        } else if (z) {
            long[] ds = ds(getString(cM(1, buik.a)));
            int length3 = ds.length;
            MessageIdType[] messageIdTypeArr2 = new MessageIdType[length3];
            for (int i5 = 0; i5 < length3; i5++) {
                messageIdTypeArr2[i5] = new MessageIdType(ds[i5]);
            }
            messageIdTypeArr = (MessageIdType[]) dtub.C(null, messageIdTypeArr2, new MessageIdType[0]);
        } else {
            messageIdTypeArr = new MessageIdType[]{g()};
        }
        dtsr.dz(length, messageIdTypeArr, new emyl() { // from class: buhv
            @Override // defpackage.emyl
            public final Object get() {
                return "message_id:".concat(String.valueOf(buib.this.getString(1)));
            }
        });
        long[] B = di(2) ? z ? dtub.B(null, ds(getString(cM(2, buik.a)))) : new long[]{f()} : null;
        dtsr.dy(length, B, new emyl() { // from class: buhw
            @Override // defpackage.emyl
            public final Object get() {
                return "timestamp:".concat(String.valueOf(buib.this.getString(2)));
            }
        });
        long[] B2 = di(3) ? z ? dtub.B(null, ds(getString(cM(3, buik.a)))) : new long[]{e()} : null;
        dtsr.dy(length, B2, new emyl() { // from class: buhx
            @Override // defpackage.emyl
            public final Object get() {
                return "message_sending_attempt:".concat(String.valueOf(buib.this.getString(3)));
            }
        });
        if (!di(4)) {
            byzjVarArr = null;
        } else if (z) {
            int[] dr = dr(getString(cM(4, buik.a)));
            byzj[] values = byzj.values();
            int length4 = values.length;
            byzj[] byzjVarArr2 = new byzj[dr.length];
            for (int i6 = 0; i6 < dr.length; i6++) {
                int i7 = dr[i6];
                if (i7 >= length4) {
                    throw new IllegalStateException();
                }
                byzjVarArr2[i6] = values[i7];
            }
            byzjVarArr = (byzj[]) dtub.C(null, byzjVarArr2, new byzj[0]);
        } else {
            byzjVarArr = new byzj[]{h()};
        }
        dtsr.dz(length, byzjVarArr, new emyl() { // from class: buhy
            @Override // defpackage.emyl
            public final Object get() {
                return "message_protocol:".concat(String.valueOf(buib.this.getString(4)));
            }
        });
        String[] strArr10 = di(5) ? z ? (String[]) dtub.C(null, dt(getString(cM(5, buik.a))), new String[0]) : new String[]{k()} : null;
        dtsr.dz(length, strArr10, new emyl() { // from class: buhz
            @Override // defpackage.emyl
            public final Object get() {
                return "current_sim_network_country:".concat(String.valueOf(buib.this.getString(5)));
            }
        });
        String[] strArr11 = di(6) ? z ? (String[]) dtub.C(null, dt(getString(cM(6, buik.a))), new String[0]) : new String[]{j()} : null;
        dtsr.dz(length, strArr11, new emyl() { // from class: buia
            @Override // defpackage.emyl
            public final Object get() {
                return "current_sim_country:".concat(String.valueOf(buib.this.getString(6)));
            }
        });
        String[] strArr12 = di(7) ? z ? (String[]) dtub.C(null, dt(getString(cM(7, buik.a))), new String[0]) : new String[]{i()} : null;
        dtsr.dz(length, strArr12, new emyl() { // from class: buhp
            @Override // defpackage.emyl
            public final Object get() {
                return "current_sim_carrier_country:".concat(String.valueOf(buib.this.getString(7)));
            }
        });
        if (!di(8)) {
            i = 0;
            strArr = null;
        } else if (z) {
            i = 0;
            strArr = (String[]) dtub.C(null, dt(getString(cM(8, buik.a))), new String[0]);
        } else {
            i = 0;
            strArr = new String[]{p()};
        }
        dtsr.dz(length, strArr, new emyl() { // from class: buhq
            @Override // defpackage.emyl
            public final Object get() {
                return "settings_country:".concat(String.valueOf(buib.this.getString(8)));
            }
        });
        if (!di(9)) {
            jArr = dB;
            strArr2 = null;
        } else if (z) {
            jArr = dB;
            strArr2 = (String[]) dtub.C(null, dt(getString(cM(9, buik.a))), new String[i]);
        } else {
            jArr = dB;
            strArr2 = new String[1];
            strArr2[i] = m();
        }
        dtsr.dz(length, strArr2, new emyl() { // from class: buhr
            @Override // defpackage.emyl
            public final Object get() {
                return "default_sms_sim_country:".concat(String.valueOf(buib.this.getString(9)));
            }
        });
        if (!di(10)) {
            strArr3 = strArr2;
            strArr4 = null;
        } else if (z) {
            strArr3 = strArr2;
            strArr4 = (String[]) dtub.C(null, dt(getString(cM(10, buik.a))), new String[0]);
        } else {
            strArr3 = strArr2;
            strArr4 = new String[]{o()};
        }
        dtsr.dz(length, strArr4, new emyl() { // from class: buhs
            @Override // defpackage.emyl
            public final Object get() {
                return "locale_country:".concat(String.valueOf(buib.this.getString(10)));
            }
        });
        if (!di(11)) {
            strArr5 = strArr4;
            strArr6 = null;
        } else if (z) {
            strArr5 = strArr4;
            strArr6 = (String[]) dtub.C(null, dt(getString(cM(11, buik.a))), new String[0]);
        } else {
            strArr5 = strArr4;
            strArr6 = new String[]{n()};
        }
        dtsr.dz(length, strArr6, new emyl() { // from class: buht
            @Override // defpackage.emyl
            public final Object get() {
                return "default_sms_sim_network_country:".concat(String.valueOf(buib.this.getString(11)));
            }
        });
        if (!di(12)) {
            i2 = 0;
            strArr7 = null;
        } else if (z) {
            i2 = 0;
            strArr7 = (String[]) dtub.C(null, dt(getString(cM(12, buik.a))), new String[0]);
        } else {
            i2 = 0;
            strArr7 = new String[]{l()};
        }
        dtsr.dz(length, strArr7, new emyl() { // from class: buhu
            @Override // defpackage.emyl
            public final Object get() {
                return "default_sms_sim_carrier_country:".concat(String.valueOf(buib.this.getString(12)));
            }
        });
        engr engrVar = new engr();
        int i8 = i2;
        while (i8 < length) {
            long j = jArr[i8];
            if (j <= 0 || hashSet.contains(Long.valueOf(j))) {
                strArr8 = strArr6;
                strArr9 = strArr10;
            } else {
                hashSet.add(Long.valueOf(jArr[i8]));
                String[] strArr13 = buik.a;
                bugj bugjVar = new bugj();
                bugjVar.aF();
                bugjVar.aD();
                long j2 = jArr[i8];
                strArr8 = strArr6;
                if (uuidArr != null) {
                    bugjVar.h(uuidArr[i8]);
                }
                if (messageIdTypeArr != null) {
                    bugjVar.j(messageIdTypeArr[i8]);
                }
                strArr9 = strArr10;
                if (B != null) {
                    bugjVar.m(B[i8]);
                }
                if (B2 != null) {
                    bugjVar.k(B2[i8]);
                }
                if (byzjVarArr != null) {
                    bugjVar.n(byzjVarArr[i8]);
                }
                if (strArr9 != null) {
                    bugjVar.d(strArr9[i8]);
                }
                if (strArr11 != null) {
                    bugjVar.c(strArr11[i8]);
                }
                if (strArr12 != null) {
                    bugjVar.b(strArr12[i8]);
                }
                if (strArr != null) {
                    bugjVar.l(strArr[i8]);
                }
                if (strArr3 != null) {
                    bugjVar.f(strArr3[i8]);
                }
                if (strArr5 != null) {
                    bugjVar.i(strArr5[i8]);
                }
                if (strArr8 != null) {
                    bugjVar.g(strArr8[i8]);
                }
                if (strArr7 != null) {
                    bugjVar.e(strArr7[i8]);
                }
                engrVar.h(bugjVar.a(new Supplier() { // from class: bugg
                    @Override // java.util.function.Supplier
                    public final Object get() {
                        return new bugf();
                    }
                }));
            }
            i8++;
            strArr6 = strArr8;
            strArr10 = strArr9;
        }
        return engrVar.g();
    }

    public final MessageIdType g() {
        return new MessageIdType(getLong(cM(1, buik.a)));
    }

    public final byzj h() {
        byzj[] values = byzj.values();
        int i = getInt(cM(4, buik.a));
        if (i < values.length) {
            return values[i];
        }
        throw new IllegalArgumentException();
    }

    public final String i() {
        return getString(cM(7, buik.a));
    }

    public final String j() {
        return getString(cM(6, buik.a));
    }

    public final String k() {
        return getString(cM(5, buik.a));
    }

    public final String l() {
        return getString(cM(12, buik.a));
    }

    public final String m() {
        return getString(cM(9, buik.a));
    }

    public final String n() {
        return getString(cM(11, buik.a));
    }

    public final String o() {
        return getString(cM(10, buik.a));
    }

    public final String p() {
        return getString(cM(8, buik.a));
    }

    public final UUID q() {
        return UUID.fromString(getString(cM(0, buik.a)));
    }

    @Override // defpackage.dtsu
    public final Cursor a() {
        return this;
    }
}
