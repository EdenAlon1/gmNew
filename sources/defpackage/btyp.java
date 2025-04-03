package defpackage;

import android.database.Cursor;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import j$.time.Instant;
import java.util.HashSet;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class btyp extends dtsr implements btyj {
    @Deprecated
    public btyp(dtve dtveVar, Cursor cursor, String[] strArr, dtzj[] dtzjVarArr, dtyo dtyoVar, dtvs dtvsVar, btyt btytVar) {
        super(dtveVar, cursor, strArr, dtzjVarArr, btza.a, dtyoVar, dtvsVar, btytVar);
    }

    @Override // defpackage.dtsr
    protected final /* synthetic */ dtro b() {
        return new btxq();
    }

    @Override // defpackage.btyj
    public final MessageIdType c() {
        return new MessageIdType(getLong(cM(1, btza.a)));
    }

    @Override // defpackage.btyj
    public final engw e() {
        engr engrVar = new engr();
        while (moveToNext()) {
            h();
            engrVar.h(h());
        }
        return engrVar.g();
    }

    @Override // defpackage.btyj
    public final Instant f() {
        return bdgw.b(getLong(cM(3, btza.a)));
    }

    @Override // defpackage.dtsr
    public final engw fI(dtvn dtvnVar) {
        MessageIdType[] messageIdTypeArr;
        MessageIdType[] messageIdTypeArr2;
        bdhg[] bdhgVarArr;
        Instant[] instantArr;
        dtyq dtyqVar = dtvnVar.a;
        long[] dB = dB(getString(dtvnVar.h + 1));
        int length = dB.length;
        if (length != 0) {
            if (length != 1 || dB[0] != -1) {
                HashSet hashSet = new HashSet();
                dtvs dtvsVar = this.d;
                boolean di = di(0);
                boolean z = dtvsVar.b;
                Instant[] instantArr2 = null;
                if (!di) {
                    messageIdTypeArr = null;
                } else if (z) {
                    long[] ds = ds(getString(cM(0, btza.a)));
                    int length2 = ds.length;
                    MessageIdType[] messageIdTypeArr3 = new MessageIdType[length2];
                    for (int i = 0; i < length2; i++) {
                        messageIdTypeArr3[i] = new MessageIdType(ds[i]);
                    }
                    messageIdTypeArr = (MessageIdType[]) dtub.C(null, messageIdTypeArr3, new MessageIdType[0]);
                } else {
                    messageIdTypeArr = new MessageIdType[]{h()};
                }
                dtsr.dz(length, messageIdTypeArr, new emyl() { // from class: btyk
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "message_id:".concat(String.valueOf(btyp.this.getString(0)));
                    }
                });
                if (!di(1)) {
                    messageIdTypeArr2 = null;
                } else if (z) {
                    long[] ds2 = ds(getString(cM(1, btza.a)));
                    int length3 = ds2.length;
                    MessageIdType[] messageIdTypeArr4 = new MessageIdType[length3];
                    for (int i2 = 0; i2 < length3; i2++) {
                        messageIdTypeArr4[i2] = new MessageIdType(ds2[i2]);
                    }
                    messageIdTypeArr2 = (MessageIdType[]) dtub.C(null, messageIdTypeArr4, new MessageIdType[0]);
                } else {
                    messageIdTypeArr2 = new MessageIdType[]{c()};
                }
                dtsr.dz(length, messageIdTypeArr2, new emyl() { // from class: btyl
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "latest_message_id:".concat(String.valueOf(btyp.this.getString(1)));
                    }
                });
                if (!di(2)) {
                    bdhgVarArr = null;
                } else if (z) {
                    String[] dt = dt(getString(cM(2, btza.a)));
                    int length4 = dt.length;
                    bdhg[] bdhgVarArr2 = new bdhg[length4];
                    for (int i3 = 0; i3 < length4; i3++) {
                        bdhgVarArr2[i3] = bdhg.a(dt[i3]);
                    }
                    bdhgVarArr = (bdhg[]) dtub.C(null, bdhgVarArr2, new bdhg[0]);
                } else {
                    bdhgVarArr = new bdhg[]{i()};
                }
                dtsr.dz(length, bdhgVarArr, new emyl() { // from class: btym
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "original_rcs_message_id:".concat(String.valueOf(btyp.this.getString(2)));
                    }
                });
                if (!di(3)) {
                    instantArr = null;
                } else if (z) {
                    long[] ds3 = ds(getString(cM(3, btza.a)));
                    int length5 = ds3.length;
                    Instant[] instantArr3 = new Instant[length5];
                    for (int i4 = 0; i4 < length5; i4++) {
                        instantArr3[i4] = bdgw.b(ds3[i4]);
                    }
                    instantArr = (Instant[]) dtub.C(null, instantArr3, new Instant[0]);
                } else {
                    instantArr = new Instant[]{f()};
                }
                dtsr.dz(length, instantArr, new emyl() { // from class: btyn
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "edited_at_timestamp_ms:".concat(String.valueOf(btyp.this.getString(3)));
                    }
                });
                if (di(4)) {
                    if (z) {
                        long[] ds4 = ds(getString(cM(4, btza.a)));
                        int length6 = ds4.length;
                        Instant[] instantArr4 = new Instant[length6];
                        for (int i5 = 0; i5 < length6; i5++) {
                            instantArr4[i5] = bdgw.b(ds4[i5]);
                        }
                        instantArr2 = (Instant[]) dtub.C(null, instantArr4, new Instant[0]);
                    } else {
                        instantArr2 = new Instant[]{g()};
                    }
                }
                dtsr.dz(length, instantArr2, new emyl() { // from class: btyo
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "received_at_timestamp_ms:".concat(String.valueOf(btyp.this.getString(4)));
                    }
                });
                engr engrVar = new engr();
                for (int i6 = 0; i6 < length; i6++) {
                    long j = dB[i6];
                    if (j > 0 && !hashSet.contains(Long.valueOf(j))) {
                        hashSet.add(Long.valueOf(dB[i6]));
                        String[] strArr = btza.a;
                        btxu btxuVar = new btxu();
                        btxuVar.aF();
                        btxuVar.aD();
                        long j2 = dB[i6];
                        if (messageIdTypeArr != null) {
                            btxuVar.e(messageIdTypeArr[i6]);
                        }
                        if (messageIdTypeArr2 != null) {
                            btxuVar.d(messageIdTypeArr2[i6]);
                        }
                        if (bdhgVarArr != null) {
                            btxuVar.f(bdhgVarArr[i6]);
                        }
                        if (instantArr != null) {
                            btxuVar.c(instantArr[i6]);
                        }
                        if (instantArr2 != null) {
                            btxuVar.g(instantArr2[i6]);
                        }
                        engrVar.h(btxuVar.a(new Supplier() { // from class: btxs
                            @Override // java.util.function.Supplier
                            public final Object get() {
                                return new btxq();
                            }
                        }));
                    }
                }
                return engrVar.g();
            }
        }
        int i7 = engw.d;
        return enou.a;
    }

    @Override // defpackage.btyj
    public final Instant g() {
        return bdgw.b(getLong(cM(4, btza.a)));
    }

    public final MessageIdType h() {
        return new MessageIdType(getLong(cM(0, btza.a)));
    }

    public final bdhg i() {
        return bdhg.a(getString(cM(2, btza.a)));
    }

    @Override // defpackage.dtsu
    public final Cursor a() {
        return this;
    }
}
