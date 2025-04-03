package defpackage;

import android.content.ContentValues;
import android.database.DatabaseUtils;
import defpackage.dtro;
import j$.util.Objects;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class bwhc extends dtro implements dtrq {
    public long a;
    public String b;

    protected bwhc() {
    }

    @Override // defpackage.dtro
    public final String a() {
        return String.format(Locale.US, "PhoneNumberMinMatchGuesserTable [guesser_id: %s,\n  test_phone_number: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b));
    }

    @Override // defpackage.dtro
    public final void b(ContentValues contentValues) {
        dtub.u(contentValues, "test_phone_number", this.b);
    }

    @Override // defpackage.dtro
    protected final /* bridge */ /* synthetic */ void c(dtsu dtsuVar) {
        bwhp bwhpVar = (bwhp) ((bwhm) dtsuVar);
        aB();
        this.cL = bwhpVar.cU();
        if (bwhpVar.di(0)) {
            this.a = bwhpVar.c();
            fY(0);
        }
        if (bwhpVar.di(1)) {
            this.b = bwhpVar.e();
            fY(1);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bwhc)) {
            return false;
        }
        bwhc bwhcVar = (bwhc) obj;
        return super.aD(bwhcVar.cL) && this.a == bwhcVar.a && Objects.equals(this.b, bwhcVar.b);
    }

    @Override // defpackage.dtrq
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "phone_number_min_match_guesser", dtub.m(new String[]{"test_phone_number"}));
    }

    @Override // defpackage.dtrq
    public final String g() {
        return "guesser_id";
    }

    @Override // defpackage.dtrq
    public final String h() {
        return "phone_number_min_match_guesser";
    }

    public final int hashCode() {
        dtsq dtsqVar = this.cL;
        return Objects.hash((dtsqVar == null || dtsqVar.b()) ? null : this.cL, Long.valueOf(this.a), this.b, null);
    }

    @Override // defpackage.dtrq
    public final void i(StringBuilder sb, List list) {
        Object[] objArr = {this.b};
        sb.append('(');
        for (int i = 0; i <= 0; i++) {
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
        return ((dtro.a) ekhw.a(dtub.b, dtro.a.class)).iB().a() ? String.format(Locale.US, "%s", "PhoneNumberMinMatchGuesserTable -- REDACTED") : a();
    }
}
