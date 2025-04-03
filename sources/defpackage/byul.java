package defpackage;

import android.content.ContentValues;
import android.database.DatabaseUtils;
import android.net.Uri;
import defpackage.dtro;
import j$.util.Objects;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class byul extends dtro implements dtrq {
    public long a;
    public String b;
    public String c;
    public String d;
    public String e;
    public Uri f;
    public String g;

    protected byul() {
    }

    @Override // defpackage.dtro
    public final String a() {
        return String.format(Locale.US, "VerifiedSmsBrandsTable [_id: %s,\n  brand_id: %s,\n  name: %s,\n  description: %s,\n  logo_url: %s,\n  logo_uri: %s,\n  version_token: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c), String.valueOf(this.d), String.valueOf(this.e), String.valueOf(this.f), String.valueOf(this.g));
    }

    @Override // defpackage.dtro
    public final void b(ContentValues contentValues) {
        dtub.u(contentValues, "brand_id", this.b);
        dtub.u(contentValues, "name", this.c);
        dtub.u(contentValues, "description", this.d);
        dtub.u(contentValues, "logo_url", this.e);
        Uri uri = this.f;
        if (uri == null) {
            contentValues.putNull("logo_uri");
        } else {
            contentValues.put("logo_uri", uri.toString());
        }
        dtub.u(contentValues, "version_token", this.g);
    }

    @Override // defpackage.dtro
    protected final /* bridge */ /* synthetic */ void c(dtsu dtsuVar) {
        byvn byvnVar = (byvn) ((byvf) dtsuVar);
        aB();
        this.cL = byvnVar.cU();
        if (byvnVar.di(0)) {
            this.a = byvnVar.c();
            fY(0);
        }
        if (byvnVar.di(1)) {
            this.b = byvnVar.f();
            fY(1);
        }
        if (byvnVar.di(2)) {
            this.c = byvnVar.i();
            fY(2);
        }
        if (byvnVar.di(3)) {
            this.d = byvnVar.g();
            fY(3);
        }
        if (byvnVar.di(4)) {
            this.e = byvnVar.h();
            fY(4);
        }
        if (byvnVar.di(5)) {
            this.f = byvnVar.e();
            fY(5);
        }
        if (byvnVar.di(6)) {
            this.g = byvnVar.j();
            fY(6);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof byul)) {
            return false;
        }
        byul byulVar = (byul) obj;
        return super.aD(byulVar.cL) && this.a == byulVar.a && Objects.equals(this.b, byulVar.b) && Objects.equals(this.c, byulVar.c) && Objects.equals(this.d, byulVar.d) && Objects.equals(this.e, byulVar.e) && Objects.equals(this.f, byulVar.f) && Objects.equals(this.g, byulVar.g);
    }

    @Override // defpackage.dtrq
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "verified_sms_brands", dtub.m(new String[]{"brand_id", "name", "description", "logo_url", "logo_uri", "version_token"}));
    }

    @Override // defpackage.dtrq
    public final String g() {
        return "_id";
    }

    @Override // defpackage.dtrq
    public final String h() {
        return "verified_sms_brands";
    }

    public final int hashCode() {
        dtsq dtsqVar = this.cL;
        return Objects.hash((dtsqVar == null || dtsqVar.b()) ? null : this.cL, Long.valueOf(this.a), this.b, this.c, this.d, this.e, this.f, this.g, null);
    }

    @Override // defpackage.dtrq
    public final void i(StringBuilder sb, List list) {
        String str = this.b;
        String str2 = this.c;
        String str3 = this.d;
        String str4 = this.e;
        Uri uri = this.f;
        Object[] objArr = {str, str2, str3, str4, uri == null ? null : uri.toString(), this.g};
        sb.append('(');
        for (int i = 0; i < 6; i++) {
            Object obj = objArr[i];
            if (obj instanceof Number) {
                sb.append(String.valueOf(obj));
            } else {
                if (obj instanceof String) {
                    String str5 = (String) obj;
                    if (str5.length() < 12) {
                        sb.append(DatabaseUtils.sqlEscapeString(str5));
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

    public final Uri k() {
        az(5, "logo_uri");
        return this.f;
    }

    public final String l() {
        az(1, "brand_id");
        return this.b;
    }

    public final String m() {
        az(3, "description");
        return this.d;
    }

    public final String n() {
        az(2, "name");
        return this.c;
    }

    public final String toString() {
        return ((dtro.a) ekhw.a(dtub.b, dtro.a.class)).iB().a() ? String.format(Locale.US, "%s", "VerifiedSmsBrandsTable -- REDACTED") : a();
    }
}
