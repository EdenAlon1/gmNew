package defpackage;

import android.content.ContentValues;
import android.database.DatabaseUtils;
import defpackage.dtro;
import j$.util.Objects;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class bybo extends dtro implements dtrq {
    public String a;
    public String b;
    public String c;
    public String d;
    public long e;

    protected bybo() {
    }

    @Override // defpackage.dtro
    public final String a() {
        return String.format(Locale.US, "StickersLocalizationTable [sticker_set_id: %s,\n  sticker_id: %s,\n  locale: %s,\n  display_name: %s,\n  sticker_local_id: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c), String.valueOf(this.d), String.valueOf(this.e));
    }

    @Override // defpackage.dtro
    public final void b(ContentValues contentValues) {
        dtub.u(contentValues, "sticker_set_id", this.a);
        dtub.u(contentValues, "sticker_id", this.b);
        dtub.u(contentValues, "locale", this.c);
        dtub.u(contentValues, "display_name", this.d);
        dtub.t(contentValues, "sticker_local_id", this.e);
    }

    @Override // defpackage.dtro
    protected final /* bridge */ /* synthetic */ void c(dtsu dtsuVar) {
        bycm bycmVar = (bycm) ((bycg) dtsuVar);
        aB();
        this.cL = bycmVar.cU();
        if (bycmVar.di(0)) {
            this.a = bycmVar.h();
            fY(0);
        }
        if (bycmVar.di(1)) {
            this.b = bycmVar.g();
            fY(1);
        }
        if (bycmVar.di(2)) {
            this.c = bycmVar.f();
            fY(2);
        }
        if (bycmVar.di(3)) {
            this.d = bycmVar.e();
            fY(3);
        }
        if (bycmVar.di(4)) {
            this.e = bycmVar.c();
            fY(4);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bybo)) {
            return false;
        }
        bybo byboVar = (bybo) obj;
        return super.aD(byboVar.cL) && Objects.equals(this.a, byboVar.a) && Objects.equals(this.b, byboVar.b) && Objects.equals(this.c, byboVar.c) && Objects.equals(this.d, byboVar.d) && this.e == byboVar.e;
    }

    @Override // defpackage.dtrq
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "stickers_localization", dtub.m(new String[]{"sticker_set_id", "sticker_id", "locale", "display_name", "sticker_local_id"}));
    }

    @Override // defpackage.dtrq
    public final String g() {
        return null;
    }

    @Override // defpackage.dtrq
    public final String h() {
        return "stickers_localization";
    }

    public final int hashCode() {
        dtsq dtsqVar = this.cL;
        return Objects.hash((dtsqVar == null || dtsqVar.b()) ? null : this.cL, this.a, this.b, this.c, this.d, Long.valueOf(this.e), null);
    }

    @Override // defpackage.dtrq
    public final void i(StringBuilder sb, List list) {
        Object[] objArr = {this.a, this.b, this.c, this.d, Long.valueOf(this.e)};
        sb.append('(');
        for (int i = 0; i < 5; i++) {
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
        return ((dtro.a) ekhw.a(dtub.b, dtro.a.class)).iB().a() ? String.format(Locale.US, "%s", "StickersLocalizationTable -- REDACTED") : a();
    }
}
