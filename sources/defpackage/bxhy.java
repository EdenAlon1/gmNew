package defpackage;

import android.content.ContentValues;
import android.database.DatabaseUtils;
import defpackage.dtro;
import j$.util.Objects;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class bxhy extends dtro implements dtrq {
    public String a;
    public String b;

    protected bxhy() {
    }

    @Override // defpackage.dtro
    public final String a() {
        return String.format(Locale.US, "RemoteUserIdToRegistrationIdTable [remote_user_id: %s,\n  tachyon_registration_id: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b));
    }

    @Override // defpackage.dtro
    public final void b(ContentValues contentValues) {
        dtub.u(contentValues, "remote_user_id", this.a);
        dtub.u(contentValues, "tachyon_registration_id", this.b);
    }

    @Override // defpackage.dtro
    protected final /* bridge */ /* synthetic */ void c(dtsu dtsuVar) {
        bxim bximVar = (bxim) ((bxij) dtsuVar);
        aB();
        this.cL = bximVar.cU();
        if (bximVar.di(0)) {
            this.a = bximVar.c();
            fY(0);
        }
        if (bximVar.di(1)) {
            this.b = bximVar.e();
            fY(1);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bxhy)) {
            return false;
        }
        bxhy bxhyVar = (bxhy) obj;
        return super.aD(bxhyVar.cL) && Objects.equals(this.a, bxhyVar.a) && Objects.equals(this.b, bxhyVar.b);
    }

    @Override // defpackage.dtrq
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "remote_user_id_to_registration_id", dtub.m(new String[]{"remote_user_id", "tachyon_registration_id"}));
    }

    @Override // defpackage.dtrq
    public final String g() {
        return null;
    }

    @Override // defpackage.dtrq
    public final String h() {
        return "remote_user_id_to_registration_id";
    }

    public final int hashCode() {
        dtsq dtsqVar = this.cL;
        return Objects.hash((dtsqVar == null || dtsqVar.b()) ? null : this.cL, this.a, this.b, null);
    }

    @Override // defpackage.dtrq
    public final void i(StringBuilder sb, List list) {
        Object[] objArr = {this.a, this.b};
        sb.append('(');
        for (int i = 0; i < 2; i++) {
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
        return ((dtro.a) ekhw.a(dtub.b, dtro.a.class)).iB().a() ? String.format(Locale.US, "%s", "RemoteUserIdToRegistrationIdTable -- REDACTED") : a();
    }
}
