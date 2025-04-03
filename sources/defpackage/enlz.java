package defpackage;

import java.lang.ref.ReferenceQueue;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class enlz extends enlf {
    public final ReferenceQueue g;
    public final ReferenceQueue h;

    public enlz(enme enmeVar, int i) {
        super(enmeVar, i);
        this.g = new ReferenceQueue();
        this.h = new ReferenceQueue();
    }

    @Override // defpackage.enlf
    public final void g() {
        n(this.g);
    }

    @Override // defpackage.enlf
    public final void h() {
        e(this.g);
        f(this.h);
    }
}
