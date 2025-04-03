package defpackage;

import com.google.android.rcs.client.messaging.data.AutoValue_GroupNotification;
import com.google.android.rcs.client.messaging.data.GroupEvent;
import com.google.android.rcs.client.messaging.data.GroupInformation;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djcy extends fbbs {
    private final fbbm b;
    private final fbbm c;
    private final fbbm d;
    private final fbbm e;
    private final fbbm f;

    public djcy(fbbf fbbfVar, fbbf fbbfVar2, fbbm fbbmVar, fbbm fbbmVar2, fbbm fbbmVar3, fbbm fbbmVar4, fbbm fbbmVar5) {
        super(fbbfVar2, new fbcd(djcy.class), fbbfVar);
        this.b = fbbz.c(fbbmVar);
        this.c = fbbz.c(fbbmVar2);
        this.d = fbbz.c(fbbmVar3);
        this.e = fbbz.c(fbbmVar4);
        this.f = fbbz.c(fbbmVar5);
    }

    @Override // defpackage.fbbs
    public final /* bridge */ /* synthetic */ ListenableFuture b(Object obj) {
        List list = (List) obj;
        djgb djgbVar = (djgb) list.get(0);
        djgi djgiVar = (djgi) list.get(1);
        eima eimaVar = (eima) list.get(2);
        eimm eimmVar = (eimm) list.get(3);
        eimi eimiVar = (eimi) list.get(4);
        if (!((Boolean) djcx.a.a()).booleanValue()) {
            return erqt.i(clqg.a);
        }
        clqh clqhVar = (clqh) clqi.a.createBuilder();
        clns clnsVar = (clns) eimaVar.m().fP(((AutoValue_GroupNotification) djgbVar.a()).a);
        clqhVar.copyOnWrite();
        clqi clqiVar = (clqi) clqhVar.instance;
        clnsVar.getClass();
        clqiVar.e = clnsVar;
        clqiVar.b |= 2;
        if (((AutoValue_GroupNotification) djgbVar.a()).b.isPresent()) {
            clov a = eimmVar.apply((GroupInformation) ((AutoValue_GroupNotification) djgbVar.a()).b.get());
            clqhVar.copyOnWrite();
            clqi clqiVar2 = (clqi) clqhVar.instance;
            a.getClass();
            clqiVar2.d = a;
            clqiVar2.c = 4;
        }
        if (((AutoValue_GroupNotification) djgbVar.a()).c.isPresent()) {
            clot a2 = eimiVar.apply((GroupEvent) ((AutoValue_GroupNotification) djgbVar.a()).c.get());
            clqhVar.copyOnWrite();
            clqi clqiVar3 = (clqi) clqhVar.instance;
            a2.getClass();
            clqiVar3.d = a2;
            clqiVar3.c = 3;
        }
        clqi clqiVar4 = (clqi) clqhVar.build();
        clqd clqdVar = (clqd) clqe.a.createBuilder();
        clns clnsVar2 = clqiVar4.e;
        if (clnsVar2 == null) {
            clnsVar2 = clns.a;
        }
        clqdVar.copyOnWrite();
        clqe clqeVar = (clqe) clqdVar.instance;
        clnsVar2.getClass();
        clqeVar.e = clnsVar2;
        clqeVar.b = 1 | clqeVar.b;
        clqdVar.copyOnWrite();
        clqe clqeVar2 = (clqe) clqdVar.instance;
        clqiVar4.getClass();
        clqeVar2.d = clqiVar4;
        clqeVar2.c = 3;
        clqdVar.copyOnWrite();
        clqe clqeVar3 = (clqe) clqdVar.instance;
        clqeVar3.b |= 8;
        clqeVar3.h = 0;
        eyja b = eykj.b(djgiVar.b.f());
        clqdVar.copyOnWrite();
        clqe clqeVar4 = (clqe) clqdVar.instance;
        b.getClass();
        clqeVar4.f = b;
        clqeVar4.b |= 2;
        return djgiVar.a((clqe) clqdVar.build());
    }

    @Override // defpackage.fbbs
    protected final ListenableFuture c() {
        fbbm fbbmVar = this.f;
        fbbm fbbmVar2 = this.e;
        fbbm fbbmVar3 = this.d;
        return erqt.f(this.b.d(), this.c.d(), fbbmVar3.d(), fbbmVar2.d(), fbbmVar.d());
    }
}
