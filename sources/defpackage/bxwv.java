package defpackage;

import android.content.ContentValues;
import android.database.DatabaseUtils;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoDatabaseConstants;
import defpackage.dtro;
import j$.util.Objects;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class bxwv extends dtro implements dtrq {
    public String a;
    public String b;
    public String c;
    public long d;
    public String e;

    protected bxwv() {
    }

    @Override // defpackage.dtro
    public final String a() {
        return String.format(Locale.US, "SqliteMaster [type: %s,\n  name: %s,\n  tbl_name: %s,\n  rootpage: %s,\n  sql: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c), String.valueOf(this.d), String.valueOf(this.e));
    }

    @Override // defpackage.dtro
    public final void b(ContentValues contentValues) {
        dtub.u(contentValues, BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.TYPE, this.a);
        dtub.u(contentValues, "name", this.b);
        dtub.u(contentValues, "tbl_name", this.c);
        contentValues.put("rootpage", Long.valueOf(this.d));
        dtub.u(contentValues, "sql", this.e);
    }

    @Override // defpackage.dtro
    protected final /* bridge */ /* synthetic */ void c(dtsu dtsuVar) {
        bxxr bxxrVar = (bxxr) ((bxxl) dtsuVar);
        aB();
        this.cL = bxxrVar.cU();
        if (bxxrVar.di(0)) {
            this.a = bxxrVar.h();
            fY(0);
        }
        if (bxxrVar.di(1)) {
            this.b = bxxrVar.e();
            fY(1);
        }
        if (bxxrVar.di(2)) {
            this.c = bxxrVar.g();
            fY(2);
        }
        if (bxxrVar.di(3)) {
            this.d = bxxrVar.c();
            fY(3);
        }
        if (bxxrVar.di(4)) {
            this.e = bxxrVar.f();
            fY(4);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bxwv)) {
            return false;
        }
        bxwv bxwvVar = (bxwv) obj;
        return super.aD(bxwvVar.cL) && Objects.equals(this.a, bxwvVar.a) && Objects.equals(this.b, bxwvVar.b) && Objects.equals(this.c, bxwvVar.c) && this.d == bxwvVar.d && Objects.equals(this.e, bxwvVar.e);
    }

    @Override // defpackage.dtrq
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "sqlite_master", dtub.m(new String[]{BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.TYPE, "name", "tbl_name", "rootpage", "sql"}));
    }

    @Override // defpackage.dtrq
    public final String g() {
        return null;
    }

    @Override // defpackage.dtrq
    public final String h() {
        return "sqlite_master";
    }

    public final int hashCode() {
        dtsq dtsqVar = this.cL;
        return Objects.hash((dtsqVar == null || dtsqVar.b()) ? null : this.cL, this.a, this.b, this.c, Long.valueOf(this.d), this.e, null);
    }

    @Override // defpackage.dtrq
    public final void i(StringBuilder sb, List list) {
        Object[] objArr = {this.a, this.b, this.c, Long.valueOf(this.d), this.e};
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
        return ((dtro.a) ekhw.a(dtub.b, dtro.a.class)).iB().a() ? String.format(Locale.US, "%s", "SqliteMaster -- REDACTED") : a();
    }
}
