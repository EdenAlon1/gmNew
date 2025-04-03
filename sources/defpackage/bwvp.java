package defpackage;

import android.database.Cursor;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import j$.util.Optional;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bwvp extends dtsr implements bwvi {
    @Deprecated
    public bwvp(dtve dtveVar, Cursor cursor, String[] strArr, dtzj[] dtzjVarArr, dtyo dtyoVar, dtvs dtvsVar, bwvs bwvsVar) {
        super(dtveVar, cursor, strArr, dtzjVarArr, bwvy.a, dtyoVar, dtvsVar, bwvsVar);
    }

    @Override // defpackage.dtsr
    protected final /* synthetic */ dtro b() {
        return new bwup();
    }

    public final long c() {
        return getLong(cM(2, bwvy.a));
    }

    public final long e() {
        return getLong(cM(4, bwvy.a));
    }

    public final long f() {
        return getLong(cM(3, bwvy.a));
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
                Optional[] optionalArr = null;
                String[] strArr = di ? z ? (String[]) dtub.C(null, dt(getString(cM(0, bwvy.a))), new String[0]) : new String[]{i()} : null;
                dtsr.dz(length, strArr, new emyl() { // from class: bwvj
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "_id:".concat(String.valueOf(bwvp.this.getString(0)));
                    }
                });
                if (!di(1)) {
                    messageIdTypeArr = null;
                } else if (z) {
                    long[] ds = ds(getString(cM(1, bwvy.a)));
                    int length2 = ds.length;
                    MessageIdType[] messageIdTypeArr2 = new MessageIdType[length2];
                    for (int i = 0; i < length2; i++) {
                        messageIdTypeArr2[i] = new MessageIdType(ds[i]);
                    }
                    messageIdTypeArr = (MessageIdType[]) dtub.C(null, messageIdTypeArr2, new MessageIdType[0]);
                } else {
                    messageIdTypeArr = new MessageIdType[]{g()};
                }
                dtsr.dz(length, messageIdTypeArr, new emyl() { // from class: bwvk
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "message_id:".concat(String.valueOf(bwvp.this.getString(1)));
                    }
                });
                long[] B = di(2) ? z ? dtub.B(null, ds(getString(cM(2, bwvy.a)))) : new long[]{c()} : null;
                dtsr.dy(length, B, new emyl() { // from class: bwvl
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "participant_id:".concat(String.valueOf(bwvp.this.getString(2)));
                    }
                });
                long[] B2 = di(3) ? z ? dtub.B(null, ds(getString(cM(3, bwvy.a)))) : new long[]{f()} : null;
                dtsr.dy(length, B2, new emyl() { // from class: bwvm
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "receive_time:".concat(String.valueOf(bwvp.this.getString(3)));
                    }
                });
                long[] B3 = di(4) ? z ? dtub.B(null, ds(getString(cM(4, bwvy.a)))) : new long[]{e()} : null;
                dtsr.dy(length, B3, new emyl() { // from class: bwvn
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "read_time:".concat(String.valueOf(bwvp.this.getString(4)));
                    }
                });
                if (di(5)) {
                    if (z) {
                        long[] ds2 = ds(getString(cM(5, bwvy.a)));
                        int length3 = ds2.length;
                        Optional[] optionalArr2 = new Optional[length3];
                        for (int i2 = 0; i2 < length3; i2++) {
                            optionalArr2[i2] = bdhe.b(ds2[i2]);
                        }
                        optionalArr = (Optional[]) dtub.C(null, optionalArr2, new Optional[0]);
                    } else {
                        optionalArr = new Optional[]{h()};
                    }
                }
                dtsr.dz(length, optionalArr, new emyl() { // from class: bwvo
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "ftd_time:".concat(String.valueOf(bwvp.this.getString(5)));
                    }
                });
                engr engrVar = new engr();
                for (int i3 = 0; i3 < length; i3++) {
                    long j = dB[i3];
                    if (j > 0 && !hashSet.contains(Long.valueOf(j))) {
                        hashSet.add(Long.valueOf(dB[i3]));
                        bwuq a = bwvy.a();
                        a.aD();
                        long j2 = dB[i3];
                        if (strArr != null) {
                            a.c(strArr[i3]);
                        }
                        if (messageIdTypeArr != null) {
                            a.d(messageIdTypeArr[i3]);
                        }
                        if (B != null) {
                            a.e(B[i3]);
                        }
                        if (B2 != null) {
                            a.g(B2[i3]);
                        }
                        if (B3 != null) {
                            a.f(B3[i3]);
                        }
                        if (optionalArr != null) {
                            a.b(optionalArr[i3]);
                        }
                        engrVar.h(a.a());
                    }
                }
                return engrVar.g();
            }
        }
        int i4 = engw.d;
        return enou.a;
    }

    public final MessageIdType g() {
        return new MessageIdType(getLong(cM(1, bwvy.a)));
    }

    public final Optional h() {
        return bdhe.b(getLong(cM(5, bwvy.a)));
    }

    public final String i() {
        return getString(cM(0, bwvy.a));
    }

    @Override // defpackage.dtsu
    public final Cursor a() {
        return this;
    }
}
