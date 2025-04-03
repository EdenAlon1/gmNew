package defpackage;

import android.database.Cursor;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bxqy extends dtsr implements bxqv {
    @Deprecated
    public bxqy(dtve dtveVar, Cursor cursor, String[] strArr, dtzj[] dtzjVarArr, dtyo dtyoVar, dtvs dtvsVar, bxrc bxrcVar) {
        super(dtveVar, cursor, strArr, dtzjVarArr, bxre.a, dtyoVar, dtvsVar, bxrcVar);
    }

    @Override // defpackage.dtsr
    protected final /* synthetic */ dtro b() {
        return new bxql();
    }

    public final MessageIdType c() {
        return new MessageIdType(getLong(cM(0, bxre.a)));
    }

    public final cnsy e() {
        return cnsy.b(getInt(cM(1, bxre.a)));
    }

    @Override // defpackage.dtsr
    public final engw fI(dtvn dtvnVar) {
        MessageIdType[] messageIdTypeArr;
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
        cnsy[] cnsyVarArr = null;
        if (!di) {
            messageIdTypeArr = null;
        } else if (z) {
            long[] ds = ds(getString(cM(0, bxre.a)));
            int length2 = ds.length;
            MessageIdType[] messageIdTypeArr2 = new MessageIdType[length2];
            for (int i2 = 0; i2 < length2; i2++) {
                messageIdTypeArr2[i2] = new MessageIdType(ds[i2]);
            }
            messageIdTypeArr = (MessageIdType[]) dtub.C(null, messageIdTypeArr2, new MessageIdType[0]);
        } else {
            messageIdTypeArr = new MessageIdType[]{c()};
        }
        dtsr.dz(length, messageIdTypeArr, new emyl() { // from class: bxqw
            @Override // defpackage.emyl
            public final Object get() {
                return "message_id:".concat(String.valueOf(bxqy.this.getString(0)));
            }
        });
        if (di(1)) {
            if (z) {
                int[] dr = dr(getString(cM(1, bxre.a)));
                cnsy[] cnsyVarArr2 = new cnsy[dr.length];
                for (int i3 = 0; i3 < dr.length; i3++) {
                    cnsy b = cnsy.b(dr[i3]);
                    if (b == null) {
                        throw new IllegalStateException();
                    }
                    cnsyVarArr2[i3] = b;
                }
                cnsyVarArr = (cnsy[]) dtub.C(null, cnsyVarArr2, new cnsy[0]);
            } else {
                cnsyVarArr = new cnsy[]{e()};
            }
        }
        dtsr.dz(length, cnsyVarArr, new emyl() { // from class: bxqx
            @Override // defpackage.emyl
            public final Object get() {
                return "help_state:".concat(String.valueOf(bxqy.this.getString(1)));
            }
        });
        engr engrVar = new engr();
        for (int i4 = 0; i4 < length; i4++) {
            long j = dB[i4];
            if (j > 0 && !hashSet.contains(Long.valueOf(j))) {
                hashSet.add(Long.valueOf(dB[i4]));
                String[] strArr = bxre.a;
                bxqn bxqnVar = new bxqn();
                bxqnVar.aF();
                bxqnVar.aD();
                long j2 = dB[i4];
                if (messageIdTypeArr != null) {
                    MessageIdType messageIdType = messageIdTypeArr[i4];
                    bxqnVar.aE(0);
                    bxqnVar.a = messageIdType;
                }
                if (cnsyVarArr != null) {
                    cnsy cnsyVar = cnsyVarArr[i4];
                    bxqnVar.aE(1);
                    bxqnVar.b = cnsyVar;
                }
                bxql bxqlVar = new bxql();
                bxqlVar.aC(bxqnVar.aB());
                bxqlVar.a = bxqnVar.a;
                bxqlVar.b = bxqnVar.b;
                bxqlVar.cK = bxqnVar.aC();
                engrVar.h(bxqlVar);
            }
        }
        return engrVar.g();
    }

    @Override // defpackage.dtsu
    public final Cursor a() {
        return this;
    }
}
