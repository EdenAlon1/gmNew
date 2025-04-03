package defpackage;

import android.content.ContentValues;
import android.database.DatabaseUtils;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import defpackage.dtro;
import j$.util.Objects;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class buis extends dtro implements dtrq {
    public long a;
    public MessageIdType b = bdhb.a;
    public ConversationIdType c = bdgq.a;
    public int d = 0;
    public float e = 0.0f;
    public erer f = erer.SPAM;
    public String g = "";
    public long h = 0;
    public erdy i = erdy.UNKNOWN_DETECTION_TRIGGER_TYPE;
    public fbcx j = fbcx.UNKNOWN_SPAM_VERDICT_ENFORCEMENT_ACTION;
    public int k = 0;
    public eres l = eres.UNKNOWN_SPAM_ERROR;
    public int m = 0;

    protected buis() {
    }

    @Override // defpackage.dtro
    public final String a() {
        return String.format(Locale.US, "MessageSpamTable [_id: %s,\n  message_id: %s,\n  conversation_id: %s,\n  source: %s,\n  score: %s,\n  outcome: %s,\n  ares_initiated_by: %s,\n  classification_timestamp: %s,\n  trigger: %s,\n  action_type: %s,\n  action_contributors: %s,\n  error_code: %s,\n  reclassification_index: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c), String.valueOf(this.d), String.valueOf(this.e), String.valueOf(this.f), String.valueOf(this.g), String.valueOf(this.h), String.valueOf(this.i), String.valueOf(this.j), String.valueOf(this.k), String.valueOf(this.l), String.valueOf(this.m));
    }

    @Override // defpackage.dtro
    public final void b(ContentValues contentValues) {
        int intValue = buld.c().intValue();
        MessageIdType messageIdType = this.b;
        if (messageIdType == null || messageIdType.equals(bdhb.a)) {
            contentValues.putNull("message_id");
        } else {
            contentValues.put("message_id", Long.valueOf(bdhb.a(this.b)));
        }
        if (intValue >= 59460) {
            ConversationIdType conversationIdType = this.c;
            if (conversationIdType == null || conversationIdType.equals(bdgq.a)) {
                contentValues.putNull("conversation_id");
            } else {
                contentValues.put("conversation_id", Long.valueOf(bdgq.a(this.c)));
            }
        }
        contentValues.put("source", Integer.valueOf(this.d));
        if (intValue >= 45040) {
            contentValues.put("score", Float.valueOf(this.e));
        }
        if (intValue >= 58030) {
            erer ererVar = this.f;
            if (ererVar == null) {
                contentValues.putNull("outcome");
            } else {
                contentValues.put("outcome", Integer.valueOf(ererVar.a()));
            }
        }
        if (intValue >= 58100) {
            dtub.u(contentValues, "ares_initiated_by", this.g);
        }
        if (intValue >= 59190) {
            contentValues.put("classification_timestamp", Long.valueOf(this.h));
        }
        if (intValue >= 59460) {
            erdy erdyVar = this.i;
            if (erdyVar == null) {
                contentValues.putNull("trigger");
            } else {
                contentValues.put("trigger", Integer.valueOf(erdyVar.a()));
            }
        }
        if (intValue >= 59460) {
            fbcx fbcxVar = this.j;
            if (fbcxVar == null) {
                contentValues.putNull("action_type");
            } else {
                contentValues.put("action_type", Integer.valueOf(fbcxVar.a()));
            }
        }
        if (intValue >= 59460) {
            contentValues.put("action_contributors", Integer.valueOf(this.k));
        }
        if (intValue >= 59460) {
            eres eresVar = this.l;
            if (eresVar == null) {
                contentValues.putNull("error_code");
            } else {
                contentValues.put("error_code", Integer.valueOf(eresVar.a()));
            }
        }
        if (intValue >= 59460) {
            contentValues.put("reclassification_index", Integer.valueOf(this.m));
        }
    }

    @Override // defpackage.dtro
    protected final /* bridge */ /* synthetic */ void c(dtsu dtsuVar) {
        buko bukoVar = (buko) ((buka) dtsuVar);
        aB();
        this.cL = bukoVar.cU();
        if (bukoVar.di(0)) {
            this.a = bukoVar.k();
            fY(0);
        }
        if (bukoVar.di(1)) {
            this.b = bukoVar.m();
            fY(1);
        }
        if (bukoVar.di(2)) {
            this.c = bukoVar.l();
            fY(2);
        }
        if (bukoVar.di(3)) {
            this.d = bukoVar.i();
            fY(3);
        }
        if (bukoVar.di(4)) {
            this.e = bukoVar.f();
            fY(4);
        }
        if (bukoVar.di(5)) {
            this.f = bukoVar.o();
            fY(5);
        }
        if (bukoVar.di(6)) {
            this.g = bukoVar.r();
            fY(6);
        }
        if (bukoVar.di(7)) {
            this.h = bukoVar.j();
            fY(7);
        }
        if (bukoVar.di(8)) {
            this.i = bukoVar.n();
            fY(8);
        }
        if (bukoVar.di(9)) {
            this.j = bukoVar.q();
            fY(9);
        }
        if (bukoVar.di(10)) {
            this.k = bukoVar.g();
            fY(10);
        }
        if (bukoVar.di(11)) {
            this.l = bukoVar.p();
            fY(11);
        }
        if (bukoVar.di(12)) {
            this.m = bukoVar.h();
            fY(12);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof buis)) {
            return false;
        }
        buis buisVar = (buis) obj;
        return super.aD(buisVar.cL) && this.a == buisVar.a && Objects.equals(this.b, buisVar.b) && Objects.equals(this.c, buisVar.c) && this.d == buisVar.d && this.e == buisVar.e && this.f == buisVar.f && Objects.equals(this.g, buisVar.g) && this.h == buisVar.h && this.i == buisVar.i && this.j == buisVar.j && this.k == buisVar.k && this.l == buisVar.l && this.m == buisVar.m;
    }

    @Override // defpackage.dtrq
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "message_spam", dtub.m(new String[]{"message_id", "conversation_id", "source", "score", "outcome", "ares_initiated_by", "classification_timestamp", "trigger", "action_type", "action_contributors", "error_code", "reclassification_index"}));
    }

    @Override // defpackage.dtrq
    public final String g() {
        return "_id";
    }

    @Override // defpackage.dtrq
    public final String h() {
        return "message_spam";
    }

    public final int hashCode() {
        dtsq dtsqVar = this.cL;
        return Objects.hash((dtsqVar == null || dtsqVar.b()) ? null : this.cL, Long.valueOf(this.a), this.b, this.c, Integer.valueOf(this.d), Float.valueOf(this.e), this.f, this.g, Long.valueOf(this.h), this.i, this.j, Integer.valueOf(this.k), this.l, Integer.valueOf(this.m), null);
    }

    @Override // defpackage.dtrq
    public final void i(StringBuilder sb, List list) {
        Object obj = new buiq(this).get();
        Object obj2 = new buir(this).get();
        Integer valueOf = Integer.valueOf(this.d);
        Float valueOf2 = Float.valueOf(this.e);
        erer ererVar = this.f;
        Object valueOf3 = ererVar == null ? r8 : String.valueOf(ererVar.a());
        String str = this.g;
        Long valueOf4 = Long.valueOf(this.h);
        erdy erdyVar = this.i;
        Object valueOf5 = erdyVar == null ? r8 : String.valueOf(erdyVar.a());
        fbcx fbcxVar = this.j;
        Object valueOf6 = fbcxVar == null ? r8 : String.valueOf(fbcxVar.a());
        Integer valueOf7 = Integer.valueOf(this.k);
        eres eresVar = this.l;
        Object[] objArr = {obj, obj2, valueOf, valueOf2, valueOf3, str, valueOf4, valueOf5, valueOf6, valueOf7, eresVar != null ? String.valueOf(eresVar.a()) : 0, Integer.valueOf(this.m)};
        sb.append('(');
        for (int i = 0; i < 12; i++) {
            Object obj3 = objArr[i];
            if (obj3 instanceof Number) {
                sb.append(String.valueOf(obj3));
            } else {
                if (obj3 instanceof String) {
                    String str2 = (String) obj3;
                    if (str2.length() < 12) {
                        sb.append(DatabaseUtils.sqlEscapeString(str2));
                    }
                }
                list.add(obj3);
                sb.append('?');
                sb.append(',');
            }
            sb.append(',');
        }
        sb.setLength(sb.length() - 1);
        sb.append(')');
    }

    @Override // defpackage.dtrq
    @Deprecated
    public final /* bridge */ /* synthetic */ Object j() {
        throw null;
    }

    public final float k() {
        az(4, "score");
        return this.e;
    }

    public final int l() {
        az(10, "action_contributors");
        return this.k;
    }

    public final int m() {
        az(12, "reclassification_index");
        return this.m;
    }

    public final int n() {
        az(3, "source");
        return this.d;
    }

    public final long o() {
        az(7, "classification_timestamp");
        return this.h;
    }

    public final MessageIdType q() {
        az(1, "message_id");
        return this.b;
    }

    public final erdy r() {
        az(8, "trigger");
        return this.i;
    }

    public final erer s() {
        az(5, "outcome");
        return this.f;
    }

    public final eres t() {
        az(11, "error_code");
        return this.l;
    }

    public final String toString() {
        return ((dtro.a) ekhw.a(dtub.b, dtro.a.class)).iB().a() ? String.format(Locale.US, "%s", "MessageSpamTable -- REDACTED") : a();
    }

    public final fbcx u() {
        az(9, "action_type");
        return this.j;
    }

    public final String v() {
        az(6, "ares_initiated_by");
        return this.g;
    }
}
