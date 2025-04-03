package defpackage;

import android.content.ContentValues;
import android.database.DatabaseUtils;
import defpackage.dtro;
import j$.util.Objects;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class byct extends dtro implements dtrq {
    public long a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public int g = 0;

    protected byct() {
    }

    @Override // defpackage.dtro
    public final String a() {
        return String.format(Locale.US, "StickersTable [_id: %s,\n  sticker_set_id: %s,\n  sticker_id: %s,\n  icon_uri_static: %s,\n  icon_uri_animated: %s,\n  display_name: %s,\n  display_order: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c), String.valueOf(this.d), String.valueOf(this.e), String.valueOf(this.f), String.valueOf(this.g));
    }

    @Override // defpackage.dtro
    public final void b(ContentValues contentValues) {
        dtub.u(contentValues, "sticker_set_id", this.b);
        dtub.u(contentValues, "sticker_id", this.c);
        dtub.u(contentValues, "icon_uri_static", this.d);
        dtub.u(contentValues, "icon_uri_animated", this.e);
        dtub.u(contentValues, "display_name", this.f);
        contentValues.put("display_order", Integer.valueOf(this.g));
    }

    @Override // defpackage.dtro
    protected final /* bridge */ /* synthetic */ void c(dtsu dtsuVar) {
        bydw bydwVar = (bydw) ((bydo) dtsuVar);
        aB();
        this.cL = bydwVar.cU();
        if (bydwVar.di(0)) {
            this.a = bydwVar.e();
            fY(0);
        }
        if (bydwVar.di(1)) {
            this.b = bydwVar.j();
            fY(1);
        }
        if (bydwVar.di(2)) {
            this.c = bydwVar.i();
            fY(2);
        }
        if (bydwVar.di(3)) {
            this.d = bydwVar.h();
            fY(3);
        }
        if (bydwVar.di(4)) {
            this.e = bydwVar.g();
            fY(4);
        }
        if (bydwVar.di(5)) {
            this.f = bydwVar.f();
            fY(5);
        }
        if (bydwVar.di(6)) {
            this.g = bydwVar.c();
            fY(6);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof byct)) {
            return false;
        }
        byct byctVar = (byct) obj;
        return super.aD(byctVar.cL) && this.a == byctVar.a && Objects.equals(this.b, byctVar.b) && Objects.equals(this.c, byctVar.c) && Objects.equals(this.d, byctVar.d) && Objects.equals(this.e, byctVar.e) && Objects.equals(this.f, byctVar.f) && this.g == byctVar.g;
    }

    @Override // defpackage.dtrq
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "stickers", dtub.m(new String[]{"sticker_set_id", "sticker_id", "icon_uri_static", "icon_uri_animated", "display_name", "display_order"}));
    }

    @Override // defpackage.dtrq
    public final String g() {
        return "_id";
    }

    @Override // defpackage.dtrq
    public final String h() {
        return "stickers";
    }

    public final int hashCode() {
        dtsq dtsqVar = this.cL;
        return Objects.hash((dtsqVar == null || dtsqVar.b()) ? null : this.cL, Long.valueOf(this.a), this.b, this.c, this.d, this.e, this.f, Integer.valueOf(this.g), null);
    }

    @Override // defpackage.dtrq
    public final void i(StringBuilder sb, List list) {
        Object[] objArr = {this.b, this.c, this.d, this.e, this.f, Integer.valueOf(this.g)};
        sb.append('(');
        for (int i = 0; i < 6; i++) {
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
        return ((dtro.a) ekhw.a(dtub.b, dtro.a.class)).iB().a() ? String.format(Locale.US, "%s", "StickersTable -- REDACTED") : a();
    }
}
