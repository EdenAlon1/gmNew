package defpackage;

import android.database.Cursor;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bspf extends dtsr implements bspc {
    @Deprecated
    public bspf(dtve dtveVar, Cursor cursor, String[] strArr, dtzj[] dtzjVarArr, dtyo dtyoVar, dtvs dtvsVar, bspj bspjVar) {
        super(dtveVar, cursor, strArr, dtzjVarArr, bspl.a, dtyoVar, dtvsVar, bspjVar);
    }

    @Override // defpackage.dtsr
    protected final /* synthetic */ dtro b() {
        return new bsos();
    }

    public final ConversationIdType c() {
        return new ConversationIdType(getLong(cM(0, bspl.a)));
    }

    public final String e() {
        return getString(cM(1, bspl.a));
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
            long[] ds = ds(getString(cM(0, bspl.a)));
            int length2 = ds.length;
            ConversationIdType[] conversationIdTypeArr2 = new ConversationIdType[length2];
            for (int i2 = 0; i2 < length2; i2++) {
                conversationIdTypeArr2[i2] = new ConversationIdType(ds[i2]);
            }
            conversationIdTypeArr = (ConversationIdType[]) dtub.C(null, conversationIdTypeArr2, new ConversationIdType[0]);
        } else {
            conversationIdTypeArr = new ConversationIdType[]{c()};
        }
        dtsr.dz(length, conversationIdTypeArr, new emyl() { // from class: bspd
            @Override // defpackage.emyl
            public final Object get() {
                return "conversation_id:".concat(String.valueOf(bspf.this.getString(0)));
            }
        });
        String[] strArr = di(1) ? z ? (String[]) dtub.C(null, dt(getString(cM(1, bspl.a))), new String[0]) : new String[]{e()} : null;
        dtsr.dz(length, strArr, new emyl() { // from class: bspe
            @Override // defpackage.emyl
            public final Object get() {
                return "rcs_group_id:".concat(String.valueOf(bspf.this.getString(1)));
            }
        });
        engr engrVar = new engr();
        for (int i3 = 0; i3 < length; i3++) {
            long j = dB[i3];
            if (j > 0 && !hashSet.contains(Long.valueOf(j))) {
                hashSet.add(Long.valueOf(dB[i3]));
                String[] strArr2 = bspl.a;
                bsou bsouVar = new bsou();
                bsouVar.aF();
                bsouVar.aD();
                long j2 = dB[i3];
                if (conversationIdTypeArr != null) {
                    ConversationIdType conversationIdType = conversationIdTypeArr[i3];
                    bsouVar.aE(0);
                    bsouVar.a = conversationIdType;
                }
                if (strArr != null) {
                    String str = strArr[i3];
                    bsouVar.aE(1);
                    bsouVar.b = str;
                }
                bsos bsosVar = new bsos();
                bsosVar.aC(bsouVar.aB());
                bsosVar.a = bsouVar.a;
                bsosVar.b = bsouVar.b;
                bsosVar.cK = bsouVar.aC();
                engrVar.h(bsosVar);
            }
        }
        return engrVar.g();
    }

    @Override // defpackage.dtsu
    public final Cursor a() {
        return this;
    }
}
