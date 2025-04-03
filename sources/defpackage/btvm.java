package defpackage;

import android.database.Cursor;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class btvm extends dtsr implements btvh {
    @Deprecated
    public btvm(dtve dtveVar, Cursor cursor, String[] strArr, dtzj[] dtzjVarArr, dtyo dtyoVar, dtvs dtvsVar, btvr btvrVar) {
        super(dtveVar, cursor, strArr, dtzjVarArr, btvy.a, dtyoVar, dtvsVar, btvrVar);
    }

    @Override // defpackage.dtsr
    protected final /* synthetic */ dtro b() {
        return new btut();
    }

    public final long c() {
        return getLong(cM(0, btvy.a));
    }

    public final MessageIdType e() {
        return new MessageIdType(getLong(cM(1, btvy.a)));
    }

    public final fbrc f() {
        return fbrc.b(getInt(cM(2, btvy.a)));
    }

    @Override // defpackage.dtsr
    public final engw fI(dtvn dtvnVar) {
        MessageIdType[] messageIdTypeArr;
        fbrc[] fbrcVarArr;
        fbwv fbwvVar;
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
        fbwv[] fbwvVarArr = null;
        long[] B = di ? z ? dtub.B(null, ds(getString(cM(0, btvy.a)))) : new long[]{c()} : null;
        dtsr.dy(length, B, new emyl() { // from class: btvi
            @Override // defpackage.emyl
            public final Object get() {
                return "_id:".concat(String.valueOf(btvm.this.getString(0)));
            }
        });
        if (!di(1)) {
            messageIdTypeArr = null;
        } else if (z) {
            long[] ds = ds(getString(cM(1, btvy.a)));
            int length2 = ds.length;
            MessageIdType[] messageIdTypeArr2 = new MessageIdType[length2];
            for (int i2 = 0; i2 < length2; i2++) {
                messageIdTypeArr2[i2] = new MessageIdType(ds[i2]);
            }
            messageIdTypeArr = (MessageIdType[]) dtub.C(null, messageIdTypeArr2, new MessageIdType[0]);
        } else {
            messageIdTypeArr = new MessageIdType[]{e()};
        }
        dtsr.dz(length, messageIdTypeArr, new emyl() { // from class: btvj
            @Override // defpackage.emyl
            public final Object get() {
                return "message_id:".concat(String.valueOf(btvm.this.getString(1)));
            }
        });
        if (!di(2)) {
            fbrcVarArr = null;
        } else if (z) {
            int[] dr = dr(getString(cM(2, btvy.a)));
            fbrc[] fbrcVarArr2 = new fbrc[dr.length];
            for (int i3 = 0; i3 < dr.length; i3++) {
                fbrc b = fbrc.b(dr[i3]);
                if (b == null) {
                    throw new IllegalStateException();
                }
                fbrcVarArr2[i3] = b;
            }
            fbrcVarArr = (fbrc[]) dtub.C(null, fbrcVarArr2, new fbrc[0]);
        } else {
            fbrcVarArr = new fbrc[]{f()};
        }
        dtsr.dz(length, fbrcVarArr, new emyl() { // from class: btvk
            @Override // defpackage.emyl
            public final Object get() {
                return "classification_type:".concat(String.valueOf(btvm.this.getString(2)));
            }
        });
        if (di(3)) {
            if (!z) {
                fbwvVarArr = new fbwv[]{g()};
            } else {
                if (isNull(cM(3, btvy.a))) {
                    throw new IllegalStateException("found null in cursor for column classification_details");
                }
                List de = de(getString(cM(3, btvy.a)));
                fbwv[] fbwvVarArr2 = new fbwv[de.size()];
                Iterator it = de.iterator();
                int i4 = 0;
                while (it.hasNext()) {
                    try {
                        byte[] y = dtub.y((String) it.next());
                        int i5 = i4 + 1;
                        if (y == null) {
                            fbwvVar = null;
                        } else {
                            try {
                                fbwvVar = (fbwv) eyfy.parseFrom(fbwv.a, y);
                            } catch (Throwable unused) {
                                i4 = i5;
                                fbwvVarArr2[i4] = null;
                                i4++;
                            }
                        }
                        fbwvVarArr2[i4] = fbwvVar;
                        i4 = i5;
                    } catch (Throwable unused2) {
                    }
                }
                fbwvVarArr = (fbwv[]) dtub.C(null, fbwvVarArr2, new fbwv[0]);
            }
        }
        dtsr.dz(length, fbwvVarArr, new emyl() { // from class: btvl
            @Override // defpackage.emyl
            public final Object get() {
                return "classification_details:".concat(String.valueOf(btvm.this.getString(3)));
            }
        });
        engr engrVar = new engr();
        for (int i6 = 0; i6 < length; i6++) {
            long j = dB[i6];
            if (j > 0 && !hashSet.contains(Long.valueOf(j))) {
                hashSet.add(Long.valueOf(dB[i6]));
                String[] strArr = btvy.a;
                btuv btuvVar = new btuv();
                btuvVar.aF();
                btuvVar.aD();
                long j2 = dB[i6];
                if (B != null) {
                    long j3 = B[i6];
                    btuvVar.aE(0);
                    btuvVar.a = j3;
                }
                if (messageIdTypeArr != null) {
                    btuvVar.d(messageIdTypeArr[i6]);
                }
                if (fbrcVarArr != null) {
                    btuvVar.c(fbrcVarArr[i6]);
                }
                if (fbwvVarArr != null) {
                    btuvVar.b(fbwvVarArr[i6]);
                }
                engrVar.h(btuvVar.a());
            }
        }
        return engrVar.g();
    }

    public final fbwv g() {
        if (isNull(cM(3, btvy.a))) {
            throw new IllegalStateException("found null in cursor for column classification_details");
        }
        byte[] blob = getBlob(cM(3, btvy.a));
        if (blob == null) {
            return null;
        }
        try {
            return (fbwv) eyfy.parseFrom(fbwv.a, blob, eyfc.a());
        } catch (Throwable unused) {
            return fbwv.a;
        }
    }

    @Override // defpackage.dtsu
    public final Cursor a() {
        return this;
    }
}
