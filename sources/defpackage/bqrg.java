package defpackage;

import android.database.Cursor;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bqrg extends dtsr implements bqqx {
    @Deprecated
    public bqrg(dtve dtveVar, Cursor cursor, String[] strArr, dtzj[] dtzjVarArr, dtyo dtyoVar, dtvs dtvsVar, bqrl bqrlVar) {
        super(dtveVar, cursor, strArr, dtzjVarArr, bqrp.a, dtyoVar, dtvsVar, bqrlVar);
    }

    @Override // defpackage.dtsr
    protected final /* synthetic */ dtro b() {
        return new bqqc();
    }

    @Override // defpackage.bqqx
    public final long c() {
        return getLong(cM(1, bqrp.a));
    }

    @Override // defpackage.bqqx
    public final long e() {
        return getLong(cM(7, bqrp.a));
    }

    @Override // defpackage.bqqx
    public final String f() {
        return getString(cM(0, bqrp.a));
    }

    @Override // defpackage.dtsr
    public final engw fI(dtvn dtvnVar) {
        long[] jArr;
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
                String[] strArr = di ? z ? (String[]) dtub.C(null, dt(getString(cM(0, bqrp.a))), new String[0]) : new String[]{f()} : null;
                dtsr.dz(length, strArr, new emyl() { // from class: bqqy
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "cms_id:".concat(String.valueOf(bqrg.this.getString(0)));
                    }
                });
                long[] B = di(1) ? z ? dtub.B(null, ds(getString(cM(1, bqrp.a)))) : new long[]{c()} : null;
                dtsr.dy(length, B, new emyl() { // from class: bqqz
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "cms_last_mod_seq:".concat(String.valueOf(bqrg.this.getString(1)));
                    }
                });
                String[] strArr2 = di(2) ? z ? (String[]) dtub.C(null, dt(getString(cM(2, bqrp.a))), new String[0]) : new String[]{h()} : null;
                dtsr.dz(length, strArr2, new emyl() { // from class: bqra
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "cms_correlation_id:".concat(String.valueOf(bqrg.this.getString(2)));
                    }
                });
                String[] strArr3 = di(3) ? z ? (String[]) dtub.C(null, dt(getString(cM(3, bqrp.a))), new String[0]) : new String[]{j()} : null;
                dtsr.dz(length, strArr3, new emyl() { // from class: bqrb
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "from_address:".concat(String.valueOf(bqrg.this.getString(3)));
                    }
                });
                String[] strArr4 = di(4) ? z ? (String[]) dtub.C(null, dt(getString(cM(4, bqrp.a))), new String[0]) : new String[]{k()} : null;
                dtsr.dz(length, strArr4, new emyl() { // from class: bqrc
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "to_address:".concat(String.valueOf(bqrg.this.getString(4)));
                    }
                });
                String[] strArr5 = di(5) ? z ? (String[]) dtub.C(null, dt(getString(cM(5, bqrp.a))), new String[0]) : new String[]{i()} : null;
                dtsr.dz(length, strArr5, new emyl() { // from class: bqrd
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "correlation_text:".concat(String.valueOf(bqrg.this.getString(5)));
                    }
                });
                long[] B2 = di(6) ? z ? dtub.B(null, ds(getString(cM(6, bqrp.a)))) : new long[]{g()} : null;
                dtsr.dy(length, B2, new emyl() { // from class: bqre
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "modified_at_timestamp:".concat(String.valueOf(bqrg.this.getString(6)));
                    }
                });
                long[] B3 = di(7) ? z ? dtub.B(null, ds(getString(cM(7, bqrp.a)))) : new long[]{e()} : null;
                dtsr.dy(length, B3, new emyl() { // from class: bqrf
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "message_received_timestamp:".concat(String.valueOf(bqrg.this.getString(7)));
                    }
                });
                engr engrVar = new engr();
                while (i < length) {
                    long j = dB[i];
                    if (j <= 0 || hashSet.contains(Long.valueOf(j))) {
                        jArr = dB;
                    } else {
                        hashSet.add(Long.valueOf(dB[i]));
                        String[] strArr6 = bqrp.a;
                        bqqe bqqeVar = new bqqe();
                        bqqeVar.aF();
                        bqqeVar.aD();
                        long j2 = dB[i];
                        if (strArr != null) {
                            bqqeVar.c(strArr[i]);
                        }
                        jArr = dB;
                        if (B != null) {
                            bqqeVar.d(B[i]);
                        }
                        if (strArr2 != null) {
                            bqqeVar.b(strArr2[i]);
                        }
                        if (strArr3 != null) {
                            bqqeVar.f(strArr3[i]);
                        }
                        if (strArr4 != null) {
                            bqqeVar.i(strArr4[i]);
                        }
                        if (strArr5 != null) {
                            bqqeVar.e(strArr5[i]);
                        }
                        if (B2 != null) {
                            bqqeVar.h(B2[i]);
                        }
                        if (B3 != null) {
                            bqqeVar.g(B3[i]);
                        }
                        engrVar.h(bqqeVar.a());
                    }
                    i++;
                    dB = jArr;
                }
                return engrVar.g();
            }
        }
        int i2 = engw.d;
        return enou.a;
    }

    public final long g() {
        return getLong(cM(6, bqrp.a));
    }

    public final String h() {
        return getString(cM(2, bqrp.a));
    }

    public final String i() {
        return getString(cM(5, bqrp.a));
    }

    public final String j() {
        return getString(cM(3, bqrp.a));
    }

    public final String k() {
        return getString(cM(4, bqrp.a));
    }

    @Override // defpackage.dtsu
    public final Cursor a() {
        return this;
    }
}
