package defpackage;

import android.content.ContentValues;
import android.database.DatabaseUtils;
import defpackage.dtro;
import j$.util.Objects;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class bqge extends dtro implements dtrq {
    public long a;
    public long b;
    public long c;
    public long d;

    protected bqge() {
    }

    @Override // defpackage.dtro
    public final String a() {
        return String.format(Locale.US, "CmsBackupDependencyCacheTable [_id: %s,\n  dependent_id: %s,\n  dependency_id: %s,\n  inserted_at_timestamp: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c), String.valueOf(this.d));
    }

    @Override // defpackage.dtro
    public final void b(ContentValues contentValues) {
        contentValues.put("dependent_id", Long.valueOf(this.b));
        contentValues.put("dependency_id", Long.valueOf(this.c));
        contentValues.put("inserted_at_timestamp", Long.valueOf(this.d));
    }

    @Override // defpackage.dtro
    protected final /* bridge */ /* synthetic */ void c(dtsu dtsuVar) {
        bqgx bqgxVar = (bqgx) ((bqgs) dtsuVar);
        aB();
        this.cL = bqgxVar.cU();
        if (bqgxVar.di(0)) {
            this.a = bqgxVar.f();
            fY(0);
        }
        if (bqgxVar.di(1)) {
            this.b = bqgxVar.e();
            fY(1);
        }
        if (bqgxVar.di(2)) {
            this.c = bqgxVar.c();
            fY(2);
        }
        if (bqgxVar.di(3)) {
            this.d = bqgxVar.g();
            fY(3);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bqge)) {
            return false;
        }
        bqge bqgeVar = (bqge) obj;
        return super.aD(bqgeVar.cL) && this.a == bqgeVar.a && this.b == bqgeVar.b && this.c == bqgeVar.c && this.d == bqgeVar.d;
    }

    @Override // defpackage.dtrq
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "cms_backup_dependency_cache_table", dtub.m(new String[]{"dependent_id", "dependency_id", "inserted_at_timestamp"}));
    }

    @Override // defpackage.dtrq
    public final String g() {
        return "_id";
    }

    @Override // defpackage.dtrq
    public final String h() {
        return "cms_backup_dependency_cache_table";
    }

    public final int hashCode() {
        dtsq dtsqVar = this.cL;
        return Objects.hash((dtsqVar == null || dtsqVar.b()) ? null : this.cL, Long.valueOf(this.a), Long.valueOf(this.b), Long.valueOf(this.c), Long.valueOf(this.d), null);
    }

    @Override // defpackage.dtrq
    public final void i(StringBuilder sb, List list) {
        Object[] objArr = {Long.valueOf(this.b), Long.valueOf(this.c), Long.valueOf(this.d)};
        sb.append('(');
        for (int i = 0; i < 3; i++) {
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
        return ((dtro.a) ekhw.a(dtub.b, dtro.a.class)).iB().a() ? String.format(Locale.US, "%s", "CmsBackupDependencyCacheTable -- REDACTED") : a();
    }
}
