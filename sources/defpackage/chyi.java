package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Map;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class chyi implements ciin {
    public final long a;
    private final ctyx b;
    private final fcek c;
    private String d = "";
    private long e = 0;

    public chyi(chep chepVar, ctyx ctyxVar, fcek fcekVar) {
        long longValue;
        this.b = ctyxVar;
        this.c = fcekVar;
        synchronized (chepVar.e) {
            longValue = ((Long) Map.EL.getOrDefault(chepVar.f, fcekVar, -1L)).longValue();
        }
        this.a = longValue;
    }

    @Override // defpackage.ciin
    public final long a() {
        return this.e;
    }

    @Override // defpackage.ciin
    public final ciil b() {
        return ciil.c;
    }

    @Override // defpackage.ciin
    public final ListenableFuture c(fcfo fcfoVar) {
        fcck fcckVar = (fcck) fccl.a.createBuilder();
        fcckVar.copyOnWrite();
        fccl fcclVar = (fccl) fcckVar.instance;
        fcclVar.c = this.c;
        fcclVar.b |= 1;
        fcckVar.copyOnWrite();
        ((fccl) fcckVar.instance).d = this.a;
        fccl fcclVar2 = (fccl) fcckVar.build();
        fccg fccgVar = (fccg) fcch.a.createBuilder();
        fccgVar.copyOnWrite();
        fcch fcchVar = (fcch) fccgVar.instance;
        fcclVar2.getClass();
        eygr eygrVar = fcchVar.d;
        if (!eygrVar.c()) {
            fcchVar.d = eyfy.mutableCopy(eygrVar);
        }
        fcchVar.d.add(fcclVar2);
        fccgVar.copyOnWrite();
        fcch fcchVar2 = (fcch) fccgVar.instance;
        fcfoVar.getClass();
        fcchVar2.c = fcfoVar;
        fcchVar2.b |= 1;
        fcch fcchVar3 = (fcch) fccgVar.build();
        this.d = fcfoVar.c;
        return erqt.i(fcchVar3);
    }

    @Override // defpackage.ciin
    public final /* bridge */ /* synthetic */ ListenableFuture d(chrv chrvVar, eyhs eyhsVar) {
        csjy.l("BugleNetwork", "revoking messages by sender");
        return chrvVar.a().d((fcch) eyhsVar);
    }

    @Override // defpackage.ciin
    public final /* bridge */ /* synthetic */ ListenableFuture e(eyhs eyhsVar) {
        long j;
        fccj fccjVar = (fccj) eyhsVar;
        if (fccjVar != null) {
            fcfq fcfqVar = fccjVar.b;
            if (fcfqVar == null) {
                fcfqVar = fcfq.a;
            }
            j = fcfqVar.b;
        } else {
            j = 0;
        }
        this.e = j;
        ListenableFuture i = erqt.i(fccjVar);
        erqt.r(i, new csvw(new Consumer() { // from class: chyg
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                csjy.l("BugleNetwork", "successfully revoked messages by sender.");
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        }, new Consumer() { // from class: chyh
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                csjy.l("BugleNetwork", "failed to revoke messages by sender.");
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        }), erpp.a);
        return i;
    }

    @Override // defpackage.ciin
    public final String f() {
        return "RevokeMessagesRpcHandler";
    }

    @Override // defpackage.ciin
    public final String g() {
        return this.d;
    }

    @Override // defpackage.ciin
    public final /* synthetic */ void h(Throwable th) {
        ciim.c(this);
    }

    @Override // defpackage.ciin
    public final /* synthetic */ void i() {
        ciim.a(this);
    }

    @Override // defpackage.ciin
    public final /* synthetic */ void j() {
        ciim.b(this);
    }

    @Override // defpackage.cijo
    public final void k() {
        this.b.k("ditto_messages_need_revoke_timestamp", this.a);
    }

    @Override // defpackage.cijo
    public final /* synthetic */ void l() {
    }
}
