package defpackage;

import android.net.Uri;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ejtq extends ejte implements ejvt {
    public final ejui a;
    final /* synthetic */ ejtr b;
    private final Uri c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ejtq(ejtr ejtrVar, Uri uri) {
        super(ejtrVar.e, "External ContentObserver notification", ejtrVar.f);
        this.b = ejtrVar;
        this.a = new ejty(this);
        this.c = uri;
    }

    @Override // defpackage.ejte
    public final void a(boolean z, Uri uri) {
        if (z) {
            return;
        }
        ejtr ejtrVar = this.b;
        ejtrVar.c.a(erqt.i(null), this.a);
    }

    @Override // defpackage.ejvt
    public final void c() {
        this.b.b.getContentResolver().unregisterContentObserver(this);
    }

    @Override // defpackage.ejvt
    public final void d() {
        this.b.b.getContentResolver().registerContentObserver(this.c, false, this);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ejtq) {
            return Objects.equals(this.c, ((ejtq) obj).c);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.c);
    }

    public final String toString() {
        return "ResultPropagator for URI: ".concat(String.valueOf(String.valueOf(this.c)));
    }
}
