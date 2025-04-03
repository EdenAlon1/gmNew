package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class ckop extends ceut {
    public static final /* synthetic */ int a = 0;
    private static final entd b = entd.c("BugleGroupManagement");
    private final cbgf c;

    public ckop(cbgf cbgfVar) {
        this.c = cbgfVar;
    }

    @Override // defpackage.ceve
    public final ekzz b() {
        return eleg.f("GroupSessionStartFailedHandler");
    }

    @Override // defpackage.ceve
    public final eyhz d() {
        return ckor.a.getParserForType();
    }

    @Override // defpackage.ceut
    protected final /* bridge */ /* synthetic */ elfl j(ceuw ceuwVar, eyhs eyhsVar) {
        final long j = ((ckor) eyhsVar).b;
        emxf.b(j != -1, "Invalid session ID.");
        bsob e = bsom.e();
        e.z("processPendingWorkItemAsync-conversations");
        e.i(new Function() { // from class: ckoo
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bsol bsolVar = (bsol) obj;
                int i = ckop.a;
                bsolVar.I(j);
                return bsolVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        bseh bsehVar = (bseh) ((bskr) e.b().o()).cS();
        if (bsehVar == null) {
            ensz enszVar = (ensz) b.j();
            enszVar.Y(csux.H, Long.valueOf(j));
            ((ensz) enszVar.h("com/google/android/apps/messaging/shared/rcs/groups/invite/GroupSessionStartFailedHandler", "processPendingWorkItemAsync", 71, "GroupSessionStartFailedHandler.java")).q("Found no conversation for session start failed event.");
            return elfo.e(ceyt.i());
        }
        ConversationIdType C = bsehVar.C();
        bsoe bsoeVar = new bsoe();
        bsoeVar.ap("processPendingWorkItemAsync#update");
        bsoeVar.T(-1L);
        bsoeVar.A(5);
        bsoeVar.f(C);
        this.c.d(C);
        ensk n = b.n();
        n.Y(csux.H, Long.valueOf(j));
        ((ensz) n.h("com/google/android/apps/messaging/shared/rcs/groups/invite/GroupSessionStartFailedHandler", "processPendingWorkItemAsync", 85, "GroupSessionStartFailedHandler.java")).q("Session start failed for a new RCS group. Updated conversation join state to group creation failed.");
        return elfo.e(ceyt.i());
    }
}
