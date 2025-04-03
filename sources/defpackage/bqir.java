package defpackage;

import android.content.ContentValues;
import android.database.DatabaseUtils;
import defpackage.dtro;
import j$.util.Objects;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class bqir extends dtro implements dtrq {
    public String a;
    public String b;
    public bqkx c;
    public bqkw d;
    public ccce h;
    public int i;
    public epeg e = epeg.b(0);
    public int f = -1;
    public String g = "-1";
    public int j = -1;
    public String k = "-1";

    protected bqir() {
    }

    @Override // defpackage.dtro
    public final String a() {
        return String.format(Locale.US, "CmsDeadLetterQueueTable [_id: %s,\n  cms_id: %s,\n  cms_data_type: %s,\n  abandoned_action: %s,\n  failure_reason: %s,\n  bugle_table_type: %s,\n  bugle_id: %s,\n  cms_backup_parameters: %s,\n  backup_flags: %s,\n  backup_dependency_table_type: %s,\n  backup_dependency_bugle_id: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c), String.valueOf(this.d), String.valueOf(this.e), String.valueOf(this.f), String.valueOf(this.g), String.valueOf(this.h), String.valueOf(this.i), String.valueOf(this.j), String.valueOf(this.k));
    }

    @Override // defpackage.dtro
    public final void b(ContentValues contentValues) {
        int intValue = bqkv.c().intValue();
        dtub.u(contentValues, "cms_id", this.b);
        bqkx bqkxVar = this.c;
        if (bqkxVar == null) {
            contentValues.putNull("cms_data_type");
        } else {
            contentValues.put("cms_data_type", Integer.valueOf(bqkxVar.ordinal()));
        }
        bqkw bqkwVar = this.d;
        if (bqkwVar == null) {
            contentValues.putNull("abandoned_action");
        } else {
            contentValues.put("abandoned_action", Integer.valueOf(bqkwVar.ordinal()));
        }
        epeg epegVar = this.e;
        if (epegVar == null) {
            contentValues.putNull("failure_reason");
        } else {
            contentValues.put("failure_reason", Integer.valueOf(epegVar.bs));
        }
        if (intValue >= 57090) {
            contentValues.put("bugle_table_type", Integer.valueOf(this.f));
        }
        if (intValue >= 57090) {
            dtub.u(contentValues, "bugle_id", this.g);
        }
        if (intValue >= 57090) {
            ccce ccceVar = this.h;
            if (ccceVar == null) {
                contentValues.putNull("cms_backup_parameters");
            } else {
                contentValues.put("cms_backup_parameters", ccceVar.toByteArray());
            }
        }
        if (intValue >= 57090) {
            contentValues.put("backup_flags", Integer.valueOf(this.i));
        }
        if (intValue >= 57090) {
            contentValues.put("backup_dependency_table_type", Integer.valueOf(this.j));
        }
        if (intValue >= 57090) {
            dtub.u(contentValues, "backup_dependency_bugle_id", this.k);
        }
    }

    @Override // defpackage.dtro
    protected final /* bridge */ /* synthetic */ void c(dtsu dtsuVar) {
        bqkh bqkhVar = (bqkh) ((bqjv) dtsuVar);
        aB();
        this.cL = bqkhVar.cU();
        if (bqkhVar.di(0)) {
            this.a = bqkhVar.n();
            super.fY(0);
        }
        if (bqkhVar.di(1)) {
            this.b = bqkhVar.m();
            super.fY(1);
        }
        if (bqkhVar.di(2)) {
            this.c = bqkhVar.h();
            super.fY(2);
        }
        if (bqkhVar.di(3)) {
            this.d = bqkhVar.g();
            super.fY(3);
        }
        if (bqkhVar.di(4)) {
            this.e = bqkhVar.j();
            super.fY(4);
        }
        if (bqkhVar.di(5)) {
            this.f = bqkhVar.f();
            super.fY(5);
        }
        if (bqkhVar.di(6)) {
            this.g = bqkhVar.l();
            super.fY(6);
        }
        if (bqkhVar.di(7)) {
            this.h = bqkhVar.i();
            super.fY(7);
        }
        if (bqkhVar.di(8)) {
            this.i = bqkhVar.e();
            super.fY(8);
        }
        if (bqkhVar.di(9)) {
            this.j = bqkhVar.c();
            super.fY(9);
        }
        if (bqkhVar.di(10)) {
            this.k = bqkhVar.k();
            super.fY(10);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bqir)) {
            return false;
        }
        bqir bqirVar = (bqir) obj;
        return super.aD(bqirVar.cL) && Objects.equals(this.a, bqirVar.a) && Objects.equals(this.b, bqirVar.b) && this.c == bqirVar.c && this.d == bqirVar.d && this.e == bqirVar.e && this.f == bqirVar.f && Objects.equals(this.g, bqirVar.g) && Objects.equals(this.h, bqirVar.h) && this.i == bqirVar.i && this.j == bqirVar.j && Objects.equals(this.k, bqirVar.k);
    }

    @Override // defpackage.dtrq
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "cms_dead_letter_queue", dtub.m(new String[]{"cms_id", "cms_data_type", "abandoned_action", "failure_reason", "bugle_table_type", "bugle_id", "cms_backup_parameters", "backup_flags", "backup_dependency_table_type", "backup_dependency_bugle_id"}));
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
        return "cms_dead_letter_queue";
    }

    public final int hashCode() {
        dtsq dtsqVar = this.cL;
        dtsq dtsqVar2 = (dtsqVar == null || dtsqVar.b()) ? null : this.cL;
        String str = this.a;
        String str2 = this.b;
        bqkx bqkxVar = this.c;
        Integer valueOf = Integer.valueOf(bqkxVar == null ? 0 : bqkxVar.ordinal());
        bqkw bqkwVar = this.d;
        return Objects.hash(dtsqVar2, str, str2, valueOf, Integer.valueOf(bqkwVar == null ? 0 : bqkwVar.ordinal()), this.e, Integer.valueOf(this.f), this.g, this.h, Integer.valueOf(this.i), Integer.valueOf(this.j), this.k, null);
    }

    @Override // defpackage.dtrq
    public final void i(StringBuilder sb, List list) {
        String str = this.b;
        bqkx bqkxVar = this.c;
        Object valueOf = bqkxVar == null ? r3 : String.valueOf(bqkxVar.ordinal());
        bqkw bqkwVar = this.d;
        Object valueOf2 = bqkwVar == null ? r3 : String.valueOf(bqkwVar.ordinal());
        epeg epegVar = this.e;
        r3 = epegVar != null ? String.valueOf(epegVar.bs) : 0;
        Integer valueOf3 = Integer.valueOf(this.f);
        String str2 = this.g;
        ccce ccceVar = this.h;
        Object[] objArr = {str, valueOf, valueOf2, r3, valueOf3, str2, ccceVar == null ? null : ccceVar.toByteArray(), Integer.valueOf(this.i), Integer.valueOf(this.j), this.k};
        sb.append('(');
        for (int i = 0; i < 10; i++) {
            Object obj = objArr[i];
            if (obj instanceof Number) {
                sb.append(String.valueOf(obj));
            } else {
                if (obj instanceof String) {
                    String str3 = (String) obj;
                    if (str3.length() < 12) {
                        sb.append(DatabaseUtils.sqlEscapeString(str3));
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

    public final ccce k() {
        az(7, "cms_backup_parameters");
        return this.h;
    }

    public final epeg l() {
        az(4, "failure_reason");
        return this.e;
    }

    public final String m() {
        az(6, "bugle_id");
        return this.g;
    }

    public final String n() {
        az(0, "_id");
        return this.a;
    }

    public final /* synthetic */ void o(final Long l) {
        if (l.longValue() >= 0) {
            this.a = (String) new dtuj() { // from class: bqip
                @Override // defpackage.dtuj
                public final Object a() {
                    return String.valueOf(l);
                }
            }.a();
            super.fY(0);
        }
    }

    public final String toString() {
        return ((dtro.a) ekhw.a(dtub.b, dtro.a.class)).iB().a() ? String.format(Locale.US, "%s", "CmsDeadLetterQueueTable -- REDACTED") : a();
    }
}
