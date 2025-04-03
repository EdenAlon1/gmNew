package defpackage;

import android.content.ContentValues;
import android.database.DatabaseUtils;
import defpackage.dtro;
import j$.util.Objects;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class byfm extends dtro implements dtrq {
    public byzn a = byzn.b(0);
    public boolean b = false;

    protected byfm() {
    }

    @Override // defpackage.dtro
    public final String a() {
        return String.format(Locale.US, "TriggerFlagsTable [_id: %s,\n  enabled: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b));
    }

    @Override // defpackage.dtro
    public final void b(ContentValues contentValues) {
        byzn byznVar = this.a;
        if (byznVar == null) {
            contentValues.putNull("_id");
        } else {
            contentValues.put("_id", Integer.valueOf(byznVar.a()));
        }
        contentValues.put("enabled", Boolean.valueOf(this.b));
    }

    @Override // defpackage.dtro
    protected final /* bridge */ /* synthetic */ void c(dtsu dtsuVar) {
        byfz byfzVar = (byfz) ((byfw) dtsuVar);
        aB();
        this.cL = byfzVar.cU();
        if (byfzVar.di(0)) {
            this.a = byfzVar.c();
            fY(0);
        }
        if (byfzVar.di(1)) {
            this.b = byfzVar.e();
            fY(1);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof byfm)) {
            return false;
        }
        byfm byfmVar = (byfm) obj;
        return super.aD(byfmVar.cL) && this.a == byfmVar.a && this.b == byfmVar.b;
    }

    @Override // defpackage.dtrq
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "trigger_flags", dtub.m(new String[]{"_id", "enabled"}));
    }

    @Override // defpackage.dtrq
    public final String g() {
        return null;
    }

    @Override // defpackage.dtrq
    public final String h() {
        return "trigger_flags";
    }

    public final int hashCode() {
        dtsq dtsqVar = this.cL;
        return Objects.hash((dtsqVar == null || dtsqVar.b()) ? null : this.cL, this.a, Boolean.valueOf(this.b), null);
    }

    @Override // defpackage.dtrq
    public final void i(StringBuilder sb, List list) {
        byzn byznVar = this.a;
        Object[] objArr = {byznVar == null ? 0 : String.valueOf(byznVar.a()), Integer.valueOf(this.b ? 1 : 0)};
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
        return ((dtro.a) ekhw.a(dtub.b, dtro.a.class)).iB().a() ? String.format(Locale.US, "%s", "TriggerFlagsTable -- REDACTED") : a();
    }
}
