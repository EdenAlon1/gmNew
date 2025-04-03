package defpackage;

import java.lang.ref.ReferenceQueue;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class enlv extends enlf {
    public final ReferenceQueue g;

    public enlv(enme enmeVar, int i) {
        super(enmeVar, i);
        this.g = new ReferenceQueue();
    }

    @Override // defpackage.enlf
    public final void g() {
        n(this.g);
    }

    @Override // defpackage.enlf
    public final void h() {
        e(this.g);
    }
}
