package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import io.grpc.Status;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dzgi implements dzgg {
    private final dzja a;

    public dzgi(dzja dzjaVar) {
        this.a = dzjaVar;
    }

    @Override // defpackage.dzgg
    public final ListenableFuture a(fcfo fcfoVar) {
        fcdj fcdjVar = (fcdj) fcdk.a.createBuilder();
        fcdjVar.copyOnWrite();
        fcdk fcdkVar = (fcdk) fcdjVar.instance;
        fcfoVar.getClass();
        fcdkVar.c = fcfoVar;
        fcdkVar.b |= 1;
        return erqt.i((fcdk) fcdjVar.build());
    }

    @Override // defpackage.dzgg
    public final /* bridge */ /* synthetic */ ListenableFuture b(ListenableFuture listenableFuture, Object obj) {
        final fcdk fcdkVar = (fcdk) obj;
        return erny.g(listenableFuture, new eroh() { // from class: dzgh
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj2) {
                return ((fbqa) obj2).e(fcdk.this);
            }
        }, erpp.a);
    }

    @Override // defpackage.dzgg
    public final /* synthetic */ Object c(Object obj) {
        dyif dyifVar = new dyif();
        dyifVar.a = 1;
        return dyifVar.a();
    }

    @Override // defpackage.dzgg
    public final void d(UUID uuid, int i, Status status, dyyt dyytVar, long j) {
        dzhl r = dzhm.r();
        r.g(10003);
        r.n(this.a.c().f());
        r.o(this.a.d().E());
        r.p(uuid.toString());
        r.j(4);
        r.m(Integer.valueOf(status.getCode().value()));
        r.f(i);
        r.e(j);
        dyytVar.b(r.a());
    }

    @Override // defpackage.dzgg
    public final /* bridge */ /* synthetic */ void e(UUID uuid, Object obj, dyyt dyytVar, long j) {
        dzhl r = dzhm.r();
        r.g(10003);
        r.n(this.a.c().f());
        r.o(this.a.d().E());
        r.p(uuid.toString());
        r.j(4);
        r.f(1);
        r.e(j);
        dyytVar.b(r.a());
    }
}
