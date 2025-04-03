package defpackage;

import android.content.ContentValues;
import android.database.DatabaseUtils;
import defpackage.dtro;
import j$.util.Objects;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class btqv extends dtro implements dtrq {
    public int a;

    protected btqv() {
    }

    @Override // defpackage.dtro
    public final String a() {
        return String.format(Locale.US, "LinkedAccountTable [account_id: %s\n]\n", String.valueOf(this.a));
    }

    @Override // defpackage.dtro
    public final void b(ContentValues contentValues) {
        contentValues.put("account_id", Integer.valueOf(this.a));
    }

    @Override // defpackage.dtro
    protected final /* bridge */ /* synthetic */ void c(dtsu dtsuVar) {
        btrf btrfVar = (btrf) ((btrd) dtsuVar);
        aB();
        this.cL = btrfVar.cU();
        if (btrfVar.di(0)) {
            this.a = btrfVar.c();
            super.fY(0);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof btqv)) {
            return false;
        }
        btqv btqvVar = (btqv) obj;
        return super.aD(btqvVar.cL) && this.a == btqvVar.a;
    }

    @Override // defpackage.dtrq
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "linked_account", dtub.m(new String[]{"account_id"}));
    }

    @Override // defpackage.dtrq
    public final String g() {
        return null;
    }

    @Override // defpackage.dtrq
    public final String h() {
        return "linked_account";
    }

    public final int hashCode() {
        dtsq dtsqVar = this.cL;
        return Objects.hash((dtsqVar == null || dtsqVar.b()) ? null : this.cL, Integer.valueOf(this.a), null);
    }

    @Override // defpackage.dtrq
    public final void i(StringBuilder sb, List list) {
        Object[] objArr = {Integer.valueOf(this.a)};
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
        return ((dtro.a) ekhw.a(dtub.b, dtro.a.class)).iB().a() ? String.format(Locale.US, "%s", "LinkedAccountTable -- REDACTED") : a();
    }
}
