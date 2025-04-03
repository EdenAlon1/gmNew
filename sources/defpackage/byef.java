package defpackage;

import android.content.ContentValues;
import android.database.DatabaseUtils;
import defpackage.dtro;
import j$.util.Objects;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class byef extends dtro implements dtrq {
    public int a;
    public String b;
    public byfj c;

    protected byef() {
    }

    @Override // defpackage.dtro
    public final String a() {
        return String.format(Locale.US, "SuperSortLabelsTable [_id: %s,\n  name: %s,\n  status: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c));
    }

    @Override // defpackage.dtro
    public final void b(ContentValues contentValues) {
        contentValues.put("_id", Integer.valueOf(this.a));
        dtub.u(contentValues, "name", this.b);
        byfj byfjVar = this.c;
        if (byfjVar == null) {
            contentValues.putNull("status");
        } else {
            contentValues.put("status", Integer.valueOf(byfjVar.ordinal()));
        }
    }

    @Override // defpackage.dtro
    protected final /* bridge */ /* synthetic */ void c(dtsu dtsuVar) {
        byex byexVar = (byex) ((byet) dtsuVar);
        aB();
        this.cL = byexVar.cU();
        if (byexVar.di(0)) {
            this.a = byexVar.e();
            fY(0);
        }
        if (byexVar.di(1)) {
            this.b = byexVar.g();
            fY(1);
        }
        if (byexVar.di(2)) {
            this.c = byexVar.f();
            fY(2);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof byef)) {
            return false;
        }
        byef byefVar = (byef) obj;
        return super.aD(byefVar.cL) && this.a == byefVar.a && Objects.equals(this.b, byefVar.b) && this.c == byefVar.c;
    }

    @Override // defpackage.dtrq
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "supersort_labels", dtub.m(new String[]{"_id", "name", "status"}));
    }

    @Override // defpackage.dtrq
    public final String g() {
        return null;
    }

    @Override // defpackage.dtrq
    public final String h() {
        return "supersort_labels";
    }

    public final int hashCode() {
        dtsq dtsqVar = this.cL;
        dtsq dtsqVar2 = (dtsqVar == null || dtsqVar.b()) ? null : this.cL;
        Integer valueOf = Integer.valueOf(this.a);
        String str = this.b;
        byfj byfjVar = this.c;
        return Objects.hash(dtsqVar2, valueOf, str, Integer.valueOf(byfjVar == null ? 0 : byfjVar.ordinal()), null);
    }

    @Override // defpackage.dtrq
    public final void i(StringBuilder sb, List list) {
        Integer valueOf = Integer.valueOf(this.a);
        String str = this.b;
        byfj byfjVar = this.c;
        Object[] objArr = {valueOf, str, byfjVar == null ? 0 : String.valueOf(byfjVar.ordinal())};
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
        return ((dtro.a) ekhw.a(dtub.b, dtro.a.class)).iB().a() ? String.format(Locale.US, "%s", "SuperSortLabelsTable -- REDACTED") : a();
    }
}
