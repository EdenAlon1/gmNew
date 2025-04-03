package defpackage;

import j$.util.Optional;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wyb implements wqq {
    public final ffbr a;
    public final aigz b;
    private final ffbr c;
    private final ffxx d;
    private final Set e;

    public wyb(ffbr ffbrVar, ffbr ffbrVar2, aigz aigzVar) {
        aigzVar.getClass();
        this.c = ffbrVar;
        this.a = ffbrVar2;
        this.b = aigzVar;
        Object b = ffbrVar.b();
        b.getClass();
        Optional optional = (Optional) b;
        this.d = new wya(optional.isEmpty() ? new ffyg(false) : ((wxw) optional.get()).b, this);
        this.e = fffi.b(aaxf.b);
    }

    @Override // defpackage.wqq
    public final Set a() {
        return this.e;
    }

    @Override // defpackage.wqq
    public final ffxx b() {
        return this.d;
    }
}
