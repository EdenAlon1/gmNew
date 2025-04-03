package defpackage;

import com.google.android.rcs.client.messaging.CreateGroupRequest;
import com.google.android.rcs.client.messaging.data.RcsDestinationId;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.SettableFuture;
import j$.util.Collection;
import j$.util.function.Function$CC;
import java.util.List;
import java.util.function.Function;
import java.util.function.IntFunction;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djbn extends fbbs {
    private final fbbm b;
    private final fbbm c;
    private final fbbm d;
    private final fbbm e;
    private final fbbm f;

    public djbn(fbbf fbbfVar, fbbf fbbfVar2, fbbm fbbmVar, fbbm fbbmVar2, fbbm fbbmVar3, fbbm fbbmVar4, fbbm fbbmVar5) {
        super(fbbfVar2, new fbcd(djbn.class), fbbfVar);
        this.b = fbbz.c(fbbmVar);
        this.c = fbbz.c(fbbmVar2);
        this.d = fbbz.c(fbbmVar3);
        this.e = fbbz.c(fbbmVar4);
        this.f = fbbz.c(fbbmVar5);
    }

    @Override // defpackage.fbbs
    public final /* synthetic */ ListenableFuture b(Object obj) {
        djhe a;
        List list = (List) obj;
        CreateGroupRequest createGroupRequest = (CreateGroupRequest) list.get(0);
        djhc djhcVar = (djhc) list.get(1);
        dkcp dkcpVar = (dkcp) list.get(2);
        djcq djcqVar = (djcq) list.get(3);
        djch djchVar = (djch) list.get(4);
        String[] strArr = (String[]) Collection.EL.stream(createGroupRequest.b()).map(new Function() { // from class: djbj
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj2) {
                return ((RcsDestinationId) obj2).a();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).toArray(new IntFunction() { // from class: djbk
            @Override // java.util.function.IntFunction
            public final Object apply(int i) {
                return new String[i];
            }
        });
        String d = createGroupRequest.d();
        String e = createGroupRequest.e();
        String a2 = djbl.a(dkcpVar);
        synchronized (djhcVar.b) {
            djgn djgnVar = new djgn();
            dkkj dkkjVar = (dkkj) djhcVar.c.get(d);
            if (dkkjVar == null) {
                dkkjVar = djhcVar.a.createOutgoingSession(a2);
                dkkjVar.bm();
                dkkjVar.ba(strArr);
                dkkjVar.O = dkjj.CONFERENCE_FACTORY_URI;
                dkkjVar.q = e;
                dkkjVar.y = d;
                if (dkkjVar.ai()) {
                    dkkjVar.z = d;
                }
                djgnVar.a = 1;
                dkkjVar.aF(new djhb(djhcVar, d, dkkjVar));
                djhcVar.c.put(d, dkkjVar);
            } else {
                djgnVar.a = 2;
            }
            djgnVar.b(dkkjVar);
            a = djgnVar.a();
        }
        djgo djgoVar = (djgo) a;
        if (djgoVar.b == 2) {
            dkkj dkkjVar2 = djgoVar.a;
            djgv f = djgw.f();
            f.c(dkkjVar2);
            return erqt.i(f.a());
        }
        dkkj dkkjVar3 = djgoVar.a;
        SettableFuture settableFuture = new djgu(dkkjVar3).a;
        dkkjVar3.aF(djcqVar.a(dkkjVar3));
        dkkjVar3.aF(djchVar.a(dkkjVar3));
        dkkjVar3.j();
        return settableFuture;
    }

    @Override // defpackage.fbbs
    protected final ListenableFuture c() {
        fbbm fbbmVar = this.f;
        fbbm fbbmVar2 = this.e;
        fbbm fbbmVar3 = this.d;
        return erqt.f(this.b.d(), this.c.d(), fbbmVar3.d(), fbbmVar2.d(), fbbmVar.d());
    }
}
