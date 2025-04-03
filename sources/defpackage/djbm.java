package defpackage;

import com.google.android.rcs.client.messaging.CreateGroupRequest;
import com.google.android.rcs.client.messaging.MessagingResult;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djbm extends fbbs {
    private final fbbm b;
    private final fbbm c;
    private final fbbm d;

    public djbm(fbbf fbbfVar, fbbf fbbfVar2, fbbm fbbmVar, fbbm fbbmVar2, fbbm fbbmVar3) {
        super(fbbfVar2, new fbcd(djbm.class), fbbfVar);
        this.b = fbbz.c(fbbmVar);
        this.c = fbbz.c(fbbmVar2);
        this.d = fbbz.c(fbbmVar3);
    }

    @Override // defpackage.fbbs
    public final /* bridge */ /* synthetic */ ListenableFuture b(Object obj) {
        List list = (List) obj;
        CreateGroupRequest createGroupRequest = (CreateGroupRequest) list.get(0);
        djgw djgwVar = (djgw) list.get(1);
        dkcp dkcpVar = (dkcp) list.get(2);
        ehyt ehytVar = new ehyt();
        if (djgwVar.d().isPresent()) {
            ehytVar.b(djhf.d((dkkj) djgwVar.d().get()));
            ehytVar.c(MessagingResult.d);
        } else {
            eiea eieaVar = new eiea();
            eieaVar.c(createGroupRequest.d());
            eieu eieuVar = new eieu();
            eieuVar.b(djbl.a(dkcpVar));
            eieuVar.c(2);
            eieaVar.b(eieuVar.a());
            eieaVar.d(2);
            ehytVar.b(eieaVar.a());
            ehytVar.c(djhf.b(djgwVar));
        }
        return erqt.i(ehytVar.a());
    }

    @Override // defpackage.fbbs
    protected final ListenableFuture c() {
        fbbm fbbmVar = this.d;
        return erqt.f(this.b.d(), this.c.d(), fbbmVar.d());
    }
}
