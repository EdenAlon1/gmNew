package defpackage;

import android.database.Cursor;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class btgo extends dtsr implements btgk {
    @Deprecated
    public btgo(dtve dtveVar, Cursor cursor, String[] strArr, dtzj[] dtzjVarArr, dtyo dtyoVar, dtvs dtvsVar, btgs btgsVar) {
        super(dtveVar, cursor, strArr, dtzjVarArr, btgy.a, dtyoVar, dtvsVar, btgsVar);
    }

    @Override // defpackage.dtsr
    protected final /* synthetic */ dtro b() {
        return new btfx();
    }

    public final azsu c() {
        return azsv.a(getString(cM(1, btgy.a)));
    }

    public final ConversationIdType e() {
        return new ConversationIdType(getLong(cM(0, btgy.a)));
    }

    public final String f() {
        return getString(cM(2, btgy.a));
    }

    @Override // defpackage.dtsr
    public final engw fI(dtvn dtvnVar) {
        ConversationIdType[] conversationIdTypeArr;
        azsu[] azsuVarArr;
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
                    long[] ds = ds(getString(cM(0, btgy.a)));
                    int length2 = ds.length;
                    ConversationIdType[] conversationIdTypeArr2 = new ConversationIdType[length2];
                    for (int i = 0; i < length2; i++) {
                        conversationIdTypeArr2[i] = new ConversationIdType(ds[i]);
                    }
                    conversationIdTypeArr = (ConversationIdType[]) dtub.C(null, conversationIdTypeArr2, new ConversationIdType[0]);
                } else {
                    conversationIdTypeArr = new ConversationIdType[]{e()};
                }
                dtsr.dz(length, conversationIdTypeArr, new emyl() { // from class: btgl
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "conversation_id:".concat(String.valueOf(btgo.this.getString(0)));
                    }
                });
                if (!di(1)) {
                    azsuVarArr = null;
                } else if (z) {
                    String[] dt = dt(getString(cM(1, btgy.a)));
                    int length3 = dt.length;
                    azsu[] azsuVarArr2 = new azsu[length3];
                    for (int i2 = 0; i2 < length3; i2++) {
                        azsuVarArr2[i2] = azsv.a(dt[i2]);
                    }
                    azsuVarArr = (azsu[]) dtub.C(null, azsuVarArr2, new azsu[0]);
                } else {
                    azsuVarArr = new azsu[]{c()};
                }
                dtsr.dz(length, azsuVarArr, new emyl() { // from class: btgm
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "my_identity_token:".concat(String.valueOf(btgo.this.getString(1)));
                    }
                });
                String[] strArr = di(2) ? z ? (String[]) dtub.C(null, dt(getString(cM(2, btgy.a))), new String[0]) : new String[]{f()} : null;
                dtsr.dz(length, strArr, new emyl() { // from class: btgn
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "gemini_conversation_id:".concat(String.valueOf(btgo.this.getString(2)));
                    }
                });
                engr engrVar = new engr();
                for (int i3 = 0; i3 < length; i3++) {
                    long j = dB[i3];
                    if (j > 0 && !hashSet.contains(Long.valueOf(j))) {
                        hashSet.add(Long.valueOf(dB[i3]));
                        String[] strArr2 = btgy.a;
                        btfz btfzVar = new btfz();
                        btfzVar.aF();
                        btfzVar.aD();
                        long j2 = dB[i3];
                        if (conversationIdTypeArr != null) {
                            btfzVar.b(conversationIdTypeArr[i3]);
                        }
                        if (azsuVarArr != null) {
                            btfzVar.d(azsuVarArr[i3]);
                        }
                        if (strArr != null) {
                            btfzVar.c(strArr[i3]);
                        }
                        engrVar.h(btfzVar.a());
                    }
                }
                return engrVar.g();
            }
        }
        int i4 = engw.d;
        return enou.a;
    }

    @Override // defpackage.dtsu
    public final Cursor a() {
        return this;
    }
}
