package defpackage;

import android.content.ContentValues;
import android.database.DatabaseUtils;
import defpackage.dtro;
import j$.time.Instant;
import j$.util.Objects;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class bcdz extends dtro implements dtrq {
    public Instant a = Instant.EPOCH;
    public int b;
    public String c;

    protected bcdz() {
    }

    @Override // defpackage.dtro
    public final String a() {
        return String.format(Locale.US, "BackupMetadataTable [created_timestamp: %s,\n  schema_version: %s,\n  backup_id: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c));
    }

    @Override // defpackage.dtro
    public final void b(ContentValues contentValues) {
        bcfa.c().intValue();
        Instant instant = this.a;
        if (instant == null) {
            contentValues.putNull("created_timestamp");
        } else {
            contentValues.put("created_timestamp", Long.valueOf(bdgw.a(instant)));
        }
        contentValues.put("schema_version", Integer.valueOf(this.b));
        dtub.u(contentValues, "backup_id", this.c);
    }

    @Override // defpackage.dtro
    protected final /* bridge */ /* synthetic */ void c(dtsu dtsuVar) {
        bcer bcerVar = (bcer) ((bcen) dtsuVar);
        aB();
        this.cL = bcerVar.cU();
        if (bcerVar.di(0)) {
            this.a = bcerVar.e();
            fY(0);
        }
        if (bcerVar.di(1)) {
            this.b = bcerVar.c();
            fY(1);
        }
        if (bcerVar.di(2)) {
            this.c = bcerVar.f();
            fY(2);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bcdz)) {
            return false;
        }
        bcdz bcdzVar = (bcdz) obj;
        return super.aD(bcdzVar.cL) && Objects.equals(this.a, bcdzVar.a) && this.b == bcdzVar.b && Objects.equals(this.c, bcdzVar.c);
    }

    @Override // defpackage.dtrq
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "backup_metadata", dtub.m(new String[]{"created_timestamp", "schema_version", "backup_id"}));
    }

    @Override // defpackage.dtrq
    public final String g() {
        return null;
    }

    @Override // defpackage.dtrq
    public final String h() {
        return "backup_metadata";
    }

    public final int hashCode() {
        dtsq dtsqVar = this.cL;
        return Objects.hash((dtsqVar == null || dtsqVar.b()) ? null : this.cL, this.a, Integer.valueOf(this.b), this.c, null);
    }

    @Override // defpackage.dtrq
    public final void i(StringBuilder sb, List list) {
        Object[] objArr = {Long.valueOf(bdgw.a(this.a)), Integer.valueOf(this.b), this.c};
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
        return ((dtro.a) ekhw.a(dtub.b, dtro.a.class)).iB().a() ? String.format(Locale.US, "%s", "BackupMetadataTable -- REDACTED") : a();
    }
}
