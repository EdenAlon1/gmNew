package defpackage;

import android.database.Cursor;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bsdg extends dtsr implements bsdb {
    @Deprecated
    public bsdg(dtve dtveVar, Cursor cursor, String[] strArr, dtzj[] dtzjVarArr, dtyo dtyoVar, dtvs dtvsVar, bsdl bsdlVar) {
        super(dtveVar, cursor, strArr, dtzjVarArr, bsdr.a, dtyoVar, dtvsVar, bsdlVar);
    }

    @Override // defpackage.dtsr
    protected final /* synthetic */ dtro b() {
        return new bsck();
    }

    @Override // defpackage.bsdb
    public final long c() {
        return getLong(cM(1, bsdr.a));
    }

    @Override // defpackage.bsdb
    public final ConversationIdType e() {
        return new ConversationIdType(getLong(cM(0, bsdr.a)));
    }

    public final awwp f() {
        return awwp.b(getInt(cM(2, bsdr.a)));
    }

    @Override // defpackage.dtsr
    public final engw fI(dtvn dtvnVar) {
        ConversationIdType[] conversationIdTypeArr;
        awwp[] awwpVarArr;
        dtyq dtyqVar = dtvnVar.a;
        long[] dB = dB(getString(dtvnVar.h + 1));
        int length = dB.length;
        if (length != 0) {
            if (length != 1 || dB[0] != -1) {
                HashSet hashSet = new HashSet();
                dtvs dtvsVar = this.d;
                boolean di = di(0);
                boolean z = dtvsVar.b;
                bdpy[] bdpyVarArr = null;
                if (!di) {
                    conversationIdTypeArr = null;
                } else if (z) {
                    long[] ds = ds(getString(cM(0, bsdr.a)));
                    int length2 = ds.length;
                    ConversationIdType[] conversationIdTypeArr2 = new ConversationIdType[length2];
                    for (int i = 0; i < length2; i++) {
                        conversationIdTypeArr2[i] = new ConversationIdType(ds[i]);
                    }
                    conversationIdTypeArr = (ConversationIdType[]) dtub.C(null, conversationIdTypeArr2, new ConversationIdType[0]);
                } else {
                    conversationIdTypeArr = new ConversationIdType[]{e()};
                }
                dtsr.dz(length, conversationIdTypeArr, new emyl() { // from class: bsdc
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "conversation_id:".concat(String.valueOf(bsdg.this.getString(0)));
                    }
                });
                long[] B = di(1) ? z ? dtub.B(null, ds(getString(cM(1, bsdr.a)))) : new long[]{c()} : null;
                dtsr.dy(length, B, new emyl() { // from class: bsdd
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "participant_id:".concat(String.valueOf(bsdg.this.getString(1)));
                    }
                });
                if (!di(2)) {
                    awwpVarArr = null;
                } else if (z) {
                    int[] dr = dr(getString(cM(2, bsdr.a)));
                    awwp[] awwpVarArr2 = new awwp[dr.length];
                    for (int i2 = 0; i2 < dr.length; i2++) {
                        awwp b = awwp.b(dr[i2]);
                        if (b == null) {
                            throw new IllegalStateException();
                        }
                        awwpVarArr2[i2] = b;
                    }
                    awwpVarArr = (awwp[]) dtub.C(null, awwpVarArr2, new awwp[0]);
                } else {
                    awwpVarArr = new awwp[]{f()};
                }
                dtsr.dz(length, awwpVarArr, new emyl() { // from class: bsde
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "rcs_group_join_status:".concat(String.valueOf(bsdg.this.getString(2)));
                    }
                });
                if (di(3)) {
                    if (z) {
                        String[] dt = dt(getString(cM(3, bsdr.a)));
                        int length3 = dt.length;
                        bdpy[] bdpyVarArr2 = new bdpy[length3];
                        for (int i3 = 0; i3 < length3; i3++) {
                            bdpyVarArr2[i3] = bdqb.a(dt[i3]);
                        }
                        bdpyVarArr = (bdpy[]) dtub.C(null, bdpyVarArr2, new bdpy[0]);
                    } else {
                        bdpyVarArr = new bdpy[]{g()};
                    }
                }
                dtsr.dz(length, bdpyVarArr, new emyl() { // from class: bsdf
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "last_modified_by_key:".concat(String.valueOf(bsdg.this.getString(3)));
                    }
                });
                engr engrVar = new engr();
                for (int i4 = 0; i4 < length; i4++) {
                    long j = dB[i4];
                    if (j > 0 && !hashSet.contains(Long.valueOf(j))) {
                        hashSet.add(Long.valueOf(dB[i4]));
                        String[] strArr = bsdr.a;
                        bsco bscoVar = new bsco();
                        bscoVar.aF();
                        bscoVar.aD();
                        long j2 = dB[i4];
                        if (conversationIdTypeArr != null) {
                            bscoVar.d(conversationIdTypeArr[i4]);
                        }
                        if (B != null) {
                            bscoVar.f(B[i4]);
                        }
                        if (awwpVarArr != null) {
                            bscoVar.g(awwpVarArr[i4]);
                        }
                        if (bdpyVarArr != null) {
                            bscoVar.e(bdpyVarArr[i4]);
                        }
                        engrVar.h(bscoVar.a());
                    }
                }
                return engrVar.g();
            }
        }
        int i5 = engw.d;
        return enou.a;
    }

    public final bdpy g() {
        return bdqb.a(getString(cM(3, bsdr.a)));
    }

    @Override // defpackage.dtsu
    public final Cursor a() {
        return this;
    }
}
