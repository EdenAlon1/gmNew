package defpackage;

import android.database.Cursor;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class brwh extends dtsr implements brwa {
    @Deprecated
    public brwh(dtve dtveVar, Cursor cursor, String[] strArr, dtzj[] dtzjVarArr, dtyo dtyoVar, dtvs dtvsVar, brwo brwoVar) {
        super(dtveVar, cursor, strArr, dtzjVarArr, brww.a, dtyoVar, dtvsVar, brwoVar);
    }

    @Override // defpackage.dtsr
    protected final /* synthetic */ dtro b() {
        return new brvh();
    }

    @Override // defpackage.brwa
    public final engw c() {
        engr engrVar = new engr();
        while (moveToNext()) {
            if (i() != null) {
                engrVar.h(i());
            }
        }
        return engrVar.g();
    }

    public final long e() {
        return getLong(cM(2, brww.a));
    }

    public final awwp f() {
        return awwp.b(getInt(cM(4, brww.a)));
    }

    @Override // defpackage.dtsr
    public final engw fI(dtvn dtvnVar) {
        ConversationIdType[] conversationIdTypeArr;
        awwp[] awwpVarArr;
        HashSet hashSet;
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
                String[] strArr = di ? z ? (String[]) dtub.C(null, dt(getString(cM(0, brww.a))), new String[0]) : new String[]{i()} : null;
                dtsr.dz(length, strArr, new emyl() { // from class: brwb
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "_id:".concat(String.valueOf(brwh.this.getString(0)));
                    }
                });
                if (!di(1)) {
                    conversationIdTypeArr = null;
                } else if (z) {
                    long[] ds = ds(getString(cM(1, brww.a)));
                    int length2 = ds.length;
                    ConversationIdType[] conversationIdTypeArr2 = new ConversationIdType[length2];
                    for (int i2 = 0; i2 < length2; i2++) {
                        conversationIdTypeArr2[i2] = new ConversationIdType(ds[i2]);
                    }
                    conversationIdTypeArr = (ConversationIdType[]) dtub.C(null, conversationIdTypeArr2, new ConversationIdType[0]);
                } else {
                    conversationIdTypeArr = new ConversationIdType[]{g()};
                }
                dtsr.dz(length, conversationIdTypeArr, new emyl() { // from class: brwc
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "conversation_id:".concat(String.valueOf(brwh.this.getString(1)));
                    }
                });
                long[] B = di(2) ? z ? dtub.B(null, ds(getString(cM(2, brww.a)))) : new long[]{e()} : null;
                dtsr.dy(length, B, new emyl() { // from class: brwd
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "participant_id:".concat(String.valueOf(brwh.this.getString(2)));
                    }
                });
                boolean[] D = di(3) ? z ? dtub.D(null, du(getString(cM(3, brww.a)))) : new boolean[]{j()} : null;
                dtsr.dA(length, D, new emyl() { // from class: brwe
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "is_normalized:".concat(String.valueOf(brwh.this.getString(3)));
                    }
                });
                if (!di(4)) {
                    awwpVarArr = null;
                } else if (z) {
                    int[] dr = dr(getString(cM(4, brww.a)));
                    awwp[] awwpVarArr2 = new awwp[dr.length];
                    for (int i3 = 0; i3 < dr.length; i3++) {
                        awwp b = awwp.b(dr[i3]);
                        if (b == null) {
                            throw new IllegalStateException();
                        }
                        awwpVarArr2[i3] = b;
                    }
                    awwpVarArr = (awwp[]) dtub.C(null, awwpVarArr2, new awwp[0]);
                } else {
                    awwpVarArr = new awwp[]{f()};
                }
                dtsr.dz(length, awwpVarArr, new emyl() { // from class: brwf
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "rcs_group_join_status:".concat(String.valueOf(brwh.this.getString(4)));
                    }
                });
                if (di(5)) {
                    if (z) {
                        String[] dt = dt(getString(cM(5, brww.a)));
                        int length3 = dt.length;
                        bdpy[] bdpyVarArr2 = new bdpy[length3];
                        for (int i4 = 0; i4 < length3; i4++) {
                            bdpyVarArr2[i4] = bdqb.a(dt[i4]);
                        }
                        bdpyVarArr = (bdpy[]) dtub.C(null, bdpyVarArr2, new bdpy[0]);
                    } else {
                        bdpyVarArr = new bdpy[]{h()};
                    }
                }
                dtsr.dz(length, bdpyVarArr, new emyl() { // from class: brwg
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "last_modified_by_key:".concat(String.valueOf(brwh.this.getString(5)));
                    }
                });
                engr engrVar = new engr();
                int i5 = 0;
                while (i5 < length) {
                    long j = dB[i5];
                    if (j <= 0 || hashSet2.contains(Long.valueOf(j))) {
                        hashSet = hashSet2;
                    } else {
                        hashSet2.add(Long.valueOf(dB[i5]));
                        String[] strArr2 = brww.a;
                        brvj brvjVar = new brvj();
                        brvjVar.aF();
                        brvjVar.aD();
                        long j2 = dB[i5];
                        if (strArr != null) {
                            String str = strArr[i5];
                            brvjVar.aE(i);
                            brvjVar.a = str;
                        }
                        if (conversationIdTypeArr != null) {
                            brvjVar.b(conversationIdTypeArr[i5]);
                        }
                        hashSet = hashSet2;
                        if (B != null) {
                            brvjVar.c(B[i5]);
                        }
                        if (D != null) {
                            boolean z2 = D[i5];
                            int i6 = brvjVar.aB;
                            if (i6 < 58090) {
                                dtub.w("is_normalized", i6);
                            }
                            brvjVar.aE(3);
                            brvjVar.d = z2;
                        }
                        if (awwpVarArr != null) {
                            brvjVar.d(awwpVarArr[i5]);
                        }
                        if (bdpyVarArr != null) {
                            bdpy bdpyVar = bdpyVarArr[i5];
                            int i7 = brvjVar.aB;
                            if (i7 < 59440) {
                                dtub.w("last_modified_by_key", i7);
                            }
                            brvjVar.aE(5);
                            brvjVar.f = bdpyVar;
                        }
                        engrVar.h(brvjVar.a());
                    }
                    i5++;
                    hashSet2 = hashSet;
                    i = 0;
                }
                return engrVar.g();
            }
        }
        int i8 = engw.d;
        return enou.a;
    }

    public final ConversationIdType g() {
        return new ConversationIdType(getLong(cM(1, brww.a)));
    }

    public final bdpy h() {
        return bdqb.a(getString(cM(5, brww.a)));
    }

    public final String i() {
        return getString(cM(0, brww.a));
    }

    public final boolean j() {
        return getInt(cM(3, brww.a)) == 1;
    }

    @Override // defpackage.dtsu
    public final Cursor a() {
        return this;
    }
}
