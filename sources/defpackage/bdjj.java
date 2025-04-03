package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bdjj implements bdna {
    public static final cfup a = cfvl.i(cfvl.b, "bug_204470084_enable_message_list_data_decoration_latency_timer", true);
    private static final ecda c = new ecda("MessageListDataDecorationLatency");
    public final Set b;
    private final ecrj d;

    public bdjj(Set set, ecrj ecrjVar) {
        ecrjVar.getClass();
        this.b = set;
        this.d = ecrjVar;
    }

    @Override // defpackage.bdna
    public final void a(final bcse bcseVar) {
        bcseVar.getClass();
        ecda ecdaVar = c;
        ecdaVar.getClass();
        ffix ffixVar = new ffix() { // from class: bdji
            @Override // defpackage.ffix
            public final Object invoke() {
                enqu listIterator = ((enpx) bdjj.this.b).listIterator();
                while (listIterator.hasNext()) {
                    ((bdna) listIterator.next()).a(bcseVar);
                }
                return ffcu.a;
            }
        };
        if (!((Boolean) a.e()).booleanValue()) {
            ffixVar.invoke();
            return;
        }
        ecrj ecrjVar = this.d;
        ecri d = ecrjVar.d();
        ecrh ecrhVar = ecrh.SUCCESS;
        try {
            try {
                ffixVar.invoke();
            } catch (Exception e) {
                ecrhVar = ecrh.ERROR;
                throw e;
            }
        } finally {
            ecrjVar.f(d, ecdaVar, null, ecrhVar);
        }
    }
}
