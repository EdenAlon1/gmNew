package defpackage;

import android.database.Cursor;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bbvw extends dtsr implements bbvt {
    @Deprecated
    public bbvw(dtve dtveVar, Cursor cursor, String[] strArr, dtzj[] dtzjVarArr, dtyo dtyoVar, dtvs dtvsVar, bbwd bbwdVar) {
        super(dtveVar, cursor, strArr, dtzjVarArr, bbwh.a, dtyoVar, dtvsVar, bbwdVar);
    }

    @Override // defpackage.dtsr
    protected final /* synthetic */ dtro b() {
        return new bbvj();
    }

    public final long c() {
        return getLong(cM(0, bbwh.a));
    }

    public final MessageIdType e() {
        return new MessageIdType(getLong(cM(1, bbwh.a)));
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
        MessageIdType[] messageIdTypeArr = null;
        long[] B = di ? z ? dtub.B(null, ds(getString(cM(0, bbwh.a)))) : new long[]{c()} : null;
        dtsr.dy(length, B, new emyl() { // from class: bbvu
            @Override // defpackage.emyl
            public final Object get() {
                return "_id:".concat(String.valueOf(bbvw.this.getString(0)));
            }
        });
        if (di(1)) {
            if (z) {
                long[] ds = ds(getString(cM(1, bbwh.a)));
                int length2 = ds.length;
                MessageIdType[] messageIdTypeArr2 = new MessageIdType[length2];
                for (int i2 = 0; i2 < length2; i2++) {
                    messageIdTypeArr2[i2] = new MessageIdType(ds[i2]);
                }
                messageIdTypeArr = (MessageIdType[]) dtub.C(null, messageIdTypeArr2, new MessageIdType[0]);
            } else {
                messageIdTypeArr = new MessageIdType[]{e()};
            }
        }
        dtsr.dz(length, messageIdTypeArr, new emyl() { // from class: bbvv
            @Override // defpackage.emyl
            public final Object get() {
                return "message_id:".concat(String.valueOf(bbvw.this.getString(1)));
            }
        });
        engr engrVar = new engr();
        for (int i3 = 0; i3 < length; i3++) {
            long j = dB[i3];
            if (j > 0 && !hashSet.contains(Long.valueOf(j))) {
                hashSet.add(Long.valueOf(dB[i3]));
                String[] strArr = bbwh.a;
                bbvl bbvlVar = new bbvl();
                bbvlVar.aF();
                bbvlVar.aD();
                long j2 = dB[i3];
                if (B != null) {
                    long j3 = B[i3];
                    bbvlVar.aE(0);
                    bbvlVar.a = j3;
                }
                if (messageIdTypeArr != null) {
                    MessageIdType messageIdType = messageIdTypeArr[i3];
                    bbvlVar.aE(1);
                    bbvlVar.b = messageIdType;
                }
                bbvj bbvjVar = new bbvj();
                bbvjVar.aC(bbvlVar.aB());
                bbvjVar.a = bbvlVar.a;
                bbvjVar.b = bbvlVar.b;
                bbvjVar.cK = bbvlVar.aC();
                engrVar.h(bbvjVar);
            }
        }
        return engrVar.g();
    }

    @Override // defpackage.dtsu
    public final Cursor a() {
        return this;
    }
}
