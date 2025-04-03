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
public class cfrf extends dtro implements dtrq {
    public String a;
    public String b;
    public long c;
    public byte[] d;

    protected cfrf() {
    }

    @Override // defpackage.dtro
    public final String a() {
        Locale locale = Locale.US;
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        byte[] bArr = this.d;
        return String.format(locale, "MlsZinniaStatesTable [identity_id: %s,\n  group_id: %s,\n  era: %s,\n  zinnia_state: %s\n]\n", valueOf, valueOf2, valueOf3, "BLOB".concat(String.valueOf(bArr != null ? String.valueOf(bArr.length) : "NULL")));
    }

    @Override // defpackage.dtro
    public final void b(ContentValues contentValues) {
        dtub.u(contentValues, "identity_id", this.a);
        dtub.u(contentValues, "group_id", this.b);
        contentValues.put("era", Long.valueOf(this.c));
        contentValues.put("zinnia_state", this.d);
    }

    @Override // defpackage.dtro
    protected final /* bridge */ /* synthetic */ void c(dtsu dtsuVar) {
        cfry cfryVar = (cfry) ((cfrt) dtsuVar);
        aB();
        this.cL = cfryVar.cU();
        if (cfryVar.di(0)) {
            this.a = cfryVar.f();
            fY(0);
        }
        if (cfryVar.di(1)) {
            this.b = cfryVar.e();
            fY(1);
        }
        if (cfryVar.di(2)) {
            this.c = cfryVar.c();
            fY(2);
        }
        if (cfryVar.di(3)) {
            this.d = cfryVar.g();
            fY(3);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof cfrf)) {
            return false;
        }
        cfrf cfrfVar = (cfrf) obj;
        return super.aD(cfrfVar.cL) && Objects.equals(this.a, cfrfVar.a) && Objects.equals(this.b, cfrfVar.b) && this.c == cfrfVar.c && Arrays.equals(this.d, cfrfVar.d);
    }

    @Override // defpackage.dtrq
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "mls_zinnia_states", dtub.m(new String[]{"identity_id", "group_id", "era", "zinnia_state"}));
    }

    @Override // defpackage.dtrq
    public final String g() {
        return null;
    }

    @Override // defpackage.dtrq
    public final String h() {
        return "mls_zinnia_states";
    }

    public final int hashCode() {
        dtsq dtsqVar = this.cL;
        return Objects.hash((dtsqVar == null || dtsqVar.b()) ? null : this.cL, this.a, this.b, Long.valueOf(this.c), Integer.valueOf(Arrays.hashCode(this.d)), null);
    }

    @Override // defpackage.dtrq
    public final void i(StringBuilder sb, List list) {
        Object[] objArr = {this.a, this.b, Long.valueOf(this.c), this.d};
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
        return ((dtro.a) ekhw.a(dtub.b, dtro.a.class)).iB().a() ? String.format(Locale.US, "%s", "MlsZinniaStatesTable -- REDACTED") : a();
    }
}
