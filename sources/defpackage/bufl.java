package defpackage;

import android.database.Cursor;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bufl extends dtsr implements bufg {
    @Deprecated
    public bufl(dtve dtveVar, Cursor cursor, String[] strArr, dtzj[] dtzjVarArr, dtyo dtyoVar, dtvs dtvsVar, bufr bufrVar) {
        super(dtveVar, cursor, strArr, dtzjVarArr, bufy.a, dtyoVar, dtvsVar, bufrVar);
    }

    @Override // defpackage.dtsr
    protected final /* synthetic */ dtro b() {
        return new buep();
    }

    public final ajrb c() {
        return ajrb.b(getInt(cM(2, bufy.a)));
    }

    public final MessageIdType e() {
        return new MessageIdType(getLong(cM(0, bufy.a)));
    }

    public final MessageIdType f() {
        return new MessageIdType(getLong(cM(1, bufy.a)));
    }

    @Override // defpackage.dtsr
    public final engw fI(dtvn dtvnVar) {
        MessageIdType[] messageIdTypeArr;
        MessageIdType[] messageIdTypeArr2;
        ajrb[] ajrbVarArr;
        dtyq dtyqVar = dtvnVar.a;
        long[] dB = dB(getString(dtvnVar.h + 1));
        int length = dB.length;
        if (length != 0) {
            if (length != 1 || dB[0] != -1) {
                HashSet hashSet = new HashSet();
                dtvs dtvsVar = this.d;
                boolean di = di(0);
                boolean z = dtvsVar.b;
                bdhg[] bdhgVarArr = null;
                if (!di) {
                    messageIdTypeArr = null;
                } else if (z) {
                    long[] ds = ds(getString(cM(0, bufy.a)));
                    int length2 = ds.length;
                    MessageIdType[] messageIdTypeArr3 = new MessageIdType[length2];
                    for (int i = 0; i < length2; i++) {
                        messageIdTypeArr3[i] = new MessageIdType(ds[i]);
                    }
                    messageIdTypeArr = (MessageIdType[]) dtub.C(null, messageIdTypeArr3, new MessageIdType[0]);
                } else {
                    messageIdTypeArr = new MessageIdType[]{e()};
                }
                dtsr.dz(length, messageIdTypeArr, new emyl() { // from class: bufh
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "message_id:".concat(String.valueOf(bufl.this.getString(0)));
                    }
                });
                if (!di(1)) {
                    messageIdTypeArr2 = null;
                } else if (z) {
                    long[] ds2 = ds(getString(cM(1, bufy.a)));
                    int length3 = ds2.length;
                    MessageIdType[] messageIdTypeArr4 = new MessageIdType[length3];
                    for (int i2 = 0; i2 < length3; i2++) {
                        messageIdTypeArr4[i2] = new MessageIdType(ds2[i2]);
                    }
                    messageIdTypeArr2 = (MessageIdType[]) dtub.C(null, messageIdTypeArr4, new MessageIdType[0]);
                } else {
                    messageIdTypeArr2 = new MessageIdType[]{f()};
                }
                dtsr.dz(length, messageIdTypeArr2, new emyl() { // from class: bufi
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "replied_to_message_id:".concat(String.valueOf(bufl.this.getString(1)));
                    }
                });
                if (!di(2)) {
                    ajrbVarArr = null;
                } else if (z) {
                    int[] dr = dr(getString(cM(2, bufy.a)));
                    ajrb[] ajrbVarArr2 = new ajrb[dr.length];
                    for (int i3 = 0; i3 < dr.length; i3++) {
                        ajrb b = ajrb.b(dr[i3]);
                        if (b == null) {
                            throw new IllegalStateException();
                        }
                        ajrbVarArr2[i3] = b;
                    }
                    ajrbVarArr = (ajrb[]) dtub.C(null, ajrbVarArr2, new ajrb[0]);
                } else {
                    ajrbVarArr = new ajrb[]{c()};
                }
                dtsr.dz(length, ajrbVarArr, new emyl() { // from class: bufj
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "replied_to_message_id_null_reason:".concat(String.valueOf(bufl.this.getString(2)));
                    }
                });
                if (di(3)) {
                    if (z) {
                        String[] dt = dt(getString(cM(3, bufy.a)));
                        int length4 = dt.length;
                        bdhg[] bdhgVarArr2 = new bdhg[length4];
                        for (int i4 = 0; i4 < length4; i4++) {
                            bdhgVarArr2[i4] = bdhg.a(dt[i4]);
                        }
                        bdhgVarArr = (bdhg[]) dtub.C(null, bdhgVarArr2, new bdhg[0]);
                    } else {
                        bdhgVarArr = new bdhg[]{g()};
                    }
                }
                dtsr.dz(length, bdhgVarArr, new emyl() { // from class: bufk
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "replied_to_rcs_message_id:".concat(String.valueOf(bufl.this.getString(3)));
                    }
                });
                engr engrVar = new engr();
                for (int i5 = 0; i5 < length; i5++) {
                    long j = dB[i5];
                    if (j > 0 && !hashSet.contains(Long.valueOf(j))) {
                        hashSet.add(Long.valueOf(dB[i5]));
                        String[] strArr = bufy.a;
                        buet buetVar = new buet();
                        buetVar.aF();
                        buetVar.aD();
                        long j2 = dB[i5];
                        if (messageIdTypeArr != null) {
                            buetVar.d(messageIdTypeArr[i5]);
                        }
                        if (messageIdTypeArr2 != null) {
                            buetVar.e(messageIdTypeArr2[i5]);
                        }
                        if (ajrbVarArr != null) {
                            buetVar.f(ajrbVarArr[i5]);
                        }
                        if (bdhgVarArr != null) {
                            buetVar.g(bdhgVarArr[i5]);
                        }
                        engrVar.h(buetVar.a());
                    }
                }
                return engrVar.g();
            }
        }
        int i6 = engw.d;
        return enou.a;
    }

    public final bdhg g() {
        return bdhg.a(getString(cM(3, bufy.a)));
    }

    @Override // defpackage.dtsu
    public final Cursor a() {
        return this;
    }
}
