package defpackage;

import j$.time.Duration;
import j$.time.Instant;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xqg implements dspq {
    private static final enru g = enru.c("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/directsend/ProjectionSpecComposeScreenClearcutLogger");
    public final cqoh a;
    public final epts b;
    public final eptm c;
    public final Instant d;
    public Instant e;
    public int f;
    private final ffji h;
    private final ffbz i;
    private final ydb j;

    public xqg(final ffbr ffbrVar, cqoh cqohVar, ydb ydbVar, epts eptsVar, eptm eptmVar, ffji ffjiVar) {
        ffbrVar.getClass();
        cqohVar.getClass();
        ydbVar.getClass();
        eptsVar.getClass();
        this.a = cqohVar;
        this.j = ydbVar;
        this.b = eptsVar;
        this.c = eptmVar;
        this.h = ffjiVar;
        this.i = ffca.a(new ffix() { // from class: xqf
            @Override // defpackage.ffix
            public final Object invoke() {
                return (aled) ffbr.this.b();
            }
        });
        this.d = cqohVar.f();
    }

    public final int a() {
        List<xhp> list = ((xhu) this.j.a.c()).b;
        int i = 0;
        if (list.isEmpty()) {
            return 0;
        }
        for (xhp xhpVar : list) {
            if ((xhpVar instanceof xho) && ((Boolean) this.h.invoke(((xho) xhpVar).a)).booleanValue() && (i = i + 1) < 0) {
                ffdx.k();
            }
        }
        return i;
    }

    public final aled b() {
        return (aled) this.i.a();
    }

    @Override // defpackage.dspq
    public final void e() {
        aled b = b();
        eptu eptuVar = eptu.FULL_SCREEN;
        eptk eptkVar = eptk.UNKNOWN_CLOSING_SOURCE;
        Integer valueOf = Integer.valueOf(a() - this.f);
        Instant instant = null;
        Duration a = null;
        if (this.e == null) {
            ensk i = g.i();
            i.Y(ente.a, "BugleComposeRow2");
            enrr enrrVar = (enrr) i;
            enrrVar.aa(ensy.MEDIUM);
            ((enrr) enrrVar.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/directsend/ProjectionSpecComposeScreenClearcutLogger", "resolveTimeSpent", 82, "ProjectionSpecComposeScreenClearcutLogger.kt")).q("Did not record an opening time");
        } else {
            Instant f = this.a.f();
            f.getClass();
            Instant instant2 = this.e;
            if (instant2 == null) {
                ffkj.c("openingTime");
            } else {
                instant = instant2;
            }
            a = ernl.a(f, instant);
        }
        b.c(this.b, eptuVar, eptkVar, valueOf, a, null);
    }

    @Override // defpackage.dspq
    public final void f() {
        throw null;
    }
}
