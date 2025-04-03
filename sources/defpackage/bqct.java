package defpackage;

import android.content.ContentValues;
import android.database.DatabaseUtils;
import defpackage.dtro;
import j$.util.Objects;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class bqct extends dtro implements dtrq {
    public long a;
    public String b;
    public long c;
    public long d;
    public long e;

    protected bqct() {
    }

    @Override // defpackage.dtro
    public final String a() {
        return String.format(Locale.US, "BackupIdMapTable [_id: %s,\n  table_name: %s,\n  backup_id: %s,\n  bugle_id: %s,\n  status: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c), String.valueOf(this.d), String.valueOf(this.e));
    }

    @Override // defpackage.dtro
    public final void b(ContentValues contentValues) {
        dtub.u(contentValues, "table_name", this.b);
        contentValues.put("backup_id", Long.valueOf(this.c));
        contentValues.put("bugle_id", Long.valueOf(this.d));
        contentValues.put("status", Long.valueOf(this.e));
    }

    @Override // defpackage.dtro
    protected final /* bridge */ /* synthetic */ void c(dtsu dtsuVar) {
        bqdp bqdpVar = (bqdp) ((bqdj) dtsuVar);
        aB();
        this.cL = bqdpVar.cU();
        if (bqdpVar.di(0)) {
            this.a = bqdpVar.f();
            fY(0);
        }
        if (bqdpVar.di(1)) {
            this.b = bqdpVar.h();
            fY(1);
        }
        if (bqdpVar.di(2)) {
            this.c = bqdpVar.c();
            fY(2);
        }
        if (bqdpVar.di(3)) {
            this.d = bqdpVar.e();
            fY(3);
        }
        if (bqdpVar.di(4)) {
            this.e = bqdpVar.g();
            fY(4);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bqct)) {
            return false;
        }
        bqct bqctVar = (bqct) obj;
        return super.aD(bqctVar.cL) && this.a == bqctVar.a && Objects.equals(this.b, bqctVar.b) && this.c == bqctVar.c && this.d == bqctVar.d && this.e == bqctVar.e;
    }

    @Override // defpackage.dtrq
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "backup_id_map", dtub.m(new String[]{"table_name", "backup_id", "bugle_id", "status"}));
    }

    @Override // defpackage.dtrq
    public final String g() {
        return "_id";
    }

    @Override // defpackage.dtrq
    public final String h() {
        return "backup_id_map";
    }

    public final int hashCode() {
        dtsq dtsqVar = this.cL;
        return Objects.hash((dtsqVar == null || dtsqVar.b()) ? null : this.cL, Long.valueOf(this.a), this.b, Long.valueOf(this.c), Long.valueOf(this.d), Long.valueOf(this.e), null);
    }

    @Override // defpackage.dtrq
    public final void i(StringBuilder sb, List list) {
        Object[] objArr = {this.b, Long.valueOf(this.c), Long.valueOf(this.d), Long.valueOf(this.e)};
        sb.append('(');
        for (int i = 0; i < 4; i++) {
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
        az(3, "bugle_id");
        return this.d;
    }

    public final String toString() {
        return ((dtro.a) ekhw.a(dtub.b, dtro.a.class)).iB().a() ? String.format(Locale.US, "%s", "BackupIdMapTable -- REDACTED") : a();
    }
}
