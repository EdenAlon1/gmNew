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
public class bxtp extends dtro implements dtrq {
    public long a;
    public String c;
    public Uri d;
    public azsu b = null;
    public boolean e = true;
    public boolean f = false;
    public long g = 0;

    protected bxtp() {
    }

    @Override // defpackage.dtro
    public final String a() {
        return String.format(Locale.US, "SelfProfilesTable [_id: %s,\n  my_identity_token: %s,\n  limited_profile_display_name: %s,\n  photo_uri: %s,\n  is_self_profile_shareable: %s,\n  belongs_to_self_gaia: %s,\n  update_timestamp: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c), String.valueOf(this.d), String.valueOf(this.e), String.valueOf(this.f), String.valueOf(this.g));
    }

    @Override // defpackage.dtro
    public final void b(ContentValues contentValues) {
        int intValue = bxve.c().intValue();
        azsu azsuVar = this.b;
        if (azsuVar == null || azsuVar.equals(null)) {
            contentValues.putNull("my_identity_token");
        } else {
            contentValues.put("my_identity_token", azsv.b(this.b));
        }
        dtub.u(contentValues, "limited_profile_display_name", this.c);
        Uri uri = this.d;
        if (uri == null) {
            contentValues.putNull("photo_uri");
        } else {
            contentValues.put("photo_uri", uri.toString());
        }
        if (intValue >= 60400) {
            contentValues.put("is_self_profile_shareable", Boolean.valueOf(this.e));
        }
        contentValues.put("belongs_to_self_gaia", Boolean.valueOf(this.f));
        contentValues.put("update_timestamp", Long.valueOf(this.g));
    }

    @Override // defpackage.dtro
    protected final /* bridge */ /* synthetic */ void c(dtsu dtsuVar) {
        bxus bxusVar = (bxus) ((bxuk) dtsuVar);
        aB();
        this.cL = bxusVar.cU();
        if (bxusVar.di(0)) {
            this.a = bxusVar.c();
            fY(0);
        }
        if (bxusVar.di(1)) {
            this.b = bxusVar.g();
            fY(1);
        }
        if (bxusVar.di(2)) {
            this.c = bxusVar.h();
            fY(2);
        }
        if (bxusVar.di(3)) {
            this.d = bxusVar.f();
            fY(3);
        }
        if (bxusVar.di(4)) {
            this.e = bxusVar.j();
            fY(4);
        }
        if (bxusVar.di(5)) {
            this.f = bxusVar.i();
            fY(5);
        }
        if (bxusVar.di(6)) {
            this.g = bxusVar.e();
            fY(6);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bxtp)) {
            return false;
        }
        bxtp bxtpVar = (bxtp) obj;
        return super.aD(bxtpVar.cL) && this.a == bxtpVar.a && Objects.equals(this.b, bxtpVar.b) && Objects.equals(this.c, bxtpVar.c) && Objects.equals(this.d, bxtpVar.d) && this.e == bxtpVar.e && this.f == bxtpVar.f && this.g == bxtpVar.g;
    }

    @Override // defpackage.dtrq
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "self_profiles", dtub.m(new String[]{"my_identity_token", "limited_profile_display_name", "photo_uri", "is_self_profile_shareable", "belongs_to_self_gaia", "update_timestamp"}));
    }

    @Override // defpackage.dtrq
    public final String g() {
        return "_id";
    }

    @Override // defpackage.dtrq
    public final String h() {
        return "self_profiles";
    }

    public final int hashCode() {
        dtsq dtsqVar = this.cL;
        return Objects.hash((dtsqVar == null || dtsqVar.b()) ? null : this.cL, Long.valueOf(this.a), this.b, this.c, this.d, Boolean.valueOf(this.e), Boolean.valueOf(this.f), Long.valueOf(this.g), null);
    }

    @Override // defpackage.dtrq
    public final void i(StringBuilder sb, List list) {
        Object obj = new bxto(this).get();
        String str = this.c;
        Uri uri = this.d;
        Object[] objArr = {obj, str, uri == null ? null : uri.toString(), Integer.valueOf(this.e ? 1 : 0), Integer.valueOf(this.f ? 1 : 0), Long.valueOf(this.g)};
        sb.append('(');
        for (int i = 0; i < 6; i++) {
            Object obj2 = objArr[i];
            if (obj2 instanceof Number) {
                sb.append(String.valueOf(obj2));
            } else {
                if (obj2 instanceof String) {
                    String str2 = (String) obj2;
                    if (str2.length() < 12) {
                        sb.append(DatabaseUtils.sqlEscapeString(str2));
                    }
                }
                list.add(obj2);
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

    public final long l() {
        az(6, "update_timestamp");
        return this.g;
    }

    public final Uri m() {
        az(3, "photo_uri");
        return this.d;
    }

    public final azsu n() {
        az(1, "my_identity_token");
        return this.b;
    }

    public final String o() {
        az(2, "limited_profile_display_name");
        return this.c;
    }

    public final boolean q() {
        az(5, "belongs_to_self_gaia");
        return this.f;
    }

    public final boolean r() {
        az(4, "is_self_profile_shareable");
        return this.e;
    }

    public final String toString() {
        return ((dtro.a) ekhw.a(dtub.b, dtro.a.class)).iB().a() ? String.format(Locale.US, "%s", "SelfProfilesTable -- REDACTED") : a();
    }
}
