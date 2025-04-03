package defpackage;

import android.content.ContentValues;
import android.database.DatabaseUtils;
import defpackage.dtro;
import j$.util.Objects;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class bxlk extends dtro implements dtrq {
    public long a;
    public long b;
    public akcg c;
    public bxmw d;
    public bxmv e;

    protected bxlk() {
    }

    @Override // defpackage.dtro
    public final String a() {
        return String.format(Locale.US, "RestoreWorkflowFilesTable [_id: %s,\n  workflow_execution_id: %s,\n  backup_file: %s,\n  file_type: %s,\n  status: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c), String.valueOf(this.d), String.valueOf(this.e));
    }

    @Override // defpackage.dtro
    public final void b(ContentValues contentValues) {
        dtub.t(contentValues, "workflow_execution_id", this.b);
        akcg akcgVar = this.c;
        if (akcgVar == null) {
            contentValues.putNull("backup_file");
        } else {
            contentValues.put("backup_file", akcgVar.toByteArray());
        }
        bxmw bxmwVar = this.d;
        if (bxmwVar == null) {
            contentValues.putNull("file_type");
        } else {
            contentValues.put("file_type", Integer.valueOf(bxmwVar.ordinal()));
        }
        bxmv bxmvVar = this.e;
        if (bxmvVar == null) {
            contentValues.putNull("status");
        } else {
            contentValues.put("status", Integer.valueOf(bxmvVar.ordinal()));
        }
    }

    @Override // defpackage.dtro
    protected final /* bridge */ /* synthetic */ void c(dtsu dtsuVar) {
        bxmj bxmjVar = (bxmj) ((bxmd) dtsuVar);
        aB();
        this.cL = bxmjVar.cU();
        if (bxmjVar.di(0)) {
            this.a = bxmjVar.c();
            fY(0);
        }
        if (bxmjVar.di(1)) {
            this.b = bxmjVar.e();
            fY(1);
        }
        if (bxmjVar.di(2)) {
            this.c = bxmjVar.f();
            fY(2);
        }
        if (bxmjVar.di(3)) {
            this.d = bxmjVar.h();
            fY(3);
        }
        if (bxmjVar.di(4)) {
            this.e = bxmjVar.g();
            fY(4);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bxlk)) {
            return false;
        }
        bxlk bxlkVar = (bxlk) obj;
        return super.aD(bxlkVar.cL) && this.a == bxlkVar.a && this.b == bxlkVar.b && Objects.equals(this.c, bxlkVar.c) && this.d == bxlkVar.d && this.e == bxlkVar.e;
    }

    @Override // defpackage.dtrq
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "restore_workflow_files", dtub.m(new String[]{"workflow_execution_id", "backup_file", "file_type", "status"}));
    }

    @Override // defpackage.dtrq
    public final String g() {
        return "_id";
    }

    @Override // defpackage.dtrq
    public final String h() {
        return "restore_workflow_files";
    }

    public final int hashCode() {
        dtsq dtsqVar = this.cL;
        dtsq dtsqVar2 = (dtsqVar == null || dtsqVar.b()) ? null : this.cL;
        Long valueOf = Long.valueOf(this.a);
        Long valueOf2 = Long.valueOf(this.b);
        akcg akcgVar = this.c;
        bxmw bxmwVar = this.d;
        Integer valueOf3 = Integer.valueOf(bxmwVar == null ? 0 : bxmwVar.ordinal());
        bxmv bxmvVar = this.e;
        return Objects.hash(dtsqVar2, valueOf, valueOf2, akcgVar, valueOf3, Integer.valueOf(bxmvVar == null ? 0 : bxmvVar.ordinal()), null);
    }

    @Override // defpackage.dtrq
    public final void i(StringBuilder sb, List list) {
        Long valueOf = Long.valueOf(this.b);
        akcg akcgVar = this.c;
        byte[] byteArray = akcgVar == null ? null : akcgVar.toByteArray();
        bxmw bxmwVar = this.d;
        Object valueOf2 = bxmwVar == null ? 0 : String.valueOf(bxmwVar.ordinal());
        bxmv bxmvVar = this.e;
        Object[] objArr = {valueOf, byteArray, valueOf2, bxmvVar == null ? 0 : String.valueOf(bxmvVar.ordinal())};
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
        az(0, "_id");
        return this.a;
    }

    public final akcg l() {
        az(2, "backup_file");
        return this.c;
    }

    public final String toString() {
        return ((dtro.a) ekhw.a(dtub.b, dtro.a.class)).iB().a() ? String.format(Locale.US, "%s", "RestoreWorkflowFilesTable -- REDACTED") : a();
    }
}
