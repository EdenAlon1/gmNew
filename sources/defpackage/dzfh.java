package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import io.grpc.Status;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dzfh implements dzgg {
    private final dzja a;
    private final fbik b;

    public dzfh(dzja dzjaVar, dzpg dzpgVar) {
        this.a = dzjaVar;
        this.b = dzec.b(dzpgVar);
    }

    @Override // defpackage.dzgg
    public final ListenableFuture a(fcfo fcfoVar) {
        fbod fbodVar = (fbod) fboe.a.createBuilder();
        fbodVar.copyOnWrite();
        fboe fboeVar = (fboe) fbodVar.instance;
        fcfoVar.getClass();
        fboeVar.c = fcfoVar;
        fboeVar.b |= 1;
        fbodVar.copyOnWrite();
        fboe fboeVar2 = (fboe) fbodVar.instance;
        fbik fbikVar = this.b;
        fbikVar.getClass();
        fboeVar2.d = fbikVar;
        fboeVar2.b |= 2;
        return erqt.i((fboe) fbodVar.build());
    }

    @Override // defpackage.dzgg
    public final /* bridge */ /* synthetic */ ListenableFuture b(ListenableFuture listenableFuture, Object obj) {
        final fboe fboeVar = (fboe) obj;
        return erny.g(listenableFuture, new eroh() { // from class: dzfg
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj2) {
                fbob fbobVar = (fbob) obj2;
                fdxk fdxkVar = fbobVar.a;
                febs febsVar = fboc.a;
                if (febsVar == null) {
                    synchronized (fboc.class) {
                        febsVar = fboc.a;
                        if (febsVar == null) {
                            febp a = febs.a();
                            a.c = febr.UNARY;
                            a.d = febs.c("google.internal.communications.instantmessaging.v1.LighterUserPropertiesService", "GetUserProperties");
                            a.b();
                            fboe fboeVar2 = fboe.a;
                            eyfc eyfcVar = ffag.a;
                            a.a = new ffae(fboeVar2);
                            a.b = new ffae(fbog.a);
                            febsVar = a.a();
                            fboc.a = febsVar;
                        }
                    }
                }
                return ffat.a(fdxkVar.a(febsVar, fbobVar.b), fboe.this);
            }
        }, erpp.a);
    }

    @Override // defpackage.dzgg
    public final /* bridge */ /* synthetic */ Object c(Object obj) {
        fbnz fbnzVar = ((fbog) obj).b;
        if (fbnzVar == null) {
            fbnzVar = fbnz.a;
        }
        return new dypz(dzed.a(fbnzVar));
    }

    @Override // defpackage.dzgg
    public final void d(UUID uuid, int i, Status status, dyyt dyytVar, long j) {
        dzhl r = dzhm.r();
        r.g(10003);
        r.n(this.a.c().f());
        r.o(this.a.d().E());
        r.p(uuid.toString());
        r.j(47);
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
        r.j(47);
        r.f(1);
        r.e(j);
        dyytVar.b(r.a());
    }
}
