package defpackage;

import android.content.ContentValues;
import android.database.DatabaseUtils;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoDatabaseConstants;
import defpackage.dtro;
import j$.util.Objects;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class bwox extends dtro implements dtrq {
    public String a;
    public String b;
    public axuf c;
    public String d;
    public String e;
    public String f;

    protected bwox() {
    }

    @Override // defpackage.dtro
    public final String a() {
        return String.format(Locale.US, "RbmBusinessInfoPropertiesTable [_id: %s,\n  rbm_bot_id: %s,\n  type: %s,\n  header: %s,\n  subheader: %s,\n  property_value: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c), String.valueOf(this.d), String.valueOf(this.e), String.valueOf(this.f));
    }

    @Override // defpackage.dtro
    public final void b(ContentValues contentValues) {
        if (bwqg.c().intValue() >= 51020) {
            dtub.u(contentValues, "rbm_bot_id", this.b);
        }
        axuf axufVar = this.c;
        if (axufVar == null) {
            contentValues.putNull(BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.TYPE);
        } else {
            contentValues.put(BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.TYPE, Integer.valueOf(axufVar.ordinal()));
        }
        dtub.u(contentValues, BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.HEADER, this.d);
        dtub.u(contentValues, BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.SUBHEADER, this.e);
        dtub.u(contentValues, "property_value", this.f);
    }

    @Override // defpackage.dtro
    protected final /* bridge */ /* synthetic */ void c(dtsu dtsuVar) {
        bwpx bwpxVar = (bwpx) ((bwpq) dtsuVar);
        aB();
        this.cL = bwpxVar.cU();
        if (bwpxVar.di(0)) {
            this.a = bwpxVar.f();
            fY(0);
        }
        if (bwpxVar.di(1)) {
            this.b = bwpxVar.h();
            fY(1);
        }
        if (bwpxVar.di(2)) {
            this.c = bwpxVar.c();
            fY(2);
        }
        if (bwpxVar.di(3)) {
            this.d = bwpxVar.e();
            fY(3);
        }
        if (bwpxVar.di(4)) {
            this.e = bwpxVar.i();
            fY(4);
        }
        if (bwpxVar.di(5)) {
            this.f = bwpxVar.g();
            fY(5);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bwox)) {
            return false;
        }
        bwox bwoxVar = (bwox) obj;
        return super.aD(bwoxVar.cL) && Objects.equals(this.a, bwoxVar.a) && Objects.equals(this.b, bwoxVar.b) && this.c == bwoxVar.c && Objects.equals(this.d, bwoxVar.d) && Objects.equals(this.e, bwoxVar.e) && Objects.equals(this.f, bwoxVar.f);
    }

    @Override // defpackage.dtrq
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "rbm_business_info_properties", dtub.m(new String[]{"rbm_bot_id", BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.TYPE, BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.HEADER, BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.SUBHEADER, "property_value"}));
    }

    @Override // defpackage.dtrq
    public final String g() {
        return "_id";
    }

    @Override // defpackage.dtrq
    public final String h() {
        return "rbm_business_info_properties";
    }

    public final int hashCode() {
        dtsq dtsqVar = this.cL;
        dtsq dtsqVar2 = (dtsqVar == null || dtsqVar.b()) ? null : this.cL;
        String str = this.a;
        String str2 = this.b;
        axuf axufVar = this.c;
        return Objects.hash(dtsqVar2, str, str2, Integer.valueOf(axufVar == null ? 0 : axufVar.ordinal()), this.d, this.e, this.f, null);
    }

    @Override // defpackage.dtrq
    public final void i(StringBuilder sb, List list) {
        String str = this.b;
        axuf axufVar = this.c;
        Object[] objArr = {str, axufVar == null ? 0 : String.valueOf(axufVar.ordinal()), this.d, this.e, this.f};
        sb.append('(');
        for (int i = 0; i < 5; i++) {
            Object obj = objArr[i];
            if (obj instanceof Number) {
                sb.append(String.valueOf(obj));
            } else {
                if (obj instanceof String) {
                    String str2 = (String) obj;
                    if (str2.length() < 12) {
                        sb.append(DatabaseUtils.sqlEscapeString(str2));
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

    public final axuf k() {
        az(2, BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.TYPE);
        return this.c;
    }

    public final String l() {
        az(3, BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.HEADER);
        return this.d;
    }

    public final String m() {
        az(5, "property_value");
        return this.f;
    }

    public final String toString() {
        return ((dtro.a) ekhw.a(dtub.b, dtro.a.class)).iB().a() ? String.format(Locale.US, "%s", "RbmBusinessInfoPropertiesTable -- REDACTED") : a();
    }
}
