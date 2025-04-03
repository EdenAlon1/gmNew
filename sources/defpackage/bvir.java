package defpackage;

import android.content.ContentValues;
import android.database.DatabaseUtils;
import android.net.Uri;
import defpackage.dtro;
import j$.time.Instant;
import j$.util.Objects;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class bvir extends dtro implements dtrq {
    public int A;
    public String B;
    public int C;
    public int D;
    public String E;
    public boolean F;
    public int G;
    public String H;
    public byzi I;
    public String J;
    public byte[] K;
    public long L;
    public boolean M;
    public boolean N;
    public String O;
    public csgg P;
    public aqkt V;
    public boolean W;
    public String a;
    public long c;
    public String d;
    public int g;
    public int h;
    public String i;
    public String j;
    public String k;
    public String l;
    public String m;
    public long n;
    public String o;
    public String p;
    public String q;
    public Uri r;
    public Uri s;
    public long t;
    public String u;
    public int v;
    public int w;
    public int x;
    public boolean y;
    public String z;
    public Instant b = Instant.EPOCH;
    public azsu e = null;
    public azsu f = null;
    public aorb Q = aorb.b(0);
    public bdpy R = bdpy.a;
    public cjwi S = cjwi.b(0);
    public cjwi T = cjwi.b(0);
    public cjwe U = cjwe.b(0);

    protected bvir() {
    }

    @Override // defpackage.dtro
    public final String a() {
        Locale locale = Locale.US;
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        String valueOf4 = String.valueOf(this.d);
        String valueOf5 = String.valueOf(this.e);
        String valueOf6 = String.valueOf(this.f);
        String valueOf7 = String.valueOf(this.g);
        String valueOf8 = String.valueOf(this.h);
        String valueOf9 = String.valueOf(this.i);
        String valueOf10 = String.valueOf(this.j);
        String valueOf11 = String.valueOf(this.k);
        String valueOf12 = String.valueOf(this.l);
        String valueOf13 = String.valueOf(this.m);
        String valueOf14 = String.valueOf(this.n);
        String valueOf15 = String.valueOf(this.o);
        String valueOf16 = String.valueOf(this.p);
        String valueOf17 = String.valueOf(this.q);
        String valueOf18 = String.valueOf(this.r);
        String valueOf19 = String.valueOf(this.s);
        String valueOf20 = String.valueOf(this.t);
        String valueOf21 = String.valueOf(this.u);
        String valueOf22 = String.valueOf(this.v);
        String valueOf23 = String.valueOf(this.w);
        String valueOf24 = String.valueOf(this.x);
        String valueOf25 = String.valueOf(this.y);
        String valueOf26 = String.valueOf(this.z);
        String valueOf27 = String.valueOf(this.A);
        String valueOf28 = String.valueOf(this.B);
        String valueOf29 = String.valueOf(this.C);
        String valueOf30 = String.valueOf(this.D);
        String valueOf31 = String.valueOf(this.E);
        String valueOf32 = String.valueOf(this.F);
        String valueOf33 = String.valueOf(this.G);
        String valueOf34 = String.valueOf(this.H);
        String valueOf35 = String.valueOf(this.I);
        String valueOf36 = String.valueOf(this.J);
        byte[] bArr = this.K;
        return String.format(locale, "ParticipantsAuditLogTable [_id: %s,\n  operation_datetime: %s,\n  operation_type: %s,\n  participant_id: %s,\n  my_identity_token: %s,\n  my_identity_token_foreign_key: %s,\n  sub_id: %s,\n  sim_slot_id: %s,\n  normalized_destination: %s,\n  send_destination: %s,\n  display_destination: %s,\n  comparable_destination: %s,\n  country_code: %s,\n  recipient_id: %s,\n  recipient_canonical_address: %s,\n  full_name: %s,\n  first_name: %s,\n  profile_photo_uri: %s,\n  contact_photo_uri: %s,\n  contact_id: %s,\n  lookup_key: %s,\n  color_palette_index: %s,\n  color_type: %s,\n  extended_color: %s,\n  blocked: %s,\n  subscription_name: %s,\n  subscription_color: %s,\n  contact_destination: %s,\n  participant_type: %s,\n  video_reachability: %s,\n  alias: %s,\n  is_spam: %s,\n  is_spam_source: %s,\n  cms_id: %s,\n  latest_verification_status: %s,\n  profile_photo_blob_id: %s,\n  profile_photo_encryption_key: %s,\n  directory_id: %s,\n  is_check_constraint_enabled_via_phenotype: %s,\n  is_valid_phone_number_data: %s,\n  duplicate_of: %s,\n  cms_life_cycle: %s,\n  norm_ui_status: %s,\n  last_modified_by_key: %s,\n  name_source: %s,\n  photo_source: %s,\n  profile_photo_user_preference: %s,\n  contact_metadata: %s,\n  is_enterprise_contact: %s\n]\n", valueOf, valueOf2, valueOf3, valueOf4, valueOf5, valueOf6, valueOf7, valueOf8, valueOf9, valueOf10, valueOf11, valueOf12, valueOf13, valueOf14, valueOf15, valueOf16, valueOf17, valueOf18, valueOf19, valueOf20, valueOf21, valueOf22, valueOf23, valueOf24, valueOf25, valueOf26, valueOf27, valueOf28, valueOf29, valueOf30, valueOf31, valueOf32, valueOf33, valueOf34, valueOf35, valueOf36, "BLOB".concat(String.valueOf(bArr != null ? String.valueOf(bArr.length) : "NULL")), String.valueOf(this.L), String.valueOf(this.M), String.valueOf(this.N), String.valueOf(this.O), String.valueOf(this.P), String.valueOf(this.Q), String.valueOf(this.R), String.valueOf(this.S), String.valueOf(this.T), String.valueOf(this.U), String.valueOf(this.V), String.valueOf(this.W));
    }

    @Override // defpackage.dtro
    public final void b(ContentValues contentValues) {
        int intValue = bvoy.c().intValue();
        Instant instant = this.b;
        if (instant == null) {
            contentValues.putNull("operation_datetime");
        } else {
            contentValues.put("operation_datetime", Long.valueOf(bdgw.a(instant)));
        }
        contentValues.put("operation_type", Long.valueOf(this.c));
        dtub.u(contentValues, "participant_id", this.d);
        if (intValue >= 59930) {
            azsu azsuVar = this.e;
            if (azsuVar == null) {
                contentValues.putNull("my_identity_token");
            } else {
                contentValues.put("my_identity_token", azsv.b(azsuVar));
            }
        }
        if (intValue >= 60160) {
            azsu azsuVar2 = this.f;
            if (azsuVar2 == null || azsuVar2.equals(null)) {
                contentValues.putNull("my_identity_token_foreign_key");
            } else {
                contentValues.put("my_identity_token_foreign_key", azsv.b(this.f));
            }
        }
        contentValues.put("sub_id", Integer.valueOf(this.g));
        contentValues.put("sim_slot_id", Integer.valueOf(this.h));
        dtub.u(contentValues, "normalized_destination", this.i);
        dtub.u(contentValues, "send_destination", this.j);
        dtub.u(contentValues, "display_destination", this.k);
        dtub.u(contentValues, "comparable_destination", this.l);
        dtub.u(contentValues, "country_code", this.m);
        contentValues.put("recipient_id", Long.valueOf(this.n));
        dtub.u(contentValues, "recipient_canonical_address", this.o);
        dtub.u(contentValues, "full_name", this.p);
        dtub.u(contentValues, "first_name", this.q);
        Uri uri = this.r;
        if (uri == null) {
            contentValues.putNull("profile_photo_uri");
        } else {
            contentValues.put("profile_photo_uri", uri.toString());
        }
        if (intValue >= 59850) {
            Uri uri2 = this.s;
            if (uri2 == null) {
                contentValues.putNull("contact_photo_uri");
            } else {
                contentValues.put("contact_photo_uri", uri2.toString());
            }
        }
        contentValues.put("contact_id", Long.valueOf(this.t));
        dtub.u(contentValues, "lookup_key", this.u);
        contentValues.put("color_palette_index", Integer.valueOf(this.v));
        contentValues.put("color_type", Integer.valueOf(this.w));
        contentValues.put("extended_color", Integer.valueOf(this.x));
        contentValues.put("blocked", Boolean.valueOf(this.y));
        dtub.u(contentValues, "subscription_name", this.z);
        contentValues.put("subscription_color", Integer.valueOf(this.A));
        dtub.u(contentValues, "contact_destination", this.B);
        contentValues.put("participant_type", Integer.valueOf(this.C));
        contentValues.put("video_reachability", Integer.valueOf(this.D));
        dtub.u(contentValues, "alias", this.E);
        contentValues.put("is_spam", Boolean.valueOf(this.F));
        contentValues.put("is_spam_source", Integer.valueOf(this.G));
        dtub.u(contentValues, "cms_id", this.H);
        byzi byziVar = this.I;
        if (byziVar == null) {
            contentValues.putNull("latest_verification_status");
        } else {
            contentValues.put("latest_verification_status", Integer.valueOf(byziVar.ordinal()));
        }
        dtub.u(contentValues, "profile_photo_blob_id", this.J);
        contentValues.put("profile_photo_encryption_key", this.K);
        contentValues.put("directory_id", Long.valueOf(this.L));
        contentValues.put("is_check_constraint_enabled_via_phenotype", Boolean.valueOf(this.M));
        contentValues.put("is_valid_phone_number_data", Boolean.valueOf(this.N));
        dtub.u(contentValues, "duplicate_of", this.O);
        csgg csggVar = this.P;
        if (csggVar == null) {
            contentValues.putNull("cms_life_cycle");
        } else {
            contentValues.put("cms_life_cycle", Integer.valueOf(csggVar.ordinal()));
        }
        aorb aorbVar = this.Q;
        if (aorbVar == null) {
            contentValues.putNull("norm_ui_status");
        } else {
            contentValues.put("norm_ui_status", Integer.valueOf(aorbVar.a()));
        }
        if (intValue >= 59440) {
            bdpy bdpyVar = this.R;
            if (bdpyVar == null) {
                contentValues.putNull("last_modified_by_key");
            } else {
                contentValues.put("last_modified_by_key", bdqb.c(bdpyVar));
            }
        }
        if (intValue >= 59550) {
            cjwi cjwiVar = this.S;
            if (cjwiVar == null) {
                contentValues.putNull("name_source");
            } else {
                contentValues.put("name_source", Integer.valueOf(cjwiVar.a()));
            }
        }
        if (intValue >= 59550) {
            cjwi cjwiVar2 = this.T;
            if (cjwiVar2 == null) {
                contentValues.putNull("photo_source");
            } else {
                contentValues.put("photo_source", Integer.valueOf(cjwiVar2.a()));
            }
        }
        if (intValue >= 60060) {
            cjwe cjweVar = this.U;
            if (cjweVar == null) {
                contentValues.putNull("profile_photo_user_preference");
            } else {
                contentValues.put("profile_photo_user_preference", Integer.valueOf(cjweVar.a()));
            }
        }
        if (intValue >= 60070) {
            aqkt aqktVar = this.V;
            if (aqktVar == null) {
                contentValues.putNull("contact_metadata");
            } else {
                contentValues.put("contact_metadata", aqktVar.toByteArray());
            }
        }
        if (intValue >= 60640) {
            contentValues.put("is_enterprise_contact", Boolean.valueOf(this.W));
        }
    }

    @Override // defpackage.dtro
    protected final /* bridge */ /* synthetic */ void c(dtsu dtsuVar) {
        bvoq bvoqVar = (bvoq) ((bvms) dtsuVar);
        aB();
        this.cL = bvoqVar.cU();
        if (bvoqVar.di(0)) {
            this.a = bvoqVar.M();
            fY(0);
        }
        if (bvoqVar.di(1)) {
            this.b = bvoqVar.C();
            fY(1);
        }
        if (bvoqVar.di(2)) {
            this.c = bvoqVar.o();
            fY(2);
        }
        if (bvoqVar.di(3)) {
            this.d = bvoqVar.P();
            fY(3);
        }
        if (bvoqVar.di(4)) {
            this.e = bvoqVar.u();
            fY(4);
        }
        if (bvoqVar.di(5)) {
            this.f = bvoqVar.v();
            fY(5);
        }
        if (bvoqVar.di(6)) {
            this.g = bvoqVar.j();
            fY(6);
        }
        if (bvoqVar.di(7)) {
            this.h = bvoqVar.i();
            fY(7);
        }
        if (bvoqVar.di(8)) {
            this.i = bvoqVar.O();
            fY(8);
        }
        if (bvoqVar.di(9)) {
            this.j = bvoqVar.S();
            fY(9);
        }
        if (bvoqVar.di(10)) {
            this.k = bvoqVar.I();
            fY(10);
        }
        if (bvoqVar.di(11)) {
            this.l = bvoqVar.F();
            fY(11);
        }
        if (bvoqVar.di(12)) {
            this.m = bvoqVar.H();
            fY(12);
        }
        if (bvoqVar.di(13)) {
            this.n = bvoqVar.p();
            fY(13);
        }
        if (bvoqVar.di(14)) {
            this.o = bvoqVar.R();
            fY(14);
        }
        if (bvoqVar.di(15)) {
            this.p = bvoqVar.L();
            fY(15);
        }
        if (bvoqVar.di(16)) {
            this.q = bvoqVar.K();
            fY(16);
        }
        if (bvoqVar.di(17)) {
            this.r = bvoqVar.r();
            fY(17);
        }
        if (bvoqVar.di(18)) {
            this.s = bvoqVar.q();
            fY(18);
        }
        if (bvoqVar.di(19)) {
            this.t = bvoqVar.m();
            fY(19);
        }
        if (bvoqVar.di(20)) {
            this.u = bvoqVar.N();
            fY(20);
        }
        if (bvoqVar.di(21)) {
            this.v = bvoqVar.c();
            fY(21);
        }
        if (bvoqVar.di(22)) {
            this.w = bvoqVar.e();
            fY(22);
        }
        if (bvoqVar.di(23)) {
            this.x = bvoqVar.f();
            fY(23);
        }
        if (bvoqVar.di(24)) {
            this.y = bvoqVar.U();
            fY(24);
        }
        if (bvoqVar.di(25)) {
            this.z = bvoqVar.T();
            fY(25);
        }
        if (bvoqVar.di(26)) {
            this.A = bvoqVar.k();
            fY(26);
        }
        if (bvoqVar.di(27)) {
            this.B = bvoqVar.G();
            fY(27);
        }
        if (bvoqVar.di(28)) {
            this.C = bvoqVar.h();
            fY(28);
        }
        if (bvoqVar.di(29)) {
            this.D = bvoqVar.l();
            fY(29);
        }
        if (bvoqVar.di(30)) {
            this.E = bvoqVar.D();
            fY(30);
        }
        if (bvoqVar.di(31)) {
            this.F = bvoqVar.X();
            fY(31);
        }
        if (bvoqVar.di(32)) {
            this.G = bvoqVar.g();
            fY(32);
        }
        if (bvoqVar.di(33)) {
            this.H = bvoqVar.E();
            fY(33);
        }
        if (bvoqVar.di(34)) {
            this.I = bvoqVar.x();
            fY(34);
        }
        if (bvoqVar.di(35)) {
            this.J = bvoqVar.Q();
            fY(35);
        }
        if (bvoqVar.di(36)) {
            this.K = bvoqVar.Z();
            fY(36);
        }
        if (bvoqVar.di(37)) {
            this.L = bvoqVar.n();
            fY(37);
        }
        if (bvoqVar.di(38)) {
            this.M = bvoqVar.V();
            fY(38);
        }
        if (bvoqVar.di(39)) {
            this.N = bvoqVar.Y();
            fY(39);
        }
        if (bvoqVar.di(40)) {
            this.O = bvoqVar.J();
            fY(40);
        }
        if (bvoqVar.di(41)) {
            this.P = bvoqVar.B();
            fY(41);
        }
        if (bvoqVar.di(42)) {
            this.Q = bvoqVar.s();
            fY(42);
        }
        if (bvoqVar.di(43)) {
            this.R = bvoqVar.w();
            fY(43);
        }
        if (bvoqVar.di(44)) {
            this.S = bvoqVar.z();
            fY(44);
        }
        if (bvoqVar.di(45)) {
            this.T = bvoqVar.A();
            fY(45);
        }
        if (bvoqVar.di(46)) {
            this.U = bvoqVar.y();
            fY(46);
        }
        if (bvoqVar.di(47)) {
            this.V = bvoqVar.t();
            fY(47);
        }
        if (bvoqVar.di(48)) {
            this.W = bvoqVar.W();
            fY(48);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bvir)) {
            return false;
        }
        bvir bvirVar = (bvir) obj;
        return super.aD(bvirVar.cL) && Objects.equals(this.a, bvirVar.a) && Objects.equals(this.b, bvirVar.b) && this.c == bvirVar.c && Objects.equals(this.d, bvirVar.d) && Objects.equals(this.e, bvirVar.e) && Objects.equals(this.f, bvirVar.f) && this.g == bvirVar.g && this.h == bvirVar.h && Objects.equals(this.i, bvirVar.i) && Objects.equals(this.j, bvirVar.j) && Objects.equals(this.k, bvirVar.k) && Objects.equals(this.l, bvirVar.l) && Objects.equals(this.m, bvirVar.m) && this.n == bvirVar.n && Objects.equals(this.o, bvirVar.o) && Objects.equals(this.p, bvirVar.p) && Objects.equals(this.q, bvirVar.q) && Objects.equals(this.r, bvirVar.r) && Objects.equals(this.s, bvirVar.s) && this.t == bvirVar.t && Objects.equals(this.u, bvirVar.u) && this.v == bvirVar.v && this.w == bvirVar.w && this.x == bvirVar.x && this.y == bvirVar.y && Objects.equals(this.z, bvirVar.z) && this.A == bvirVar.A && Objects.equals(this.B, bvirVar.B) && this.C == bvirVar.C && this.D == bvirVar.D && Objects.equals(this.E, bvirVar.E) && this.F == bvirVar.F && this.G == bvirVar.G && Objects.equals(this.H, bvirVar.H) && this.I == bvirVar.I && Objects.equals(this.J, bvirVar.J) && Arrays.equals(this.K, bvirVar.K) && this.L == bvirVar.L && this.M == bvirVar.M && this.N == bvirVar.N && Objects.equals(this.O, bvirVar.O) && this.P == bvirVar.P && this.Q == bvirVar.Q && Objects.equals(this.R, bvirVar.R) && this.S == bvirVar.S && this.T == bvirVar.T && this.U == bvirVar.U && Objects.equals(this.V, bvirVar.V) && this.W == bvirVar.W;
    }

    @Override // defpackage.dtrq
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "participants_audit_log", dtub.m(new String[]{"operation_datetime", "operation_type", "participant_id", "my_identity_token", "my_identity_token_foreign_key", "sub_id", "sim_slot_id", "normalized_destination", "send_destination", "display_destination", "comparable_destination", "country_code", "recipient_id", "recipient_canonical_address", "full_name", "first_name", "profile_photo_uri", "contact_photo_uri", "contact_id", "lookup_key", "color_palette_index", "color_type", "extended_color", "blocked", "subscription_name", "subscription_color", "contact_destination", "participant_type", "video_reachability", "alias", "is_spam", "is_spam_source", "cms_id", "latest_verification_status", "profile_photo_blob_id", "profile_photo_encryption_key", "directory_id", "is_check_constraint_enabled_via_phenotype", "is_valid_phone_number_data", "duplicate_of", "cms_life_cycle", "norm_ui_status", "last_modified_by_key", "name_source", "photo_source", "profile_photo_user_preference", "contact_metadata", "is_enterprise_contact"}));
    }

    @Override // defpackage.dtrq
    public final String g() {
        return "_id";
    }

    @Override // defpackage.dtrq
    public final String h() {
        return "participants_audit_log";
    }

    public final int hashCode() {
        dtsq dtsqVar = this.cL;
        dtsq dtsqVar2 = (dtsqVar == null || dtsqVar.b()) ? null : this.cL;
        String str = this.a;
        Instant instant = this.b;
        Long valueOf = Long.valueOf(this.c);
        String str2 = this.d;
        azsu azsuVar = this.e;
        azsu azsuVar2 = this.f;
        Integer valueOf2 = Integer.valueOf(this.g);
        Integer valueOf3 = Integer.valueOf(this.h);
        String str3 = this.i;
        String str4 = this.j;
        String str5 = this.k;
        String str6 = this.l;
        String str7 = this.m;
        Long valueOf4 = Long.valueOf(this.n);
        String str8 = this.o;
        dtsq dtsqVar3 = dtsqVar2;
        String str9 = this.p;
        String str10 = this.q;
        Uri uri = this.r;
        Uri uri2 = this.s;
        Long valueOf5 = Long.valueOf(this.t);
        String str11 = this.u;
        Integer valueOf6 = Integer.valueOf(this.v);
        Integer valueOf7 = Integer.valueOf(this.w);
        Integer valueOf8 = Integer.valueOf(this.x);
        Boolean valueOf9 = Boolean.valueOf(this.y);
        String str12 = this.z;
        Integer valueOf10 = Integer.valueOf(this.A);
        String str13 = this.B;
        Integer valueOf11 = Integer.valueOf(this.C);
        Integer valueOf12 = Integer.valueOf(this.D);
        String str14 = this.E;
        Boolean valueOf13 = Boolean.valueOf(this.F);
        Integer valueOf14 = Integer.valueOf(this.G);
        String str15 = this.H;
        byzi byziVar = this.I;
        Integer valueOf15 = Integer.valueOf(byziVar == null ? 0 : byziVar.ordinal());
        String str16 = this.J;
        Integer valueOf16 = Integer.valueOf(Arrays.hashCode(this.K));
        Long valueOf17 = Long.valueOf(this.L);
        Boolean valueOf18 = Boolean.valueOf(this.M);
        Boolean valueOf19 = Boolean.valueOf(this.N);
        String str17 = this.O;
        csgg csggVar = this.P;
        return Objects.hash(dtsqVar3, str, instant, valueOf, str2, azsuVar, azsuVar2, valueOf2, valueOf3, str3, str4, str5, str6, str7, valueOf4, str8, str9, str10, uri, uri2, valueOf5, str11, valueOf6, valueOf7, valueOf8, valueOf9, str12, valueOf10, str13, valueOf11, valueOf12, str14, valueOf13, valueOf14, str15, valueOf15, str16, valueOf16, valueOf17, valueOf18, valueOf19, str17, Integer.valueOf(csggVar == null ? 0 : csggVar.ordinal()), this.Q, this.R, this.S, this.T, this.U, this.V, Boolean.valueOf(this.W), null);
    }

    @Override // defpackage.dtrq
    public final void i(StringBuilder sb, List list) {
        Long valueOf = Long.valueOf(bdgw.a(this.b));
        Long valueOf2 = Long.valueOf(this.c);
        String str = this.d;
        String b = azsv.b(this.e);
        Object obj = new bviq(this).get();
        Integer valueOf3 = Integer.valueOf(this.g);
        Integer valueOf4 = Integer.valueOf(this.h);
        String str2 = this.i;
        String str3 = this.j;
        String str4 = this.k;
        String str5 = this.l;
        String str6 = this.m;
        Long valueOf5 = Long.valueOf(this.n);
        String str7 = this.o;
        String str8 = this.p;
        String str9 = this.q;
        Uri uri = this.r;
        String uri2 = uri == null ? null : uri.toString();
        Uri uri3 = this.s;
        String uri4 = uri3 == null ? null : uri3.toString();
        Long valueOf6 = Long.valueOf(this.t);
        String str10 = this.u;
        Integer valueOf7 = Integer.valueOf(this.v);
        Integer valueOf8 = Integer.valueOf(this.w);
        Integer valueOf9 = Integer.valueOf(this.x);
        Integer valueOf10 = Integer.valueOf(this.y ? 1 : 0);
        String str11 = this.z;
        Integer valueOf11 = Integer.valueOf(this.A);
        String str12 = this.B;
        Integer valueOf12 = Integer.valueOf(this.C);
        Integer valueOf13 = Integer.valueOf(this.D);
        String str13 = this.E;
        Integer valueOf14 = Integer.valueOf(this.F ? 1 : 0);
        Integer valueOf15 = Integer.valueOf(this.G);
        String str14 = this.H;
        byzi byziVar = this.I;
        Object valueOf16 = byziVar == null ? 0 : String.valueOf(byziVar.ordinal());
        String str15 = this.J;
        byte[] bArr = this.K;
        Long valueOf17 = Long.valueOf(this.L);
        Integer valueOf18 = Integer.valueOf(this.M ? 1 : 0);
        Integer valueOf19 = Integer.valueOf(this.N ? 1 : 0);
        String str16 = this.O;
        csgg csggVar = this.P;
        Object valueOf20 = csggVar == null ? 0 : String.valueOf(csggVar.ordinal());
        aorb aorbVar = this.Q;
        Object valueOf21 = aorbVar == null ? 0 : String.valueOf(aorbVar.a());
        String c = bdqb.c(this.R);
        cjwi cjwiVar = this.S;
        Object valueOf22 = cjwiVar == null ? 0 : String.valueOf(cjwiVar.a());
        cjwi cjwiVar2 = this.T;
        Object valueOf23 = cjwiVar2 == null ? 0 : String.valueOf(cjwiVar2.a());
        cjwe cjweVar = this.U;
        Object valueOf24 = cjweVar == null ? 0 : String.valueOf(cjweVar.a());
        aqkt aqktVar = this.V;
        Object[] objArr = {valueOf, valueOf2, str, b, obj, valueOf3, valueOf4, str2, str3, str4, str5, str6, valueOf5, str7, str8, str9, uri2, uri4, valueOf6, str10, valueOf7, valueOf8, valueOf9, valueOf10, str11, valueOf11, str12, valueOf12, valueOf13, str13, valueOf14, valueOf15, str14, valueOf16, str15, bArr, valueOf17, valueOf18, valueOf19, str16, valueOf20, valueOf21, c, valueOf22, valueOf23, valueOf24, aqktVar != null ? aqktVar.toByteArray() : null, Integer.valueOf(this.W ? 1 : 0)};
        sb.append('(');
        for (int i = 0; i < 48; i++) {
            Object obj2 = objArr[i];
            if (obj2 instanceof Number) {
                sb.append(String.valueOf(obj2));
            } else {
                if (obj2 instanceof String) {
                    String str17 = (String) obj2;
                    if (str17.length() < 12) {
                        sb.append(DatabaseUtils.sqlEscapeString(str17));
                    }
                }
                list.add(obj2);
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

    public final String toString() {
        return ((dtro.a) ekhw.a(dtub.b, dtro.a.class)).iB().a() ? String.format(Locale.US, "%s", "ParticipantsAuditLogTable -- REDACTED") : a();
    }
}
