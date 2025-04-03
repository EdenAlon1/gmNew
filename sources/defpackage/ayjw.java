package defpackage;

import android.database.Cursor;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ayjw extends dtsr implements ayjr {
    @Deprecated
    public ayjw(dtve dtveVar, Cursor cursor, String[] strArr, dtzj[] dtzjVarArr, dtyo dtyoVar, dtvs dtvsVar, aykc aykcVar) {
        super(dtveVar, cursor, strArr, dtzjVarArr, aykg.a, dtyoVar, dtvsVar, aykcVar);
    }

    @Override // defpackage.dtsr
    protected final /* synthetic */ dtro b() {
        return new ayjd();
    }

    @Override // defpackage.ayjr
    public final engw c() {
        engr engrVar = new engr();
        while (moveToNext()) {
            g();
            engrVar.h(g());
        }
        return engrVar.g();
    }

    public final long e() {
        return getLong(cM(0, aykg.a));
    }

    public final long f() {
        return getLong(cM(1, aykg.a));
    }

    @Override // defpackage.dtsr
    public final engw fI(dtvn dtvnVar) {
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
        ConversationIdType[] conversationIdTypeArr = null;
        long[] B = di ? z ? dtub.B(null, ds(getString(cM(0, aykg.a)))) : new long[]{e()} : null;
        dtsr.dy(length, B, new emyl() { // from class: ayjs
            @Override // defpackage.emyl
            public final Object get() {
                return "_id:".concat(String.valueOf(ayjw.this.getString(0)));
            }
        });
        long[] B2 = di(1) ? z ? dtub.B(null, ds(getString(cM(1, aykg.a)))) : new long[]{f()} : null;
        dtsr.dy(length, B2, new emyl() { // from class: ayjt
            @Override // defpackage.emyl
            public final Object get() {
                return "matcher_version:".concat(String.valueOf(ayjw.this.getString(1)));
            }
        });
        String[] strArr = di(2) ? z ? (String[]) dtub.C(null, dt(getString(cM(2, aykg.a))), new String[0]) : new String[]{h()} : null;
        dtsr.dz(length, strArr, new emyl() { // from class: ayju
            @Override // defpackage.emyl
            public final Object get() {
                return "destination_key:".concat(String.valueOf(ayjw.this.getString(2)));
            }
        });
        if (di(3)) {
            if (z) {
                long[] ds = ds(getString(cM(3, aykg.a)));
                int length2 = ds.length;
                ConversationIdType[] conversationIdTypeArr2 = new ConversationIdType[length2];
                for (int i2 = 0; i2 < length2; i2++) {
                    conversationIdTypeArr2[i2] = new ConversationIdType(ds[i2]);
                }
                conversationIdTypeArr = (ConversationIdType[]) dtub.C(null, conversationIdTypeArr2, new ConversationIdType[0]);
            } else {
                conversationIdTypeArr = new ConversationIdType[]{g()};
            }
        }
        dtsr.dz(length, conversationIdTypeArr, new emyl() { // from class: ayjv
            @Override // defpackage.emyl
            public final Object get() {
                return "conversation_id:".concat(String.valueOf(ayjw.this.getString(3)));
            }
        });
        engr engrVar = new engr();
        for (int i3 = 0; i3 < length; i3++) {
            long j = dB[i3];
            if (j > 0 && !hashSet.contains(Long.valueOf(j))) {
                hashSet.add(Long.valueOf(dB[i3]));
                String[] strArr2 = aykg.a;
                ayjf ayjfVar = new ayjf();
                ayjfVar.aF();
                ayjfVar.aD();
                long j2 = dB[i3];
                if (B != null) {
                    long j3 = B[i3];
                    ayjfVar.aE(0);
                    ayjfVar.a = j3;
                }
                if (B2 != null) {
                    ayjfVar.d(B2[i3]);
                }
                if (strArr != null) {
                    ayjfVar.c(strArr[i3]);
                }
                if (conversationIdTypeArr != null) {
                    ayjfVar.b(conversationIdTypeArr[i3]);
                }
                engrVar.h(ayjfVar.a());
            }
        }
        return engrVar.g();
    }

    public final ConversationIdType g() {
        return new ConversationIdType(getLong(cM(3, aykg.a)));
    }

    public final String h() {
        return getString(cM(2, aykg.a));
    }

    @Override // defpackage.dtsu
    public final Cursor a() {
        return this;
    }
}
