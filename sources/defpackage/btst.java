package defpackage;

import android.database.Cursor;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class btst extends dtsr implements btsn {
    @Deprecated
    public btst(dtve dtveVar, Cursor cursor, String[] strArr, dtzj[] dtzjVarArr, dtyo dtyoVar, dtvs dtvsVar, btsz btszVar) {
        super(dtveVar, cursor, strArr, dtzjVarArr, bttf.a, dtyoVar, dtvsVar, btszVar);
    }

    @Override // defpackage.dtsr
    protected final /* synthetic */ dtro b() {
        return new btrx();
    }

    @Override // defpackage.btsn
    public final engw c() {
        engr engrVar = new engr();
        while (moveToNext()) {
            h();
            engrVar.h(h());
        }
        return engrVar.g();
    }

    @Override // defpackage.btsn
    public final String e() {
        return getString(cM(0, bttf.a));
    }

    public final int f() {
        return getInt(cM(3, bttf.a));
    }

    @Override // defpackage.dtsr
    public final engw fI(dtvn dtvnVar) {
        ConversationIdType[] conversationIdTypeArr;
        MessageIdType[] messageIdTypeArr;
        fbuk fbukVar;
        dtyq dtyqVar = dtvnVar.a;
        long[] dB = dB(getString(dtvnVar.h + 1));
        int length = dB.length;
        if (length == 0 || (length == 1 && dB[0] == -1)) {
            int i = engw.d;
            return enou.a;
        }
        HashSet hashSet = new HashSet();
        dtvs dtvsVar = this.d;
        boolean di = di(0);
        boolean z = dtvsVar.b;
        fbuk[] fbukVarArr = null;
        String[] strArr = di ? z ? (String[]) dtub.C(null, dt(getString(cM(0, bttf.a))), new String[0]) : new String[]{e()} : null;
        dtsr.dz(length, strArr, new emyl() { // from class: btso
            @Override // defpackage.emyl
            public final Object get() {
                return "_id:".concat(String.valueOf(btst.this.getString(0)));
            }
        });
        if (!di(1)) {
            conversationIdTypeArr = null;
        } else if (z) {
            String[] dt = dt(getString(cM(1, bttf.a)));
            int length2 = dt.length;
            ConversationIdType[] conversationIdTypeArr2 = new ConversationIdType[length2];
            for (int i2 = 0; i2 < length2; i2++) {
                conversationIdTypeArr2[i2] = bdgq.b(dt[i2]);
            }
            conversationIdTypeArr = (ConversationIdType[]) dtub.C(null, conversationIdTypeArr2, new ConversationIdType[0]);
        } else {
            conversationIdTypeArr = new ConversationIdType[]{g()};
        }
        dtsr.dz(length, conversationIdTypeArr, new emyl() { // from class: btsp
            @Override // defpackage.emyl
            public final Object get() {
                return "conversation_id:".concat(String.valueOf(btst.this.getString(1)));
            }
        });
        if (!di(2)) {
            messageIdTypeArr = null;
        } else if (z) {
            long[] ds = ds(getString(cM(2, bttf.a)));
            int length3 = ds.length;
            MessageIdType[] messageIdTypeArr2 = new MessageIdType[length3];
            for (int i3 = 0; i3 < length3; i3++) {
                messageIdTypeArr2[i3] = new MessageIdType(ds[i3]);
            }
            messageIdTypeArr = (MessageIdType[]) dtub.C(null, messageIdTypeArr2, new MessageIdType[0]);
        } else {
            messageIdTypeArr = new MessageIdType[]{h()};
        }
        dtsr.dz(length, messageIdTypeArr, new emyl() { // from class: btsq
            @Override // defpackage.emyl
            public final Object get() {
                return "message_id:".concat(String.valueOf(btst.this.getString(2)));
            }
        });
        int[] z2 = di(3) ? z ? dtub.z(null, dr(getString(cM(3, bttf.a)))) : new int[]{f()} : null;
        dtsr.dx(length, z2, new emyl() { // from class: btsr
            @Override // defpackage.emyl
            public final Object get() {
                return "annotation_type:".concat(String.valueOf(btst.this.getString(3)));
            }
        });
        if (di(4)) {
            if (z) {
                List de = de(getString(cM(4, bttf.a)));
                fbuk[] fbukVarArr2 = new fbuk[de.size()];
                Iterator it = de.iterator();
                int i4 = 0;
                while (it.hasNext()) {
                    try {
                        byte[] y = dtub.y((String) it.next());
                        int i5 = i4 + 1;
                        if (y == null) {
                            fbukVar = null;
                        } else {
                            try {
                                fbukVar = (fbuk) eyfy.parseFrom(fbuk.a, y);
                            } catch (Throwable unused) {
                                i4 = i5;
                                fbukVarArr2[i4] = null;
                                i4++;
                            }
                        }
                        fbukVarArr2[i4] = fbukVar;
                        i4 = i5;
                    } catch (Throwable unused2) {
                    }
                }
                fbukVarArr = (fbuk[]) dtub.C(null, fbukVarArr2, new fbuk[0]);
            } else {
                fbukVarArr = new fbuk[]{i()};
            }
        }
        dtsr.dz(length, fbukVarArr, new emyl() { // from class: btss
            @Override // defpackage.emyl
            public final Object get() {
                return "annotation_details:".concat(String.valueOf(btst.this.getString(4)));
            }
        });
        engr engrVar = new engr();
        for (int i6 = 0; i6 < length; i6++) {
            long j = dB[i6];
            if (j > 0 && !hashSet.contains(Long.valueOf(j))) {
                hashSet.add(Long.valueOf(dB[i6]));
                String[] strArr2 = bttf.a;
                btrz btrzVar = new btrz();
                btrzVar.aF();
                btrzVar.aD();
                long j2 = dB[i6];
                if (strArr != null) {
                    String str = strArr[i6];
                    btrzVar.aE(0);
                    btrzVar.a = str;
                }
                if (conversationIdTypeArr != null) {
                    btrzVar.d(conversationIdTypeArr[i6]);
                }
                if (messageIdTypeArr != null) {
                    btrzVar.e(messageIdTypeArr[i6]);
                }
                if (z2 != null) {
                    btrzVar.c(z2[i6]);
                }
                if (fbukVarArr != null) {
                    btrzVar.b(fbukVarArr[i6]);
                }
                engrVar.h(btrzVar.a());
            }
        }
        return engrVar.g();
    }

    public final ConversationIdType g() {
        return bdgq.b(getString(cM(1, bttf.a)));
    }

    public final MessageIdType h() {
        return new MessageIdType(getLong(cM(2, bttf.a)));
    }

    public final fbuk i() {
        byte[] blob = getBlob(cM(4, bttf.a));
        if (blob == null) {
            return null;
        }
        try {
            return (fbuk) eyfy.parseFrom(fbuk.a, blob, eyfc.a());
        } catch (Throwable unused) {
            return fbuk.a;
        }
    }

    @Override // defpackage.dtsu
    public final Cursor a() {
        return this;
    }
}
