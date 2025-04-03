package defpackage;

import android.content.ContentValues;
import android.database.DatabaseUtils;
import defpackage.dtro;
import j$.util.Objects;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class bqou extends dtro implements dtrq {
    public long a;
    public String b;
    public String c;
    public csfy d;

    protected bqou() {
    }

    @Override // defpackage.dtro
    public final String a() {
        return String.format(Locale.US, "CmsMediaNotificationsTable [_id: %s,\n  message_cms_id: %s,\n  blob_id: %s,\n  blob_type: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c), String.valueOf(this.d));
    }

    @Override // defpackage.dtro
    public final void b(ContentValues contentValues) {
        dtub.u(contentValues, "message_cms_id", this.b);
        dtub.u(contentValues, "blob_id", this.c);
        csfy csfyVar = this.d;
        if (csfyVar == null) {
            contentValues.putNull("blob_type");
        } else {
            contentValues.put("blob_type", Integer.valueOf(csfyVar.ordinal()));
        }
    }

    @Override // defpackage.dtro
    protected final /* bridge */ /* synthetic */ void c(dtsu dtsuVar) {
        bqpn bqpnVar = (bqpn) ((bqpi) dtsuVar);
        aB();
        this.cL = bqpnVar.cU();
        if (bqpnVar.di(0)) {
            this.a = bqpnVar.f();
            fY(0);
        }
        if (bqpnVar.di(1)) {
            this.b = bqpnVar.g();
            fY(1);
        }
        if (bqpnVar.di(2)) {
            this.c = bqpnVar.e();
            fY(2);
        }
        if (bqpnVar.di(3)) {
            this.d = bqpnVar.c();
            fY(3);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bqou)) {
            return false;
        }
        bqou bqouVar = (bqou) obj;
        return super.aD(bqouVar.cL) && this.a == bqouVar.a && Objects.equals(this.b, bqouVar.b) && Objects.equals(this.c, bqouVar.c) && this.d == bqouVar.d;
    }

    @Override // defpackage.dtrq
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "cms_media_notifications", dtub.m(new String[]{"message_cms_id", "blob_id", "blob_type"}));
    }

    @Override // defpackage.dtrq
    public final String g() {
        return "_id";
    }

    @Override // defpackage.dtrq
    public final String h() {
        return "cms_media_notifications";
    }

    public final int hashCode() {
        dtsq dtsqVar = this.cL;
        dtsq dtsqVar2 = (dtsqVar == null || dtsqVar.b()) ? null : this.cL;
        Long valueOf = Long.valueOf(this.a);
        String str = this.b;
        String str2 = this.c;
        csfy csfyVar = this.d;
        return Objects.hash(dtsqVar2, valueOf, str, str2, Integer.valueOf(csfyVar == null ? 0 : csfyVar.ordinal()), null);
    }

    @Override // defpackage.dtrq
    public final void i(StringBuilder sb, List list) {
        String str = this.b;
        String str2 = this.c;
        csfy csfyVar = this.d;
        Object[] objArr = {str, str2, csfyVar == null ? 0 : String.valueOf(csfyVar.ordinal())};
        sb.append('(');
        for (int i = 0; i < 3; i++) {
            Object obj = objArr[i];
            if (obj instanceof Number) {
                sb.append(String.valueOf(obj));
            } else {
                if (obj instanceof String) {
                    String str3 = (String) obj;
                    if (str3.length() < 12) {
                        sb.append(DatabaseUtils.sqlEscapeString(str3));
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
        return ((dtro.a) ekhw.a(dtub.b, dtro.a.class)).iB().a() ? String.format(Locale.US, "%s", "CmsMediaNotificationsTable -- REDACTED") : a();
    }
}
