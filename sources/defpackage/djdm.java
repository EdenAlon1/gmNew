package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djdm extends fbbs {
    private final fbbm b;

    public djdm(fbbf fbbfVar, fbbf fbbfVar2, fbbm fbbmVar) {
        super(fbbfVar2, new fbcd(djdm.class), fbbfVar);
        this.b = fbbz.c(fbbmVar);
    }

    @Override // defpackage.fbbs
    public final /* bridge */ /* synthetic */ ListenableFuture b(Object obj) {
        Optional empty;
        djeb djebVar = (djeb) obj;
        diyy diyyVar = djdd.a;
        if (!djao.t()) {
            empty = Optional.empty();
        } else if (djebVar.b().isEmpty()) {
            empty = Optional.empty();
        } else {
            Object obj2 = djebVar.b().get();
            empty = ((dkha) obj2).p ? Optional.empty() : ((dkkj) obj2).aB();
        }
        return erqt.i(empty);
    }

    @Override // defpackage.fbbs
    protected final ListenableFuture c() {
        return this.b.d();
    }
}
