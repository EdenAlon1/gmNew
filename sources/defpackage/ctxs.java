package defpackage;

import android.content.Context;
import android.telephony.SmsManager;
import j$.time.Duration;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ctxs implements ctwy {
    private final ctwy a;
    private volatile emyl b;
    private volatile emyl c;

    public ctxs(final ctwy ctwyVar) {
        this.a = ctwyVar;
        this.b = emys.b(new emyl() { // from class: ctxq
            @Override // defpackage.emyl
            public final Object get() {
                String m = ctwy.this.m();
                return m == null ? "" : m;
            }
        }, Duration.ofSeconds(dizg.c()));
        this.c = emys.b(new emyl() { // from class: ctxr
            @Override // defpackage.emyl
            public final Object get() {
                String p = ctwy.this.p();
                return p == null ? "" : p;
            }
        }, Duration.ofSeconds(dizg.c()));
    }

    @Override // defpackage.ctwy
    public final int[] A() {
        return this.a.A();
    }

    @Override // defpackage.ctwy
    public final int a() {
        return this.a.a();
    }

    @Override // defpackage.ctwy
    public final int b() {
        return this.a.b();
    }

    @Override // defpackage.ctwy
    public final int c() {
        return this.a.c();
    }

    @Override // defpackage.ctwy
    public final int d() {
        return this.a.d();
    }

    @Override // defpackage.ctwy
    public final SmsManager e() {
        return this.a.e();
    }

    @Override // defpackage.ctwy
    public final Optional f() {
        return this.a.f();
    }

    @Override // defpackage.ctwy
    public final Optional g() {
        return this.a.g();
    }

    @Override // defpackage.ctwy
    public final Optional h() {
        return this.a.h();
    }

    @Override // defpackage.ctwy
    public final CharSequence i() {
        return this.a.i();
    }

    @Override // defpackage.ctwy
    public final CharSequence j() {
        return this.a.j();
    }

    @Override // defpackage.ctwy
    public final String k() {
        return this.a.k();
    }

    @Override // defpackage.ctwy
    public final String l() {
        return this.a.l();
    }

    @Override // defpackage.ctwy
    public final String m() {
        emyl emylVar = this.b;
        if (emylVar == null) {
            ffkj.c("getNetworkCountry");
            emylVar = null;
        }
        return (String) emylVar.get();
    }

    @Override // defpackage.ctwy
    public final String n() {
        return this.a.n();
    }

    @Override // defpackage.ctwy
    public final String o() {
        return this.a.o();
    }

    @Override // defpackage.ctwy
    public final String p() {
        emyl emylVar = this.c;
        if (emylVar == null) {
            ffkj.c("getSimCountry");
            emylVar = null;
        }
        Object obj = emylVar.get();
        obj.getClass();
        return (String) obj;
    }

    @Override // defpackage.ctwy
    public final String q() {
        return this.a.q();
    }

    @Override // defpackage.ctwy
    public final String r() {
        return this.a.r();
    }

    @Override // defpackage.ctwy
    public final String s() {
        return this.a.s();
    }

    @Override // defpackage.ctwy
    public final String t() {
        return this.a.t();
    }

    @Override // defpackage.ctwy
    public final String u(Context context) {
        return this.a.u(context);
    }

    @Override // defpackage.ctwy
    public final boolean v(int i) {
        return this.a.v(i);
    }

    @Override // defpackage.ctwy
    public final boolean w() {
        return this.a.w();
    }

    @Override // defpackage.ctwy
    public final boolean x() {
        return this.a.x();
    }

    @Override // defpackage.ctwy
    public final boolean y() {
        return this.a.y();
    }

    @Override // defpackage.ctwy
    public final boolean z() {
        return this.a.z();
    }
}
