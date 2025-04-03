package defpackage;

import android.content.ContentValues;
import android.database.DatabaseUtils;
import defpackage.dtro;
import j$.util.Objects;
import java.util.List;
import java.util.Locale;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class btwf extends dtro implements dtrq {
    public long a;
    public UUID b = bdhh.b();
    public byzb c;
    public String d;

    protected btwf() {
    }

    @Override // defpackage.dtro
    public final String a() {
        return String.format(Locale.US, "MessageDestinationsTable [_id: %s,\n  message_send_receive_attempt_id: %s,\n  message_destination_type: %s,\n  message_destination_raw: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c), String.valueOf(this.d));
    }

    @Override // defpackage.dtro
    public final void b(ContentValues contentValues) {
        UUID uuid = this.b;
        if (uuid == null || uuid.equals(bdhh.b())) {
            contentValues.putNull("message_send_receive_attempt_id");
        } else {
            contentValues.put("message_send_receive_attempt_id", bdhh.a(this.b));
        }
        byzb byzbVar = this.c;
        if (byzbVar == null) {
            contentValues.putNull("message_destination_type");
        } else {
            contentValues.put("message_destination_type", Integer.valueOf(byzbVar.ordinal()));
        }
        dtub.u(contentValues, "message_destination_raw", this.d);
    }

    @Override // defpackage.dtro
    protected final /* bridge */ /* synthetic */ void c(dtsu dtsuVar) {
        btxb btxbVar = (btxb) ((btww) dtsuVar);
        aB();
        this.cL = btxbVar.cU();
        if (btxbVar.di(0)) {
            this.a = btxbVar.c();
            fY(0);
        }
        if (btxbVar.di(1)) {
            this.b = btxbVar.g();
            fY(1);
        }
        if (btxbVar.di(2)) {
            this.c = btxbVar.e();
            fY(2);
        }
        if (btxbVar.di(3)) {
            this.d = btxbVar.f();
            fY(3);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof btwf)) {
            return false;
        }
        btwf btwfVar = (btwf) obj;
        return super.aD(btwfVar.cL) && this.a == btwfVar.a && Objects.equals(this.b, btwfVar.b) && this.c == btwfVar.c && Objects.equals(this.d, btwfVar.d);
    }

    @Override // defpackage.dtrq
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "message_destinations", dtub.m(new String[]{"message_send_receive_attempt_id", "message_destination_type", "message_destination_raw"}));
    }

    @Override // defpackage.dtrq
    public final String g() {
        return "_id";
    }

    @Override // defpackage.dtrq
    public final String h() {
        return "message_destinations";
    }

    public final int hashCode() {
        dtsq dtsqVar = this.cL;
        dtsq dtsqVar2 = (dtsqVar == null || dtsqVar.b()) ? null : this.cL;
        Long valueOf = Long.valueOf(this.a);
        UUID uuid = this.b;
        byzb byzbVar = this.c;
        return Objects.hash(dtsqVar2, valueOf, uuid, Integer.valueOf(byzbVar == null ? 0 : byzbVar.ordinal()), this.d, null);
    }

    @Override // defpackage.dtrq
    public final void i(StringBuilder sb, List list) {
        Object obj = new btwe(this).get();
        byzb byzbVar = this.c;
        Object[] objArr = {obj, byzbVar == null ? 0 : String.valueOf(byzbVar.ordinal()), this.d};
        sb.append('(');
        for (int i = 0; i < 3; i++) {
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
        return ((dtro.a) ekhw.a(dtub.b, dtro.a.class)).iB().a() ? String.format(Locale.US, "%s", "MessageDestinationsTable -- REDACTED") : a();
    }
}
