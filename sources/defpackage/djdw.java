package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djdw extends fbbs {
    private final fbbm b;

    public djdw(fbbf fbbfVar, fbbf fbbfVar2, fbbm fbbmVar) {
        super(fbbfVar2, new fbcd(djdw.class), fbbfVar);
        this.b = fbbz.c(fbbmVar);
    }

    @Override // defpackage.fbbs
    public final /* bridge */ /* synthetic */ ListenableFuture b(Object obj) {
        Optional aB;
        djeb djebVar = (djeb) obj;
        dktn dktnVar = djdq.a;
        if (djao.t()) {
            emxf.b(djebVar.b().isPresent(), "Session is not present");
            emxf.b(!((dkha) djebVar.b().get()).p, "Session is originating");
            aB = ((dkkj) djebVar.b().get()).aB();
        } else {
            aB = Optional.empty();
        }
        return erqt.i(aB);
    }

    @Override // defpackage.fbbs
    protected final ListenableFuture c() {
        return this.b.d();
    }
}
