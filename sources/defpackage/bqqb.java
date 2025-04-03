package defpackage;

import android.content.ContentValues;
import android.database.DatabaseUtils;
import defpackage.dtro;
import j$.util.Objects;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class bqqb extends dtro implements dtrq {
    public String a;
    public long b;
    public String c;
    public String d;
    public String e;
    public String f;
    public long g = 0;
    public long h = 0;

    protected bqqb() {
    }

    @Override // defpackage.dtro
    public final String a() {
        return String.format(Locale.US, "CmsNotificationsTable [cms_id: %s,\n  cms_last_mod_seq: %s,\n  cms_correlation_id: %s,\n  from_address: %s,\n  to_address: %s,\n  correlation_text: %s,\n  modified_at_timestamp: %s,\n  message_received_timestamp: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c), String.valueOf(this.d), String.valueOf(this.e), String.valueOf(this.f), String.valueOf(this.g), String.valueOf(this.h));
    }

    @Override // defpackage.dtro
    public final void b(ContentValues contentValues) {
        int intValue = bqrp.c().intValue();
        dtub.u(contentValues, "cms_id", this.a);
        contentValues.put("cms_last_mod_seq", Long.valueOf(this.b));
        dtub.u(contentValues, "cms_correlation_id", this.c);
        dtub.u(contentValues, "from_address", this.d);
        dtub.u(contentValues, "to_address", this.e);
        dtub.u(contentValues, "correlation_text", this.f);
        contentValues.put("modified_at_timestamp", Long.valueOf(this.g));
        if (intValue >= 46040) {
            contentValues.put("message_received_timestamp", Long.valueOf(this.h));
        }
    }

    @Override // defpackage.dtro
    protected final /* bridge */ /* synthetic */ void c(dtsu dtsuVar) {
        bqrg bqrgVar = (bqrg) ((bqqx) dtsuVar);
        aB();
        this.cL = bqrgVar.cU();
        if (bqrgVar.di(0)) {
            this.a = bqrgVar.f();
            fY(0);
        }
        if (bqrgVar.di(1)) {
            this.b = bqrgVar.c();
            fY(1);
        }
        if (bqrgVar.di(2)) {
            this.c = bqrgVar.h();
            fY(2);
        }
        if (bqrgVar.di(3)) {
            this.d = bqrgVar.j();
            fY(3);
        }
        if (bqrgVar.di(4)) {
            this.e = bqrgVar.k();
            fY(4);
        }
        if (bqrgVar.di(5)) {
            this.f = bqrgVar.i();
            fY(5);
        }
        if (bqrgVar.di(6)) {
            this.g = bqrgVar.g();
            fY(6);
        }
        if (bqrgVar.di(7)) {
            this.h = bqrgVar.e();
            fY(7);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bqqb)) {
            return false;
        }
        bqqb bqqbVar = (bqqb) obj;
        return super.aD(bqqbVar.cL) && Objects.equals(this.a, bqqbVar.a) && this.b == bqqbVar.b && Objects.equals(this.c, bqqbVar.c) && Objects.equals(this.d, bqqbVar.d) && Objects.equals(this.e, bqqbVar.e) && Objects.equals(this.f, bqqbVar.f) && this.g == bqqbVar.g && this.h == bqqbVar.h;
    }

    @Override // defpackage.dtrq
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "cms_notifications", dtub.m(new String[]{"cms_id", "cms_last_mod_seq", "cms_correlation_id", "from_address", "to_address", "correlation_text", "modified_at_timestamp", "message_received_timestamp"}));
    }

    @Override // defpackage.dtrq
    public final String g() {
        return null;
    }

    @Override // defpackage.dtrq
    public final String h() {
        return "cms_notifications";
    }

    public final int hashCode() {
        dtsq dtsqVar = this.cL;
        return Objects.hash((dtsqVar == null || dtsqVar.b()) ? null : this.cL, this.a, Long.valueOf(this.b), this.c, this.d, this.e, this.f, Long.valueOf(this.g), Long.valueOf(this.h), null);
    }

    @Override // defpackage.dtrq
    public final void i(StringBuilder sb, List list) {
        Object[] objArr = {this.a, Long.valueOf(this.b), this.c, this.d, this.e, this.f, Long.valueOf(this.g), Long.valueOf(this.h)};
        sb.append('(');
        for (int i = 0; i < 8; i++) {
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
        return ((dtro.a) ekhw.a(dtub.b, dtro.a.class)).iB().a() ? String.format(Locale.US, "%s", "CmsNotificationsTable -- REDACTED") : a();
    }
}
