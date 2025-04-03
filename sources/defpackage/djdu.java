package defpackage;

import com.google.android.rcs.client.messaging.data.AutoValue_Conversation;
import com.google.android.rcs.client.messaging.data.Conversation;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import java.util.List;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djdu extends fbbs {
    private final fbbm b;
    private final fbbm c;
    private final fbbm d;
    private final fbbm e;
    private final fbbm f;
    private final fbbm g;
    private final fbbm h;

    public djdu(fbbf fbbfVar, fbbf fbbfVar2, fbbm fbbmVar, fbbm fbbmVar2, fbbm fbbmVar3, fbbm fbbmVar4, fbbm fbbmVar5, fbbm fbbmVar6, fbbm fbbmVar7) {
        super(fbbfVar2, new fbcd(djdu.class), fbbfVar);
        this.b = fbbz.c(fbbmVar);
        this.c = fbbz.c(fbbmVar2);
        this.d = fbbz.c(fbbmVar3);
        this.e = fbbz.c(fbbmVar4);
        this.f = fbbz.c(fbbmVar5);
        this.g = fbbz.c(fbbmVar6);
        this.h = fbbz.c(fbbmVar7);
    }

    @Override // defpackage.fbbs
    public final /* synthetic */ ListenableFuture b(Object obj) {
        Optional optional;
        List list = (List) obj;
        djeb djebVar = (djeb) list.get(0);
        fbbl fbblVar = (fbbl) list.get(1);
        fbbl fbblVar2 = (fbbl) list.get(2);
        Optional optional2 = (Optional) list.get(3);
        djhc djhcVar = (djhc) list.get(4);
        djcq djcqVar = (djcq) list.get(5);
        djch djchVar = (djch) list.get(6);
        dktn dktnVar = djdq.a;
        dkkj dkkjVar = (dkkj) djebVar.b().orElseThrow(new Supplier() { // from class: djda
            @Override // java.util.function.Supplier
            public final Object get() {
                dktn dktnVar2 = djdq.a;
                return new IllegalArgumentException("No session provided in request!");
            }
        });
        if (optional2.isPresent()) {
            dkkjVar.j();
            dkkjVar.aT((dkkh) optional2.get());
            optional = Optional.empty();
        } else {
            djdq.a(fbblVar);
            Optional optional3 = (Optional) djdq.a(fbblVar2);
            Conversation d = djhf.d(dkkjVar);
            djhe b = djhcVar.b(d, (dklp) dkkjVar);
            dkty.d(djdq.a.b("produceIncomingSessionResult"), "Incoming session added to session store with result: %s", b);
            djcp a = djcqVar.a(dkkjVar);
            if (((AutoValue_Conversation) d).c == 1) {
                djgo djgoVar = (djgo) b;
                int i = djgoVar.b - 1;
                if (i != 0) {
                    if (i != 2) {
                        dkkjVar.j();
                        dkkjVar.af(5, 57);
                    } else {
                        djgoVar.a.n(5, 57);
                    }
                }
                dkkjVar.aF(a);
                dkkjVar.j();
                dkkjVar.C();
            } else {
                djgo djgoVar2 = (djgo) b;
                int i2 = djgoVar2.b - 1;
                if (i2 != 0) {
                    if (i2 != 2) {
                        dkkjVar.j();
                        dkkjVar.af(5, 57);
                    } else {
                        djgoVar2.a.n(5, 57);
                    }
                }
                dkkjVar.aF(a);
                dkkjVar.aF(djchVar.a(dkkjVar));
                dkkjVar.j();
                dkkjVar.C();
            }
            optional = optional3;
        }
        return erqt.i(optional);
    }

    @Override // defpackage.fbbs
    protected final ListenableFuture c() {
        fbbm fbbmVar = this.c;
        ListenableFuture d = this.b.d();
        ListenableFuture a = fbbz.a(fbbmVar.d());
        ListenableFuture a2 = fbbz.a(this.d.d());
        fbbm fbbmVar2 = this.h;
        fbbm fbbmVar3 = this.g;
        return erqt.f(d, a, a2, this.e.d(), this.f.d(), fbbmVar3.d(), fbbmVar2.d());
    }
}
