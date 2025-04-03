package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aqaz implements alxz {
    final /* synthetic */ bton a;
    final /* synthetic */ aqbb b;

    public aqaz(bton btonVar, aqbb aqbbVar) {
        this.a = btonVar;
        this.b = aqbbVar;
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
    public final /* bridge */ /* synthetic */ String c() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.alxz
    public final /* bridge */ /* synthetic */ String d() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.alxz
    public final /* bridge */ /* synthetic */ String e() {
        throw new UnsupportedOperationException();
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
    public final /* bridge */ /* synthetic */ boolean i() {
        throw new UnsupportedOperationException();
    }
}
