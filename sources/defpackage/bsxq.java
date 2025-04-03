package defpackage;

import android.database.Cursor;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bsxq extends dtsr implements bsxi {
    @Deprecated
    public bsxq(dtve dtveVar, Cursor cursor, String[] strArr, dtzj[] dtzjVarArr, dtyo dtyoVar, dtvs dtvsVar, bsxv bsxvVar) {
        super(dtveVar, cursor, strArr, dtzjVarArr, bsyb.a, dtyoVar, dtvsVar, bsxvVar);
    }

    @Override // defpackage.dtsr
    protected final /* synthetic */ dtro b() {
        return new bswo();
    }

    public final ydv c() {
        byte[] blob = getBlob(cM(2, bsyb.a));
        if (blob == null) {
            return null;
        }
        try {
            return (ydv) eyfy.parseFrom(ydv.a, blob, eyfc.a());
        } catch (Throwable unused) {
            return ydv.a;
        }
    }

    public final ConversationIdType e() {
        return new ConversationIdType(getLong(cM(0, bsyb.a)));
    }

    public final String f() {
        return getString(cM(5, bsyb.a));
    }

    @Override // defpackage.dtsr
    public final engw fI(dtvn dtvnVar) {
        ConversationIdType[] conversationIdTypeArr;
        ydv[] ydvVarArr;
        ydv ydvVar;
        dtyq dtyqVar = dtvnVar.a;
        long[] dB = dB(getString(dtvnVar.h + 1));
        int length = dB.length;
        if (length != 0) {
            if (length != 1 || dB[0] != -1) {
                HashSet hashSet = new HashSet();
                dtvs dtvsVar = this.d;
                boolean di = di(0);
                boolean z = dtvsVar.b;
                if (!di) {
                    conversationIdTypeArr = null;
                } else if (z) {
                    long[] ds = ds(getString(cM(0, bsyb.a)));
                    int length2 = ds.length;
                    ConversationIdType[] conversationIdTypeArr2 = new ConversationIdType[length2];
                    for (int i = 0; i < length2; i++) {
                        conversationIdTypeArr2[i] = new ConversationIdType(ds[i]);
                    }
                    conversationIdTypeArr = (ConversationIdType[]) dtub.C(null, conversationIdTypeArr2, new ConversationIdType[0]);
                } else {
                    conversationIdTypeArr = new ConversationIdType[]{e()};
                }
                dtsr.dz(length, conversationIdTypeArr, new emyl() { // from class: bsxj
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "conversation_id:".concat(String.valueOf(bsxq.this.getString(0)));
                    }
                });
                String[] strArr = di(1) ? z ? (String[]) dtub.C(null, dt(getString(cM(1, bsyb.a))), new String[0]) : new String[]{h()} : null;
                dtsr.dz(length, strArr, new emyl() { // from class: bsxk
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "text:".concat(String.valueOf(bsxq.this.getString(1)));
                    }
                });
                if (!di(2)) {
                    ydvVarArr = null;
                } else if (z) {
                    List de = de(getString(cM(2, bsyb.a)));
                    ydv[] ydvVarArr2 = new ydv[de.size()];
                    Iterator it = de.iterator();
                    int i2 = 0;
                    while (it.hasNext()) {
                        try {
                            byte[] y = dtub.y((String) it.next());
                            int i3 = i2 + 1;
                            if (y == null) {
                                ydvVar = null;
                            } else {
                                try {
                                    ydvVar = (ydv) eyfy.parseFrom(ydv.a, y);
                                } catch (Throwable unused) {
                                    i2 = i3;
                                    ydvVarArr2[i2] = null;
                                    i2++;
                                }
                            }
                            ydvVarArr2[i2] = ydvVar;
                            i2 = i3;
                        } catch (Throwable unused2) {
                        }
                    }
                    ydvVarArr = (ydv[]) dtub.C(null, ydvVarArr2, new ydv[0]);
                } else {
                    ydvVarArr = new ydv[]{c()};
                }
                dtsr.dz(length, ydvVarArr, new emyl() { // from class: bsxl
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "attachments:".concat(String.valueOf(bsxq.this.getString(2)));
                    }
                });
                String[] strArr2 = di(3) ? z ? (String[]) dtub.C(null, dt(getString(cM(3, bsyb.a))), new String[0]) : new String[]{g()} : null;
                dtsr.dz(length, strArr2, new emyl() { // from class: bsxm
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "subject:".concat(String.valueOf(bsxq.this.getString(3)));
                    }
                });
                boolean[] D = di(4) ? z ? dtub.D(null, du(getString(cM(4, bsyb.a)))) : new boolean[]{j()} : null;
                dtsr.dA(length, D, new emyl() { // from class: bsxn
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "is_urgent:".concat(String.valueOf(bsxq.this.getString(4)));
                    }
                });
                String[] strArr3 = di(5) ? z ? (String[]) dtub.C(null, dt(getString(cM(5, bsyb.a))), new String[0]) : new String[]{f()} : null;
                dtsr.dz(length, strArr3, new emyl() { // from class: bsxo
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "replied_to_message_id:".concat(String.valueOf(bsxq.this.getString(5)));
                    }
                });
                boolean[] D2 = di(6) ? z ? dtub.D(null, du(getString(cM(6, bsyb.a)))) : new boolean[]{i()} : null;
                dtsr.dA(length, D2, new emyl() { // from class: bsxp
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "is_encrypted:".concat(String.valueOf(bsxq.this.getString(6)));
                    }
                });
                engr engrVar = new engr();
                for (int i4 = 0; i4 < length; i4++) {
                    long j = dB[i4];
                    if (j > 0 && !hashSet.contains(Long.valueOf(j))) {
                        hashSet.add(Long.valueOf(dB[i4]));
                        String[] strArr4 = bsyb.a;
                        bswq bswqVar = new bswq();
                        bswqVar.aF();
                        bswqVar.aD();
                        long j2 = dB[i4];
                        if (conversationIdTypeArr != null) {
                            bswqVar.c(conversationIdTypeArr[i4]);
                        }
                        if (strArr != null) {
                            bswqVar.h(strArr[i4]);
                        }
                        if (ydvVarArr != null) {
                            bswqVar.b(ydvVarArr[i4]);
                        }
                        if (strArr2 != null) {
                            bswqVar.g(strArr2[i4]);
                        }
                        if (D != null) {
                            bswqVar.e(D[i4]);
                        }
                        if (strArr3 != null) {
                            bswqVar.f(strArr3[i4]);
                        }
                        if (D2 != null) {
                            bswqVar.d(D2[i4]);
                        }
                        engrVar.h(bswqVar.a());
                    }
                }
                return engrVar.g();
            }
        }
        int i5 = engw.d;
        return enou.a;
    }

    public final String g() {
        return getString(cM(3, bsyb.a));
    }

    public final String h() {
        return getString(cM(1, bsyb.a));
    }

    public final boolean i() {
        return getInt(cM(6, bsyb.a)) == 1;
    }

    public final boolean j() {
        return getInt(cM(4, bsyb.a)) == 1;
    }

    @Override // defpackage.dtsu
    public final Cursor a() {
        return this;
    }
}
