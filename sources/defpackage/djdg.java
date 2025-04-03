package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djdg extends fbbs {
    private final fbbm b;

    public djdg(fbbf fbbfVar, fbbf fbbfVar2, fbbm fbbmVar) {
        super(fbbfVar2, new fbcd(djdg.class), fbbfVar);
        this.b = fbbz.c(fbbmVar);
    }

    @Override // defpackage.fbbs
    public final /* bridge */ /* synthetic */ ListenableFuture b(Object obj) {
        djeb djebVar = (djeb) obj;
        diyy diyyVar = djdd.a;
        return erqt.i((djebVar.b().isPresent() && djebVar.a().isEmpty()) ? Optional.ofNullable(((dkkj) djebVar.b().get()).N) : djebVar.a());
    }

    @Override // defpackage.fbbs
    protected final ListenableFuture c() {
        return this.b.d();
    }
}
