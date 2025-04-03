package defpackage;

import android.content.ContentValues;
import android.database.DatabaseUtils;
import defpackage.dtro;
import j$.util.Objects;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class bsrt extends dtro implements dtrq {
    public long a;
    public String b;
    public byte[] h;
    public byte[] l;
    public byte[] m;
    public byzk n;
    public byte[] t;
    public String u;
    public long c = 0;
    public long d = 0;
    public long e = 0;
    public String f = "";
    public boolean g = false;
    public String i = "";
    public String j = "";
    public int k = 0;
    public boolean o = false;
    public String p = "";
    public boolean q = false;
    public byyv r = byyv.WEB;
    public byzd s = byzd.ANONYMOUS;
    public long v = 0;
    public long w = 0;

    protected bsrt() {
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
        byte[] bArr = this.h;
        String concat = "BLOB".concat(String.valueOf(bArr != null ? String.valueOf(bArr.length) : "NULL"));
        String valueOf8 = String.valueOf(this.i);
        String valueOf9 = String.valueOf(this.j);
        String valueOf10 = String.valueOf(this.k);
        byte[] bArr2 = this.l;
        String concat2 = "BLOB".concat(String.valueOf(bArr2 != null ? String.valueOf(bArr2.length) : "NULL"));
        byte[] bArr3 = this.m;
        String concat3 = "BLOB".concat(String.valueOf(bArr3 != null ? String.valueOf(bArr3.length) : "NULL"));
        String valueOf11 = String.valueOf(this.n);
        String valueOf12 = String.valueOf(this.o);
        String valueOf13 = String.valueOf(this.p);
        String valueOf14 = String.valueOf(this.q);
        String valueOf15 = String.valueOf(this.r);
        String valueOf16 = String.valueOf(this.s);
        byte[] bArr4 = this.t;
        return String.format(locale, "DeskTopTable [_id: %s,\n  desktop_id: %s,\n  last_connection_time: %s,\n  last_wakeup_time: %s,\n  wakeup_attempts_count: %s,\n  fingerprint: %s,\n  force_refresh: %s,\n  client_info: %s,\n  operating_system: %s,\n  operating_system_version: %s,\n  browser_type: %s,\n  encryption_key: %s,\n  hmac_key: %s,\n  backend_type: %s,\n  is_active: %s,\n  request_id: %s,\n  is_persistent: %s,\n  desktop_type: %s,\n  pairing_type: %s,\n  destination_registration_id: %s,\n  gaia_email: %s,\n  creation_time: %s,\n  get_updates_request_time_millis: %s\n]\n", valueOf, valueOf2, valueOf3, valueOf4, valueOf5, valueOf6, valueOf7, concat, valueOf8, valueOf9, valueOf10, concat2, concat3, valueOf11, valueOf12, valueOf13, valueOf14, valueOf15, valueOf16, "BLOB".concat(String.valueOf(bArr4 != null ? String.valueOf(bArr4.length) : "NULL")), "REDACTED", String.valueOf(this.v), String.valueOf(this.w));
    }

    @Override // defpackage.dtro
    public final void b(ContentValues contentValues) {
        int intValue = bsve.c().intValue();
        dtub.u(contentValues, "desktop_id", this.b);
        contentValues.put("last_connection_time", Long.valueOf(this.c));
        contentValues.put("last_wakeup_time", Long.valueOf(this.d));
        contentValues.put("wakeup_attempts_count", Long.valueOf(this.e));
        dtub.u(contentValues, "fingerprint", this.f);
        contentValues.put("force_refresh", Boolean.valueOf(this.g));
        contentValues.put("client_info", this.h);
        if (intValue >= 22040) {
            dtub.u(contentValues, "operating_system", this.i);
        }
        if (intValue >= 22040) {
            dtub.u(contentValues, "operating_system_version", this.j);
        }
        if (intValue >= 18020) {
            contentValues.put("browser_type", Integer.valueOf(this.k));
        }
        if (intValue >= 21030) {
            contentValues.put("encryption_key", this.l);
        }
        if (intValue >= 21030) {
            contentValues.put("hmac_key", this.m);
        }
        if (intValue >= 41010) {
            byzk byzkVar = this.n;
            if (byzkVar == null) {
                contentValues.putNull("backend_type");
            } else {
                contentValues.put("backend_type", Integer.valueOf(byzkVar.ordinal()));
            }
        }
        if (intValue >= 58010) {
            contentValues.put("is_active", Boolean.valueOf(this.o));
        }
        if (intValue >= 58010) {
            dtub.u(contentValues, "request_id", this.p);
        }
        if (intValue >= 58010) {
            contentValues.put("is_persistent", Boolean.valueOf(this.q));
        }
        if (intValue >= 58010) {
            byyv byyvVar = this.r;
            if (byyvVar == null) {
                contentValues.putNull("desktop_type");
            } else {
                contentValues.put("desktop_type", Integer.valueOf(byyvVar.ordinal()));
            }
        }
        if (intValue >= 58960) {
            byzd byzdVar = this.s;
            if (byzdVar == null) {
                contentValues.putNull("pairing_type");
            } else {
                contentValues.put("pairing_type", Integer.valueOf(byzdVar.ordinal()));
            }
        }
        if (intValue >= 59290) {
            contentValues.put("destination_registration_id", this.t);
        }
        if (intValue >= 59560) {
            dtub.u(contentValues, "gaia_email", this.u);
        }
        if (intValue >= 59870) {
            contentValues.put("creation_time", Long.valueOf(this.v));
        }
        if (intValue >= 60540) {
            contentValues.put("get_updates_request_time_millis", Long.valueOf(this.w));
        }
    }

    @Override // defpackage.dtro
    protected final /* bridge */ /* synthetic */ void c(dtsu dtsuVar) {
        bsur bsurVar = (bsur) ((bstt) dtsuVar);
        aB();
        this.cL = bsurVar.cU();
        if (bsurVar.di(0)) {
            this.a = bsurVar.q();
            fY(0);
        }
        if (bsurVar.di(1)) {
            this.b = bsurVar.i();
            fY(1);
        }
        if (bsurVar.di(2)) {
            this.c = bsurVar.e();
            fY(2);
        }
        if (bsurVar.di(3)) {
            this.d = bsurVar.f();
            fY(3);
        }
        if (bsurVar.di(4)) {
            this.e = bsurVar.r();
            fY(4);
        }
        if (bsurVar.di(5)) {
            this.f = bsurVar.u();
            fY(5);
        }
        if (bsurVar.di(6)) {
            this.g = bsurVar.x();
            fY(6);
        }
        if (bsurVar.di(7)) {
            this.h = bsurVar.z();
            fY(7);
        }
        if (bsurVar.di(8)) {
            this.i = bsurVar.v();
            fY(8);
        }
        if (bsurVar.di(9)) {
            this.j = bsurVar.w();
            fY(9);
        }
        if (bsurVar.di(10)) {
            this.k = bsurVar.o();
            fY(10);
        }
        if (bsurVar.di(11)) {
            this.l = bsurVar.m();
            fY(11);
        }
        if (bsurVar.di(12)) {
            this.m = bsurVar.n();
            fY(12);
        }
        if (bsurVar.di(13)) {
            this.n = bsurVar.t();
            fY(13);
        }
        if (bsurVar.di(14)) {
            this.o = bsurVar.y();
            fY(14);
        }
        if (bsurVar.di(15)) {
            this.p = bsurVar.k();
            fY(15);
        }
        if (bsurVar.di(16)) {
            this.q = bsurVar.l();
            fY(16);
        }
        if (bsurVar.di(17)) {
            this.r = bsurVar.g();
            fY(17);
        }
        if (bsurVar.di(18)) {
            this.s = bsurVar.s();
            fY(18);
        }
        if (bsurVar.di(19)) {
            this.t = bsurVar.A();
            fY(19);
        }
        if (bsurVar.di(20)) {
            this.u = bsurVar.j();
            fY(20);
        }
        if (bsurVar.di(21)) {
            this.v = bsurVar.p();
            fY(21);
        }
        if (bsurVar.di(22)) {
            this.w = bsurVar.c();
            fY(22);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bsrt)) {
            return false;
        }
        bsrt bsrtVar = (bsrt) obj;
        return super.aD(bsrtVar.cL) && this.a == bsrtVar.a && Objects.equals(this.b, bsrtVar.b) && this.c == bsrtVar.c && this.d == bsrtVar.d && this.e == bsrtVar.e && Objects.equals(this.f, bsrtVar.f) && this.g == bsrtVar.g && Arrays.equals(this.h, bsrtVar.h) && Objects.equals(this.i, bsrtVar.i) && Objects.equals(this.j, bsrtVar.j) && this.k == bsrtVar.k && Arrays.equals(this.l, bsrtVar.l) && Arrays.equals(this.m, bsrtVar.m) && this.n == bsrtVar.n && this.o == bsrtVar.o && Objects.equals(this.p, bsrtVar.p) && this.q == bsrtVar.q && this.r == bsrtVar.r && this.s == bsrtVar.s && Arrays.equals(this.t, bsrtVar.t) && Objects.equals(this.u, bsrtVar.u) && this.v == bsrtVar.v && this.w == bsrtVar.w;
    }

    @Override // defpackage.dtrq
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "desktop", dtub.m(new String[]{"desktop_id", "last_connection_time", "last_wakeup_time", "wakeup_attempts_count", "fingerprint", "force_refresh", "client_info", "operating_system", "operating_system_version", "browser_type", "encryption_key", "hmac_key", "backend_type", "is_active", "request_id", "is_persistent", "desktop_type", "pairing_type", "destination_registration_id", "gaia_email", "creation_time", "get_updates_request_time_millis"}));
    }

    @Override // defpackage.dtrq
    public final String g() {
        return "_id";
    }

    @Override // defpackage.dtrq
    public final String h() {
        return "desktop";
    }

    public final int hashCode() {
        dtsq dtsqVar = this.cL;
        dtsq dtsqVar2 = (dtsqVar == null || dtsqVar.b()) ? null : this.cL;
        Long valueOf = Long.valueOf(this.a);
        String str = this.b;
        Long valueOf2 = Long.valueOf(this.c);
        Long valueOf3 = Long.valueOf(this.d);
        Long valueOf4 = Long.valueOf(this.e);
        String str2 = this.f;
        Boolean valueOf5 = Boolean.valueOf(this.g);
        Integer valueOf6 = Integer.valueOf(Arrays.hashCode(this.h));
        String str3 = this.i;
        String str4 = this.j;
        Integer valueOf7 = Integer.valueOf(this.k);
        Integer valueOf8 = Integer.valueOf(Arrays.hashCode(this.l));
        Integer valueOf9 = Integer.valueOf(Arrays.hashCode(this.m));
        byzk byzkVar = this.n;
        Integer valueOf10 = Integer.valueOf(byzkVar == null ? 0 : byzkVar.ordinal());
        dtsq dtsqVar3 = dtsqVar2;
        Boolean valueOf11 = Boolean.valueOf(this.o);
        String str5 = this.p;
        Boolean valueOf12 = Boolean.valueOf(this.q);
        byyv byyvVar = this.r;
        Integer valueOf13 = Integer.valueOf(byyvVar == null ? 0 : byyvVar.ordinal());
        byzd byzdVar = this.s;
        return Objects.hash(dtsqVar3, valueOf, str, valueOf2, valueOf3, valueOf4, str2, valueOf5, valueOf6, str3, str4, valueOf7, valueOf8, valueOf9, valueOf10, valueOf11, str5, valueOf12, valueOf13, Integer.valueOf(byzdVar == null ? 0 : byzdVar.ordinal()), Integer.valueOf(Arrays.hashCode(this.t)), this.u, Long.valueOf(this.v), Long.valueOf(this.w), null);
    }

    @Override // defpackage.dtrq
    public final void i(StringBuilder sb, List list) {
        String str = this.b;
        Long valueOf = Long.valueOf(this.c);
        Long valueOf2 = Long.valueOf(this.d);
        Long valueOf3 = Long.valueOf(this.e);
        String str2 = this.f;
        Integer valueOf4 = Integer.valueOf(this.g ? 1 : 0);
        byte[] bArr = this.h;
        String str3 = this.i;
        String str4 = this.j;
        Integer valueOf5 = Integer.valueOf(this.k);
        byte[] bArr2 = this.l;
        byte[] bArr3 = this.m;
        byzk byzkVar = this.n;
        Object valueOf6 = byzkVar == null ? 0 : String.valueOf(byzkVar.ordinal());
        Integer valueOf7 = Integer.valueOf(this.o ? 1 : 0);
        String str5 = this.p;
        Integer valueOf8 = Integer.valueOf(this.q ? 1 : 0);
        byyv byyvVar = this.r;
        Object valueOf9 = byyvVar == null ? 0 : String.valueOf(byyvVar.ordinal());
        byzd byzdVar = this.s;
        Object[] objArr = {str, valueOf, valueOf2, valueOf3, str2, valueOf4, bArr, str3, str4, valueOf5, bArr2, bArr3, valueOf6, valueOf7, str5, valueOf8, valueOf9, byzdVar != null ? String.valueOf(byzdVar.ordinal()) : 0, this.t, this.u, Long.valueOf(this.v), Long.valueOf(this.w)};
        sb.append('(');
        for (int i = 0; i < 22; i++) {
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

    public final int k() {
        az(10, "browser_type");
        return this.k;
    }

    public final long l() {
        az(0, "_id");
        return this.a;
    }

    public final long m() {
        az(2, "last_connection_time");
        return this.c;
    }

    public final byyv n() {
        az(17, "desktop_type");
        return this.r;
    }

    public final byzd o() {
        az(18, "pairing_type");
        return this.s;
    }

    public final String q() {
        az(1, "desktop_id");
        return this.b;
    }

    public final String r() {
        az(20, "gaia_email");
        return this.u;
    }

    public final String s() {
        az(8, "operating_system");
        return this.i;
    }

    public final String t() {
        az(9, "operating_system_version");
        return this.j;
    }

    public final String toString() {
        return ((dtro.a) ekhw.a(dtub.b, dtro.a.class)).iB().a() ? String.format(Locale.US, "%s", "DeskTopTable -- REDACTED") : a();
    }

    public final byte[] u() {
        az(19, "destination_registration_id");
        return this.t;
    }

    @Deprecated
    public final void v() {
        final dtve b = bsve.b();
        dtub.b(bsve.b(), "desktop", this, new Function() { // from class: bsrr
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Long.valueOf(dtve.this.T("desktop", (ContentValues) obj, 5));
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }, new Consumer() { // from class: bsrs
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                Long l = (Long) obj;
                if (l.longValue() >= 0) {
                    bsrt bsrtVar = bsrt.this;
                    bsrtVar.a = new bsrq(l).a.longValue();
                    bsrtVar.fY(0);
                }
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }
}
