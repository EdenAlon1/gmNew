package defpackage;

import android.content.ContentValues;
import android.database.DatabaseUtils;
import defpackage.dtro;
import j$.util.Objects;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class bxoc extends dtro implements dtrq {
    public byyn a;
    public String b;
    public String c;

    protected bxoc() {
    }

    @Override // defpackage.dtro
    public final String a() {
        return String.format(Locale.US, "RestoreWorkflowScratchSuffixTable [which_database: %s,\n  participant_id: %s,\n  destination_suffix: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c));
    }

    @Override // defpackage.dtro
    public final void b(ContentValues contentValues) {
        byyn byynVar = this.a;
        if (byynVar == null) {
            contentValues.putNull("which_database");
        } else {
            contentValues.put("which_database", Integer.valueOf(byynVar.ordinal()));
        }
        dtub.u(contentValues, "participant_id", this.b);
        dtub.u(contentValues, "destination_suffix", this.c);
    }

    @Override // defpackage.dtro
    protected final /* bridge */ /* synthetic */ void c(dtsu dtsuVar) {
        bxos bxosVar = (bxos) ((bxoo) dtsuVar);
        aB();
        this.cL = bxosVar.cU();
        if (bxosVar.di(0)) {
            this.a = bxosVar.c();
            fY(0);
        }
        if (bxosVar.di(1)) {
            this.b = bxosVar.f();
            fY(1);
        }
        if (bxosVar.di(2)) {
            this.c = bxosVar.e();
            fY(2);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bxoc)) {
            return false;
        }
        bxoc bxocVar = (bxoc) obj;
        return super.aD(bxocVar.cL) && this.a == bxocVar.a && Objects.equals(this.b, bxocVar.b) && Objects.equals(this.c, bxocVar.c);
    }

    @Override // defpackage.dtrq
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "restore_workflow_scratch_suffix", dtub.m(new String[]{"which_database", "participant_id", "destination_suffix"}));
    }

    @Override // defpackage.dtrq
    public final String g() {
        return null;
    }

    @Override // defpackage.dtrq
    public final String h() {
        return "restore_workflow_scratch_suffix";
    }

    public final int hashCode() {
        dtsq dtsqVar = this.cL;
        dtsq dtsqVar2 = (dtsqVar == null || dtsqVar.b()) ? null : this.cL;
        byyn byynVar = this.a;
        return Objects.hash(dtsqVar2, Integer.valueOf(byynVar == null ? 0 : byynVar.ordinal()), this.b, this.c, null);
    }

    @Override // defpackage.dtrq
    public final void i(StringBuilder sb, List list) {
        byyn byynVar = this.a;
        Object[] objArr = {byynVar == null ? 0 : String.valueOf(byynVar.ordinal()), this.b, this.c};
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
        return ((dtro.a) ekhw.a(dtub.b, dtro.a.class)).iB().a() ? String.format(Locale.US, "%s", "RestoreWorkflowScratchSuffixTable -- REDACTED") : a();
    }
}
