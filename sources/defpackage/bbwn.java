package defpackage;

import j$.util.Optional;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bbwn implements Supplier {
    final /* synthetic */ bbwq a;

    public bbwn(bbwq bbwqVar) {
        this.a = bbwqVar;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        Optional optional = this.a.b;
        if (optional == null || optional.equals(bdhj.a)) {
            return null;
        }
        return bdhj.b(this.a.b);
    }
}
