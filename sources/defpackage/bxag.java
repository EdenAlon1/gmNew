package defpackage;

import android.content.ContentValues;
import android.database.DatabaseUtils;
import defpackage.dtro;
import j$.util.Objects;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class bxag extends dtro implements dtrq {
    public long a;
    public String b;
    public long c = 0;

    protected bxag() {
    }

    @Override // defpackage.dtro
    public final String a() {
        return String.format(Locale.US, "RecentStickersTable [_id: %s,\n  sticker_id: %s,\n  last_used_timestamp: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c));
    }

    @Override // defpackage.dtro
    public final void b(ContentValues contentValues) {
        dtub.u(contentValues, "sticker_id", this.b);
        contentValues.put("last_used_timestamp", Long.valueOf(this.c));
    }

    @Override // defpackage.dtro
    protected final /* bridge */ /* synthetic */ void c(dtsu dtsuVar) {
        bxaw bxawVar = (bxaw) ((bxas) dtsuVar);
        aB();
        this.cL = bxawVar.cU();
        if (bxawVar.di(0)) {
            this.a = bxawVar.c();
            fY(0);
        }
        if (bxawVar.di(1)) {
            this.b = bxawVar.f();
            fY(1);
        }
        if (bxawVar.di(2)) {
            this.c = bxawVar.e();
            fY(2);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bxag)) {
            return false;
        }
        bxag bxagVar = (bxag) obj;
        return super.aD(bxagVar.cL) && this.a == bxagVar.a && Objects.equals(this.b, bxagVar.b) && this.c == bxagVar.c;
    }

    @Override // defpackage.dtrq
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "recent_stickers", dtub.m(new String[]{"sticker_id", "last_used_timestamp"}));
    }

    @Override // defpackage.dtrq
    public final String g() {
        return "_id";
    }

    @Override // defpackage.dtrq
    public final String h() {
        return "recent_stickers";
    }

    public final int hashCode() {
        dtsq dtsqVar = this.cL;
        return Objects.hash((dtsqVar == null || dtsqVar.b()) ? null : this.cL, Long.valueOf(this.a), this.b, Long.valueOf(this.c), null);
    }

    @Override // defpackage.dtrq
    public final void i(StringBuilder sb, List list) {
        Object[] objArr = {this.b, Long.valueOf(this.c)};
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

    public final String toString() {
        return ((dtro.a) ekhw.a(dtub.b, dtro.a.class)).iB().a() ? String.format(Locale.US, "%s", "RecentStickersTable -- REDACTED") : a();
    }
}
