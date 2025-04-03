package defpackage;

import android.database.Cursor;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bubs extends dtsr implements bubp {
    @Deprecated
    public bubs(dtve dtveVar, Cursor cursor, String[] strArr, dtzj[] dtzjVarArr, dtyo dtyoVar, dtvs dtvsVar, bubv bubvVar) {
        super(dtveVar, cursor, strArr, dtzjVarArr, bucb.a, dtyoVar, dtvsVar, bubvVar);
    }

    @Override // defpackage.dtsr
    protected final /* synthetic */ dtro b() {
        return new bubf();
    }

    public final MessageIdType c() {
        return new MessageIdType(getLong(cM(0, bucb.a)));
    }

    public final cjia e() {
        byte[] blob = getBlob(cM(1, bucb.a));
        if (blob == null) {
            return null;
        }
        try {
            return (cjia) eyfy.parseFrom(cjia.a, blob, eyfc.a());
        } catch (Throwable unused) {
            return cjia.a;
        }
    }

    @Override // defpackage.dtsr
    public final engw fI(dtvn dtvnVar) {
        MessageIdType[] messageIdTypeArr;
        cjia cjiaVar;
        dtyq dtyqVar = dtvnVar.a;
        long[] dB = dB(getString(dtvnVar.h + 1));
        int length = dB.length;
        if (length != 0) {
            if (length != 1 || dB[0] != -1) {
                HashSet hashSet = new HashSet();
                dtvs dtvsVar = this.d;
                boolean di = di(0);
                boolean z = dtvsVar.b;
                cjia[] cjiaVarArr = null;
                if (!di) {
                    messageIdTypeArr = null;
                } else if (z) {
                    long[] ds = ds(getString(cM(0, bucb.a)));
                    int length2 = ds.length;
                    MessageIdType[] messageIdTypeArr2 = new MessageIdType[length2];
                    for (int i = 0; i < length2; i++) {
                        messageIdTypeArr2[i] = new MessageIdType(ds[i]);
                    }
                    messageIdTypeArr = (MessageIdType[]) dtub.C(null, messageIdTypeArr2, new MessageIdType[0]);
                } else {
                    messageIdTypeArr = new MessageIdType[]{c()};
                }
                dtsr.dz(length, messageIdTypeArr, new emyl() { // from class: bubq
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "message_id:".concat(String.valueOf(bubs.this.getString(0)));
                    }
                });
                if (di(1)) {
                    if (z) {
                        List de = de(getString(cM(1, bucb.a)));
                        cjia[] cjiaVarArr2 = new cjia[de.size()];
                        Iterator it = de.iterator();
                        int i2 = 0;
                        while (it.hasNext()) {
                            try {
                                byte[] y = dtub.y((String) it.next());
                                int i3 = i2 + 1;
                                if (y == null) {
                                    cjiaVar = null;
                                } else {
                                    try {
                                        cjiaVar = (cjia) eyfy.parseFrom(cjia.a, y);
                                    } catch (Throwable unused) {
                                        i2 = i3;
                                        cjiaVarArr2[i2] = null;
                                        i2++;
                                    }
                                }
                                cjiaVarArr2[i2] = cjiaVar;
                                i2 = i3;
                            } catch (Throwable unused2) {
                            }
                        }
                        cjiaVarArr = (cjia[]) dtub.C(null, cjiaVarArr2, new cjia[0]);
                    } else {
                        cjiaVarArr = new cjia[]{e()};
                    }
                }
                dtsr.dz(length, cjiaVarArr, new emyl() { // from class: bubr
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "sharing_state:".concat(String.valueOf(bubs.this.getString(1)));
                    }
                });
                engr engrVar = new engr();
                for (int i4 = 0; i4 < length; i4++) {
                    long j = dB[i4];
                    if (j > 0 && !hashSet.contains(Long.valueOf(j))) {
                        hashSet.add(Long.valueOf(dB[i4]));
                        String[] strArr = bucb.a;
                        bubh bubhVar = new bubh();
                        bubhVar.aF();
                        bubhVar.aD();
                        long j2 = dB[i4];
                        if (messageIdTypeArr != null) {
                            bubhVar.b(messageIdTypeArr[i4]);
                        }
                        if (cjiaVarArr != null) {
                            bubhVar.c(cjiaVarArr[i4]);
                        }
                        engrVar.h(bubhVar.a());
                    }
                }
                return engrVar.g();
            }
        }
        int i5 = engw.d;
        return enou.a;
    }

    @Override // defpackage.dtsu
    public final Cursor a() {
        return this;
    }
}
