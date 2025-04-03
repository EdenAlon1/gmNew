package defpackage;

import android.content.ContentValues;
import android.database.DatabaseUtils;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import defpackage.dtro;
import j$.util.Objects;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class bvdf extends dtro implements dtrq {
    public String a;
    public MessageIdType b = bdhb.a;
    public long c = 0;
    public eoqz d = eoqz.b(0);
    public epjp e = epjp.b(0);
    public fbqx f = fbqx.b(0);
    public fbqp g = fbqp.b(0);
    public int h;
    public int i;
    public String j;
    public String k;
    public String l;

    protected bvdf() {
    }

    @Override // defpackage.dtro
    public final String a() {
        return String.format(Locale.US, "P2pConversationSuggestionEventTable [id: %s,\n  message_id: %s,\n  timestamp: %s,\n  event_type: %s,\n  reply_mode: %s,\n  rejection_reason: %s,\n  action_source: %s,\n  num_of_items: %s,\n  click_index: %s,\n  impression_id: %s,\n  suggestion_types: %s,\n  model_output_label: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c), String.valueOf(this.d), String.valueOf(this.e), String.valueOf(this.f), String.valueOf(this.g), String.valueOf(this.h), String.valueOf(this.i), String.valueOf(this.j), String.valueOf(this.k), String.valueOf(this.l));
    }

    @Override // defpackage.dtro
    public final void b(ContentValues contentValues) {
        int intValue = bvfh.c().intValue();
        if (intValue >= 51030) {
            MessageIdType messageIdType = this.b;
            if (messageIdType == null || messageIdType.equals(bdhb.a)) {
                contentValues.putNull("message_id");
            } else {
                contentValues.put("message_id", Long.valueOf(bdhb.a(this.b)));
            }
        }
        contentValues.put("timestamp", Long.valueOf(this.c));
        eoqz eoqzVar = this.d;
        if (eoqzVar == null) {
            contentValues.putNull("event_type");
        } else {
            contentValues.put("event_type", Integer.valueOf(eoqzVar.i));
        }
        epjp epjpVar = this.e;
        if (epjpVar == null) {
            contentValues.putNull("reply_mode");
        } else {
            contentValues.put("reply_mode", Integer.valueOf(epjpVar.d));
        }
        fbqx fbqxVar = this.f;
        if (fbqxVar == null) {
            contentValues.putNull("rejection_reason");
        } else {
            contentValues.put("rejection_reason", Integer.valueOf(fbqxVar.a()));
        }
        fbqp fbqpVar = this.g;
        if (fbqpVar == null) {
            contentValues.putNull("action_source");
        } else {
            contentValues.put("action_source", Integer.valueOf(fbqpVar.a()));
        }
        contentValues.put("num_of_items", Integer.valueOf(this.h));
        contentValues.put("click_index", Integer.valueOf(this.i));
        dtub.u(contentValues, "impression_id", this.j);
        dtub.u(contentValues, "suggestion_types", this.k);
        if (intValue >= 42030) {
            dtub.u(contentValues, "model_output_label", this.l);
        }
    }

    @Override // defpackage.dtro
    protected final /* bridge */ /* synthetic */ void c(dtsu dtsuVar) {
        bvex bvexVar = (bvex) ((bvek) dtsuVar);
        aB();
        this.cL = bvexVar.cU();
        if (bvexVar.di(0)) {
            this.a = bvexVar.l();
            fY(0);
        }
        if (bvexVar.di(1)) {
            this.b = bvexVar.g();
            fY(1);
        }
        if (bvexVar.di(2)) {
            this.c = bvexVar.f();
            fY(2);
        }
        if (bvexVar.di(3)) {
            this.d = bvexVar.h();
            fY(3);
        }
        if (bvexVar.di(4)) {
            this.e = bvexVar.i();
            fY(4);
        }
        if (bvexVar.di(5)) {
            this.f = bvexVar.k();
            fY(5);
        }
        if (bvexVar.di(6)) {
            this.g = bvexVar.j();
            fY(6);
        }
        if (bvexVar.di(7)) {
            this.h = bvexVar.e();
            fY(7);
        }
        if (bvexVar.di(8)) {
            this.i = bvexVar.c();
            fY(8);
        }
        if (bvexVar.di(9)) {
            this.j = bvexVar.m();
            fY(9);
        }
        if (bvexVar.di(10)) {
            this.k = bvexVar.o();
            fY(10);
        }
        if (bvexVar.di(11)) {
            this.l = bvexVar.n();
            fY(11);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bvdf)) {
            return false;
        }
        bvdf bvdfVar = (bvdf) obj;
        return super.aD(bvdfVar.cL) && Objects.equals(this.a, bvdfVar.a) && Objects.equals(this.b, bvdfVar.b) && this.c == bvdfVar.c && this.d == bvdfVar.d && this.e == bvdfVar.e && this.f == bvdfVar.f && this.g == bvdfVar.g && this.h == bvdfVar.h && this.i == bvdfVar.i && Objects.equals(this.j, bvdfVar.j) && Objects.equals(this.k, bvdfVar.k) && Objects.equals(this.l, bvdfVar.l);
    }

    @Override // defpackage.dtrq
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "p2p_conversation_suggestion_event", dtub.m(new String[]{"message_id", "timestamp", "event_type", "reply_mode", "rejection_reason", "action_source", "num_of_items", "click_index", "impression_id", "suggestion_types", "model_output_label"}));
    }

    @Override // defpackage.dtrq
    public final String g() {
        return "id";
    }

    @Override // defpackage.dtrq
    public final String h() {
        return "p2p_conversation_suggestion_event";
    }

    public final int hashCode() {
        dtsq dtsqVar = this.cL;
        return Objects.hash((dtsqVar == null || dtsqVar.b()) ? null : this.cL, this.a, this.b, Long.valueOf(this.c), this.d, this.e, this.f, this.g, Integer.valueOf(this.h), Integer.valueOf(this.i), this.j, this.k, this.l, null);
    }

    @Override // defpackage.dtrq
    public final void i(StringBuilder sb, List list) {
        Object obj = new bvde(this).get();
        Long valueOf = Long.valueOf(this.c);
        eoqz eoqzVar = this.d;
        Object valueOf2 = eoqzVar == null ? r6 : String.valueOf(eoqzVar.i);
        epjp epjpVar = this.e;
        Object valueOf3 = epjpVar == null ? r6 : String.valueOf(epjpVar.d);
        fbqx fbqxVar = this.f;
        Object valueOf4 = fbqxVar == null ? r6 : String.valueOf(fbqxVar.a());
        fbqp fbqpVar = this.g;
        Object[] objArr = {obj, valueOf, valueOf2, valueOf3, valueOf4, fbqpVar != null ? String.valueOf(fbqpVar.a()) : 0, Integer.valueOf(this.h), Integer.valueOf(this.i), this.j, this.k, this.l};
        sb.append('(');
        for (int i = 0; i < 11; i++) {
            Object obj2 = objArr[i];
            if (obj2 instanceof Number) {
                sb.append(String.valueOf(obj2));
            } else {
                if (obj2 instanceof String) {
                    String str = (String) obj2;
                    if (str.length() < 12) {
                        sb.append(DatabaseUtils.sqlEscapeString(str));
                    }
                }
                list.add(obj2);
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

    public final String toString() {
        return ((dtro.a) ekhw.a(dtub.b, dtro.a.class)).iB().a() ? String.format(Locale.US, "%s", "P2pConversationSuggestionEventTable -- REDACTED") : a();
    }
}
