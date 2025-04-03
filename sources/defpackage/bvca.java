package defpackage;

import android.content.ContentValues;
import android.database.DatabaseUtils;
import defpackage.dtro;
import j$.time.Instant;
import j$.util.Objects;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class bvca extends dtro implements dtrq {
    public Instant a = Instant.EPOCH;
    public emrk b;

    protected bvca() {
    }

    @Override // defpackage.dtro
    public final String a() {
        return String.format(Locale.US, "P13nNormalizedFeatureValuesTable [date: %s,\n  features: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b));
    }

    @Override // defpackage.dtro
    public final void b(ContentValues contentValues) {
        Instant instant = this.a;
        if (instant == null || instant.equals(Instant.EPOCH)) {
            contentValues.putNull("date");
        } else {
            contentValues.put("date", Long.valueOf(bdgt.a(this.a)));
        }
        emrk emrkVar = this.b;
        contentValues.put("features", emrkVar == null ? null : emrkVar.toByteArray());
    }

    @Override // defpackage.dtro
    protected final /* bridge */ /* synthetic */ void c(dtsu dtsuVar) {
        bvcp bvcpVar = (bvcp) ((bvcm) dtsuVar);
        aB();
        this.cL = bvcpVar.cU();
        if (bvcpVar.di(0)) {
            this.a = bvcpVar.e();
            fY(0);
        }
        if (bvcpVar.di(1)) {
            this.b = bvcpVar.c();
            fY(1);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bvca)) {
            return false;
        }
        bvca bvcaVar = (bvca) obj;
        return super.aD(bvcaVar.cL) && Objects.equals(this.a, bvcaVar.a) && Objects.equals(this.b, bvcaVar.b);
    }

    @Override // defpackage.dtrq
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "smarts_personalization_normalized_feature_values", dtub.m(new String[]{"date", "features"}));
    }

    @Override // defpackage.dtrq
    public final String g() {
        return null;
    }

    @Override // defpackage.dtrq
    public final String h() {
        return "smarts_personalization_normalized_feature_values";
    }

    public final int hashCode() {
        dtsq dtsqVar = this.cL;
        return Objects.hash((dtsqVar == null || dtsqVar.b()) ? null : this.cL, this.a, this.b, null);
    }

    @Override // defpackage.dtrq
    public final void i(StringBuilder sb, List list) {
        Object obj = new bvbz(this).get();
        emrk emrkVar = this.b;
        Object[] objArr = {obj, emrkVar == null ? null : emrkVar.toByteArray()};
        sb.append('(');
        for (int i = 0; i < 2; i++) {
            Object obj2 = objArr[i];
            if (obj2 instanceof Number) {
                sb.append(String.valueOf(obj2));
            } else {
                if (obj2 instanceof String) {
                    String str = (String) obj2;
                    if (str.length() < 12) {
                        sb.append(DatabaseUtils.sqlEscapeString(str));
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
        return ((dtro.a) ekhw.a(dtub.b, dtro.a.class)).iB().a() ? String.format(Locale.US, "%s", "P13nNormalizedFeatureValuesTable -- REDACTED") : a();
    }
}
