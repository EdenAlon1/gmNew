package defpackage;

import com.google.android.rcs.client.messaging.RemoveUserFromGroupRequest;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.SettableFuture;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djej extends fbbs {
    private final fbbm b;
    private final fbbm c;

    public djej(fbbf fbbfVar, fbbf fbbfVar2, fbbm fbbmVar, fbbm fbbmVar2) {
        super(fbbfVar2, new fbcd(djej.class), fbbfVar);
        this.b = fbbz.c(fbbmVar);
        this.c = fbbz.c(fbbmVar2);
    }

    @Override // defpackage.fbbs
    public final /* synthetic */ ListenableFuture b(Object obj) {
        List list = (List) obj;
        djgo djgoVar = (djgo) ((djhc) list.get(1)).a((RemoveUserFromGroupRequest) list.get(0));
        int i = djgoVar.b;
        dkkj dkkjVar = djgoVar.a;
        if (i == 2) {
            djgv f = djgw.f();
            f.c(dkkjVar);
            return erqt.i(f.a());
        }
        SettableFuture settableFuture = new djgu(dkkjVar).a;
        dkkjVar.j();
        return settableFuture;
    }

    @Override // defpackage.fbbs
    protected final ListenableFuture c() {
        return erqt.f(this.b.d(), this.c.d());
    }
}
