package defpackage;

import com.google.android.rcs.client.messaging.data.Conversation;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djdi extends fbbs {
    private final fbbm b;
    private final fbbm c;
    private final fbbm d;
    private final fbbm e;
    private final fbbm f;
    private final fbbm g;
    private final fbbm h;

    public djdi(fbbf fbbfVar, fbbf fbbfVar2, fbbm fbbmVar, fbbm fbbmVar2, fbbm fbbmVar3, fbbm fbbmVar4, fbbm fbbmVar5, fbbm fbbmVar6, fbbm fbbmVar7) {
        super(fbbfVar2, new fbcd(djdi.class), fbbfVar);
        this.b = fbbz.c(fbbmVar);
        this.c = fbbz.c(fbbmVar2);
        this.d = fbbz.c(fbbmVar3);
        this.e = fbbz.c(fbbmVar4);
        this.f = fbbz.c(fbbmVar5);
        this.g = fbbz.c(fbbmVar6);
        this.h = fbbz.c(fbbmVar7);
    }

    @Override // defpackage.fbbs
    public final /* bridge */ /* synthetic */ ListenableFuture b(Object obj) {
        Optional of;
        List list = (List) obj;
        djeb djebVar = (djeb) list.get(0);
        fbbl fbblVar = (fbbl) list.get(1);
        Conversation conversation = (Conversation) list.get(2);
        Optional optional = (Optional) list.get(3);
        djhc djhcVar = (djhc) list.get(4);
        djcq djcqVar = (djcq) list.get(5);
        djch djchVar = (djch) list.get(6);
        diyy diyyVar = djdd.a;
        if (djebVar.b().isEmpty()) {
            of = Optional.empty();
        } else {
            Object obj2 = djebVar.b().get();
            dkha dkhaVar = (dkha) obj2;
            if (dkhaVar.p) {
                of = Optional.of(obj2);
            } else if (optional.isPresent()) {
                ((dkgd) obj2).j();
                ((dkkj) obj2).aT((dkkh) optional.get());
                of = Optional.empty();
            } else {
                djdd.a(fbblVar);
                djhe b = djhcVar.b(conversation, (dklp) obj2);
                dkty.c("Incoming session added to session store with result: %s", b);
                djgo djgoVar = (djgo) b;
                if (djgoVar.b == 1 || !obj2.equals(djgoVar.a)) {
                    dkkj dkkjVar = (dkkj) obj2;
                    djcp a = djcqVar.a(dkkjVar);
                    dkkj dkkjVar2 = djgoVar.a;
                    if (conversation.c() == 1) {
                        int i = djgoVar.b - 1;
                        if (i != 0) {
                            if (i != 2) {
                                ((dkgd) obj2).j();
                                dkhaVar.af(5, 57);
                                of = Optional.of(obj2);
                            } else {
                                dkkjVar2.n(5, 57);
                            }
                        }
                        dkkjVar.aF(a);
                        ((dkgd) obj2).j();
                        dkhaVar.C();
                        of = Optional.of(obj2);
                    } else {
                        if (conversation.c() != 2) {
                            throw new IllegalStateException("Unexpected conversation type ".concat(eifg.a(conversation.c())));
                        }
                        int i2 = djgoVar.b - 1;
                        if (i2 != 0) {
                            if (i2 != 2) {
                                ((dkgd) obj2).j();
                                dkhaVar.af(5, 57);
                                of = Optional.of(obj2);
                            } else {
                                dkkjVar2.n(5, 57);
                            }
                        }
                        dkkjVar.aF(a);
                        dkkjVar.aF(djchVar.a(dkkjVar));
                        ((dkgd) obj2).j();
                        dkhaVar.C();
                        of = Optional.of(obj2);
                    }
                } else {
                    of = Optional.of(obj2);
                }
            }
        }
        return erqt.i(of);
    }

    @Override // defpackage.fbbs
    protected final ListenableFuture c() {
        fbbm fbbmVar = this.c;
        ListenableFuture d = this.b.d();
        ListenableFuture a = fbbz.a(fbbmVar.d());
        fbbm fbbmVar2 = this.h;
        fbbm fbbmVar3 = this.g;
        fbbm fbbmVar4 = this.f;
        return erqt.f(d, a, this.d.d(), this.e.d(), fbbmVar4.d(), fbbmVar3.d(), fbbmVar2.d());
    }
}
