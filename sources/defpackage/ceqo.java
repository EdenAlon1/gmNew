package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ceqo extends ceut {
    public final cskc a = cskc.g("BugleDataModel", "DeleteThreadFromTelephonyHandler");
    public final coxk b;
    private final errl c;

    public ceqo(errl errlVar, coxk coxkVar) {
        this.c = errlVar;
        this.b = coxkVar;
    }

    @Override // defpackage.ceve
    public final ekzz b() {
        return eleg.f("DeleteThreadFromTelephonyHandler");
    }

    @Override // defpackage.ceve
    public final eyhz d() {
        return ceqq.a.getParserForType();
    }

    @Override // defpackage.ceut
    protected final /* bridge */ /* synthetic */ elfl j(ceuw ceuwVar, eyhs eyhsVar) {
        final ceqq ceqqVar = (ceqq) eyhsVar;
        return elfo.g(new Callable() { // from class: ceqn
            @Override // java.util.concurrent.Callable
            public final Object call() {
                ceqo ceqoVar = ceqo.this;
                coxk coxkVar = ceqoVar.b;
                ceqq ceqqVar2 = ceqqVar;
                if (coxkVar.U(ceqqVar2.c, ceqqVar2.d)) {
                    long j = ceqqVar2.d;
                    long j2 = ceqqVar2.c;
                    csjb c = ceqoVar.a.c();
                    c.I("Deleted telephony");
                    c.z("threadId", j2);
                    c.z("cutoffTimestamp", j);
                    c.r();
                } else {
                    ConversationIdType b = bdgq.b(ceqqVar2.b);
                    long j3 = ceqqVar2.d;
                    long j4 = ceqqVar2.c;
                    csjb e = ceqoVar.a.e();
                    e.I("there were no messages to delete. telephony:");
                    e.c(b);
                    e.z("threadId", j4);
                    e.z("cutoffTimestamp", j3);
                    e.I("[might have been a conversation with just a draft].");
                    e.r();
                }
                return ceyt.i();
            }
        }, this.c);
    }
}
