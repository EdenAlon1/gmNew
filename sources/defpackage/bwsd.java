package defpackage;

import android.database.Cursor;
import com.google.android.ims.rcsservice.businessinfo.AgentUseCase;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bwsd extends dtsr implements bwrq {
    @Deprecated
    public bwsd(dtve dtveVar, Cursor cursor, String[] strArr, dtzj[] dtzjVarArr, dtyo dtyoVar, dtvs dtvsVar, bwsi bwsiVar) {
        super(dtveVar, cursor, strArr, dtzjVarArr, bwso.a, dtyoVar, dtvsVar, bwsiVar);
    }

    @Override // defpackage.dtsr
    protected final /* synthetic */ dtro b() {
        return new bwqn();
    }

    public final long c() {
        return getLong(cM(10, bwso.a));
    }

    public final AgentUseCase e() {
        AgentUseCase[] values = AgentUseCase.values();
        int i = getInt(cM(11, bwso.a));
        if (i < values.length) {
            return values[i];
        }
        throw new IllegalArgumentException();
    }

    public final String f() {
        return getString(cM(5, bwso.a));
    }

    @Override // defpackage.dtsr
    public final engw fI(dtvn dtvnVar) {
        int i;
        String[] strArr;
        long[] jArr;
        String[] strArr2;
        String[] strArr3;
        String[] strArr4;
        String[] strArr5;
        String[] strArr6;
        int i2;
        AgentUseCase[] agentUseCaseArr;
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
        String[] strArr7 = di ? z ? (String[]) dtub.C(null, dt(getString(cM(0, bwso.a))), new String[0]) : new String[]{m()} : null;
        dtsr.dz(length, strArr7, new emyl() { // from class: bwrr
            @Override // defpackage.emyl
            public final Object get() {
                return "rbm_bot_id:".concat(String.valueOf(bwsd.this.getString(0)));
            }
        });
        String[] strArr8 = di(1) ? z ? (String[]) dtub.C(null, dt(getString(cM(1, bwso.a))), new String[0]) : new String[]{h()} : null;
        dtsr.dz(length, strArr8, new emyl() { // from class: bwrw
            @Override // defpackage.emyl
            public final Object get() {
                return "display_name:".concat(String.valueOf(bwsd.this.getString(1)));
            }
        });
        String[] strArr9 = di(2) ? z ? (String[]) dtub.C(null, dt(getString(cM(2, bwso.a))), new String[0]) : new String[]{l()} : null;
        dtsr.dz(length, strArr9, new emyl() { // from class: bwrx
            @Override // defpackage.emyl
            public final Object get() {
                return "logo_image_remote_url:".concat(String.valueOf(bwsd.this.getString(2)));
            }
        });
        String[] strArr10 = di(3) ? z ? (String[]) dtub.C(null, dt(getString(cM(3, bwso.a))), new String[0]) : new String[]{k()} : null;
        dtsr.dz(length, strArr10, new emyl() { // from class: bwry
            @Override // defpackage.emyl
            public final Object get() {
                return "logo_image_local_uri:".concat(String.valueOf(bwsd.this.getString(3)));
            }
        });
        String[] strArr11 = di(4) ? z ? (String[]) dtub.C(null, dt(getString(cM(4, bwso.a))), new String[0]) : new String[]{g()} : null;
        dtsr.dz(length, strArr11, new emyl() { // from class: bwrz
            @Override // defpackage.emyl
            public final Object get() {
                return "description:".concat(String.valueOf(bwsd.this.getString(4)));
            }
        });
        String[] strArr12 = di(5) ? z ? (String[]) dtub.C(null, dt(getString(cM(5, bwso.a))), new String[0]) : new String[]{f()} : null;
        dtsr.dz(length, strArr12, new emyl() { // from class: bwsa
            @Override // defpackage.emyl
            public final Object get() {
                return "color:".concat(String.valueOf(bwsd.this.getString(5)));
            }
        });
        String[] strArr13 = di(6) ? z ? (String[]) dtub.C(null, dt(getString(cM(6, bwso.a))), new String[0]) : new String[]{j()} : null;
        dtsr.dz(length, strArr13, new emyl() { // from class: bwsb
            @Override // defpackage.emyl
            public final Object get() {
                return "hero_image_remote_url:".concat(String.valueOf(bwsd.this.getString(6)));
            }
        });
        String[] strArr14 = di(7) ? z ? (String[]) dtub.C(null, dt(getString(cM(7, bwso.a))), new String[0]) : new String[]{i()} : null;
        dtsr.dz(length, strArr14, new emyl() { // from class: bwsc
            @Override // defpackage.emyl
            public final Object get() {
                return "hero_image_local_uri:".concat(String.valueOf(bwsd.this.getString(7)));
            }
        });
        if (!di(8)) {
            i = 0;
            strArr = null;
        } else if (z) {
            i = 0;
            strArr = (String[]) dtub.C(null, dt(getString(cM(8, bwso.a))), new String[0]);
        } else {
            i = 0;
            strArr = new String[]{n()};
        }
        dtsr.dz(length, strArr, new emyl() { // from class: bwrs
            @Override // defpackage.emyl
            public final Object get() {
                return "verifier_id:".concat(String.valueOf(bwsd.this.getString(8)));
            }
        });
        if (!di(9)) {
            jArr = dB;
            strArr2 = null;
        } else if (z) {
            jArr = dB;
            strArr2 = (String[]) dtub.C(null, dt(getString(cM(9, bwso.a))), new String[i]);
        } else {
            jArr = dB;
            String[] strArr15 = new String[1];
            strArr15[i] = o();
            strArr2 = strArr15;
        }
        dtsr.dz(length, strArr2, new emyl() { // from class: bwrt
            @Override // defpackage.emyl
            public final Object get() {
                return "version:".concat(String.valueOf(bwsd.this.getString(9)));
            }
        });
        long[] B = di(10) ? z ? dtub.B(null, ds(getString(cM(10, bwso.a)))) : new long[]{c()} : null;
        dtsr.dy(length, B, new emyl() { // from class: bwru
            @Override // defpackage.emyl
            public final Object get() {
                return "expiry_milliseconds:".concat(String.valueOf(bwsd.this.getString(10)));
            }
        });
        if (!di(11)) {
            strArr3 = strArr2;
            strArr4 = strArr14;
            strArr5 = strArr;
            strArr6 = strArr7;
            i2 = 0;
            agentUseCaseArr = null;
        } else if (z) {
            int[] dr = dr(getString(cM(11, bwso.a)));
            AgentUseCase[] values = AgentUseCase.values();
            strArr3 = strArr2;
            int length2 = values.length;
            strArr4 = strArr14;
            AgentUseCase[] agentUseCaseArr2 = new AgentUseCase[dr.length];
            strArr5 = strArr;
            strArr6 = strArr7;
            for (int i4 = 0; i4 < dr.length; i4++) {
                int i5 = dr[i4];
                if (i5 >= length2) {
                    throw new IllegalStateException();
                }
                agentUseCaseArr2[i4] = values[i5];
            }
            i2 = 0;
            agentUseCaseArr = (AgentUseCase[]) dtub.C(null, agentUseCaseArr2, new AgentUseCase[0]);
        } else {
            strArr3 = strArr2;
            strArr4 = strArr14;
            strArr5 = strArr;
            strArr6 = strArr7;
            i2 = 0;
            agentUseCaseArr = new AgentUseCase[]{e()};
        }
        dtsr.dz(length, agentUseCaseArr, new emyl() { // from class: bwrv
            @Override // defpackage.emyl
            public final Object get() {
                return "agent_use_case_category:".concat(String.valueOf(bwsd.this.getString(11)));
            }
        });
        engr engrVar = new engr();
        for (int i6 = i2; i6 < length; i6++) {
            long j = jArr[i6];
            if (j > 0 && !hashSet.contains(Long.valueOf(j))) {
                hashSet.add(Long.valueOf(jArr[i6]));
                String[] strArr16 = bwso.a;
                bwqp bwqpVar = new bwqp();
                bwqpVar.aF();
                bwqpVar.aD();
                long j2 = jArr[i6];
                if (strArr6 != null) {
                    bwqpVar.k(strArr6[i6]);
                }
                if (strArr8 != null) {
                    bwqpVar.e(strArr8[i6]);
                }
                if (strArr9 != null) {
                    bwqpVar.j(strArr9[i6]);
                }
                if (strArr10 != null) {
                    bwqpVar.i(strArr10[i6]);
                }
                if (strArr11 != null) {
                    bwqpVar.d(strArr11[i6]);
                }
                if (strArr12 != null) {
                    bwqpVar.c(strArr12[i6]);
                }
                if (strArr13 != null) {
                    bwqpVar.h(strArr13[i6]);
                }
                if (strArr4 != null) {
                    bwqpVar.g(strArr4[i6]);
                }
                if (strArr5 != null) {
                    bwqpVar.l(strArr5[i6]);
                }
                if (strArr3 != null) {
                    bwqpVar.m(strArr3[i6]);
                }
                if (B != null) {
                    bwqpVar.f(B[i6]);
                }
                if (agentUseCaseArr != null) {
                    bwqpVar.b(agentUseCaseArr[i6]);
                }
                engrVar.h(bwqpVar.a());
            }
        }
        return engrVar.g();
    }

    public final String g() {
        return getString(cM(4, bwso.a));
    }

    public final String h() {
        return getString(cM(1, bwso.a));
    }

    public final String i() {
        return getString(cM(7, bwso.a));
    }

    public final String j() {
        return getString(cM(6, bwso.a));
    }

    public final String k() {
        return getString(cM(3, bwso.a));
    }

    public final String l() {
        return getString(cM(2, bwso.a));
    }

    public final String m() {
        return getString(cM(0, bwso.a));
    }

    public final String n() {
        return getString(cM(8, bwso.a));
    }

    public final String o() {
        return getString(cM(9, bwso.a));
    }

    @Override // defpackage.dtsu
    public final Cursor a() {
        return this;
    }
}
