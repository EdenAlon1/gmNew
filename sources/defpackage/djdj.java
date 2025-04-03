package defpackage;

import com.google.android.rcs.client.messaging.data.Message;
import com.google.android.rcs.client.messaging.data.TraceId;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djdj extends fbbs {
    private final fbbm b;
    private final fbbm c;
    private final fbbm d;
    private final fbbm e;
    private final fbbm f;

    public djdj(fbbf fbbfVar, fbbf fbbfVar2, fbbm fbbmVar, fbbm fbbmVar2, fbbm fbbmVar3, fbbm fbbmVar4, fbbm fbbmVar5) {
        super(fbbfVar2, new fbcd(djdj.class), fbbfVar);
        this.b = fbbz.c(fbbmVar);
        this.c = fbbz.c(fbbmVar2);
        this.d = fbbz.c(fbbmVar3);
        this.e = fbbz.c(fbbmVar4);
        this.f = fbbz.c(fbbmVar5);
    }

    @Override // defpackage.fbbs
    public final /* bridge */ /* synthetic */ ListenableFuture b(Object obj) {
        Optional empty;
        List list = (List) obj;
        Optional optional = (Optional) list.get(0);
        clns clnsVar = (clns) list.get(1);
        eind eindVar = (eind) list.get(2);
        TraceId traceId = (TraceId) list.get(3);
        einl einlVar = (einl) list.get(4);
        diyy diyyVar = djdd.a;
        if (optional.isPresent()) {
            clql clqlVar = (clql) clqm.a.createBuilder();
            clsn clsnVar = (clsn) einlVar.m().fP(traceId);
            clqlVar.copyOnWrite();
            clqm clqmVar = (clqm) clqlVar.instance;
            clsnVar.getClass();
            clqmVar.c = clsnVar;
            clqmVar.b |= 1;
            clpc clpcVar = (clpc) eindVar.m().fP((Message) optional.get());
            clqlVar.copyOnWrite();
            clqm clqmVar2 = (clqm) clqlVar.instance;
            clpcVar.getClass();
            clqmVar2.e = clpcVar;
            clqmVar2.b |= 4;
            clqlVar.copyOnWrite();
            clqm clqmVar3 = (clqm) clqlVar.instance;
            clnsVar.getClass();
            clqmVar3.d = clnsVar;
            clqmVar3.b |= 2;
            empty = Optional.of((clqm) clqlVar.build());
        } else {
            empty = Optional.empty();
        }
        return erqt.i(empty);
    }

    @Override // defpackage.fbbs
    protected final ListenableFuture c() {
        fbbm fbbmVar = this.f;
        fbbm fbbmVar2 = this.e;
        fbbm fbbmVar3 = this.d;
        return erqt.f(this.b.d(), this.c.d(), fbbmVar3.d(), fbbmVar2.d(), fbbmVar.d());
    }
}
