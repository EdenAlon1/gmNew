package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djdf extends fbbs {
    private final fbbm b;

    public djdf(fbbf fbbfVar, fbbf fbbfVar2, fbbm fbbmVar) {
        super(fbbfVar2, new fbcd(djdf.class), fbbfVar);
        this.b = fbbz.c(fbbmVar);
    }

    @Override // defpackage.fbbs
    public final /* bridge */ /* synthetic */ ListenableFuture b(Object obj) {
        int i;
        clns clnsVar;
        djeb djebVar = (djeb) obj;
        diyy diyyVar = djdd.a;
        if (djebVar.b().isPresent()) {
            Object obj2 = djebVar.b().get();
            dkha dkhaVar = (dkha) obj2;
            String str = dkhaVar.ai() ? dkhaVar.z : dkhaVar.y;
            if (str == null) {
                throw new IllegalArgumentException(true != dkhaVar.ai() ? "contributionId is null in SIMPLE-IM session" : "conversationId is null in CPM session");
            }
            clnp clnpVar = (clnp) clns.a.createBuilder();
            clqr clqrVar = (clqr) clqs.a.createBuilder();
            clqrVar.copyOnWrite();
            clqs clqsVar = (clqs) clqrVar.instance;
            clqsVar.b |= 1;
            clqsVar.c = str;
            clnpVar.copyOnWrite();
            clns clnsVar2 = (clns) clnpVar.instance;
            clqs clqsVar2 = (clqs) clqrVar.build();
            clqsVar2.getClass();
            clnsVar2.e = clqsVar2;
            clnsVar2.b |= 4;
            dkkj dkkjVar = (dkkj) obj2;
            i = dkkjVar.E ? 3 : dkkjVar.J ? 4 : 2;
            clnpVar.copyOnWrite();
            clns clnsVar3 = (clns) clnpVar.instance;
            clnsVar3.c = i - 1;
            clnsVar3.b |= 1;
            clqv b = dkkjVar.E ? djic.b(dkkjVar.I) : djic.a(dkhaVar.y());
            clnpVar.copyOnWrite();
            clns clnsVar4 = (clns) clnpVar.instance;
            b.getClass();
            clnsVar4.d = b;
            clnsVar4.b |= 2;
            clnsVar = (clns) clnpVar.build();
        } else {
            if (!djebVar.a().isPresent()) {
                throw new IllegalArgumentException("No message or session presented");
            }
            dkjt dkjtVar = (dkjt) djebVar.a().get();
            if (dkjtVar.o) {
                throw new IllegalArgumentException("Group message was not sent/received with a session!");
            }
            String uuid = UUID.randomUUID().toString();
            clnp clnpVar2 = (clnp) clns.a.createBuilder();
            i = dkjtVar.o ? 3 : dkjtVar.q ? 4 : 2;
            clnpVar2.copyOnWrite();
            clns clnsVar5 = (clns) clnpVar2.instance;
            clnsVar5.c = i - 1;
            clnsVar5.b |= 1;
            clqr clqrVar2 = (clqr) clqs.a.createBuilder();
            clqrVar2.copyOnWrite();
            clqs clqsVar3 = (clqs) clqrVar2.instance;
            uuid.getClass();
            clqsVar3.b = 1 | clqsVar3.b;
            clqsVar3.c = uuid;
            clnpVar2.copyOnWrite();
            clns clnsVar6 = (clns) clnpVar2.instance;
            clqs clqsVar4 = (clqs) clqrVar2.build();
            clqsVar4.getClass();
            clnsVar6.e = clqsVar4;
            clnsVar6.b |= 4;
            clqv a = djic.a(dkjtVar.c);
            clnpVar2.copyOnWrite();
            clns clnsVar7 = (clns) clnpVar2.instance;
            a.getClass();
            clnsVar7.d = a;
            clnsVar7.b |= 2;
            clnsVar = (clns) clnpVar2.build();
        }
        return erqt.i(clnsVar);
    }

    @Override // defpackage.fbbs
    protected final ListenableFuture c() {
        return this.b.d();
    }
}
