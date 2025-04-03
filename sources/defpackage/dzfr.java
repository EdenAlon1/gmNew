package defpackage;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import io.grpc.Status;
import java.util.List;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dzfr implements dzgg {
    private final Context a;
    private final dzja b;
    private final dyjf c;

    public dzfr(Context context, dzja dzjaVar, dyjf dyjfVar) {
        this.a = context;
        this.b = dzjaVar;
        this.c = dyjfVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.dzgg
    public final ListenableFuture a(fcfo fcfoVar) {
        fbfv fbfvVar = (fbfv) fbfw.a.createBuilder();
        fbfvVar.copyOnWrite();
        fbfw fbfwVar = (fbfw) fbfvVar.instance;
        fcfoVar.getClass();
        fbfwVar.c = fcfoVar;
        fbfwVar.b |= 1;
        eyee d = this.b.d();
        fbfvVar.copyOnWrite();
        ((fbfw) fbfvVar.instance).d = d;
        List a = this.c.a();
        fbfvVar.copyOnWrite();
        fbfw fbfwVar2 = (fbfw) fbfvVar.instance;
        eygi eygiVar = fbfwVar2.e;
        if (!eygiVar.c()) {
            fbfwVar2.e = eyfy.mutableCopy(eygiVar);
        }
        enqv it = ((engw) a).iterator();
        while (it.hasNext()) {
            fbfwVar2.e.h(((Integer) it.next()).intValue());
        }
        String a2 = dyhq.a(this.a);
        fbfvVar.copyOnWrite();
        fbfw fbfwVar3 = (fbfw) fbfvVar.instance;
        a2.getClass();
        fbfwVar3.f = a2;
        return erqt.i((fbfw) fbfvVar.build());
    }

    @Override // defpackage.dzgg
    public final /* bridge */ /* synthetic */ ListenableFuture b(ListenableFuture listenableFuture, Object obj) {
        final fbfw fbfwVar = (fbfw) obj;
        return erny.g(listenableFuture, new eroh() { // from class: dzfq
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj2) {
                fbft fbftVar = (fbft) obj2;
                fdxk fdxkVar = fbftVar.a;
                febs febsVar = fbfu.a;
                if (febsVar == null) {
                    synchronized (fbfu.class) {
                        febsVar = fbfu.a;
                        if (febsVar == null) {
                            febp a = febs.a();
                            a.c = febr.UNARY;
                            a.d = febs.c("google.internal.communications.instantmessaging.v1.LighterCapabilities", "RegisterCapabilities");
                            a.b();
                            fbfw fbfwVar2 = fbfw.a;
                            eyfc eyfcVar = ffag.a;
                            a.a = new ffae(fbfwVar2);
                            a.b = new ffae(fbfy.a);
                            febsVar = a.a();
                            fbfu.a = febsVar;
                        }
                    }
                }
                return ffat.a(fdxkVar.a(febsVar, fbftVar.b), fbfw.this);
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
        r.n(this.b.c().f());
        r.o(this.b.d().E());
        r.p(uuid.toString());
        r.j(20);
        r.f(i);
        r.m(Integer.valueOf(status.getCode().value()));
        r.e(j);
        dyytVar.b(r.a());
    }

    @Override // defpackage.dzgg
    public final /* bridge */ /* synthetic */ void e(UUID uuid, Object obj, dyyt dyytVar, long j) {
        dzhl r = dzhm.r();
        r.g(10003);
        r.n(this.b.c().f());
        r.o(this.b.d().E());
        r.p(uuid.toString());
        r.j(20);
        r.f(1);
        r.e(j);
        dyytVar.b(r.a());
    }
}
