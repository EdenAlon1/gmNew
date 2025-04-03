package defpackage;

import android.database.Cursor;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class btns extends dtsr implements btno {
    @Deprecated
    public btns(dtve dtveVar, Cursor cursor, String[] strArr, dtzj[] dtzjVarArr, dtyo dtyoVar, dtvs dtvsVar, btnv btnvVar) {
        super(dtveVar, cursor, strArr, dtzjVarArr, btob.a, dtyoVar, dtvsVar, btnvVar);
    }

    @Override // defpackage.dtsr
    protected final /* synthetic */ dtro b() {
        return new btnc();
    }

    @Override // defpackage.btno
    public final engw c() {
        engr engrVar = new engr();
        while (moveToNext()) {
            e();
            engrVar.h(Long.valueOf(e()));
        }
        return engrVar.g();
    }

    public final long e() {
        return getLong(cM(2, btob.a));
    }

    public final long f() {
        return getLong(cM(1, btob.a));
    }

    @Override // defpackage.dtsr
    public final engw fI(dtvn dtvnVar) {
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
        String[] strArr = di ? z ? (String[]) dtub.C(null, dt(getString(cM(0, btob.a))), new String[0]) : new String[]{g()} : null;
        dtsr.dz(length, strArr, new emyl() { // from class: btnp
            @Override // defpackage.emyl
            public final Object get() {
                return "_id:".concat(String.valueOf(btns.this.getString(0)));
            }
        });
        long[] B = di(1) ? z ? dtub.B(null, ds(getString(cM(1, btob.a)))) : new long[]{f()} : null;
        dtsr.dy(length, B, new emyl() { // from class: btnq
            @Override // defpackage.emyl
            public final Object get() {
                return "participant_id:".concat(String.valueOf(btns.this.getString(1)));
            }
        });
        long[] B2 = di(2) ? z ? dtub.B(null, ds(getString(cM(2, btob.a)))) : new long[]{e()} : null;
        dtsr.dy(length, B2, new emyl() { // from class: btnr
            @Override // defpackage.emyl
            public final Object get() {
                return "manual_link_preview_count:".concat(String.valueOf(btns.this.getString(2)));
            }
        });
        engr engrVar = new engr();
        for (int i2 = 0; i2 < length; i2++) {
            long j = dB[i2];
            if (j > 0 && !hashSet.contains(Long.valueOf(j))) {
                hashSet.add(Long.valueOf(dB[i2]));
                String[] strArr2 = btob.a;
                btne btneVar = new btne();
                btneVar.aF();
                btneVar.aD();
                long j2 = dB[i2];
                if (strArr != null) {
                    String str = strArr[i2];
                    btneVar.aE(0);
                    btneVar.a = str;
                }
                if (B != null) {
                    btneVar.c(B[i2]);
                }
                if (B2 != null) {
                    btneVar.b(B2[i2]);
                }
                engrVar.h(btneVar.a());
            }
        }
        return engrVar.g();
    }

    public final String g() {
        return getString(cM(0, btob.a));
    }

    @Override // defpackage.dtsu
    public final Cursor a() {
        return this;
    }
}
