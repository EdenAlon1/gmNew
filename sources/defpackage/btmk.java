package defpackage;

import android.database.Cursor;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class btmk extends dtsr implements btma {
    @Deprecated
    public btmk(dtve dtveVar, Cursor cursor, String[] strArr, dtzj[] dtzjVarArr, dtyo dtyoVar, dtvs dtvsVar, btmo btmoVar) {
        super(dtveVar, cursor, strArr, dtzjVarArr, btmu.a, dtyoVar, dtvsVar, btmoVar);
    }

    @Override // defpackage.dtsr
    protected final /* synthetic */ dtro b() {
        return new btlc();
    }

    @Override // defpackage.btma
    public final engw c() {
        engr engrVar = new engr();
        while (moveToNext()) {
            h();
            engrVar.h(h());
        }
        return engrVar.g();
    }

    public final long e() {
        return getLong(cM(0, btmu.a));
    }

    public final long f() {
        return getLong(cM(7, btmu.a));
    }

    @Override // defpackage.dtsr
    public final engw fI(dtvn dtvnVar) {
        ConversationIdType[] conversationIdTypeArr;
        long[] jArr;
        cgiz[] cgizVarArr;
        char c;
        long[] jArr2;
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
                long[] B = di ? z ? dtub.B(null, ds(getString(cM(0, btmu.a)))) : new long[]{e()} : null;
                dtsr.dy(length, B, new emyl() { // from class: btmb
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "_id:".concat(String.valueOf(btmk.this.getString(0)));
                    }
                });
                if (!di(1)) {
                    conversationIdTypeArr = null;
                } else if (z) {
                    long[] ds = ds(getString(cM(1, btmu.a)));
                    int length2 = ds.length;
                    ConversationIdType[] conversationIdTypeArr2 = new ConversationIdType[length2];
                    for (int i2 = 0; i2 < length2; i2++) {
                        conversationIdTypeArr2[i2] = new ConversationIdType(ds[i2]);
                    }
                    conversationIdTypeArr = (ConversationIdType[]) dtub.C(null, conversationIdTypeArr2, new ConversationIdType[0]);
                } else {
                    conversationIdTypeArr = new ConversationIdType[]{h()};
                }
                dtsr.dz(length, conversationIdTypeArr, new emyl() { // from class: btmc
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "conversation_id:".concat(String.valueOf(btmk.this.getString(1)));
                    }
                });
                String[] strArr = di(2) ? z ? (String[]) dtub.C(null, dt(getString(cM(2, btmu.a))), new String[0]) : new String[]{j()} : null;
                dtsr.dz(length, strArr, new emyl() { // from class: btmd
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "business_id:".concat(String.valueOf(btmk.this.getString(2)));
                    }
                });
                String[] strArr2 = di(3) ? z ? (String[]) dtub.C(null, dt(getString(cM(3, btmu.a))), new String[0]) : new String[]{k()} : null;
                dtsr.dz(length, strArr2, new emyl() { // from class: btme
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "lighter_conversation_id_json:".concat(String.valueOf(btmk.this.getString(3)));
                    }
                });
                boolean[] D = di(4) ? z ? dtub.D(null, du(getString(cM(4, btmu.a)))) : new boolean[]{m()} : null;
                dtsr.dA(length, D, new emyl() { // from class: btmf
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "read:".concat(String.valueOf(btmk.this.getString(4)));
                    }
                });
                boolean[] D2 = di(5) ? z ? dtub.D(null, du(getString(cM(5, btmu.a)))) : new boolean[]{l()} : null;
                dtsr.dA(length, D2, new emyl() { // from class: btmg
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "is_last_message_outgoing:".concat(String.valueOf(btmk.this.getString(5)));
                    }
                });
                if (!di(6)) {
                    jArr = dB;
                    cgizVarArr = null;
                } else if (z) {
                    int[] dr = dr(getString(cM(6, btmu.a)));
                    cgiz[] values = cgiz.values();
                    int length3 = values.length;
                    cgiz[] cgizVarArr2 = new cgiz[dr.length];
                    jArr = dB;
                    for (int i3 = 0; i3 < dr.length; i3++) {
                        int i4 = dr[i3];
                        if (i4 >= length3) {
                            throw new IllegalStateException();
                        }
                        cgizVarArr2[i3] = values[i4];
                    }
                    cgizVarArr = (cgiz[]) dtub.C(null, cgizVarArr2, new cgiz[0]);
                } else {
                    jArr = dB;
                    cgizVarArr = new cgiz[]{i()};
                }
                dtsr.dz(length, cgizVarArr, new emyl() { // from class: btmh
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "conversation_status:".concat(String.valueOf(btmk.this.getString(6)));
                    }
                });
                char c2 = 7;
                long[] B2 = di(7) ? z ? dtub.B(null, ds(getString(cM(7, btmu.a)))) : new long[]{f()} : null;
                dtsr.dy(length, B2, new emyl() { // from class: btmi
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "last_action_timestamp:".concat(String.valueOf(btmk.this.getString(7)));
                    }
                });
                long[] B3 = di(8) ? z ? dtub.B(null, ds(getString(cM(8, btmu.a)))) : new long[]{g()} : null;
                dtsr.dy(length, B3, new emyl() { // from class: btmj
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "sync_timestamp_ms:".concat(String.valueOf(btmk.this.getString(8)));
                    }
                });
                engr engrVar = new engr();
                int i5 = 0;
                while (i5 < length) {
                    long j = jArr[i5];
                    if (j <= 0 || hashSet.contains(Long.valueOf(j))) {
                        c = c2;
                        jArr2 = B2;
                        i = length;
                    } else {
                        hashSet.add(Long.valueOf(jArr[i5]));
                        String[] strArr3 = btmu.a;
                        btle btleVar = new btle();
                        btleVar.aF();
                        btleVar.aD();
                        long j2 = jArr[i5];
                        jArr2 = B2;
                        if (B != null) {
                            long j3 = B[i5];
                            btleVar.aE(0);
                            btleVar.a = j3;
                        }
                        if (conversationIdTypeArr != null) {
                            btleVar.c(conversationIdTypeArr[i5]);
                        }
                        if (strArr != null) {
                            btleVar.b(strArr[i5]);
                        }
                        if (strArr2 != null) {
                            btleVar.e(strArr2[i5]);
                        }
                        if (D != null) {
                            btleVar.f(D[i5]);
                        }
                        if (D2 != null) {
                            btleVar.d(D2[i5]);
                        }
                        if (cgizVarArr != null) {
                            cgiz cgizVar = cgizVarArr[i5];
                            int i6 = btleVar.aB;
                            if (i6 < 59030) {
                                dtub.w("conversation_status", i6);
                            }
                            btleVar.aE(6);
                            btleVar.g = cgizVar;
                        }
                        if (jArr2 != null) {
                            long j4 = jArr2[i5];
                            int i7 = btleVar.aB;
                            i = length;
                            if (i7 < 59040) {
                                dtub.w("last_action_timestamp", i7);
                            }
                            c = 7;
                            btleVar.aE(7);
                            btleVar.h = j4;
                        } else {
                            i = length;
                            c = 7;
                        }
                        if (B3 != null) {
                            btleVar.g(B3[i5]);
                        }
                        engrVar.h(btleVar.a());
                    }
                    i5++;
                    c2 = c;
                    B2 = jArr2;
                    length = i;
                }
                return engrVar.g();
            }
        }
        int i8 = engw.d;
        return enou.a;
    }

    public final long g() {
        return getLong(cM(8, btmu.a));
    }

    public final ConversationIdType h() {
        return new ConversationIdType(getLong(cM(1, btmu.a)));
    }

    public final cgiz i() {
        cgiz[] values = cgiz.values();
        int i = getInt(cM(6, btmu.a));
        if (i < values.length) {
            return values[i];
        }
        throw new IllegalArgumentException();
    }

    public final String j() {
        return getString(cM(2, btmu.a));
    }

    public final String k() {
        return getString(cM(3, btmu.a));
    }

    public final boolean l() {
        return getInt(cM(5, btmu.a)) == 1;
    }

    public final boolean m() {
        return getInt(cM(4, btmu.a)) == 1;
    }

    @Override // defpackage.dtsu
    public final Cursor a() {
        return this;
    }
}
