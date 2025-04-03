package defpackage;

import android.database.Cursor;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bqcf extends dtsr implements bqcb {
    @Deprecated
    public bqcf(dtve dtveVar, Cursor cursor, String[] strArr, dtzj[] dtzjVarArr, dtyo dtyoVar, dtvs dtvsVar, bqcj bqcjVar) {
        super(dtveVar, cursor, strArr, dtzjVarArr, bqcp.a, dtyoVar, dtvsVar, bqcjVar);
    }

    @Override // defpackage.dtsr
    protected final /* synthetic */ dtro b() {
        return new bqbp();
    }

    public final int c() {
        return getInt(cM(2, bqcp.a));
    }

    public final long e() {
        return getLong(cM(0, bqcp.a));
    }

    public final ConversationIdType f() {
        return new ConversationIdType(getLong(cM(1, bqcp.a)));
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
        long[] B = di ? z ? dtub.B(null, ds(getString(cM(0, bqcp.a)))) : new long[]{e()} : null;
        dtsr.dy(length, B, new emyl() { // from class: bqcc
            @Override // defpackage.emyl
            public final Object get() {
                return "_id:".concat(String.valueOf(bqcf.this.getString(0)));
            }
        });
        if (!di(1)) {
            conversationIdTypeArr = null;
        } else if (z) {
            long[] ds = ds(getString(cM(1, bqcp.a)));
            int length2 = ds.length;
            ConversationIdType[] conversationIdTypeArr2 = new ConversationIdType[length2];
            for (int i2 = 0; i2 < length2; i2++) {
                conversationIdTypeArr2[i2] = new ConversationIdType(ds[i2]);
            }
            conversationIdTypeArr = (ConversationIdType[]) dtub.C(null, conversationIdTypeArr2, new ConversationIdType[0]);
        } else {
            conversationIdTypeArr = new ConversationIdType[]{f()};
        }
        dtsr.dz(length, conversationIdTypeArr, new emyl() { // from class: bqcd
            @Override // defpackage.emyl
            public final Object get() {
                return "conversation_id:".concat(String.valueOf(bqcf.this.getString(1)));
            }
        });
        int[] z2 = di(2) ? z ? dtub.z(null, dr(getString(cM(2, bqcp.a)))) : new int[]{c()} : null;
        dtsr.dx(length, z2, new emyl() { // from class: bqce
            @Override // defpackage.emyl
            public final Object get() {
                return "banner_status:".concat(String.valueOf(bqcf.this.getString(2)));
            }
        });
        engr engrVar = new engr();
        for (int i3 = 0; i3 < length; i3++) {
            long j = dB[i3];
            if (j > 0 && !hashSet.contains(Long.valueOf(j))) {
                hashSet.add(Long.valueOf(dB[i3]));
                String[] strArr = bqcp.a;
                bqbr bqbrVar = new bqbr();
                bqbrVar.aF();
                bqbrVar.aD();
                long j2 = dB[i3];
                if (B != null) {
                    long j3 = B[i3];
                    bqbrVar.aE(0);
                    bqbrVar.a = j3;
                }
                if (conversationIdTypeArr != null) {
                    bqbrVar.c(conversationIdTypeArr[i3]);
                }
                if (z2 != null) {
                    bqbrVar.b(z2[i3]);
                }
                engrVar.h(bqbrVar.a());
            }
        }
        return engrVar.g();
    }

    @Override // defpackage.dtsu
    public final Cursor a() {
        return this;
    }
}
