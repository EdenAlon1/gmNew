package defpackage;

import android.content.ContentValues;
import android.database.DatabaseUtils;
import defpackage.dtro;
import j$.util.Objects;
import j$.util.Optional;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class cfdx extends dtro implements dtrq {
    public String a;
    public Optional b = bdhj.a;
    public Date c = bdgs.a;
    public Date d = bdgs.a;
    public int e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;

    protected cfdx() {
    }

    @Override // defpackage.dtro
    public final String a() {
        return String.format(Locale.US, "WorkQueueWorkManagerTable [queue: %s,\n  workmanager_id: %s,\n  scheduled_at_time: %s,\n  minimum_start_time: %s,\n  requires_network_type: %s,\n  requires_charging: %s,\n  requires_device_idle: %s,\n  requires_battery_not_low: %s,\n  requires_storage_not_low: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c), String.valueOf(this.d), String.valueOf(this.e), String.valueOf(this.f), String.valueOf(this.g), String.valueOf(this.h), String.valueOf(this.i));
    }

    @Override // defpackage.dtro
    public final void b(ContentValues contentValues) {
        dtub.u(contentValues, "queue", this.a);
        Optional optional = this.b;
        if (optional == null) {
            contentValues.putNull("workmanager_id");
        } else {
            contentValues.put("workmanager_id", bdhj.b(optional));
        }
        Date date = this.c;
        if (date == null) {
            contentValues.putNull("scheduled_at_time");
        } else {
            contentValues.put("scheduled_at_time", Long.valueOf(bdgs.a(date)));
        }
        Date date2 = this.d;
        if (date2 == null) {
            contentValues.putNull("minimum_start_time");
        } else {
            contentValues.put("minimum_start_time", Long.valueOf(bdgs.a(date2)));
        }
        contentValues.put("requires_network_type", Integer.valueOf(this.e));
        contentValues.put("requires_charging", Boolean.valueOf(this.f));
        contentValues.put("requires_device_idle", Boolean.valueOf(this.g));
        contentValues.put("requires_battery_not_low", Boolean.valueOf(this.h));
        contentValues.put("requires_storage_not_low", Boolean.valueOf(this.i));
    }

    @Override // defpackage.dtro
    protected final /* bridge */ /* synthetic */ void c(dtsu dtsuVar) {
        cffh cffhVar = (cffh) ((cfex) dtsuVar);
        aB();
        this.cL = cffhVar.cU();
        if (cffhVar.di(0)) {
            this.a = cffhVar.f();
            fY(0);
        }
        if (cffhVar.di(1)) {
            this.b = cffhVar.e();
            fY(1);
        }
        if (cffhVar.di(2)) {
            this.c = cffhVar.h();
            fY(2);
        }
        if (cffhVar.di(3)) {
            this.d = cffhVar.g();
            fY(3);
        }
        if (cffhVar.di(4)) {
            this.e = cffhVar.c();
            fY(4);
        }
        if (cffhVar.di(5)) {
            this.f = cffhVar.j();
            fY(5);
        }
        if (cffhVar.di(6)) {
            this.g = cffhVar.k();
            fY(6);
        }
        if (cffhVar.di(7)) {
            this.h = cffhVar.i();
            fY(7);
        }
        if (cffhVar.di(8)) {
            this.i = cffhVar.l();
            fY(8);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof cfdx)) {
            return false;
        }
        cfdx cfdxVar = (cfdx) obj;
        return super.aD(cfdxVar.cL) && Objects.equals(this.a, cfdxVar.a) && Objects.equals(this.b, cfdxVar.b) && Objects.equals(this.c, cfdxVar.c) && Objects.equals(this.d, cfdxVar.d) && this.e == cfdxVar.e && this.f == cfdxVar.f && this.g == cfdxVar.g && this.h == cfdxVar.h && this.i == cfdxVar.i;
    }

    @Override // defpackage.dtrq
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "work_queue_work_manager_ids", dtub.m(new String[]{"queue", "workmanager_id", "scheduled_at_time", "minimum_start_time", "requires_network_type", "requires_charging", "requires_device_idle", "requires_battery_not_low", "requires_storage_not_low"}));
    }

    @Override // defpackage.dtrq
    public final String g() {
        return null;
    }

    @Override // defpackage.dtrq
    public final String h() {
        return "work_queue_work_manager_ids";
    }

    public final int hashCode() {
        dtsq dtsqVar = this.cL;
        return Objects.hash((dtsqVar == null || dtsqVar.b()) ? null : this.cL, this.a, this.b, this.c, this.d, Integer.valueOf(this.e), Boolean.valueOf(this.f), Boolean.valueOf(this.g), Boolean.valueOf(this.h), Boolean.valueOf(this.i), null);
    }

    @Override // defpackage.dtrq
    public final void i(StringBuilder sb, List list) {
        Object[] objArr = {this.a, bdhj.b(this.b), Long.valueOf(bdgs.a(this.c)), Long.valueOf(bdgs.a(this.d)), Integer.valueOf(this.e), Integer.valueOf(this.f ? 1 : 0), Integer.valueOf(this.g ? 1 : 0), Integer.valueOf(this.h ? 1 : 0), Integer.valueOf(this.i ? 1 : 0)};
        sb.append('(');
        for (int i = 0; i < 9; i++) {
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

    public final Optional k() {
        az(1, "workmanager_id");
        return this.b;
    }

    public final String l() {
        az(0, "queue");
        return this.a;
    }

    public final String toString() {
        return ((dtro.a) ekhw.a(dtub.b, dtro.a.class)).iB().a() ? String.format(Locale.US, "%s", "WorkQueueWorkManagerTable -- REDACTED") : a();
    }
}
