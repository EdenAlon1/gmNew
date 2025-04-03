package defpackage;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import io.grpc.Status;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dzff implements dzgg {
    private final Context a;
    private final dzja b;
    private final fbik c;
    private final emxc d;
    private final emxc e;
    private final eyee f;

    public dzff(Context context, dzja dzjaVar, dzpg dzpgVar) {
        this.a = context;
        this.b = dzjaVar;
        this.c = dzec.b(dzpgVar);
        this.d = emxc.j(dzpgVar);
        this.e = emux.a;
        this.f = eyee.b;
    }

    @Override // defpackage.dzgg
    public final ListenableFuture a(fcfo fcfoVar) {
        ezjg ezjgVar = (ezjg) ezjh.a.createBuilder();
        ezjgVar.copyOnWrite();
        ezjh ezjhVar = (ezjh) ezjgVar.instance;
        fcfoVar.getClass();
        ezjhVar.c = fcfoVar;
        ezjhVar.b |= 1;
        ezjgVar.copyOnWrite();
        ezjh ezjhVar2 = (ezjh) ezjgVar.instance;
        fbik fbikVar = this.c;
        fbikVar.getClass();
        ezjhVar2.d = fbikVar;
        ezjhVar2.b |= 2;
        fbjd fbjdVar = (fbjd) fbje.a.createBuilder();
        String a = dyhq.a(this.a);
        fbjdVar.copyOnWrite();
        fbje fbjeVar = (fbje) fbjdVar.instance;
        a.getClass();
        fbjeVar.b = a;
        fbje fbjeVar2 = (fbje) fbjdVar.build();
        ezjgVar.copyOnWrite();
        ezjh ezjhVar3 = (ezjh) ezjgVar.instance;
        fbjeVar2.getClass();
        ezjhVar3.e = fbjeVar2;
        ezjhVar3.b |= 4;
        ezjgVar.copyOnWrite();
        ezjh ezjhVar4 = (ezjh) ezjgVar.instance;
        eyee eyeeVar = this.f;
        eyeeVar.getClass();
        ezjhVar4.f = eyeeVar;
        return erqt.i((ezjh) ezjgVar.build());
    }

    @Override // defpackage.dzgg
    public final /* bridge */ /* synthetic */ ListenableFuture b(ListenableFuture listenableFuture, Object obj) {
        final ezjh ezjhVar = (ezjh) obj;
        return erny.g(listenableFuture, new eroh() { // from class: dzfe
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj2) {
                fbkf fbkfVar = (fbkf) obj2;
                fdxk fdxkVar = fbkfVar.a;
                febs febsVar = fbkg.b;
                if (febsVar == null) {
                    synchronized (fbkg.class) {
                        febsVar = fbkg.b;
                        if (febsVar == null) {
                            febp a = febs.a();
                            a.c = febr.UNARY;
                            a.d = febs.c("google.internal.communications.instantmessaging.v1.LighterFrontend", "GetLighterProfile");
                            a.b();
                            ezjh ezjhVar2 = ezjh.a;
                            eyfc eyfcVar = ffag.a;
                            a.a = new ffae(ezjhVar2);
                            a.b = new ffae(ezjj.a);
                            febsVar = a.a();
                            fbkg.b = febsVar;
                        }
                    }
                }
                return ffat.a(fdxkVar.a(febsVar, fbkfVar.b), ezjh.this);
            }
        }, erpp.a);
    }

    @Override // defpackage.dzgg
    public final /* synthetic */ Object c(Object obj) {
        ezjj ezjjVar = (ezjj) obj;
        fbip fbipVar = ezjjVar.c;
        if (fbipVar == null) {
            fbipVar = fbip.a;
        }
        fbip fbipVar2 = fbipVar;
        dyyt a = dyyt.a(this.a);
        fcfq fcfqVar = ezjjVar.b;
        if (fcfqVar == null) {
            fcfqVar = fcfq.a;
        }
        dzav a2 = dzef.a(this.b, this.a, fbipVar2, a, fcfqVar.c);
        dypx dypxVar = new dypx();
        dypxVar.b = 2;
        dypxVar.a = emxc.j(a2);
        return dypxVar.a();
    }

    @Override // defpackage.dzgg
    public final void d(UUID uuid, int i, Status status, dyyt dyytVar, long j) {
        if (this.d.g()) {
            dzhl r = dzhm.r();
            r.g(10003);
            r.n(this.b.c().f());
            r.o(this.b.d().E());
            r.p(uuid.toString());
            r.c((dzpg) this.d.c());
            r.j(9);
            r.m(Integer.valueOf(status.getCode().value()));
            r.f(i);
            r.e(j);
            dyytVar.b(r.a());
            return;
        }
        dzhl r2 = dzhm.r();
        r2.g(10003);
        r2.n(this.b.c().f());
        r2.o(this.b.d().E());
        r2.p(uuid.toString());
        r2.d((dzpt) this.e.c());
        r2.m(Integer.valueOf(status.getCode().value()));
        r2.j(9);
        r2.f(i);
        r2.e(j);
        dyytVar.b(r2.a());
    }

    @Override // defpackage.dzgg
    public final /* bridge */ /* synthetic */ void e(UUID uuid, Object obj, dyyt dyytVar, long j) {
        if (this.d.g()) {
            dzhl r = dzhm.r();
            r.g(10003);
            r.n(this.b.c().f());
            r.o(this.b.d().E());
            r.p(uuid.toString());
            r.j(9);
            r.f(1);
            r.e(j);
            dyytVar.b(r.a());
            return;
        }
        dzhl r2 = dzhm.r();
        r2.g(10003);
        r2.n(this.b.c().f());
        r2.o(this.b.d().E());
        r2.p(uuid.toString());
        r2.d((dzpt) this.e.c());
        r2.j(9);
        r2.f(1);
        r2.e(j);
        dyytVar.b(r2.a());
    }

    public dzff(Context context, dzja dzjaVar, dzpt dzptVar, eyee eyeeVar) {
        fbik b;
        this.a = context;
        this.b = dzjaVar;
        if (dzptVar.e() == dzpq.GROUP) {
            fbij fbijVar = (fbij) fbik.a.createBuilder();
            fbijVar.copyOnWrite();
            ((fbik) fbijVar.instance).b = fbjw.a(6);
            String a = dzptVar.d().a();
            fbijVar.copyOnWrite();
            ((fbik) fbijVar.instance).e = a;
            String b2 = dzptVar.d().b();
            fbijVar.copyOnWrite();
            ((fbik) fbijVar.instance).c = b2;
            b = (fbik) fbijVar.build();
        } else {
            b = dzec.b(dzptVar.c());
        }
        this.c = b;
        this.e = emxc.j(dzptVar);
        this.d = emux.a;
        this.f = eyeeVar;
    }
}
