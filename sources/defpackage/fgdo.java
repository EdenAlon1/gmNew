package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fgdo extends fgdx {
    public final AtomicReference a = new AtomicReference(null);

    @Override // defpackage.fgdx
    public final /* bridge */ /* synthetic */ boolean a(Object obj) {
        if (this.a.get() != null) {
            return false;
        }
        this.a.set(fgdm.a);
        return true;
    }

    @Override // defpackage.fgdx
    public final /* bridge */ /* synthetic */ ffgu[] b(Object obj) {
        this.a.set(null);
        return fgdw.a;
    }
}
