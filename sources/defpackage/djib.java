package defpackage;

import com.google.android.rcs.client.messaging.AddUserToGroupRequest;
import com.google.android.rcs.client.messaging.CreateGroupRequest;
import com.google.android.rcs.client.messaging.RemoveUserFromGroupRequest;
import com.google.android.rcs.client.messaging.SendMessageRequest;
import com.google.android.rcs.client.messaging.TriggerGroupNotificationRequest;
import com.google.android.rcs.client.messaging.UpdateGroupRequest;
import com.google.common.util.concurrent.ListenableFuture;
import io.grpc.Status;
import io.grpc.StatusException;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djib extends clpu {
    private static final entd a = entd.c(dktl.a);
    private final errl b;
    private final ffbr c;
    private final ffbr d;
    private final ffbr e;
    private final ffbr f;
    private final ffbr g;
    private final ffbr h;
    private final ffbr i;
    private final ffbr j;
    private final djil k;
    private final djii l;
    private final djhl m;
    private final djhi n;
    private final djif o;
    private final djir p;
    private final djio q;

    public djib(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, ffbr ffbrVar6, ffbr ffbrVar7, djil djilVar, djii djiiVar, djhl djhlVar, djhi djhiVar, djif djifVar, djir djirVar, djio djioVar, errl errlVar, ffbr ffbrVar8) {
        this.d = ffbrVar;
        this.e = ffbrVar2;
        this.f = ffbrVar3;
        this.g = ffbrVar4;
        this.h = ffbrVar5;
        this.i = ffbrVar6;
        this.j = ffbrVar7;
        this.k = djilVar;
        this.l = djiiVar;
        this.m = djhlVar;
        this.n = djhiVar;
        this.o = djifVar;
        this.p = djirVar;
        this.q = djioVar;
        this.b = errlVar;
        this.c = ffbrVar8;
    }

    private static StatusException j(RuntimeException runtimeException) {
        return Status.e.d(runtimeException).withDescription((String) Optional.ofNullable(runtimeException.getMessage()).orElse("")).asException();
    }

    @Override // defpackage.clpu, defpackage.clps
    public final void b(clni clniVar, ffbc ffbcVar) {
        clns clnsVar = clniVar.d;
        if (clnsVar == null) {
            clnsVar = clns.a;
        }
        clqs clqsVar = clnsVar.e;
        if (clqsVar == null) {
            clqsVar = clqs.a;
        }
        String str = clqsVar.c;
        ((ensz) ((ensz) a.h()).h("com/google/android/ims/messaging/v2/MessagingEngineServerImpl", "addUserToGroup", 227, "MessagingEngineServerImpl.java")).t("[%s] Adding user to group", str);
        try {
            AddUserToGroupRequest d = ((eiky) this.g.b()).apply(clniVar);
            ListenableFuture b = ((djcu) this.c.b()).b(d);
            ffbcVar.c(clnk.a);
            ffbcVar.a();
            erqt.r(b, this.n.a(d), this.b);
        } catch (IllegalArgumentException e) {
            e = e;
            ((ensz) ((ensz) ((ensz) a.j()).g(e)).h("com/google/android/ims/messaging/v2/MessagingEngineServerImpl", "addUserToGroup", 244, "MessagingEngineServerImpl.java")).D("[%s] %s: Ignoring invalid data", str, "addUserToGroup");
            ffbcVar.b(j(e));
        } catch (IllegalStateException e2) {
            e = e2;
            ((ensz) ((ensz) ((ensz) a.j()).g(e)).h("com/google/android/ims/messaging/v2/MessagingEngineServerImpl", "addUserToGroup", 244, "MessagingEngineServerImpl.java")).D("[%s] %s: Ignoring invalid data", str, "addUserToGroup");
            ffbcVar.b(j(e));
        } catch (Throwable th) {
            ((ensz) ((ensz) ((ensz) a.j()).g(th)).h("com/google/android/ims/messaging/v2/MessagingEngineServerImpl", "addUserToGroup", 248, "MessagingEngineServerImpl.java")).D("[%s] %s: Error while processing request", str, "addUserToGroup");
            ffbcVar.b(th);
        }
    }

    @Override // defpackage.clpu, defpackage.clps
    public final void c(clny clnyVar, ffbc ffbcVar) {
        clqs clqsVar = clnyVar.d;
        if (clqsVar == null) {
            clqsVar = clqs.a;
        }
        String str = clqsVar.c;
        ((ensz) ((ensz) a.h()).h("com/google/android/ims/messaging/v2/MessagingEngineServerImpl", "createGroup", 194, "MessagingEngineServerImpl.java")).B("[%s] Create group, number of participants: %s", str, clnyVar.f.size());
        try {
            CreateGroupRequest a2 = ((eimb) this.f.b()).apply(clnyVar);
            ListenableFuture c = ((djcu) this.c.b()).c(a2);
            ffbcVar.c(cloa.a);
            ffbcVar.a();
            erqt.r(c, this.m.a(a2), this.b);
        } catch (IllegalArgumentException e) {
            e = e;
            ((ensz) ((ensz) ((ensz) a.j()).g(e)).h("com/google/android/ims/messaging/v2/MessagingEngineServerImpl", "createGroup", 212, "MessagingEngineServerImpl.java")).D("[%s] %s: Ignoring invalid data", str, "createGroup");
            ffbcVar.b(j(e));
        } catch (IllegalStateException e2) {
            e = e2;
            ((ensz) ((ensz) ((ensz) a.j()).g(e)).h("com/google/android/ims/messaging/v2/MessagingEngineServerImpl", "createGroup", 212, "MessagingEngineServerImpl.java")).D("[%s] %s: Ignoring invalid data", str, "createGroup");
            ffbcVar.b(j(e));
        } catch (Throwable th) {
            ((ensz) ((ensz) ((ensz) a.j()).g(th)).h("com/google/android/ims/messaging/v2/MessagingEngineServerImpl", "createGroup", 216, "MessagingEngineServerImpl.java")).D("[%s] %s:  Error while processing request", str, "createGroup");
            ffbcVar.b(th);
        }
    }

    @Override // defpackage.clpu, defpackage.clps
    public final void d(clrd clrdVar, ffbc ffbcVar) {
        clns clnsVar = clrdVar.d;
        if (clnsVar == null) {
            clnsVar = clns.a;
        }
        clqs clqsVar = clnsVar.e;
        if (clqsVar == null) {
            clqsVar = clqs.a;
        }
        String str = clqsVar.c;
        ((ensz) ((ensz) a.h()).h("com/google/android/ims/messaging/v2/MessagingEngineServerImpl", "removeUserFromGroup", 260, "MessagingEngineServerImpl.java")).t("[%s] Removing user from group", str);
        try {
            RemoveUserFromGroupRequest a2 = ((eini) this.h.b()).apply(clrdVar);
            ListenableFuture d = ((djcu) this.c.b()).d(a2);
            ffbcVar.c(clrf.a);
            ffbcVar.a();
            erqt.r(d, this.o.a(a2), this.b);
        } catch (IllegalArgumentException e) {
            e = e;
            ((ensz) ((ensz) ((ensz) a.j()).g(e)).h("com/google/android/ims/messaging/v2/MessagingEngineServerImpl", "removeUserFromGroup", 277, "MessagingEngineServerImpl.java")).D("[%s] %s: Ignoring invalid data", str, "removeUserFromGroup");
            ffbcVar.b(j(e));
        } catch (IllegalStateException e2) {
            e = e2;
            ((ensz) ((ensz) ((ensz) a.j()).g(e)).h("com/google/android/ims/messaging/v2/MessagingEngineServerImpl", "removeUserFromGroup", 277, "MessagingEngineServerImpl.java")).D("[%s] %s: Ignoring invalid data", str, "removeUserFromGroup");
            ffbcVar.b(j(e));
        } catch (Throwable th) {
            ((ensz) ((ensz) ((ensz) a.j()).g(th)).h("com/google/android/ims/messaging/v2/MessagingEngineServerImpl", "removeUserFromGroup", 281, "MessagingEngineServerImpl.java")).D("[%s] %s: Error while processing request", str, "removeUserFromGroup");
            ffbcVar.b(th);
        }
    }

    @Override // defpackage.clpu, defpackage.clps
    public final void e(clrz clrzVar, ffbc ffbcVar) {
        cloj clojVar = clrzVar.f;
        if (clojVar == null) {
            clojVar = cloj.b;
        }
        clqx clqxVar = clojVar.d;
        if (clqxVar == null) {
            clqxVar = clqx.a;
        }
        String str = clqxVar.c;
        clns clnsVar = clrzVar.e;
        if (clnsVar == null) {
            clnsVar = clns.a;
        }
        clqs clqsVar = clnsVar.e;
        if (clqsVar == null) {
            clqsVar = clqs.a;
        }
        String str2 = clqsVar.c;
        ((ensz) ((ensz) a.h()).h("com/google/android/ims/messaging/v2/MessagingEngineServerImpl", "sendFile", 156, "MessagingEngineServerImpl.java")).D("[%s, %s] sendFile", str2, str);
        try {
            eicl a2 = ((einj) this.e.b()).apply(clrzVar);
            djcv a3 = ((djcu) this.c.b()).a();
            a3.b(a2);
            ListenableFuture d = ((djbu) a3.a()).Q.d();
            ffbcVar.c(clsb.a);
            ffbcVar.a();
            djii djiiVar = this.l;
            erqt.r(d, new djih(a2, (eima) djiiVar.a.b(), (eing) djiiVar.b.b(), djiiVar.c, (errl) djiiVar.d.b(), (dikx) djiiVar.e.b(), (djfx) djiiVar.f.b()), this.b);
        } catch (IllegalArgumentException e) {
            e = e;
            ((ensz) ((ensz) ((ensz) a.j()).g(e)).h("com/google/android/ims/messaging/v2/MessagingEngineServerImpl", "sendFile", 173, "MessagingEngineServerImpl.java")).J("[%s, %s] %s: Ignoring invalid data", str2, str, "sendFile");
            ffbcVar.b(j(e));
        } catch (IllegalStateException e2) {
            e = e2;
            ((ensz) ((ensz) ((ensz) a.j()).g(e)).h("com/google/android/ims/messaging/v2/MessagingEngineServerImpl", "sendFile", 173, "MessagingEngineServerImpl.java")).J("[%s, %s] %s: Ignoring invalid data", str2, str, "sendFile");
            ffbcVar.b(j(e));
        } catch (Throwable th) {
            ((ensz) ((ensz) ((ensz) a.j()).g(th)).h("com/google/android/ims/messaging/v2/MessagingEngineServerImpl", "sendFile", 177, "MessagingEngineServerImpl.java")).J("[%s, %s] %s: Error while processing request", str2, str, "sendFile");
            ffbcVar.b(th);
        }
    }

    @Override // defpackage.clpu, defpackage.clps
    public final void f(clsh clshVar, ffbc ffbcVar) {
        clpc clpcVar = clshVar.f;
        if (clpcVar == null) {
            clpcVar = clpc.b;
        }
        clqx clqxVar = clpcVar.d;
        if (clqxVar == null) {
            clqxVar = clqx.a;
        }
        String str = clqxVar.c;
        clns clnsVar = clshVar.e;
        if (clnsVar == null) {
            clnsVar = clns.a;
        }
        clqs clqsVar = clnsVar.e;
        if (clqsVar == null) {
            clqsVar = clqs.a;
        }
        String str2 = clqsVar.c;
        ((ensz) ((ensz) a.h()).h("com/google/android/ims/messaging/v2/MessagingEngineServerImpl", "sendMessage", 123, "MessagingEngineServerImpl.java")).D("[%s, %s] sendMessage", str2, str);
        try {
            SendMessageRequest a2 = ((eink) this.d.b()).apply(clshVar);
            ListenableFuture e = ((djcu) this.c.b()).e(a2);
            ffbcVar.c(clsj.a);
            ffbcVar.a();
            erqt.r(e, this.k.a(a2), this.b);
        } catch (IllegalArgumentException e2) {
            e = e2;
            ((ensz) ((ensz) ((ensz) a.j()).g(e)).h("com/google/android/ims/messaging/v2/MessagingEngineServerImpl", "sendMessage", 140, "MessagingEngineServerImpl.java")).J("[%s, %s] %s: Ignoring invalid data", str2, str, "sendMessage");
            ffbcVar.b(j(e));
        } catch (IllegalStateException e3) {
            e = e3;
            ((ensz) ((ensz) ((ensz) a.j()).g(e)).h("com/google/android/ims/messaging/v2/MessagingEngineServerImpl", "sendMessage", 140, "MessagingEngineServerImpl.java")).J("[%s, %s] %s: Ignoring invalid data", str2, str, "sendMessage");
            ffbcVar.b(j(e));
        } catch (Throwable th) {
            ((ensz) ((ensz) ((ensz) a.j()).g(th)).h("com/google/android/ims/messaging/v2/MessagingEngineServerImpl", "sendMessage", 144, "MessagingEngineServerImpl.java")).J("[%s, %s] %s: Error while processing request", str2, str, "sendMessage");
            ffbcVar.b(th);
        }
    }

    @Override // defpackage.clpu, defpackage.clps
    public final void g(clst clstVar, ffbc ffbcVar) {
        clns clnsVar = clstVar.d;
        if (clnsVar == null) {
            clnsVar = clns.a;
        }
        clqs clqsVar = clnsVar.e;
        if (clqsVar == null) {
            clqsVar = clqs.a;
        }
        String str = clqsVar.c;
        ((ensz) ((ensz) a.h()).h("com/google/android/ims/messaging/v2/MessagingEngineServerImpl", "triggerGroupNotification", 325, "MessagingEngineServerImpl.java")).t("[%s] Triggering group update", str);
        try {
            TriggerGroupNotificationRequest a2 = ((einm) this.j.b()).apply(clstVar);
            ListenableFuture f = ((djcu) this.c.b()).f(a2);
            ffbcVar.c(clsv.a);
            ffbcVar.a();
            erqt.r(f, this.q.a(a2), this.b);
        } catch (IllegalArgumentException e) {
            e = e;
            ((ensz) ((ensz) ((ensz) a.j()).g(e)).h("com/google/android/ims/messaging/v2/MessagingEngineServerImpl", "triggerGroupNotification", 344, "MessagingEngineServerImpl.java")).D("[%s] %s: Ignoring invalid data", str, "triggerGroupNotification");
            ffbcVar.b(j(e));
        } catch (IllegalStateException e2) {
            e = e2;
            ((ensz) ((ensz) ((ensz) a.j()).g(e)).h("com/google/android/ims/messaging/v2/MessagingEngineServerImpl", "triggerGroupNotification", 344, "MessagingEngineServerImpl.java")).D("[%s] %s: Ignoring invalid data", str, "triggerGroupNotification");
            ffbcVar.b(j(e));
        } catch (Throwable th) {
            ((ensz) ((ensz) ((ensz) a.j()).g(th)).h("com/google/android/ims/messaging/v2/MessagingEngineServerImpl", "triggerGroupNotification", 348, "MessagingEngineServerImpl.java")).D("[%s] %s: Error while processing request", str, "triggerGroupNotification");
            ffbcVar.b(th);
        }
    }

    @Override // defpackage.clpu, defpackage.clps
    public final void h(cltb cltbVar, ffbc ffbcVar) {
        clns clnsVar = cltbVar.d;
        if (clnsVar == null) {
            clnsVar = clns.a;
        }
        clqs clqsVar = clnsVar.e;
        if (clqsVar == null) {
            clqsVar = clqs.a;
        }
        String str = clqsVar.c;
        ((ensz) ((ensz) a.h()).h("com/google/android/ims/messaging/v2/MessagingEngineServerImpl", "updateGroup", 292, "MessagingEngineServerImpl.java")).t("[%s] Updating group", str);
        try {
            UpdateGroupRequest a2 = ((einn) this.i.b()).apply(cltbVar);
            ListenableFuture g = ((djcu) this.c.b()).g(a2);
            ffbcVar.c(cltd.a);
            ffbcVar.a();
            erqt.r(g, this.p.a(a2), this.b);
        } catch (IllegalArgumentException e) {
            e = e;
            ((ensz) ((ensz) ((ensz) a.j()).g(e)).h("com/google/android/ims/messaging/v2/MessagingEngineServerImpl", "updateGroup", 309, "MessagingEngineServerImpl.java")).D("[%s] %s: Ignoring invalid data", str, "updateGroup");
            ffbcVar.b(j(e));
        } catch (IllegalStateException e2) {
            e = e2;
            ((ensz) ((ensz) ((ensz) a.j()).g(e)).h("com/google/android/ims/messaging/v2/MessagingEngineServerImpl", "updateGroup", 309, "MessagingEngineServerImpl.java")).D("[%s] %s: Ignoring invalid data", str, "updateGroup");
            ffbcVar.b(j(e));
        } catch (Throwable th) {
            ((ensz) ((ensz) ((ensz) a.j()).g(th)).h("com/google/android/ims/messaging/v2/MessagingEngineServerImpl", "updateGroup", 313, "MessagingEngineServerImpl.java")).D("[%s] %s: Error while processing request", str, "updateGroup");
            ffbcVar.b(th);
        }
    }

    @Override // defpackage.clpu, defpackage.clps
    public final void i() {
        throw new IllegalStateException("Not implemented anymore!");
    }
}
