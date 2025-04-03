package defpackage;

import android.database.Cursor;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bvgx extends dtsr implements bvgp {
    @Deprecated
    public bvgx(dtve dtveVar, Cursor cursor, String[] strArr, dtzj[] dtzjVarArr, dtyo dtyoVar, dtvs dtvsVar, bvhc bvhcVar) {
        super(dtveVar, cursor, strArr, dtzjVarArr, bvhn.a, dtyoVar, dtvsVar, bvhcVar);
    }

    @Override // defpackage.dtsr
    protected final /* synthetic */ dtro b() {
        return new bvft();
    }

    @Override // defpackage.bvgp
    public final long c() {
        return getLong(cM(2, bvhn.a));
    }

    public final MessageIdType e() {
        return new MessageIdType(getLong(cM(1, bvhn.a)));
    }

    public final fbrd f() {
        return fbrd.b(getInt(cM(5, bvhn.a)));
    }

    @Override // defpackage.dtsr
    public final engw fI(dtvn dtvnVar) {
        MessageIdType[] messageIdTypeArr;
        fbxa[] fbxaVarArr;
        fbri[] fbriVarArr;
        fbrd[] fbrdVarArr;
        HashSet hashSet;
        fbxa fbxaVar;
        dtyq dtyqVar = dtvnVar.a;
        long[] dB = dB(getString(dtvnVar.h + 1));
        int length = dB.length;
        if (length != 0) {
            int i = 0;
            if (length != 1 || dB[0] != -1) {
                HashSet hashSet2 = new HashSet();
                dtvs dtvsVar = this.d;
                boolean di = di(0);
                boolean z = dtvsVar.b;
                fbre[] fbreVarArr = null;
                String[] strArr = di ? z ? (String[]) dtub.C(null, dt(getString(cM(0, bvhn.a))), new String[0]) : new String[]{j()} : null;
                dtsr.dz(length, strArr, new emyl() { // from class: bvgq
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "_id:".concat(String.valueOf(bvgx.this.getString(0)));
                    }
                });
                if (!di(1)) {
                    messageIdTypeArr = null;
                } else if (z) {
                    long[] ds = ds(getString(cM(1, bvhn.a)));
                    int length2 = ds.length;
                    MessageIdType[] messageIdTypeArr2 = new MessageIdType[length2];
                    for (int i2 = 0; i2 < length2; i2++) {
                        messageIdTypeArr2[i2] = new MessageIdType(ds[i2]);
                    }
                    messageIdTypeArr = (MessageIdType[]) dtub.C(null, messageIdTypeArr2, new MessageIdType[0]);
                } else {
                    messageIdTypeArr = new MessageIdType[]{e()};
                }
                dtsr.dz(length, messageIdTypeArr, new emyl() { // from class: bvgr
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "target_message_id:".concat(String.valueOf(bvgx.this.getString(1)));
                    }
                });
                long[] B = di(2) ? z ? dtub.B(null, ds(getString(cM(2, bvhn.a)))) : new long[]{c()} : null;
                dtsr.dy(length, B, new emyl() { // from class: bvgs
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "generated_timestamp:".concat(String.valueOf(bvgx.this.getString(2)));
                    }
                });
                if (!di(3)) {
                    fbxaVarArr = null;
                } else if (!z) {
                    fbxaVarArr = new fbxa[]{i()};
                } else {
                    if (isNull(cM(3, bvhn.a))) {
                        throw new IllegalStateException("found null in cursor for column suggestion");
                    }
                    List de = de(getString(cM(3, bvhn.a)));
                    fbxa[] fbxaVarArr2 = new fbxa[de.size()];
                    Iterator it = de.iterator();
                    int i3 = 0;
                    while (it.hasNext()) {
                        try {
                            byte[] y = dtub.y((String) it.next());
                            int i4 = i3 + 1;
                            if (y == null) {
                                fbxaVar = null;
                            } else {
                                try {
                                    fbxaVar = (fbxa) eyfy.parseFrom(fbxa.a, y);
                                } catch (Throwable unused) {
                                    i3 = i4;
                                    fbxaVarArr2[i3] = null;
                                    i3++;
                                }
                            }
                            fbxaVarArr2[i3] = fbxaVar;
                            i3 = i4;
                        } catch (Throwable unused2) {
                        }
                    }
                    fbxaVarArr = (fbxa[]) dtub.C(null, fbxaVarArr2, new fbxa[0]);
                }
                dtsr.dz(length, fbxaVarArr, new emyl() { // from class: bvgt
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "suggestion:".concat(String.valueOf(bvgx.this.getString(3)));
                    }
                });
                if (!di(4)) {
                    fbriVarArr = null;
                } else if (z) {
                    int[] dr = dr(getString(cM(4, bvhn.a)));
                    fbri[] fbriVarArr2 = new fbri[dr.length];
                    for (int i5 = 0; i5 < dr.length; i5++) {
                        fbri b = fbri.b(dr[i5]);
                        if (b == null) {
                            throw new IllegalStateException();
                        }
                        fbriVarArr2[i5] = b;
                    }
                    fbriVarArr = (fbri[]) dtub.C(null, fbriVarArr2, new fbri[0]);
                } else {
                    fbriVarArr = new fbri[]{h()};
                }
                dtsr.dz(length, fbriVarArr, new emyl() { // from class: bvgu
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "smart_suggestion_type:".concat(String.valueOf(bvgx.this.getString(4)));
                    }
                });
                if (!di(5)) {
                    fbrdVarArr = null;
                } else if (z) {
                    int[] dr2 = dr(getString(cM(5, bvhn.a)));
                    fbrd[] fbrdVarArr2 = new fbrd[dr2.length];
                    for (int i6 = 0; i6 < dr2.length; i6++) {
                        fbrd b2 = fbrd.b(dr2[i6]);
                        if (b2 == null) {
                            throw new IllegalStateException();
                        }
                        fbrdVarArr2[i6] = b2;
                    }
                    fbrdVarArr = (fbrd[]) dtub.C(null, fbrdVarArr2, new fbrd[0]);
                } else {
                    fbrdVarArr = new fbrd[]{f()};
                }
                dtsr.dz(length, fbrdVarArr, new emyl() { // from class: bvgv
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "suggestion_status:".concat(String.valueOf(bvgx.this.getString(5)));
                    }
                });
                if (di(6)) {
                    if (z) {
                        int[] dr3 = dr(getString(cM(6, bvhn.a)));
                        fbre[] fbreVarArr2 = new fbre[dr3.length];
                        for (int i7 = 0; i7 < dr3.length; i7++) {
                            fbre b3 = fbre.b(dr3[i7]);
                            if (b3 == null) {
                                throw new IllegalStateException();
                            }
                            fbreVarArr2[i7] = b3;
                        }
                        fbreVarArr = (fbre[]) dtub.C(null, fbreVarArr2, new fbre[0]);
                    } else {
                        fbreVarArr = new fbre[]{g()};
                    }
                }
                dtsr.dz(length, fbreVarArr, new emyl() { // from class: bvgw
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "consumption_state:".concat(String.valueOf(bvgx.this.getString(6)));
                    }
                });
                engr engrVar = new engr();
                int i8 = 0;
                while (i8 < length) {
                    long j = dB[i8];
                    if (j <= 0 || hashSet2.contains(Long.valueOf(j))) {
                        hashSet = hashSet2;
                    } else {
                        hashSet2.add(Long.valueOf(dB[i8]));
                        String[] strArr2 = bvhn.a;
                        bvfx bvfxVar = new bvfx();
                        bvfxVar.aF();
                        bvfxVar.aD();
                        long j2 = dB[i8];
                        if (strArr != null) {
                            String str = strArr[i8];
                            bvfxVar.aE(i);
                            bvfxVar.a = str;
                        }
                        if (messageIdTypeArr != null) {
                            bvfxVar.g(messageIdTypeArr[i8]);
                        }
                        hashSet = hashSet2;
                        if (B != null) {
                            bvfxVar.c(B[i8]);
                        }
                        if (fbxaVarArr != null) {
                            bvfxVar.e(fbxaVarArr[i8]);
                        }
                        if (fbriVarArr != null) {
                            bvfxVar.d(fbriVarArr[i8]);
                        }
                        if (fbrdVarArr != null) {
                            bvfxVar.f(fbrdVarArr[i8]);
                        }
                        if (fbreVarArr != null) {
                            fbre fbreVar = fbreVarArr[i8];
                            int i9 = bvfxVar.aB;
                            if (i9 < 53080) {
                                dtub.w("consumption_state", i9);
                            }
                            bvfxVar.aE(6);
                            bvfxVar.g = fbreVar;
                        }
                        engrVar.h(bvfxVar.a());
                    }
                    i8++;
                    hashSet2 = hashSet;
                    i = 0;
                }
                return engrVar.g();
            }
        }
        int i10 = engw.d;
        return enou.a;
    }

    public final fbre g() {
        return fbre.b(getInt(cM(6, bvhn.a)));
    }

    public final fbri h() {
        return fbri.b(getInt(cM(4, bvhn.a)));
    }

    public final fbxa i() {
        if (isNull(cM(3, bvhn.a))) {
            throw new IllegalStateException("found null in cursor for column suggestion");
        }
        byte[] blob = getBlob(cM(3, bvhn.a));
        if (blob == null) {
            return null;
        }
        try {
            return (fbxa) eyfy.parseFrom(fbxa.a, blob, eyfc.a());
        } catch (Throwable unused) {
            return fbxa.a;
        }
    }

    public final String j() {
        return getString(cM(0, bvhn.a));
    }

    @Override // defpackage.dtsu
    public final Cursor a() {
        return this;
    }
}
