package defpackage;

import android.content.ContentValues;
import android.database.DatabaseUtils;
import defpackage.dtro;
import j$.util.Objects;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class bxyy extends dtro implements dtrq {
    public String a;
    public String b;
    public String c;

    protected bxyy() {
    }

    @Override // defpackage.dtro
    public final String a() {
        return String.format(Locale.US, "StickerSetsLocalizationTable [sticker_set_id: %s,\n  locale: %s,\n  display_name: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c));
    }

    @Override // defpackage.dtro
    public final void b(ContentValues contentValues) {
        dtub.u(contentValues, "sticker_set_id", this.a);
        dtub.u(contentValues, "locale", this.b);
        dtub.u(contentValues, "display_name", this.c);
    }

    @Override // defpackage.dtro
    protected final /* bridge */ /* synthetic */ void c(dtsu dtsuVar) {
        bxzp bxzpVar = (bxzp) ((bxzl) dtsuVar);
        aB();
        this.cL = bxzpVar.cU();
        if (bxzpVar.di(0)) {
            this.a = bxzpVar.f();
            fY(0);
        }
        if (bxzpVar.di(1)) {
            this.b = bxzpVar.e();
            fY(1);
        }
        if (bxzpVar.di(2)) {
            this.c = bxzpVar.c();
            fY(2);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bxyy)) {
            return false;
        }
        bxyy bxyyVar = (bxyy) obj;
        return super.aD(bxyyVar.cL) && Objects.equals(this.a, bxyyVar.a) && Objects.equals(this.b, bxyyVar.b) && Objects.equals(this.c, bxyyVar.c);
    }

    @Override // defpackage.dtrq
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "sticker_sets_localization", dtub.m(new String[]{"sticker_set_id", "locale", "display_name"}));
    }

    @Override // defpackage.dtrq
    public final String g() {
        return null;
    }

    @Override // defpackage.dtrq
    public final String h() {
        return "sticker_sets_localization";
    }

    public final int hashCode() {
        dtsq dtsqVar = this.cL;
        return Objects.hash((dtsqVar == null || dtsqVar.b()) ? null : this.cL, this.a, this.b, this.c, null);
    }

    @Override // defpackage.dtrq
    public final void i(StringBuilder sb, List list) {
        Object[] objArr = {this.a, this.b, this.c};
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
        return ((dtro.a) ekhw.a(dtub.b, dtro.a.class)).iB().a() ? String.format(Locale.US, "%s", "StickerSetsLocalizationTable -- REDACTED") : a();
    }
}
