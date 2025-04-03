package defpackage;

import android.database.Cursor;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class bbjt extends dtsr implements bbjm {
    @Deprecated
    public bbjt(dtve dtveVar, Cursor cursor, String[] strArr, dtzj[] dtzjVarArr, dtyo dtyoVar, dtvs dtvsVar, bbka bbkaVar) {
        super(dtveVar, cursor, strArr, dtzjVarArr, bbke.a, dtyoVar, dtvsVar, bbkaVar);
    }

    @Override // defpackage.dtsr
    protected final /* synthetic */ dtro b() {
        return new bbit();
    }

    public final int c() {
        return getInt(cM(2, bbke.a));
    }

    public final long e() {
        return getLong(cM(0, bbke.a));
    }

    public final awwp f() {
        return awwp.b(getInt(cM(4, bbke.a)));
    }

    @Override // defpackage.dtsr
    public final engw fI(dtvn dtvnVar) {
        ConversationIdType[] conversationIdTypeArr;
        awwp[] awwpVarArr;
        int i;
        boolean[] zArr;
        dtyq dtyqVar = dtvnVar.a;
        int i2 = 1;
        long[] dB = dB(getString(dtvnVar.h + 1));
        int length = dB.length;
        if (length != 0) {
            int i3 = 0;
            if (length != 1 || dB[0] != -1) {
                HashSet hashSet = new HashSet();
                dtvs dtvsVar = this.d;
                boolean di = di(0);
                boolean z = dtvsVar.b;
                long[] B = di ? z ? dtub.B(null, ds(getString(cM(0, bbke.a)))) : new long[]{e()} : null;
                dtsr.dy(length, B, new emyl() { // from class: bbjn
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "_id:".concat(String.valueOf(bbjt.this.getString(0)));
                    }
                });
                if (!di(1)) {
                    conversationIdTypeArr = null;
                } else if (z) {
                    long[] ds = ds(getString(cM(1, bbke.a)));
                    int length2 = ds.length;
                    ConversationIdType[] conversationIdTypeArr2 = new ConversationIdType[length2];
                    for (int i4 = 0; i4 < length2; i4++) {
                        conversationIdTypeArr2[i4] = new ConversationIdType(ds[i4]);
                    }
                    conversationIdTypeArr = (ConversationIdType[]) dtub.C(null, conversationIdTypeArr2, new ConversationIdType[0]);
                } else {
                    conversationIdTypeArr = new ConversationIdType[]{g()};
                }
                dtsr.dz(length, conversationIdTypeArr, new emyl() { // from class: bbjo
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "conversation_id:".concat(String.valueOf(bbjt.this.getString(1)));
                    }
                });
                int[] z2 = di(2) ? z ? dtub.z(null, dr(getString(cM(2, bbke.a)))) : new int[]{c()} : null;
                dtsr.dx(length, z2, new emyl() { // from class: bbjp
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "participant_id:".concat(String.valueOf(bbjt.this.getString(2)));
                    }
                });
                boolean[] D = di(3) ? z ? dtub.D(null, du(getString(cM(3, bbke.a)))) : new boolean[]{i()} : null;
                dtsr.dA(length, D, new emyl() { // from class: bbjq
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "is_normalized:".concat(String.valueOf(bbjt.this.getString(3)));
                    }
                });
                if (!di(4)) {
                    awwpVarArr = null;
                } else if (z) {
                    int[] dr = dr(getString(cM(4, bbke.a)));
                    awwp[] awwpVarArr2 = new awwp[dr.length];
                    for (int i5 = 0; i5 < dr.length; i5++) {
                        awwp b = awwp.b(dr[i5]);
                        if (b == null) {
                            throw new IllegalStateException();
                        }
                        awwpVarArr2[i5] = b;
                    }
                    awwpVarArr = (awwp[]) dtub.C(null, awwpVarArr2, new awwp[0]);
                } else {
                    awwpVarArr = new awwp[]{f()};
                }
                dtsr.dz(length, awwpVarArr, new emyl() { // from class: bbjr
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "rcs_group_join_status:".concat(String.valueOf(bbjt.this.getString(4)));
                    }
                });
                boolean[] D2 = di(5) ? z ? dtub.D(null, du(getString(cM(5, bbke.a)))) : new boolean[]{h()} : null;
                dtsr.dA(length, D2, new emyl() { // from class: bbjs
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "is_c2p_only:".concat(String.valueOf(bbjt.this.getString(5)));
                    }
                });
                engr engrVar = new engr();
                int i6 = 0;
                while (i6 < length) {
                    long j = dB[i6];
                    if (j <= 0 || hashSet.contains(Long.valueOf(j))) {
                        i = length;
                        zArr = D;
                    } else {
                        hashSet.add(Long.valueOf(dB[i6]));
                        String[] strArr = bbke.a;
                        bbiv bbivVar = new bbiv();
                        bbivVar.aF();
                        bbivVar.aD();
                        long j2 = dB[i6];
                        zArr = D;
                        if (B != null) {
                            long j3 = B[i6];
                            bbivVar.aE(i3);
                            bbivVar.a = j3;
                        }
                        if (conversationIdTypeArr != null) {
                            ConversationIdType conversationIdType = conversationIdTypeArr[i6];
                            bbivVar.aE(i2);
                            bbivVar.b = conversationIdType;
                        }
                        if (z2 != null) {
                            int i7 = z2[i6];
                            bbivVar.aE(2);
                            bbivVar.c = i7;
                        }
                        if (zArr != null) {
                            boolean z3 = zArr[i6];
                            int i8 = bbivVar.aB;
                            if (i8 < 0) {
                                dtub.w("is_normalized", i8);
                            }
                            bbivVar.aE(3);
                            bbivVar.d = z3;
                        }
                        if (awwpVarArr != null) {
                            awwp awwpVar = awwpVarArr[i6];
                            int i9 = bbivVar.aB;
                            if (i9 < 0) {
                                dtub.w("rcs_group_join_status", i9);
                            }
                            bbivVar.aE(4);
                            bbivVar.e = awwpVar;
                        }
                        if (D2 != null) {
                            boolean z4 = D2[i6];
                            int i10 = bbivVar.aB;
                            if (i10 < 70) {
                                dtub.w("is_c2p_only", i10);
                            }
                            bbivVar.aE(5);
                            bbivVar.f = z4;
                        }
                        bbit bbitVar = new bbit();
                        bbitVar.aC(bbivVar.aB());
                        i = length;
                        bbitVar.a = bbivVar.a;
                        bbitVar.b = bbivVar.b;
                        bbitVar.c = bbivVar.c;
                        bbitVar.d = bbivVar.d;
                        bbitVar.e = bbivVar.e;
                        bbitVar.f = bbivVar.f;
                        bbitVar.cK = bbivVar.aC();
                        engrVar.h(bbitVar);
                    }
                    i6++;
                    length = i;
                    D = zArr;
                    i2 = 1;
                    i3 = 0;
                }
                return engrVar.g();
            }
        }
        int i11 = engw.d;
        return enou.a;
    }

    public final ConversationIdType g() {
        return new ConversationIdType(getLong(cM(1, bbke.a)));
    }

    public final boolean h() {
        return getInt(cM(5, bbke.a)) == 1;
    }

    public final boolean i() {
        return getInt(cM(3, bbke.a)) == 1;
    }

    @Override // defpackage.dtsu
    public final Cursor a() {
        return this;
    }
}
