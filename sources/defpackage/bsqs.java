package defpackage;

import android.content.ContentValues;
import android.database.DatabaseUtils;
import defpackage.dtro;
import j$.util.Objects;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class bsqs extends dtro implements dtrq {
    public long a;
    public String b;
    public long c = 0;

    protected bsqs() {
    }

    @Override // defpackage.dtro
    public final String a() {
        return String.format(Locale.US, "DataUsageTable [_id: %s,\n  phone_number: %s,\n  data_size: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c));
    }

    @Override // defpackage.dtro
    public final void b(ContentValues contentValues) {
        dtub.u(contentValues, "phone_number", this.b);
        contentValues.put("data_size", Long.valueOf(this.c));
    }

    @Override // defpackage.dtro
    protected final /* bridge */ /* synthetic */ void c(dtsu dtsuVar) {
        bsri bsriVar = (bsri) ((bsre) dtsuVar);
        aB();
        this.cL = bsriVar.cU();
        if (bsriVar.di(0)) {
            this.a = bsriVar.e();
            fY(0);
        }
        if (bsriVar.di(1)) {
            this.b = bsriVar.f();
            fY(1);
        }
        if (bsriVar.di(2)) {
            this.c = bsriVar.c();
            fY(2);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bsqs)) {
            return false;
        }
        bsqs bsqsVar = (bsqs) obj;
        return super.aD(bsqsVar.cL) && this.a == bsqsVar.a && Objects.equals(this.b, bsqsVar.b) && this.c == bsqsVar.c;
    }

    @Override // defpackage.dtrq
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "data_usage", dtub.m(new String[]{"phone_number", "data_size"}));
    }

    @Override // defpackage.dtrq
    public final String g() {
        return "_id";
    }

    @Override // defpackage.dtrq
    public final String h() {
        return "data_usage";
    }

    public final int hashCode() {
        dtsq dtsqVar = this.cL;
        return Objects.hash((dtsqVar == null || dtsqVar.b()) ? null : this.cL, Long.valueOf(this.a), this.b, Long.valueOf(this.c), null);
    }

    @Override // defpackage.dtrq
    public final void i(StringBuilder sb, List list) {
        Object[] objArr = {this.b, Long.valueOf(this.c)};
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

    public final String toString() {
        return ((dtro.a) ekhw.a(dtub.b, dtro.a.class)).iB().a() ? String.format(Locale.US, "%s", "DataUsageTable -- REDACTED") : a();
    }
}
