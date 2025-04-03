package defpackage;

import android.content.ContentValues;
import android.database.DatabaseUtils;
import android.net.Uri;
import defpackage.dtro;
import j$.time.Instant;
import j$.util.Objects;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class bqwx extends dtro<bqyp, bqzq, bqzs, bqwx, bqyo> implements dtrq<Long> {
    public long a;
    public long b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public Uri h;
    public Uri i;
    public String j;
    public String k;
    public Instant l = Instant.EPOCH;
    public String m;
    public String n;
    public long o;
    public long p;
    public String q;
    public String r;
    public String s;

    protected bqwx() {
    }

    @Override // defpackage.dtro
    public final String a() {
        return String.format(Locale.US, "ContactsTable [cp2_id: %s,\n  contact_id: %s,\n  lookup_key: %s,\n  phone_number: %s,\n  display_name: %s,\n  given_name: %s,\n  family_name: %s,\n  photo: %s,\n  thumbnail: %s,\n  birthday: %s,\n  anniversary: %s,\n  last_updated_timestamp: %s,\n  sort_key: %s,\n  phonebook_label: %s,\n  phonebook_bucket: %s,\n  contact_type: %s,\n  type_label: %s,\n  display_destination: %s,\n  contact_fingerprint: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c), String.valueOf(this.d), String.valueOf(this.e), String.valueOf(this.f), String.valueOf(this.g), String.valueOf(this.h), String.valueOf(this.i), String.valueOf(this.j), String.valueOf(this.k), String.valueOf(this.l), String.valueOf(this.m), String.valueOf(this.n), String.valueOf(this.o), String.valueOf(this.p), String.valueOf(this.q), String.valueOf(this.r), String.valueOf(this.s));
    }

    @Override // defpackage.dtro
    public final void b(ContentValues contentValues) {
        int intValue = bqzv.c().intValue();
        dtub.t(contentValues, "cp2_id", this.a);
        contentValues.put("contact_id", Long.valueOf(this.b));
        dtub.u(contentValues, "lookup_key", this.c);
        dtub.u(contentValues, "phone_number", this.d);
        dtub.u(contentValues, "display_name", this.e);
        dtub.u(contentValues, "given_name", this.f);
        dtub.u(contentValues, "family_name", this.g);
        Uri uri = this.h;
        if (uri == null) {
            contentValues.putNull("photo");
        } else {
            contentValues.put("photo", uri.toString());
        }
        Uri uri2 = this.i;
        if (uri2 == null) {
            contentValues.putNull("thumbnail");
        } else {
            contentValues.put("thumbnail", uri2.toString());
        }
        dtub.u(contentValues, "birthday", this.j);
        dtub.u(contentValues, "anniversary", this.k);
        Instant instant = this.l;
        if (instant == null) {
            contentValues.putNull("last_updated_timestamp");
        } else {
            contentValues.put("last_updated_timestamp", Long.valueOf(bdgw.a(instant)));
        }
        if (intValue >= 59070) {
            dtub.u(contentValues, "sort_key", this.m);
        }
        if (intValue >= 59070) {
            dtub.u(contentValues, "phonebook_label", this.n);
        }
        if (intValue >= 59070) {
            contentValues.put("phonebook_bucket", Long.valueOf(this.o));
        }
        if (intValue >= 59080) {
            contentValues.put("contact_type", Long.valueOf(this.p));
        }
        if (intValue >= 60150) {
            dtub.u(contentValues, "type_label", this.q);
        }
        if (intValue >= 59120) {
            dtub.u(contentValues, "display_destination", this.r);
        }
        if (intValue >= 60690) {
            dtub.u(contentValues, "contact_fingerprint", this.s);
        }
    }

    @Override // defpackage.dtro
    protected final /* bridge */ /* synthetic */ void c(dtsu dtsuVar) {
        bqzj bqzjVar = (bqzj) ((bqyp) dtsuVar);
        aB();
        this.cL = bqzjVar.cU();
        if (bqzjVar.di(0)) {
            this.a = bqzjVar.j();
            fY(0);
        }
        if (bqzjVar.di(1)) {
            this.b = bqzjVar.c();
            fY(1);
        }
        if (bqzjVar.di(2)) {
            this.c = bqzjVar.g();
            fY(2);
        }
        if (bqzjVar.di(3)) {
            this.d = bqzjVar.t();
            fY(3);
        }
        if (bqzjVar.di(4)) {
            this.e = bqzjVar.f();
            fY(4);
        }
        if (bqzjVar.di(5)) {
            this.f = bqzjVar.s();
            fY(5);
        }
        if (bqzjVar.di(6)) {
            this.g = bqzjVar.r();
            fY(6);
        }
        if (bqzjVar.di(7)) {
            this.h = bqzjVar.e();
            fY(7);
        }
        if (bqzjVar.di(8)) {
            this.i = bqzjVar.l();
            fY(8);
        }
        if (bqzjVar.di(9)) {
            this.j = bqzjVar.o();
            fY(9);
        }
        if (bqzjVar.di(10)) {
            this.k = bqzjVar.n();
            fY(10);
        }
        if (bqzjVar.di(11)) {
            this.l = bqzjVar.m();
            fY(11);
        }
        if (bqzjVar.di(12)) {
            this.m = bqzjVar.u();
            fY(12);
        }
        if (bqzjVar.di(13)) {
            this.n = bqzjVar.h();
            fY(13);
        }
        if (bqzjVar.di(14)) {
            this.o = bqzjVar.k();
            fY(14);
        }
        if (bqzjVar.di(15)) {
            this.p = bqzjVar.i();
            fY(15);
        }
        if (bqzjVar.di(16)) {
            this.q = bqzjVar.v();
            fY(16);
        }
        if (bqzjVar.di(17)) {
            this.r = bqzjVar.q();
            fY(17);
        }
        if (bqzjVar.di(18)) {
            this.s = bqzjVar.p();
            fY(18);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bqwx)) {
            return false;
        }
        bqwx bqwxVar = (bqwx) obj;
        return super.aD(bqwxVar.cL) && this.a == bqwxVar.a && this.b == bqwxVar.b && Objects.equals(this.c, bqwxVar.c) && Objects.equals(this.d, bqwxVar.d) && Objects.equals(this.e, bqwxVar.e) && Objects.equals(this.f, bqwxVar.f) && Objects.equals(this.g, bqwxVar.g) && Objects.equals(this.h, bqwxVar.h) && Objects.equals(this.i, bqwxVar.i) && Objects.equals(this.j, bqwxVar.j) && Objects.equals(this.k, bqwxVar.k) && Objects.equals(this.l, bqwxVar.l) && Objects.equals(this.m, bqwxVar.m) && Objects.equals(this.n, bqwxVar.n) && this.o == bqwxVar.o && this.p == bqwxVar.p && Objects.equals(this.q, bqwxVar.q) && Objects.equals(this.r, bqwxVar.r) && Objects.equals(this.s, bqwxVar.s);
    }

    @Override // defpackage.dtrq
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "contacts", dtub.m(new String[]{"cp2_id", "contact_id", "lookup_key", "phone_number", "display_name", "given_name", "family_name", "photo", "thumbnail", "birthday", "anniversary", "last_updated_timestamp", "sort_key", "phonebook_label", "phonebook_bucket", "contact_type", "type_label", "display_destination", "contact_fingerprint"}));
    }

    @Override // defpackage.dtrq
    public final String g() {
        return null;
    }

    @Override // defpackage.dtrq
    public final String h() {
        return "contacts";
    }

    public final int hashCode() {
        dtsq dtsqVar = this.cL;
        return Objects.hash((dtsqVar == null || dtsqVar.b()) ? null : this.cL, Long.valueOf(this.a), Long.valueOf(this.b), this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, Long.valueOf(this.o), Long.valueOf(this.p), this.q, this.r, this.s, null);
    }

    @Override // defpackage.dtrq
    public final void i(StringBuilder sb, List list) {
        Long valueOf = Long.valueOf(this.a);
        Long valueOf2 = Long.valueOf(this.b);
        String str = this.c;
        String str2 = this.d;
        String str3 = this.e;
        String str4 = this.f;
        String str5 = this.g;
        Uri uri = this.h;
        String uri2 = uri == null ? null : uri.toString();
        Uri uri3 = this.i;
        Object[] objArr = {valueOf, valueOf2, str, str2, str3, str4, str5, uri2, uri3 != null ? uri3.toString() : null, this.j, this.k, Long.valueOf(bdgw.a(this.l)), this.m, this.n, Long.valueOf(this.o), Long.valueOf(this.p), this.q, this.r, this.s};
        sb.append('(');
        for (int i = 0; i < 19; i++) {
            Object obj = objArr[i];
            if (obj instanceof Number) {
                sb.append(String.valueOf(obj));
            } else {
                if (obj instanceof String) {
                    String str6 = (String) obj;
                    if (str6.length() < 12) {
                        sb.append(DatabaseUtils.sqlEscapeString(str6));
                    }
                }
                list.add(obj);
                sb.append('?');
                sb.append(',');
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
        az(7, "photo");
        return this.h;
    }

    public final String toString() {
        return ((dtro.a) ekhw.a(dtub.b, dtro.a.class)).iB().a() ? String.format(Locale.US, "%s", "ContactsTable -- REDACTED") : a();
    }
}
