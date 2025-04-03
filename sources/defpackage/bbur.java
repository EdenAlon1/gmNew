package defpackage;

import android.database.Cursor;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bbur extends dtsr implements bbum {
    @Deprecated
    public bbur(dtve dtveVar, Cursor cursor, String[] strArr, dtzj[] dtzjVarArr, dtyo dtyoVar, dtvs dtvsVar, bbuy bbuyVar) {
        super(dtveVar, cursor, strArr, dtzjVarArr, bbvc.a, dtyoVar, dtvsVar, bbuyVar);
    }

    @Override // defpackage.dtsr
    protected final /* synthetic */ dtro b() {
        return new bbtx();
    }

    public final ajrb c() {
        return ajrb.b(getInt(cM(2, bbvc.a)));
    }

    public final MessageIdType e() {
        return new MessageIdType(getLong(cM(0, bbvc.a)));
    }

    public final MessageIdType f() {
        return new MessageIdType(getLong(cM(1, bbvc.a)));
    }

    @Override // defpackage.dtsr
    public final engw fI(dtvn dtvnVar) {
        MessageIdType[] messageIdTypeArr;
        MessageIdType[] messageIdTypeArr2;
        ajrb[] ajrbVarArr;
        dtyq dtyqVar = dtvnVar.a;
        int i = 1;
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
        bdhg[] bdhgVarArr = null;
        if (!di) {
            messageIdTypeArr = null;
        } else if (z) {
            long[] ds = ds(getString(cM(0, bbvc.a)));
            int length2 = ds.length;
            MessageIdType[] messageIdTypeArr3 = new MessageIdType[length2];
            for (int i3 = 0; i3 < length2; i3++) {
                messageIdTypeArr3[i3] = new MessageIdType(ds[i3]);
            }
            messageIdTypeArr = (MessageIdType[]) dtub.C(null, messageIdTypeArr3, new MessageIdType[0]);
        } else {
            messageIdTypeArr = new MessageIdType[]{e()};
        }
        dtsr.dz(length, messageIdTypeArr, new emyl() { // from class: bbun
            @Override // defpackage.emyl
            public final Object get() {
                return "message_id:".concat(String.valueOf(bbur.this.getString(0)));
            }
        });
        if (!di(1)) {
            messageIdTypeArr2 = null;
        } else if (z) {
            long[] ds2 = ds(getString(cM(1, bbvc.a)));
            int length3 = ds2.length;
            MessageIdType[] messageIdTypeArr4 = new MessageIdType[length3];
            for (int i4 = 0; i4 < length3; i4++) {
                messageIdTypeArr4[i4] = new MessageIdType(ds2[i4]);
            }
            messageIdTypeArr2 = (MessageIdType[]) dtub.C(null, messageIdTypeArr4, new MessageIdType[0]);
        } else {
            messageIdTypeArr2 = new MessageIdType[]{f()};
        }
        dtsr.dz(length, messageIdTypeArr2, new emyl() { // from class: bbuo
            @Override // defpackage.emyl
            public final Object get() {
                return "replied_to_message_id:".concat(String.valueOf(bbur.this.getString(1)));
            }
        });
        if (!di(2)) {
            ajrbVarArr = null;
        } else if (z) {
            int[] dr = dr(getString(cM(2, bbvc.a)));
            ajrb[] ajrbVarArr2 = new ajrb[dr.length];
            for (int i5 = 0; i5 < dr.length; i5++) {
                ajrb b = ajrb.b(dr[i5]);
                if (b == null) {
                    throw new IllegalStateException();
                }
                ajrbVarArr2[i5] = b;
            }
            ajrbVarArr = (ajrb[]) dtub.C(null, ajrbVarArr2, new ajrb[0]);
        } else {
            ajrbVarArr = new ajrb[]{c()};
        }
        dtsr.dz(length, ajrbVarArr, new emyl() { // from class: bbup
            @Override // defpackage.emyl
            public final Object get() {
                return "replied_to_message_id_null_reason:".concat(String.valueOf(bbur.this.getString(2)));
            }
        });
        if (di(3)) {
            if (z) {
                String[] dt = dt(getString(cM(3, bbvc.a)));
                int length4 = dt.length;
                bdhg[] bdhgVarArr2 = new bdhg[length4];
                for (int i6 = 0; i6 < length4; i6++) {
                    bdhgVarArr2[i6] = bdhg.a(dt[i6]);
                }
                bdhgVarArr = (bdhg[]) dtub.C(null, bdhgVarArr2, new bdhg[0]);
            } else {
                bdhgVarArr = new bdhg[]{g()};
            }
        }
        dtsr.dz(length, bdhgVarArr, new emyl() { // from class: bbuq
            @Override // defpackage.emyl
            public final Object get() {
                return "replied_to_rcs_message_id:".concat(String.valueOf(bbur.this.getString(3)));
            }
        });
        engr engrVar = new engr();
        int i7 = 0;
        while (i7 < length) {
            long j = dB[i7];
            if (j > 0 && !hashSet.contains(Long.valueOf(j))) {
                hashSet.add(Long.valueOf(dB[i7]));
                String[] strArr = bbvc.a;
                bbtz bbtzVar = new bbtz();
                bbtzVar.aF();
                bbtzVar.aD();
                long j2 = dB[i7];
                if (messageIdTypeArr != null) {
                    MessageIdType messageIdType = messageIdTypeArr[i7];
                    bbtzVar.aE(0);
                    bbtzVar.a = messageIdType;
                }
                if (messageIdTypeArr2 != null) {
                    MessageIdType messageIdType2 = messageIdTypeArr2[i7];
                    bbtzVar.aE(i);
                    bbtzVar.b = messageIdType2;
                }
                if (ajrbVarArr != null) {
                    ajrb ajrbVar = ajrbVarArr[i7];
                    bbtzVar.aE(2);
                    bbtzVar.c = ajrbVar;
                }
                if (bdhgVarArr != null) {
                    bdhg bdhgVar = bdhgVarArr[i7];
                    bbtzVar.aE(3);
                    bbtzVar.d = bdhgVar;
                }
                bbtx bbtxVar = new bbtx();
                bbtxVar.aC(bbtzVar.aB());
                bbtxVar.a = bbtzVar.a;
                bbtxVar.b = bbtzVar.b;
                bbtxVar.c = bbtzVar.c;
                bbtxVar.d = bbtzVar.d;
                bbtxVar.cK = bbtzVar.aC();
                engrVar.h(bbtxVar);
            }
            i7++;
            i = 1;
        }
        return engrVar.g();
    }

    public final bdhg g() {
        return bdhg.a(getString(cM(3, bbvc.a)));
    }

    @Override // defpackage.dtsu
    public final Cursor a() {
        return this;
    }
}
