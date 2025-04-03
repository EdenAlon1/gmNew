package defpackage;

import com.google.android.rcs.client.messaging.RemoveUserFromGroupRequest;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djek extends fbbs {
    private final fbbm b;
    private final fbbm c;

    public djek(fbbf fbbfVar, fbbf fbbfVar2, fbbm fbbmVar, fbbm fbbmVar2) {
        super(fbbfVar2, new fbcd(djek.class), fbbfVar);
        this.b = fbbz.c(fbbmVar);
        this.c = fbbz.c(fbbmVar2);
    }

    @Override // defpackage.fbbs
    public final /* bridge */ /* synthetic */ ListenableFuture b(Object obj) {
        List list = (List) obj;
        RemoveUserFromGroupRequest removeUserFromGroupRequest = (RemoveUserFromGroupRequest) list.get(0);
        djgw djgwVar = (djgw) list.get(1);
        if (djgwVar.d().isPresent()) {
            Object obj2 = djgwVar.d().get();
            dkgd dkgdVar = (dkgd) obj2;
            if (dkgdVar.a != dkho.STOPPED && dkgdVar.a != dkho.STOPPING) {
                dkkj dkkjVar = (dkkj) obj2;
                djef djefVar = new djef(dkkjVar, removeUserFromGroupRequest.b());
                dkkjVar.aF(djefVar.c);
                dkkjVar.bb(dkhm.LEAVE);
                dkha dkhaVar = (dkha) obj2;
                if (dkhaVar.p) {
                    dkgdVar.l();
                    return djefVar;
                }
                dkhaVar.af(5, 29);
                return djefVar;
            }
        }
        ehyt ehytVar = new ehyt();
        ehytVar.b(removeUserFromGroupRequest.b());
        ehytVar.c(djhf.b(djgwVar));
        return erqt.i(ehytVar.a());
    }

    @Override // defpackage.fbbs
    protected final ListenableFuture c() {
        return erqt.f(this.b.d(), this.c.d());
    }
}
