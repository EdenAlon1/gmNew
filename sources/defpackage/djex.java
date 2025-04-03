package defpackage;

import com.google.android.rcs.client.messaging.data.Conversation;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.SettableFuture;
import j$.util.Optional;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djex extends fbbs {
    private final fbbm b;
    private final fbbm c;
    private final fbbm d;
    private final fbbm e;

    public djex(fbbf fbbfVar, fbbf fbbfVar2, fbbm fbbmVar, fbbm fbbmVar2, fbbm fbbmVar3, fbbm fbbmVar4) {
        super(fbbfVar2, new fbcd(djex.class), fbbfVar);
        this.b = fbbz.c(fbbmVar);
        this.c = fbbz.c(fbbmVar2);
        this.d = fbbz.c(fbbmVar3);
        this.e = fbbz.c(fbbmVar4);
    }

    @Override // defpackage.fbbs
    public final /* synthetic */ ListenableFuture b(Object obj) {
        Optional ofNullable;
        List list = (List) obj;
        eiaa eiaaVar = (eiaa) list.get(0);
        djhc djhcVar = (djhc) list.get(1);
        djcq djcqVar = (djcq) list.get(2);
        djch djchVar = (djch) list.get(3);
        Conversation b = eiaaVar.b();
        if (b.c() != 2) {
            ofNullable = Optional.empty();
        } else {
            String c = djhc.c(b);
            synchronized (djhcVar.b) {
                ofNullable = Optional.ofNullable((dkkj) djhcVar.c.get(c));
            }
        }
        if (ofNullable.isPresent()) {
            if (dizg.F()) {
                return new djgu((dkkj) ofNullable.get()).a;
            }
            djgv f = djgw.f();
            f.c((dkkj) ofNullable.get());
            return erqt.i(f.a());
        }
        if (!eiaaVar.f()) {
            return erqt.i(djgw.f().a());
        }
        djgo djgoVar = (djgo) djhcVar.a(eiaaVar);
        if (djgoVar.b == 2) {
            if (dizg.F()) {
                return new djgu(djgoVar.a).a;
            }
            dkkj dkkjVar = djgoVar.a;
            djgv f2 = djgw.f();
            f2.c(dkkjVar);
            return erqt.i(f2.a());
        }
        dkkj dkkjVar2 = djgoVar.a;
        dkkjVar2.aF(djchVar.a(dkkjVar2));
        SettableFuture settableFuture = new djgu(dkkjVar2).a;
        dkkjVar2.aF(djcqVar.a(dkkjVar2));
        dkkjVar2.j();
        return settableFuture;
    }

    @Override // defpackage.fbbs
    protected final ListenableFuture c() {
        fbbm fbbmVar = this.e;
        fbbm fbbmVar2 = this.d;
        return erqt.f(this.b.d(), this.c.d(), fbbmVar2.d(), fbbmVar.d());
    }
}
