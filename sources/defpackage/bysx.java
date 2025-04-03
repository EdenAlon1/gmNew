package defpackage;

import android.database.Cursor;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bysx extends dtsr implements byss {
    @Deprecated
    public bysx(dtve dtveVar, Cursor cursor, String[] strArr, dtzj[] dtzjVarArr, dtyo dtyoVar, dtvs dtvsVar, bytf bytfVar) {
        super(dtveVar, cursor, strArr, dtzjVarArr, bytk.a, dtyoVar, dtvsVar, bytfVar);
    }

    @Override // defpackage.dtsr
    protected final /* synthetic */ dtro b() {
        return new bysd();
    }

    public final long c() {
        return getLong(cM(2, bytk.a));
    }

    public final long e() {
        return getLong(cM(3, bytk.a));
    }

    public final MessageIdType f() {
        return new MessageIdType(getLong(cM(1, bytk.a)));
    }

    @Override // defpackage.dtsr
    public final engw fI(dtvn dtvnVar) {
        MessageIdType[] messageIdTypeArr;
        dtyq dtyqVar = dtvnVar.a;
        long[] dB = dB(getString(dtvnVar.h + 1));
        int length = dB.length;
        if (length != 0) {
            if (length != 1 || dB[0] != -1) {
                HashSet hashSet = new HashSet();
                dtvs dtvsVar = this.d;
                boolean di = di(0);
                boolean z = dtvsVar.b;
                String[] strArr = di ? z ? (String[]) dtub.C(null, dt(getString(cM(0, bytk.a))), new String[0]) : new String[]{g()} : null;
                dtsr.dz(length, strArr, new emyl() { // from class: byst
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "_id:".concat(String.valueOf(bysx.this.getString(0)));
                    }
                });
                if (!di(1)) {
                    messageIdTypeArr = null;
                } else if (z) {
                    long[] ds = ds(getString(cM(1, bytk.a)));
                    int length2 = ds.length;
                    MessageIdType[] messageIdTypeArr2 = new MessageIdType[length2];
                    for (int i = 0; i < length2; i++) {
                        messageIdTypeArr2[i] = new MessageIdType(ds[i]);
                    }
                    messageIdTypeArr = (MessageIdType[]) dtub.C(null, messageIdTypeArr2, new MessageIdType[0]);
                } else {
                    messageIdTypeArr = new MessageIdType[]{f()};
                }
                dtsr.dz(length, messageIdTypeArr, new emyl() { // from class: bysu
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "message_id:".concat(String.valueOf(bysx.this.getString(1)));
                    }
                });
                long[] B = di(2) ? z ? dtub.B(null, ds(getString(cM(2, bytk.a)))) : new long[]{c()} : null;
                dtsr.dy(length, B, new emyl() { // from class: bysv
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "user_ref_id:".concat(String.valueOf(bysx.this.getString(2)));
                    }
                });
                long[] B2 = di(3) ? z ? dtub.B(null, ds(getString(cM(3, bytk.a)))) : new long[]{e()} : null;
                dtsr.dy(length, B2, new emyl() { // from class: bysw
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "user_ref_datetime:".concat(String.valueOf(bysx.this.getString(3)));
                    }
                });
                engr engrVar = new engr();
                for (int i2 = 0; i2 < length; i2++) {
                    long j = dB[i2];
                    if (j > 0 && !hashSet.contains(Long.valueOf(j))) {
                        hashSet.add(Long.valueOf(dB[i2]));
                        byse a = bytk.a();
                        a.aD();
                        long j2 = dB[i2];
                        if (strArr != null) {
                            a.b(strArr[i2]);
                        }
                        if (messageIdTypeArr != null) {
                            a.c(messageIdTypeArr[i2]);
                        }
                        if (B != null) {
                            a.d(B[i2]);
                        }
                        if (B2 != null) {
                            a.e(B2[i2]);
                        }
                        engrVar.h(a.a());
                    }
                }
                return engrVar.g();
            }
        }
        int i3 = engw.d;
        return enou.a;
    }

    public final String g() {
        return getString(cM(0, bytk.a));
    }

    @Override // defpackage.dtsu
    public final Cursor a() {
        return this;
    }
}
