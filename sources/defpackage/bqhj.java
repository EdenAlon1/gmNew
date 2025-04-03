package defpackage;

import android.content.ContentValues;
import android.database.DatabaseUtils;
import defpackage.dtro;
import j$.util.Objects;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class bqhj extends dtro implements dtrq {
    public long a;
    public String b;
    public String c;

    protected bqhj() {
    }

    @Override // defpackage.dtro
    public final String a() {
        return String.format(Locale.US, "CmsBlobsPendingDeleteTable [_id: %s,\n  message_id: %s,\n  blob_id: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c));
    }

    @Override // defpackage.dtro
    public final void b(ContentValues contentValues) {
        dtub.u(contentValues, "message_id", this.b);
        dtub.u(contentValues, "blob_id", this.c);
    }

    @Override // defpackage.dtro
    protected final /* bridge */ /* synthetic */ void c(dtsu dtsuVar) {
        bqhz bqhzVar = (bqhz) ((bqhv) dtsuVar);
        aB();
        this.cL = bqhzVar.cU();
        if (bqhzVar.di(0)) {
            this.a = bqhzVar.e();
            fY(0);
        }
        if (bqhzVar.di(1)) {
            this.b = bqhzVar.f();
            fY(1);
        }
        if (bqhzVar.di(2)) {
            this.c = bqhzVar.c();
            fY(2);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bqhj)) {
            return false;
        }
        bqhj bqhjVar = (bqhj) obj;
        return super.aD(bqhjVar.cL) && this.a == bqhjVar.a && Objects.equals(this.b, bqhjVar.b) && Objects.equals(this.c, bqhjVar.c);
    }

    @Override // defpackage.dtrq
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "cms_blobs_pending_delete", dtub.m(new String[]{"message_id", "blob_id"}));
    }

    @Override // defpackage.dtrq
    public final String g() {
        return "_id";
    }

    @Override // defpackage.dtrq
    public final String h() {
        return "cms_blobs_pending_delete";
    }

    public final int hashCode() {
        dtsq dtsqVar = this.cL;
        return Objects.hash((dtsqVar == null || dtsqVar.b()) ? null : this.cL, Long.valueOf(this.a), this.b, this.c, null);
    }

    @Override // defpackage.dtrq
    public final void i(StringBuilder sb, List list) {
        Object[] objArr = {this.b, this.c};
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
        return ((dtro.a) ekhw.a(dtub.b, dtro.a.class)).iB().a() ? String.format(Locale.US, "%s", "CmsBlobsPendingDeleteTable -- REDACTED") : a();
    }
}
