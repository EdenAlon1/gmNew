package defpackage;

import android.database.Cursor;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class bblc extends dtsr implements bbky {
    @Deprecated
    public bblc(dtve dtveVar, Cursor cursor, String[] strArr, dtzj[] dtzjVarArr, dtyo dtyoVar, dtvs dtvsVar, bblj bbljVar) {
        super(dtveVar, cursor, strArr, dtzjVarArr, bbln.a, dtyoVar, dtvsVar, bbljVar);
    }

    @Override // defpackage.dtsr
    protected final /* synthetic */ dtro b() {
        return new bbkm();
    }

    public final long c() {
        return getLong(cM(0, bbln.a));
    }

    public final ConversationIdType e() {
        return new ConversationIdType(getLong(cM(1, bbln.a)));
    }

    public final boolean f() {
        return getInt(cM(2, bbln.a)) == 1;
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
        long[] B = di ? z ? dtub.B(null, ds(getString(cM(0, bbln.a)))) : new long[]{c()} : null;
        dtsr.dy(length, B, new emyl() { // from class: bbkz
            @Override // defpackage.emyl
            public final Object get() {
                return "_id:".concat(String.valueOf(bblc.this.getString(0)));
            }
        });
        if (!di(1)) {
            conversationIdTypeArr = null;
        } else if (z) {
            long[] ds = ds(getString(cM(1, bbln.a)));
            int length2 = ds.length;
            ConversationIdType[] conversationIdTypeArr2 = new ConversationIdType[length2];
            for (int i2 = 0; i2 < length2; i2++) {
                conversationIdTypeArr2[i2] = new ConversationIdType(ds[i2]);
            }
            conversationIdTypeArr = (ConversationIdType[]) dtub.C(null, conversationIdTypeArr2, new ConversationIdType[0]);
        } else {
            conversationIdTypeArr = new ConversationIdType[]{e()};
        }
        dtsr.dz(length, conversationIdTypeArr, new emyl() { // from class: bbla
            @Override // defpackage.emyl
            public final Object get() {
                return "conversation_id:".concat(String.valueOf(bblc.this.getString(1)));
            }
        });
        boolean[] D = di(2) ? z ? dtub.D(null, du(getString(cM(2, bbln.a)))) : new boolean[]{f()} : null;
        dtsr.dA(length, D, new emyl() { // from class: bblb
            @Override // defpackage.emyl
            public final Object get() {
                return "pin_status:".concat(String.valueOf(bblc.this.getString(2)));
            }
        });
        engr engrVar = new engr();
        for (int i3 = 0; i3 < length; i3++) {
            long j = dB[i3];
            if (j > 0 && !hashSet.contains(Long.valueOf(j))) {
                hashSet.add(Long.valueOf(dB[i3]));
                String[] strArr = bbln.a;
                bbko bbkoVar = new bbko();
                bbkoVar.aF();
                bbkoVar.aD();
                long j2 = dB[i3];
                if (B != null) {
                    long j3 = B[i3];
                    bbkoVar.aE(0);
                    bbkoVar.a = j3;
                }
                if (conversationIdTypeArr != null) {
                    ConversationIdType conversationIdType = conversationIdTypeArr[i3];
                    bbkoVar.aE(1);
                    bbkoVar.b = conversationIdType;
                }
                if (D != null) {
                    boolean z2 = D[i3];
                    bbkoVar.aE(2);
                    bbkoVar.c = z2;
                }
                bbkm bbkmVar = new bbkm();
                bbkmVar.aC(bbkoVar.aB());
                bbkmVar.a = bbkoVar.a;
                bbkmVar.b = bbkoVar.b;
                bbkmVar.c = bbkoVar.c;
                bbkmVar.cK = bbkoVar.aC();
                engrVar.h(bbkmVar);
            }
        }
        return engrVar.g();
    }

    @Override // defpackage.dtsu
    public final Cursor a() {
        return this;
    }
}
