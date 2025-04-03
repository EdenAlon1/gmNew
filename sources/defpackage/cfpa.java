package defpackage;

import android.content.ContentValues;
import android.database.DatabaseUtils;
import defpackage.dtro;
import j$.time.Instant;
import j$.util.Objects;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class cfpa extends dtro implements dtrq {
    public byte[] a;
    public byte[] b;
    public Instant c = Instant.EPOCH;

    protected cfpa() {
    }

    @Override // defpackage.dtro
    public final String a() {
        Locale locale = Locale.US;
        byte[] bArr = this.a;
        String concat = "BLOB".concat(String.valueOf(bArr != null ? String.valueOf(bArr.length) : "NULL"));
        byte[] bArr2 = this.b;
        return String.format(locale, "MlsKeyPackagesTable [_id: %s,\n  key_package: %s,\n  expiration_timestamp: %s\n]\n", concat, "BLOB".concat(String.valueOf(bArr2 != null ? String.valueOf(bArr2.length) : "NULL")), String.valueOf(this.c));
    }

    @Override // defpackage.dtro
    public final void b(ContentValues contentValues) {
        contentValues.put("_id", this.a);
        contentValues.put("key_package", this.b);
        Instant instant = this.c;
        if (instant == null) {
            contentValues.putNull("expiration_timestamp");
        } else {
            contentValues.put("expiration_timestamp", Long.valueOf(bdgw.a(instant)));
        }
    }

    @Override // defpackage.dtro
    protected final /* bridge */ /* synthetic */ void c(dtsu dtsuVar) {
        cfpq cfpqVar = (cfpq) ((cfpm) dtsuVar);
        aB();
        this.cL = cfpqVar.cU();
        if (cfpqVar.di(0)) {
            this.a = cfpqVar.e();
            fY(0);
        }
        if (cfpqVar.di(1)) {
            this.b = cfpqVar.f();
            fY(1);
        }
        if (cfpqVar.di(2)) {
            this.c = cfpqVar.c();
            fY(2);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof cfpa)) {
            return false;
        }
        cfpa cfpaVar = (cfpa) obj;
        return super.aD(cfpaVar.cL) && Arrays.equals(this.a, cfpaVar.a) && Arrays.equals(this.b, cfpaVar.b) && Objects.equals(this.c, cfpaVar.c);
    }

    @Override // defpackage.dtrq
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "mls_key_packages", dtub.m(new String[]{"_id", "key_package", "expiration_timestamp"}));
    }

    @Override // defpackage.dtrq
    public final String g() {
        return null;
    }

    @Override // defpackage.dtrq
    public final String h() {
        return "mls_key_packages";
    }

    public final int hashCode() {
        dtsq dtsqVar = this.cL;
        return Objects.hash((dtsqVar == null || dtsqVar.b()) ? null : this.cL, Integer.valueOf(Arrays.hashCode(this.a)), Integer.valueOf(Arrays.hashCode(this.b)), this.c, null);
    }

    @Override // defpackage.dtrq
    public final void i(StringBuilder sb, List list) {
        Object[] objArr = {this.a, this.b, Long.valueOf(bdgw.a(this.c))};
        sb.append('(');
        for (int i = 0; i < 3; i++) {
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
        return ((dtro.a) ekhw.a(dtub.b, dtro.a.class)).iB().a() ? String.format(Locale.US, "%s", "MlsKeyPackagesTable -- REDACTED") : a();
    }
}
