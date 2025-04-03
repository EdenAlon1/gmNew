package defpackage;

import android.content.Context;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class culz {
    public final Context a;
    public final ffbr b;
    public final cqoh c;
    public final ffbr d;
    public final ffbr e;

    public culz(Context context, ffbr ffbrVar, cqoh cqohVar, ffbr ffbrVar2, ffbr ffbrVar3) {
        this.a = context;
        this.b = ffbrVar;
        this.c = cqohVar;
        this.d = ffbrVar2;
        this.e = ffbrVar3;
    }

    public final void a(ctzf ctzfVar) {
        ((ctzg) this.e.b()).b(ctzfVar);
    }

    public final void b() {
        ((culw) this.b.b()).d();
    }

    public final void c() {
        ((ctyx) this.d.b()).h("spam_popup_dismissed", true);
    }

    public final boolean d() {
        return ((ctyx) this.d.b()).q("spam_popup_dismissed", false);
    }

    @Deprecated
    public final boolean e() {
        return culw.b().booleanValue() ? ((culw) this.b.b()).e() : ((ctzg) this.e.b()).a("spam_protection_feature_consent").a();
    }

    public final boolean f(ctzf ctzfVar, boolean z) {
        if (!z || !ctzfVar.c()) {
            return false;
        }
        ((ctzg) this.e.b()).b(ctzfVar);
        return true;
    }

    public final boolean g() {
        long e = ((ctyx) this.d.b()).e("spam_popup_seen_timestamp", -1L);
        return e == -1 || this.c.f().toEpochMilli() <= e + TimeUnit.HOURS.toMillis(12L);
    }
}
