package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class apwl implements alxz {
    final /* synthetic */ bton a;
    final /* synthetic */ apwm b;

    public apwl(bton btonVar, apwm apwmVar) {
        this.a = btonVar;
        this.b = apwmVar;
    }

    @Override // defpackage.alxz
    public final Uri a() {
        String q = this.a.q();
        if (q != null) {
            return Uri.parse(q);
        }
        return null;
    }

    @Override // defpackage.alxz
    public final Uri b() {
        return Uri.parse(this.a.s());
    }

    @Override // defpackage.alxz
    public final String c() {
        return this.a.m();
    }

    @Override // defpackage.alxz
    public final String d() {
        String n = this.a.n();
        return n == null ? "" : n;
    }

    @Override // defpackage.alxz
    public final String e() {
        String o = this.a.o();
        return o == null ? "" : o;
    }

    @Override // defpackage.alxz
    public final String f() {
        String r = this.a.r();
        return r == null ? "" : r;
    }

    @Override // defpackage.alxz
    public final boolean g() {
        return this.b.a.f().toEpochMilli() > this.a.k();
    }

    @Override // defpackage.alxz
    public final boolean h() {
        return this.a.v();
    }

    @Override // defpackage.alxz
    public final boolean i() {
        return this.a.w();
    }
}
