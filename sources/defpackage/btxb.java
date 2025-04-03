package defpackage;

import android.database.Cursor;
import java.util.HashSet;
import java.util.UUID;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class btxb extends dtsr implements btww {
    @Deprecated
    public btxb(dtve dtveVar, Cursor cursor, String[] strArr, dtzj[] dtzjVarArr, dtyo dtyoVar, dtvs dtvsVar, btxe btxeVar) {
        super(dtveVar, cursor, strArr, dtzjVarArr, btxi.a, dtyoVar, dtvsVar, btxeVar);
    }

    @Override // defpackage.dtsr
    protected final /* synthetic */ dtro b() {
        return new btwg();
    }

    public final long c() {
        return getLong(cM(0, btxi.a));
    }

    public final byzb e() {
        byzb[] values = byzb.values();
        int i = getInt(cM(2, btxi.a));
        if (i < values.length) {
            return values[i];
        }
        throw new IllegalArgumentException();
    }

    public final String f() {
        return getString(cM(3, btxi.a));
    }

    @Override // defpackage.dtsr
    public final engw fI(dtvn dtvnVar) {
        UUID[] uuidArr;
        byzb[] byzbVarArr;
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
        long[] B = di ? z ? dtub.B(null, ds(getString(cM(0, btxi.a)))) : new long[]{c()} : null;
        dtsr.dy(length, B, new emyl() { // from class: btwx
            @Override // defpackage.emyl
            public final Object get() {
                return "_id:".concat(String.valueOf(btxb.this.getString(0)));
            }
        });
        if (!di(1)) {
            uuidArr = null;
        } else if (z) {
            String[] dt = dt(getString(cM(1, btxi.a)));
            int length2 = dt.length;
            UUID[] uuidArr2 = new UUID[length2];
            for (int i2 = 0; i2 < length2; i2++) {
                uuidArr2[i2] = UUID.fromString(dt[i2]);
            }
            uuidArr = (UUID[]) dtub.C(null, uuidArr2, new UUID[0]);
        } else {
            uuidArr = new UUID[]{g()};
        }
        dtsr.dz(length, uuidArr, new emyl() { // from class: btwy
            @Override // defpackage.emyl
            public final Object get() {
                return "message_send_receive_attempt_id:".concat(String.valueOf(btxb.this.getString(1)));
            }
        });
        if (!di(2)) {
            byzbVarArr = null;
        } else if (z) {
            int[] dr = dr(getString(cM(2, btxi.a)));
            byzb[] values = byzb.values();
            int length3 = values.length;
            byzb[] byzbVarArr2 = new byzb[dr.length];
            for (int i3 = 0; i3 < dr.length; i3++) {
                int i4 = dr[i3];
                if (i4 >= length3) {
                    throw new IllegalStateException();
                }
                byzbVarArr2[i3] = values[i4];
            }
            byzbVarArr = (byzb[]) dtub.C(null, byzbVarArr2, new byzb[0]);
        } else {
            byzbVarArr = new byzb[]{e()};
        }
        dtsr.dz(length, byzbVarArr, new emyl() { // from class: btwz
            @Override // defpackage.emyl
            public final Object get() {
                return "message_destination_type:".concat(String.valueOf(btxb.this.getString(2)));
            }
        });
        String[] strArr = di(3) ? z ? (String[]) dtub.C(null, dt(getString(cM(3, btxi.a))), new String[0]) : new String[]{f()} : null;
        dtsr.dz(length, strArr, new emyl() { // from class: btxa
            @Override // defpackage.emyl
            public final Object get() {
                return "message_destination_raw:".concat(String.valueOf(btxb.this.getString(3)));
            }
        });
        engr engrVar = new engr();
        for (int i5 = 0; i5 < length; i5++) {
            long j = dB[i5];
            if (j > 0 && !hashSet.contains(Long.valueOf(j))) {
                hashSet.add(Long.valueOf(dB[i5]));
                String[] strArr2 = btxi.a;
                btwk btwkVar = new btwk();
                btwkVar.aF();
                btwkVar.aD();
                long j2 = dB[i5];
                if (B != null) {
                    long j3 = B[i5];
                    btwkVar.aE(0);
                    btwkVar.a = j3;
                }
                if (uuidArr != null) {
                    btwkVar.d(uuidArr[i5]);
                }
                if (byzbVarArr != null) {
                    btwkVar.c(byzbVarArr[i5]);
                }
                if (strArr != null) {
                    btwkVar.b(strArr[i5]);
                }
                engrVar.h(btwkVar.a(new Supplier() { // from class: btwh
                    @Override // java.util.function.Supplier
                    public final Object get() {
                        return new btwg();
                    }
                }));
            }
        }
        return engrVar.g();
    }

    public final UUID g() {
        return UUID.fromString(getString(cM(1, btxi.a)));
    }

    @Override // defpackage.dtsu
    public final Cursor a() {
        return this;
    }
}
