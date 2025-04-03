package defpackage;

import android.content.ContentValues;
import android.database.DatabaseUtils;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoDatabaseConstants;
import defpackage.dtro;
import j$.util.Objects;
import j$.util.Optional;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class ceze extends dtro implements dtrq {
    public long a;
    public String b;
    public byte[] c;
    public int d;
    public long e;
    public String f;
    public String g;
    public boolean h;
    public Optional i = bdhj.a;
    public Date j = bdgs.a;
    public String k;

    protected ceze() {
    }

    @Override // defpackage.dtro
    public final String a() {
        Locale locale = Locale.US;
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        byte[] bArr = this.c;
        return String.format(locale, "WorkQueueTable [_id: %s,\n  type: %s,\n  rawdata: %s,\n  attempts: %s,\n  timestamp: %s,\n  queue: %s,\n  deduplication_tag: %s,\n  scheduled_in_workmanager: %s,\n  workmanager_id: %s,\n  minimum_start_time: %s,\n  cancellation_tag: %s\n]\n", valueOf, valueOf2, "BLOB".concat(String.valueOf(bArr != null ? String.valueOf(bArr.length) : "NULL")), String.valueOf(this.d), String.valueOf(this.e), String.valueOf(this.f), String.valueOf(this.g), String.valueOf(this.h), String.valueOf(this.i), String.valueOf(this.j), String.valueOf(this.k));
    }

    @Override // defpackage.dtro
    public final void b(ContentValues contentValues) {
        int intValue = cfbf.c().intValue();
        dtub.u(contentValues, BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.TYPE, this.b);
        contentValues.put("rawdata", this.c);
        contentValues.put("attempts", Integer.valueOf(this.d));
        contentValues.put("timestamp", Long.valueOf(this.e));
        if (intValue >= 41030) {
            dtub.u(contentValues, "queue", this.f);
        }
        if (intValue >= 42050) {
            dtub.u(contentValues, "deduplication_tag", this.g);
        }
        if (intValue >= 45030) {
            contentValues.put("scheduled_in_workmanager", Boolean.valueOf(this.h));
        }
        if (intValue >= 46060) {
            Optional optional = this.i;
            if (optional == null) {
                contentValues.putNull("workmanager_id");
            } else {
                contentValues.put("workmanager_id", bdhj.b(optional));
            }
        }
        if (intValue >= 46070) {
            Date date = this.j;
            if (date == null) {
                contentValues.putNull("minimum_start_time");
            } else {
                contentValues.put("minimum_start_time", Long.valueOf(bdgs.a(date)));
            }
        }
        if (intValue >= 48020) {
            dtub.u(contentValues, "cancellation_tag", this.k);
        }
    }

    @Override // defpackage.dtro
    protected final /* bridge */ /* synthetic */ void c(dtsu dtsuVar) {
        cfas cfasVar = (cfas) ((cfag) dtsuVar);
        aB();
        this.cL = cfasVar.cU();
        if (cfasVar.di(0)) {
            this.a = cfasVar.i();
            super.fY(0);
        }
        if (cfasVar.di(1)) {
            this.b = cfasVar.f();
            super.fY(1);
        }
        if (cfasVar.di(2)) {
            this.c = cfasVar.n();
            super.fY(2);
        }
        if (cfasVar.di(3)) {
            this.d = cfasVar.h();
            super.fY(3);
        }
        if (cfasVar.di(4)) {
            this.e = cfasVar.c();
            super.fY(4);
        }
        if (cfasVar.di(5)) {
            this.f = cfasVar.e();
            super.fY(5);
        }
        if (cfasVar.di(6)) {
            this.g = cfasVar.l();
            super.fY(6);
        }
        if (cfasVar.di(7)) {
            this.h = cfasVar.m();
            super.fY(7);
        }
        if (cfasVar.di(8)) {
            this.i = cfasVar.j();
            super.fY(8);
        }
        if (cfasVar.di(9)) {
            this.j = cfasVar.g();
            super.fY(9);
        }
        if (cfasVar.di(10)) {
            this.k = cfasVar.k();
            super.fY(10);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ceze)) {
            return false;
        }
        ceze cezeVar = (ceze) obj;
        return super.aD(cezeVar.cL) && this.a == cezeVar.a && Objects.equals(this.b, cezeVar.b) && Arrays.equals(this.c, cezeVar.c) && this.d == cezeVar.d && this.e == cezeVar.e && Objects.equals(this.f, cezeVar.f) && Objects.equals(this.g, cezeVar.g) && this.h == cezeVar.h && Objects.equals(this.i, cezeVar.i) && Objects.equals(this.j, cezeVar.j) && Objects.equals(this.k, cezeVar.k);
    }

    @Override // defpackage.dtrq
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "work_queue", dtub.m(new String[]{BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.TYPE, "rawdata", "attempts", "timestamp", "queue", "deduplication_tag", "scheduled_in_workmanager", "workmanager_id", "minimum_start_time", "cancellation_tag"}));
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
        return "work_queue";
    }

    public final int hashCode() {
        dtsq dtsqVar = this.cL;
        return Objects.hash((dtsqVar == null || dtsqVar.b()) ? null : this.cL, Long.valueOf(this.a), this.b, Integer.valueOf(Arrays.hashCode(this.c)), Integer.valueOf(this.d), Long.valueOf(this.e), this.f, this.g, Boolean.valueOf(this.h), this.i, this.j, this.k, null);
    }

    @Override // defpackage.dtrq
    public final void i(StringBuilder sb, List list) {
        Object[] objArr = {this.b, this.c, Integer.valueOf(this.d), Long.valueOf(this.e), this.f, this.g, Integer.valueOf(this.h ? 1 : 0), bdhj.b(this.i), Long.valueOf(bdgs.a(this.j)), this.k};
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
        az(3, "attempts");
        return this.d;
    }

    public final long l() {
        az(0, "_id");
        return this.a;
    }

    public final long m() {
        az(4, "timestamp");
        return this.e;
    }

    public final String n() {
        az(10, "cancellation_tag");
        return this.k;
    }

    public final String o() {
        az(6, "deduplication_tag");
        return this.g;
    }

    public final String q() {
        az(5, "queue");
        return this.f;
    }

    public final String r() {
        az(1, BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.TYPE);
        return this.b;
    }

    public final Date s() {
        az(9, "minimum_start_time");
        return this.j;
    }

    public final byte[] t() {
        az(2, "rawdata");
        return this.c;
    }

    public final String toString() {
        return ((dtro.a) ekhw.a(dtub.b, dtro.a.class)).iB().a() ? String.format(Locale.US, "%s", "WorkQueueTable -- REDACTED") : a();
    }
}
