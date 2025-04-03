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
public class bxcw extends dtro implements dtrq {
    public String a;
    public String b;
    public String d;
    public byte[] f;
    public boolean c = false;
    public Instant e = bdgw.b(0);
    public long g = 0;
    public Instant h = bdgw.b(0);
    public boolean i = false;

    protected bxcw() {
    }

    @Override // defpackage.dtro
    public final String a() {
        Locale locale = Locale.US;
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        String valueOf4 = String.valueOf(this.d);
        String valueOf5 = String.valueOf(this.e);
        byte[] bArr = this.f;
        return String.format(locale, "RemoteInstancesTable [_id: %s,\n  remote_instance_id: %s,\n  etouffee: %s,\n  tachyon_id: %s,\n  last_modified_timestamp: %s,\n  identity_key: %s,\n  updated_at_hash: %s,\n  guaranteed_fresh_as_of_timestamp: %s,\n  is_updated_at_hash_valid: %s\n]\n", valueOf, valueOf2, valueOf3, valueOf4, valueOf5, "BLOB".concat(String.valueOf(bArr != null ? String.valueOf(bArr.length) : "NULL")), String.valueOf(this.g), String.valueOf(this.h), String.valueOf(this.i));
    }

    @Override // defpackage.dtro
    public final void b(ContentValues contentValues) {
        int intValue = bxen.c().intValue();
        dtub.u(contentValues, "remote_instance_id", this.b);
        contentValues.put("etouffee", Boolean.valueOf(this.c));
        dtub.u(contentValues, "tachyon_id", this.d);
        if (intValue >= 35040) {
            Instant instant = this.e;
            if (instant == null) {
                contentValues.putNull("last_modified_timestamp");
            } else {
                contentValues.put("last_modified_timestamp", Long.valueOf(bdgw.a(instant)));
            }
        }
        if (intValue >= 38010) {
            contentValues.put("identity_key", this.f);
        }
        if (intValue >= 39040) {
            contentValues.put("updated_at_hash", Long.valueOf(this.g));
        }
        if (intValue >= 40010) {
            Instant instant2 = this.h;
            if (instant2 == null) {
                contentValues.putNull("guaranteed_fresh_as_of_timestamp");
            } else {
                contentValues.put("guaranteed_fresh_as_of_timestamp", Long.valueOf(bdgw.a(instant2)));
            }
        }
        if (intValue >= 40030) {
            contentValues.put("is_updated_at_hash_valid", Boolean.valueOf(this.i));
        }
    }

    @Override // defpackage.dtro
    protected final /* bridge */ /* synthetic */ void c(dtsu dtsuVar) {
        bxee bxeeVar = (bxee) ((bxdu) dtsuVar);
        aB();
        this.cL = bxeeVar.cU();
        if (bxeeVar.di(0)) {
            this.a = bxeeVar.l();
            fY(0);
        }
        if (bxeeVar.di(1)) {
            this.b = bxeeVar.g();
            fY(1);
        }
        if (bxeeVar.di(2)) {
            this.c = bxeeVar.i();
            fY(2);
        }
        if (bxeeVar.di(3)) {
            this.d = bxeeVar.h();
            fY(3);
        }
        if (bxeeVar.di(4)) {
            this.e = bxeeVar.f();
            fY(4);
        }
        if (bxeeVar.di(5)) {
            this.f = bxeeVar.k();
            fY(5);
        }
        if (bxeeVar.di(6)) {
            this.g = bxeeVar.c();
            fY(6);
        }
        if (bxeeVar.di(7)) {
            this.h = bxeeVar.e();
            fY(7);
        }
        if (bxeeVar.di(8)) {
            this.i = bxeeVar.j();
            fY(8);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bxcw)) {
            return false;
        }
        bxcw bxcwVar = (bxcw) obj;
        return super.aD(bxcwVar.cL) && Objects.equals(this.a, bxcwVar.a) && Objects.equals(this.b, bxcwVar.b) && this.c == bxcwVar.c && Objects.equals(this.d, bxcwVar.d) && Objects.equals(this.e, bxcwVar.e) && Arrays.equals(this.f, bxcwVar.f) && this.g == bxcwVar.g && Objects.equals(this.h, bxcwVar.h) && this.i == bxcwVar.i;
    }

    @Override // defpackage.dtrq
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "remote_instances", dtub.m(new String[]{"remote_instance_id", "etouffee", "tachyon_id", "last_modified_timestamp", "identity_key", "updated_at_hash", "guaranteed_fresh_as_of_timestamp", "is_updated_at_hash_valid"}));
    }

    @Override // defpackage.dtrq
    public final String g() {
        return "_id";
    }

    @Override // defpackage.dtrq
    public final String h() {
        return "remote_instances";
    }

    public final int hashCode() {
        dtsq dtsqVar = this.cL;
        return Objects.hash((dtsqVar == null || dtsqVar.b()) ? null : this.cL, this.a, this.b, Boolean.valueOf(this.c), this.d, this.e, Integer.valueOf(Arrays.hashCode(this.f)), Long.valueOf(this.g), this.h, Boolean.valueOf(this.i), null);
    }

    @Override // defpackage.dtrq
    public final void i(StringBuilder sb, List list) {
        Object[] objArr = {this.b, Integer.valueOf(this.c ? 1 : 0), this.d, Long.valueOf(bdgw.a(this.e)), this.f, Long.valueOf(this.g), Long.valueOf(bdgw.a(this.h)), Integer.valueOf(this.i ? 1 : 0)};
        sb.append('(');
        for (int i = 0; i < 8; i++) {
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
        return ((dtro.a) ekhw.a(dtub.b, dtro.a.class)).iB().a() ? String.format(Locale.US, "%s", "RemoteInstancesTable -- REDACTED") : a();
    }
}
