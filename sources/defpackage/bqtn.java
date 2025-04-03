package defpackage;

import android.content.ContentValues;
import android.database.DatabaseUtils;
import defpackage.dtro;
import j$.util.Objects;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class bqtn extends dtro implements dtrq {
    public long a;
    public long b;
    public String c;
    public String d;
    public long e = 0;
    public axue f;
    public String g;
    public long h;

    protected bqtn() {
    }

    @Override // defpackage.dtro
    public final String a() {
        return String.format(Locale.US, "CmsStatusTable [_id: %s,\n  table_type: %s,\n  item_id: %s,\n  cms_id: %s,\n  timestamp: %s,\n  event_type: %s,\n  status: %s,\n  attempt_number: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c), String.valueOf(this.d), String.valueOf(this.e), String.valueOf(this.f), String.valueOf(this.g), String.valueOf(this.h));
    }

    @Override // defpackage.dtro
    public final void b(ContentValues contentValues) {
        contentValues.put("table_type", Long.valueOf(this.b));
        dtub.u(contentValues, "item_id", this.c);
        dtub.u(contentValues, "cms_id", this.d);
        contentValues.put("timestamp", Long.valueOf(this.e));
        axue axueVar = this.f;
        if (axueVar == null) {
            contentValues.putNull("event_type");
        } else {
            contentValues.put("event_type", Integer.valueOf(axueVar.ordinal()));
        }
        dtub.u(contentValues, "status", this.g);
        contentValues.put("attempt_number", Long.valueOf(this.h));
    }

    @Override // defpackage.dtro
    protected final /* bridge */ /* synthetic */ void c(dtsu dtsuVar) {
        bqus bqusVar = (bqus) ((bquj) dtsuVar);
        aB();
        this.cL = bqusVar.cU();
        if (bqusVar.di(0)) {
            this.a = bqusVar.e();
            fY(0);
        }
        if (bqusVar.di(1)) {
            this.b = bqusVar.f();
            fY(1);
        }
        if (bqusVar.di(2)) {
            this.c = bqusVar.j();
            fY(2);
        }
        if (bqusVar.di(3)) {
            this.d = bqusVar.i();
            fY(3);
        }
        if (bqusVar.di(4)) {
            this.e = bqusVar.g();
            fY(4);
        }
        if (bqusVar.di(5)) {
            this.f = bqusVar.h();
            fY(5);
        }
        if (bqusVar.di(6)) {
            this.g = bqusVar.k();
            fY(6);
        }
        if (bqusVar.di(7)) {
            this.h = bqusVar.c();
            fY(7);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bqtn)) {
            return false;
        }
        bqtn bqtnVar = (bqtn) obj;
        return super.aD(bqtnVar.cL) && this.a == bqtnVar.a && this.b == bqtnVar.b && Objects.equals(this.c, bqtnVar.c) && Objects.equals(this.d, bqtnVar.d) && this.e == bqtnVar.e && this.f == bqtnVar.f && Objects.equals(this.g, bqtnVar.g) && this.h == bqtnVar.h;
    }

    @Override // defpackage.dtrq
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "cms_status", dtub.m(new String[]{"table_type", "item_id", "cms_id", "timestamp", "event_type", "status", "attempt_number"}));
    }

    @Override // defpackage.dtrq
    public final String g() {
        return "_id";
    }

    @Override // defpackage.dtrq
    public final String h() {
        return "cms_status";
    }

    public final int hashCode() {
        dtsq dtsqVar = this.cL;
        dtsq dtsqVar2 = (dtsqVar == null || dtsqVar.b()) ? null : this.cL;
        Long valueOf = Long.valueOf(this.a);
        Long valueOf2 = Long.valueOf(this.b);
        String str = this.c;
        String str2 = this.d;
        Long valueOf3 = Long.valueOf(this.e);
        axue axueVar = this.f;
        return Objects.hash(dtsqVar2, valueOf, valueOf2, str, str2, valueOf3, Integer.valueOf(axueVar == null ? 0 : axueVar.ordinal()), this.g, Long.valueOf(this.h), null);
    }

    @Override // defpackage.dtrq
    public final void i(StringBuilder sb, List list) {
        Long valueOf = Long.valueOf(this.b);
        String str = this.c;
        String str2 = this.d;
        Long valueOf2 = Long.valueOf(this.e);
        axue axueVar = this.f;
        Object[] objArr = {valueOf, str, str2, valueOf2, axueVar == null ? 0 : String.valueOf(axueVar.ordinal()), this.g, Long.valueOf(this.h)};
        sb.append('(');
        for (int i = 0; i < 7; i++) {
            Object obj = objArr[i];
            if (obj instanceof Number) {
                sb.append(String.valueOf(obj));
            } else {
                if (obj instanceof String) {
                    String str3 = (String) obj;
                    if (str3.length() < 12) {
                        sb.append(DatabaseUtils.sqlEscapeString(str3));
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
        return ((dtro.a) ekhw.a(dtub.b, dtro.a.class)).iB().a() ? String.format(Locale.US, "%s", "CmsStatusTable -- REDACTED") : a();
    }
}
