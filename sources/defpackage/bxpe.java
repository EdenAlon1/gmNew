package defpackage;

import android.content.ContentValues;
import android.database.DatabaseUtils;
import defpackage.dtro;
import j$.util.Objects;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class bxpe extends dtro implements dtrq {
    public byyn a;
    public String b;
    public long c;
    public long d;

    protected bxpe() {
    }

    @Override // defpackage.dtro
    public final String a() {
        return String.format(Locale.US, "RestoreWorkflowScratchTimestampsTable [which_database: %s,\n  message_id: %s,\n  timestamp_in_seconds: %s,\n  timestamp_mod_1000: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c), String.valueOf(this.d));
    }

    @Override // defpackage.dtro
    public final void b(ContentValues contentValues) {
        byyn byynVar = this.a;
        if (byynVar == null) {
            contentValues.putNull("which_database");
        } else {
            contentValues.put("which_database", Integer.valueOf(byynVar.ordinal()));
        }
        dtub.u(contentValues, "message_id", this.b);
        contentValues.put("timestamp_in_seconds", Long.valueOf(this.c));
        contentValues.put("timestamp_mod_1000", Long.valueOf(this.d));
    }

    @Override // defpackage.dtro
    protected final /* bridge */ /* synthetic */ void c(dtsu dtsuVar) {
        bxpx bxpxVar = (bxpx) ((bxps) dtsuVar);
        aB();
        this.cL = bxpxVar.cU();
        if (bxpxVar.di(0)) {
            this.a = bxpxVar.f();
            fY(0);
        }
        if (bxpxVar.di(1)) {
            this.b = bxpxVar.g();
            fY(1);
        }
        if (bxpxVar.di(2)) {
            this.c = bxpxVar.c();
            fY(2);
        }
        if (bxpxVar.di(3)) {
            this.d = bxpxVar.e();
            fY(3);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bxpe)) {
            return false;
        }
        bxpe bxpeVar = (bxpe) obj;
        return super.aD(bxpeVar.cL) && this.a == bxpeVar.a && Objects.equals(this.b, bxpeVar.b) && this.c == bxpeVar.c && this.d == bxpeVar.d;
    }

    @Override // defpackage.dtrq
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "restore_workflow_scratch_timestamps", dtub.m(new String[]{"which_database", "message_id", "timestamp_in_seconds", "timestamp_mod_1000"}));
    }

    @Override // defpackage.dtrq
    public final String g() {
        return null;
    }

    @Override // defpackage.dtrq
    public final String h() {
        return "restore_workflow_scratch_timestamps";
    }

    public final int hashCode() {
        dtsq dtsqVar = this.cL;
        dtsq dtsqVar2 = (dtsqVar == null || dtsqVar.b()) ? null : this.cL;
        byyn byynVar = this.a;
        return Objects.hash(dtsqVar2, Integer.valueOf(byynVar == null ? 0 : byynVar.ordinal()), this.b, Long.valueOf(this.c), Long.valueOf(this.d), null);
    }

    @Override // defpackage.dtrq
    public final void i(StringBuilder sb, List list) {
        byyn byynVar = this.a;
        Object[] objArr = {byynVar == null ? 0 : String.valueOf(byynVar.ordinal()), this.b, Long.valueOf(this.c), Long.valueOf(this.d)};
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

    public final String toString() {
        return ((dtro.a) ekhw.a(dtub.b, dtro.a.class)).iB().a() ? String.format(Locale.US, "%s", "RestoreWorkflowScratchTimestampsTable -- REDACTED") : a();
    }
}
