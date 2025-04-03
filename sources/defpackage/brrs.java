package defpackage;

import android.database.Cursor;
import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class brrs extends dtsr implements brrf {
    @Deprecated
    public brrs(dtve dtveVar, Cursor cursor, String[] strArr, dtzj[] dtzjVarArr, dtyo dtyoVar, dtvs dtvsVar, brrx brrxVar) {
        super(dtveVar, cursor, strArr, dtzjVarArr, brsd.a, dtyoVar, dtvsVar, brrxVar);
    }

    @Override // defpackage.dtsr
    protected final /* synthetic */ dtro b() {
        return new brpz();
    }

    @Override // defpackage.brrf
    public final int c() {
        return getInt(cM(2, brsd.a));
    }

    @Override // defpackage.brrf
    public final long e() {
        return getLong(cM(0, brsd.a));
    }

    @Override // defpackage.brrf
    public final MessageIdType f() {
        return new MessageIdType(getLong(cM(3, brsd.a)));
    }

    @Override // defpackage.dtsr
    public final engw fI(dtvn dtvnVar) {
        ConversationIdType[] conversationIdTypeArr;
        int i;
        MessageIdType[] messageIdTypeArr;
        String[] strArr;
        Uri[] uriArr;
        int i2;
        long[] jArr;
        long[] jArr2;
        int[] iArr;
        int[] iArr2;
        int i3;
        int[] iArr3;
        String[] strArr2;
        MessageIdType[] messageIdTypeArr2;
        dtyq dtyqVar = dtvnVar.a;
        long[] dB = dB(getString(dtvnVar.h + 1));
        int length = dB.length;
        if (length == 0 || (length == 1 && dB[0] == -1)) {
            int i4 = engw.d;
            return enou.a;
        }
        HashSet hashSet = new HashSet();
        dtvs dtvsVar = this.d;
        boolean di = di(0);
        boolean z = dtvsVar.b;
        long[] B = di ? z ? dtub.B(null, ds(getString(cM(0, brsd.a)))) : new long[]{e()} : null;
        dtsr.dy(length, B, new emyl() { // from class: brrg
            @Override // defpackage.emyl
            public final Object get() {
                return "_id:".concat(String.valueOf(brrs.this.getString(0)));
            }
        });
        if (!di(1)) {
            conversationIdTypeArr = null;
        } else if (z) {
            long[] ds = ds(getString(cM(1, brsd.a)));
            int length2 = ds.length;
            ConversationIdType[] conversationIdTypeArr2 = new ConversationIdType[length2];
            for (int i5 = 0; i5 < length2; i5++) {
                conversationIdTypeArr2[i5] = new ConversationIdType(ds[i5]);
            }
            conversationIdTypeArr = (ConversationIdType[]) dtub.C(null, conversationIdTypeArr2, new ConversationIdType[0]);
        } else {
            conversationIdTypeArr = new ConversationIdType[]{m()};
        }
        dtsr.dz(length, conversationIdTypeArr, new emyl() { // from class: brrl
            @Override // defpackage.emyl
            public final Object get() {
                return "conversation_id:".concat(String.valueOf(brrs.this.getString(1)));
            }
        });
        int[] z2 = di(2) ? z ? dtub.z(null, dr(getString(cM(2, brsd.a)))) : new int[]{c()} : null;
        dtsr.dx(length, z2, new emyl() { // from class: brrm
            @Override // defpackage.emyl
            public final Object get() {
                return "label:".concat(String.valueOf(brrs.this.getString(2)));
            }
        });
        if (!di(3)) {
            i = length;
            messageIdTypeArr = null;
        } else if (z) {
            long[] ds2 = ds(getString(cM(3, brsd.a)));
            int length3 = ds2.length;
            MessageIdType[] messageIdTypeArr3 = new MessageIdType[length3];
            int i6 = 0;
            while (i6 < length3) {
                messageIdTypeArr3[i6] = new MessageIdType(ds2[i6]);
                i6++;
                length = length;
            }
            i = length;
            messageIdTypeArr = (MessageIdType[]) dtub.C(null, messageIdTypeArr3, new MessageIdType[0]);
        } else {
            i = length;
            messageIdTypeArr = new MessageIdType[]{f()};
        }
        dtsr.dz(i, messageIdTypeArr, new emyl() { // from class: brrn
            @Override // defpackage.emyl
            public final Object get() {
                return "message_id:".concat(String.valueOf(brrs.this.getString(3)));
            }
        });
        if (!di(4)) {
            strArr = null;
        } else if (z) {
            String[] dt = dt(getString(cM(4, brsd.a)));
            for (int i7 = 0; i7 < dt.length; i7++) {
                dt[i7] = cuxs.a(dt[i7]);
            }
            strArr = (String[]) dtub.C(null, dt, new String[0]);
        } else {
            strArr = new String[]{o()};
        }
        dtsr.dz(i, strArr, new emyl() { // from class: brro
            @Override // defpackage.emyl
            public final Object get() {
                return "snippet_text:".concat(String.valueOf(brrs.this.getString(4)));
            }
        });
        if (!di(5)) {
            uriArr = null;
        } else if (z) {
            String[] dt2 = dt(getString(cM(5, brsd.a)));
            int length4 = dt2.length;
            Uri[] uriArr2 = new Uri[length4];
            int i8 = 0;
            int i9 = 0;
            while (i8 < length4) {
                String str = dt2[i8];
                int i10 = i9 + 1;
                uriArr2[i9] = (str == null || str.length() == 0) ? null : Uri.parse(str);
                i8++;
                i9 = i10;
            }
            uriArr = (Uri[]) dtub.C(null, uriArr2, new Uri[0]);
        } else {
            uriArr = new Uri[]{l()};
        }
        dtsr.dz(i, uriArr, new emyl() { // from class: brrp
            @Override // defpackage.emyl
            public final Object get() {
                return "preview_uri:".concat(String.valueOf(brrs.this.getString(5)));
            }
        });
        String[] strArr3 = di(6) ? z ? (String[]) dtub.C(null, dt(getString(cM(6, brsd.a))), new String[0]) : new String[]{n()} : null;
        dtsr.dz(i, strArr3, new emyl() { // from class: brrq
            @Override // defpackage.emyl
            public final Object get() {
                return "preview_content_type:".concat(String.valueOf(brrs.this.getString(6)));
            }
        });
        int[] z3 = di(7) ? z ? dtub.z(null, dr(getString(cM(7, brsd.a)))) : new int[]{j()} : null;
        dtsr.dx(i, z3, new emyl() { // from class: brrr
            @Override // defpackage.emyl
            public final Object get() {
                return "message_status:".concat(String.valueOf(brrs.this.getString(7)));
            }
        });
        boolean[] D = di(8) ? z ? dtub.D(null, du(getString(cM(8, brsd.a)))) : new boolean[]{p()} : null;
        dtsr.dA(i, D, new emyl() { // from class: brrh
            @Override // defpackage.emyl
            public final Object get() {
                return "read:".concat(String.valueOf(brrs.this.getString(8)));
            }
        });
        if (!di(9)) {
            i2 = 0;
            jArr = null;
        } else if (z) {
            i2 = 0;
            jArr = dtub.B(null, ds(getString(cM(9, brsd.a))));
        } else {
            i2 = 0;
            jArr = new long[]{k()};
        }
        dtsr.dy(i, jArr, new emyl() { // from class: brri
            @Override // defpackage.emyl
            public final Object get() {
                return "received_timestamp:".concat(String.valueOf(brrs.this.getString(9)));
            }
        });
        if (!di(10)) {
            jArr2 = dB;
            iArr = null;
        } else if (z) {
            jArr2 = dB;
            iArr = dtub.z(null, dr(getString(cM(10, brsd.a))));
        } else {
            jArr2 = dB;
            iArr = new int[1];
            iArr[i2] = h();
        }
        dtsr.dx(i, iArr, new emyl() { // from class: brrj
            @Override // defpackage.emyl
            public final Object get() {
                return "message_protocol:".concat(String.valueOf(brrs.this.getString(10)));
            }
        });
        if (!di(11)) {
            iArr2 = null;
        } else if (z) {
            iArr2 = dtub.z(null, dr(getString(cM(11, brsd.a))));
        } else {
            iArr2 = new int[1];
            iArr2[i2] = i();
        }
        dtsr.dx(i, iArr2, new emyl() { // from class: brrk
            @Override // defpackage.emyl
            public final Object get() {
                return "raw_telephony_status:".concat(String.valueOf(brrs.this.getString(11)));
            }
        });
        engr engrVar = new engr();
        int i11 = i2;
        while (i11 < i) {
            long j = jArr2[i11];
            if (j > 0) {
                i3 = i11;
                if (!hashSet.contains(Long.valueOf(j))) {
                    hashSet.add(Long.valueOf(jArr2[i3]));
                    String[] strArr4 = brsd.a;
                    brqb brqbVar = new brqb();
                    brqbVar.aF();
                    brqbVar.aD();
                    long j2 = jArr2[i3];
                    iArr3 = iArr;
                    strArr2 = strArr;
                    if (B != null) {
                        long j3 = B[i3];
                        messageIdTypeArr2 = messageIdTypeArr;
                        brqbVar.aE(i2);
                        brqbVar.a = j3;
                    } else {
                        messageIdTypeArr2 = messageIdTypeArr;
                    }
                    if (conversationIdTypeArr != null) {
                        brqbVar.b(conversationIdTypeArr[i3]);
                    }
                    if (z2 != null) {
                        brqbVar.c(z2[i3]);
                    }
                    if (messageIdTypeArr2 != null) {
                        brqbVar.d(messageIdTypeArr2[i3]);
                    }
                    if (strArr2 != null) {
                        brqbVar.j(strArr2[i3]);
                    }
                    if (uriArr != null) {
                        brqbVar.f(uriArr[i3]);
                    }
                    if (strArr3 != null) {
                        brqbVar.e(strArr3[i3]);
                    }
                    if (z3 != null) {
                        brqbVar.k(z3[i3]);
                    }
                    if (D != null) {
                        boolean z4 = D[i3];
                        int i12 = brqbVar.aB;
                        if (i12 < 57050) {
                            dtub.w("read", i12);
                        }
                        brqbVar.aE(8);
                        brqbVar.i = z4;
                    }
                    if (jArr != null) {
                        brqbVar.i(jArr[i3]);
                    }
                    if (iArr3 != null) {
                        brqbVar.g(iArr3[i3]);
                    }
                    if (iArr2 != null) {
                        brqbVar.h(iArr2[i3]);
                    }
                    engrVar.h(brqbVar.a());
                    i11 = i3 + 1;
                    strArr = strArr2;
                    iArr = iArr3;
                    messageIdTypeArr = messageIdTypeArr2;
                    i2 = 0;
                }
            } else {
                i3 = i11;
            }
            iArr3 = iArr;
            strArr2 = strArr;
            messageIdTypeArr2 = messageIdTypeArr;
            i11 = i3 + 1;
            strArr = strArr2;
            iArr = iArr3;
            messageIdTypeArr = messageIdTypeArr2;
            i2 = 0;
        }
        return engrVar.g();
    }

    @Override // defpackage.brrf
    public final engw g() {
        engr engrVar = new engr();
        while (moveToNext()) {
            c();
            engrVar.h(Integer.valueOf(c()));
        }
        return engrVar.g();
    }

    public final int h() {
        return getInt(cM(10, brsd.a));
    }

    public final int i() {
        return getInt(cM(11, brsd.a));
    }

    public final int j() {
        return getInt(cM(7, brsd.a));
    }

    public final long k() {
        return getLong(cM(9, brsd.a));
    }

    public final Uri l() {
        String string = getString(cM(5, brsd.a));
        if (string == null) {
            return null;
        }
        return Uri.parse(string);
    }

    public final ConversationIdType m() {
        return new ConversationIdType(getLong(cM(1, brsd.a)));
    }

    public final String n() {
        return getString(cM(6, brsd.a));
    }

    public final String o() {
        return cuxs.a(getString(cM(4, brsd.a)));
    }

    public final boolean p() {
        return getInt(cM(8, brsd.a)) == 1;
    }

    @Override // defpackage.dtsu
    public final Cursor a() {
        return this;
    }
}
