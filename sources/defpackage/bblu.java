package defpackage;

import android.content.ContentValues;
import android.database.DatabaseUtils;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import defpackage.dtro;
import j$.util.Objects;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class bblu extends dtro implements dtrq {
    public String c;
    public long e;
    public String f;
    public String g;
    public boolean i;
    public String j;
    public String k;
    public String l;
    public long o;
    public int p;
    public int q;
    public String s;
    public csgg t;
    public ConversationIdType a = bdgq.a;
    public azsu b = null;
    public byyt d = byyt.UNARCHIVED;
    public byyy h = byyy.NAME_IS_AUTOMATIC;
    public cknh m = cknh.b();
    public ayhd n = ayhd.b(0);
    public int r = 0;

    protected bblu() {
    }

    @Override // defpackage.dtro
    public final String a() {
        return String.format(Locale.US, "BackupConversationsTable [_id: %s,\n  current_my_identity: %s,\n  snippet_text: %s,\n  archive_status: %s,\n  most_recent_timestamp_ms: %s,\n  subject: %s,\n  name: %s,\n  name_is_automatic: %s,\n  has_rbm_participant: %s,\n  rcs_group_self_msisdn: %s,\n  rcs_group_id: %s,\n  rcs_conference_uri: %s,\n  rcs_group_capabilities: %s,\n  error_state: %s,\n  rcs_subject_change_timestamp_ms: %s,\n  join_state: %s,\n  conversation_type: %s,\n  send_mode: %s,\n  cms_id: %s,\n  cms_life_cycle: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c), String.valueOf(this.d), String.valueOf(this.e), String.valueOf(this.f), String.valueOf(this.g), String.valueOf(this.h), String.valueOf(this.i), String.valueOf(this.j), String.valueOf(this.k), String.valueOf(this.l), String.valueOf(this.m), String.valueOf(this.n), String.valueOf(this.o), String.valueOf(this.p), String.valueOf(this.q), String.valueOf(this.r), String.valueOf(this.s), String.valueOf(this.t));
    }

    @Override // defpackage.dtro
    public final void b(ContentValues contentValues) {
        int intValue = bbov.c().intValue();
        ConversationIdType conversationIdType = this.a;
        if (conversationIdType == null || conversationIdType.equals(bdgq.a)) {
            contentValues.putNull("_id");
        } else {
            contentValues.put("_id", Long.valueOf(bdgq.a(this.a)));
        }
        if (intValue >= 110) {
            azsu azsuVar = this.b;
            if (azsuVar == null || azsuVar.equals(null)) {
                contentValues.putNull("current_my_identity");
            } else {
                contentValues.put("current_my_identity", azsv.b(this.b));
            }
        }
        dtub.u(contentValues, "snippet_text", this.c);
        byyt byytVar = this.d;
        if (byytVar == null) {
            contentValues.putNull("archive_status");
        } else {
            contentValues.put("archive_status", Integer.valueOf(byytVar.h));
        }
        contentValues.put("most_recent_timestamp_ms", Long.valueOf(this.e));
        dtub.u(contentValues, "subject", this.f);
        dtub.u(contentValues, "name", this.g);
        byyy byyyVar = this.h;
        if (byyyVar == null) {
            contentValues.putNull("name_is_automatic");
        } else {
            contentValues.put("name_is_automatic", Integer.valueOf(byyyVar.ordinal()));
        }
        contentValues.put("has_rbm_participant", Boolean.valueOf(this.i));
        dtub.u(contentValues, "rcs_group_self_msisdn", this.j);
        dtub.u(contentValues, "rcs_group_id", this.k);
        dtub.u(contentValues, "rcs_conference_uri", this.l);
        cknh cknhVar = this.m;
        if (cknhVar == null) {
            contentValues.putNull("rcs_group_capabilities");
        } else {
            contentValues.put("rcs_group_capabilities", Long.valueOf(cknhVar.a));
        }
        ayhd ayhdVar = this.n;
        if (ayhdVar == null) {
            contentValues.putNull("error_state");
        } else {
            contentValues.put("error_state", Integer.valueOf(ayhdVar.a()));
        }
        contentValues.put("rcs_subject_change_timestamp_ms", Long.valueOf(this.o));
        contentValues.put("join_state", Integer.valueOf(this.p));
        contentValues.put("conversation_type", Integer.valueOf(this.q));
        contentValues.put("send_mode", Integer.valueOf(this.r));
        dtub.u(contentValues, "cms_id", this.s);
        csgg csggVar = this.t;
        if (csggVar == null) {
            contentValues.putNull("cms_life_cycle");
        } else {
            contentValues.put("cms_life_cycle", Integer.valueOf(csggVar.ordinal()));
        }
    }

    @Override // defpackage.dtro
    protected final /* bridge */ /* synthetic */ void c(dtsu dtsuVar) {
        bbok bbokVar = (bbok) ((bbnp) dtsuVar);
        aB();
        this.cL = bbokVar.cU();
        if (bbokVar.di(0)) {
            this.a = bbokVar.k();
            fY(0);
        }
        if (bbokVar.di(1)) {
            this.b = bbokVar.j();
            fY(1);
        }
        if (bbokVar.di(2)) {
            this.c = bbokVar.u();
            fY(2);
        }
        if (bbokVar.di(3)) {
            this.d = bbokVar.l();
            fY(3);
        }
        if (bbokVar.di(4)) {
            this.e = bbokVar.g();
            fY(4);
        }
        if (bbokVar.di(5)) {
            this.f = bbokVar.v();
            fY(5);
        }
        if (bbokVar.di(6)) {
            this.g = bbokVar.q();
            fY(6);
        }
        if (bbokVar.di(7)) {
            this.h = bbokVar.m();
            fY(7);
        }
        if (bbokVar.di(8)) {
            this.i = bbokVar.w();
            fY(8);
        }
        if (bbokVar.di(9)) {
            this.j = bbokVar.t();
            fY(9);
        }
        if (bbokVar.di(10)) {
            this.k = bbokVar.s();
            fY(10);
        }
        if (bbokVar.di(11)) {
            this.l = bbokVar.r();
            fY(11);
        }
        if (bbokVar.di(12)) {
            this.m = bbokVar.n();
            fY(12);
        }
        if (bbokVar.di(13)) {
            this.n = bbokVar.i();
            fY(13);
        }
        if (bbokVar.di(14)) {
            this.o = bbokVar.h();
            fY(14);
        }
        if (bbokVar.di(15)) {
            this.p = bbokVar.e();
            fY(15);
        }
        if (bbokVar.di(16)) {
            this.q = bbokVar.c();
            fY(16);
        }
        if (bbokVar.di(17)) {
            this.r = bbokVar.f();
            fY(17);
        }
        if (bbokVar.di(18)) {
            this.s = bbokVar.p();
            fY(18);
        }
        if (bbokVar.di(19)) {
            this.t = bbokVar.o();
            fY(19);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bblu)) {
            return false;
        }
        bblu bbluVar = (bblu) obj;
        return super.aD(bbluVar.cL) && Objects.equals(this.a, bbluVar.a) && Objects.equals(this.b, bbluVar.b) && Objects.equals(this.c, bbluVar.c) && this.d == bbluVar.d && this.e == bbluVar.e && Objects.equals(this.f, bbluVar.f) && Objects.equals(this.g, bbluVar.g) && this.h == bbluVar.h && this.i == bbluVar.i && Objects.equals(this.j, bbluVar.j) && Objects.equals(this.k, bbluVar.k) && Objects.equals(this.l, bbluVar.l) && Objects.equals(this.m, bbluVar.m) && this.n == bbluVar.n && this.o == bbluVar.o && this.p == bbluVar.p && this.q == bbluVar.q && this.r == bbluVar.r && Objects.equals(this.s, bbluVar.s) && this.t == bbluVar.t;
    }

    @Override // defpackage.dtrq
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "conversations_backup", dtub.m(new String[]{"_id", "current_my_identity", "snippet_text", "archive_status", "most_recent_timestamp_ms", "subject", "name", "name_is_automatic", "has_rbm_participant", "rcs_group_self_msisdn", "rcs_group_id", "rcs_conference_uri", "rcs_group_capabilities", "error_state", "rcs_subject_change_timestamp_ms", "join_state", "conversation_type", "send_mode", "cms_id", "cms_life_cycle"}));
    }

    @Override // defpackage.dtrq
    public final String g() {
        return null;
    }

    @Override // defpackage.dtrq
    public final String h() {
        return "conversations_backup";
    }

    public final int hashCode() {
        dtsq dtsqVar = this.cL;
        dtsq dtsqVar2 = (dtsqVar == null || dtsqVar.b()) ? null : this.cL;
        ConversationIdType conversationIdType = this.a;
        azsu azsuVar = this.b;
        String str = this.c;
        byyt byytVar = this.d;
        Long valueOf = Long.valueOf(this.e);
        String str2 = this.f;
        String str3 = this.g;
        byyy byyyVar = this.h;
        Integer valueOf2 = Integer.valueOf(byyyVar == null ? 0 : byyyVar.ordinal());
        Boolean valueOf3 = Boolean.valueOf(this.i);
        String str4 = this.j;
        String str5 = this.k;
        String str6 = this.l;
        cknh cknhVar = this.m;
        ayhd ayhdVar = this.n;
        dtsq dtsqVar3 = dtsqVar2;
        Long valueOf4 = Long.valueOf(this.o);
        Integer valueOf5 = Integer.valueOf(this.p);
        Integer valueOf6 = Integer.valueOf(this.q);
        Integer valueOf7 = Integer.valueOf(this.r);
        String str7 = this.s;
        csgg csggVar = this.t;
        return Objects.hash(dtsqVar3, conversationIdType, azsuVar, str, byytVar, valueOf, str2, str3, valueOf2, valueOf3, str4, str5, str6, cknhVar, ayhdVar, valueOf4, valueOf5, valueOf6, valueOf7, str7, Integer.valueOf(csggVar == null ? 0 : csggVar.ordinal()), null);
    }

    @Override // defpackage.dtrq
    public final void i(StringBuilder sb, List list) {
        Object obj = new bbls(this).get();
        Object obj2 = new bblt(this).get();
        String str = this.c;
        byyt byytVar = this.d;
        Object valueOf = byytVar == null ? 0 : String.valueOf(byytVar.h);
        Long valueOf2 = Long.valueOf(this.e);
        String str2 = this.f;
        String str3 = this.g;
        byyy byyyVar = this.h;
        Object valueOf3 = byyyVar == null ? 0 : String.valueOf(byyyVar.ordinal());
        Integer valueOf4 = Integer.valueOf(this.i ? 1 : 0);
        String str4 = this.j;
        String str5 = this.k;
        String str6 = this.l;
        Long valueOf5 = Long.valueOf(this.m.a);
        ayhd ayhdVar = this.n;
        Object valueOf6 = ayhdVar == null ? 0 : String.valueOf(ayhdVar.a());
        Long valueOf7 = Long.valueOf(this.o);
        Integer valueOf8 = Integer.valueOf(this.p);
        Integer valueOf9 = Integer.valueOf(this.q);
        Integer valueOf10 = Integer.valueOf(this.r);
        String str7 = this.s;
        csgg csggVar = this.t;
        Object[] objArr = {obj, obj2, str, valueOf, valueOf2, str2, str3, valueOf3, valueOf4, str4, str5, str6, valueOf5, valueOf6, valueOf7, valueOf8, valueOf9, valueOf10, str7, csggVar != null ? String.valueOf(csggVar.ordinal()) : 0};
        sb.append('(');
        for (int i = 0; i < 20; i++) {
            Object obj3 = objArr[i];
            if (obj3 instanceof Number) {
                sb.append(String.valueOf(obj3));
            } else {
                if (obj3 instanceof String) {
                    String str8 = (String) obj3;
                    if (str8.length() < 12) {
                        sb.append(DatabaseUtils.sqlEscapeString(str8));
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

    public final String toString() {
        return ((dtro.a) ekhw.a(dtub.b, dtro.a.class)).iB().a() ? String.format(Locale.US, "%s", "BackupConversationsTable -- REDACTED") : a();
    }
}
