package defpackage;

import android.content.ContentValues;
import android.database.DatabaseUtils;
import defpackage.dtro;
import j$.util.Objects;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class bxzw extends dtro implements dtrq {
    public long a;
    public String b;
    public String e;
    public String f;
    public String g;
    public String j;
    public int c = -1;
    public int d = 4;
    public long h = -1;
    public int i = 0;

    protected bxzw() {
    }

    @Override // defpackage.dtro
    public final String a() {
        return String.format(Locale.US, "StickerSetsTable [_id: %s,\n  sticker_set_id: %s,\n  local_version: %s,\n  download_state: %s,\n  icon_uri: %s,\n  display_name: %s,\n  preview_image_uri: %s,\n  requested_timestamp: %s,\n  display_order: %s,\n  author: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c), String.valueOf(this.d), String.valueOf(this.e), String.valueOf(this.f), String.valueOf(this.g), String.valueOf(this.h), String.valueOf(this.i), String.valueOf(this.j));
    }

    @Override // defpackage.dtro
    public final void b(ContentValues contentValues) {
        dtub.u(contentValues, "sticker_set_id", this.b);
        contentValues.put("local_version", Integer.valueOf(this.c));
        contentValues.put("download_state", Integer.valueOf(this.d));
        dtub.u(contentValues, "icon_uri", this.e);
        dtub.u(contentValues, "display_name", this.f);
        dtub.u(contentValues, "preview_image_uri", this.g);
        contentValues.put("requested_timestamp", Long.valueOf(this.h));
        contentValues.put("display_order", Integer.valueOf(this.i));
        dtub.u(contentValues, "author", this.j);
    }

    @Override // defpackage.dtro
    protected final /* bridge */ /* synthetic */ void c(dtsu dtsuVar) {
        bybh bybhVar = (bybh) ((byaw) dtsuVar);
        aB();
        this.cL = bybhVar.cU();
        if (bybhVar.di(0)) {
            this.a = bybhVar.g();
            fY(0);
        }
        if (bybhVar.di(1)) {
            this.b = bybhVar.m();
            fY(1);
        }
        if (bybhVar.di(2)) {
            this.c = bybhVar.f();
            fY(2);
        }
        if (bybhVar.di(3)) {
            this.d = bybhVar.e();
            fY(3);
        }
        if (bybhVar.di(4)) {
            this.e = bybhVar.k();
            fY(4);
        }
        if (bybhVar.di(5)) {
            this.f = bybhVar.j();
            fY(5);
        }
        if (bybhVar.di(6)) {
            this.g = bybhVar.l();
            fY(6);
        }
        if (bybhVar.di(7)) {
            this.h = bybhVar.h();
            fY(7);
        }
        if (bybhVar.di(8)) {
            this.i = bybhVar.c();
            fY(8);
        }
        if (bybhVar.di(9)) {
            this.j = bybhVar.i();
            fY(9);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bxzw)) {
            return false;
        }
        bxzw bxzwVar = (bxzw) obj;
        return super.aD(bxzwVar.cL) && this.a == bxzwVar.a && Objects.equals(this.b, bxzwVar.b) && this.c == bxzwVar.c && this.d == bxzwVar.d && Objects.equals(this.e, bxzwVar.e) && Objects.equals(this.f, bxzwVar.f) && Objects.equals(this.g, bxzwVar.g) && this.h == bxzwVar.h && this.i == bxzwVar.i && Objects.equals(this.j, bxzwVar.j);
    }

    @Override // defpackage.dtrq
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "sticker_sets", dtub.m(new String[]{"sticker_set_id", "local_version", "download_state", "icon_uri", "display_name", "preview_image_uri", "requested_timestamp", "display_order", "author"}));
    }

    @Override // defpackage.dtrq
    public final String g() {
        return "_id";
    }

    @Override // defpackage.dtrq
    public final String h() {
        return "sticker_sets";
    }

    public final int hashCode() {
        dtsq dtsqVar = this.cL;
        return Objects.hash((dtsqVar == null || dtsqVar.b()) ? null : this.cL, Long.valueOf(this.a), this.b, Integer.valueOf(this.c), Integer.valueOf(this.d), this.e, this.f, this.g, Long.valueOf(this.h), Integer.valueOf(this.i), this.j, null);
    }

    @Override // defpackage.dtrq
    public final void i(StringBuilder sb, List list) {
        Object[] objArr = {this.b, Integer.valueOf(this.c), Integer.valueOf(this.d), this.e, this.f, this.g, Long.valueOf(this.h), Integer.valueOf(this.i), this.j};
        sb.append('(');
        for (int i = 0; i < 9; i++) {
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
        return ((dtro.a) ekhw.a(dtub.b, dtro.a.class)).iB().a() ? String.format(Locale.US, "%s", "StickerSetsTable -- REDACTED") : a();
    }
}
