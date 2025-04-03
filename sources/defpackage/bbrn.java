package defpackage;

import android.database.Cursor;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bbrn extends dtsr implements bbrk {
    @Deprecated
    public bbrn(dtve dtveVar, Cursor cursor, String[] strArr, dtzj[] dtzjVarArr, dtyo dtyoVar, dtvs dtvsVar, bbrt bbrtVar) {
        super(dtveVar, cursor, strArr, dtzjVarArr, bbrx.a, dtyoVar, dtvsVar, bbrtVar);
    }

    @Override // defpackage.dtsr
    protected final /* synthetic */ dtro b() {
        return new bbra();
    }

    public final MessageIdType c() {
        return new MessageIdType(getLong(cM(0, bbrx.a)));
    }

    public final String e() {
        return getString(cM(1, bbrx.a));
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
        if (!di) {
            messageIdTypeArr = null;
        } else if (z) {
            long[] ds = ds(getString(cM(0, bbrx.a)));
            int length2 = ds.length;
            MessageIdType[] messageIdTypeArr2 = new MessageIdType[length2];
            for (int i2 = 0; i2 < length2; i2++) {
                messageIdTypeArr2[i2] = new MessageIdType(ds[i2]);
            }
            messageIdTypeArr = (MessageIdType[]) dtub.C(null, messageIdTypeArr2, new MessageIdType[0]);
        } else {
            messageIdTypeArr = new MessageIdType[]{c()};
        }
        dtsr.dz(length, messageIdTypeArr, new emyl() { // from class: bbrl
            @Override // defpackage.emyl
            public final Object get() {
                return "message_id:".concat(String.valueOf(bbrn.this.getString(0)));
            }
        });
        String[] strArr = di(1) ? z ? (String[]) dtub.C(null, dt(getString(cM(1, bbrx.a))), new String[0]) : new String[]{e()} : null;
        dtsr.dz(length, strArr, new emyl() { // from class: bbrm
            @Override // defpackage.emyl
            public final Object get() {
                return "caption:".concat(String.valueOf(bbrn.this.getString(1)));
            }
        });
        engr engrVar = new engr();
        for (int i3 = 0; i3 < length; i3++) {
            long j = dB[i3];
            if (j > 0 && !hashSet.contains(Long.valueOf(j))) {
                hashSet.add(Long.valueOf(dB[i3]));
                String[] strArr2 = bbrx.a;
                bbrc bbrcVar = new bbrc();
                bbrcVar.aF();
                bbrcVar.aD();
                long j2 = dB[i3];
                if (messageIdTypeArr != null) {
                    MessageIdType messageIdType = messageIdTypeArr[i3];
                    bbrcVar.aE(0);
                    bbrcVar.a = messageIdType;
                }
                if (strArr != null) {
                    String str = strArr[i3];
                    bbrcVar.aE(1);
                    bbrcVar.b = str;
                }
                bbra bbraVar = new bbra();
                bbraVar.aC(bbrcVar.aB());
                bbraVar.a = bbrcVar.a;
                bbraVar.b = bbrcVar.b;
                bbraVar.cK = bbrcVar.aC();
                engrVar.h(bbraVar);
            }
        }
        return engrVar.g();
    }

    @Override // defpackage.dtsu
    public final Cursor a() {
        return this;
    }
}
