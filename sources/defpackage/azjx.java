package defpackage;

import android.content.ContentValues;
import android.database.DatabaseUtils;
import defpackage.dtro;
import j$.util.Objects;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class azjx extends dtro implements dtrq {
    public String a;
    public int b;
    public int c = -1;

    protected azjx() {
    }

    @Override // defpackage.dtro
    public final String a() {
        return String.format(Locale.US, "ActiveSimsTable [sim_serial_number: %s,\n  active_sub_id: %s,\n  sim_slot_index: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c));
    }

    @Override // defpackage.dtro
    public final void b(ContentValues contentValues) {
        dtub.u(contentValues, "sim_serial_number", this.a);
        contentValues.put("active_sub_id", Integer.valueOf(this.b));
        contentValues.put("sim_slot_index", Integer.valueOf(this.c));
    }

    @Override // defpackage.dtro
    protected final /* bridge */ /* synthetic */ void c(dtsu dtsuVar) {
        azkp azkpVar = (azkp) ((azkl) dtsuVar);
        aB();
        this.cL = azkpVar.cU();
        if (azkpVar.di(0)) {
            this.a = azkpVar.f();
            fY(0);
        }
        if (azkpVar.di(1)) {
            this.b = azkpVar.c();
            fY(1);
        }
        if (azkpVar.di(2)) {
            this.c = azkpVar.e();
            fY(2);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof azjx)) {
            return false;
        }
        azjx azjxVar = (azjx) obj;
        return super.aD(azjxVar.cL) && Objects.equals(this.a, azjxVar.a) && this.b == azjxVar.b && this.c == azjxVar.c;
    }

    @Override // defpackage.dtrq
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "active_sims", dtub.m(new String[]{"sim_serial_number", "active_sub_id", "sim_slot_index"}));
    }

    @Override // defpackage.dtrq
    public final String g() {
        return null;
    }

    @Override // defpackage.dtrq
    public final String h() {
        return "active_sims";
    }

    public final int hashCode() {
        dtsq dtsqVar = this.cL;
        return Objects.hash((dtsqVar == null || dtsqVar.b()) ? null : this.cL, this.a, Integer.valueOf(this.b), Integer.valueOf(this.c), null);
    }

    @Override // defpackage.dtrq
    public final void i(StringBuilder sb, List list) {
        Object[] objArr = {this.a, Integer.valueOf(this.b), Integer.valueOf(this.c)};
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
        return ((dtro.a) ekhw.a(dtub.b, dtro.a.class)).iB().a() ? String.format(Locale.US, "%s", "ActiveSimsTable -- REDACTED") : a();
    }
}
