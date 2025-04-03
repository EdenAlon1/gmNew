package defpackage;

import android.database.Cursor;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bqfo extends dtsr implements bqfh {
    @Deprecated
    public bqfo(dtve dtveVar, Cursor cursor, String[] strArr, dtzj[] dtzjVarArr, dtyo dtyoVar, dtvs dtvsVar, bqfr bqfrVar) {
        super(dtveVar, cursor, strArr, dtzjVarArr, bqfx.a, dtyoVar, dtvsVar, bqfrVar);
    }

    @Override // defpackage.dtsr
    protected final /* synthetic */ dtro b() {
        return new bqep();
    }

    public final int c() {
        return getInt(cM(3, bqfx.a));
    }

    public final long e() {
        return getLong(cM(5, bqfx.a));
    }

    public final long f() {
        return getLong(cM(0, bqfx.a));
    }

    @Override // defpackage.dtsr
    public final engw fI(dtvn dtvnVar) {
        ConversationIdType[] conversationIdTypeArr;
        aven[] avenVarArr;
        avji[] avjiVarArr;
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
                long[] B = di ? z ? dtub.B(null, ds(getString(cM(0, bqfx.a)))) : new long[]{f()} : null;
                dtsr.dy(length, B, new emyl() { // from class: bqfi
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "_id:".concat(String.valueOf(bqfo.this.getString(0)));
                    }
                });
                if (!di(1)) {
                    conversationIdTypeArr = null;
                } else if (z) {
                    long[] ds = ds(getString(cM(1, bqfx.a)));
                    int length2 = ds.length;
                    ConversationIdType[] conversationIdTypeArr2 = new ConversationIdType[length2];
                    for (int i2 = 0; i2 < length2; i2++) {
                        conversationIdTypeArr2[i2] = new ConversationIdType(ds[i2]);
                    }
                    conversationIdTypeArr = (ConversationIdType[]) dtub.C(null, conversationIdTypeArr2, new ConversationIdType[0]);
                } else {
                    conversationIdTypeArr = new ConversationIdType[]{i()};
                }
                dtsr.dz(length, conversationIdTypeArr, new emyl() { // from class: bqfj
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "conversation_id:".concat(String.valueOf(bqfo.this.getString(1)));
                    }
                });
                if (!di(2)) {
                    avenVarArr = null;
                } else if (z) {
                    int[] dr = dr(getString(cM(2, bqfx.a)));
                    aven[] avenVarArr2 = new aven[dr.length];
                    for (int i3 = 0; i3 < dr.length; i3++) {
                        aven b = aven.b(dr[i3]);
                        if (b == null) {
                            throw new IllegalStateException();
                        }
                        avenVarArr2[i3] = b;
                    }
                    avenVarArr = (aven[]) dtub.C(null, avenVarArr2, new aven[0]);
                } else {
                    avenVarArr = new aven[]{g()};
                }
                dtsr.dz(length, avenVarArr, new emyl() { // from class: bqfk
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "chatbot_directory_conversation_state:".concat(String.valueOf(bqfo.this.getString(2)));
                    }
                });
                int[] z2 = di(3) ? z ? dtub.z(null, dr(getString(cM(3, bqfx.a)))) : new int[]{c()} : null;
                dtsr.dx(length, z2, new emyl() { // from class: bqfl
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "conversation_stop_state:".concat(String.valueOf(bqfo.this.getString(3)));
                    }
                });
                if (!di(4)) {
                    avjiVarArr = null;
                } else if (z) {
                    int[] dr2 = dr(getString(cM(4, bqfx.a)));
                    avji[] avjiVarArr2 = new avji[dr2.length];
                    for (int i4 = 0; i4 < dr2.length; i4++) {
                        avji b2 = avji.b(dr2[i4]);
                        if (b2 == null) {
                            throw new IllegalStateException();
                        }
                        avjiVarArr2[i4] = b2;
                    }
                    avjiVarArr = (avji[]) dtub.C(null, avjiVarArr2, new avji[0]);
                } else {
                    avjiVarArr = new avji[]{h()};
                }
                dtsr.dz(length, avjiVarArr, new emyl() { // from class: bqfm
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "conversation_toolstone_state:".concat(String.valueOf(bqfo.this.getString(4)));
                    }
                });
                long[] B2 = di(5) ? z ? dtub.B(null, ds(getString(cM(5, bqfx.a)))) : new long[]{e()} : null;
                dtsr.dy(length, B2, new emyl() { // from class: bqfn
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "conversation_toolstone_timestamp_ms:".concat(String.valueOf(bqfo.this.getString(5)));
                    }
                });
                engr engrVar = new engr();
                int i5 = 0;
                while (i5 < length) {
                    long j = dB[i5];
                    if (j > 0 && !hashSet.contains(Long.valueOf(j))) {
                        hashSet.add(Long.valueOf(dB[i5]));
                        String[] strArr = bqfx.a;
                        bqer bqerVar = new bqer();
                        bqerVar.aF();
                        bqerVar.aD();
                        long j2 = dB[i5];
                        if (B != null) {
                            long j3 = B[i5];
                            bqerVar.aE(i);
                            bqerVar.a = j3;
                        }
                        if (conversationIdTypeArr != null) {
                            bqerVar.c(conversationIdTypeArr[i5]);
                        }
                        if (avenVarArr != null) {
                            bqerVar.b(avenVarArr[i5]);
                        }
                        if (z2 != null) {
                            int i6 = z2[i5];
                            int i7 = bqerVar.aB;
                            if (i7 < 59010) {
                                dtub.w("conversation_stop_state", i7);
                            }
                            bqerVar.aE(3);
                            bqerVar.d = i6;
                        }
                        if (avjiVarArr != null) {
                            bqerVar.d(avjiVarArr[i5]);
                        }
                        if (B2 != null) {
                            bqerVar.e(B2[i5]);
                        }
                        engrVar.h(bqerVar.a());
                    }
                    i5++;
                    i = 0;
                }
                return engrVar.g();
            }
        }
        int i8 = engw.d;
        return enou.a;
    }

    public final aven g() {
        return aven.b(getInt(cM(2, bqfx.a)));
    }

    public final avji h() {
        return avji.b(getInt(cM(4, bqfx.a)));
    }

    public final ConversationIdType i() {
        return new ConversationIdType(getLong(cM(1, bqfx.a)));
    }

    @Override // defpackage.dtsu
    public final Cursor a() {
        return this;
    }
}
