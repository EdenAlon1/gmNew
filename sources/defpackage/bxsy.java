package defpackage;

import android.database.Cursor;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bxsy extends dtsr implements bxso {
    @Deprecated
    public bxsy(dtve dtveVar, Cursor cursor, String[] strArr, dtzj[] dtzjVarArr, dtyo dtyoVar, dtvs dtvsVar, bxtb bxtbVar) {
        super(dtveVar, cursor, strArr, dtzjVarArr, bxth.a, dtyoVar, dtvsVar, bxtbVar);
    }

    @Override // defpackage.dtsr
    protected final /* synthetic */ dtro b() {
        return new bxrp();
    }

    @Override // defpackage.bxso
    public final engw c() {
        engr engrVar = new engr();
        while (moveToNext()) {
            if (i() != null) {
                engrVar.h(i());
            }
        }
        return engrVar.g();
    }

    @Override // defpackage.bxso
    public final String e() {
        return getString(cM(8, bxth.a));
    }

    public final int f() {
        return getInt(cM(3, bxth.a));
    }

    @Override // defpackage.dtsr
    public final engw fI(dtvn dtvnVar) {
        long[] jArr;
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
        String[] strArr = di ? z ? (String[]) dtub.C(null, dt(getString(cM(0, bxth.a))), new String[0]) : new String[]{i()} : null;
        dtsr.dz(length, strArr, new emyl() { // from class: bxsp
            @Override // defpackage.emyl
            public final Object get() {
                return "_id:".concat(String.valueOf(bxsy.this.getString(0)));
            }
        });
        String[] strArr2 = di(1) ? z ? (String[]) dtub.C(null, dt(getString(cM(1, bxth.a))), new String[0]) : new String[]{k()} : null;
        dtsr.dz(length, strArr2, new emyl() { // from class: bxsq
            @Override // defpackage.emyl
            public final Object get() {
                return "phone_number:".concat(String.valueOf(bxsy.this.getString(1)));
            }
        });
        String[] strArr3 = di(2) ? z ? (String[]) dtub.C(null, dt(getString(cM(2, bxth.a))), new String[0]) : new String[]{l()} : null;
        dtsr.dz(length, strArr3, new emyl() { // from class: bxsr
            @Override // defpackage.emyl
            public final Object get() {
                return "sim_serial_number:".concat(String.valueOf(bxsy.this.getString(2)));
            }
        });
        int[] z2 = di(3) ? z ? dtub.z(null, dr(getString(cM(3, bxth.a)))) : new int[]{f()} : null;
        dtsr.dx(length, z2, new emyl() { // from class: bxss
            @Override // defpackage.emyl
            public final Object get() {
                return "sim_slot_index:".concat(String.valueOf(bxsy.this.getString(3)));
            }
        });
        int[] z3 = di(4) ? z ? dtub.z(null, dr(getString(cM(4, bxth.a)))) : new int[]{g()} : null;
        dtsr.dx(length, z3, new emyl() { // from class: bxst
            @Override // defpackage.emyl
            public final Object get() {
                return "sub_id:".concat(String.valueOf(bxsy.this.getString(4)));
            }
        });
        String[] strArr4 = di(5) ? z ? (String[]) dtub.C(null, dt(getString(cM(5, bxth.a))), new String[0]) : new String[]{m()} : null;
        dtsr.dz(length, strArr4, new emyl() { // from class: bxsu
            @Override // defpackage.emyl
            public final Object get() {
                return "subscription_name:".concat(String.valueOf(bxsy.this.getString(5)));
            }
        });
        int[] z4 = di(6) ? z ? dtub.z(null, dr(getString(cM(6, bxth.a)))) : new int[]{h()} : null;
        dtsr.dx(length, z4, new emyl() { // from class: bxsv
            @Override // defpackage.emyl
            public final Object get() {
                return "subscription_color:".concat(String.valueOf(bxsy.this.getString(6)));
            }
        });
        String[] strArr5 = di(7) ? z ? (String[]) dtub.C(null, dt(getString(cM(7, bxth.a))), new String[0]) : new String[]{j()} : null;
        dtsr.dz(length, strArr5, new emyl() { // from class: bxsw
            @Override // defpackage.emyl
            public final Object get() {
                return "participant_id:".concat(String.valueOf(bxsy.this.getString(7)));
            }
        });
        String[] strArr6 = di(8) ? z ? (String[]) dtub.C(null, dt(getString(cM(8, bxth.a))), new String[0]) : new String[]{e()} : null;
        dtsr.dz(length, strArr6, new emyl() { // from class: bxsx
            @Override // defpackage.emyl
            public final Object get() {
                return "smsc:".concat(String.valueOf(bxsy.this.getString(8)));
            }
        });
        engr engrVar = new engr();
        int i2 = 0;
        while (i2 < length) {
            long j = dB[i2];
            if (j <= 0 || hashSet.contains(Long.valueOf(j))) {
                jArr = dB;
            } else {
                hashSet.add(Long.valueOf(dB[i2]));
                String[] strArr7 = bxth.a;
                bxrt bxrtVar = new bxrt();
                bxrtVar.aF();
                bxrtVar.aD();
                long j2 = dB[i2];
                if (strArr != null) {
                    String str = strArr[i2];
                    jArr = dB;
                    bxrtVar.aE(0);
                    bxrtVar.a = str;
                } else {
                    jArr = dB;
                }
                if (strArr2 != null) {
                    bxrtVar.e(strArr2[i2]);
                }
                if (strArr3 != null) {
                    String str2 = strArr3[i2];
                    bxrtVar.aE(2);
                    bxrtVar.c = str2;
                }
                if (z2 != null) {
                    bxrtVar.f(z2[i2]);
                }
                if (z3 != null) {
                    bxrtVar.h(z3[i2]);
                }
                if (strArr4 != null) {
                    bxrtVar.j(strArr4[i2]);
                }
                if (z4 != null) {
                    bxrtVar.i(z4[i2]);
                }
                if (strArr5 != null) {
                    bxrtVar.d(strArr5[i2]);
                }
                if (strArr6 != null) {
                    bxrtVar.g(strArr6[i2]);
                }
                engrVar.h(bxrtVar.a());
            }
            i2++;
            dB = jArr;
        }
        return engrVar.g();
    }

    public final int g() {
        return getInt(cM(4, bxth.a));
    }

    public final int h() {
        return getInt(cM(6, bxth.a));
    }

    public final String i() {
        return getString(cM(0, bxth.a));
    }

    public final String j() {
        return getString(cM(7, bxth.a));
    }

    public final String k() {
        return getString(cM(1, bxth.a));
    }

    public final String l() {
        return getString(cM(2, bxth.a));
    }

    public final String m() {
        return getString(cM(5, bxth.a));
    }

    @Override // defpackage.dtsu
    public final Cursor a() {
        return this;
    }
}
