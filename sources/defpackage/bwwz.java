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
public class bwwz extends dtro implements dtrq {
    public String a;
    public Uri b;
    public String c;
    public int d;
    public int e;
    public long f;

    protected bwwz() {
    }

    @Override // defpackage.dtro
    public final String a() {
        return String.format(Locale.US, "RecentExpressiveStickersTable [name: %s,\n  content_uri: %s,\n  content_type: %s,\n  width: %s,\n  height: %s,\n  last_used_timestamp: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c), String.valueOf(this.d), String.valueOf(this.e), String.valueOf(this.f));
    }

    @Override // defpackage.dtro
    public final void b(ContentValues contentValues) {
        dtub.u(contentValues, "name", this.a);
        Uri uri = this.b;
        if (uri == null) {
            contentValues.putNull("content_uri");
        } else {
            contentValues.put("content_uri", uri.toString());
        }
        dtub.u(contentValues, "content_type", this.c);
        contentValues.put("width", Integer.valueOf(this.d));
        contentValues.put("height", Integer.valueOf(this.e));
        contentValues.put("last_used_timestamp", Long.valueOf(this.f));
    }

    @Override // defpackage.dtro
    protected final /* bridge */ /* synthetic */ void c(dtsu dtsuVar) {
        bwxy bwxyVar = (bwxy) ((bwxr) dtsuVar);
        aB();
        this.cL = bwxyVar.cU();
        if (bwxyVar.di(0)) {
            this.a = bwxyVar.i();
            fY(0);
        }
        if (bwxyVar.di(1)) {
            this.b = bwxyVar.g();
            fY(1);
        }
        if (bwxyVar.di(2)) {
            this.c = bwxyVar.h();
            fY(2);
        }
        if (bwxyVar.di(3)) {
            this.d = bwxyVar.e();
            fY(3);
        }
        if (bwxyVar.di(4)) {
            this.e = bwxyVar.c();
            fY(4);
        }
        if (bwxyVar.di(5)) {
            this.f = bwxyVar.f();
            fY(5);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bwwz)) {
            return false;
        }
        bwwz bwwzVar = (bwwz) obj;
        return super.aD(bwwzVar.cL) && Objects.equals(this.a, bwwzVar.a) && Objects.equals(this.b, bwwzVar.b) && Objects.equals(this.c, bwwzVar.c) && this.d == bwwzVar.d && this.e == bwwzVar.e && this.f == bwwzVar.f;
    }

    @Override // defpackage.dtrq
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "recent_expressive_stickers", dtub.m(new String[]{"name", "content_uri", "content_type", "width", "height", "last_used_timestamp"}));
    }

    @Override // defpackage.dtrq
    public final String g() {
        return null;
    }

    @Override // defpackage.dtrq
    public final String h() {
        return "recent_expressive_stickers";
    }

    public final int hashCode() {
        dtsq dtsqVar = this.cL;
        return Objects.hash((dtsqVar == null || dtsqVar.b()) ? null : this.cL, this.a, this.b, this.c, Integer.valueOf(this.d), Integer.valueOf(this.e), Long.valueOf(this.f), null);
    }

    @Override // defpackage.dtrq
    public final void i(StringBuilder sb, List list) {
        String str = this.a;
        Uri uri = this.b;
        Object[] objArr = {str, uri == null ? null : uri.toString(), this.c, Integer.valueOf(this.d), Integer.valueOf(this.e), Long.valueOf(this.f)};
        sb.append('(');
        for (int i = 0; i < 6; i++) {
            Object obj = objArr[i];
            if (obj instanceof Number) {
                sb.append(String.valueOf(obj));
            } else {
                if (obj instanceof String) {
                    String str2 = (String) obj;
                    if (str2.length() < 12) {
                        sb.append(DatabaseUtils.sqlEscapeString(str2));
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

    public final int k() {
        az(4, "height");
        return this.e;
    }

    public final int l() {
        az(3, "width");
        return this.d;
    }

    public final Uri m() {
        az(1, "content_uri");
        return this.b;
    }

    public final String n() {
        az(2, "content_type");
        return this.c;
    }

    public final String o() {
        az(0, "name");
        return this.a;
    }

    public final String toString() {
        return ((dtro.a) ekhw.a(dtub.b, dtro.a.class)).iB().a() ? String.format(Locale.US, "%s", "RecentExpressiveStickersTable -- REDACTED") : a();
    }
}
