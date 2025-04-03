package defpackage;

import android.content.ContentValues;
import android.database.DatabaseUtils;
import defpackage.dtro;
import j$.util.Objects;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class bcfe extends dtro implements dtrq {
    public azsu a = null;
    public azon b;
    public String c;
    public String d;

    protected bcfe() {
    }

    @Override // defpackage.dtro
    public final String a() {
        return String.format(Locale.US, "BackupMyIdentitiesTable [token: %s,\n  address_type: %s,\n  phone_number: %s,\n  display_name: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c), String.valueOf(this.d));
    }

    @Override // defpackage.dtro
    public final void b(ContentValues contentValues) {
        azsu azsuVar = this.a;
        if (azsuVar == null) {
            contentValues.putNull("token");
        } else {
            contentValues.put("token", azsv.b(azsuVar));
        }
        azon azonVar = this.b;
        if (azonVar == null) {
            contentValues.putNull("address_type");
        } else {
            contentValues.put("address_type", Integer.valueOf(azonVar.ordinal()));
        }
        dtub.u(contentValues, "phone_number", this.c);
        dtub.u(contentValues, "display_name", this.d);
    }

    @Override // defpackage.dtro
    protected final /* bridge */ /* synthetic */ void c(dtsu dtsuVar) {
        bcfx bcfxVar = (bcfx) ((bcfs) dtsuVar);
        aB();
        this.cL = bcfxVar.cU();
        if (bcfxVar.di(0)) {
            this.a = bcfxVar.e();
            fY(0);
        }
        if (bcfxVar.di(1)) {
            this.b = bcfxVar.c();
            fY(1);
        }
        if (bcfxVar.di(2)) {
            this.c = bcfxVar.f();
            fY(2);
        }
        if (bcfxVar.di(3)) {
            this.d = bcfxVar.g();
            fY(3);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bcfe)) {
            return false;
        }
        bcfe bcfeVar = (bcfe) obj;
        return super.aD(bcfeVar.cL) && Objects.equals(this.a, bcfeVar.a) && this.b == bcfeVar.b && Objects.equals(this.c, bcfeVar.c) && Objects.equals(this.d, bcfeVar.d);
    }

    @Override // defpackage.dtrq
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "my_identities_backup", dtub.m(new String[]{"token", "address_type", "phone_number", "display_name"}));
    }

    @Override // defpackage.dtrq
    public final String g() {
        return null;
    }

    @Override // defpackage.dtrq
    public final String h() {
        return "my_identities_backup";
    }

    public final int hashCode() {
        dtsq dtsqVar = this.cL;
        dtsq dtsqVar2 = (dtsqVar == null || dtsqVar.b()) ? null : this.cL;
        azsu azsuVar = this.a;
        azon azonVar = this.b;
        return Objects.hash(dtsqVar2, azsuVar, Integer.valueOf(azonVar == null ? 0 : azonVar.ordinal()), this.c, this.d, null);
    }

    @Override // defpackage.dtrq
    public final void i(StringBuilder sb, List list) {
        String b = azsv.b(this.a);
        azon azonVar = this.b;
        Object[] objArr = {b, azonVar == null ? 0 : String.valueOf(azonVar.ordinal()), this.c, this.d};
        sb.append('(');
        for (int i = 0; i < 4; i++) {
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
        return ((dtro.a) ekhw.a(dtub.b, dtro.a.class)).iB().a() ? String.format(Locale.US, "%s", "BackupMyIdentitiesTable -- REDACTED") : a();
    }
}
