package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class chsa implements ciin {
    private static final long a = TimeUnit.MINUTES.toMicros(5);
    private static final enru b = enru.c("com/google/android/apps/messaging/shared/net/handler/CmsInboxSendRpcHandler");
    private final Optional c;
    private final eskr d;
    private final fcek e;
    private final eyee f;
    private long h;
    private String g = "";
    private final ciih i = new ciih("CMS");

    public chsa(Optional optional, eskr eskrVar, fcek fcekVar, eyee eyeeVar) {
        this.c = optional;
        this.d = eskrVar;
        this.e = fcekVar;
        this.f = eyeeVar;
    }

    @Override // defpackage.ciin
    public final long a() {
        return this.h;
    }

    @Override // defpackage.ciin
    public final ciil b() {
        return this.i;
    }

    @Override // defpackage.ciin
    public final /* bridge */ /* synthetic */ ListenableFuture c(fcfo fcfoVar) {
        fcfoVar.getClass();
        String uuid = UUID.randomUUID().toString();
        uuid.getClass();
        this.g = fcfoVar.c;
        fcfn fcfnVar = (fcfn) fcfo.a.createBuilder(fcfoVar);
        fcfnVar.copyOnWrite();
        ((fcfo) fcfnVar.instance).e = this.i.a;
        eyfy build = fcfnVar.build();
        build.getClass();
        fbzu fbzuVar = (fbzu) fbzv.a.createBuilder();
        fbzuVar.copyOnWrite();
        fbzv fbzvVar = (fbzv) fbzuVar.instance;
        fbzvVar.f = (fcfo) build;
        fbzvVar.b |= 4;
        fbzuVar.copyOnWrite();
        fbzv fbzvVar2 = (fbzv) fbzuVar.instance;
        fbzvVar2.c = this.e;
        fbzvVar2.b |= 1;
        long j = a;
        fbzuVar.copyOnWrite();
        ((fbzv) fbzuVar.instance).g = j;
        fbzq fbzqVar = (fbzq) fbzt.a.createBuilder();
        fbzqVar.copyOnWrite();
        ((fbzt) fbzqVar.instance).c = uuid;
        fbzr fbzrVar = fbzr.STATUS;
        fbzqVar.copyOnWrite();
        ((fbzt) fbzqVar.instance).k = fbzrVar.a();
        fbzs fbzsVar = fbzs.CMS_RPC_MESSAGE;
        fbzqVar.copyOnWrite();
        ((fbzt) fbzqVar.instance).d = fbzsVar.a();
        eyee byteString = this.d.toByteString();
        fbzqVar.copyOnWrite();
        ((fbzt) fbzqVar.instance).e = byteString;
        fbzuVar.copyOnWrite();
        fbzv fbzvVar3 = (fbzv) fbzuVar.instance;
        fbzt fbztVar = (fbzt) fbzqVar.build();
        fbztVar.getClass();
        fbzvVar3.e = fbztVar;
        fbzvVar3.b |= 2;
        fbzuVar.a(this.f);
        elfl e = elfo.e(fbzuVar.build());
        e.getClass();
        return e;
    }

    @Override // defpackage.ciin
    public final /* bridge */ /* synthetic */ ListenableFuture d(chrv chrvVar, eyhs eyhsVar) {
        fbzv fbzvVar = (fbzv) eyhsVar;
        chrvVar.getClass();
        fbzvVar.getClass();
        fcfo fcfoVar = fbzvVar.f;
        if (fcfoVar == null) {
            fcfoVar = fcfo.a;
        }
        this.g = fcfoVar.c;
        if (!this.c.isPresent()) {
            throw new IllegalArgumentException("cmsGaiaMessagingGrpcProxy is not present");
        }
        ensk h = b.h();
        h.Y(ente.a, "BugleAlphaverse");
        ((enrr) h.h("com/google/android/apps/messaging/shared/net/handler/CmsInboxSendRpcHandler", "executeRpc", 78, "CmsInboxSendRpcHandler.kt")).q("Getting messaging grpc for cms");
        elfl e = ((chhw) this.c.get()).e(fbzvVar);
        e.getClass();
        return e;
    }

    @Override // defpackage.ciin
    public final /* bridge */ /* synthetic */ ListenableFuture e(eyhs eyhsVar) {
        fbzx fbzxVar = (fbzx) eyhsVar;
        fbzxVar.getClass();
        fcfq fcfqVar = fbzxVar.b;
        if (fcfqVar == null) {
            fcfqVar = fcfq.a;
        }
        this.h = fcfqVar.b;
        elfl e = elfo.e(fbzxVar);
        e.getClass();
        return e;
    }

    @Override // defpackage.ciin
    public final String f() {
        return "CmsInboxSendRpcHandler";
    }

    @Override // defpackage.ciin
    public final String g() {
        return this.g;
    }

    @Override // defpackage.ciin
    public final /* synthetic */ void h(Throwable th) {
        ciim.c(this);
    }

    @Override // defpackage.ciin
    public final /* synthetic */ void i() {
        ciim.a(this);
    }

    @Override // defpackage.ciin
    public final /* synthetic */ void j() {
        ciim.b(this);
    }

    @Override // defpackage.cijo
    public final void k() {
    }

    @Override // defpackage.cijo
    public final /* synthetic */ void l() {
    }
}
