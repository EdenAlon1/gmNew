package defpackage;

import android.database.Cursor;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import j$.time.Duration;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class btfd extends dtsr implements btew {
    @Deprecated
    public btfd(dtve dtveVar, Cursor cursor, String[] strArr, dtzj[] dtzjVarArr, dtyo dtyoVar, dtvs dtvsVar, btfi btfiVar) {
        super(dtveVar, cursor, strArr, dtzjVarArr, btfo.a, dtyoVar, dtvsVar, btfiVar);
    }

    @Override // defpackage.dtsr
    protected final /* synthetic */ dtro b() {
        return new btee();
    }

    public final long c() {
        return getLong(cM(3, btfo.a));
    }

    public final long e() {
        return getLong(cM(0, btfo.a));
    }

    public final MessageIdType f() {
        return new MessageIdType(getLong(cM(1, btfo.a)));
    }

    @Override // defpackage.dtsr
    public final engw fI(dtvn dtvnVar) {
        MessageIdType[] messageIdTypeArr;
        byyx[] byyxVarArr;
        char c;
        boolean[] zArr;
        dtyq dtyqVar = dtvnVar.a;
        long[] dB = dB(getString(dtvnVar.h + 1));
        int length = dB.length;
        if (length != 0) {
            int i = 0;
            if (length != 1 || dB[0] != -1) {
                HashSet hashSet = new HashSet();
                dtvs dtvsVar = this.d;
                boolean di = di(0);
                boolean z = dtvsVar.b;
                Duration[] durationArr = null;
                long[] B = di ? z ? dtub.B(null, ds(getString(cM(0, btfo.a)))) : new long[]{e()} : null;
                dtsr.dy(length, B, new emyl() { // from class: btex
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "_id:".concat(String.valueOf(btfd.this.getString(0)));
                    }
                });
                if (!di(1)) {
                    messageIdTypeArr = null;
                } else if (z) {
                    long[] ds = ds(getString(cM(1, btfo.a)));
                    int length2 = ds.length;
                    MessageIdType[] messageIdTypeArr2 = new MessageIdType[length2];
                    for (int i2 = 0; i2 < length2; i2++) {
                        messageIdTypeArr2[i2] = new MessageIdType(ds[i2]);
                    }
                    messageIdTypeArr = (MessageIdType[]) dtub.C(null, messageIdTypeArr2, new MessageIdType[0]);
                } else {
                    messageIdTypeArr = new MessageIdType[]{f()};
                }
                dtsr.dz(length, messageIdTypeArr, new emyl() { // from class: btey
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "flagged_message_id:".concat(String.valueOf(btfd.this.getString(1)));
                    }
                });
                if (!di(2)) {
                    byyxVarArr = null;
                } else if (z) {
                    int[] dr = dr(getString(cM(2, btfo.a)));
                    byyx[] values = byyx.values();
                    int length3 = values.length;
                    byyx[] byyxVarArr2 = new byyx[dr.length];
                    for (int i3 = 0; i3 < dr.length; i3++) {
                        int i4 = dr[i3];
                        if (i4 >= length3) {
                            throw new IllegalStateException();
                        }
                        byyxVarArr2[i3] = values[i4];
                    }
                    byyxVarArr = (byyx[]) dtub.C(null, byyxVarArr2, new byyx[0]);
                } else {
                    byyxVarArr = new byyx[]{g()};
                }
                dtsr.dz(length, byyxVarArr, new emyl() { // from class: btez
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "flagging_reason:".concat(String.valueOf(btfd.this.getString(2)));
                    }
                });
                long[] B2 = di(3) ? z ? dtub.B(null, ds(getString(cM(3, btfo.a)))) : new long[]{c()} : null;
                dtsr.dy(length, B2, new emyl() { // from class: btfa
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "flagged_message_timestamp:".concat(String.valueOf(btfd.this.getString(3)));
                    }
                });
                char c2 = 4;
                boolean[] D = di(4) ? z ? dtub.D(null, du(getString(cM(4, btfo.a)))) : new boolean[]{i()} : null;
                dtsr.dA(length, D, new emyl() { // from class: btfb
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "flagged_message_notified:".concat(String.valueOf(btfd.this.getString(4)));
                    }
                });
                if (di(5)) {
                    if (z) {
                        long[] ds2 = ds(getString(cM(5, btfo.a)));
                        int length4 = ds2.length;
                        Duration[] durationArr2 = new Duration[length4];
                        for (int i5 = 0; i5 < length4; i5++) {
                            durationArr2[i5] = bdgu.b(ds2[i5]);
                        }
                        durationArr = (Duration[]) dtub.C(null, durationArr2, new Duration[0]);
                    } else {
                        durationArr = new Duration[]{h()};
                    }
                }
                dtsr.dz(length, durationArr, new emyl() { // from class: btfc
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "flagged_message_delay:".concat(String.valueOf(btfd.this.getString(5)));
                    }
                });
                engr engrVar = new engr();
                int i6 = 0;
                while (i6 < length) {
                    long j = dB[i6];
                    if (j <= 0 || hashSet.contains(Long.valueOf(j))) {
                        c = c2;
                        zArr = D;
                    } else {
                        hashSet.add(Long.valueOf(dB[i6]));
                        String[] strArr = btfo.a;
                        bteg btegVar = new bteg();
                        btegVar.aF();
                        btegVar.aD();
                        long j2 = dB[i6];
                        zArr = D;
                        if (B != null) {
                            long j3 = B[i6];
                            btegVar.aE(i);
                            btegVar.a = j3;
                        }
                        if (messageIdTypeArr != null) {
                            btegVar.c(messageIdTypeArr[i6]);
                        }
                        if (byyxVarArr != null) {
                            btegVar.e(byyxVarArr[i6]);
                        }
                        if (B2 != null) {
                            btegVar.d(B2[i6]);
                        }
                        if (zArr != null) {
                            boolean z2 = zArr[i6];
                            int i7 = btegVar.aB;
                            if (i7 < 46030) {
                                dtub.w("flagged_message_notified", i7);
                            }
                            c = 4;
                            btegVar.aE(4);
                            btegVar.e = z2;
                        } else {
                            c = 4;
                        }
                        if (durationArr != null) {
                            btegVar.b(durationArr[i6]);
                        }
                        engrVar.h(btegVar.a());
                    }
                    i6++;
                    c2 = c;
                    D = zArr;
                    i = 0;
                }
                return engrVar.g();
            }
        }
        int i8 = engw.d;
        return enou.a;
    }

    public final byyx g() {
        byyx[] values = byyx.values();
        int i = getInt(cM(2, btfo.a));
        if (i < values.length) {
            return values[i];
        }
        throw new IllegalArgumentException();
    }

    public final Duration h() {
        return bdgu.b(getLong(cM(5, btfo.a)));
    }

    public final boolean i() {
        return getInt(cM(4, btfo.a)) == 1;
    }

    @Override // defpackage.dtsu
    public final Cursor a() {
        return this;
    }
}
