package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import io.grpc.Status;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dzgx implements dzgg {
    private final dzja a;
    private final String b;
    private final dzqs c;

    public dzgx(dzja dzjaVar, String str, dzqs dzqsVar) {
        this.a = dzjaVar;
        this.b = str;
        this.c = dzqsVar;
    }

    @Override // defpackage.dzgg
    public final ListenableFuture a(fcfo fcfoVar) {
        fbdg fbdgVar = (fbdg) fbdh.a.createBuilder();
        fbdgVar.copyOnWrite();
        fbdh fbdhVar = (fbdh) fbdgVar.instance;
        fcfoVar.getClass();
        fbdhVar.c = fcfoVar;
        fbdhVar.b |= 1;
        fbdgVar.copyOnWrite();
        ((fbdh) fbdgVar.instance).d = 1;
        fbde fbdeVar = (fbde) fbdf.a.createBuilder();
        fbdeVar.copyOnWrite();
        fbdf fbdfVar = (fbdf) fbdeVar.instance;
        fbdfVar.b = 1;
        fbdfVar.c = this.b;
        fbdgVar.copyOnWrite();
        fbdh fbdhVar2 = (fbdh) fbdgVar.instance;
        fbdf fbdfVar2 = (fbdf) fbdeVar.build();
        fbdfVar2.getClass();
        fbdhVar2.e = fbdfVar2;
        fbdhVar2.b |= 2;
        fbdgVar.copyOnWrite();
        ((fbdh) fbdgVar.instance).f = fbdb.a(5);
        return erqt.i((fbdh) fbdgVar.build());
    }

    @Override // defpackage.dzgg
    public final /* bridge */ /* synthetic */ ListenableFuture b(ListenableFuture listenableFuture, Object obj) {
        final fbdh fbdhVar = (fbdh) obj;
        return erny.g(listenableFuture, new eroh() { // from class: dzgw
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj2) {
                return ((fbqm) obj2).b(fbdh.this);
            }
        }, erpp.a);
    }

    @Override // defpackage.dzgg
    public final /* bridge */ /* synthetic */ Object c(Object obj) {
        fbdj fbdjVar = (fbdj) obj;
        int i = dzhb.i;
        dzgy dzgyVar = new dzgy();
        fbdd fbddVar = fbdjVar.b;
        if (fbddVar == null) {
            fbddVar = fbdd.a;
        }
        dzgyVar.i((fbddVar.b == 1 ? (fbdl) fbddVar.c : fbdl.a).c);
        fbdd fbddVar2 = fbdjVar.b;
        if (fbddVar2 == null) {
            fbddVar2 = fbdd.a;
        }
        dzgyVar.c((fbddVar2.b == 1 ? (fbdl) fbddVar2.c : fbdl.a).d);
        fbdd fbddVar3 = fbdjVar.b;
        if (fbddVar3 == null) {
            fbddVar3 = fbdd.a;
        }
        dzgyVar.g((fbddVar3.b == 1 ? (fbdl) fbddVar3.c : fbdl.a).e);
        fbdd fbddVar4 = fbdjVar.b;
        if (fbddVar4 == null) {
            fbddVar4 = fbdd.a;
        }
        dzgyVar.d((fbddVar4.b == 1 ? (fbdl) fbddVar4.c : fbdl.a).f);
        fbdd fbddVar5 = fbdjVar.b;
        if (fbddVar5 == null) {
            fbddVar5 = fbdd.a;
        }
        dzgyVar.b((fbddVar5.b == 1 ? (fbdl) fbddVar5.c : fbdl.a).g);
        dzgyVar.h(dzgl.b(this.c));
        if (fdql.l()) {
            dyhj.a();
            dzgyVar.e(System.currentTimeMillis() + TimeUnit.DAYS.toMillis(29L));
        }
        return new dzgs(this.c.r(), dzgyVar.a());
    }

    @Override // defpackage.dzgg
    public final void d(UUID uuid, int i, Status status, dyyt dyytVar, long j) {
        dzhl r = dzhm.r();
        r.g(10003);
        r.n(this.a.c().f());
        r.o(this.a.d().E());
        r.p(uuid.toString());
        r.j(88);
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
        r.j(88);
        r.f(1);
        r.e(j);
        dyytVar.b(r.a());
    }
}
