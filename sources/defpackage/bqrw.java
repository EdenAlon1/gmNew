package defpackage;

import android.content.ContentValues;
import android.database.DatabaseUtils;
import defpackage.dtro;
import j$.util.Objects;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class bqrw extends dtro implements dtrq {
    public long a;
    public long b;
    public String c;
    public String d;
    public eshn e = eshn.CMS_DATA_PROVIDER_UNSPECIFIED;
    public byte[] f;
    public long g;

    protected bqrw() {
    }

    @Override // defpackage.dtro
    public final String a() {
        Locale locale = Locale.US;
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        String valueOf4 = String.valueOf(this.d);
        String valueOf5 = String.valueOf(this.e);
        byte[] bArr = this.f;
        return String.format(locale, "CmsRestoreDependencyCacheTable [_id: %s,\n  dependent_id: %s,\n  dependent_cms_id: %s,\n  dependency_cms_id: %s,\n  cms_data_provider_type: %s,\n  payload: %s,\n  inserted_at_timestamp: %s\n]\n", valueOf, valueOf2, valueOf3, valueOf4, valueOf5, "BLOB".concat(String.valueOf(bArr != null ? String.valueOf(bArr.length) : "NULL")), String.valueOf(this.g));
    }

    @Override // defpackage.dtro
    public final void b(ContentValues contentValues) {
        int intValue = bqth.c().intValue();
        contentValues.put("dependent_id", Long.valueOf(this.b));
        dtub.u(contentValues, "dependent_cms_id", this.c);
        dtub.u(contentValues, "dependency_cms_id", this.d);
        if (intValue >= 59660) {
            eshn eshnVar = this.e;
            if (eshnVar == null) {
                contentValues.putNull("cms_data_provider_type");
            } else {
                contentValues.put("cms_data_provider_type", Integer.valueOf(eshnVar.a()));
            }
        }
        contentValues.put("payload", this.f);
        contentValues.put("inserted_at_timestamp", Long.valueOf(this.g));
    }

    @Override // defpackage.dtro
    protected final /* bridge */ /* synthetic */ void c(dtsu dtsuVar) {
        bqsy bqsyVar = (bqsy) ((bqsq) dtsuVar);
        aB();
        this.cL = bqsyVar.cU();
        if (bqsyVar.di(0)) {
            this.a = bqsyVar.e();
            fY(0);
        }
        if (bqsyVar.di(1)) {
            this.b = bqsyVar.c();
            fY(1);
        }
        if (bqsyVar.di(2)) {
            this.c = bqsyVar.i();
            fY(2);
        }
        if (bqsyVar.di(3)) {
            this.d = bqsyVar.h();
            fY(3);
        }
        if (bqsyVar.di(4)) {
            this.e = bqsyVar.g();
            fY(4);
        }
        if (bqsyVar.di(5)) {
            this.f = bqsyVar.j();
            fY(5);
        }
        if (bqsyVar.di(6)) {
            this.g = bqsyVar.f();
            fY(6);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bqrw)) {
            return false;
        }
        bqrw bqrwVar = (bqrw) obj;
        return super.aD(bqrwVar.cL) && this.a == bqrwVar.a && this.b == bqrwVar.b && Objects.equals(this.c, bqrwVar.c) && Objects.equals(this.d, bqrwVar.d) && this.e == bqrwVar.e && Arrays.equals(this.f, bqrwVar.f) && this.g == bqrwVar.g;
    }

    @Override // defpackage.dtrq
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "cms_restore_dependency_cache_table", dtub.m(new String[]{"dependent_id", "dependent_cms_id", "dependency_cms_id", "cms_data_provider_type", "payload", "inserted_at_timestamp"}));
    }

    @Override // defpackage.dtrq
    public final String g() {
        return "_id";
    }

    @Override // defpackage.dtrq
    public final String h() {
        return "cms_restore_dependency_cache_table";
    }

    public final int hashCode() {
        dtsq dtsqVar = this.cL;
        return Objects.hash((dtsqVar == null || dtsqVar.b()) ? null : this.cL, Long.valueOf(this.a), Long.valueOf(this.b), this.c, this.d, this.e, Integer.valueOf(Arrays.hashCode(this.f)), Long.valueOf(this.g), null);
    }

    @Override // defpackage.dtrq
    public final void i(StringBuilder sb, List list) {
        Long valueOf = Long.valueOf(this.b);
        String str = this.c;
        String str2 = this.d;
        eshn eshnVar = this.e;
        Object[] objArr = {valueOf, str, str2, eshnVar == null ? 0 : String.valueOf(eshnVar.a()), this.f, Long.valueOf(this.g)};
        sb.append('(');
        for (int i = 0; i < 6; i++) {
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

    public final long k() {
        az(1, "dependent_id");
        return this.b;
    }

    public final eshn l() {
        az(4, "cms_data_provider_type");
        return this.e;
    }

    public final String m() {
        az(2, "dependent_cms_id");
        return this.c;
    }

    public final byte[] n() {
        az(5, "payload");
        return this.f;
    }

    public final String toString() {
        return ((dtro.a) ekhw.a(dtub.b, dtro.a.class)).iB().a() ? String.format(Locale.US, "%s", "CmsRestoreDependencyCacheTable -- REDACTED") : a();
    }
}
