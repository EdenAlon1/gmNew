package defpackage;

import android.database.Cursor;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bxcg extends dtsr implements bxca {
    @Deprecated
    public bxcg(dtve dtveVar, Cursor cursor, String[] strArr, dtzj[] dtzjVarArr, dtyo dtyoVar, dtvs dtvsVar, bxcm bxcmVar) {
        super(dtveVar, cursor, strArr, dtzjVarArr, bxct.a, dtyoVar, dtvsVar, bxcmVar);
    }

    @Override // defpackage.dtsr
    protected final /* synthetic */ dtro b() {
        return new bxbj();
    }

    @Override // defpackage.bxca
    public final long c() {
        return getLong(cM(3, bxct.a));
    }

    @Override // defpackage.bxca
    public final MessageIdType e() {
        return new MessageIdType(getLong(cM(1, bxct.a)));
    }

    @Override // defpackage.bxca
    public final engw f() {
        engr engrVar = new engr();
        while (moveToNext()) {
            if (i() != null) {
                engrVar.h(i());
            }
        }
        return engrVar.g();
    }

    @Override // defpackage.dtsr
    public final engw fI(dtvn dtvnVar) {
        MessageIdType[] messageIdTypeArr;
        ConversationIdType[] conversationIdTypeArr;
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
        byzf[] byzfVarArr = null;
        String[] strArr = di ? z ? (String[]) dtub.C(null, dt(getString(cM(0, bxct.a))), new String[0]) : new String[]{i()} : null;
        dtsr.dz(length, strArr, new emyl() { // from class: bxcb
            @Override // defpackage.emyl
            public final Object get() {
                return "_id:".concat(String.valueOf(bxcg.this.getString(0)));
            }
        });
        if (!di(1)) {
            messageIdTypeArr = null;
        } else if (z) {
            long[] ds = ds(getString(cM(1, bxct.a)));
            int length2 = ds.length;
            MessageIdType[] messageIdTypeArr2 = new MessageIdType[length2];
            for (int i2 = 0; i2 < length2; i2++) {
                messageIdTypeArr2[i2] = new MessageIdType(ds[i2]);
            }
            messageIdTypeArr = (MessageIdType[]) dtub.C(null, messageIdTypeArr2, new MessageIdType[0]);
        } else {
            messageIdTypeArr = new MessageIdType[]{e()};
        }
        dtsr.dz(length, messageIdTypeArr, new emyl() { // from class: bxcc
            @Override // defpackage.emyl
            public final Object get() {
                return "message_id:".concat(String.valueOf(bxcg.this.getString(1)));
            }
        });
        if (!di(2)) {
            conversationIdTypeArr = null;
        } else if (z) {
            long[] ds2 = ds(getString(cM(2, bxct.a)));
            int length3 = ds2.length;
            ConversationIdType[] conversationIdTypeArr2 = new ConversationIdType[length3];
            for (int i3 = 0; i3 < length3; i3++) {
                conversationIdTypeArr2[i3] = new ConversationIdType(ds2[i3]);
            }
            conversationIdTypeArr = (ConversationIdType[]) dtub.C(null, conversationIdTypeArr2, new ConversationIdType[0]);
        } else {
            conversationIdTypeArr = new ConversationIdType[]{g()};
        }
        dtsr.dz(length, conversationIdTypeArr, new emyl() { // from class: bxcd
            @Override // defpackage.emyl
            public final Object get() {
                return "conversation_id:".concat(String.valueOf(bxcg.this.getString(2)));
            }
        });
        long[] B = di(3) ? z ? dtub.B(null, ds(getString(cM(3, bxct.a)))) : new long[]{c()} : null;
        dtsr.dy(length, B, new emyl() { // from class: bxce
            @Override // defpackage.emyl
            public final Object get() {
                return "trigger_time:".concat(String.valueOf(bxcg.this.getString(3)));
            }
        });
        if (di(4)) {
            if (z) {
                int[] dr = dr(getString(cM(4, bxct.a)));
                byzf[] values = byzf.values();
                int length4 = values.length;
                byzf[] byzfVarArr2 = new byzf[dr.length];
                for (int i4 = 0; i4 < dr.length; i4++) {
                    int i5 = dr[i4];
                    if (i5 >= length4) {
                        throw new IllegalStateException();
                    }
                    byzfVarArr2[i4] = values[i5];
                }
                byzfVarArr = (byzf[]) dtub.C(null, byzfVarArr2, new byzf[0]);
            } else {
                byzfVarArr = new byzf[]{h()};
            }
        }
        dtsr.dz(length, byzfVarArr, new emyl() { // from class: bxcf
            @Override // defpackage.emyl
            public final Object get() {
                return "status:".concat(String.valueOf(bxcg.this.getString(4)));
            }
        });
        engr engrVar = new engr();
        for (int i6 = 0; i6 < length; i6++) {
            long j = dB[i6];
            if (j > 0 && !hashSet.contains(Long.valueOf(j))) {
                hashSet.add(Long.valueOf(dB[i6]));
                String[] strArr2 = bxct.a;
                bxbl bxblVar = new bxbl();
                bxblVar.aF();
                bxblVar.aD();
                long j2 = dB[i6];
                if (strArr != null) {
                    String str = strArr[i6];
                    bxblVar.aE(0);
                    bxblVar.a = str;
                }
                if (messageIdTypeArr != null) {
                    bxblVar.c(messageIdTypeArr[i6]);
                }
                if (conversationIdTypeArr != null) {
                    bxblVar.b(conversationIdTypeArr[i6]);
                }
                if (B != null) {
                    bxblVar.d(B[i6]);
                }
                if (byzfVarArr != null) {
                    byzf byzfVar = byzfVarArr[i6];
                    bxblVar.aE(4);
                    bxblVar.e = byzfVar;
                }
                engrVar.h(bxblVar.a());
            }
        }
        return engrVar.g();
    }

    public final ConversationIdType g() {
        return new ConversationIdType(getLong(cM(2, bxct.a)));
    }

    public final byzf h() {
        byzf[] values = byzf.values();
        int i = getInt(cM(4, bxct.a));
        if (i < values.length) {
            return values[i];
        }
        throw new IllegalArgumentException();
    }

    public final String i() {
        return getString(cM(0, bxct.a));
    }

    @Override // defpackage.dtsu
    public final Cursor a() {
        return this;
    }
}
