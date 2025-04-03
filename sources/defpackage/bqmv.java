package defpackage;

import android.content.ContentValues;
import android.database.DatabaseUtils;
import defpackage.dtro;
import j$.util.Objects;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class bqmv extends dtro implements dtrq {
    public long a;
    public long b;
    public long c;
    public String d;
    public long e;
    public long f;
    public long g;

    protected bqmv() {
    }

    @Override // defpackage.dtro
    public final String a() {
        return String.format(Locale.US, "CmsIncrementalEventsTable [_id: %s,\n  table_type: %s,\n  operation: %s,\n  bugle_id: %s,\n  attempt_count: %s,\n  create_timestamp: %s,\n  last_attempt_timestamp: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c), String.valueOf(this.d), String.valueOf(this.e), String.valueOf(this.f), String.valueOf(this.g));
    }

    @Override // defpackage.dtro
    public final void b(ContentValues contentValues) {
        contentValues.put("table_type", Long.valueOf(this.b));
        contentValues.put("operation", Long.valueOf(this.c));
        dtub.u(contentValues, "bugle_id", this.d);
        contentValues.put("attempt_count", Long.valueOf(this.e));
        contentValues.put("create_timestamp", Long.valueOf(this.f));
        contentValues.put("last_attempt_timestamp", Long.valueOf(this.g));
    }

    @Override // defpackage.dtro
    protected final /* bridge */ /* synthetic */ void c(dtsu dtsuVar) {
        bqnz bqnzVar = (bqnz) ((bqnr) dtsuVar);
        aB();
        this.cL = bqnzVar.cU();
        if (bqnzVar.di(0)) {
            this.a = bqnzVar.f();
            super.fY(0);
        }
        if (bqnzVar.di(1)) {
            this.b = bqnzVar.i();
            super.fY(1);
        }
        if (bqnzVar.di(2)) {
            this.c = bqnzVar.h();
            super.fY(2);
        }
        if (bqnzVar.di(3)) {
            this.d = bqnzVar.j();
            super.fY(3);
        }
        if (bqnzVar.di(4)) {
            this.e = bqnzVar.c();
            super.fY(4);
        }
        if (bqnzVar.di(5)) {
            this.f = bqnzVar.e();
            super.fY(5);
        }
        if (bqnzVar.di(6)) {
            this.g = bqnzVar.g();
            super.fY(6);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bqmv)) {
            return false;
        }
        bqmv bqmvVar = (bqmv) obj;
        return super.aD(bqmvVar.cL) && this.a == bqmvVar.a && this.b == bqmvVar.b && this.c == bqmvVar.c && Objects.equals(this.d, bqmvVar.d) && this.e == bqmvVar.e && this.f == bqmvVar.f && this.g == bqmvVar.g;
    }

    @Override // defpackage.dtrq
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "cms_incremental_events", dtub.m(new String[]{"table_type", "operation", "bugle_id", "attempt_count", "create_timestamp", "last_attempt_timestamp"}));
    }

    @Override // defpackage.dtro
    public final void fY(int i) {
        super.fY(0);
    }

    @Override // defpackage.dtrq
    public final String g() {
        return "_id";
    }

    @Override // defpackage.dtrq
    public final String h() {
        return "cms_incremental_events";
    }

    public final int hashCode() {
        dtsq dtsqVar = this.cL;
        return Objects.hash((dtsqVar == null || dtsqVar.b()) ? null : this.cL, Long.valueOf(this.a), Long.valueOf(this.b), Long.valueOf(this.c), this.d, Long.valueOf(this.e), Long.valueOf(this.f), Long.valueOf(this.g), null);
    }

    @Override // defpackage.dtrq
    public final void i(StringBuilder sb, List list) {
        Object[] objArr = {Long.valueOf(this.b), Long.valueOf(this.c), this.d, Long.valueOf(this.e), Long.valueOf(this.f), Long.valueOf(this.g)};
        sb.append('(');
        for (int i = 0; i < 6; i++) {
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

    public final long k() {
        az(4, "attempt_count");
        return this.e;
    }

    public final long l() {
        az(0, "_id");
        return this.a;
    }

    public final long m() {
        az(2, "operation");
        return this.c;
    }

    public final long n() {
        az(1, "table_type");
        return this.b;
    }

    public final String o() {
        az(3, "bugle_id");
        return this.d;
    }

    public final /* synthetic */ void q(Long l) {
        if (l.longValue() >= 0) {
            this.a = new bqms(l).a.longValue();
            super.fY(0);
        }
    }

    public final String toString() {
        return ((dtro.a) ekhw.a(dtub.b, dtro.a.class)).iB().a() ? String.format(Locale.US, "%s", "CmsIncrementalEventsTable -- REDACTED") : a();
    }
}
