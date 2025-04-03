package defpackage;

import j$.util.Optional;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class chcn implements djrx, djrl {
    private final chco a;
    private final ffbr b;

    public chcn(chco chcoVar, ffbr ffbrVar) {
        this.a = chcoVar;
        this.b = ffbrVar;
    }

    @Override // defpackage.djrl
    public final void b(Set set) {
        if (((atqt) this.b.b()).a()) {
            return;
        }
        chco chcoVar = this.a;
        chcoVar.h.set(chcoVar.b());
    }

    @Override // defpackage.djrx
    public final void gh(String str, Optional optional) {
        if (((atqt) this.b.b()).a()) {
            return;
        }
        chco chcoVar = this.a;
        chcoVar.h.set(chcoVar.b());
    }
}
