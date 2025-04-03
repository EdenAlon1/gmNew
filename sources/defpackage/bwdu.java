package defpackage;

import android.content.ContentValues;
import android.database.DatabaseUtils;
import defpackage.dtro;
import j$.util.Objects;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class bwdu extends dtro implements dtrq {
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public long g;
    public long h;
    public String i;
    public int j;
    public long k;
    public byze l;
    public fayv m;
    public boolean n;
    public String o;
    public String p;
    public bdhg a = bdhg.a;
    public boolean q = false;
    public boolean r = false;
    public boolean s = false;

    protected bwdu() {
    }

    @Override // defpackage.dtro
    public final String a() {
        return String.format(Locale.US, "PendingIncomingRcsMessageTable [rcs_message_id: %s,\n  remote_user_id: %s,\n  self_identity: %s,\n  raw_text: %s,\n  content_type: %s,\n  remote_instance: %s,\n  sent_timestamp: %s,\n  received_timestamp: %s,\n  sip_alias: %s,\n  spam_verdict: %s,\n  session_id: %s,\n  message_status: %s,\n  custom_headers: %s,\n  is_group: %s,\n  conversation_id: %s,\n  conference_uri: %s,\n  is_delivery_report_requested: %s,\n  is_display_report_requested: %s,\n  is_negative_delivery_report_requested: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c), String.valueOf(this.d), String.valueOf(this.e), String.valueOf(this.f), String.valueOf(this.g), String.valueOf(this.h), String.valueOf(this.i), String.valueOf(this.j), String.valueOf(this.k), String.valueOf(this.l), String.valueOf(this.m), String.valueOf(this.n), String.valueOf(this.o), String.valueOf(this.p), String.valueOf(this.q), String.valueOf(this.r), String.valueOf(this.s));
    }

    @Override // defpackage.dtro
    public final void b(ContentValues contentValues) {
        int intValue = bwgw.c().intValue();
        bdhg bdhgVar = this.a;
        if (bdhgVar == null || bdhgVar.equals(bdhg.a)) {
            contentValues.putNull("rcs_message_id");
        } else {
            contentValues.put("rcs_message_id", bdhg.d(this.a));
        }
        dtub.u(contentValues, "remote_user_id", this.b);
        if (intValue >= 59410) {
            dtub.u(contentValues, "self_identity", this.c);
        }
        dtub.u(contentValues, "raw_text", this.d);
        dtub.u(contentValues, "content_type", this.e);
        dtub.u(contentValues, "remote_instance", this.f);
        contentValues.put("sent_timestamp", Long.valueOf(this.g));
        contentValues.put("received_timestamp", Long.valueOf(this.h));
        dtub.u(contentValues, "sip_alias", this.i);
        contentValues.put("spam_verdict", Integer.valueOf(this.j));
        contentValues.put("session_id", Long.valueOf(this.k));
        byze byzeVar = this.l;
        if (byzeVar == null) {
            contentValues.putNull("message_status");
        } else {
            contentValues.put("message_status", Integer.valueOf(byzeVar.ordinal()));
        }
        if (intValue >= 44020) {
            fayv fayvVar = this.m;
            if (fayvVar == null) {
                contentValues.putNull("custom_headers");
            } else {
                contentValues.put("custom_headers", fayvVar.toByteArray());
            }
        }
        if (intValue >= 58820) {
            contentValues.put("is_group", Boolean.valueOf(this.n));
        }
        if (intValue >= 58820) {
            dtub.u(contentValues, "conversation_id", this.o);
        }
        if (intValue >= 58820) {
            dtub.u(contentValues, "conference_uri", this.p);
        }
        if (intValue >= 58870) {
            contentValues.put("is_delivery_report_requested", Boolean.valueOf(this.q));
        }
        if (intValue >= 58870) {
            contentValues.put("is_display_report_requested", Boolean.valueOf(this.r));
        }
        if (intValue >= 60560) {
            contentValues.put("is_negative_delivery_report_requested", Boolean.valueOf(this.s));
        }
    }

    @Override // defpackage.dtro
    protected final /* bridge */ /* synthetic */ void c(dtsu dtsuVar) {
        bwgj bwgjVar = (bwgj) ((bwfp) dtsuVar);
        aB();
        this.cL = bwgjVar.cU();
        if (bwgjVar.di(0)) {
            this.a = bwgjVar.c();
            fY(0);
        }
        if (bwgjVar.di(1)) {
            this.b = bwgjVar.q();
            fY(1);
        }
        if (bwgjVar.di(2)) {
            this.c = bwgjVar.r();
            fY(2);
        }
        if (bwgjVar.di(3)) {
            this.d = bwgjVar.o();
            fY(3);
        }
        if (bwgjVar.di(4)) {
            this.e = bwgjVar.m();
            fY(4);
        }
        if (bwgjVar.di(5)) {
            this.f = bwgjVar.p();
            fY(5);
        }
        if (bwgjVar.di(6)) {
            this.g = bwgjVar.h();
            fY(6);
        }
        if (bwgjVar.di(7)) {
            this.h = bwgjVar.g();
            fY(7);
        }
        if (bwgjVar.di(8)) {
            this.i = bwgjVar.s();
            fY(8);
        }
        if (bwgjVar.di(9)) {
            this.j = bwgjVar.f();
            fY(9);
        }
        if (bwgjVar.di(10)) {
            this.k = bwgjVar.i();
            fY(10);
        }
        if (bwgjVar.di(11)) {
            this.l = bwgjVar.j();
            fY(11);
        }
        if (bwgjVar.di(12)) {
            this.m = bwgjVar.k();
            fY(12);
        }
        if (bwgjVar.di(13)) {
            this.n = bwgjVar.v();
            fY(13);
        }
        if (bwgjVar.di(14)) {
            this.o = bwgjVar.n();
            fY(14);
        }
        if (bwgjVar.di(15)) {
            this.p = bwgjVar.l();
            fY(15);
        }
        if (bwgjVar.di(16)) {
            this.q = bwgjVar.t();
            fY(16);
        }
        if (bwgjVar.di(17)) {
            this.r = bwgjVar.u();
            fY(17);
        }
        if (bwgjVar.di(18)) {
            this.s = bwgjVar.w();
            fY(18);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bwdu)) {
            return false;
        }
        bwdu bwduVar = (bwdu) obj;
        return super.aD(bwduVar.cL) && Objects.equals(this.a, bwduVar.a) && Objects.equals(this.b, bwduVar.b) && Objects.equals(this.c, bwduVar.c) && Objects.equals(this.d, bwduVar.d) && Objects.equals(this.e, bwduVar.e) && Objects.equals(this.f, bwduVar.f) && this.g == bwduVar.g && this.h == bwduVar.h && Objects.equals(this.i, bwduVar.i) && this.j == bwduVar.j && this.k == bwduVar.k && this.l == bwduVar.l && Objects.equals(this.m, bwduVar.m) && this.n == bwduVar.n && Objects.equals(this.o, bwduVar.o) && Objects.equals(this.p, bwduVar.p) && this.q == bwduVar.q && this.r == bwduVar.r && this.s == bwduVar.s;
    }

    @Override // defpackage.dtrq
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "pending_incoming_message_rcs_table", dtub.m(new String[]{"rcs_message_id", "remote_user_id", "self_identity", "raw_text", "content_type", "remote_instance", "sent_timestamp", "received_timestamp", "sip_alias", "spam_verdict", "session_id", "message_status", "custom_headers", "is_group", "conversation_id", "conference_uri", "is_delivery_report_requested", "is_display_report_requested", "is_negative_delivery_report_requested"}));
    }

    @Override // defpackage.dtrq
    public final String g() {
        return null;
    }

    @Override // defpackage.dtrq
    public final String h() {
        return "pending_incoming_message_rcs_table";
    }

    public final int hashCode() {
        dtsq dtsqVar = this.cL;
        dtsq dtsqVar2 = (dtsqVar == null || dtsqVar.b()) ? null : this.cL;
        bdhg bdhgVar = this.a;
        String str = this.b;
        String str2 = this.c;
        String str3 = this.d;
        String str4 = this.e;
        String str5 = this.f;
        Long valueOf = Long.valueOf(this.g);
        Long valueOf2 = Long.valueOf(this.h);
        String str6 = this.i;
        Integer valueOf3 = Integer.valueOf(this.j);
        Long valueOf4 = Long.valueOf(this.k);
        byze byzeVar = this.l;
        return Objects.hash(dtsqVar2, bdhgVar, str, str2, str3, str4, str5, valueOf, valueOf2, str6, valueOf3, valueOf4, Integer.valueOf(byzeVar == null ? 0 : byzeVar.ordinal()), this.m, Boolean.valueOf(this.n), this.o, this.p, Boolean.valueOf(this.q), Boolean.valueOf(this.r), Boolean.valueOf(this.s), null);
    }

    @Override // defpackage.dtrq
    public final void i(StringBuilder sb, List list) {
        Object obj = new bwdt(this).get();
        String str = this.b;
        String str2 = this.c;
        String str3 = this.d;
        String str4 = this.e;
        String str5 = this.f;
        Long valueOf = Long.valueOf(this.g);
        Long valueOf2 = Long.valueOf(this.h);
        String str6 = this.i;
        Integer valueOf3 = Integer.valueOf(this.j);
        Long valueOf4 = Long.valueOf(this.k);
        byze byzeVar = this.l;
        Object valueOf5 = byzeVar == null ? 0 : String.valueOf(byzeVar.ordinal());
        fayv fayvVar = this.m;
        Object[] objArr = {obj, str, str2, str3, str4, str5, valueOf, valueOf2, str6, valueOf3, valueOf4, valueOf5, fayvVar == null ? null : fayvVar.toByteArray(), Integer.valueOf(this.n ? 1 : 0), this.o, this.p, Integer.valueOf(this.q ? 1 : 0), Integer.valueOf(this.r ? 1 : 0), Integer.valueOf(this.s ? 1 : 0)};
        sb.append('(');
        for (int i = 0; i < 19; i++) {
            Object obj2 = objArr[i];
            if (obj2 instanceof Number) {
                sb.append(String.valueOf(obj2));
            } else {
                if (obj2 instanceof String) {
                    String str7 = (String) obj2;
                    if (str7.length() < 12) {
                        sb.append(DatabaseUtils.sqlEscapeString(str7));
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

    public final bdhg k() {
        az(0, "rcs_message_id");
        return this.a;
    }

    public final String l() {
        az(4, "content_type");
        return this.e;
    }

    public final String m() {
        az(3, "raw_text");
        return this.d;
    }

    public final String n() {
        az(1, "remote_user_id");
        return this.b;
    }

    public final String o() {
        az(2, "self_identity");
        return this.c;
    }

    public final String toString() {
        return ((dtro.a) ekhw.a(dtub.b, dtro.a.class)).iB().a() ? String.format(Locale.US, "%s", "PendingIncomingRcsMessageTable -- REDACTED") : a();
    }
}
