package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import j$.util.function.Function$CC;
import java.util.concurrent.Callable;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class ckqp extends ceut {
    public static final entd a = entd.c("BugleGroupManagement");
    public final ffbr b;
    public final cqoh c;
    public final bdtd d;
    public final cbvt e;
    public final dtuu f;
    public final cbgf g;
    public final akzt h;
    private final errl i;

    public ckqp(errl errlVar, ffbr ffbrVar, cqoh cqohVar, bdtd bdtdVar, cbvt cbvtVar, dtuu dtuuVar, cbgf cbgfVar, akzt akztVar) {
        this.i = errlVar;
        this.b = ffbrVar;
        this.c = cqohVar;
        this.d = bdtdVar;
        this.e = cbvtVar;
        this.f = dtuuVar;
        this.g = cbgfVar;
        this.h = akztVar;
    }

    @Override // defpackage.ceve
    public final ekzz b() {
        return eleg.f("MarkAllRcsGroupsAsLeftHandler");
    }

    @Override // defpackage.ceve
    public final eyhz d() {
        return ckqr.a.getParserForType();
    }

    @Override // defpackage.ceut
    protected final /* bridge */ /* synthetic */ elfl j(ceuw ceuwVar, eyhs eyhsVar) {
        return elfo.g(new Callable() { // from class: ckqk
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.concurrent.Callable
            public final Object call() {
                final ckqp ckqpVar = ckqp.this;
                cqoh cqohVar = ckqpVar.c;
                final aztg e = ckqpVar.d.e();
                final long epochMilli = cqohVar.f().toEpochMilli();
                bsob e2 = bsom.e();
                e2.z("getAllActiveRcsGroups");
                e2.r();
                bskp bskpVar = bsom.c;
                e2.c(bskpVar.a, bskpVar.M);
                e2.i(new Function() { // from class: ckqn
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        bsol bsolVar = (bsol) obj;
                        entd entdVar = ckqp.a;
                        bsolVar.j(2);
                        bsolVar.y(2);
                        return bsolVar;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                engw y = e2.b().y();
                ckqpVar.h.c("Bugle.Groups.MarkedLeft.Count");
                enou enouVar = (enou) y;
                ((ensz) ((ensz) ckqp.a.h()).h("com/google/android/apps/messaging/shared/rcs/groups/leave/MarkAllRcsGroupsAsLeftHandler", "processPendingWorkItemAsync", 103, "MarkAllRcsGroupsAsLeftHandler.java")).r("Marking %d groups as left.", enouVar.c);
                int i = enouVar.c;
                for (int i2 = 0; i2 < i; i2++) {
                    bseh bsehVar = (bseh) y.get(i2);
                    final ConversationIdType C = bsehVar.C();
                    final long v = bsehVar.v();
                    ckqpVar.f.d("MarkAllRcsGroupsAsLeftHandler#processPendingWorkItemAsync", new Runnable() { // from class: ckqo
                        @Override // java.lang.Runnable
                        public final void run() {
                            final ckqp ckqpVar2 = ckqp.this;
                            cbvt cbvtVar = ckqpVar2.e;
                            aztg aztgVar = e;
                            long j = epochMilli;
                            final ConversationIdType conversationIdType = C;
                            cbvtVar.l(aztgVar, j, conversationIdType, v, BasePaymentResult.ERROR_REQUEST_CONNECTION_FAILED);
                            ((bczy) ckqpVar2.b.b()).N(conversationIdType);
                            ckqpVar2.f.g(new dtut() { // from class: ckql
                                @Override // defpackage.dtut
                                public final ekzz a() {
                                    entd entdVar = ckqp.a;
                                    return eleg.f("MARGALH::notifyConversationMetadataChanged::runAfterCommit");
                                }
                            }, null, new Runnable() { // from class: ckqm
                                @Override // java.lang.Runnable
                                public final void run() {
                                    ckqp.this.g.d(conversationIdType);
                                }
                            });
                        }
                    });
                }
                return ceyt.i();
            }
        }, this.i);
    }
}
