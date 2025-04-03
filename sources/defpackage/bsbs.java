package defpackage;

import android.database.Cursor;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.time.Instant;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bsbs extends dtsr implements bsbk {
    @Deprecated
    public bsbs(dtve dtveVar, Cursor cursor, String[] strArr, dtzj[] dtzjVarArr, dtyo dtyoVar, dtvs dtvsVar, bsbv bsbvVar) {
        super(dtveVar, cursor, strArr, dtzjVarArr, bsbx.a, dtyoVar, dtvsVar, bsbvVar);
    }

    @Override // defpackage.dtsr
    protected final /* synthetic */ dtro b() {
        return new bsar();
    }

    public final long c() {
        return getLong(cM(0, bsbx.a));
    }

    public final long e() {
        return getLong(cM(2, bsbx.a));
    }

    public final long f() {
        return getLong(cM(4, bsbx.a));
    }

    @Override // defpackage.dtsr
    public final engw fI(dtvn dtvnVar) {
        Instant[] instantArr;
        long[] jArr;
        ConversationIdType[] conversationIdTypeArr;
        awwp[] awwpVarArr;
        HashSet hashSet;
        char c;
        long[] jArr2;
        awwp[] awwpVarArr2;
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
                bdpy[] bdpyVarArr = null;
                long[] B = di ? z ? dtub.B(null, ds(getString(cM(0, bsbx.a)))) : new long[]{c()} : null;
                dtsr.dy(length, B, new emyl() { // from class: bsbl
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "_id:".concat(String.valueOf(bsbs.this.getString(0)));
                    }
                });
                if (!di(1)) {
                    instantArr = null;
                } else if (z) {
                    long[] ds = ds(getString(cM(1, bsbx.a)));
                    int length2 = ds.length;
                    Instant[] instantArr2 = new Instant[length2];
                    for (int i2 = 0; i2 < length2; i2++) {
                        instantArr2[i2] = bdgw.b(ds[i2]);
                    }
                    instantArr = (Instant[]) dtub.C(null, instantArr2, new Instant[0]);
                } else {
                    instantArr = new Instant[]{j()};
                }
                dtsr.dz(length, instantArr, new emyl() { // from class: bsbm
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "operation_datetime:".concat(String.valueOf(bsbs.this.getString(1)));
                    }
                });
                long[] B2 = di(2) ? z ? dtub.B(null, ds(getString(cM(2, bsbx.a)))) : new long[]{e()} : null;
                dtsr.dy(length, B2, new emyl() { // from class: bsbn
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "operation_type:".concat(String.valueOf(bsbs.this.getString(2)));
                    }
                });
                if (!di(3)) {
                    jArr = B2;
                    conversationIdTypeArr = null;
                } else if (z) {
                    long[] ds2 = ds(getString(cM(3, bsbx.a)));
                    int length3 = ds2.length;
                    ConversationIdType[] conversationIdTypeArr2 = new ConversationIdType[length3];
                    int i3 = 0;
                    while (i3 < length3) {
                        conversationIdTypeArr2[i3] = new ConversationIdType(ds2[i3]);
                        i3++;
                        B2 = B2;
                    }
                    jArr = B2;
                    conversationIdTypeArr = (ConversationIdType[]) dtub.C(null, conversationIdTypeArr2, new ConversationIdType[0]);
                } else {
                    jArr = B2;
                    conversationIdTypeArr = new ConversationIdType[]{h()};
                }
                dtsr.dz(length, conversationIdTypeArr, new emyl() { // from class: bsbo
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "conversation_id:".concat(String.valueOf(bsbs.this.getString(3)));
                    }
                });
                char c2 = 4;
                long[] B3 = di(4) ? z ? dtub.B(null, ds(getString(cM(4, bsbx.a)))) : new long[]{f()} : null;
                dtsr.dy(length, B3, new emyl() { // from class: bsbp
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "participant_id:".concat(String.valueOf(bsbs.this.getString(4)));
                    }
                });
                if (!di(5)) {
                    awwpVarArr = null;
                } else if (z) {
                    int[] dr = dr(getString(cM(5, bsbx.a)));
                    awwp[] awwpVarArr3 = new awwp[dr.length];
                    for (int i4 = 0; i4 < dr.length; i4++) {
                        awwp b = awwp.b(dr[i4]);
                        if (b == null) {
                            throw new IllegalStateException();
                        }
                        awwpVarArr3[i4] = b;
                    }
                    awwpVarArr = (awwp[]) dtub.C(null, awwpVarArr3, new awwp[0]);
                } else {
                    awwpVarArr = new awwp[]{g()};
                }
                dtsr.dz(length, awwpVarArr, new emyl() { // from class: bsbq
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "rcs_group_join_status:".concat(String.valueOf(bsbs.this.getString(5)));
                    }
                });
                if (di(6)) {
                    if (z) {
                        String[] dt = dt(getString(cM(6, bsbx.a)));
                        int length4 = dt.length;
                        bdpy[] bdpyVarArr2 = new bdpy[length4];
                        for (int i5 = 0; i5 < length4; i5++) {
                            bdpyVarArr2[i5] = bdqb.a(dt[i5]);
                        }
                        bdpyVarArr = (bdpy[]) dtub.C(null, bdpyVarArr2, new bdpy[0]);
                    } else {
                        bdpyVarArr = new bdpy[]{i()};
                    }
                }
                dtsr.dz(length, bdpyVarArr, new emyl() { // from class: bsbr
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "last_modified_by_key:".concat(String.valueOf(bsbs.this.getString(6)));
                    }
                });
                engr engrVar = new engr();
                int i6 = 0;
                while (i6 < length) {
                    long j = dB[i6];
                    if (j <= 0 || hashSet2.contains(Long.valueOf(j))) {
                        hashSet = hashSet2;
                        c = c2;
                        jArr2 = B3;
                        awwpVarArr2 = awwpVarArr;
                    } else {
                        hashSet2.add(Long.valueOf(dB[i6]));
                        String[] strArr = bsbx.a;
                        bsat bsatVar = new bsat();
                        bsatVar.aF();
                        bsatVar.aD();
                        long j2 = dB[i6];
                        jArr2 = B3;
                        if (B != null) {
                            long j3 = B[i6];
                            bsatVar.aE(i);
                            bsatVar.a = j3;
                        }
                        if (instantArr != null) {
                            Instant instant = instantArr[i6];
                            bsatVar.aE(1);
                            bsatVar.b = instant;
                        }
                        hashSet = hashSet2;
                        if (jArr != null) {
                            long j4 = jArr[i6];
                            bsatVar.aE(2);
                            bsatVar.c = j4;
                        }
                        if (conversationIdTypeArr != null) {
                            ConversationIdType conversationIdType = conversationIdTypeArr[i6];
                            bsatVar.aE(3);
                            bsatVar.d = conversationIdType;
                        }
                        if (jArr2 != null) {
                            long j5 = jArr2[i6];
                            c = 4;
                            bsatVar.aE(4);
                            bsatVar.e = j5;
                        } else {
                            c = 4;
                        }
                        if (awwpVarArr != null) {
                            awwp awwpVar = awwpVarArr[i6];
                            bsatVar.aE(5);
                            bsatVar.f = awwpVar;
                        }
                        if (bdpyVarArr != null) {
                            bdpy bdpyVar = bdpyVarArr[i6];
                            bsatVar.aE(6);
                            bsatVar.g = bdpyVar;
                        }
                        bsar bsarVar = new bsar();
                        bsarVar.aC(bsatVar.aB());
                        awwpVarArr2 = awwpVarArr;
                        bsarVar.a = bsatVar.a;
                        bsarVar.b = bsatVar.b;
                        bsarVar.c = bsatVar.c;
                        bsarVar.d = bsatVar.d;
                        bsarVar.e = bsatVar.e;
                        bsarVar.f = bsatVar.f;
                        bsarVar.g = bsatVar.g;
                        bsarVar.cK = bsatVar.aC();
                        engrVar.h(bsarVar);
                    }
                    i6++;
                    awwpVarArr = awwpVarArr2;
                    c2 = c;
                    hashSet2 = hashSet;
                    B3 = jArr2;
                    i = 0;
                }
                return engrVar.g();
            }
        }
        int i7 = engw.d;
        return enou.a;
    }

    public final awwp g() {
        return awwp.b(getInt(cM(5, bsbx.a)));
    }

    public final ConversationIdType h() {
        return new ConversationIdType(getLong(cM(3, bsbx.a)));
    }

    public final bdpy i() {
        return bdqb.a(getString(cM(6, bsbx.a)));
    }

    public final Instant j() {
        return bdgw.b(getLong(cM(1, bsbx.a)));
    }

    @Override // defpackage.dtsu
    public final Cursor a() {
        return this;
    }
}
