package defpackage;

import android.content.ContentValues;
import android.database.DatabaseUtils;
import defpackage.dtro;
import j$.time.Instant;
import j$.util.Objects;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class avnd extends dtro implements dtrq {
    public String a;
    public Instant b = Instant.EPOCH;
    public avoi c;

    protected avnd() {
    }

    @Override // defpackage.dtro
    public final String a() {
        return String.format(Locale.US, "RcsRemoteCapabilitiesCacheTable [msisdn: %s,\n  last_refresh_timestamp: %s,\n  rcs_capabilities: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c));
    }

    @Override // defpackage.dtro
    public final void b(ContentValues contentValues) {
        dtub.u(contentValues, "msisdn", this.a);
        Instant instant = this.b;
        if (instant == null) {
            contentValues.putNull("last_refresh_timestamp");
        } else {
            contentValues.put("last_refresh_timestamp", Long.valueOf(bdgw.a(instant)));
        }
        avoi avoiVar = this.c;
        if (avoiVar == null) {
            contentValues.putNull("rcs_capabilities");
        } else {
            contentValues.put("rcs_capabilities", avoiVar.toByteArray());
        }
    }

    @Override // defpackage.dtro
    protected final /* bridge */ /* synthetic */ void c(dtsu dtsuVar) {
        avnt avntVar = (avnt) ((avnp) dtsuVar);
        aB();
        this.cL = avntVar.cU();
        if (avntVar.di(0)) {
            this.a = avntVar.f();
            fY(0);
        }
        if (avntVar.di(1)) {
            this.b = avntVar.e();
            fY(1);
        }
        if (avntVar.di(2)) {
            this.c = avntVar.c();
            fY(2);
        }
    }

    public final avoi d() {
        az(2, "rcs_capabilities");
        return this.c;
    }

    public final Instant e() {
        az(1, "last_refresh_timestamp");
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof avnd)) {
            return false;
        }
        avnd avndVar = (avnd) obj;
        return super.aD(avndVar.cL) && Objects.equals(this.a, avndVar.a) && Objects.equals(this.b, avndVar.b) && Objects.equals(this.c, avndVar.c);
    }

    @Override // defpackage.dtrq
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "rcs_remote_capabilities_cache", dtub.m(new String[]{"msisdn", "last_refresh_timestamp", "rcs_capabilities"}));
    }

    @Override // defpackage.dtrq
    public final String g() {
        return null;
    }

    @Override // defpackage.dtrq
    public final String h() {
        return "rcs_remote_capabilities_cache";
    }

    public final int hashCode() {
        dtsq dtsqVar = this.cL;
        return Objects.hash((dtsqVar == null || dtsqVar.b()) ? null : this.cL, this.a, this.b, this.c, null);
    }

    @Override // defpackage.dtrq
    public final void i(StringBuilder sb, List list) {
        String str = this.a;
        Long valueOf = Long.valueOf(bdgw.a(this.b));
        avoi avoiVar = this.c;
        Object[] objArr = {str, valueOf, avoiVar == null ? null : avoiVar.toByteArray()};
        sb.append('(');
        for (int i = 0; i < 3; i++) {
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

    public final String toString() {
        return ((dtro.a) ekhw.a(dtub.b, dtro.a.class)).iB().a() ? String.format(Locale.US, "%s", "RcsRemoteCapabilitiesCacheTable -- REDACTED") : a();
    }
}
