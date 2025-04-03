package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ycn {
    public static final enru a = enru.c("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/data/DraftOpener");
    public final ffhd b;
    public final ffsk c;
    public final ydy d;
    public final yec e;
    public final ffbr f;
    public final ffbr g;
    public final ffbr h;
    public final ffbr i;
    public final ffbr j;
    public final llv k;
    public final ffbr l;
    public final ffbr m;
    private final ffbr n;
    private final ydb o;

    public ycn(ffhd ffhdVar, ffsk ffskVar, ydy ydyVar, yec yecVar, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ydb ydbVar, ffbr ffbrVar5, ffbr ffbrVar6, llv llvVar, ffbr ffbrVar7, ffbr ffbrVar8) {
        ffhdVar.getClass();
        ffskVar.getClass();
        yecVar.getClass();
        ydbVar.getClass();
        llvVar.getClass();
        ffbrVar7.getClass();
        ffbrVar8.getClass();
        this.b = ffhdVar;
        this.c = ffskVar;
        this.d = ydyVar;
        this.e = yecVar;
        this.f = ffbrVar;
        this.g = ffbrVar2;
        this.h = ffbrVar3;
        this.n = ffbrVar4;
        this.o = ydbVar;
        this.i = ffbrVar5;
        this.j = ffbrVar6;
        this.k = llvVar;
        this.l = ffbrVar7;
        this.m = ffbrVar8;
    }

    public final void a(final xhu xhuVar, final xhu xhuVar2) {
        final fflb fflbVar = new fflb();
        xhu b = this.o.b(new ffji() { // from class: ycf
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                ycd ycdVar;
                ycd ycdVar2;
                xhu xhuVar3 = (xhu) obj;
                xhuVar3.getClass();
                xhu xhuVar4 = true != xhuVar3.a() ? null : xhuVar3;
                fflb fflbVar2 = fflb.this;
                fflbVar2.a = xhuVar4;
                xhu xhuVar5 = (xhu) fflbVar2.a;
                xhu xhuVar6 = xhuVar2;
                if (xhuVar6 != null) {
                    ycdVar = new ycd(xhuVar6, true);
                } else {
                    if (xhuVar5 != null) {
                        ycdVar2 = new ycd(xhuVar5, false);
                    } else {
                        xhu xhuVar7 = xhuVar;
                        if (xhuVar7 != null) {
                            ycdVar2 = new ycd(xhuVar7, false);
                        } else {
                            ycdVar = new ycd(null, false);
                        }
                    }
                    ycdVar = ycdVar2;
                }
                xhu xhuVar8 = ycdVar.a;
                return xhuVar8 == null ? xhuVar3 : xhuVar8;
            }
        });
        ensk h = a.h();
        h.Y(ente.a, "BugleComposeRow2");
        ((enrr) h.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/data/DraftOpener", "initializeDraftState", 118, "DraftOpener.kt")).K("Draft merge chose %s, with user: %s, incoming: %s, persisted: %s", b, fflbVar.a, xhuVar2, xhuVar);
        ((abam) this.n.b()).b();
    }
}
