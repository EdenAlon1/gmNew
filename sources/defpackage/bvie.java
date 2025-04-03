package defpackage;

import android.database.Cursor;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bvie extends dtsr implements bvic {
    @Deprecated
    public bvie(dtve dtveVar, Cursor cursor, String[] strArr, dtzj[] dtzjVarArr, dtyo dtyoVar, dtvs dtvsVar, bvij bvijVar) {
        super(dtveVar, cursor, strArr, dtzjVarArr, bvin.a, dtyoVar, dtvsVar, bvijVar);
    }

    @Override // defpackage.dtsr
    protected final /* synthetic */ dtro b() {
        return new bvhu();
    }

    public final ConversationIdType c() {
        return new ConversationIdType(getLong(cM(0, bvin.a)));
    }

    @Override // defpackage.dtsr
    public final engw fI(dtvn dtvnVar) {
        dtyq dtyqVar = dtvnVar.a;
        long[] dB = dB(getString(dtvnVar.h + 1));
        int length = dB.length;
        if (length != 0) {
            if (length != 1 || dB[0] != -1) {
                HashSet hashSet = new HashSet();
                dtvs dtvsVar = this.d;
                ConversationIdType[] conversationIdTypeArr = null;
                if (di(0)) {
                    if (dtvsVar.b) {
                        long[] ds = ds(getString(cM(0, bvin.a)));
                        int length2 = ds.length;
                        ConversationIdType[] conversationIdTypeArr2 = new ConversationIdType[length2];
                        for (int i = 0; i < length2; i++) {
                            conversationIdTypeArr2[i] = new ConversationIdType(ds[i]);
                        }
                        conversationIdTypeArr = (ConversationIdType[]) dtub.C(null, conversationIdTypeArr2, new ConversationIdType[0]);
                    } else {
                        conversationIdTypeArr = new ConversationIdType[]{c()};
                    }
                }
                dtsr.dz(length, conversationIdTypeArr, new emyl() { // from class: bvid
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "conversation_id:".concat(String.valueOf(bvie.this.getString(0)));
                    }
                });
                engr engrVar = new engr();
                for (int i2 = 0; i2 < length; i2++) {
                    long j = dB[i2];
                    if (j > 0 && !hashSet.contains(Long.valueOf(j))) {
                        hashSet.add(Long.valueOf(dB[i2]));
                        String[] strArr = bvin.a;
                        bvhw bvhwVar = new bvhw();
                        bvhwVar.aF();
                        bvhwVar.aD();
                        long j2 = dB[i2];
                        if (conversationIdTypeArr != null) {
                            bvhwVar.b(conversationIdTypeArr[i2]);
                        }
                        engrVar.h(bvhwVar.a());
                    }
                }
                return engrVar.g();
            }
        }
        int i3 = engw.d;
        return enou.a;
    }

    @Override // defpackage.dtsu
    public final Cursor a() {
        return this;
    }
}
