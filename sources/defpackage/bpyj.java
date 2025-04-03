package defpackage;

import android.content.ContentValues;
import android.net.Uri;
import defpackage.dtro;
import j$.util.Objects;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class bpyj extends dtro {
    public byul a;
    private String b;
    private String c;
    private long d;
    private String e;
    private String f;
    private String g;
    private String h;
    private Uri i;
    private String j;

    protected bpyj() {
    }

    @Override // defpackage.dtro
    public final String a() {
        return String.format(Locale.US, "VerifiedSmsSenderQueriesQuery [verified_sms_senders.verified_sms_senders_sender_id: %s,\n  verified_sms_senders.verified_sms_senders_brand_id: %s,\n  verified_sms_brands.verified_sms_brands__id: %s,\n  verified_sms_brands.verified_sms_brands_brand_id: %s,\n  verified_sms_brands.verified_sms_brands_name: %s,\n  verified_sms_brands.verified_sms_brands_description: %s,\n  verified_sms_brands.verified_sms_brands_logo_url: %s,\n  verified_sms_brands.verified_sms_brands_logo_uri: %s,\n  verified_sms_brands.verified_sms_brands_version_token: %s\n]\n", String.valueOf(this.b), String.valueOf(this.c), String.valueOf(this.d), String.valueOf(this.e), String.valueOf(this.f), String.valueOf(this.g), String.valueOf(this.h), String.valueOf(this.i), String.valueOf(this.j));
    }

    @Override // defpackage.dtro
    protected final /* bridge */ /* synthetic */ void c(dtsu dtsuVar) {
        bpzd bpzdVar = (bpzd) dtsuVar;
        aB();
        this.cL = bpzdVar.cU();
        if (bpzdVar.di(0)) {
            this.b = bpzdVar.getString(bpzdVar.cM(0, bpzi.a));
            fY(0);
        }
        if (bpzdVar.di(1)) {
            this.c = bpzdVar.getString(bpzdVar.cM(1, bpzi.a));
            fY(1);
        }
        if (bpzdVar.di(2)) {
            this.d = bpzdVar.getLong(bpzdVar.cM(2, bpzi.a));
            fY(2);
        }
        if (bpzdVar.di(3)) {
            this.e = bpzdVar.getString(bpzdVar.cM(3, bpzi.a));
            fY(3);
        }
        if (bpzdVar.di(4)) {
            this.f = bpzdVar.getString(bpzdVar.cM(4, bpzi.a));
            fY(4);
        }
        if (bpzdVar.di(5)) {
            this.g = bpzdVar.getString(bpzdVar.cM(5, bpzi.a));
            fY(5);
        }
        if (bpzdVar.di(6)) {
            this.h = bpzdVar.getString(bpzdVar.cM(6, bpzi.a));
            fY(6);
        }
        if (bpzdVar.di(7)) {
            this.i = bpzdVar.c();
            fY(7);
        }
        if (bpzdVar.di(8)) {
            this.j = bpzdVar.getString(bpzdVar.cM(8, bpzi.a));
            fY(8);
        }
        Integer.valueOf(bpzi.a().P().a()).getClass();
        bywg a = byxc.a();
        az(0, "sender_id");
        a.c(this.b);
        az(1, "brand_id");
        a.b(this.c);
        a.a();
        byun a2 = byvy.a();
        az(2, "_id");
        a2.d(this.d);
        az(3, "brand_id");
        a2.b(this.e);
        az(4, "name");
        a2.g(this.f);
        az(5, "description");
        a2.c(this.g);
        az(6, "logo_url");
        a2.f(this.h);
        az(7, "logo_uri");
        a2.e(this.i);
        az(8, "version_token");
        a2.h(this.j);
        this.a = a2.a();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bpyj)) {
            return false;
        }
        bpyj bpyjVar = (bpyj) obj;
        return super.aD(bpyjVar.cL) && Objects.equals(this.b, bpyjVar.b) && Objects.equals(this.c, bpyjVar.c) && this.d == bpyjVar.d && Objects.equals(this.e, bpyjVar.e) && Objects.equals(this.f, bpyjVar.f) && Objects.equals(this.g, bpyjVar.g) && Objects.equals(this.h, bpyjVar.h) && Objects.equals(this.i, bpyjVar.i) && Objects.equals(this.j, bpyjVar.j);
    }

    public final int hashCode() {
        dtsq dtsqVar = this.cL;
        return Objects.hash((dtsqVar == null || dtsqVar.b()) ? null : this.cL, this.b, this.c, Long.valueOf(this.d), this.e, this.f, this.g, this.h, this.i, this.j, null);
    }

    public final String toString() {
        return ((dtro.a) ekhw.a(dtub.b, dtro.a.class)).iB().a() ? String.format(Locale.US, "%s", "VerifiedSmsSenderQueriesQuery -- REDACTED") : a();
    }

    @Override // defpackage.dtro
    public final void b(ContentValues contentValues) {
    }
}
