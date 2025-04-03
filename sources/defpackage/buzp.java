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
public class buzp extends dtro implements dtrq {
    public bdhk a = bdhk.a;
    public Instant b = Instant.EPOCH;
    public float c;

    protected buzp() {
    }

    @Override // defpackage.dtro
    public final String a() {
        return String.format(Locale.US, "P13nDecayedFeatureValuesTable [feature_id: %s,\n  date: %s,\n  feature_value: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c));
    }

    @Override // defpackage.dtro
    public final void b(ContentValues contentValues) {
        bdhk bdhkVar = this.a;
        if (bdhkVar == null || bdhkVar.equals(bdhk.a)) {
            contentValues.putNull("feature_id");
        } else {
            contentValues.put("feature_id", Long.valueOf(bdhk.a(this.a)));
        }
        Instant instant = this.b;
        if (instant == null || instant.equals(Instant.EPOCH)) {
            contentValues.putNull("date");
        } else {
            contentValues.put("date", Long.valueOf(bdgt.a(this.b)));
        }
        contentValues.put("feature_value", Float.valueOf(this.c));
    }

    @Override // defpackage.dtro
    protected final /* bridge */ /* synthetic */ void c(dtsu dtsuVar) {
        bvai bvaiVar = (bvai) ((bvae) dtsuVar);
        aB();
        this.cL = bvaiVar.cU();
        if (bvaiVar.di(0)) {
            this.a = bvaiVar.e();
            fY(0);
        }
        if (bvaiVar.di(1)) {
            this.b = bvaiVar.f();
            fY(1);
        }
        if (bvaiVar.di(2)) {
            this.c = bvaiVar.c();
            fY(2);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof buzp)) {
            return false;
        }
        buzp buzpVar = (buzp) obj;
        return super.aD(buzpVar.cL) && Objects.equals(this.a, buzpVar.a) && Objects.equals(this.b, buzpVar.b) && this.c == buzpVar.c;
    }

    @Override // defpackage.dtrq
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "smarts_personalization_decayed_feature_values", dtub.m(new String[]{"feature_id", "date", "feature_value"}));
    }

    @Override // defpackage.dtrq
    public final String g() {
        return null;
    }

    @Override // defpackage.dtrq
    public final String h() {
        return "smarts_personalization_decayed_feature_values";
    }

    public final int hashCode() {
        dtsq dtsqVar = this.cL;
        return Objects.hash((dtsqVar == null || dtsqVar.b()) ? null : this.cL, this.a, this.b, Float.valueOf(this.c), null);
    }

    @Override // defpackage.dtrq
    public final void i(StringBuilder sb, List list) {
        Object[] objArr = {new buzn(this).get(), new buzo(this).get(), Float.valueOf(this.c)};
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
        return ((dtro.a) ekhw.a(dtub.b, dtro.a.class)).iB().a() ? String.format(Locale.US, "%s", "P13nDecayedFeatureValuesTable -- REDACTED") : a();
    }
}
