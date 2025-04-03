package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.common.util.concurrent.ListenableFuture;
import io.grpc.Status;
import j$.util.Optional;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tqc implements tqz {
    public static final cskc a = cskc.g("BugleCms", "ConversationEventHandler");
    public final ayfy b;
    public final errl c;
    private final tqr d;
    private final tqy e;
    private final errl f;

    public tqc(ayfy ayfyVar, tqr tqrVar, tqy tqyVar, errl errlVar, errl errlVar2) {
        this.b = ayfyVar;
        this.d = tqrVar;
        this.e = tqyVar;
        this.f = errlVar;
        this.c = errlVar2;
    }

    public static void b(eswu eswuVar, boolean z) {
        csjb c = a.c();
        String str = cdii.t.a;
        int b = eswt.b(eswuVar.b);
        if (b == 0) {
            b = 1;
        }
        String str2 = true != z ? "CmsId not found in DB" : "Conversation is already soft deleted";
        c.A(str, eswt.a(b));
        c.A(cdii.v.a, "Ignore");
        c.A(cdii.w.a, eswuVar.c);
        c.A(cdii.x.a, str2);
        c.I("ConversationEvent received");
        c.r();
    }

    @Override // defpackage.tqz
    public final /* bridge */ /* synthetic */ ListenableFuture a(eszk eszkVar) {
        if (eszkVar.b != 2) {
            csjb e = a.e();
            e.A(cdii.u.a, eszj.a(eszkVar.b));
            e.I("Cannot handle event");
            e.r();
            return elfo.e(null);
        }
        final eswu eswuVar = (eswu) eszkVar.c;
        int i = eswuVar.b;
        int b = eswt.b(i);
        if (b == 0) {
            b = 1;
        }
        int i2 = b - 2;
        if (i2 == 3) {
            tqr tqrVar = this.d;
            String str = eswuVar.c;
            int b2 = eswt.b(i);
            return tqrVar.a(str, eswt.a(b2 != 0 ? b2 : 1));
        }
        if (i2 == 4) {
            return elfo.g(new Callable() { // from class: tpy
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return Optional.ofNullable(bsom.a(eswu.this.c));
                }
            }, this.f).i(new eroh() { // from class: tpz
                @Override // defpackage.eroh
                public final ListenableFuture a(Object obj) {
                    Optional optional = (Optional) obj;
                    boolean isEmpty = optional.isEmpty();
                    final eswu eswuVar2 = eswuVar;
                    if (isEmpty) {
                        tqc.b(eswuVar2, false);
                        return elfo.e(null);
                    }
                    if (((bseh) optional.get()).u() > 0) {
                        tqc.b(eswuVar2, true);
                        return elfo.e(null);
                    }
                    tqc tqcVar = tqc.this;
                    final ConversationIdType C = ((bseh) optional.get()).C();
                    aygb f = aygc.f();
                    f.b(C);
                    f.f(eoko.CONVERSATION_FROM_CMS_ACTION);
                    return elfl.g(tqcVar.b.a(f.a())).h(new emwl() { // from class: tqa
                        @Override // defpackage.emwl
                        public final Object apply(Object obj2) {
                            csjb c = tqc.a.c();
                            String str2 = cdii.t.a;
                            eswu eswuVar3 = eswu.this;
                            int b3 = eswt.b(eswuVar3.b);
                            if (b3 == 0) {
                                b3 = 1;
                            }
                            ConversationIdType conversationIdType = C;
                            c.A(str2, eswt.a(b3));
                            c.A(cdii.v.a, "Conversation deleted from DB");
                            c.A(cdii.w.a, eswuVar3.c);
                            c.A(cdii.c.a, conversationIdType);
                            c.I("ConversationEvent received");
                            c.r();
                            return null;
                        }
                    }, tqcVar.c).f(Throwable.class, new eroh() { // from class: tqb
                        @Override // defpackage.eroh
                        public final ListenableFuture a(Object obj2) {
                            Throwable th = (Throwable) obj2;
                            csjb e2 = tqc.a.e();
                            String str2 = cdii.t.a;
                            eswu eswuVar3 = eswu.this;
                            int b3 = eswt.b(eswuVar3.b);
                            if (b3 == 0) {
                                b3 = 1;
                            }
                            ConversationIdType conversationIdType = C;
                            e2.A(str2, eswt.a(b3));
                            e2.A(cdii.v.a, "Failed to delete conversation from DB");
                            e2.A(cdii.w.a, eswuVar3.c);
                            e2.A(cdii.c.a, conversationIdType);
                            e2.I("ConversationEvent received");
                            e2.s(th);
                            return elfo.d(th);
                        }
                    }, tqcVar.c);
                }
            }, this.f);
        }
        if (i2 != 5) {
            csjb a2 = a.a();
            String str2 = cdii.t.a;
            int b3 = eswt.b(eswuVar.b);
            a2.A(str2, eswt.a(b3 != 0 ? b3 : 1));
            a2.A(cdii.v.a, "Ignore");
            a2.A(cdii.w.a, eswuVar.c);
            a2.A(cdii.x.a, "Not implemented");
            a2.I("ConversationEvent received");
            a2.r();
            return elfo.e(null);
        }
        final tqy tqyVar = this.e;
        int b4 = eswt.b(i);
        emxf.b(b4 != 0 && b4 == 7, "Event type should be CONVERSATION_UPDATED");
        if (((Boolean) tqy.c.e()).booleanValue() && (eswuVar.d.contains("most_recent_read_message_time_web") || eswuVar.d.contains("conversation_status"))) {
            return tqyVar.e.m(eswuVar.c).i(new eroh() { // from class: tqw
                /* JADX WARN: Removed duplicated region for block: B:11:0x0112  */
                @Override // defpackage.eroh
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final com.google.common.util.concurrent.ListenableFuture a(java.lang.Object r8) {
                    /*
                        Method dump skipped, instructions count: 414
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.tqw.a(java.lang.Object):com.google.common.util.concurrent.ListenableFuture");
                }
            }, tqyVar.g).f(fedn.class, new eroh() { // from class: tqx
                @Override // defpackage.eroh
                public final ListenableFuture a(Object obj) {
                    fedn fednVar = (fedn) obj;
                    Status status = fednVar.a;
                    cskc cskcVar = tqy.a;
                    if (!status.getCode().equals(Status.Code.NOT_FOUND)) {
                        return elfo.d(fednVar);
                    }
                    eswu eswuVar2 = eswu.this;
                    csjb e2 = tqy.a.e();
                    String str3 = cdii.t.a;
                    int b5 = eswt.b(eswuVar2.b);
                    if (b5 == 0) {
                        b5 = 1;
                    }
                    e2.A(str3, eswt.a(b5));
                    e2.A(cdii.v.a, "Ignore");
                    e2.A(cdii.w.a, eswuVar2.c);
                    e2.A(cdii.x.a, "Conversation does not exist in CMS.");
                    e2.I("ConversationEvent received");
                    e2.r();
                    return elfo.e(null);
                }
            }, tqyVar.h);
        }
        if (eswuVar.d.contains("most_recent_read_message_time_web")) {
            return tqyVar.e.m(eswuVar.c).i(new eroh() { // from class: tqu
                @Override // defpackage.eroh
                public final ListenableFuture a(Object obj) {
                    final tqy tqyVar2 = tqy.this;
                    eswr eswrVar = (eswr) obj;
                    final eswu eswuVar2 = eswuVar;
                    try {
                        final Optional a3 = tqyVar2.a(eswrVar, eswuVar2);
                        if (!a3.isEmpty()) {
                            return tqyVar2.i.b("ConversationUpdateEventHandler#handleUpdatedMostRecentReadMessageTime", new Runnable() { // from class: tqs
                                @Override // java.lang.Runnable
                                public final void run() {
                                    eswu eswuVar3 = eswuVar2;
                                    bseh a4 = bsom.a(eswuVar3.c);
                                    if (a4 == null) {
                                        csjb e2 = tqy.a.e();
                                        String str3 = cdii.t.a;
                                        int b5 = eswt.b(eswuVar3.b);
                                        e2.A(str3, eswt.a(b5 != 0 ? b5 : 1));
                                        e2.A(cdii.v.a, "Ignore");
                                        e2.A(cdii.w.a, eswuVar3.c);
                                        e2.A(cdii.x.a, "Conversation does not exist in bugle database.");
                                        e2.I("ConversationEvent received");
                                        e2.r();
                                        return;
                                    }
                                    Optional optional = a3;
                                    tqy tqyVar3 = tqy.this;
                                    ConversationIdType C = a4.C();
                                    if (tqyVar3.d(C, (esid) optional.get(), a4, eswuVar3)) {
                                        tqyVar3.c(C, true);
                                        return;
                                    }
                                    csjb a5 = tqy.a.a();
                                    String str4 = cdii.t.a;
                                    int b6 = eswt.b(eswuVar3.b);
                                    a5.A(str4, eswt.a(b6 != 0 ? b6 : 1));
                                    a5.A(cdii.w.a, eswuVar3.c);
                                    a5.I("Conversation read status not updated");
                                    a5.r();
                                }
                            });
                        }
                        tqy.b(eswuVar2, "Unable to get a ReadStatus object.");
                        return elfo.e(null);
                    } catch (Throwable th) {
                        csjb e2 = tqy.a.e();
                        String str3 = cdii.t.a;
                        int b5 = eswt.b(eswuVar2.b);
                        if (b5 == 0) {
                            b5 = 1;
                        }
                        e2.A(str3, eswt.a(b5));
                        e2.A(cdii.v.a, "Failed to process event");
                        e2.A(cdii.w.a, eswuVar2.c);
                        e2.s(th);
                        return elfo.d(th);
                    }
                }
            }, tqyVar.g).f(fedn.class, new eroh() { // from class: tqv
                @Override // defpackage.eroh
                public final ListenableFuture a(Object obj) {
                    fedn fednVar = (fedn) obj;
                    Status status = fednVar.a;
                    cskc cskcVar = tqy.a;
                    if (!status.getCode().equals(Status.Code.NOT_FOUND)) {
                        return elfo.d(fednVar);
                    }
                    eswu eswuVar2 = eswu.this;
                    csjb e2 = tqy.a.e();
                    String str3 = cdii.t.a;
                    int b5 = eswt.b(eswuVar2.b);
                    if (b5 == 0) {
                        b5 = 1;
                    }
                    e2.A(str3, eswt.a(b5));
                    e2.A(cdii.v.a, "Ignore");
                    e2.A(cdii.w.a, eswuVar2.c);
                    e2.A(cdii.x.a, "Conversation does not exist in CMS.");
                    e2.I("ConversationEvent received");
                    e2.r();
                    return elfo.e(null);
                }
            }, tqyVar.h);
        }
        tqy.b(eswuVar, "No most_recent_read_message_time_web");
        return elfo.e(null);
    }
}
