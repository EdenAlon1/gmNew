package defpackage;

import android.text.TextUtils;
import com.google.common.util.concurrent.ListenableFuture;
import io.grpc.Status;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dzfd implements dzgg {
    public final dzja a;
    private final int b;
    private final String c;

    public dzfd(dzja dzjaVar, int i, String str) {
        this.a = dzjaVar;
        this.b = i;
        this.c = str;
    }

    @Override // defpackage.dzgg
    public final ListenableFuture a(fcfo fcfoVar) {
        fbfo fbfoVar = (fbfo) fbfp.a.createBuilder();
        fbfoVar.copyOnWrite();
        fbfp fbfpVar = (fbfp) fbfoVar.instance;
        fcfoVar.getClass();
        fbfpVar.c = fcfoVar;
        fbfpVar.b |= 1;
        fbfoVar.copyOnWrite();
        ((fbfp) fbfoVar.instance).d = this.b;
        if (!TextUtils.isEmpty(this.c)) {
            String str = this.c;
            fbfoVar.copyOnWrite();
            fbfp fbfpVar2 = (fbfp) fbfoVar.instance;
            str.getClass();
            fbfpVar2.e = str;
        }
        return erqt.i((fbfp) fbfoVar.build());
    }

    @Override // defpackage.dzgg
    public final /* bridge */ /* synthetic */ ListenableFuture b(ListenableFuture listenableFuture, Object obj) {
        final fbfp fbfpVar = (fbfp) obj;
        return erny.g(listenableFuture, new eroh() { // from class: dzfc
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj2) {
                fbfm fbfmVar = (fbfm) obj2;
                fdxk fdxkVar = fbfmVar.a;
                febs febsVar = fbfn.a;
                if (febsVar == null) {
                    synchronized (fbfn.class) {
                        febsVar = fbfn.a;
                        if (febsVar == null) {
                            febp a = febs.a();
                            a.c = febr.UNARY;
                            a.d = febs.c("google.internal.communications.instantmessaging.v1.LighterBlock", "GetBlockedConversations");
                            a.b();
                            fbfp fbfpVar2 = fbfp.a;
                            eyfc eyfcVar = ffag.a;
                            a.a = new ffae(fbfpVar2);
                            a.b = new ffae(fbfr.a);
                            febsVar = a.a();
                            fbfn.a = febsVar;
                        }
                    }
                }
                return ffat.a(fdxkVar.a(febsVar, fbfmVar.b), fbfp.this);
            }
        }, erpp.a);
    }

    @Override // defpackage.dzgg
    public final /* bridge */ /* synthetic */ Object c(Object obj) {
        fbfr fbfrVar = (fbfr) obj;
        dyib dyibVar = new dyib();
        dyibVar.c(fbfrVar.c);
        dyibVar.b(engw.n(enkr.g(fbfrVar.b, new emwl() { // from class: dzfb
            @Override // defpackage.emwl
            public final Object apply(Object obj2) {
                return dzea.a(dzfd.this.a, (fbhy) obj2);
            }
        })));
        return dyibVar.a();
    }

    @Override // defpackage.dzgg
    public final void d(UUID uuid, int i, Status status, dyyt dyytVar, long j) {
        dzhl r = dzhm.r();
        r.g(10003);
        r.n(this.a.c().f());
        r.o(this.a.d().E());
        r.p(uuid.toString());
        r.j(8);
        r.f(i);
        r.m(Integer.valueOf(status.getCode().value()));
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
        r.j(8);
        r.f(1);
        r.e(j);
        dyytVar.b(r.a());
    }
}
