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
/* loaded from: classes6.dex */
public class azhv extends dtro implements dtrq {
    public azhr b;
    public String c;
    public String d;
    public String e;
    public byte[] g;
    public azcr a = null;
    public azfm f = azfm.a;
    public cknh h = new cknh(0);
    public Instant i = bdgw.b(0);

    protected azhv() {
    }

    @Override // defpackage.dtro
    public final String a() {
        Locale locale = Locale.US;
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        String valueOf4 = String.valueOf(this.d);
        String valueOf5 = String.valueOf(this.e);
        String valueOf6 = String.valueOf(this.f);
        byte[] bArr = this.g;
        return String.format(locale, "GroupsTable [token: %s,\n  group_type: %s,\n  rcs_conference_uri: %s,\n  name: %s,\n  rcs_icon_url: %s,\n  rcs_group_state: %s,\n  tachygram_group_routing_token: %s,\n  rcs_group_capabilities: %s,\n  rcs_group_last_sync_timestamp: %s\n]\n", valueOf, valueOf2, valueOf3, valueOf4, valueOf5, valueOf6, "BLOB".concat(String.valueOf(bArr != null ? String.valueOf(bArr.length) : "NULL")), String.valueOf(this.h), String.valueOf(this.i));
    }

    @Override // defpackage.dtro
    public final void b(ContentValues contentValues) {
        azcr azcrVar = this.a;
        if (azcrVar == null || azcrVar.equals(null)) {
            contentValues.putNull("token");
        } else {
            contentValues.put("token", azcs.b(this.a));
        }
        azhr azhrVar = this.b;
        if (azhrVar == null) {
            contentValues.putNull("group_type");
        } else {
            contentValues.put("group_type", Integer.valueOf(azhrVar.ordinal()));
        }
        dtub.u(contentValues, "rcs_conference_uri", this.c);
        dtub.u(contentValues, "name", this.d);
        dtub.u(contentValues, "rcs_icon_url", this.e);
        azfm azfmVar = this.f;
        if (azfmVar == null) {
            contentValues.putNull("rcs_group_state");
        } else {
            contentValues.put("rcs_group_state", Integer.valueOf(azfmVar.ordinal()));
        }
        contentValues.put("tachygram_group_routing_token", this.g);
        cknh cknhVar = this.h;
        if (cknhVar == null) {
            contentValues.putNull("rcs_group_capabilities");
        } else {
            contentValues.put("rcs_group_capabilities", Long.valueOf(cknhVar.a));
        }
        Instant instant = this.i;
        if (instant == null) {
            contentValues.putNull("rcs_group_last_sync_timestamp");
        } else {
            contentValues.put("rcs_group_last_sync_timestamp", Long.valueOf(bdgw.a(instant)));
        }
    }

    @Override // defpackage.dtro
    protected final /* bridge */ /* synthetic */ void c(dtsu dtsuVar) {
        azje azjeVar = (azje) ((aziu) dtsuVar);
        aB();
        this.cL = azjeVar.cU();
        if (azjeVar.di(0)) {
            this.a = azjeVar.c();
            fY(0);
        }
        if (azjeVar.di(1)) {
            this.b = azjeVar.f();
            fY(1);
        }
        if (azjeVar.di(2)) {
            this.c = azjeVar.j();
            fY(2);
        }
        if (azjeVar.di(3)) {
            this.d = azjeVar.i();
            fY(3);
        }
        if (azjeVar.di(4)) {
            this.e = azjeVar.k();
            fY(4);
        }
        if (azjeVar.di(5)) {
            this.f = azjeVar.e();
            fY(5);
        }
        if (azjeVar.di(6)) {
            this.g = azjeVar.l();
            fY(6);
        }
        if (azjeVar.di(7)) {
            this.h = azjeVar.g();
            fY(7);
        }
        if (azjeVar.di(8)) {
            this.i = azjeVar.h();
            fY(8);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof azhv)) {
            return false;
        }
        azhv azhvVar = (azhv) obj;
        return super.aD(azhvVar.cL) && Objects.equals(this.a, azhvVar.a) && this.b == azhvVar.b && Objects.equals(this.c, azhvVar.c) && Objects.equals(this.d, azhvVar.d) && Objects.equals(this.e, azhvVar.e) && this.f == azhvVar.f && Arrays.equals(this.g, azhvVar.g) && Objects.equals(this.h, azhvVar.h) && Objects.equals(this.i, azhvVar.i);
    }

    @Override // defpackage.dtrq
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "groups", dtub.m(new String[]{"token", "group_type", "rcs_conference_uri", "name", "rcs_icon_url", "rcs_group_state", "tachygram_group_routing_token", "rcs_group_capabilities", "rcs_group_last_sync_timestamp"}));
    }

    @Override // defpackage.dtrq
    public final String g() {
        return null;
    }

    @Override // defpackage.dtrq
    public final String h() {
        return "groups";
    }

    public final int hashCode() {
        dtsq dtsqVar = this.cL;
        dtsq dtsqVar2 = (dtsqVar == null || dtsqVar.b()) ? null : this.cL;
        azcr azcrVar = this.a;
        azhr azhrVar = this.b;
        Integer valueOf = Integer.valueOf(azhrVar == null ? 0 : azhrVar.ordinal());
        String str = this.c;
        String str2 = this.d;
        String str3 = this.e;
        azfm azfmVar = this.f;
        return Objects.hash(dtsqVar2, azcrVar, valueOf, str, str2, str3, Integer.valueOf(azfmVar == null ? 0 : azfmVar.ordinal()), Integer.valueOf(Arrays.hashCode(this.g)), this.h, this.i, null);
    }

    @Override // defpackage.dtrq
    public final void i(StringBuilder sb, List list) {
        Object obj = new azhu(this).get();
        azhr azhrVar = this.b;
        Object valueOf = azhrVar == null ? r3 : String.valueOf(azhrVar.ordinal());
        String str = this.c;
        String str2 = this.d;
        String str3 = this.e;
        azfm azfmVar = this.f;
        Object[] objArr = {obj, valueOf, str, str2, str3, azfmVar != null ? String.valueOf(azfmVar.ordinal()) : 0, this.g, Long.valueOf(this.h.a), Long.valueOf(bdgw.a(this.i))};
        sb.append('(');
        for (int i = 0; i < 9; i++) {
            Object obj2 = objArr[i];
            if (obj2 instanceof Number) {
                sb.append(String.valueOf(obj2));
            } else {
                if (obj2 instanceof String) {
                    String str4 = (String) obj2;
                    if (str4.length() < 12) {
                        sb.append(DatabaseUtils.sqlEscapeString(str4));
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

    public final String toString() {
        return ((dtro.a) ekhw.a(dtub.b, dtro.a.class)).iB().a() ? String.format(Locale.US, "%s", "GroupsTable -- REDACTED") : a();
    }
}
