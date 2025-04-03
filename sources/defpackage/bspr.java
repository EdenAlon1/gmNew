package defpackage;

import android.content.ContentValues;
import android.database.DatabaseUtils;
import defpackage.dtro;
import j$.util.Objects;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class bspr extends dtro implements dtrq {
    public byys a = byys.b(0);
    public long b = 0;

    protected bspr() {
    }

    @Override // defpackage.dtro
    public final String a() {
        return String.format(Locale.US, "DataUpgradersTable [_id: %s,\n  last_update_version: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b));
    }

    @Override // defpackage.dtro
    public final void b(ContentValues contentValues) {
        byys byysVar = this.a;
        if (byysVar == null) {
            contentValues.putNull("_id");
        } else {
            contentValues.put("_id", Integer.valueOf(byysVar.a()));
        }
        contentValues.put("last_update_version", Long.valueOf(this.b));
    }

    @Override // defpackage.dtro
    protected final /* bridge */ /* synthetic */ void c(dtsu dtsuVar) {
        bsqe bsqeVar = (bsqe) ((bsqb) dtsuVar);
        aB();
        this.cL = bsqeVar.cU();
        if (bsqeVar.di(0)) {
            this.a = bsqeVar.e();
            fY(0);
        }
        if (bsqeVar.di(1)) {
            this.b = bsqeVar.c();
            fY(1);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bspr)) {
            return false;
        }
        bspr bsprVar = (bspr) obj;
        return super.aD(bsprVar.cL) && this.a == bsprVar.a && this.b == bsprVar.b;
    }

    @Override // defpackage.dtrq
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "data_upgrade_workers", dtub.m(new String[]{"_id", "last_update_version"}));
    }

    @Override // defpackage.dtrq
    public final String g() {
        return null;
    }

    @Override // defpackage.dtrq
    public final String h() {
        return "data_upgrade_workers";
    }

    public final int hashCode() {
        dtsq dtsqVar = this.cL;
        return Objects.hash((dtsqVar == null || dtsqVar.b()) ? null : this.cL, this.a, Long.valueOf(this.b), null);
    }

    @Override // defpackage.dtrq
    public final void i(StringBuilder sb, List list) {
        byys byysVar = this.a;
        Object[] objArr = {byysVar == null ? 0 : String.valueOf(byysVar.a()), Long.valueOf(this.b)};
        sb.append('(');
        for (int i = 0; i < 2; i++) {
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
        az(1, "last_update_version");
        return this.b;
    }

    public final String toString() {
        return ((dtro.a) ekhw.a(dtub.b, dtro.a.class)).iB().a() ? String.format(Locale.US, "%s", "DataUpgradersTable -- REDACTED") : a();
    }
}
