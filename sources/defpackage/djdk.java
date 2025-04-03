package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djdk extends fbbs {
    private final fbbm b;
    private final fbbm c;

    public djdk(fbbf fbbfVar, fbbf fbbfVar2, fbbm fbbmVar, fbbm fbbmVar2) {
        super(fbbfVar2, new fbcd(djdk.class), fbbfVar);
        this.b = fbbz.c(fbbmVar);
        this.c = fbbz.c(fbbmVar2);
    }

    @Override // defpackage.fbbs
    public final /* bridge */ /* synthetic */ ListenableFuture b(Object obj) {
        List list = (List) obj;
        Optional optional = (Optional) list.get(0);
        djgi djgiVar = (djgi) list.get(1);
        if (!((Boolean) djdd.b.a()).booleanValue() || !optional.isPresent()) {
            return erqt.i(clqg.a);
        }
        clqm clqmVar = (clqm) optional.get();
        clqd clqdVar = (clqd) clqe.a.createBuilder();
        clns clnsVar = clqmVar.d;
        if (clnsVar == null) {
            clnsVar = clns.a;
        }
        clqdVar.copyOnWrite();
        clqe clqeVar = (clqe) clqdVar.instance;
        clnsVar.getClass();
        clqeVar.e = clnsVar;
        clqeVar.b = 1 | clqeVar.b;
        clqdVar.copyOnWrite();
        clqe clqeVar2 = (clqe) clqdVar.instance;
        clqeVar2.d = clqmVar;
        clqeVar2.c = 2;
        clqdVar.copyOnWrite();
        clqe clqeVar3 = (clqe) clqdVar.instance;
        clqeVar3.b |= 8;
        clqeVar3.h = 0;
        eyja b = eykj.b(djgiVar.b.f());
        clqdVar.copyOnWrite();
        clqe clqeVar4 = (clqe) clqdVar.instance;
        b.getClass();
        clqeVar4.f = b;
        clqeVar4.b |= 2;
        return djgiVar.a((clqe) clqdVar.build());
    }

    @Override // defpackage.fbbs
    protected final ListenableFuture c() {
        return erqt.f(this.b.d(), this.c.d());
    }
}
