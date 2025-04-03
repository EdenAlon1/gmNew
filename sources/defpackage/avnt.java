package defpackage;

import android.database.Cursor;
import j$.time.Instant;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class avnt extends dtsr implements avnp {
    @Deprecated
    public avnt(dtve dtveVar, Cursor cursor, String[] strArr, dtzj[] dtzjVarArr, dtyo dtyoVar, dtvs dtvsVar, avnx avnxVar) {
        super(dtveVar, cursor, strArr, dtzjVarArr, avod.a, dtyoVar, dtvsVar, avnxVar);
    }

    @Override // defpackage.dtsr
    protected final /* synthetic */ dtro b() {
        return new avne();
    }

    public final avoi c() {
        byte[] blob = getBlob(cM(2, avod.a));
        if (blob == null) {
            return null;
        }
        try {
            return (avoi) eyfy.parseFrom(avoi.a, blob, eyfc.a());
        } catch (Throwable unused) {
            return avoi.a;
        }
    }

    public final Instant e() {
        return bdgw.b(getLong(cM(1, avod.a)));
    }

    public final String f() {
        return getString(cM(0, avod.a));
    }

    @Override // defpackage.dtsr
    public final engw fI(dtvn dtvnVar) {
        Instant[] instantArr;
        avoi avoiVar;
        dtyq dtyqVar = dtvnVar.a;
        long[] dB = dB(getString(dtvnVar.h + 1));
        int length = dB.length;
        if (length != 0) {
            if (length != 1 || dB[0] != -1) {
                HashSet hashSet = new HashSet();
                dtvs dtvsVar = this.d;
                boolean di = di(0);
                boolean z = dtvsVar.b;
                avoi[] avoiVarArr = null;
                String[] strArr = di ? z ? (String[]) dtub.C(null, dt(getString(cM(0, avod.a))), new String[0]) : new String[]{f()} : null;
                dtsr.dz(length, strArr, new emyl() { // from class: avnq
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "msisdn:".concat(String.valueOf(avnt.this.getString(0)));
                    }
                });
                if (!di(1)) {
                    instantArr = null;
                } else if (z) {
                    long[] ds = ds(getString(cM(1, avod.a)));
                    int length2 = ds.length;
                    Instant[] instantArr2 = new Instant[length2];
                    for (int i = 0; i < length2; i++) {
                        instantArr2[i] = bdgw.b(ds[i]);
                    }
                    instantArr = (Instant[]) dtub.C(null, instantArr2, new Instant[0]);
                } else {
                    instantArr = new Instant[]{e()};
                }
                dtsr.dz(length, instantArr, new emyl() { // from class: avnr
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "last_refresh_timestamp:".concat(String.valueOf(avnt.this.getString(1)));
                    }
                });
                if (di(2)) {
                    if (z) {
                        List de = de(getString(cM(2, avod.a)));
                        avoi[] avoiVarArr2 = new avoi[de.size()];
                        Iterator it = de.iterator();
                        int i2 = 0;
                        while (it.hasNext()) {
                            try {
                                byte[] y = dtub.y((String) it.next());
                                int i3 = i2 + 1;
                                if (y == null) {
                                    avoiVar = null;
                                } else {
                                    try {
                                        avoiVar = (avoi) eyfy.parseFrom(avoi.a, y);
                                    } catch (Throwable unused) {
                                        i2 = i3;
                                        avoiVarArr2[i2] = null;
                                        i2++;
                                    }
                                }
                                avoiVarArr2[i2] = avoiVar;
                                i2 = i3;
                            } catch (Throwable unused2) {
                            }
                        }
                        avoiVarArr = (avoi[]) dtub.C(null, avoiVarArr2, new avoi[0]);
                    } else {
                        avoiVarArr = new avoi[]{c()};
                    }
                }
                dtsr.dz(length, avoiVarArr, new emyl() { // from class: avns
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "rcs_capabilities:".concat(String.valueOf(avnt.this.getString(2)));
                    }
                });
                engr engrVar = new engr();
                for (int i4 = 0; i4 < length; i4++) {
                    long j = dB[i4];
                    if (j > 0 && !hashSet.contains(Long.valueOf(j))) {
                        hashSet.add(Long.valueOf(dB[i4]));
                        String[] strArr2 = avod.a;
                        avng avngVar = new avng();
                        avngVar.aF();
                        avngVar.aD();
                        long j2 = dB[i4];
                        if (strArr != null) {
                            avngVar.c(strArr[i4]);
                        }
                        if (instantArr != null) {
                            avngVar.b(instantArr[i4]);
                        }
                        if (avoiVarArr != null) {
                            avngVar.d(avoiVarArr[i4]);
                        }
                        engrVar.h(avngVar.a());
                    }
                }
                return engrVar.g();
            }
        }
        int i5 = engw.d;
        return enou.a;
    }

    @Override // defpackage.dtsu
    public final Cursor a() {
        return this;
    }
}
