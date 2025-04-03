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
public class bxeu extends dtro implements dtrq {
    public String a;
    public byte[] f;
    public boolean b = false;
    public boolean c = false;
    public bdhd d = new bdhd(0);
    public Instant e = bdgw.b(0);
    public long g = 0;
    public Instant h = bdgw.b(0);
    public boolean i = false;

    protected bxeu() {
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
        return String.format(locale, "RemoteRegistrationsTable [tachyon_registration_id: %s,\n  etouffee: %s,\n  better_etouffee: %s,\n  messages_feature_hash: %s,\n  last_modified_timestamp: %s,\n  identity_key: %s,\n  updated_at_hash: %s,\n  guaranteed_fresh_as_of_timestamp: %s,\n  is_updated_at_hash_valid: %s\n]\n", valueOf, valueOf2, valueOf3, valueOf4, valueOf5, "BLOB".concat(String.valueOf(bArr != null ? String.valueOf(bArr.length) : "NULL")), String.valueOf(this.g), String.valueOf(this.h), String.valueOf(this.i));
    }

    @Override // defpackage.dtro
    public final void b(ContentValues contentValues) {
        int intValue = bxgl.c().intValue();
        dtub.u(contentValues, "tachyon_registration_id", this.a);
        contentValues.put("etouffee", Boolean.valueOf(this.b));
        if (intValue >= 46000) {
            contentValues.put("better_etouffee", Boolean.valueOf(this.c));
        }
        if (intValue >= 58800) {
            bdhd bdhdVar = this.d;
            if (bdhdVar == null) {
                contentValues.putNull("messages_feature_hash");
            } else {
                contentValues.put("messages_feature_hash", Long.valueOf(bdhdVar.a));
            }
        }
        Instant instant = this.e;
        if (instant == null) {
            contentValues.putNull("last_modified_timestamp");
        } else {
            contentValues.put("last_modified_timestamp", Long.valueOf(bdgw.a(instant)));
        }
        contentValues.put("identity_key", this.f);
        contentValues.put("updated_at_hash", Long.valueOf(this.g));
        Instant instant2 = this.h;
        if (instant2 == null) {
            contentValues.putNull("guaranteed_fresh_as_of_timestamp");
        } else {
            contentValues.put("guaranteed_fresh_as_of_timestamp", Long.valueOf(bdgw.a(instant2)));
        }
        contentValues.put("is_updated_at_hash_valid", Boolean.valueOf(this.i));
    }

    @Override // defpackage.dtro
    protected final /* bridge */ /* synthetic */ void c(dtsu dtsuVar) {
        bxgc bxgcVar = (bxgc) ((bxfs) dtsuVar);
        aB();
        this.cL = bxgcVar.cU();
        if (bxgcVar.di(0)) {
            this.a = bxgcVar.h();
            fY(0);
        }
        if (bxgcVar.di(1)) {
            this.b = bxgcVar.i();
            fY(1);
        }
        if (bxgcVar.di(2)) {
            this.c = bxgcVar.j();
            fY(2);
        }
        if (bxgcVar.di(3)) {
            this.d = bxgcVar.e();
            fY(3);
        }
        if (bxgcVar.di(4)) {
            this.e = bxgcVar.g();
            fY(4);
        }
        if (bxgcVar.di(5)) {
            this.f = bxgcVar.l();
            fY(5);
        }
        if (bxgcVar.di(6)) {
            this.g = bxgcVar.c();
            fY(6);
        }
        if (bxgcVar.di(7)) {
            this.h = bxgcVar.f();
            fY(7);
        }
        if (bxgcVar.di(8)) {
            this.i = bxgcVar.k();
            fY(8);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bxeu)) {
            return false;
        }
        bxeu bxeuVar = (bxeu) obj;
        return super.aD(bxeuVar.cL) && Objects.equals(this.a, bxeuVar.a) && this.b == bxeuVar.b && this.c == bxeuVar.c && Objects.equals(this.d, bxeuVar.d) && Objects.equals(this.e, bxeuVar.e) && Arrays.equals(this.f, bxeuVar.f) && this.g == bxeuVar.g && Objects.equals(this.h, bxeuVar.h) && this.i == bxeuVar.i;
    }

    @Override // defpackage.dtrq
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "remote_registrations_table", dtub.m(new String[]{"tachyon_registration_id", "etouffee", "better_etouffee", "messages_feature_hash", "last_modified_timestamp", "identity_key", "updated_at_hash", "guaranteed_fresh_as_of_timestamp", "is_updated_at_hash_valid"}));
    }

    @Override // defpackage.dtrq
    public final String g() {
        return null;
    }

    @Override // defpackage.dtrq
    public final String h() {
        return "remote_registrations_table";
    }

    public final int hashCode() {
        dtsq dtsqVar = this.cL;
        return Objects.hash((dtsqVar == null || dtsqVar.b()) ? null : this.cL, this.a, Boolean.valueOf(this.b), Boolean.valueOf(this.c), this.d, this.e, Integer.valueOf(Arrays.hashCode(this.f)), Long.valueOf(this.g), this.h, Boolean.valueOf(this.i), null);
    }

    @Override // defpackage.dtrq
    public final void i(StringBuilder sb, List list) {
        Object[] objArr = {this.a, Integer.valueOf(this.b ? 1 : 0), Integer.valueOf(this.c ? 1 : 0), Long.valueOf(this.d.a), Long.valueOf(bdgw.a(this.e)), this.f, Long.valueOf(this.g), Long.valueOf(bdgw.a(this.h)), Integer.valueOf(this.i ? 1 : 0)};
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

    public final Instant k() {
        az(7, "guaranteed_fresh_as_of_timestamp");
        return this.h;
    }

    public final Instant l() {
        az(4, "last_modified_timestamp");
        return this.e;
    }

    public final String m() {
        az(0, "tachyon_registration_id");
        return this.a;
    }

    public final boolean n() {
        az(1, "etouffee");
        return this.b;
    }

    public final boolean o() {
        az(2, "better_etouffee");
        return this.c;
    }

    public final byte[] q() {
        az(5, "identity_key");
        return this.f;
    }

    public final String toString() {
        return ((dtro.a) ekhw.a(dtub.b, dtro.a.class)).iB().a() ? String.format(Locale.US, "%s", "RemoteRegistrationsTable -- REDACTED") : a();
    }
}
