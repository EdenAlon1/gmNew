package defpackage;

import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahor {
    public final ctyz a;
    private final csjk b;

    public ahor(ctyz ctyzVar, csjk csjkVar) {
        this.a = ctyzVar;
        this.b = csjkVar;
    }

    public final long a() {
        return this.a.a();
    }

    public final boolean b() {
        ctyz ctyzVar = this.a;
        return ctyzVar.a.q(ctyzVar.b.getString(R.string.link_preview_tombstone_seen_pref_key), ctyzVar.b.getBoolean(R.bool.link_preview_tombstone_seen_pref_default)) && a() > 0;
    }

    public final boolean c() {
        return d() && b();
    }

    public final boolean d() {
        return e() && g() && f();
    }

    public final boolean e() {
        return this.a.i();
    }

    public final boolean f() {
        return !((csmz) this.b.a()).s();
    }

    public final boolean g() {
        if (this.a.l()) {
            return ((csmz) this.b.a()).w();
        }
        return true;
    }

    public final void h() {
        this.a.r();
    }
}
