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
public class cfmt extends dtro implements dtrq {
    public String a;
    public String b;
    public long c;
    public byte[] d;
    public Instant e = Instant.EPOCH;

    protected cfmt() {
    }

    @Override // defpackage.dtro
    public final String a() {
        Locale locale = Locale.US;
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        byte[] bArr = this.d;
        return String.format(locale, "MlsEpochRecordsTable [identity_id: %s,\n  group_id: %s,\n  epoch_id: %s,\n  epoch_data: %s,\n  creation_timestamp: %s\n]\n", valueOf, valueOf2, valueOf3, "BLOB".concat(String.valueOf(bArr != null ? String.valueOf(bArr.length) : "NULL")), String.valueOf(this.e));
    }

    @Override // defpackage.dtro
    public final void b(ContentValues contentValues) {
        dtub.u(contentValues, "identity_id", this.a);
        dtub.u(contentValues, "group_id", this.b);
        contentValues.put("epoch_id", Long.valueOf(this.c));
        contentValues.put("epoch_data", this.d);
        Instant instant = this.e;
        if (instant == null) {
            contentValues.putNull("creation_timestamp");
        } else {
            contentValues.put("creation_timestamp", Long.valueOf(bdgw.a(instant)));
        }
    }

    @Override // defpackage.dtro
    protected final /* bridge */ /* synthetic */ void c(dtsu dtsuVar) {
        cfnp cfnpVar = (cfnp) ((cfnj) dtsuVar);
        aB();
        this.cL = cfnpVar.cU();
        if (cfnpVar.di(0)) {
            this.a = cfnpVar.g();
            fY(0);
        }
        if (cfnpVar.di(1)) {
            this.b = cfnpVar.f();
            fY(1);
        }
        if (cfnpVar.di(2)) {
            this.c = cfnpVar.c();
            fY(2);
        }
        if (cfnpVar.di(3)) {
            this.d = cfnpVar.h();
            fY(3);
        }
        if (cfnpVar.di(4)) {
            this.e = cfnpVar.e();
            fY(4);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof cfmt)) {
            return false;
        }
        cfmt cfmtVar = (cfmt) obj;
        return super.aD(cfmtVar.cL) && Objects.equals(this.a, cfmtVar.a) && Objects.equals(this.b, cfmtVar.b) && this.c == cfmtVar.c && Arrays.equals(this.d, cfmtVar.d) && Objects.equals(this.e, cfmtVar.e);
    }

    @Override // defpackage.dtrq
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "mls_epoch_records", dtub.m(new String[]{"identity_id", "group_id", "epoch_id", "epoch_data", "creation_timestamp"}));
    }

    @Override // defpackage.dtrq
    public final String g() {
        return null;
    }

    @Override // defpackage.dtrq
    public final String h() {
        return "mls_epoch_records";
    }

    public final int hashCode() {
        dtsq dtsqVar = this.cL;
        return Objects.hash((dtsqVar == null || dtsqVar.b()) ? null : this.cL, this.a, this.b, Long.valueOf(this.c), Integer.valueOf(Arrays.hashCode(this.d)), this.e, null);
    }

    @Override // defpackage.dtrq
    public final void i(StringBuilder sb, List list) {
        Object[] objArr = {this.a, this.b, Long.valueOf(this.c), this.d, Long.valueOf(bdgw.a(this.e))};
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
        return ((dtro.a) ekhw.a(dtub.b, dtro.a.class)).iB().a() ? String.format(Locale.US, "%s", "MlsEpochRecordsTable -- REDACTED") : a();
    }
}
