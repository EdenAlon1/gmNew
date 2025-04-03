package defpackage;

import android.database.Cursor;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ConversationNotificationSettingsTable;
import j$.time.Instant;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class brtb extends dtsr implements brsw {
    @Deprecated
    public brtb(dtve dtveVar, Cursor cursor, String[] strArr, dtzj[] dtzjVarArr, dtyo dtyoVar, dtvs dtvsVar, brte brteVar) {
        super(dtveVar, cursor, strArr, dtzjVarArr, ConversationNotificationSettingsTable.a, dtyoVar, dtvsVar, brteVar);
    }

    @Override // defpackage.dtsr
    protected final /* synthetic */ dtro b() {
        return new brsi();
    }

    public final ConversationIdType c() {
        return new ConversationIdType(getLong(cM(0, ConversationNotificationSettingsTable.a)));
    }

    public final cjcm e() {
        cjcm[] values = cjcm.values();
        int i = getInt(cM(2, ConversationNotificationSettingsTable.a));
        if (i < values.length) {
            return values[i];
        }
        throw new IllegalArgumentException();
    }

    public final cjcn f() {
        cjcn[] values = cjcn.values();
        int i = getInt(cM(3, ConversationNotificationSettingsTable.a));
        if (i < values.length) {
            return values[i];
        }
        throw new IllegalArgumentException();
    }

    @Override // defpackage.dtsr
    public final engw fI(dtvn dtvnVar) {
        ConversationIdType[] conversationIdTypeArr;
        Instant[] instantArr;
        cjcm[] cjcmVarArr;
        dtyq dtyqVar = dtvnVar.a;
        int i = 1;
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
        cjcn[] cjcnVarArr = null;
        if (!di) {
            conversationIdTypeArr = null;
        } else if (z) {
            long[] ds = ds(getString(cM(0, ConversationNotificationSettingsTable.a)));
            int length2 = ds.length;
            ConversationIdType[] conversationIdTypeArr2 = new ConversationIdType[length2];
            for (int i3 = 0; i3 < length2; i3++) {
                conversationIdTypeArr2[i3] = new ConversationIdType(ds[i3]);
            }
            conversationIdTypeArr = (ConversationIdType[]) dtub.C(null, conversationIdTypeArr2, new ConversationIdType[0]);
        } else {
            conversationIdTypeArr = new ConversationIdType[]{c()};
        }
        dtsr.dz(length, conversationIdTypeArr, new emyl() { // from class: brsx
            @Override // defpackage.emyl
            public final Object get() {
                return "conversation_id:".concat(String.valueOf(brtb.this.getString(0)));
            }
        });
        if (!di(1)) {
            instantArr = null;
        } else if (z) {
            long[] ds2 = ds(getString(cM(1, ConversationNotificationSettingsTable.a)));
            int length3 = ds2.length;
            Instant[] instantArr2 = new Instant[length3];
            for (int i4 = 0; i4 < length3; i4++) {
                instantArr2[i4] = bdgw.b(ds2[i4]);
            }
            instantArr = (Instant[]) dtub.C(null, instantArr2, new Instant[0]);
        } else {
            instantArr = new Instant[]{g()};
        }
        dtsr.dz(length, instantArr, new emyl() { // from class: brsy
            @Override // defpackage.emyl
            public final Object get() {
                return "muted_until_timestamp:".concat(String.valueOf(brtb.this.getString(1)));
            }
        });
        if (!di(2)) {
            cjcmVarArr = null;
        } else if (z) {
            int[] dr = dr(getString(cM(2, ConversationNotificationSettingsTable.a)));
            cjcm[] values = cjcm.values();
            int length4 = values.length;
            cjcm[] cjcmVarArr2 = new cjcm[dr.length];
            for (int i5 = 0; i5 < dr.length; i5++) {
                int i6 = dr[i5];
                if (i6 >= length4) {
                    throw new IllegalStateException();
                }
                cjcmVarArr2[i5] = values[i6];
            }
            cjcmVarArr = (cjcm[]) dtub.C(null, cjcmVarArr2, new cjcm[0]);
        } else {
            cjcmVarArr = new cjcm[]{e()};
        }
        dtsr.dz(length, cjcmVarArr, new emyl() { // from class: brsz
            @Override // defpackage.emyl
            public final Object get() {
                return "muted_duration:".concat(String.valueOf(brtb.this.getString(2)));
            }
        });
        if (di(3)) {
            if (z) {
                int[] dr2 = dr(getString(cM(3, ConversationNotificationSettingsTable.a)));
                cjcn[] values2 = cjcn.values();
                int length5 = values2.length;
                cjcn[] cjcnVarArr2 = new cjcn[dr2.length];
                for (int i7 = 0; i7 < dr2.length; i7++) {
                    int i8 = dr2[i7];
                    if (i8 >= length5) {
                        throw new IllegalStateException();
                    }
                    cjcnVarArr2[i7] = values2[i8];
                }
                cjcnVarArr = (cjcn[]) dtub.C(null, cjcnVarArr2, new cjcn[0]);
            } else {
                cjcnVarArr = new cjcn[]{f()};
            }
        }
        dtsr.dz(length, cjcnVarArr, new emyl() { // from class: brta
            @Override // defpackage.emyl
            public final Object get() {
                return "muted_threshold:".concat(String.valueOf(brtb.this.getString(3)));
            }
        });
        engr engrVar = new engr();
        int i9 = 0;
        while (i9 < length) {
            long j = dB[i9];
            if (j > 0 && !hashSet.contains(Long.valueOf(j))) {
                hashSet.add(Long.valueOf(dB[i9]));
                String[] strArr = ConversationNotificationSettingsTable.a;
                brsk brskVar = new brsk();
                brskVar.aF();
                brskVar.aD();
                long j2 = dB[i9];
                if (conversationIdTypeArr != null) {
                    ConversationIdType conversationIdType = conversationIdTypeArr[i9];
                    brskVar.aE(0);
                    brskVar.a = conversationIdType;
                }
                if (instantArr != null) {
                    Instant instant = instantArr[i9];
                    brskVar.aE(i);
                    brskVar.b = instant;
                }
                if (cjcmVarArr != null) {
                    cjcm cjcmVar = cjcmVarArr[i9];
                    brskVar.aE(2);
                    brskVar.c = cjcmVar;
                }
                if (cjcnVarArr != null) {
                    cjcn cjcnVar = cjcnVarArr[i9];
                    brskVar.aE(3);
                    brskVar.d = cjcnVar;
                }
                brsi brsiVar = new brsi();
                brsiVar.aC(brskVar.aB());
                brsiVar.a = brskVar.a;
                brsiVar.b = brskVar.b;
                brsiVar.c = brskVar.c;
                brsiVar.d = brskVar.d;
                brsiVar.cK = brskVar.aC();
                engrVar.h(brsiVar);
            }
            i9++;
            i = 1;
        }
        return engrVar.g();
    }

    public final Instant g() {
        return bdgw.b(getLong(cM(1, ConversationNotificationSettingsTable.a)));
    }

    @Override // defpackage.dtsu
    public final Cursor a() {
        return this;
    }
}
