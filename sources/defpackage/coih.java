package defpackage;

import android.database.Cursor;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.scheduledsend.database.ScheduledSendTable;
import j$.time.Instant;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class coih extends dtsr implements coia {
    @Deprecated
    public coih(dtve dtveVar, Cursor cursor, String[] strArr, dtzj[] dtzjVarArr, dtyo dtyoVar, dtvs dtvsVar, coil coilVar) {
        super(dtveVar, cursor, strArr, dtzjVarArr, ScheduledSendTable.a, dtyoVar, dtvsVar, coilVar);
    }

    @Override // defpackage.dtsr
    protected final /* synthetic */ dtro b() {
        return new cohf();
    }

    public final ConversationIdType c() {
        return new ConversationIdType(getLong(cM(2, ScheduledSendTable.a)));
    }

    public final MessageIdType e() {
        return new MessageIdType(getLong(cM(1, ScheduledSendTable.a)));
    }

    public final coiu f() {
        coiu[] values = coiu.values();
        int i = getInt(cM(4, ScheduledSendTable.a));
        if (i < values.length) {
            return values[i];
        }
        throw new IllegalArgumentException();
    }

    @Override // defpackage.dtsr
    public final engw fI(dtvn dtvnVar) {
        MessageIdType[] messageIdTypeArr;
        ConversationIdType[] conversationIdTypeArr;
        Instant[] instantArr;
        coiu[] coiuVarArr;
        Instant[] instantArr2;
        dtyq dtyqVar = dtvnVar.a;
        long[] dB = dB(getString(dtvnVar.h + 1));
        int length = dB.length;
        if (length != 0) {
            if (length != 1 || dB[0] != -1) {
                HashSet hashSet = new HashSet();
                dtvs dtvsVar = this.d;
                boolean di = di(0);
                boolean z = dtvsVar.b;
                String[] strArr = di ? z ? (String[]) dtub.C(null, dt(getString(cM(0, ScheduledSendTable.a))), new String[0]) : new String[]{i()} : null;
                dtsr.dz(length, strArr, new emyl() { // from class: coib
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "_id:".concat(String.valueOf(coih.this.getString(0)));
                    }
                });
                if (!di(1)) {
                    messageIdTypeArr = null;
                } else if (z) {
                    long[] ds = ds(getString(cM(1, ScheduledSendTable.a)));
                    int length2 = ds.length;
                    MessageIdType[] messageIdTypeArr2 = new MessageIdType[length2];
                    for (int i = 0; i < length2; i++) {
                        messageIdTypeArr2[i] = new MessageIdType(ds[i]);
                    }
                    messageIdTypeArr = (MessageIdType[]) dtub.C(null, messageIdTypeArr2, new MessageIdType[0]);
                } else {
                    messageIdTypeArr = new MessageIdType[]{e()};
                }
                dtsr.dz(length, messageIdTypeArr, new emyl() { // from class: coic
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "message_id:".concat(String.valueOf(coih.this.getString(1)));
                    }
                });
                if (!di(2)) {
                    conversationIdTypeArr = null;
                } else if (z) {
                    long[] ds2 = ds(getString(cM(2, ScheduledSendTable.a)));
                    int length3 = ds2.length;
                    ConversationIdType[] conversationIdTypeArr2 = new ConversationIdType[length3];
                    for (int i2 = 0; i2 < length3; i2++) {
                        conversationIdTypeArr2[i2] = new ConversationIdType(ds2[i2]);
                    }
                    conversationIdTypeArr = (ConversationIdType[]) dtub.C(null, conversationIdTypeArr2, new ConversationIdType[0]);
                } else {
                    conversationIdTypeArr = new ConversationIdType[]{c()};
                }
                dtsr.dz(length, conversationIdTypeArr, new emyl() { // from class: coid
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "conversation_id:".concat(String.valueOf(coih.this.getString(2)));
                    }
                });
                if (!di(3)) {
                    instantArr = null;
                } else if (z) {
                    long[] ds3 = ds(getString(cM(3, ScheduledSendTable.a)));
                    int length4 = ds3.length;
                    Instant[] instantArr3 = new Instant[length4];
                    for (int i3 = 0; i3 < length4; i3++) {
                        instantArr3[i3] = bdgw.b(ds3[i3]);
                    }
                    instantArr = (Instant[]) dtub.C(null, instantArr3, new Instant[0]);
                } else {
                    instantArr = new Instant[]{h()};
                }
                dtsr.dz(length, instantArr, new emyl() { // from class: coie
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "scheduled_time:".concat(String.valueOf(coih.this.getString(3)));
                    }
                });
                if (!di(4)) {
                    coiuVarArr = null;
                } else if (z) {
                    int[] dr = dr(getString(cM(4, ScheduledSendTable.a)));
                    coiu[] values = coiu.values();
                    int length5 = values.length;
                    coiu[] coiuVarArr2 = new coiu[dr.length];
                    for (int i4 = 0; i4 < dr.length; i4++) {
                        int i5 = dr[i4];
                        if (i5 >= length5) {
                            throw new IllegalStateException();
                        }
                        coiuVarArr2[i4] = values[i5];
                    }
                    coiuVarArr = (coiu[]) dtub.C(null, coiuVarArr2, new coiu[0]);
                } else {
                    coiuVarArr = new coiu[]{f()};
                }
                dtsr.dz(length, coiuVarArr, new emyl() { // from class: coif
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "status:".concat(String.valueOf(coih.this.getString(4)));
                    }
                });
                if (!di(5)) {
                    instantArr2 = null;
                } else if (z) {
                    long[] ds4 = ds(getString(cM(5, ScheduledSendTable.a)));
                    int length6 = ds4.length;
                    Instant[] instantArr4 = new Instant[length6];
                    for (int i6 = 0; i6 < length6; i6++) {
                        instantArr4[i6] = bdgw.b(ds4[i6]);
                    }
                    instantArr2 = (Instant[]) dtub.C(null, instantArr4, new Instant[0]);
                } else {
                    instantArr2 = new Instant[]{g()};
                }
                dtsr.dz(length, instantArr2, new emyl() { // from class: coig
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "creation_time:".concat(String.valueOf(coih.this.getString(5)));
                    }
                });
                engr engrVar = new engr();
                for (int i7 = 0; i7 < length; i7++) {
                    long j = dB[i7];
                    if (j > 0 && !hashSet.contains(Long.valueOf(j))) {
                        hashSet.add(Long.valueOf(dB[i7]));
                        cohi a = ScheduledSendTable.a();
                        a.aD();
                        long j2 = dB[i7];
                        if (strArr != null) {
                            a.e(strArr[i7]);
                        }
                        if (messageIdTypeArr != null) {
                            a.f(messageIdTypeArr[i7]);
                        }
                        if (conversationIdTypeArr != null) {
                            a.c(conversationIdTypeArr[i7]);
                        }
                        if (instantArr != null) {
                            a.g(instantArr[i7]);
                        }
                        if (coiuVarArr != null) {
                            a.h(coiuVarArr[i7]);
                        }
                        if (instantArr2 != null) {
                            a.d(instantArr2[i7]);
                        }
                        engrVar.h(a.a());
                    }
                }
                return engrVar.g();
            }
        }
        int i8 = engw.d;
        return enou.a;
    }

    public final Instant g() {
        return bdgw.b(getLong(cM(5, ScheduledSendTable.a)));
    }

    public final Instant h() {
        return bdgw.b(getLong(cM(3, ScheduledSendTable.a)));
    }

    public final String i() {
        return getString(cM(0, ScheduledSendTable.a));
    }

    @Override // defpackage.dtsu
    public final Cursor a() {
        return this;
    }
}
