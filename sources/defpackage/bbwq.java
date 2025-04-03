package defpackage;

import android.content.ContentValues;
import android.database.DatabaseUtils;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import defpackage.dtro;
import j$.util.Objects;
import j$.util.Optional;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class bbwq extends dtro implements dtrq {
    public String A;
    public csgg B;
    public String C;
    public long D;
    public int d;
    public boolean e;
    public boolean f;
    public int h;
    public String i;
    public String j;
    public int k;
    public String l;
    public long m;
    public long n;
    public int o;
    public int p;
    public int q;
    public String r;
    public String s;
    public String u;
    public String v;
    public String w;
    public boolean x;
    public fayv z;
    public MessageIdType a = bdhb.a;
    public Optional b = bdhj.a;
    public azsu c = null;
    public ConversationIdType g = bdgq.a;
    public int t = -1;
    public bdhg y = bdhg.a;

    protected bbwq() {
    }

    @Override // defpackage.dtro
    public final String a() {
        return String.format(Locale.US, "BackupMessagesTable [_id: %s,\n  message_persistence_id: %s,\n  my_identity: %s,\n  message_status: %s,\n  seen: %s,\n  read: %s,\n  conversation_id: %s,\n  sender_participant_id: %s,\n  sender_send_destination: %s,\n  msisdn_receiving_rcs_message: %s,\n  self_participant_id: %s,\n  mms_subject: %s,\n  received_timestamp: %s,\n  sent_timestamp: %s,\n  protocol: %s,\n  message_priority: %s,\n  rcs_encryption_status: %s,\n  cloud_sync_id: %s,\n  correlation_id: %s,\n  sms_error_code: %s,\n  sms_error_desc_map_name: %s,\n  mms_transaction_id: %s,\n  mms_content_location: %s,\n  is_hidden: %s,\n  rcs_message_id: %s,\n  custom_headers: %s,\n  cms_id: %s,\n  cms_life_cycle: %s,\n  cms_correlation_id: %s,\n  cms_last_mod_seq: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c), String.valueOf(this.d), String.valueOf(this.e), String.valueOf(this.f), String.valueOf(this.g), String.valueOf(this.h), String.valueOf(this.i), String.valueOf(this.j), String.valueOf(this.k), String.valueOf(this.l), String.valueOf(this.m), String.valueOf(this.n), String.valueOf(this.o), String.valueOf(this.p), String.valueOf(this.q), String.valueOf(this.r), String.valueOf(this.s), String.valueOf(this.t), String.valueOf(this.u), String.valueOf(this.v), String.valueOf(this.w), String.valueOf(this.x), String.valueOf(this.y), String.valueOf(this.z), String.valueOf(this.A), String.valueOf(this.B), String.valueOf(this.C), String.valueOf(this.D));
    }

    @Override // defpackage.dtro
    public final void b(ContentValues contentValues) {
        int intValue = bcba.c().intValue();
        MessageIdType messageIdType = this.a;
        if (messageIdType == null || messageIdType.equals(bdhb.a)) {
            contentValues.putNull("_id");
        } else {
            contentValues.put("_id", Long.valueOf(bdhb.a(this.a)));
        }
        if (intValue >= 120) {
            Optional optional = this.b;
            if (optional == null || optional.equals(bdhj.a)) {
                contentValues.putNull("message_persistence_id");
            } else {
                contentValues.put("message_persistence_id", bdhj.b(this.b));
            }
        }
        if (intValue >= 110) {
            azsu azsuVar = this.c;
            if (azsuVar == null || azsuVar.equals(null)) {
                contentValues.putNull("my_identity");
            } else {
                contentValues.put("my_identity", azsv.b(this.c));
            }
        }
        contentValues.put("message_status", Integer.valueOf(this.d));
        contentValues.put("seen", Boolean.valueOf(this.e));
        contentValues.put("read", Boolean.valueOf(this.f));
        ConversationIdType conversationIdType = this.g;
        if (conversationIdType == null || conversationIdType.equals(bdgq.a)) {
            contentValues.putNull("conversation_id");
        } else {
            contentValues.put("conversation_id", Long.valueOf(bdgq.a(this.g)));
        }
        contentValues.put("sender_participant_id", Integer.valueOf(this.h));
        if (intValue >= 80) {
            dtub.u(contentValues, "sender_send_destination", this.i);
        }
        if (intValue >= 80) {
            dtub.u(contentValues, "msisdn_receiving_rcs_message", this.j);
        }
        contentValues.put("self_participant_id", Integer.valueOf(this.k));
        dtub.u(contentValues, "mms_subject", this.l);
        contentValues.put("received_timestamp", Long.valueOf(this.m));
        contentValues.put("sent_timestamp", Long.valueOf(this.n));
        contentValues.put("protocol", Integer.valueOf(this.o));
        contentValues.put("message_priority", Integer.valueOf(this.p));
        contentValues.put("rcs_encryption_status", Integer.valueOf(this.q));
        dtub.u(contentValues, "cloud_sync_id", this.r);
        dtub.u(contentValues, "correlation_id", this.s);
        contentValues.put("sms_error_code", Integer.valueOf(this.t));
        dtub.u(contentValues, "sms_error_desc_map_name", this.u);
        dtub.u(contentValues, "mms_transaction_id", this.v);
        dtub.u(contentValues, "mms_content_location", this.w);
        contentValues.put("is_hidden", Boolean.valueOf(this.x));
        bdhg bdhgVar = this.y;
        if (bdhgVar == null) {
            contentValues.putNull("rcs_message_id");
        } else {
            contentValues.put("rcs_message_id", bdhg.d(bdhgVar));
        }
        if (intValue >= 50) {
            fayv fayvVar = this.z;
            if (fayvVar == null) {
                contentValues.putNull("custom_headers");
            } else {
                contentValues.put("custom_headers", fayvVar.toByteArray());
            }
        }
        dtub.u(contentValues, "cms_id", this.A);
        csgg csggVar = this.B;
        if (csggVar == null) {
            contentValues.putNull("cms_life_cycle");
        } else {
            contentValues.put("cms_life_cycle", Integer.valueOf(csggVar.ordinal()));
        }
        dtub.u(contentValues, "cms_correlation_id", this.C);
        contentValues.put("cms_last_mod_seq", Long.valueOf(this.D));
    }

    @Override // defpackage.dtro
    protected final /* bridge */ /* synthetic */ void c(dtsu dtsuVar) {
        bcan bcanVar = (bcan) ((bbzi) dtsuVar);
        aB();
        this.cL = bcanVar.cU();
        if (bcanVar.di(0)) {
            this.a = bcanVar.p();
            fY(0);
        }
        if (bcanVar.di(1)) {
            this.b = bcanVar.t();
            fY(1);
        }
        if (bcanVar.di(2)) {
            this.c = bcanVar.n();
            fY(2);
        }
        if (bcanVar.di(3)) {
            this.d = bcanVar.e();
            fY(3);
        }
        if (bcanVar.di(4)) {
            this.e = bcanVar.G();
            fY(4);
        }
        if (bcanVar.di(5)) {
            this.f = bcanVar.F();
            fY(5);
        }
        if (bcanVar.di(6)) {
            this.g = bcanVar.o();
            fY(6);
        }
        if (bcanVar.di(7)) {
            this.h = bcanVar.i();
            fY(7);
        }
        if (bcanVar.di(8)) {
            this.i = bcanVar.C();
            fY(8);
        }
        if (bcanVar.di(9)) {
            this.j = bcanVar.B();
            fY(9);
        }
        if (bcanVar.di(10)) {
            this.k = bcanVar.h();
            fY(10);
        }
        if (bcanVar.di(11)) {
            this.l = bcanVar.z();
            fY(11);
        }
        if (bcanVar.di(12)) {
            this.m = bcanVar.l();
            fY(12);
        }
        if (bcanVar.di(13)) {
            this.n = bcanVar.m();
            fY(13);
        }
        if (bcanVar.di(14)) {
            this.o = bcanVar.f();
            fY(14);
        }
        if (bcanVar.di(15)) {
            this.p = bcanVar.c();
            fY(15);
        }
        if (bcanVar.di(16)) {
            this.q = bcanVar.g();
            fY(16);
        }
        if (bcanVar.di(17)) {
            this.r = bcanVar.u();
            fY(17);
        }
        if (bcanVar.di(18)) {
            this.s = bcanVar.x();
            fY(18);
        }
        if (bcanVar.di(19)) {
            this.t = bcanVar.j();
            fY(19);
        }
        if (bcanVar.di(20)) {
            this.u = bcanVar.D();
            fY(20);
        }
        if (bcanVar.di(21)) {
            this.v = bcanVar.A();
            fY(21);
        }
        if (bcanVar.di(22)) {
            this.w = bcanVar.y();
            fY(22);
        }
        if (bcanVar.di(23)) {
            this.x = bcanVar.E();
            fY(23);
        }
        if (bcanVar.di(24)) {
            this.y = bcanVar.q();
            fY(24);
        }
        if (bcanVar.di(25)) {
            this.z = bcanVar.s();
            fY(25);
        }
        if (bcanVar.di(26)) {
            this.A = bcanVar.w();
            fY(26);
        }
        if (bcanVar.di(27)) {
            this.B = bcanVar.r();
            fY(27);
        }
        if (bcanVar.di(28)) {
            this.C = bcanVar.v();
            fY(28);
        }
        if (bcanVar.di(29)) {
            this.D = bcanVar.k();
            fY(29);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bbwq)) {
            return false;
        }
        bbwq bbwqVar = (bbwq) obj;
        return super.aD(bbwqVar.cL) && Objects.equals(this.a, bbwqVar.a) && Objects.equals(this.b, bbwqVar.b) && Objects.equals(this.c, bbwqVar.c) && this.d == bbwqVar.d && this.e == bbwqVar.e && this.f == bbwqVar.f && Objects.equals(this.g, bbwqVar.g) && this.h == bbwqVar.h && Objects.equals(this.i, bbwqVar.i) && Objects.equals(this.j, bbwqVar.j) && this.k == bbwqVar.k && Objects.equals(this.l, bbwqVar.l) && this.m == bbwqVar.m && this.n == bbwqVar.n && this.o == bbwqVar.o && this.p == bbwqVar.p && this.q == bbwqVar.q && Objects.equals(this.r, bbwqVar.r) && Objects.equals(this.s, bbwqVar.s) && this.t == bbwqVar.t && Objects.equals(this.u, bbwqVar.u) && Objects.equals(this.v, bbwqVar.v) && Objects.equals(this.w, bbwqVar.w) && this.x == bbwqVar.x && Objects.equals(this.y, bbwqVar.y) && Objects.equals(this.z, bbwqVar.z) && Objects.equals(this.A, bbwqVar.A) && this.B == bbwqVar.B && Objects.equals(this.C, bbwqVar.C) && this.D == bbwqVar.D;
    }

    @Override // defpackage.dtrq
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "messages_backup", dtub.m(new String[]{"_id", "message_persistence_id", "my_identity", "message_status", "seen", "read", "conversation_id", "sender_participant_id", "sender_send_destination", "msisdn_receiving_rcs_message", "self_participant_id", "mms_subject", "received_timestamp", "sent_timestamp", "protocol", "message_priority", "rcs_encryption_status", "cloud_sync_id", "correlation_id", "sms_error_code", "sms_error_desc_map_name", "mms_transaction_id", "mms_content_location", "is_hidden", "rcs_message_id", "custom_headers", "cms_id", "cms_life_cycle", "cms_correlation_id", "cms_last_mod_seq"}));
    }

    @Override // defpackage.dtrq
    public final String g() {
        return null;
    }

    @Override // defpackage.dtrq
    public final String h() {
        return "messages_backup";
    }

    public final int hashCode() {
        dtsq dtsqVar = this.cL;
        dtsq dtsqVar2 = (dtsqVar == null || dtsqVar.b()) ? null : this.cL;
        MessageIdType messageIdType = this.a;
        Optional optional = this.b;
        azsu azsuVar = this.c;
        Integer valueOf = Integer.valueOf(this.d);
        Boolean valueOf2 = Boolean.valueOf(this.e);
        Boolean valueOf3 = Boolean.valueOf(this.f);
        ConversationIdType conversationIdType = this.g;
        Integer valueOf4 = Integer.valueOf(this.h);
        String str = this.i;
        String str2 = this.j;
        Integer valueOf5 = Integer.valueOf(this.k);
        String str3 = this.l;
        Long valueOf6 = Long.valueOf(this.m);
        dtsq dtsqVar3 = dtsqVar2;
        Long valueOf7 = Long.valueOf(this.n);
        Integer valueOf8 = Integer.valueOf(this.o);
        Integer valueOf9 = Integer.valueOf(this.p);
        Integer valueOf10 = Integer.valueOf(this.q);
        String str4 = this.r;
        String str5 = this.s;
        Integer valueOf11 = Integer.valueOf(this.t);
        String str6 = this.u;
        String str7 = this.v;
        String str8 = this.w;
        Boolean valueOf12 = Boolean.valueOf(this.x);
        bdhg bdhgVar = this.y;
        fayv fayvVar = this.z;
        String str9 = this.A;
        csgg csggVar = this.B;
        return Objects.hash(dtsqVar3, messageIdType, optional, azsuVar, valueOf, valueOf2, valueOf3, conversationIdType, valueOf4, str, str2, valueOf5, str3, valueOf6, valueOf7, valueOf8, valueOf9, valueOf10, str4, str5, valueOf11, str6, str7, str8, valueOf12, bdhgVar, fayvVar, str9, Integer.valueOf(csggVar == null ? 0 : csggVar.ordinal()), this.C, Long.valueOf(this.D), null);
    }

    @Override // defpackage.dtrq
    public final void i(StringBuilder sb, List list) {
        Object obj = new bbwm(this).get();
        Object obj2 = new bbwn(this).get();
        Object obj3 = new bbwo(this).get();
        Integer valueOf = Integer.valueOf(this.d);
        Integer valueOf2 = Integer.valueOf(this.e ? 1 : 0);
        Integer valueOf3 = Integer.valueOf(this.f ? 1 : 0);
        Object obj4 = new bbwp(this).get();
        Integer valueOf4 = Integer.valueOf(this.h);
        String str = this.i;
        String str2 = this.j;
        Integer valueOf5 = Integer.valueOf(this.k);
        String str3 = this.l;
        Long valueOf6 = Long.valueOf(this.m);
        Long valueOf7 = Long.valueOf(this.n);
        Integer valueOf8 = Integer.valueOf(this.o);
        Integer valueOf9 = Integer.valueOf(this.p);
        Integer valueOf10 = Integer.valueOf(this.q);
        String str4 = this.r;
        String str5 = this.s;
        Integer valueOf11 = Integer.valueOf(this.t);
        String str6 = this.u;
        String str7 = this.v;
        String str8 = this.w;
        Integer valueOf12 = Integer.valueOf(this.x ? 1 : 0);
        String d = bdhg.d(this.y);
        fayv fayvVar = this.z;
        byte[] byteArray = fayvVar == null ? null : fayvVar.toByteArray();
        String str9 = this.A;
        csgg csggVar = this.B;
        Object[] objArr = {obj, obj2, obj3, valueOf, valueOf2, valueOf3, obj4, valueOf4, str, str2, valueOf5, str3, valueOf6, valueOf7, valueOf8, valueOf9, valueOf10, str4, str5, valueOf11, str6, str7, str8, valueOf12, d, byteArray, str9, csggVar == null ? 0 : String.valueOf(csggVar.ordinal()), this.C, Long.valueOf(this.D)};
        sb.append('(');
        for (int i = 0; i < 30; i++) {
            Object obj5 = objArr[i];
            if (obj5 instanceof Number) {
                sb.append(String.valueOf(obj5));
            } else {
                if (obj5 instanceof String) {
                    String str10 = (String) obj5;
                    if (str10.length() < 12) {
                        sb.append(DatabaseUtils.sqlEscapeString(str10));
                    }
                }
                list.add(obj5);
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
        return ((dtro.a) ekhw.a(dtub.b, dtro.a.class)).iB().a() ? String.format(Locale.US, "%s", "BackupMessagesTable -- REDACTED") : a();
    }
}
