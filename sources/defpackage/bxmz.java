package defpackage;

import android.content.ContentValues;
import android.database.DatabaseUtils;
import defpackage.dtro;
import j$.util.Objects;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class bxmz extends dtro implements dtrq {
    public bxnz a;
    public String b;
    public String c;

    protected bxmz() {
    }

    @Override // defpackage.dtro
    public final String a() {
        return String.format(Locale.US, "RestoreWorkflowScratchDuplicatesTable [key: %s,\n  backup_id: %s,\n  bugle_id: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c));
    }

    @Override // defpackage.dtro
    public final void b(ContentValues contentValues) {
        bxnz bxnzVar = this.a;
        if (bxnzVar == null) {
            contentValues.putNull("key");
        } else {
            contentValues.put("key", Integer.valueOf(bxnzVar.ordinal()));
        }
        dtub.u(contentValues, "backup_id", this.b);
        dtub.u(contentValues, "bugle_id", this.c);
    }

    @Override // defpackage.dtro
    protected final /* bridge */ /* synthetic */ void c(dtsu dtsuVar) {
        bxnp bxnpVar = (bxnp) ((bxnl) dtsuVar);
        aB();
        this.cL = bxnpVar.cU();
        if (bxnpVar.di(0)) {
            this.a = bxnpVar.c();
            fY(0);
        }
        if (bxnpVar.di(1)) {
            this.b = bxnpVar.e();
            fY(1);
        }
        if (bxnpVar.di(2)) {
            this.c = bxnpVar.f();
            fY(2);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bxmz)) {
            return false;
        }
        bxmz bxmzVar = (bxmz) obj;
        return super.aD(bxmzVar.cL) && this.a == bxmzVar.a && Objects.equals(this.b, bxmzVar.b) && Objects.equals(this.c, bxmzVar.c);
    }

    @Override // defpackage.dtrq
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "restore_workflow_scratch_duplicates", dtub.m(new String[]{"key", "backup_id", "bugle_id"}));
    }

    @Override // defpackage.dtrq
    public final String g() {
        return null;
    }

    @Override // defpackage.dtrq
    public final String h() {
        return "restore_workflow_scratch_duplicates";
    }

    public final int hashCode() {
        dtsq dtsqVar = this.cL;
        dtsq dtsqVar2 = (dtsqVar == null || dtsqVar.b()) ? null : this.cL;
        bxnz bxnzVar = this.a;
        return Objects.hash(dtsqVar2, Integer.valueOf(bxnzVar == null ? 0 : bxnzVar.ordinal()), this.b, this.c, null);
    }

    @Override // defpackage.dtrq
    public final void i(StringBuilder sb, List list) {
        bxnz bxnzVar = this.a;
        Object[] objArr = {bxnzVar == null ? 0 : String.valueOf(bxnzVar.ordinal()), this.b, this.c};
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
        return ((dtro.a) ekhw.a(dtub.b, dtro.a.class)).iB().a() ? String.format(Locale.US, "%s", "RestoreWorkflowScratchDuplicatesTable -- REDACTED") : a();
    }
}
