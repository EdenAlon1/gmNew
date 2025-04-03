package defpackage;

import android.database.Cursor;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bvex extends dtsr implements bvek {
    @Deprecated
    public bvex(dtve dtveVar, Cursor cursor, String[] strArr, dtzj[] dtzjVarArr, dtyo dtyoVar, dtvs dtvsVar, bvfd bvfdVar) {
        super(dtveVar, cursor, strArr, dtzjVarArr, bvfh.a, dtyoVar, dtvsVar, bvfdVar);
    }

    @Override // defpackage.dtsr
    protected final /* synthetic */ dtro b() {
        return new bvdg();
    }

    @Override // defpackage.bvek
    public final int c() {
        return getInt(cM(8, bvfh.a));
    }

    @Override // defpackage.bvek
    public final int e() {
        return getInt(cM(7, bvfh.a));
    }

    @Override // defpackage.bvek
    public final long f() {
        return getLong(cM(2, bvfh.a));
    }

    @Override // defpackage.dtsr
    public final engw fI(dtvn dtvnVar) {
        MessageIdType[] messageIdTypeArr;
        eoqz[] eoqzVarArr;
        epjp[] epjpVarArr;
        fbqx[] fbqxVarArr;
        fbqp[] fbqpVarArr;
        long[] jArr;
        String[] strArr;
        String[] strArr2;
        String[] strArr3;
        String[] strArr4;
        fbqx[] fbqxVarArr2;
        int i;
        dtyq dtyqVar = dtvnVar.a;
        long[] dB = dB(getString(dtvnVar.h + 1));
        int length = dB.length;
        if (length == 0 || (length == 1 && dB[0] == -1)) {
            int i2 = engw.d;
            return enou.a;
        }
        HashSet hashSet = new HashSet();
        dtvs dtvsVar = this.d;
        boolean di = di(0);
        boolean z = dtvsVar.b;
        String[] strArr5 = di ? z ? (String[]) dtub.C(null, dt(getString(cM(0, bvfh.a))), new String[0]) : new String[]{l()} : null;
        dtsr.dz(length, strArr5, new emyl() { // from class: bvel
            @Override // defpackage.emyl
            public final Object get() {
                return "id:".concat(String.valueOf(bvex.this.getString(0)));
            }
        });
        if (!di(1)) {
            messageIdTypeArr = null;
        } else if (z) {
            long[] ds = ds(getString(cM(1, bvfh.a)));
            int length2 = ds.length;
            MessageIdType[] messageIdTypeArr2 = new MessageIdType[length2];
            for (int i3 = 0; i3 < length2; i3++) {
                messageIdTypeArr2[i3] = new MessageIdType(ds[i3]);
            }
            messageIdTypeArr = (MessageIdType[]) dtub.C(null, messageIdTypeArr2, new MessageIdType[0]);
        } else {
            messageIdTypeArr = new MessageIdType[]{g()};
        }
        dtsr.dz(length, messageIdTypeArr, new emyl() { // from class: bveq
            @Override // defpackage.emyl
            public final Object get() {
                return "message_id:".concat(String.valueOf(bvex.this.getString(1)));
            }
        });
        long[] B = di(2) ? z ? dtub.B(null, ds(getString(cM(2, bvfh.a)))) : new long[]{f()} : null;
        dtsr.dy(length, B, new emyl() { // from class: bver
            @Override // defpackage.emyl
            public final Object get() {
                return "timestamp:".concat(String.valueOf(bvex.this.getString(2)));
            }
        });
        if (!di(3)) {
            eoqzVarArr = null;
        } else if (z) {
            int[] dr = dr(getString(cM(3, bvfh.a)));
            eoqz[] eoqzVarArr2 = new eoqz[dr.length];
            for (int i4 = 0; i4 < dr.length; i4++) {
                eoqz b = eoqz.b(dr[i4]);
                if (b == null) {
                    throw new IllegalStateException();
                }
                eoqzVarArr2[i4] = b;
            }
            eoqzVarArr = (eoqz[]) dtub.C(null, eoqzVarArr2, new eoqz[0]);
        } else {
            eoqzVarArr = new eoqz[]{h()};
        }
        dtsr.dz(length, eoqzVarArr, new emyl() { // from class: bves
            @Override // defpackage.emyl
            public final Object get() {
                return "event_type:".concat(String.valueOf(bvex.this.getString(3)));
            }
        });
        if (!di(4)) {
            epjpVarArr = null;
        } else if (z) {
            int[] dr2 = dr(getString(cM(4, bvfh.a)));
            epjp[] epjpVarArr2 = new epjp[dr2.length];
            for (int i5 = 0; i5 < dr2.length; i5++) {
                epjp b2 = epjp.b(dr2[i5]);
                if (b2 == null) {
                    throw new IllegalStateException();
                }
                epjpVarArr2[i5] = b2;
            }
            epjpVarArr = (epjp[]) dtub.C(null, epjpVarArr2, new epjp[0]);
        } else {
            epjpVarArr = new epjp[]{i()};
        }
        dtsr.dz(length, epjpVarArr, new emyl() { // from class: bvet
            @Override // defpackage.emyl
            public final Object get() {
                return "reply_mode:".concat(String.valueOf(bvex.this.getString(4)));
            }
        });
        if (!di(5)) {
            fbqxVarArr = null;
        } else if (z) {
            int[] dr3 = dr(getString(cM(5, bvfh.a)));
            fbqx[] fbqxVarArr3 = new fbqx[dr3.length];
            for (int i6 = 0; i6 < dr3.length; i6++) {
                fbqx b3 = fbqx.b(dr3[i6]);
                if (b3 == null) {
                    throw new IllegalStateException();
                }
                fbqxVarArr3[i6] = b3;
            }
            fbqxVarArr = (fbqx[]) dtub.C(null, fbqxVarArr3, new fbqx[0]);
        } else {
            fbqxVarArr = new fbqx[]{k()};
        }
        dtsr.dz(length, fbqxVarArr, new emyl() { // from class: bveu
            @Override // defpackage.emyl
            public final Object get() {
                return "rejection_reason:".concat(String.valueOf(bvex.this.getString(5)));
            }
        });
        if (!di(6)) {
            fbqpVarArr = null;
        } else if (z) {
            int[] dr4 = dr(getString(cM(6, bvfh.a)));
            fbqp[] fbqpVarArr2 = new fbqp[dr4.length];
            for (int i7 = 0; i7 < dr4.length; i7++) {
                fbqp b4 = fbqp.b(dr4[i7]);
                if (b4 == null) {
                    throw new IllegalStateException();
                }
                fbqpVarArr2[i7] = b4;
            }
            fbqpVarArr = (fbqp[]) dtub.C(null, fbqpVarArr2, new fbqp[0]);
        } else {
            fbqpVarArr = new fbqp[]{j()};
        }
        dtsr.dz(length, fbqpVarArr, new emyl() { // from class: bvev
            @Override // defpackage.emyl
            public final Object get() {
                return "action_source:".concat(String.valueOf(bvex.this.getString(6)));
            }
        });
        int[] z2 = di(7) ? z ? dtub.z(null, dr(getString(cM(7, bvfh.a)))) : new int[]{e()} : null;
        dtsr.dx(length, z2, new emyl() { // from class: bvew
            @Override // defpackage.emyl
            public final Object get() {
                return "num_of_items:".concat(String.valueOf(bvex.this.getString(7)));
            }
        });
        int[] z3 = di(8) ? z ? dtub.z(null, dr(getString(cM(8, bvfh.a)))) : new int[]{c()} : null;
        dtsr.dx(length, z3, new emyl() { // from class: bvem
            @Override // defpackage.emyl
            public final Object get() {
                return "click_index:".concat(String.valueOf(bvex.this.getString(8)));
            }
        });
        if (!di(9)) {
            jArr = dB;
            strArr = null;
        } else if (z) {
            jArr = dB;
            strArr = (String[]) dtub.C(null, dt(getString(cM(9, bvfh.a))), new String[0]);
        } else {
            jArr = dB;
            strArr = new String[]{m()};
        }
        dtsr.dz(length, strArr, new emyl() { // from class: bven
            @Override // defpackage.emyl
            public final Object get() {
                return "impression_id:".concat(String.valueOf(bvex.this.getString(9)));
            }
        });
        if (!di(10)) {
            strArr2 = strArr;
            strArr3 = null;
        } else if (z) {
            strArr2 = strArr;
            strArr3 = (String[]) dtub.C(null, dt(getString(cM(10, bvfh.a))), new String[0]);
        } else {
            strArr2 = strArr;
            strArr3 = new String[]{o()};
        }
        dtsr.dz(length, strArr3, new emyl() { // from class: bveo
            @Override // defpackage.emyl
            public final Object get() {
                return "suggestion_types:".concat(String.valueOf(bvex.this.getString(10)));
            }
        });
        String[] strArr6 = di(11) ? z ? (String[]) dtub.C(null, dt(getString(cM(11, bvfh.a))), new String[0]) : new String[]{n()} : null;
        dtsr.dz(length, strArr6, new emyl() { // from class: bvep
            @Override // defpackage.emyl
            public final Object get() {
                return "model_output_label:".concat(String.valueOf(bvex.this.getString(11)));
            }
        });
        engr engrVar = new engr();
        int i8 = 0;
        while (i8 < length) {
            long j = jArr[i8];
            if (j <= 0 || hashSet.contains(Long.valueOf(j))) {
                strArr4 = strArr3;
                fbqxVarArr2 = fbqxVarArr;
                i = length;
            } else {
                hashSet.add(Long.valueOf(jArr[i8]));
                String[] strArr7 = bvfh.a;
                bvdi bvdiVar = new bvdi();
                bvdiVar.aF();
                bvdiVar.aD();
                long j2 = jArr[i8];
                strArr4 = strArr3;
                if (strArr5 != null) {
                    String str = strArr5[i8];
                    fbqxVarArr2 = fbqxVarArr;
                    bvdiVar.aE(0);
                    bvdiVar.a = str;
                } else {
                    fbqxVarArr2 = fbqxVarArr;
                }
                if (messageIdTypeArr != null) {
                    bvdiVar.f(messageIdTypeArr[i8]);
                }
                i = length;
                if (B != null) {
                    bvdiVar.l(B[i8]);
                }
                if (eoqzVarArr != null) {
                    bvdiVar.d(eoqzVarArr[i8]);
                }
                if (epjpVarArr != null) {
                    bvdiVar.j(epjpVarArr[i8]);
                }
                if (fbqxVarArr2 != null) {
                    bvdiVar.i(fbqxVarArr2[i8]);
                }
                if (fbqpVarArr != null) {
                    bvdiVar.b(fbqpVarArr[i8]);
                }
                if (z2 != null) {
                    bvdiVar.h(z2[i8]);
                }
                if (z3 != null) {
                    bvdiVar.c(z3[i8]);
                }
                if (strArr2 != null) {
                    bvdiVar.e(strArr2[i8]);
                }
                if (strArr4 != null) {
                    bvdiVar.k(strArr4[i8]);
                }
                if (strArr6 != null) {
                    bvdiVar.g(strArr6[i8]);
                }
                engrVar.h(bvdiVar.a());
            }
            i8++;
            length = i;
            strArr3 = strArr4;
            fbqxVarArr = fbqxVarArr2;
        }
        return engrVar.g();
    }

    @Override // defpackage.bvek
    public final MessageIdType g() {
        return new MessageIdType(getLong(cM(1, bvfh.a)));
    }

    @Override // defpackage.bvek
    public final eoqz h() {
        return eoqz.b(getInt(cM(3, bvfh.a)));
    }

    @Override // defpackage.bvek
    public final epjp i() {
        return epjp.b(getInt(cM(4, bvfh.a)));
    }

    @Override // defpackage.bvek
    public final fbqp j() {
        return fbqp.b(getInt(cM(6, bvfh.a)));
    }

    @Override // defpackage.bvek
    public final fbqx k() {
        return fbqx.b(getInt(cM(5, bvfh.a)));
    }

    @Override // defpackage.bvek
    public final String l() {
        return getString(cM(0, bvfh.a));
    }

    @Override // defpackage.bvek
    public final String m() {
        return getString(cM(9, bvfh.a));
    }

    @Override // defpackage.bvek
    public final String n() {
        return getString(cM(11, bvfh.a));
    }

    @Override // defpackage.bvek
    public final String o() {
        return getString(cM(10, bvfh.a));
    }

    @Override // defpackage.dtsu
    public final Cursor a() {
        return this;
    }
}
