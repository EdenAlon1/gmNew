package defpackage;

import android.content.ContentValues;
import android.database.DatabaseUtils;
import defpackage.dtro;
import j$.time.Instant;
import j$.util.Objects;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class bqae extends dtro implements dtrq {
    public long a;
    public cuen b = cuen.b(0);
    public cuef c = cuef.b(0);
    public Instant d = Instant.EPOCH;

    protected bqae() {
    }

    @Override // defpackage.dtro
    public final String a() {
        return String.format(Locale.US, "A2pConversationSubscriptionsTable [participant_id: %s,\n  conversation_toolstone_state: %s,\n  conversation_subscription_state: %s,\n  last_action_timestamp: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c), String.valueOf(this.d));
    }

    @Override // defpackage.dtro
    public final void b(ContentValues contentValues) {
        dtub.t(contentValues, "participant_id", this.a);
        cuen cuenVar = this.b;
        if (cuenVar == null) {
            contentValues.putNull("conversation_toolstone_state");
        } else {
            contentValues.put("conversation_toolstone_state", Integer.valueOf(cuenVar.a()));
        }
        cuef cuefVar = this.c;
        if (cuefVar == null) {
            contentValues.putNull("conversation_subscription_state");
        } else {
            contentValues.put("conversation_subscription_state", Integer.valueOf(cuefVar.a()));
        }
        Instant instant = this.d;
        if (instant == null) {
            contentValues.putNull("last_action_timestamp");
        } else {
            contentValues.put("last_action_timestamp", Long.valueOf(bdgw.a(instant)));
        }
    }

    @Override // defpackage.dtro
    protected final /* bridge */ /* synthetic */ void c(dtsu dtsuVar) {
        bqay bqayVar = (bqay) ((bqat) dtsuVar);
        aB();
        this.cL = bqayVar.cU();
        if (bqayVar.di(0)) {
            this.a = bqayVar.c();
            fY(0);
        }
        if (bqayVar.di(1)) {
            this.b = bqayVar.f();
            fY(1);
        }
        if (bqayVar.di(2)) {
            this.c = bqayVar.e();
            fY(2);
        }
        if (bqayVar.di(3)) {
            this.d = bqayVar.g();
            fY(3);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bqae)) {
            return false;
        }
        bqae bqaeVar = (bqae) obj;
        return super.aD(bqaeVar.cL) && this.a == bqaeVar.a && this.b == bqaeVar.b && this.c == bqaeVar.c && Objects.equals(this.d, bqaeVar.d);
    }

    @Override // defpackage.dtrq
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "a2p_conversation_subscriptions", dtub.m(new String[]{"participant_id", "conversation_toolstone_state", "conversation_subscription_state", "last_action_timestamp"}));
    }

    @Override // defpackage.dtrq
    public final String g() {
        return null;
    }

    @Override // defpackage.dtrq
    public final String h() {
        return "a2p_conversation_subscriptions";
    }

    public final int hashCode() {
        dtsq dtsqVar = this.cL;
        return Objects.hash((dtsqVar == null || dtsqVar.b()) ? null : this.cL, Long.valueOf(this.a), this.b, this.c, this.d, null);
    }

    @Override // defpackage.dtrq
    public final void i(StringBuilder sb, List list) {
        Long valueOf = Long.valueOf(this.a);
        cuen cuenVar = this.b;
        Object valueOf2 = cuenVar == null ? r3 : String.valueOf(cuenVar.a());
        cuef cuefVar = this.c;
        Object[] objArr = {valueOf, valueOf2, cuefVar != null ? String.valueOf(cuefVar.a()) : 0, Long.valueOf(bdgw.a(this.d))};
        sb.append('(');
        for (int i = 0; i < 4; i++) {
            Object obj = objArr[i];
            if (obj instanceof Number) {
                sb.append(String.valueOf(obj));
            } else {
                if (obj instanceof String) {
                    String str = (String) obj;
                    if (str.length() < 12) {
                        sb.append(DatabaseUtils.sqlEscapeString(str));
                    }
                }
                list.add(obj);
                sb.append('?');
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

    public final String toString() {
        return ((dtro.a) ekhw.a(dtub.b, dtro.a.class)).iB().a() ? String.format(Locale.US, "%s", "A2pConversationSubscriptionsTable -- REDACTED") : a();
    }
}
