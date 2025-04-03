package defpackage;

import android.content.ContentValues;
import android.database.DatabaseUtils;
import defpackage.dtro;
import j$.util.Objects;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class btih extends dtro implements dtrq {
    public String a;
    public int c;
    public String d;
    public String j;
    public int b = 3;
    public int e = -1;
    public boolean f = false;
    public int g = 0;
    public int h = 0;
    public long i = 0;
    public long k = 0;

    protected btih() {
    }

    @Override // defpackage.dtro
    public final String a() {
        return String.format(Locale.US, "GenericWorkerQueueTable [_id: %s,\n  worker_type: %s,\n  item_table_type: %s,\n  item_id: %s,\n  account_id: %s,\n  in_flight: %s,\n  retry_count: %s,\n  flags: %s,\n  next_execute_timestamp: %s,\n  trigger_name: %s,\n  enqueued_timestamp: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c), String.valueOf(this.d), String.valueOf(this.e), String.valueOf(this.f), String.valueOf(this.g), String.valueOf(this.h), String.valueOf(this.i), String.valueOf(this.j), String.valueOf(this.k));
    }

    @Override // defpackage.dtro
    public final void b(ContentValues contentValues) {
        int intValue = btki.c().intValue();
        contentValues.put("worker_type", Integer.valueOf(this.b));
        contentValues.put("item_table_type", Integer.valueOf(this.c));
        dtub.u(contentValues, "item_id", this.d);
        if (intValue >= 39020) {
            contentValues.put("account_id", Integer.valueOf(this.e));
        }
        contentValues.put("in_flight", Boolean.valueOf(this.f));
        contentValues.put("retry_count", Integer.valueOf(this.g));
        if (intValue >= 32000) {
            contentValues.put("flags", Integer.valueOf(this.h));
        }
        if (intValue >= 34000) {
            contentValues.put("next_execute_timestamp", Long.valueOf(this.i));
        }
        if (intValue >= 59700) {
            dtub.u(contentValues, "trigger_name", this.j);
        }
        if (intValue >= 59970) {
            contentValues.put("enqueued_timestamp", Long.valueOf(this.k));
        }
    }

    @Override // defpackage.dtro
    protected final /* bridge */ /* synthetic */ void c(dtsu dtsuVar) {
        btjv btjvVar = (btjv) ((btjj) dtsuVar);
        aB();
        this.cL = btjvVar.cU();
        if (btjvVar.di(0)) {
            this.a = btjvVar.k();
            fY(0);
        }
        if (btjvVar.di(1)) {
            this.b = btjvVar.c();
            fY(1);
        }
        if (btjvVar.di(2)) {
            this.c = btjvVar.g();
            fY(2);
        }
        if (btjvVar.di(3)) {
            this.d = btjvVar.l();
            fY(3);
        }
        if (btjvVar.di(4)) {
            this.e = btjvVar.e();
            fY(4);
        }
        if (btjvVar.di(5)) {
            this.f = btjvVar.n();
            fY(5);
        }
        if (btjvVar.di(6)) {
            this.g = btjvVar.h();
            fY(6);
        }
        if (btjvVar.di(7)) {
            this.h = btjvVar.f();
            fY(7);
        }
        if (btjvVar.di(8)) {
            this.i = btjvVar.j();
            fY(8);
        }
        if (btjvVar.di(9)) {
            this.j = btjvVar.m();
            fY(9);
        }
        if (btjvVar.di(10)) {
            this.k = btjvVar.i();
            fY(10);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof btih)) {
            return false;
        }
        btih btihVar = (btih) obj;
        return super.aD(btihVar.cL) && Objects.equals(this.a, btihVar.a) && this.b == btihVar.b && this.c == btihVar.c && Objects.equals(this.d, btihVar.d) && this.e == btihVar.e && this.f == btihVar.f && this.g == btihVar.g && this.h == btihVar.h && this.i == btihVar.i && Objects.equals(this.j, btihVar.j) && this.k == btihVar.k;
    }

    @Override // defpackage.dtrq
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "generic_worker_queue", dtub.m(new String[]{"worker_type", "item_table_type", "item_id", "account_id", "in_flight", "retry_count", "flags", "next_execute_timestamp", "trigger_name", "enqueued_timestamp"}));
    }

    @Override // defpackage.dtrq
    public final String g() {
        return "_id";
    }

    @Override // defpackage.dtrq
    public final String h() {
        return "generic_worker_queue";
    }

    public final int hashCode() {
        dtsq dtsqVar = this.cL;
        return Objects.hash((dtsqVar == null || dtsqVar.b()) ? null : this.cL, this.a, Integer.valueOf(this.b), Integer.valueOf(this.c), this.d, Integer.valueOf(this.e), Boolean.valueOf(this.f), Integer.valueOf(this.g), Integer.valueOf(this.h), Long.valueOf(this.i), this.j, Long.valueOf(this.k), null);
    }

    @Override // defpackage.dtrq
    public final void i(StringBuilder sb, List list) {
        Object[] objArr = {Integer.valueOf(this.b), Integer.valueOf(this.c), this.d, Integer.valueOf(this.e), Integer.valueOf(this.f ? 1 : 0), Integer.valueOf(this.g), Integer.valueOf(this.h), Long.valueOf(this.i), this.j, Long.valueOf(this.k)};
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

    public final int k() {
        az(4, "account_id");
        return this.e;
    }

    public final int l() {
        az(7, "flags");
        return this.h;
    }

    public final int m() {
        az(2, "item_table_type");
        return this.c;
    }

    public final int n() {
        az(6, "retry_count");
        return this.g;
    }

    public final int o() {
        az(1, "worker_type");
        return this.b;
    }

    public final long q() {
        az(10, "enqueued_timestamp");
        return this.k;
    }

    public final String r() {
        az(0, "_id");
        return this.a;
    }

    public final String s() {
        az(3, "item_id");
        return this.d;
    }

    public final String t() {
        az(9, "trigger_name");
        return this.j;
    }

    public final String toString() {
        return ((dtro.a) ekhw.a(dtub.b, dtro.a.class)).iB().a() ? String.format(Locale.US, "%s", "GenericWorkerQueueTable -- REDACTED") : a();
    }
}
