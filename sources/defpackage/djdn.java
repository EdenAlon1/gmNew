package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djdn extends fbbs {
    private final fbbm b;
    private final fbbm c;

    public djdn(fbbf fbbfVar, fbbf fbbfVar2, fbbm fbbmVar, fbbm fbbmVar2) {
        super(fbbfVar2, new fbcd(djdn.class), fbbfVar);
        this.b = fbbz.c(fbbmVar);
        this.c = fbbz.c(fbbmVar2);
    }

    @Override // defpackage.fbbs
    public final /* bridge */ /* synthetic */ ListenableFuture b(Object obj) {
        Optional empty;
        List list = (List) obj;
        djeb djebVar = (djeb) list.get(0);
        ctvb ctvbVar = (ctvb) list.get(1);
        diyy diyyVar = djdd.a;
        if (djebVar.b().isPresent() && !((dkkj) djebVar.b().get()).E) {
            empty = Optional.ofNullable(((dkha) djebVar.b().get()).o);
        } else if (djebVar.a().isPresent()) {
            Object obj2 = djebVar.a().get();
            String k = dkut.k(((dkjt) djebVar.a().get()).c, ctvbVar);
            if (!dkut.w(k)) {
                k = dkut.n(((dkjt) obj2).c, ctvbVar);
            }
            empty = Optional.ofNullable(k);
        } else {
            empty = Optional.empty();
        }
        return erqt.i(empty);
    }

    @Override // defpackage.fbbs
    protected final ListenableFuture c() {
        return erqt.f(this.b.d(), this.c.d());
    }
}
