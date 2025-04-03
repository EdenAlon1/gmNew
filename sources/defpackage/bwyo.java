package defpackage;

import android.content.ContentValues;
import android.database.DatabaseUtils;
import android.net.Uri;
import defpackage.dtro;
import j$.util.Objects;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class bwyo extends dtro implements dtrq {
    public Uri a;
    public Uri b;
    public String c;
    public String d;
    public int e;
    public int f;
    public long g;

    protected bwyo() {
    }

    @Override // defpackage.dtro
    public final String a() {
        return String.format(Locale.US, "RecentGifsTable [original_image_url: %s,\n  content_uri: %s,\n  domain: %s,\n  image_search_url: %s,\n  width: %s,\n  height: %s,\n  last_used_timestamp: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c), String.valueOf(this.d), String.valueOf(this.e), String.valueOf(this.f), String.valueOf(this.g));
    }

    @Override // defpackage.dtro
    public final void b(ContentValues contentValues) {
        Uri uri = this.a;
        if (uri == null) {
            contentValues.putNull("original_image_url");
        } else {
            contentValues.put("original_image_url", uri.toString());
        }
        Uri uri2 = this.b;
        if (uri2 == null) {
            contentValues.putNull("content_uri");
        } else {
            contentValues.put("content_uri", uri2.toString());
        }
        dtub.u(contentValues, "domain", this.c);
        dtub.u(contentValues, "image_search_url", this.d);
        contentValues.put("width", Integer.valueOf(this.e));
        contentValues.put("height", Integer.valueOf(this.f));
        contentValues.put("last_used_timestamp", Long.valueOf(this.g));
    }

    @Override // defpackage.dtro
    protected final /* bridge */ /* synthetic */ void c(dtsu dtsuVar) {
        bwzq bwzqVar = (bwzq) ((bwzi) dtsuVar);
        aB();
        this.cL = bwzqVar.cU();
        if (bwzqVar.di(0)) {
            this.a = bwzqVar.h();
            fY(0);
        }
        if (bwzqVar.di(1)) {
            this.b = bwzqVar.g();
            fY(1);
        }
        if (bwzqVar.di(2)) {
            this.c = bwzqVar.i();
            fY(2);
        }
        if (bwzqVar.di(3)) {
            this.d = bwzqVar.j();
            fY(3);
        }
        if (bwzqVar.di(4)) {
            this.e = bwzqVar.e();
            fY(4);
        }
        if (bwzqVar.di(5)) {
            this.f = bwzqVar.c();
            fY(5);
        }
        if (bwzqVar.di(6)) {
            this.g = bwzqVar.f();
            fY(6);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bwyo)) {
            return false;
        }
        bwyo bwyoVar = (bwyo) obj;
        return super.aD(bwyoVar.cL) && Objects.equals(this.a, bwyoVar.a) && Objects.equals(this.b, bwyoVar.b) && Objects.equals(this.c, bwyoVar.c) && Objects.equals(this.d, bwyoVar.d) && this.e == bwyoVar.e && this.f == bwyoVar.f && this.g == bwyoVar.g;
    }

    @Override // defpackage.dtrq
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "recent_gifs", dtub.m(new String[]{"original_image_url", "content_uri", "domain", "image_search_url", "width", "height", "last_used_timestamp"}));
    }

    @Override // defpackage.dtrq
    public final String g() {
        return null;
    }

    @Override // defpackage.dtrq
    public final String h() {
        return "recent_gifs";
    }

    public final int hashCode() {
        dtsq dtsqVar = this.cL;
        return Objects.hash((dtsqVar == null || dtsqVar.b()) ? null : this.cL, this.a, this.b, this.c, this.d, Integer.valueOf(this.e), Integer.valueOf(this.f), Long.valueOf(this.g), null);
    }

    @Override // defpackage.dtrq
    public final void i(StringBuilder sb, List list) {
        Uri uri = this.a;
        String uri2 = uri == null ? null : uri.toString();
        Uri uri3 = this.b;
        Object[] objArr = {uri2, uri3 != null ? uri3.toString() : null, this.c, this.d, Integer.valueOf(this.e), Integer.valueOf(this.f), Long.valueOf(this.g)};
        sb.append('(');
        for (int i = 0; i < 7; i++) {
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

    public final Uri k() {
        az(1, "content_uri");
        return this.b;
    }

    public final Uri l() {
        az(0, "original_image_url");
        return this.a;
    }

    public final String m() {
        az(2, "domain");
        return this.c;
    }

    public final String n() {
        az(3, "image_search_url");
        return this.d;
    }

    public final String toString() {
        return ((dtro.a) ekhw.a(dtub.b, dtro.a.class)).iB().a() ? String.format(Locale.US, "%s", "RecentGifsTable -- REDACTED") : a();
    }
}
