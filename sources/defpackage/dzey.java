package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import io.grpc.Status;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dzey implements dzgg {
    private final long a;
    private final dzja b;

    public dzey(long j, dzja dzjaVar) {
        this.a = j;
        this.b = dzjaVar;
    }

    @Override // defpackage.dzgg
    public final ListenableFuture a(fcfo fcfoVar) {
        fbgx fbgxVar = (fbgx) fbgy.a.createBuilder();
        fbgxVar.copyOnWrite();
        fbgy fbgyVar = (fbgy) fbgxVar.instance;
        fcfoVar.getClass();
        fbgyVar.c = fcfoVar;
        fbgyVar.b |= 1;
        fbgxVar.copyOnWrite();
        ((fbgy) fbgxVar.instance).d = this.a;
        return erqt.i((fbgy) fbgxVar.build());
    }

    @Override // defpackage.dzgg
    public final /* bridge */ /* synthetic */ ListenableFuture b(ListenableFuture listenableFuture, Object obj) {
        final fbgy fbgyVar = (fbgy) obj;
        return erny.g(listenableFuture, new eroh() { // from class: dzex
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj2) {
                fbgv fbgvVar = (fbgv) obj2;
                fdxk fdxkVar = fbgvVar.a;
                febs febsVar = fbgw.b;
                if (febsVar == null) {
                    synchronized (fbgw.class) {
                        febsVar = fbgw.b;
                        if (febsVar == null) {
                            febp a = febs.a();
                            a.c = febr.UNARY;
                            a.d = febs.c("google.internal.communications.instantmessaging.v1.LighterCloudMessageService", "CheckBootstrapRequired");
                            a.b();
                            fbgy fbgyVar2 = fbgy.a;
                            eyfc eyfcVar = ffag.a;
                            a.a = new ffae(fbgyVar2);
                            a.b = new ffae(fbha.a);
                            febsVar = a.a();
                            fbgw.b = febsVar;
                        }
                    }
                }
                return ffat.a(fdxkVar.a(febsVar, fbgvVar.b), fbgy.this);
            }
        }, erpp.a);
    }

    @Override // defpackage.dzgg
    public final /* bridge */ /* synthetic */ Object c(Object obj) {
        fbha fbhaVar = (fbha) obj;
        long j = fbhaVar.c;
        int i = fbhaVar.b;
        int i2 = i != 0 ? i != 1 ? i != 2 ? 0 : 4 : 3 : 2;
        if (i2 == 0) {
            i2 = 1;
        }
        if (i2 != 1) {
            return new dyqa(j, i2 - 2);
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Override // defpackage.dzgg
    public final void d(UUID uuid, int i, Status status, dyyt dyytVar, long j) {
        dzhl r = dzhm.r();
        r.g(10003);
        r.n(this.b.c().f());
        r.o(this.b.d().E());
        r.p(uuid.toString());
        r.j(25);
        r.m(Integer.valueOf(status.getCode().value()));
        r.f(i);
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
        r.j(25);
        r.f(1);
        r.e(j);
        dyytVar.b(r.a());
    }
}
