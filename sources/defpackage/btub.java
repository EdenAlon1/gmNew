package defpackage;

import android.database.Cursor;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class btub extends dtsr implements btty {
    @Deprecated
    public btub(dtve dtveVar, Cursor cursor, String[] strArr, dtzj[] dtzjVarArr, dtyo dtyoVar, dtvs dtvsVar, btuh btuhVar) {
        super(dtveVar, cursor, strArr, dtzjVarArr, btul.a, dtyoVar, dtvsVar, btuhVar);
    }

    @Override // defpackage.dtsr
    protected final /* synthetic */ dtro b() {
        return new btto();
    }

    public final MessageIdType c() {
        return new MessageIdType(getLong(cM(0, btul.a)));
    }

    public final String e() {
        return getString(cM(1, btul.a));
    }

    @Override // defpackage.dtsr
    public final engw fI(dtvn dtvnVar) {
        MessageIdType[] messageIdTypeArr;
        dtyq dtyqVar = dtvnVar.a;
        long[] dB = dB(getString(dtvnVar.h + 1));
        int length = dB.length;
        if (length != 0) {
            if (length != 1 || dB[0] != -1) {
                HashSet hashSet = new HashSet();
                dtvs dtvsVar = this.d;
                boolean di = di(0);
                boolean z = dtvsVar.b;
                if (!di) {
                    messageIdTypeArr = null;
                } else if (z) {
                    long[] ds = ds(getString(cM(0, btul.a)));
                    int length2 = ds.length;
                    MessageIdType[] messageIdTypeArr2 = new MessageIdType[length2];
                    for (int i = 0; i < length2; i++) {
                        messageIdTypeArr2[i] = new MessageIdType(ds[i]);
                    }
                    messageIdTypeArr = (MessageIdType[]) dtub.C(null, messageIdTypeArr2, new MessageIdType[0]);
                } else {
                    messageIdTypeArr = new MessageIdType[]{c()};
                }
                dtsr.dz(length, messageIdTypeArr, new emyl() { // from class: bttz
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "message_id:".concat(String.valueOf(btub.this.getString(0)));
                    }
                });
                String[] strArr = di(1) ? z ? (String[]) dtub.C(null, dt(getString(cM(1, btul.a))), new String[0]) : new String[]{e()} : null;
                dtsr.dz(length, strArr, new emyl() { // from class: btua
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "caption:".concat(String.valueOf(btub.this.getString(1)));
                    }
                });
                engr engrVar = new engr();
                for (int i2 = 0; i2 < length; i2++) {
                    long j = dB[i2];
                    if (j > 0 && !hashSet.contains(Long.valueOf(j))) {
                        hashSet.add(Long.valueOf(dB[i2]));
                        String[] strArr2 = btul.a;
                        bttq bttqVar = new bttq();
                        bttqVar.aF();
                        bttqVar.aD();
                        long j2 = dB[i2];
                        if (messageIdTypeArr != null) {
                            bttqVar.c(messageIdTypeArr[i2]);
                        }
                        if (strArr != null) {
                            bttqVar.b(strArr[i2]);
                        }
                        engrVar.h(bttqVar.a());
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
