package defpackage;

import android.database.Cursor;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import java.util.HashSet;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cuih extends dtsr implements cuib {
    @Deprecated
    public cuih(dtve dtveVar, Cursor cursor, String[] strArr, dtzj[] dtzjVarArr, dtyo dtyoVar, dtvs dtvsVar, cuim cuimVar) {
        super(dtveVar, cursor, strArr, dtzjVarArr, cuiq.a, dtyoVar, dtvsVar, cuimVar);
    }

    @Override // defpackage.dtsr
    protected final /* synthetic */ dtro b() {
        return new cuhi();
    }

    public final long c() {
        return getLong(cM(4, cuiq.a));
    }

    public final ConversationIdType e() {
        return new ConversationIdType(getLong(cM(2, cuiq.a)));
    }

    public final MessageIdType f() {
        return new MessageIdType(getLong(cM(0, cuiq.a)));
    }

    @Override // defpackage.dtsr
    public final engw fI(dtvn dtvnVar) {
        MessageIdType[] messageIdTypeArr;
        ConversationIdType[] conversationIdTypeArr;
        dtyq dtyqVar = dtvnVar.a;
        long[] dB = dB(getString(dtvnVar.h + 1));
        int length = dB.length;
        if (length != 0) {
            if (length != 1 || dB[0] != -1) {
                HashSet hashSet = new HashSet();
                dtvs dtvsVar = this.d;
                boolean di = di(0);
                boolean z = dtvsVar.b;
                if (!di) {
                    messageIdTypeArr = null;
                } else if (z) {
                    long[] ds = ds(getString(cM(0, cuiq.a)));
                    int length2 = ds.length;
                    MessageIdType[] messageIdTypeArr2 = new MessageIdType[length2];
                    for (int i = 0; i < length2; i++) {
                        messageIdTypeArr2[i] = new MessageIdType(ds[i]);
                    }
                    messageIdTypeArr = (MessageIdType[]) dtub.C(null, messageIdTypeArr2, new MessageIdType[0]);
                } else {
                    messageIdTypeArr = new MessageIdType[]{f()};
                }
                dtsr.dz(length, messageIdTypeArr, new emyl() { // from class: cuic
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "message_id:".concat(String.valueOf(cuih.this.getString(0)));
                    }
                });
                String[] strArr = di(1) ? z ? (String[]) dtub.C(null, dt(getString(cM(1, cuiq.a))), new String[0]) : new String[]{h()} : null;
                dtsr.dz(length, strArr, new emyl() { // from class: cuid
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "message_logging_id:".concat(String.valueOf(cuih.this.getString(1)));
                    }
                });
                if (!di(2)) {
                    conversationIdTypeArr = null;
                } else if (z) {
                    long[] ds2 = ds(getString(cM(2, cuiq.a)));
                    int length3 = ds2.length;
                    ConversationIdType[] conversationIdTypeArr2 = new ConversationIdType[length3];
                    for (int i2 = 0; i2 < length3; i2++) {
                        conversationIdTypeArr2[i2] = new ConversationIdType(ds2[i2]);
                    }
                    conversationIdTypeArr = (ConversationIdType[]) dtub.C(null, conversationIdTypeArr2, new ConversationIdType[0]);
                } else {
                    conversationIdTypeArr = new ConversationIdType[]{e()};
                }
                dtsr.dz(length, conversationIdTypeArr, new emyl() { // from class: cuie
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "conversation_id:".concat(String.valueOf(cuih.this.getString(2)));
                    }
                });
                String[] strArr2 = di(3) ? z ? (String[]) dtub.C(null, dt(getString(cM(3, cuiq.a))), new String[0]) : new String[]{g()} : null;
                dtsr.dz(length, strArr2, new emyl() { // from class: cuif
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "conversation_logging_id:".concat(String.valueOf(cuih.this.getString(3)));
                    }
                });
                long[] B = di(4) ? z ? dtub.B(null, ds(getString(cM(4, cuiq.a)))) : new long[]{c()} : null;
                dtsr.dy(length, B, new emyl() { // from class: cuig
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "generation_timestamp:".concat(String.valueOf(cuih.this.getString(4)));
                    }
                });
                engr engrVar = new engr();
                for (int i3 = 0; i3 < length; i3++) {
                    long j = dB[i3];
                    if (j > 0 && !hashSet.contains(Long.valueOf(j))) {
                        hashSet.add(Long.valueOf(dB[i3]));
                        String[] strArr3 = cuiq.a;
                        cuhm cuhmVar = new cuhm();
                        cuhmVar.aF();
                        cuhmVar.aD();
                        long j2 = dB[i3];
                        if (messageIdTypeArr != null) {
                            cuhmVar.e(messageIdTypeArr[i3]);
                        }
                        if (strArr != null) {
                            cuhmVar.f(strArr[i3]);
                        }
                        if (conversationIdTypeArr != null) {
                            cuhmVar.b(conversationIdTypeArr[i3]);
                        }
                        if (strArr2 != null) {
                            cuhmVar.c(strArr2[i3]);
                        }
                        if (B != null) {
                            cuhmVar.d(B[i3]);
                        }
                        engrVar.h(cuhmVar.a(new Supplier() { // from class: cuhk
                            @Override // java.util.function.Supplier
                            public final Object get() {
                                return new cuhi();
                            }
                        }));
                    }
                }
                return engrVar.g();
            }
        }
        int i4 = engw.d;
        return enou.a;
    }

    public final String g() {
        return getString(cM(3, cuiq.a));
    }

    public final String h() {
        return getString(cM(1, cuiq.a));
    }

    @Override // defpackage.dtsu
    public final Cursor a() {
        return this;
    }
}
