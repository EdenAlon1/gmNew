package defpackage;

import android.content.ContentValues;
import android.database.DatabaseUtils;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import defpackage.dtro;
import j$.util.Objects;
import java.util.List;
import java.util.Locale;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class buge extends dtro implements dtrq {
    public UUID a = bdhh.b();
    public MessageIdType b = bdhb.a;
    public long c;
    public long d;
    public byzj e;
    public String f;
    public String g;
    public String h;
    public String i;
    public String j;
    public String k;
    public String l;
    public String m;

    protected buge() {
    }

    @Override // defpackage.dtro
    public final String a() {
        return String.format(Locale.US, "MessageSendReceiveAttemptTable [_id: %s,\n  message_id: %s,\n  timestamp: %s,\n  message_sending_attempt: %s,\n  message_protocol: %s,\n  current_sim_network_country: %s,\n  current_sim_country: %s,\n  current_sim_carrier_country: %s,\n  settings_country: %s,\n  default_sms_sim_country: %s,\n  locale_country: %s,\n  default_sms_sim_network_country: %s,\n  default_sms_sim_carrier_country: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c), String.valueOf(this.d), String.valueOf(this.e), String.valueOf(this.f), String.valueOf(this.g), String.valueOf(this.h), String.valueOf(this.i), String.valueOf(this.j), String.valueOf(this.k), String.valueOf(this.l), String.valueOf(this.m));
    }

    @Override // defpackage.dtro
    public final void b(ContentValues contentValues) {
        UUID uuid = this.a;
        if (uuid == null) {
            contentValues.putNull("_id");
        } else {
            contentValues.put("_id", bdhh.a(uuid));
        }
        MessageIdType messageIdType = this.b;
        if (messageIdType == null || messageIdType.equals(bdhb.a)) {
            contentValues.putNull("message_id");
        } else {
            contentValues.put("message_id", Long.valueOf(bdhb.a(this.b)));
        }
        contentValues.put("timestamp", Long.valueOf(this.c));
        contentValues.put("message_sending_attempt", Long.valueOf(this.d));
        byzj byzjVar = this.e;
        if (byzjVar == null) {
            contentValues.putNull("message_protocol");
        } else {
            contentValues.put("message_protocol", Integer.valueOf(byzjVar.ordinal()));
        }
        dtub.u(contentValues, "current_sim_network_country", this.f);
        dtub.u(contentValues, "current_sim_country", this.g);
        dtub.u(contentValues, "current_sim_carrier_country", this.h);
        dtub.u(contentValues, "settings_country", this.i);
        dtub.u(contentValues, "default_sms_sim_country", this.j);
        dtub.u(contentValues, "locale_country", this.k);
        dtub.u(contentValues, "default_sms_sim_network_country", this.l);
        dtub.u(contentValues, "default_sms_sim_carrier_country", this.m);
    }

    @Override // defpackage.dtro
    protected final /* bridge */ /* synthetic */ void c(dtsu dtsuVar) {
        buib buibVar = (buib) ((buhn) dtsuVar);
        aB();
        this.cL = buibVar.cU();
        if (buibVar.di(0)) {
            this.a = buibVar.q();
            fY(0);
        }
        if (buibVar.di(1)) {
            this.b = buibVar.g();
            fY(1);
        }
        if (buibVar.di(2)) {
            this.c = buibVar.f();
            fY(2);
        }
        if (buibVar.di(3)) {
            this.d = buibVar.e();
            fY(3);
        }
        if (buibVar.di(4)) {
            this.e = buibVar.h();
            fY(4);
        }
        if (buibVar.di(5)) {
            this.f = buibVar.k();
            fY(5);
        }
        if (buibVar.di(6)) {
            this.g = buibVar.j();
            fY(6);
        }
        if (buibVar.di(7)) {
            this.h = buibVar.i();
            fY(7);
        }
        if (buibVar.di(8)) {
            this.i = buibVar.p();
            fY(8);
        }
        if (buibVar.di(9)) {
            this.j = buibVar.m();
            fY(9);
        }
        if (buibVar.di(10)) {
            this.k = buibVar.o();
            fY(10);
        }
        if (buibVar.di(11)) {
            this.l = buibVar.n();
            fY(11);
        }
        if (buibVar.di(12)) {
            this.m = buibVar.l();
            fY(12);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof buge)) {
            return false;
        }
        buge bugeVar = (buge) obj;
        return super.aD(bugeVar.cL) && Objects.equals(this.a, bugeVar.a) && Objects.equals(this.b, bugeVar.b) && this.c == bugeVar.c && this.d == bugeVar.d && this.e == bugeVar.e && Objects.equals(this.f, bugeVar.f) && Objects.equals(this.g, bugeVar.g) && Objects.equals(this.h, bugeVar.h) && Objects.equals(this.i, bugeVar.i) && Objects.equals(this.j, bugeVar.j) && Objects.equals(this.k, bugeVar.k) && Objects.equals(this.l, bugeVar.l) && Objects.equals(this.m, bugeVar.m);
    }

    @Override // defpackage.dtrq
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "message_send_receive_attempt", dtub.m(new String[]{"_id", "message_id", "timestamp", "message_sending_attempt", "message_protocol", "current_sim_network_country", "current_sim_country", "current_sim_carrier_country", "settings_country", "default_sms_sim_country", "locale_country", "default_sms_sim_network_country", "default_sms_sim_carrier_country"}));
    }

    @Override // defpackage.dtrq
    public final String g() {
        return null;
    }

    @Override // defpackage.dtrq
    public final String h() {
        return "message_send_receive_attempt";
    }

    public final int hashCode() {
        dtsq dtsqVar = this.cL;
        dtsq dtsqVar2 = (dtsqVar == null || dtsqVar.b()) ? null : this.cL;
        UUID uuid = this.a;
        MessageIdType messageIdType = this.b;
        Long valueOf = Long.valueOf(this.c);
        Long valueOf2 = Long.valueOf(this.d);
        byzj byzjVar = this.e;
        return Objects.hash(dtsqVar2, uuid, messageIdType, valueOf, valueOf2, Integer.valueOf(byzjVar == null ? 0 : byzjVar.ordinal()), this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, null);
    }

    @Override // defpackage.dtrq
    public final void i(StringBuilder sb, List list) {
        String a = bdhh.a(this.a);
        Object obj = new bugd(this).get();
        Long valueOf = Long.valueOf(this.c);
        Long valueOf2 = Long.valueOf(this.d);
        byzj byzjVar = this.e;
        Object[] objArr = {a, obj, valueOf, valueOf2, byzjVar == null ? 0 : String.valueOf(byzjVar.ordinal()), this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m};
        sb.append('(');
        for (int i = 0; i < 13; i++) {
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
        return ((dtro.a) ekhw.a(dtub.b, dtro.a.class)).iB().a() ? String.format(Locale.US, "%s", "MessageSendReceiveAttemptTable -- REDACTED") : a();
    }
}
