package defpackage;

import android.database.Cursor;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bsaa extends dtsr implements brzp {
    @Deprecated
    public bsaa(dtve dtveVar, Cursor cursor, String[] strArr, dtzj[] dtzjVarArr, dtyo dtyoVar, dtvs dtvsVar, bsag bsagVar) {
        super(dtveVar, cursor, strArr, dtzjVarArr, bsam.a, dtyoVar, dtvsVar, bsagVar);
    }

    @Override // defpackage.dtsr
    protected final /* synthetic */ dtro b() {
        return new bryp();
    }

    public final int c() {
        return getInt(cM(2, bsam.a));
    }

    public final long e() {
        return getLong(cM(0, bsam.a));
    }

    public final long f() {
        return getLong(cM(9, bsam.a));
    }

    @Override // defpackage.dtsr
    public final engw fI(dtvn dtvnVar) {
        MessageIdType[] messageIdTypeArr;
        bdhg[] bdhgVarArr;
        bdhg[] bdhgVarArr2;
        long[] jArr;
        bdhg[] bdhgVarArr3;
        int i;
        dtyq dtyqVar = dtvnVar.a;
        long[] dB = dB(getString(dtvnVar.h + 1));
        int length = dB.length;
        if (length != 0) {
            if (length != 1 || dB[0] != -1) {
                HashSet hashSet = new HashSet();
                dtvs dtvsVar = this.d;
                boolean di = di(0);
                boolean z = dtvsVar.b;
                long[] B = di ? z ? dtub.B(null, ds(getString(cM(0, bsam.a)))) : new long[]{e()} : null;
                dtsr.dy(length, B, new emyl() { // from class: brzq
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "_id:".concat(String.valueOf(bsaa.this.getString(0)));
                    }
                });
                if (!di(1)) {
                    messageIdTypeArr = null;
                } else if (z) {
                    long[] ds = ds(getString(cM(1, bsam.a)));
                    int length2 = ds.length;
                    MessageIdType[] messageIdTypeArr2 = new MessageIdType[length2];
                    for (int i2 = 0; i2 < length2; i2++) {
                        messageIdTypeArr2[i2] = new MessageIdType(ds[i2]);
                    }
                    messageIdTypeArr = (MessageIdType[]) dtub.C(null, messageIdTypeArr2, new MessageIdType[0]);
                } else {
                    messageIdTypeArr = new MessageIdType[]{g()};
                }
                dtsr.dz(length, messageIdTypeArr, new emyl() { // from class: brzr
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "message_id:".concat(String.valueOf(bsaa.this.getString(1)));
                    }
                });
                int[] z2 = di(2) ? z ? dtub.z(null, dr(getString(cM(2, bsam.a)))) : new int[]{c()} : null;
                dtsr.dx(length, z2, new emyl() { // from class: brzs
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "conversation_suggestion_type:".concat(String.valueOf(bsaa.this.getString(2)));
                    }
                });
                String[] strArr = di(3) ? z ? (String[]) dtub.C(null, dt(getString(cM(3, bsam.a))), new String[0]) : new String[]{l()} : null;
                dtsr.dz(length, strArr, new emyl() { // from class: brzt
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "properties:".concat(String.valueOf(bsaa.this.getString(3)));
                    }
                });
                String[] strArr2 = di(4) ? z ? (String[]) dtub.C(null, dt(getString(cM(4, bsam.a))), new String[0]) : new String[]{j()} : null;
                dtsr.dz(length, strArr2, new emyl() { // from class: brzu
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "post_back_data:".concat(String.valueOf(bsaa.this.getString(4)));
                    }
                });
                String[] strArr3 = di(5) ? z ? (String[]) dtub.C(null, dt(getString(cM(5, bsam.a))), new String[0]) : new String[]{k()} : null;
                dtsr.dz(length, strArr3, new emyl() { // from class: brzv
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "post_back_encoding:".concat(String.valueOf(bsaa.this.getString(5)));
                    }
                });
                if (!di(6)) {
                    bdhgVarArr = null;
                } else if (z) {
                    String[] dt = dt(getString(cM(6, bsam.a)));
                    int length3 = dt.length;
                    bdhg[] bdhgVarArr4 = new bdhg[length3];
                    for (int i3 = 0; i3 < length3; i3++) {
                        bdhgVarArr4[i3] = bdhg.a(dt[i3]);
                    }
                    bdhgVarArr = (bdhg[]) dtub.C(null, bdhgVarArr4, new bdhg[0]);
                } else {
                    bdhgVarArr = new bdhg[]{h()};
                }
                dtsr.dz(length, bdhgVarArr, new emyl() { // from class: brzw
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "rcs_message_id:".concat(String.valueOf(bsaa.this.getString(6)));
                    }
                });
                if (!di(7)) {
                    bdhgVarArr2 = null;
                } else if (z) {
                    String[] dt2 = dt(getString(cM(7, bsam.a)));
                    int length4 = dt2.length;
                    bdhg[] bdhgVarArr5 = new bdhg[length4];
                    for (int i4 = 0; i4 < length4; i4++) {
                        bdhgVarArr5[i4] = bdhg.a(dt2[i4]);
                    }
                    bdhgVarArr2 = (bdhg[]) dtub.C(null, bdhgVarArr5, new bdhg[0]);
                } else {
                    bdhgVarArr2 = new bdhg[]{i()};
                }
                dtsr.dz(length, bdhgVarArr2, new emyl() { // from class: brzx
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "target_rcs_message_id:".concat(String.valueOf(bsaa.this.getString(7)));
                    }
                });
                boolean[] D = di(8) ? z ? dtub.D(null, du(getString(cM(8, bsam.a)))) : new boolean[]{m()} : null;
                dtsr.dA(length, D, new emyl() { // from class: brzy
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "read:".concat(String.valueOf(bsaa.this.getString(8)));
                    }
                });
                long[] B2 = di(9) ? z ? dtub.B(null, ds(getString(cM(9, bsam.a)))) : new long[]{f()} : null;
                dtsr.dy(length, B2, new emyl() { // from class: brzz
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "received_timestamp:".concat(String.valueOf(bsaa.this.getString(9)));
                    }
                });
                engr engrVar = new engr();
                int i5 = 0;
                while (i5 < length) {
                    long j = dB[i5];
                    if (j <= 0 || hashSet.contains(Long.valueOf(j))) {
                        jArr = dB;
                        bdhgVarArr3 = bdhgVarArr2;
                        i = length;
                    } else {
                        hashSet.add(Long.valueOf(dB[i5]));
                        String[] strArr4 = bsam.a;
                        bryr bryrVar = new bryr();
                        bryrVar.aF();
                        bryrVar.aD();
                        long j2 = dB[i5];
                        jArr = dB;
                        bdhgVarArr3 = bdhgVarArr2;
                        if (B != null) {
                            long j3 = B[i5];
                            i = length;
                            bryrVar.aE(0);
                            bryrVar.a = j3;
                        } else {
                            i = length;
                        }
                        if (messageIdTypeArr != null) {
                            bryrVar.i(messageIdTypeArr[i5]);
                        }
                        if (z2 != null) {
                            bryrVar.b(z2[i5]);
                        }
                        if (strArr != null) {
                            bryrVar.e(strArr[i5]);
                        }
                        if (strArr2 != null) {
                            bryrVar.c(strArr2[i5]);
                        }
                        if (strArr3 != null) {
                            bryrVar.d(strArr3[i5]);
                        }
                        if (bdhgVarArr != null) {
                            bryrVar.f(bdhgVarArr[i5]);
                        }
                        if (bdhgVarArr3 != null) {
                            bryrVar.j(bdhgVarArr3[i5]);
                        }
                        if (D != null) {
                            bryrVar.g(D[i5]);
                        }
                        if (B2 != null) {
                            bryrVar.h(B2[i5]);
                        }
                        engrVar.h(bryrVar.a());
                    }
                    i5++;
                    dB = jArr;
                    bdhgVarArr2 = bdhgVarArr3;
                    length = i;
                }
                return engrVar.g();
            }
        }
        int i6 = engw.d;
        return enou.a;
    }

    public final MessageIdType g() {
        return new MessageIdType(getLong(cM(1, bsam.a)));
    }

    public final bdhg h() {
        return bdhg.a(getString(cM(6, bsam.a)));
    }

    public final bdhg i() {
        return bdhg.a(getString(cM(7, bsam.a)));
    }

    public final String j() {
        return getString(cM(4, bsam.a));
    }

    public final String k() {
        return getString(cM(5, bsam.a));
    }

    public final String l() {
        return getString(cM(3, bsam.a));
    }

    public final boolean m() {
        return getInt(cM(8, bsam.a)) == 1;
    }

    @Override // defpackage.dtsu
    public final Cursor a() {
        return this;
    }
}
