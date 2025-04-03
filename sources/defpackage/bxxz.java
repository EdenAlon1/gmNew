package defpackage;

import android.content.ContentValues;
import android.database.DatabaseUtils;
import defpackage.dtro;
import j$.util.Objects;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class bxxz extends dtro implements dtrq {
    public String a;
    public String b;
    public String c;

    protected bxxz() {
    }

    @Override // defpackage.dtro
    public final String a() {
        return String.format(Locale.US, "SqliteStat1 [tbl: %s,\n  idx: %s,\n  stat: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c));
    }

    @Override // defpackage.dtro
    public final void b(ContentValues contentValues) {
        dtub.u(contentValues, "tbl", this.a);
        dtub.u(contentValues, "idx", this.b);
        dtub.u(contentValues, "stat", this.c);
    }

    @Override // defpackage.dtro
    protected final /* bridge */ /* synthetic */ void c(dtsu dtsuVar) {
        bxyp bxypVar = (bxyp) ((bxyl) dtsuVar);
        aB();
        this.cL = bxypVar.cU();
        if (bxypVar.di(0)) {
            this.a = bxypVar.f();
            fY(0);
        }
        if (bxypVar.di(1)) {
            this.b = bxypVar.c();
            fY(1);
        }
        if (bxypVar.di(2)) {
            this.c = bxypVar.e();
            fY(2);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bxxz)) {
            return false;
        }
        bxxz bxxzVar = (bxxz) obj;
        return super.aD(bxxzVar.cL) && Objects.equals(this.a, bxxzVar.a) && Objects.equals(this.b, bxxzVar.b) && Objects.equals(this.c, bxxzVar.c);
    }

    @Override // defpackage.dtrq
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "sqlite_stat1", dtub.m(new String[]{"tbl", "idx", "stat"}));
    }

    @Override // defpackage.dtrq
    public final String g() {
        return null;
    }

    @Override // defpackage.dtrq
    public final String h() {
        return "sqlite_stat1";
    }

    public final int hashCode() {
        dtsq dtsqVar = this.cL;
        return Objects.hash((dtsqVar == null || dtsqVar.b()) ? null : this.cL, this.a, this.b, this.c, null);
    }

    @Override // defpackage.dtrq
    public final void i(StringBuilder sb, List list) {
        Object[] objArr = {this.a, this.b, this.c};
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
        return ((dtro.a) ekhw.a(dtub.b, dtro.a.class)).iB().a() ? String.format(Locale.US, "%s", "SqliteStat1 -- REDACTED") : a();
    }
}
