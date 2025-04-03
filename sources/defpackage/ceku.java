package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ceku implements cctm {
    public static final enru a = enru.c("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/restore/conversations/CmsRestoreConversationsWorkerAdapter");
    public final crty b;
    public final cbeq c;
    public final axmm d;
    public final cefc e;
    private final ccfd f;
    private final asik g;
    private final axkm h;
    private final errl i;
    private final errl j;
    private final errl k;
    private final aszr l;
    private final aszz m;

    public ceku(crty crtyVar, ccfd ccfdVar, cbeq cbeqVar, axkm axkmVar, axmm axmmVar, asik asikVar, errl errlVar, errl errlVar2, errl errlVar3, aszr aszrVar, aszz aszzVar, cefc cefcVar) {
        this.b = crtyVar;
        this.f = ccfdVar;
        this.c = cbeqVar;
        this.h = axkmVar;
        this.d = axmmVar;
        this.g = asikVar;
        this.i = errlVar;
        this.j = errlVar2;
        this.k = errlVar3;
        this.l = aszrVar;
        this.m = aszzVar;
        this.e = cefcVar;
    }

    @Override // defpackage.cctm
    public final axew a() {
        return axew.CONVERSATIONS;
    }

    @Override // defpackage.cctm
    public final bqkx b() {
        return bqkx.CONVERSATION;
    }

    @Override // defpackage.cctm
    public final ccdx c() {
        return this.f;
    }

    @Override // defpackage.cctm
    public final elfl d(String str) {
        return i(str, this.m.a());
    }

    @Override // defpackage.cctm
    public final elfl e(pot potVar) {
        return (this.l.a() && ((Boolean) ((cfup) csgj.U.get()).e()).booleanValue()) ? elfo.e(null) : elfo.g(new Callable() { // from class: cekm
            @Override // java.util.concurrent.Callable
            public final Object call() {
                ceku.this.c.a();
                return null;
            }
        }, this.i);
    }

    @Override // defpackage.cctm
    public final epfx f() {
        return epfx.RESTORE_CONVERSATION;
    }

    @Override // defpackage.cctm
    public final /* synthetic */ String g(Object obj) {
        return ((eswr) obj).c;
    }

    @Override // defpackage.cctm
    public final String h() {
        return "Conversations";
    }

    public final elfl i(final String str, final boolean z) {
        if (this.m.a()) {
            elfl b = this.e.b(str, eswr.class);
            if (b == null) {
                b = null;
            } else if (z) {
                b = this.e.a(b, new ffji() { // from class: cekt
                    @Override // defpackage.ffji
                    public final Object invoke(Object obj) {
                        return ceku.this.i((String) obj, false);
                    }
                }, eswr.class);
            }
            if (b != null) {
                return b;
            }
        }
        if (this.g.a()) {
            return this.h.m().i(new eroh() { // from class: cekp
                @Override // defpackage.eroh
                public final ListenableFuture a(Object obj) {
                    eyja eyjaVar = (eyja) obj;
                    boolean equals = eyjaVar.equals(eykm.c);
                    final ceku cekuVar = ceku.this;
                    String str2 = str;
                    boolean z2 = z;
                    if (equals) {
                        ensk e = ceku.a.e();
                        e.Y(ente.a, "BugleCms");
                        ((enrr) ((enrr) e).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/restore/conversations/CmsRestoreConversationsWorkerAdapter", "listCmsItems", 126, "CmsRestoreConversationsWorkerAdapter.java")).q("CmsRestoreConversationsWorkerAdapter: Cms Delta sync timestamp is not present.");
                        elfl D = cekuVar.b.D(str2);
                        return !z2 ? D : cekuVar.e.a(D, new ffji() { // from class: ceko
                            @Override // defpackage.ffji
                            public final Object invoke(Object obj2) {
                                return ceku.this.i((String) obj2, false);
                            }
                        }, eswr.class);
                    }
                    ensk h = ceku.a.h();
                    h.Y(ente.a, "BugleCms");
                    ((enrr) ((enrr) h).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/restore/conversations/CmsRestoreConversationsWorkerAdapter", "listCmsItems", 112, "CmsRestoreConversationsWorkerAdapter.java")).t("CmsRestoreConversationsWorkerAdapter: Passing delta sync timestamp %s in ListConversations.", eykm.i(eyjaVar));
                    elfl E = cekuVar.b.E(str2, eyjaVar);
                    return !z2 ? E : cekuVar.e.a(E, new ffji() { // from class: cekn
                        @Override // defpackage.ffji
                        public final Object invoke(Object obj2) {
                            return ceku.this.i((String) obj2, false);
                        }
                    }, eswr.class);
                }
            }, this.k).f(crtx.class, new eroh() { // from class: cekq
                @Override // defpackage.eroh
                public final ListenableFuture a(Object obj) {
                    ceku.this.d.g();
                    return erqt.h((crtx) obj);
                }
            }, this.j);
        }
        elfl f = this.b.D(str).f(crtx.class, new eroh() { // from class: cekr
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                ceku.this.d.g();
                return erqt.h((crtx) obj);
            }
        }, this.j);
        return z ? this.e.a(f, new ffji() { // from class: ceks
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                return ceku.this.i((String) obj, false);
            }
        }, eswr.class) : f;
    }
}
