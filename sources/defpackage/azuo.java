package defpackage;

import android.database.Cursor;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class azuo extends dtsr implements azui {
    @Deprecated
    public azuo(dtve dtveVar, Cursor cursor, String[] strArr, dtzj[] dtzjVarArr, dtyo dtyoVar, dtvs dtvsVar, azus azusVar) {
        super(dtveVar, cursor, strArr, dtzjVarArr, azuy.a, dtyoVar, dtvsVar, azusVar);
    }

    @Override // defpackage.dtsr
    protected final /* synthetic */ dtro b() {
        return new aztq();
    }

    public final int c() {
        return getInt(cM(0, azuy.a));
    }

    public final azsu e() {
        return azsv.a(getString(cM(3, azuy.a)));
    }

    public final azsu f() {
        return azsv.a(getString(cM(4, azuy.a)));
    }

    @Override // defpackage.dtsr
    public final engw fI(dtvn dtvnVar) {
        azsu[] azsuVarArr;
        dtyq dtyqVar = dtvnVar.a;
        long[] dB = dB(getString(dtvnVar.h + 1));
        int length = dB.length;
        if (length != 0) {
            if (length != 1 || dB[0] != -1) {
                HashSet hashSet = new HashSet();
                dtvs dtvsVar = this.d;
                boolean di = di(0);
                boolean z = dtvsVar.b;
                azsu[] azsuVarArr2 = null;
                int[] z2 = di ? z ? dtub.z(null, dr(getString(cM(0, azuy.a)))) : new int[]{c()} : null;
                dtsr.dx(length, z2, new emyl() { // from class: azuj
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "sub_id:".concat(String.valueOf(azuo.this.getString(0)));
                    }
                });
                String[] strArr = di(1) ? z ? (String[]) dtub.C(null, dt(getString(cM(1, azuy.a))), new String[0]) : new String[]{g()} : null;
                dtsr.dz(length, strArr, new emyl() { // from class: azuk
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "sim_serial_number:".concat(String.valueOf(azuo.this.getString(1)));
                    }
                });
                String[] strArr2 = di(2) ? z ? (String[]) dtub.C(null, dt(getString(cM(2, azuy.a))), new String[0]) : new String[]{h()} : null;
                dtsr.dz(length, strArr2, new emyl() { // from class: azul
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "telephony_phone_number:".concat(String.valueOf(azuo.this.getString(2)));
                    }
                });
                if (!di(3)) {
                    azsuVarArr = null;
                } else if (z) {
                    String[] dt = dt(getString(cM(3, azuy.a)));
                    int length2 = dt.length;
                    azsu[] azsuVarArr3 = new azsu[length2];
                    for (int i = 0; i < length2; i++) {
                        azsuVarArr3[i] = azsv.a(dt[i]);
                    }
                    azsuVarArr = (azsu[]) dtub.C(null, azsuVarArr3, new azsu[0]);
                } else {
                    azsuVarArr = new azsu[]{e()};
                }
                dtsr.dz(length, azsuVarArr, new emyl() { // from class: azum
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "my_identity_token:".concat(String.valueOf(azuo.this.getString(3)));
                    }
                });
                if (di(4)) {
                    if (z) {
                        String[] dt2 = dt(getString(cM(4, azuy.a)));
                        int length3 = dt2.length;
                        azsu[] azsuVarArr4 = new azsu[length3];
                        for (int i2 = 0; i2 < length3; i2++) {
                            azsuVarArr4[i2] = azsv.a(dt2[i2]);
                        }
                        azsuVarArr2 = (azsu[]) dtub.C(null, azsuVarArr4, new azsu[0]);
                    } else {
                        azsuVarArr2 = new azsu[]{f()};
                    }
                }
                dtsr.dz(length, azsuVarArr2, new emyl() { // from class: azun
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "my_identity_token_with_foreign_key:".concat(String.valueOf(azuo.this.getString(4)));
                    }
                });
                engr engrVar = new engr();
                for (int i3 = 0; i3 < length; i3++) {
                    try {
                        long j = dB[i3];
                        if (j > 0 && !hashSet.contains(Long.valueOf(j))) {
                            hashSet.add(Long.valueOf(dB[i3]));
                            String[] strArr3 = azuy.a;
                            aztu aztuVar = new aztu();
                            aztuVar.aF();
                            aztuVar.aD();
                            long j2 = dB[i3];
                            if (z2 != null) {
                                aztuVar.f(z2[i3]);
                            }
                            if (strArr != null) {
                                aztuVar.e(strArr[i3]);
                            }
                            if (strArr2 != null) {
                                aztuVar.g(strArr2[i3]);
                            }
                            if (azsuVarArr != null) {
                                aztuVar.c(azsuVarArr[i3]);
                            }
                            if (azsuVarArr2 != null) {
                                aztuVar.d(azsuVarArr2[i3]);
                            }
                            engrVar.h(aztuVar.a());
                        }
                    } catch (dtqp unused) {
                    }
                }
                return engrVar.g();
            }
        }
        int i4 = engw.d;
        return enou.a;
    }

    public final String g() {
        return getString(cM(1, azuy.a));
    }

    public final String h() {
        return getString(cM(2, azuy.a));
    }

    @Override // defpackage.dtsu
    public final Cursor a() {
        return this;
    }
}
