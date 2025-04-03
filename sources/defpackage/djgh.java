package defpackage;

import com.google.common.util.concurrent.SettableFuture;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class djgh {
    public final SettableFuture a = SettableFuture.create();
    public clqe b;

    public djgh(clqe clqeVar) {
        this.b = clqeVar;
    }

    public final void a(Throwable th) {
        this.a.setException(th);
    }

    public final void b(clqg clqgVar) {
        this.a.set(clqgVar);
    }

    public final synchronized void c(Instant instant) {
        clqd clqdVar = (clqd) this.b.toBuilder();
        int i = this.b.h + 1;
        clqdVar.copyOnWrite();
        clqe clqeVar = (clqe) clqdVar.instance;
        clqeVar.b |= 8;
        clqeVar.h = i;
        eyja b = eykj.b(instant);
        clqdVar.copyOnWrite();
        clqe clqeVar2 = (clqe) clqdVar.instance;
        b.getClass();
        clqeVar2.g = b;
        clqeVar2.b |= 4;
        this.b = (clqe) clqdVar.build();
    }
}
