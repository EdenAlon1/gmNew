package defpackage;

import android.database.Cursor;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class brbh extends dtsr implements braz {
    @Deprecated
    public brbh(dtve dtveVar, Cursor cursor, String[] strArr, dtzj[] dtzjVarArr, dtyo dtyoVar, dtvs dtvsVar, brbm brbmVar) {
        super(dtveVar, cursor, strArr, dtzjVarArr, brbs.a, dtyoVar, dtvsVar, brbmVar);
    }

    @Override // defpackage.dtsr
    protected final /* synthetic */ dtro b() {
        return new braf();
    }

    @Override // defpackage.braz
    public final engw c() {
        engr engrVar = new engr();
        while (moveToNext()) {
            j();
            engrVar.h(j());
        }
        return engrVar.g();
    }

    public final long e() {
        return getLong(cM(6, brbs.a));
    }

    public final long f() {
        return getLong(cM(0, brbs.a));
    }

    @Override // defpackage.dtsr
    public final engw fI(dtvn dtvnVar) {
        ConversationIdType[] conversationIdTypeArr;
        axcl[] axclVarArr;
        axcj[] axcjVarArr;
        char c;
        long[] jArr;
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
                long[] B = di ? z ? dtub.B(null, ds(getString(cM(0, brbs.a)))) : new long[]{f()} : null;
                dtsr.dy(length, B, new emyl() { // from class: brba
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "_id:".concat(String.valueOf(brbh.this.getString(0)));
                    }
                });
                if (!di(1)) {
                    conversationIdTypeArr = null;
                } else if (z) {
                    long[] ds = ds(getString(cM(1, brbs.a)));
                    int length2 = ds.length;
                    ConversationIdType[] conversationIdTypeArr2 = new ConversationIdType[length2];
                    for (int i2 = 0; i2 < length2; i2++) {
                        conversationIdTypeArr2[i2] = new ConversationIdType(ds[i2]);
                    }
                    conversationIdTypeArr = (ConversationIdType[]) dtub.C(null, conversationIdTypeArr2, new ConversationIdType[0]);
                } else {
                    conversationIdTypeArr = new ConversationIdType[]{j()};
                }
                dtsr.dz(length, conversationIdTypeArr, new emyl() { // from class: brbb
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "conversation_id:".concat(String.valueOf(brbh.this.getString(1)));
                    }
                });
                if (!di(2)) {
                    axclVarArr = null;
                } else if (z) {
                    int[] dr = dr(getString(cM(2, brbs.a)));
                    axcl[] axclVarArr2 = new axcl[dr.length];
                    for (int i3 = 0; i3 < dr.length; i3++) {
                        axcl b = axcl.b(dr[i3]);
                        if (b == null) {
                            throw new IllegalStateException();
                        }
                        axclVarArr2[i3] = b;
                    }
                    axclVarArr = (axcl[]) dtub.C(null, axclVarArr2, new axcl[0]);
                } else {
                    axclVarArr = new axcl[]{i()};
                }
                dtsr.dz(length, axclVarArr, new emyl() { // from class: brbc
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "classification_type:".concat(String.valueOf(brbh.this.getString(2)));
                    }
                });
                if (!di(3)) {
                    axcjVarArr = null;
                } else if (z) {
                    int[] dr2 = dr(getString(cM(3, brbs.a)));
                    axcj[] axcjVarArr2 = new axcj[dr2.length];
                    for (int i4 = 0; i4 < dr2.length; i4++) {
                        axcj b2 = axcj.b(dr2[i4]);
                        if (b2 == null) {
                            throw new IllegalStateException();
                        }
                        axcjVarArr2[i4] = b2;
                    }
                    axcjVarArr = (axcj[]) dtub.C(null, axcjVarArr2, new axcj[0]);
                } else {
                    axcjVarArr = new axcj[]{h()};
                }
                dtsr.dz(length, axcjVarArr, new emyl() { // from class: brbd
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "classification_state:".concat(String.valueOf(brbh.this.getString(3)));
                    }
                });
                String[] strArr = di(4) ? z ? (String[]) dtub.C(null, dt(getString(cM(4, brbs.a))), new String[0]) : new String[]{k()} : null;
                dtsr.dz(length, strArr, new emyl() { // from class: brbe
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "date:".concat(String.valueOf(brbh.this.getString(4)));
                    }
                });
                char c2 = 5;
                long[] B2 = di(5) ? z ? dtub.B(null, ds(getString(cM(5, brbs.a)))) : new long[]{g()} : null;
                dtsr.dy(length, B2, new emyl() { // from class: brbf
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "impression_count:".concat(String.valueOf(brbh.this.getString(5)));
                    }
                });
                long[] B3 = di(6) ? z ? dtub.B(null, ds(getString(cM(6, brbs.a)))) : new long[]{e()} : null;
                dtsr.dy(length, B3, new emyl() { // from class: brbg
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "generated_timestamp:".concat(String.valueOf(brbh.this.getString(6)));
                    }
                });
                engr engrVar = new engr();
                int i5 = 0;
                while (i5 < length) {
                    long j = dB[i5];
                    if (j <= 0 || hashSet.contains(Long.valueOf(j))) {
                        c = c2;
                        jArr = B2;
                    } else {
                        hashSet.add(Long.valueOf(dB[i5]));
                        String[] strArr2 = brbs.a;
                        brah brahVar = new brah();
                        brahVar.aF();
                        brahVar.aD();
                        long j2 = dB[i5];
                        jArr = B2;
                        if (B != null) {
                            long j3 = B[i5];
                            brahVar.aE(i);
                            brahVar.a = j3;
                        }
                        if (conversationIdTypeArr != null) {
                            brahVar.d(conversationIdTypeArr[i5]);
                        }
                        if (axclVarArr != null) {
                            brahVar.c(axclVarArr[i5]);
                        }
                        if (axcjVarArr != null) {
                            brahVar.b(axcjVarArr[i5]);
                        }
                        if (strArr != null) {
                            brahVar.e(strArr[i5]);
                        }
                        if (jArr != null) {
                            long j4 = jArr[i5];
                            int i6 = brahVar.aB;
                            if (i6 < 58840) {
                                dtub.w("impression_count", i6);
                            }
                            c = 5;
                            brahVar.aE(5);
                            brahVar.f = j4;
                        } else {
                            c = 5;
                        }
                        if (B3 != null) {
                            brahVar.f(B3[i5]);
                        }
                        engrVar.h(brahVar.a());
                    }
                    i5++;
                    c2 = c;
                    B2 = jArr;
                    i = 0;
                }
                return engrVar.g();
            }
        }
        int i7 = engw.d;
        return enou.a;
    }

    public final long g() {
        return getLong(cM(5, brbs.a));
    }

    public final axcj h() {
        return axcj.b(getInt(cM(3, brbs.a)));
    }

    public final axcl i() {
        return axcl.b(getInt(cM(2, brbs.a)));
    }

    public final ConversationIdType j() {
        return new ConversationIdType(getLong(cM(1, brbs.a)));
    }

    public final String k() {
        return getString(cM(4, brbs.a));
    }

    @Override // defpackage.dtsu
    public final Cursor a() {
        return this;
    }
}
