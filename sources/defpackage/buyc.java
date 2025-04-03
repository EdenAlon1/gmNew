package defpackage;

import android.content.ContentValues;
import android.database.DatabaseUtils;
import defpackage.dtro;
import j$.util.Objects;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class buyc extends dtro implements dtrq {
    public long a;
    public long b;
    public long c;
    public String d;
    public String e;
    public String f;

    protected buyc() {
    }

    @Override // defpackage.dtro
    public final String a() {
        return String.format(Locale.US, "ModifiedByTable [_id: %s,\n  am_version_code: %s,\n  stack_trace_hash: %s,\n  source: %s,\n  tiktok_trace: %s,\n  stack_trace: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c), String.valueOf(this.d), String.valueOf(this.e), String.valueOf(this.f));
    }

    @Override // defpackage.dtro
    public final void b(ContentValues contentValues) {
        contentValues.put("am_version_code", Long.valueOf(this.b));
        contentValues.put("stack_trace_hash", Long.valueOf(this.c));
        dtub.u(contentValues, "source", this.d);
        dtub.u(contentValues, "tiktok_trace", this.e);
        dtub.u(contentValues, "stack_trace", this.f);
    }

    @Override // defpackage.dtro
    protected final /* bridge */ /* synthetic */ void c(dtsu dtsuVar) {
        buzb buzbVar = (buzb) ((buyu) dtsuVar);
        aB();
        this.cL = buzbVar.cU();
        if (buzbVar.di(0)) {
            this.a = buzbVar.e();
            fY(0);
        }
        if (buzbVar.di(1)) {
            this.b = buzbVar.c();
            fY(1);
        }
        if (buzbVar.di(2)) {
            this.c = buzbVar.f();
            fY(2);
        }
        if (buzbVar.di(3)) {
            this.d = buzbVar.g();
            fY(3);
        }
        if (buzbVar.di(4)) {
            this.e = buzbVar.i();
            fY(4);
        }
        if (buzbVar.di(5)) {
            this.f = buzbVar.h();
            fY(5);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof buyc)) {
            return false;
        }
        buyc buycVar = (buyc) obj;
        return super.aD(buycVar.cL) && this.a == buycVar.a && this.b == buycVar.b && this.c == buycVar.c && Objects.equals(this.d, buycVar.d) && Objects.equals(this.e, buycVar.e) && Objects.equals(this.f, buycVar.f);
    }

    @Override // defpackage.dtrq
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "modified_by", dtub.m(new String[]{"am_version_code", "stack_trace_hash", "source", "tiktok_trace", "stack_trace"}));
    }

    @Override // defpackage.dtrq
    public final String g() {
        return "_id";
    }

    @Override // defpackage.dtrq
    public final String h() {
        return "modified_by";
    }

    public final int hashCode() {
        dtsq dtsqVar = this.cL;
        return Objects.hash((dtsqVar == null || dtsqVar.b()) ? null : this.cL, Long.valueOf(this.a), Long.valueOf(this.b), Long.valueOf(this.c), this.d, this.e, this.f, null);
    }

    @Override // defpackage.dtrq
    public final void i(StringBuilder sb, List list) {
        Object[] objArr = {Long.valueOf(this.b), Long.valueOf(this.c), this.d, this.e, this.f};
        sb.append('(');
        for (int i = 0; i < 5; i++) {
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
        return ((dtro.a) ekhw.a(dtub.b, dtro.a.class)).iB().a() ? String.format(Locale.US, "%s", "ModifiedByTable -- REDACTED") : a();
    }
}
