package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ProfilesTable;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class bwlt extends dtrr {
    public long a;
    public long b;
    public String c;
    public String d;
    public aqgx e;
    public cjwo f;
    public String g;
    public String h;
    public String i;
    public Uri j;
    public String k;
    public String l;
    public String m;
    public String n;
    public boolean o;
    public boolean p;
    public long q;
    public long r;
    public boolean s;
    public long t;

    public bwlt() {
        super(ProfilesTable.f());
        this.e = aqgx.a;
        this.o = true;
        this.p = false;
        this.q = 0L;
        this.r = 0L;
        this.s = false;
        this.t = 0L;
    }

    public final ProfilesTable.BindData a() {
        bwls bwlsVar = new bwls();
        bwlsVar.aC(aB());
        bwlsVar.a = this.a;
        bwlsVar.b = this.b;
        bwlsVar.c = this.c;
        bwlsVar.d = this.d;
        bwlsVar.e = this.e;
        bwlsVar.f = this.f;
        bwlsVar.g = this.g;
        bwlsVar.h = this.h;
        bwlsVar.i = this.i;
        bwlsVar.j = this.j;
        bwlsVar.k = this.k;
        bwlsVar.l = this.l;
        bwlsVar.m = this.m;
        bwlsVar.n = this.n;
        bwlsVar.o = this.o;
        bwlsVar.p = this.p;
        bwlsVar.q = this.q;
        bwlsVar.r = this.r;
        bwlsVar.s = this.s;
        bwlsVar.t = this.t;
        bwlsVar.cK = aC();
        return bwlsVar;
    }

    public final void b(boolean z) {
        int i = this.aB;
        if (i < 59940) {
            dtub.w("belongs_to_self_gaia", i);
        }
        aE(18);
        this.s = z;
    }

    public final void c(String str) {
        aE(12);
        this.m = str;
    }

    public final void d(String str) {
        aE(8);
        this.i = str;
    }

    public final void e(String str) {
        aE(6);
        this.g = str;
    }

    public final void f(long j) {
        int i = this.aB;
        if (i < 59940) {
            dtub.w("gaia_update_timestamp", i);
        }
        aE(19);
        this.t = j;
    }

    public final void g(boolean z) {
        int i = this.aB;
        if (i < 60400) {
            dtub.w("is_self_profile_shareable", i);
        }
        aE(14);
        this.o = z;
    }

    public final void h(String str) {
        aE(7);
        this.h = str;
    }

    public final void i(long j) {
        aE(1);
        this.b = j;
    }

    public final void j(String str) {
        int i = this.aB;
        if (i < 60170) {
            dtub.w("person_id", i);
        }
        aE(2);
        this.c = str;
    }

    public final void k(String str) {
        aE(13);
        this.n = str;
    }

    public final void l(Uri uri) {
        aE(9);
        this.j = uri;
    }

    public final void m(String str) {
        int i = this.aB;
        if (i < 60170) {
            dtub.w("profile_access_token", i);
        }
        aE(3);
        this.d = str;
    }

    public final void n(cjwo cjwoVar) {
        int i = this.aB;
        if (i < 60340) {
            dtub.w("self_profile_sharing_metadata", i);
        }
        aE(5);
        this.f = cjwoVar;
    }

    public final void o(String str) {
        int i = this.aB;
        if (i < 60170) {
            dtub.w("sender_last_updated_time", i);
        }
        aE(10);
        this.k = str;
    }

    public final void p(String str) {
        int i = this.aB;
        if (i < 60200) {
            dtub.w("sender_last_updated_time_from_rcs", i);
        }
        aE(11);
        this.l = str;
    }
}
