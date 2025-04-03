package defpackage;

import android.text.TextUtils;
import com.google.common.util.concurrent.ListenableFuture;
import io.grpc.Status;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cikn implements cikg {
    public static final cskc a = cskc.g("BugleNetworkRetry", "DittoRetryExecutorImpl");
    private static final enru m = enru.c("com/google/android/apps/messaging/shared/net/retry/ditto/DittoRetryExecutorImpl");
    public final errl b;

    @Deprecated
    public final chrv c;
    public final fazb d;
    public final fazb e;
    public final fazb f;
    public final akzt g;
    public final chga h;
    public final ffbr i;
    public final chdj j;
    public final chhw k;
    public final ffbr l;
    private final fazb n;
    private final ffbr o;

    public cikn(errl errlVar, chrv chrvVar, fazb fazbVar, fazb fazbVar2, fazb fazbVar3, akzt akztVar, chga chgaVar, ffbr ffbrVar, ffbr ffbrVar2, chdj chdjVar, chhw chhwVar, fazb fazbVar4, ffbr ffbrVar3) {
        this.b = errlVar;
        this.c = chrvVar;
        this.d = fazbVar;
        this.e = fazbVar2;
        this.f = fazbVar3;
        this.g = akztVar;
        this.h = chgaVar;
        this.i = ffbrVar2;
        this.j = chdjVar;
        this.k = chhwVar;
        this.l = ffbrVar;
        this.n = fazbVar4;
        this.o = ffbrVar3;
    }

    private final elfl d(final chwv chwvVar, boolean z) {
        int i;
        esaa b = esaa.b(chwvVar.i.g);
        if (b == null) {
            b = esaa.UNRECOGNIZED;
        }
        if (b.equals(esaa.GET_UPDATES)) {
            try {
                erxi erxiVar = (erxi) eyfy.parseFrom(erxi.a, chwvVar.e, eyfc.a());
                int a2 = erxh.a(erxiVar.b);
                if (TextUtils.isEmpty(chwvVar.j)) {
                    chwvVar.j = chwvVar.c;
                }
                bzea bzeaVar = (bzea) chwvVar.a.b();
                String str = chwvVar.j;
                String str2 = chwvVar.i.b;
                String str3 = chwvVar.b.c;
                int a3 = esaa.GET_UPDATES.a();
                int i2 = a2 - 1;
                if (a2 == 0) {
                    throw null;
                }
                if (a2 == 7) {
                    esea b2 = esea.b((erxiVar.b == 6 ? (esec) erxiVar.c : esec.a).b);
                    if (b2 == null) {
                        b2 = esea.UNRECOGNIZED;
                    }
                    i = b2.a();
                } else {
                    i = -1;
                }
                bzeaVar.j(str, str2, str3, a3, i2, i, chwvVar.c);
            } catch (eygu e) {
                csjy.h("BugleNetworkRetry", e, "Failed to unmarshall GetUpdatesResponse");
            }
        } else {
            bzea bzeaVar2 = (bzea) chwvVar.a.b();
            ervk ervkVar = chwvVar.i;
            bzeaVar2.l(ervkVar.b, chwvVar.b.c, ervkVar.g, chwvVar.c);
        }
        for (bzhr bzhrVar : (Set) this.n.b()) {
            if (!bzhrVar.b()) {
                ensk e2 = m.e();
                e2.Y(ente.a, "BugleNetworkRetry");
                ((enrr) ((enrr) e2).h("com/google/android/apps/messaging/shared/net/retry/ditto/DittoRetryExecutorImpl", "areDittoRpcsEnabled", 228, "DittoRetryExecutorImpl.java")).t("Ignoring execute RPC with reason %s", bzhrVar.a());
                ((bzea) this.o.b()).d(bzhrVar.a().d);
                return elfo.c();
            }
        }
        final chdj chdjVar = ((cgcu) this.l.b()).a() ? (chdj) this.i.b() : this.j;
        elfl i3 = c(chwvVar, chdjVar.s()).f(Throwable.class, new eroh() { // from class: cikk
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                Throwable th = (Throwable) obj;
                if (chfh.a(th) != Status.Code.UNAUTHENTICATED) {
                    return elfo.d(th);
                }
                chdj chdjVar2 = chdjVar;
                chwv chwvVar2 = chwvVar;
                cikn ciknVar = cikn.this;
                cikn.a.m("Handle UNAUTHENTICATED error by immediately refreshing registration.");
                return ciknVar.c(chwvVar2, chdjVar2.l(cgwm.FORCE_REFRESH));
            }
        }, this.b).i(new eroh() { // from class: cikl
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                chwv chwvVar2 = chwv.this;
                ListenableFuture e3 = chwvVar2.e((fbzx) obj);
                chwvVar2.j();
                return e3;
            }
        }, erpp.a);
        elfr.l(i3, new cikm(this, chwvVar, z), this.b);
        return i3;
    }

    @Override // defpackage.cikg
    public final elfl a(chwv chwvVar) {
        this.g.c("Bugle.Ditto.RetryExecutor.Rpc.Execution.Count");
        return d(chwvVar, true);
    }

    @Override // defpackage.cikg
    public final elfl b(chwv chwvVar) {
        return d(chwvVar, false);
    }

    public final elfl c(final chwv chwvVar, elfl elflVar) {
        return elflVar.i(new eroh() { // from class: cikh
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                fcdu fcduVar = (fcdu) obj;
                fcduVar.getClass();
                cikn ciknVar = cikn.this;
                boolean a2 = ((cgcu) ciknVar.l.b()).a();
                chwv chwvVar2 = chwvVar;
                fcfn a3 = ciknVar.h.a(a2 ? chwvVar2.p() : "Bugle");
                eyee eyeeVar = fcduVar.b;
                a3.copyOnWrite();
                fcfo fcfoVar = (fcfo) a3.instance;
                fcfo fcfoVar2 = fcfo.a;
                eyeeVar.getClass();
                fcfoVar.f = eyeeVar;
                return chwvVar2.c((fcfo) a3.build());
            }
        }, this.b).i(new eroh() { // from class: ciki
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                fbzv fbzvVar = (fbzv) obj;
                fbzvVar.getClass();
                long serializedSize = fbzvVar.getSerializedSize();
                cikn ciknVar = cikn.this;
                ciknVar.g.g("Bugle.Network.Rpc.Request.Size.Bytes", serializedSize);
                chwv chwvVar2 = chwvVar;
                chwvVar2.i();
                return chwvVar2.d(ciknVar.c, fbzvVar);
            }
        }, this.b);
    }
}
