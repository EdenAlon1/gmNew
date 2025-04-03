package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import io.grpc.Status;
import java.util.List;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dzew implements dzgg {
    private final dzja a;
    private final List b;

    public dzew(dzja dzjaVar, List list) {
        this.a = dzjaVar;
        this.b = list;
    }

    @Override // defpackage.dzgg
    public final ListenableFuture a(fcfo fcfoVar) {
        fbyf fbyfVar = (fbyf) fbyg.a.createBuilder();
        fbyfVar.copyOnWrite();
        fbyg fbygVar = (fbyg) fbyfVar.instance;
        fcfoVar.getClass();
        fbygVar.c = fcfoVar;
        fbygVar.b |= 1;
        int i = dzee.a;
        engr engrVar = new engr();
        for (String str : this.b) {
            dzja dzjaVar = this.a;
            fcff fcffVar = (fcff) fcfg.a.createBuilder();
            fcffVar.copyOnWrite();
            fcfg fcfgVar = (fcfg) fcffVar.instance;
            str.getClass();
            fcfgVar.c = str;
            fcek c = dzdx.c(dzjaVar.c().f());
            fcffVar.copyOnWrite();
            fcfg fcfgVar2 = (fcfg) fcffVar.instance;
            c.getClass();
            fcfgVar2.d = c;
            fcfgVar2.b |= 1;
            engrVar.h((fcfg) fcffVar.build());
        }
        engw g = engrVar.g();
        fbyfVar.copyOnWrite();
        fbyg fbygVar2 = (fbyg) fbyfVar.instance;
        fbygVar2.a();
        eydl.addAll(g, fbygVar2.d);
        return erqt.i((fbyg) fbyfVar.build());
    }

    @Override // defpackage.dzgg
    public final /* bridge */ /* synthetic */ ListenableFuture b(ListenableFuture listenableFuture, Object obj) {
        final fbyg fbygVar = (fbyg) obj;
        return erny.g(listenableFuture, new eroh() { // from class: dzev
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj2) {
                return ((fbot) obj2).b(fbyg.this);
            }
        }, erpp.a);
    }

    @Override // defpackage.dzgg
    public final /* bridge */ /* synthetic */ Object c(Object obj) {
        return null;
    }

    @Override // defpackage.dzgg
    public final void d(UUID uuid, int i, Status status, dyyt dyytVar, long j) {
        dzhl r = dzhm.r();
        r.g(10003);
        r.n(this.a.c().f());
        r.o(this.a.d().E());
        r.p(uuid.toString());
        r.j(13);
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
        r.j(13);
        r.f(1);
        r.e(j);
        dyytVar.b(r.a());
    }
}
