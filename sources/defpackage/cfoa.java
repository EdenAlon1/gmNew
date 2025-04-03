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
public class cfoa extends dtro implements dtrq {
    public String a;
    public String b;
    public byte[] c;

    protected cfoa() {
    }

    @Override // defpackage.dtro
    public final String a() {
        Locale locale = Locale.US;
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        byte[] bArr = this.c;
        return String.format(locale, "MlsGroupStatesTable [identity_id: %s,\n  group_id: %s,\n  epoch_data: %s\n]\n", valueOf, valueOf2, "BLOB".concat(String.valueOf(bArr != null ? String.valueOf(bArr.length) : "NULL")));
    }

    @Override // defpackage.dtro
    public final void b(ContentValues contentValues) {
        dtub.u(contentValues, "identity_id", this.a);
        dtub.u(contentValues, "group_id", this.b);
        contentValues.put("epoch_data", this.c);
    }

    @Override // defpackage.dtro
    protected final /* bridge */ /* synthetic */ void c(dtsu dtsuVar) {
        cfoq cfoqVar = (cfoq) ((cfom) dtsuVar);
        aB();
        this.cL = cfoqVar.cU();
        if (cfoqVar.di(0)) {
            this.a = cfoqVar.e();
            fY(0);
        }
        if (cfoqVar.di(1)) {
            this.b = cfoqVar.c();
            fY(1);
        }
        if (cfoqVar.di(2)) {
            this.c = cfoqVar.f();
            fY(2);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof cfoa)) {
            return false;
        }
        cfoa cfoaVar = (cfoa) obj;
        return super.aD(cfoaVar.cL) && Objects.equals(this.a, cfoaVar.a) && Objects.equals(this.b, cfoaVar.b) && Arrays.equals(this.c, cfoaVar.c);
    }

    @Override // defpackage.dtrq
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "mls_group_states", dtub.m(new String[]{"identity_id", "group_id", "epoch_data"}));
    }

    @Override // defpackage.dtrq
    public final String g() {
        return null;
    }

    @Override // defpackage.dtrq
    public final String h() {
        return "mls_group_states";
    }

    public final int hashCode() {
        dtsq dtsqVar = this.cL;
        return Objects.hash((dtsqVar == null || dtsqVar.b()) ? null : this.cL, this.a, this.b, Integer.valueOf(Arrays.hashCode(this.c)), null);
    }

    @Override // defpackage.dtrq
    public final void i(StringBuilder sb, List list) {
        Object[] objArr = {this.a, this.b, this.c};
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
        return ((dtro.a) ekhw.a(dtub.b, dtro.a.class)).iB().a() ? String.format(Locale.US, "%s", "MlsGroupStatesTable -- REDACTED") : a();
    }
}
