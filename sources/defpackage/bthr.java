package defpackage;

import android.database.Cursor;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bthr extends dtsr implements btho {
    @Deprecated
    public bthr(dtve dtveVar, Cursor cursor, String[] strArr, dtzj[] dtzjVarArr, dtyo dtyoVar, dtvs dtvsVar, bthu bthuVar) {
        super(dtveVar, cursor, strArr, dtzjVarArr, bthy.a, dtyoVar, dtvsVar, bthuVar);
    }

    @Override // defpackage.dtsr
    protected final /* synthetic */ dtro b() {
        return new bthe();
    }

    public final ConversationIdType c() {
        return new ConversationIdType(getLong(cM(0, bthy.a)));
    }

    public final boolean e() {
        return getInt(cM(1, bthy.a)) == 1;
    }

    @Override // defpackage.dtsr
    public final engw fI(dtvn dtvnVar) {
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
        if (!di) {
            conversationIdTypeArr = null;
        } else if (z) {
            long[] ds = ds(getString(cM(0, bthy.a)));
            int length2 = ds.length;
            ConversationIdType[] conversationIdTypeArr2 = new ConversationIdType[length2];
            for (int i2 = 0; i2 < length2; i2++) {
                conversationIdTypeArr2[i2] = new ConversationIdType(ds[i2]);
            }
            conversationIdTypeArr = (ConversationIdType[]) dtub.C(null, conversationIdTypeArr2, new ConversationIdType[0]);
        } else {
            conversationIdTypeArr = new ConversationIdType[]{c()};
        }
        dtsr.dz(length, conversationIdTypeArr, new emyl() { // from class: bthp
            @Override // defpackage.emyl
            public final Object get() {
                return "conversation_id:".concat(String.valueOf(bthr.this.getString(0)));
            }
        });
        boolean[] D = di(1) ? z ? dtub.D(null, du(getString(cM(1, bthy.a)))) : new boolean[]{e()} : null;
        dtsr.dA(length, D, new emyl() { // from class: bthq
            @Override // defpackage.emyl
            public final Object get() {
                return "desired_gemini_state:".concat(String.valueOf(bthr.this.getString(1)));
            }
        });
        engr engrVar = new engr();
        for (int i3 = 0; i3 < length; i3++) {
            long j = dB[i3];
            if (j > 0 && !hashSet.contains(Long.valueOf(j))) {
                hashSet.add(Long.valueOf(dB[i3]));
                String[] strArr = bthy.a;
                bthg bthgVar = new bthg();
                bthgVar.aF();
                bthgVar.aD();
                long j2 = dB[i3];
                if (conversationIdTypeArr != null) {
                    ConversationIdType conversationIdType = conversationIdTypeArr[i3];
                    bthgVar.aE(0);
                    bthgVar.a = conversationIdType;
                }
                if (D != null) {
                    boolean z2 = D[i3];
                    bthgVar.aE(1);
                    bthgVar.b = z2;
                }
                bthe btheVar = new bthe();
                btheVar.aC(bthgVar.aB());
                btheVar.a = bthgVar.a;
                btheVar.b = bthgVar.b;
                btheVar.cK = bthgVar.aC();
                engrVar.h(btheVar);
            }
        }
        return engrVar.g();
    }

    @Override // defpackage.dtsu
    public final Cursor a() {
        return this;
    }
}
