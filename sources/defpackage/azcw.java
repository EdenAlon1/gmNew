package defpackage;

import android.content.ContentValues;
import android.database.DatabaseUtils;
import defpackage.dtro;
import j$.util.Objects;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class azcw extends dtro implements dtrq {
    public azcr a = null;
    public String b;
    public azcg c;

    protected azcw() {
    }

    @Override // defpackage.dtro
    public final String a() {
        return String.format(Locale.US, "DestinationsTable [token: %s,\n  address: %s,\n  address_type: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c));
    }

    @Override // defpackage.dtro
    public final void b(ContentValues contentValues) {
        azcr azcrVar = this.a;
        if (azcrVar == null || azcrVar.equals(null)) {
            contentValues.putNull("token");
        } else {
            contentValues.put("token", azcs.b(this.a));
        }
        dtub.u(contentValues, "address", this.b);
        azcg azcgVar = this.c;
        if (azcgVar == null) {
            contentValues.putNull("address_type");
        } else {
            contentValues.put("address_type", Integer.valueOf(azcgVar.ordinal()));
        }
    }

    @Override // defpackage.dtro
    protected final /* bridge */ /* synthetic */ void c(dtsu dtsuVar) {
        azdm azdmVar = (azdm) ((azdi) dtsuVar);
        aB();
        this.cL = azdmVar.cU();
        if (azdmVar.di(0)) {
            this.a = azdmVar.e();
            fY(0);
        }
        if (azdmVar.di(1)) {
            this.b = azdmVar.f();
            fY(1);
        }
        if (azdmVar.di(2)) {
            this.c = azdmVar.c();
            fY(2);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof azcw)) {
            return false;
        }
        azcw azcwVar = (azcw) obj;
        return super.aD(azcwVar.cL) && Objects.equals(this.a, azcwVar.a) && Objects.equals(this.b, azcwVar.b) && this.c == azcwVar.c;
    }

    @Override // defpackage.dtrq
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "destinations", dtub.m(new String[]{"token", "address", "address_type"}));
    }

    @Override // defpackage.dtrq
    public final String g() {
        return null;
    }

    @Override // defpackage.dtrq
    public final String h() {
        return "destinations";
    }

    public final int hashCode() {
        dtsq dtsqVar = this.cL;
        dtsq dtsqVar2 = (dtsqVar == null || dtsqVar.b()) ? null : this.cL;
        azcr azcrVar = this.a;
        String str = this.b;
        azcg azcgVar = this.c;
        return Objects.hash(dtsqVar2, azcrVar, str, Integer.valueOf(azcgVar == null ? 0 : azcgVar.ordinal()), null);
    }

    @Override // defpackage.dtrq
    public final void i(StringBuilder sb, List list) {
        Object obj = new azcv(this).get();
        String str = this.b;
        azcg azcgVar = this.c;
        Object[] objArr = {obj, str, azcgVar == null ? 0 : String.valueOf(azcgVar.ordinal())};
        sb.append('(');
        for (int i = 0; i < 3; i++) {
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

    public final String toString() {
        return ((dtro.a) ekhw.a(dtub.b, dtro.a.class)).iB().a() ? String.format(Locale.US, "%s", "DestinationsTable -- REDACTED") : a();
    }
}
