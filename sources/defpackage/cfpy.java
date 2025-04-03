package defpackage;

import android.content.ContentValues;
import android.database.DatabaseUtils;
import defpackage.dtro;
import j$.time.Instant;
import j$.util.Objects;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class cfpy extends dtro implements dtrq {
    public String a;
    public String c;
    public byte[] d;
    public cfsg e;
    public bdhg b = bdhg.a;
    public Instant f = Instant.EPOCH;

    protected cfpy() {
    }

    @Override // defpackage.dtro
    public final String a() {
        Locale locale = Locale.US;
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        byte[] bArr = this.d;
        return String.format(locale, "MlsProcessedResultsTable [self_identity: %s,\n  rcs_message_id: %s,\n  remote_user_id: %s,\n  raw_content: %s,\n  stage: %s,\n  sort_timestamp: %s\n]\n", valueOf, valueOf2, valueOf3, "BLOB".concat(String.valueOf(bArr != null ? String.valueOf(bArr.length) : "NULL")), String.valueOf(this.e), String.valueOf(this.f));
    }

    @Override // defpackage.dtro
    public final void b(ContentValues contentValues) {
        dtub.u(contentValues, "self_identity", this.a);
        bdhg bdhgVar = this.b;
        if (bdhgVar == null) {
            contentValues.putNull("rcs_message_id");
        } else {
            contentValues.put("rcs_message_id", bdhg.d(bdhgVar));
        }
        dtub.u(contentValues, "remote_user_id", this.c);
        contentValues.put("raw_content", this.d);
        cfsg cfsgVar = this.e;
        if (cfsgVar == null) {
            contentValues.putNull("stage");
        } else {
            contentValues.put("stage", Integer.valueOf(cfsgVar.ordinal()));
        }
        Instant instant = this.f;
        if (instant == null) {
            contentValues.putNull("sort_timestamp");
        } else {
            contentValues.put("sort_timestamp", Long.valueOf(bdgw.a(instant)));
        }
    }

    @Override // defpackage.dtro
    protected final /* bridge */ /* synthetic */ void c(dtsu dtsuVar) {
        cfqx cfqxVar = (cfqx) ((cfqq) dtsuVar);
        aB();
        this.cL = cfqxVar.cU();
        if (cfqxVar.di(0)) {
            this.a = cfqxVar.h();
            fY(0);
        }
        if (cfqxVar.di(1)) {
            this.b = cfqxVar.c();
            fY(1);
        }
        if (cfqxVar.di(2)) {
            this.c = cfqxVar.g();
            fY(2);
        }
        if (cfqxVar.di(3)) {
            this.d = cfqxVar.i();
            fY(3);
        }
        if (cfqxVar.di(4)) {
            this.e = cfqxVar.e();
            fY(4);
        }
        if (cfqxVar.di(5)) {
            this.f = cfqxVar.f();
            fY(5);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof cfpy)) {
            return false;
        }
        cfpy cfpyVar = (cfpy) obj;
        return super.aD(cfpyVar.cL) && Objects.equals(this.a, cfpyVar.a) && Objects.equals(this.b, cfpyVar.b) && Objects.equals(this.c, cfpyVar.c) && Arrays.equals(this.d, cfpyVar.d) && this.e == cfpyVar.e && Objects.equals(this.f, cfpyVar.f);
    }

    @Override // defpackage.dtrq
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "mls_processed_results", dtub.m(new String[]{"self_identity", "rcs_message_id", "remote_user_id", "raw_content", "stage", "sort_timestamp"}));
    }

    @Override // defpackage.dtrq
    public final String g() {
        return null;
    }

    @Override // defpackage.dtrq
    public final String h() {
        return "mls_processed_results";
    }

    public final int hashCode() {
        dtsq dtsqVar = this.cL;
        dtsq dtsqVar2 = (dtsqVar == null || dtsqVar.b()) ? null : this.cL;
        String str = this.a;
        bdhg bdhgVar = this.b;
        String str2 = this.c;
        Integer valueOf = Integer.valueOf(Arrays.hashCode(this.d));
        cfsg cfsgVar = this.e;
        return Objects.hash(dtsqVar2, str, bdhgVar, str2, valueOf, Integer.valueOf(cfsgVar == null ? 0 : cfsgVar.ordinal()), this.f, null);
    }

    @Override // defpackage.dtrq
    public final void i(StringBuilder sb, List list) {
        String str = this.a;
        String d = bdhg.d(this.b);
        String str2 = this.c;
        byte[] bArr = this.d;
        cfsg cfsgVar = this.e;
        Object[] objArr = {str, d, str2, bArr, cfsgVar == null ? 0 : String.valueOf(cfsgVar.ordinal()), Long.valueOf(bdgw.a(this.f))};
        sb.append('(');
        for (int i = 0; i < 6; i++) {
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
        return ((dtro.a) ekhw.a(dtub.b, dtro.a.class)).iB().a() ? String.format(Locale.US, "%s", "MlsProcessedResultsTable -- REDACTED") : a();
    }
}
