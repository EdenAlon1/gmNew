package defpackage;

import android.content.Context;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dkip extends dkie {
    private static final long p = TimeUnit.MINUTES.toMillis(1);
    public final dkls i;
    public final Map j;
    public final ctvb k;
    public final dkib l;
    public final dkiq m;
    public final dkhz n;
    public final diul o;
    private final ditq q;
    private volatile int r;
    private final Runnable s;
    private final dklu t;

    public dkip(djjr djjrVar, dkhc dkhcVar, dkii dkiiVar, diul diulVar, dkls dklsVar, Context context, ctvb ctvbVar, dkib dkibVar, dkur dkurVar, dkiq dkiqVar, dkhz dkhzVar) {
        super(djjrVar, dkhcVar, dkiiVar, dkurVar);
        this.j = new ConcurrentHashMap();
        this.r = 0;
        this.s = new dkim(this);
        dkin dkinVar = new dkin(this);
        this.t = dkinVar;
        this.i = dklsVar;
        dklsVar.g.add(dkinVar);
        this.o = diulVar;
        this.q = ditq.a(context, "capability_publishing");
        this.k = ctvbVar;
        this.l = dkibVar;
        this.m = dkiqVar;
        this.n = dkhzVar;
    }

    @Override // defpackage.dkgm
    public final void e() {
        w(0L);
    }

    @Override // defpackage.dkgm
    public final void g(dilc dilcVar) {
        try {
            this.q.b();
            v();
            dkty.c("Unpublishing presence capabilities for %s", dktx.USER_ID.c(this.a.c().mUserName));
            dkls dklsVar = this.i;
            dklsVar.b();
            dkgf dkgfVar = dklsVar.j;
            if (dkgfVar != null) {
                try {
                    if (dkgfVar.i == 1) {
                        throw new IllegalStateException("unpublish() cannot be called in the PENDING state!");
                    }
                    dkgfVar.i = 1;
                    dkgfVar.e = 0;
                    dkgfVar.d.a();
                    try {
                        eehy eehyVar = ((eehz) dkgfVar.a).a;
                        eehyVar.k(dkgfVar.b.d(eehyVar, dkgfVar.d, dkgfVar.c, dkgfVar.e, dkgfVar.g, null, new byte[0]), dkgfVar.h);
                    } catch (eejg e) {
                        dkty.i(e, "Error while creating sip request: %s", e.getMessage());
                        dkgfVar.i = 3;
                    }
                } catch (Exception e2) {
                    throw new dklt("Error while unpublishing presence: ".concat(String.valueOf(e2.getMessage())), e2);
                }
            }
        } catch (dklt e3) {
            dkty.g("Can't send un-Publish for Presence: %s", e3.getMessage());
        }
        this.j.clear();
    }

    @Override // defpackage.dkie
    public final void s(String str, long j, String str2) {
        if (str2 == null) {
            throw new IllegalArgumentException("MSISDN must not be null.");
        }
        dkty.c("Adding pending request for presence capability for %s", dktx.PHONE_NUMBER.c(str2));
        this.j.put(str2, new dkio(Long.valueOf(j)));
        try {
            dkls dklsVar = this.i;
            try {
                dklv dklvVar = dklsVar.i;
                if (dklvVar != null) {
                    dklvVar.i(dklsVar.p);
                }
                dklsVar.i = new dklv(dklsVar, dklsVar.h, dkut.l(str2, dklsVar.a.c(), dklsVar.l), dklsVar.f);
                dklv dklvVar2 = dklsVar.i;
                dklvVar2.f = "application/pidf+xml, application/rlmi+xml, multipart/related";
                dklvVar2.k = 0;
                dklvVar2.l = dkvj.a().longValue();
                dklsVar.i.d(dklsVar.p);
                dklsVar.i.m();
            } catch (Exception e) {
                throw new dklt("Error while sending presence subscription ", e);
            }
        } catch (dklt unused) {
            throw new eejg("Error requesting presence capability for ".concat(String.valueOf(dktx.PHONE_NUMBER.c(str2))));
        }
    }

    @Override // defpackage.dkie
    public final void t(String str) {
        if (this.j.containsKey(str)) {
            dkty.c("Presence Capabilities request for %s already pending", dktx.PHONE_NUMBER.c(str));
        } else {
            s(null, 0L, str);
        }
    }

    public final synchronized long u() {
        int i;
        i = this.r;
        this.r = i + 1;
        long[] jArr = dilb.a;
        return dilb.a[Math.min(i, 15)] / 1000;
    }

    public final void v() {
        dkty.c("Resetting retry counter for publishing capabilities", new Object[0]);
        this.r = 0;
    }

    protected final void w(long j) {
        dkty.c("Scheduling publishing of capabilities with delay %d", Long.valueOf(j));
        Thread b = dkwa.a().b("capability_publishing", this.s, p);
        if (this.q.e()) {
            dkty.c("Cancelling alarm timer before starting a new schedule", new Object[0]);
            this.q.b();
        }
        dkty.c("Scheduling the capability publishing thread", new Object[0]);
        this.q.d(b, j);
    }

    @Override // defpackage.dkgm
    public final void n() {
    }

    @Override // defpackage.dkgm
    public final void o() {
    }
}
