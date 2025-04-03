package defpackage;

import android.database.Cursor;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.time.Instant;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bruq extends dtsr implements brug {
    @Deprecated
    public bruq(dtve dtveVar, Cursor cursor, String[] strArr, dtzj[] dtzjVarArr, dtyo dtyoVar, dtvs dtvsVar, brut brutVar) {
        super(dtveVar, cursor, strArr, dtzjVarArr, brux.a, dtyoVar, dtvsVar, brutVar);
    }

    @Override // defpackage.dtsr
    protected final /* synthetic */ dtro b() {
        return new brtj();
    }

    public final long c() {
        return getLong(cM(2, brux.a));
    }

    public final long e() {
        return getLong(cM(5, brux.a));
    }

    public final awwp f() {
        return awwp.b(getInt(cM(7, brux.a)));
    }

    @Override // defpackage.dtsr
    public final engw fI(dtvn dtvnVar) {
        Instant[] instantArr;
        int i;
        ConversationIdType[] conversationIdTypeArr;
        awwp[] awwpVarArr;
        bdpy[] bdpyVarArr;
        long[] jArr;
        engr engrVar;
        engr engrVar2;
        dtyq dtyqVar = dtvnVar.a;
        long[] dB = dB(getString(dtvnVar.h + 1));
        int length = dB.length;
        if (length == 0 || (length == 1 && dB[0] == -1)) {
            int i2 = engw.d;
            return enou.a;
        }
        HashSet hashSet = new HashSet();
        dtvs dtvsVar = this.d;
        boolean di = di(0);
        boolean z = dtvsVar.b;
        String[] strArr = di ? z ? (String[]) dtub.C(null, dt(getString(cM(0, brux.a))), new String[0]) : new String[]{k()} : null;
        dtsr.dz(length, strArr, new emyl() { // from class: bruh
            @Override // defpackage.emyl
            public final Object get() {
                return "_id:".concat(String.valueOf(bruq.this.getString(0)));
            }
        });
        if (!di(1)) {
            instantArr = null;
        } else if (z) {
            long[] ds = ds(getString(cM(1, brux.a)));
            int length2 = ds.length;
            Instant[] instantArr2 = new Instant[length2];
            for (int i3 = 0; i3 < length2; i3++) {
                instantArr2[i3] = bdgw.b(ds[i3]);
            }
            instantArr = (Instant[]) dtub.C(null, instantArr2, new Instant[0]);
        } else {
            instantArr = new Instant[]{i()};
        }
        dtsr.dz(length, instantArr, new emyl() { // from class: brui
            @Override // defpackage.emyl
            public final Object get() {
                return "operation_datetime:".concat(String.valueOf(bruq.this.getString(1)));
            }
        });
        long[] B = di(2) ? z ? dtub.B(null, ds(getString(cM(2, brux.a)))) : new long[]{c()} : null;
        dtsr.dy(length, B, new emyl() { // from class: bruj
            @Override // defpackage.emyl
            public final Object get() {
                return "operation_type:".concat(String.valueOf(bruq.this.getString(2)));
            }
        });
        String[] strArr2 = di(3) ? z ? (String[]) dtub.C(null, dt(getString(cM(3, brux.a))), new String[0]) : new String[]{j()} : null;
        dtsr.dz(length, strArr2, new emyl() { // from class: bruk
            @Override // defpackage.emyl
            public final Object get() {
                return "conversation_participants_id:".concat(String.valueOf(bruq.this.getString(3)));
            }
        });
        if (!di(4)) {
            i = length;
            conversationIdTypeArr = null;
        } else if (z) {
            long[] ds2 = ds(getString(cM(4, brux.a)));
            int length3 = ds2.length;
            ConversationIdType[] conversationIdTypeArr2 = new ConversationIdType[length3];
            int i4 = 0;
            while (i4 < length3) {
                conversationIdTypeArr2[i4] = new ConversationIdType(ds2[i4]);
                i4++;
                length = length;
            }
            i = length;
            conversationIdTypeArr = (ConversationIdType[]) dtub.C(null, conversationIdTypeArr2, new ConversationIdType[0]);
        } else {
            i = length;
            conversationIdTypeArr = new ConversationIdType[]{g()};
        }
        int i5 = i;
        dtsr.dz(i5, conversationIdTypeArr, new emyl() { // from class: brul
            @Override // defpackage.emyl
            public final Object get() {
                return "conversation_id:".concat(String.valueOf(bruq.this.getString(4)));
            }
        });
        long[] B2 = di(5) ? z ? dtub.B(null, ds(getString(cM(5, brux.a)))) : new long[]{e()} : null;
        dtsr.dy(i5, B2, new emyl() { // from class: brum
            @Override // defpackage.emyl
            public final Object get() {
                return "participant_id:".concat(String.valueOf(bruq.this.getString(5)));
            }
        });
        boolean[] D = di(6) ? z ? dtub.D(null, du(getString(cM(6, brux.a)))) : new boolean[]{l()} : null;
        dtsr.dA(i5, D, new emyl() { // from class: brun
            @Override // defpackage.emyl
            public final Object get() {
                return "is_normalized:".concat(String.valueOf(bruq.this.getString(6)));
            }
        });
        if (!di(7)) {
            awwpVarArr = null;
        } else if (z) {
            int[] dr = dr(getString(cM(7, brux.a)));
            awwp[] awwpVarArr2 = new awwp[dr.length];
            for (int i6 = 0; i6 < dr.length; i6++) {
                awwp b = awwp.b(dr[i6]);
                if (b == null) {
                    throw new IllegalStateException();
                }
                awwpVarArr2[i6] = b;
            }
            awwpVarArr = (awwp[]) dtub.C(null, awwpVarArr2, new awwp[0]);
        } else {
            awwpVarArr = new awwp[]{f()};
        }
        dtsr.dz(i5, awwpVarArr, new emyl() { // from class: bruo
            @Override // defpackage.emyl
            public final Object get() {
                return "rcs_group_join_status:".concat(String.valueOf(bruq.this.getString(7)));
            }
        });
        if (!di(8)) {
            bdpyVarArr = null;
        } else if (z) {
            String[] dt = dt(getString(cM(8, brux.a)));
            int length4 = dt.length;
            bdpy[] bdpyVarArr2 = new bdpy[length4];
            for (int i7 = 0; i7 < length4; i7++) {
                bdpyVarArr2[i7] = bdqb.a(dt[i7]);
            }
            bdpyVarArr = (bdpy[]) dtub.C(null, bdpyVarArr2, new bdpy[0]);
        } else {
            bdpyVarArr = new bdpy[]{h()};
        }
        dtsr.dz(i5, bdpyVarArr, new emyl() { // from class: brup
            @Override // defpackage.emyl
            public final Object get() {
                return "last_modified_by_key:".concat(String.valueOf(bruq.this.getString(8)));
            }
        });
        engr engrVar3 = new engr();
        int i8 = 0;
        while (i8 < i5) {
            long j = dB[i8];
            if (j <= 0 || hashSet.contains(Long.valueOf(j))) {
                jArr = dB;
                engrVar = engrVar3;
            } else {
                hashSet.add(Long.valueOf(dB[i8]));
                String[] strArr3 = brux.a;
                brtl brtlVar = new brtl();
                brtlVar.aF();
                brtlVar.aD();
                long j2 = dB[i8];
                if (strArr != null) {
                    String str = strArr[i8];
                    jArr = dB;
                    brtlVar.aE(0);
                    brtlVar.a = str;
                } else {
                    jArr = dB;
                }
                if (instantArr != null) {
                    Instant instant = instantArr[i8];
                    brtlVar.aE(1);
                    brtlVar.b = instant;
                }
                if (B != null) {
                    long j3 = B[i8];
                    engrVar2 = engrVar3;
                    brtlVar.aE(2);
                    brtlVar.c = j3;
                } else {
                    engrVar2 = engrVar3;
                }
                if (strArr2 != null) {
                    String str2 = strArr2[i8];
                    brtlVar.aE(3);
                    brtlVar.d = str2;
                }
                if (conversationIdTypeArr != null) {
                    ConversationIdType conversationIdType = conversationIdTypeArr[i8];
                    brtlVar.aE(4);
                    brtlVar.e = conversationIdType;
                }
                if (B2 != null) {
                    long j4 = B2[i8];
                    brtlVar.aE(5);
                    brtlVar.f = j4;
                }
                if (D != null) {
                    boolean z2 = D[i8];
                    brtlVar.aE(6);
                    brtlVar.g = z2;
                }
                if (awwpVarArr != null) {
                    awwp awwpVar = awwpVarArr[i8];
                    brtlVar.aE(7);
                    brtlVar.h = awwpVar;
                }
                if (bdpyVarArr != null) {
                    bdpy bdpyVar = bdpyVarArr[i8];
                    int i9 = brtlVar.aB;
                    if (i9 < 59440) {
                        dtub.w("last_modified_by_key", i9);
                    }
                    brtlVar.aE(8);
                    brtlVar.i = bdpyVar;
                }
                brtj brtjVar = new brtj();
                brtjVar.aC(brtlVar.aB());
                brtjVar.a = brtlVar.a;
                brtjVar.b = brtlVar.b;
                brtjVar.c = brtlVar.c;
                brtjVar.d = brtlVar.d;
                brtjVar.e = brtlVar.e;
                brtjVar.f = brtlVar.f;
                brtjVar.g = brtlVar.g;
                brtjVar.h = brtlVar.h;
                brtjVar.i = brtlVar.i;
                brtjVar.cK = brtlVar.aC();
                engrVar = engrVar2;
                engrVar.h(brtjVar);
            }
            i8++;
            engrVar3 = engrVar;
            dB = jArr;
        }
        return engrVar3.g();
    }

    public final ConversationIdType g() {
        return new ConversationIdType(getLong(cM(4, brux.a)));
    }

    public final bdpy h() {
        return bdqb.a(getString(cM(8, brux.a)));
    }

    public final Instant i() {
        return bdgw.b(getLong(cM(1, brux.a)));
    }

    public final String j() {
        return getString(cM(3, brux.a));
    }

    public final String k() {
        return getString(cM(0, brux.a));
    }

    public final boolean l() {
        return getInt(cM(6, brux.a)) == 1;
    }

    @Override // defpackage.dtsu
    public final Cursor a() {
        return this;
    }
}
