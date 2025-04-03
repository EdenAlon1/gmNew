package defpackage;

import android.database.Cursor;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class buko extends dtsr implements buka {
    @Deprecated
    public buko(dtve dtveVar, Cursor cursor, String[] strArr, dtzj[] dtzjVarArr, dtyo dtyoVar, dtvs dtvsVar, buku bukuVar) {
        super(dtveVar, cursor, strArr, dtzjVarArr, buld.a, dtyoVar, dtvsVar, bukuVar);
    }

    @Override // defpackage.dtsr
    protected final /* synthetic */ dtro b() {
        return new buit();
    }

    @Override // defpackage.buka
    public final engw c() {
        engr engrVar = new engr();
        while (moveToNext()) {
            m();
            engrVar.h(m());
        }
        return engrVar.g();
    }

    @Override // defpackage.buka
    public final engw e() {
        engr engrVar = new engr();
        while (moveToNext()) {
            i();
            engrVar.h(Integer.valueOf(i()));
        }
        return engrVar.g();
    }

    public final float f() {
        return getFloat(cM(4, buld.a));
    }

    @Override // defpackage.dtsr
    public final engw fI(dtvn dtvnVar) {
        MessageIdType[] messageIdTypeArr;
        ConversationIdType[] conversationIdTypeArr;
        erer[] ererVarArr;
        long[] jArr;
        erdy[] erdyVarArr;
        ConversationIdType[] conversationIdTypeArr2;
        fbcx[] fbcxVarArr;
        int[] iArr;
        fbcx[] fbcxVarArr2;
        eres[] eresVarArr;
        int[] iArr2;
        eres[] eresVarArr2;
        dtyq dtyqVar = dtvnVar.a;
        long[] dB = dB(getString(dtvnVar.h + 1));
        int length = dB.length;
        if (length != 0) {
            if (length != 1 || dB[0] != -1) {
                HashSet hashSet = new HashSet();
                dtvs dtvsVar = this.d;
                boolean di = di(0);
                boolean z = dtvsVar.b;
                long[] B = di ? z ? dtub.B(null, ds(getString(cM(0, buld.a)))) : new long[]{k()} : null;
                dtsr.dy(length, B, new emyl() { // from class: bukb
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "_id:".concat(String.valueOf(buko.this.getString(0)));
                    }
                });
                if (!di(1)) {
                    messageIdTypeArr = null;
                } else if (z) {
                    long[] ds = ds(getString(cM(1, buld.a)));
                    int length2 = ds.length;
                    MessageIdType[] messageIdTypeArr2 = new MessageIdType[length2];
                    for (int i = 0; i < length2; i++) {
                        messageIdTypeArr2[i] = new MessageIdType(ds[i]);
                    }
                    messageIdTypeArr = (MessageIdType[]) dtub.C(null, messageIdTypeArr2, new MessageIdType[0]);
                } else {
                    messageIdTypeArr = new MessageIdType[]{m()};
                }
                dtsr.dz(length, messageIdTypeArr, new emyl() { // from class: buki
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "message_id:".concat(String.valueOf(buko.this.getString(1)));
                    }
                });
                if (!di(2)) {
                    conversationIdTypeArr = null;
                } else if (z) {
                    long[] ds2 = ds(getString(cM(2, buld.a)));
                    int length3 = ds2.length;
                    ConversationIdType[] conversationIdTypeArr3 = new ConversationIdType[length3];
                    for (int i2 = 0; i2 < length3; i2++) {
                        conversationIdTypeArr3[i2] = new ConversationIdType(ds2[i2]);
                    }
                    conversationIdTypeArr = (ConversationIdType[]) dtub.C(null, conversationIdTypeArr3, new ConversationIdType[0]);
                } else {
                    conversationIdTypeArr = new ConversationIdType[]{l()};
                }
                dtsr.dz(length, conversationIdTypeArr, new emyl() { // from class: bukj
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "conversation_id:".concat(String.valueOf(buko.this.getString(2)));
                    }
                });
                int[] z2 = di(3) ? z ? dtub.z(null, dr(getString(cM(3, buld.a)))) : new int[]{i()} : null;
                dtsr.dx(length, z2, new emyl() { // from class: bukk
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "source:".concat(String.valueOf(buko.this.getString(3)));
                    }
                });
                float[] H = di(4) ? z ? dtub.H(dq(getString(cM(4, buld.a)))) : new float[]{f()} : null;
                dtsr.dw(length, H, new emyl() { // from class: bukl
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "score:".concat(String.valueOf(buko.this.getString(4)));
                    }
                });
                if (!di(5)) {
                    ererVarArr = null;
                } else if (z) {
                    int[] dr = dr(getString(cM(5, buld.a)));
                    erer[] ererVarArr2 = new erer[dr.length];
                    for (int i3 = 0; i3 < dr.length; i3++) {
                        erer b = erer.b(dr[i3]);
                        if (b == null) {
                            throw new IllegalStateException();
                        }
                        ererVarArr2[i3] = b;
                    }
                    ererVarArr = (erer[]) dtub.C(null, ererVarArr2, new erer[0]);
                } else {
                    ererVarArr = new erer[]{o()};
                }
                dtsr.dz(length, ererVarArr, new emyl() { // from class: bukm
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "outcome:".concat(String.valueOf(buko.this.getString(5)));
                    }
                });
                String[] strArr = di(6) ? z ? (String[]) dtub.C(null, dt(getString(cM(6, buld.a))), new String[0]) : new String[]{r()} : null;
                dtsr.dz(length, strArr, new emyl() { // from class: bukn
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "ares_initiated_by:".concat(String.valueOf(buko.this.getString(6)));
                    }
                });
                long[] B2 = di(7) ? z ? dtub.B(null, ds(getString(cM(7, buld.a)))) : new long[]{j()} : null;
                dtsr.dy(length, B2, new emyl() { // from class: bukc
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "classification_timestamp:".concat(String.valueOf(buko.this.getString(7)));
                    }
                });
                if (!di(8)) {
                    jArr = dB;
                    erdyVarArr = null;
                } else if (z) {
                    int[] dr2 = dr(getString(cM(8, buld.a)));
                    erdy[] erdyVarArr2 = new erdy[dr2.length];
                    jArr = dB;
                    for (int i4 = 0; i4 < dr2.length; i4++) {
                        erdy b2 = erdy.b(dr2[i4]);
                        if (b2 == null) {
                            throw new IllegalStateException();
                        }
                        erdyVarArr2[i4] = b2;
                    }
                    erdyVarArr = (erdy[]) dtub.C(null, erdyVarArr2, new erdy[0]);
                } else {
                    jArr = dB;
                    erdyVarArr = new erdy[]{n()};
                }
                dtsr.dz(length, erdyVarArr, new emyl() { // from class: bukd
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "trigger:".concat(String.valueOf(buko.this.getString(8)));
                    }
                });
                if (!di(9)) {
                    conversationIdTypeArr2 = conversationIdTypeArr;
                    fbcxVarArr = null;
                } else if (z) {
                    int[] dr3 = dr(getString(cM(9, buld.a)));
                    fbcx[] fbcxVarArr3 = new fbcx[dr3.length];
                    conversationIdTypeArr2 = conversationIdTypeArr;
                    for (int i5 = 0; i5 < dr3.length; i5++) {
                        fbcx b3 = fbcx.b(dr3[i5]);
                        if (b3 == null) {
                            throw new IllegalStateException();
                        }
                        fbcxVarArr3[i5] = b3;
                    }
                    fbcxVarArr = (fbcx[]) dtub.C(null, fbcxVarArr3, new fbcx[0]);
                } else {
                    conversationIdTypeArr2 = conversationIdTypeArr;
                    fbcxVarArr = new fbcx[]{q()};
                }
                dtsr.dz(length, fbcxVarArr, new emyl() { // from class: buke
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "action_type:".concat(String.valueOf(buko.this.getString(9)));
                    }
                });
                int[] z3 = di(10) ? z ? dtub.z(null, dr(getString(cM(10, buld.a)))) : new int[]{g()} : null;
                dtsr.dx(length, z3, new emyl() { // from class: bukf
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "action_contributors:".concat(String.valueOf(buko.this.getString(10)));
                    }
                });
                if (!di(11)) {
                    iArr = z3;
                    fbcxVarArr2 = fbcxVarArr;
                    eresVarArr = null;
                } else if (z) {
                    int[] dr4 = dr(getString(cM(11, buld.a)));
                    eres[] eresVarArr3 = new eres[dr4.length];
                    iArr = z3;
                    fbcxVarArr2 = fbcxVarArr;
                    for (int i6 = 0; i6 < dr4.length; i6++) {
                        eres b4 = eres.b(dr4[i6]);
                        if (b4 == null) {
                            throw new IllegalStateException();
                        }
                        eresVarArr3[i6] = b4;
                    }
                    eresVarArr = (eres[]) dtub.C(null, eresVarArr3, new eres[0]);
                } else {
                    iArr = z3;
                    fbcxVarArr2 = fbcxVarArr;
                    eresVarArr = new eres[]{p()};
                }
                dtsr.dz(length, eresVarArr, new emyl() { // from class: bukg
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "error_code:".concat(String.valueOf(buko.this.getString(11)));
                    }
                });
                int[] z4 = di(12) ? z ? dtub.z(null, dr(getString(cM(12, buld.a)))) : new int[]{h()} : null;
                dtsr.dx(length, z4, new emyl() { // from class: bukh
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "reclassification_index:".concat(String.valueOf(buko.this.getString(12)));
                    }
                });
                engr engrVar = new engr();
                int i7 = 0;
                while (i7 < length) {
                    long j = jArr[i7];
                    if (j <= 0 || hashSet.contains(Long.valueOf(j))) {
                        iArr2 = z4;
                        eresVarArr2 = eresVarArr;
                    } else {
                        hashSet.add(Long.valueOf(jArr[i7]));
                        String[] strArr2 = buld.a;
                        buiv buivVar = new buiv();
                        buivVar.aF();
                        buivVar.aD();
                        long j2 = jArr[i7];
                        iArr2 = z4;
                        if (B != null) {
                            long j3 = B[i7];
                            eresVarArr2 = eresVarArr;
                            buivVar.aE(0);
                            buivVar.a = j3;
                        } else {
                            eresVarArr2 = eresVarArr;
                        }
                        if (messageIdTypeArr != null) {
                            buivVar.h(messageIdTypeArr[i7]);
                        }
                        if (conversationIdTypeArr2 != null) {
                            buivVar.f(conversationIdTypeArr2[i7]);
                        }
                        if (z2 != null) {
                            buivVar.l(z2[i7]);
                        }
                        if (H != null) {
                            buivVar.k(H[i7]);
                        }
                        if (ererVarArr != null) {
                            buivVar.i(ererVarArr[i7]);
                        }
                        if (strArr != null) {
                            buivVar.d(strArr[i7]);
                        }
                        if (B2 != null) {
                            buivVar.e(B2[i7]);
                        }
                        if (erdyVarArr != null) {
                            buivVar.m(erdyVarArr[i7]);
                        }
                        if (fbcxVarArr2 != null) {
                            buivVar.c(fbcxVarArr2[i7]);
                        }
                        if (iArr != null) {
                            buivVar.b(iArr[i7]);
                        }
                        if (eresVarArr2 != null) {
                            buivVar.g(eresVarArr2[i7]);
                        }
                        if (iArr2 != null) {
                            buivVar.j(iArr2[i7]);
                        }
                        engrVar.h(buivVar.a());
                    }
                    i7++;
                    z4 = iArr2;
                    eresVarArr = eresVarArr2;
                }
                return engrVar.g();
            }
        }
        int i8 = engw.d;
        return enou.a;
    }

    public final int g() {
        return getInt(cM(10, buld.a));
    }

    public final int h() {
        return getInt(cM(12, buld.a));
    }

    public final int i() {
        return getInt(cM(3, buld.a));
    }

    public final long j() {
        return getLong(cM(7, buld.a));
    }

    public final long k() {
        return getLong(cM(0, buld.a));
    }

    public final ConversationIdType l() {
        return new ConversationIdType(getLong(cM(2, buld.a)));
    }

    public final MessageIdType m() {
        return new MessageIdType(getLong(cM(1, buld.a)));
    }

    public final erdy n() {
        return erdy.b(getInt(cM(8, buld.a)));
    }

    public final erer o() {
        return erer.b(getInt(cM(5, buld.a)));
    }

    public final eres p() {
        return eres.b(getInt(cM(11, buld.a)));
    }

    public final fbcx q() {
        return fbcx.b(getInt(cM(9, buld.a)));
    }

    public final String r() {
        return getString(cM(6, buld.a));
    }

    @Override // defpackage.dtsu
    public final Cursor a() {
        return this;
    }
}
