package defpackage;

import android.content.ContentValues;
import android.database.DatabaseUtils;
import defpackage.dtro;
import j$.time.Instant;
import j$.util.Objects;
import j$.util.Optional;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class bxjb extends dtro implements dtrq {
    public long a;
    public akcd g;
    public long h;
    public akcz k;
    public Optional b = bdhj.a;
    public akdb c = akdb.b(0);
    public akci d = akci.b(0);
    public Instant e = Instant.EPOCH;
    public Instant f = Instant.EPOCH;
    public Instant i = Instant.EPOCH;
    public Instant j = Instant.EPOCH;

    protected bxjb() {
    }

    @Override // defpackage.dtro
    public final String a() {
        return String.format(Locale.US, "RestoreWorkflowExecutionsTable [_id: %s,\n  session_id: %s,\n  feature: %s,\n  status: %s,\n  start_time: %s,\n  finish_time: %s,\n  backup_database_metadata: %s,\n  initial_messages_version: %s,\n  status_timestamp: %s,\n  last_attachment_request_timestamp: %s,\n  config: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c), String.valueOf(this.d), String.valueOf(this.e), String.valueOf(this.f), String.valueOf(this.g), String.valueOf(this.h), String.valueOf(this.i), String.valueOf(this.j), String.valueOf(this.k));
    }

    @Override // defpackage.dtro
    public final void b(ContentValues contentValues) {
        int intValue = bxle.c().intValue();
        Optional optional = this.b;
        if (optional == null) {
            contentValues.putNull("session_id");
        } else {
            contentValues.put("session_id", bdhj.b(optional));
        }
        akdb akdbVar = this.c;
        if (akdbVar == null) {
            contentValues.putNull("feature");
        } else {
            contentValues.put("feature", Integer.valueOf(akdbVar.d));
        }
        akci akciVar = this.d;
        if (akciVar == null) {
            contentValues.putNull("status");
        } else {
            contentValues.put("status", Integer.valueOf(akciVar.q));
        }
        Instant instant = this.e;
        if (instant == null) {
            contentValues.putNull("start_time");
        } else {
            contentValues.put("start_time", Long.valueOf(bdgw.a(instant)));
        }
        Instant instant2 = this.f;
        if (instant2 == null) {
            contentValues.putNull("finish_time");
        } else {
            contentValues.put("finish_time", Long.valueOf(bdgw.a(instant2)));
        }
        akcd akcdVar = this.g;
        if (akcdVar == null) {
            contentValues.putNull("backup_database_metadata");
        } else {
            contentValues.put("backup_database_metadata", akcdVar.toByteArray());
        }
        if (intValue >= 60110) {
            contentValues.put("initial_messages_version", Long.valueOf(this.h));
        }
        if (intValue >= 60220) {
            Instant instant3 = this.i;
            if (instant3 == null) {
                contentValues.putNull("status_timestamp");
            } else {
                contentValues.put("status_timestamp", Long.valueOf(bdgw.a(instant3)));
            }
        }
        if (intValue >= 60330) {
            Instant instant4 = this.j;
            if (instant4 == null) {
                contentValues.putNull("last_attachment_request_timestamp");
            } else {
                contentValues.put("last_attachment_request_timestamp", Long.valueOf(bdgw.a(instant4)));
            }
        }
        if (intValue >= 60730) {
            akcz akczVar = this.k;
            if (akczVar == null) {
                contentValues.putNull("config");
            } else {
                contentValues.put("config", akczVar.toByteArray());
            }
        }
    }

    @Override // defpackage.dtro
    protected final /* bridge */ /* synthetic */ void c(dtsu dtsuVar) {
        bxkr bxkrVar = (bxkr) ((bxkf) dtsuVar);
        aB();
        this.cL = bxkrVar.cU();
        if (bxkrVar.di(0)) {
            this.a = bxkrVar.c();
            fY(0);
        }
        if (bxkrVar.di(1)) {
            this.b = bxkrVar.n();
            fY(1);
        }
        if (bxkrVar.di(2)) {
            this.c = bxkrVar.i();
            fY(2);
        }
        if (bxkrVar.di(3)) {
            this.d = bxkrVar.g();
            fY(3);
        }
        if (bxkrVar.di(4)) {
            this.e = bxkrVar.l();
            fY(4);
        }
        if (bxkrVar.di(5)) {
            this.f = bxkrVar.j();
            fY(5);
        }
        if (bxkrVar.di(6)) {
            this.g = bxkrVar.f();
            fY(6);
        }
        if (bxkrVar.di(7)) {
            this.h = bxkrVar.e();
            fY(7);
        }
        if (bxkrVar.di(8)) {
            this.i = bxkrVar.m();
            fY(8);
        }
        if (bxkrVar.di(9)) {
            this.j = bxkrVar.k();
            fY(9);
        }
        if (bxkrVar.di(10)) {
            this.k = bxkrVar.h();
            fY(10);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bxjb)) {
            return false;
        }
        bxjb bxjbVar = (bxjb) obj;
        return super.aD(bxjbVar.cL) && this.a == bxjbVar.a && Objects.equals(this.b, bxjbVar.b) && this.c == bxjbVar.c && this.d == bxjbVar.d && Objects.equals(this.e, bxjbVar.e) && Objects.equals(this.f, bxjbVar.f) && Objects.equals(this.g, bxjbVar.g) && this.h == bxjbVar.h && Objects.equals(this.i, bxjbVar.i) && Objects.equals(this.j, bxjbVar.j) && Objects.equals(this.k, bxjbVar.k);
    }

    @Override // defpackage.dtrq
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "restore_workflow_executions", dtub.m(new String[]{"session_id", "feature", "status", "start_time", "finish_time", "backup_database_metadata", "initial_messages_version", "status_timestamp", "last_attachment_request_timestamp", "config"}));
    }

    @Override // defpackage.dtrq
    public final String g() {
        return "_id";
    }

    @Override // defpackage.dtrq
    public final String h() {
        return "restore_workflow_executions";
    }

    public final int hashCode() {
        dtsq dtsqVar = this.cL;
        return Objects.hash((dtsqVar == null || dtsqVar.b()) ? null : this.cL, Long.valueOf(this.a), this.b, this.c, this.d, this.e, this.f, this.g, Long.valueOf(this.h), this.i, this.j, this.k, null);
    }

    @Override // defpackage.dtrq
    public final void i(StringBuilder sb, List list) {
        String b = bdhj.b(this.b);
        akdb akdbVar = this.c;
        Object valueOf = akdbVar == null ? r3 : String.valueOf(akdbVar.d);
        akci akciVar = this.d;
        r3 = akciVar != null ? String.valueOf(akciVar.q) : 0;
        Long valueOf2 = Long.valueOf(bdgw.a(this.e));
        Long valueOf3 = Long.valueOf(bdgw.a(this.f));
        akcd akcdVar = this.g;
        byte[] byteArray = akcdVar == null ? null : akcdVar.toByteArray();
        Long valueOf4 = Long.valueOf(this.h);
        Long valueOf5 = Long.valueOf(bdgw.a(this.i));
        Long valueOf6 = Long.valueOf(bdgw.a(this.j));
        akcz akczVar = this.k;
        Object[] objArr = {b, valueOf, r3, valueOf2, valueOf3, byteArray, valueOf4, valueOf5, valueOf6, akczVar != null ? akczVar.toByteArray() : null};
        sb.append('(');
        for (int i = 0; i < 10; i++) {
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

    public final akcd l() {
        az(6, "backup_database_metadata");
        return this.g;
    }

    public final akci m() {
        az(3, "status");
        return this.d;
    }

    public final String toString() {
        return ((dtro.a) ekhw.a(dtub.b, dtro.a.class)).iB().a() ? String.format(Locale.US, "%s", "RestoreWorkflowExecutionsTable -- REDACTED") : a();
    }
}
