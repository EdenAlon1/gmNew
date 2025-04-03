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
public class bvax extends dtro implements dtrq {
    public bdhk a = bdhk.a;
    public bdhl b = bdhl.a;
    public Instant c = Instant.EPOCH;

    protected bvax() {
    }

    @Override // defpackage.dtro
    public final String a() {
        return String.format(Locale.US, "P13nFeaturesTable [feature_id: %s,\n  feature: %s,\n  start_date: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c));
    }

    @Override // defpackage.dtro
    public final void b(ContentValues contentValues) {
        int intValue = bvbu.c().intValue();
        bdhk bdhkVar = this.a;
        if (bdhkVar == null || bdhkVar.equals(bdhk.a)) {
            contentValues.putNull("feature_id");
        } else {
            contentValues.put("feature_id", Long.valueOf(bdhk.a(this.a)));
        }
        if (intValue >= 54060) {
            bdhl bdhlVar = this.b;
            if (bdhlVar == null || bdhlVar.equals(bdhl.a)) {
                contentValues.putNull("feature");
            } else {
                contentValues.put("feature", bdhl.d(this.b));
            }
        }
        Instant instant = this.c;
        if (instant == null) {
            contentValues.putNull("start_date");
        } else {
            contentValues.put("start_date", Long.valueOf(bdgt.a(instant)));
        }
    }

    @Override // defpackage.dtro
    protected final /* bridge */ /* synthetic */ void c(dtsu dtsuVar) {
        bvbn bvbnVar = (bvbn) ((bvbj) dtsuVar);
        aB();
        this.cL = bvbnVar.cU();
        if (bvbnVar.di(0)) {
            this.a = bvbnVar.c();
            super.fY(0);
        }
        if (bvbnVar.di(1)) {
            this.b = bvbnVar.e();
            super.fY(1);
        }
        if (bvbnVar.di(2)) {
            this.c = bvbnVar.f();
            super.fY(2);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bvax)) {
            return false;
        }
        bvax bvaxVar = (bvax) obj;
        return super.aD(bvaxVar.cL) && Objects.equals(this.a, bvaxVar.a) && Objects.equals(this.b, bvaxVar.b) && Objects.equals(this.c, bvaxVar.c);
    }

    @Override // defpackage.dtrq
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "smarts_personalization_features", dtub.m(new String[]{"feature", "start_date"}));
    }

    @Override // defpackage.dtro
    public final void fY(int i) {
        super.fY(0);
    }

    @Override // defpackage.dtrq
    public final String g() {
        return "feature_id";
    }

    @Override // defpackage.dtrq
    public final String h() {
        return "smarts_personalization_features";
    }

    public final int hashCode() {
        dtsq dtsqVar = this.cL;
        return Objects.hash((dtsqVar == null || dtsqVar.b()) ? null : this.cL, this.a, this.b, this.c, null);
    }

    @Override // defpackage.dtrq
    public final void i(StringBuilder sb, List list) {
        Object[] objArr = {new bvaw(this).get(), Long.valueOf(bdgt.a(this.c))};
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

    public final bdhk k() {
        az(0, "feature_id");
        return this.a;
    }

    public final bdhl l() {
        az(1, "feature");
        return this.b;
    }

    public final String toString() {
        return ((dtro.a) ekhw.a(dtub.b, dtro.a.class)).iB().a() ? String.format(Locale.US, "%s", "P13nFeaturesTable -- REDACTED") : a();
    }
}
