package defpackage;

import android.database.Cursor;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class brxx extends dtsr implements brxt {
    @Deprecated
    public brxx(dtve dtveVar, Cursor cursor, String[] strArr, dtzj[] dtzjVarArr, dtyo dtyoVar, dtvs dtvsVar, bryd brydVar) {
        super(dtveVar, cursor, strArr, dtzjVarArr, bryh.a, dtyoVar, dtvsVar, brydVar);
    }

    @Override // defpackage.dtsr
    protected final /* synthetic */ dtro b() {
        return new brxh();
    }

    @Override // defpackage.brxt
    public final engw c() {
        engr engrVar = new engr();
        while (moveToNext()) {
            f();
            engrVar.h(f());
        }
        return engrVar.g();
    }

    public final long e() {
        return getLong(cM(0, bryh.a));
    }

    public final ConversationIdType f() {
        return new ConversationIdType(getLong(cM(1, bryh.a)));
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
        long[] B = di ? z ? dtub.B(null, ds(getString(cM(0, bryh.a)))) : new long[]{e()} : null;
        dtsr.dy(length, B, new emyl() { // from class: brxu
            @Override // defpackage.emyl
            public final Object get() {
                return "_id:".concat(String.valueOf(brxx.this.getString(0)));
            }
        });
        if (!di(1)) {
            conversationIdTypeArr = null;
        } else if (z) {
            long[] ds = ds(getString(cM(1, bryh.a)));
            int length2 = ds.length;
            ConversationIdType[] conversationIdTypeArr2 = new ConversationIdType[length2];
            for (int i2 = 0; i2 < length2; i2++) {
                conversationIdTypeArr2[i2] = new ConversationIdType(ds[i2]);
            }
            conversationIdTypeArr = (ConversationIdType[]) dtub.C(null, conversationIdTypeArr2, new ConversationIdType[0]);
        } else {
            conversationIdTypeArr = new ConversationIdType[]{f()};
        }
        dtsr.dz(length, conversationIdTypeArr, new emyl() { // from class: brxv
            @Override // defpackage.emyl
            public final Object get() {
                return "conversation_id:".concat(String.valueOf(brxx.this.getString(1)));
            }
        });
        boolean[] D = di(2) ? z ? dtub.D(null, du(getString(cM(2, bryh.a)))) : new boolean[]{g()} : null;
        dtsr.dA(length, D, new emyl() { // from class: brxw
            @Override // defpackage.emyl
            public final Object get() {
                return "pin_status:".concat(String.valueOf(brxx.this.getString(2)));
            }
        });
        engr engrVar = new engr();
        for (int i3 = 0; i3 < length; i3++) {
            long j = dB[i3];
            if (j > 0 && !hashSet.contains(Long.valueOf(j))) {
                hashSet.add(Long.valueOf(dB[i3]));
                String[] strArr = bryh.a;
                brxj brxjVar = new brxj();
                brxjVar.aF();
                brxjVar.aD();
                long j2 = dB[i3];
                if (B != null) {
                    long j3 = B[i3];
                    brxjVar.aE(0);
                    brxjVar.a = j3;
                }
                if (conversationIdTypeArr != null) {
                    brxjVar.b(conversationIdTypeArr[i3]);
                }
                if (D != null) {
                    brxjVar.c(D[i3]);
                }
                engrVar.h(brxjVar.a());
            }
        }
        return engrVar.g();
    }

    public final boolean g() {
        return getInt(cM(2, bryh.a)) == 1;
    }

    @Override // defpackage.dtsu
    public final Cursor a() {
        return this;
    }
}
