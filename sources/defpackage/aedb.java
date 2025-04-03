package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.Optional;
import j$.util.function.IntConsumer$CC;
import j$.util.function.IntPredicate$CC;
import j$.util.stream.IntStream;
import java.util.List;
import java.util.function.IntConsumer;
import java.util.function.IntPredicate;

/* compiled from: PG */
/* loaded from: classes2.dex */
class aedb implements ejwd<Optional<aeiv>> {
    final /* synthetic */ aedh a;

    public aedb(aedh aedhVar) {
        this.a = aedhVar;
    }

    @Override // defpackage.ejwd
    public final void a(Throwable th) {
        if (!((aube) this.a.bv.b()).a()) {
            aeaa.a.s("Error getting conversation changed view part", th);
            return;
        }
        ensk j = aedh.a.j();
        j.Y(ente.a, "HomeFragmentFlogger");
        ((enrr) ((enrr) ((enrr) j).g(th)).h("com/google/android/apps/messaging/home/HomeFragmentPeer$4", "onError", (char) 1452, "HomeFragmentPeer.java")).q("Error getting conversation changed view part");
    }

    @Override // defpackage.ejwd
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        final Optional optional = (Optional) obj;
        if (optional.isEmpty()) {
            return;
        }
        final oiv m = ((aehw) this.a.p.b()).m();
        final ConversationIdType c = ((aeiv) optional.get()).c();
        if (m != null) {
            IntStream.CC.range(0, m.size()).filter(new IntPredicate() { // from class: aecz
                public final /* synthetic */ IntPredicate and(IntPredicate intPredicate) {
                    return IntPredicate$CC.$default$and(this, intPredicate);
                }

                public final /* synthetic */ IntPredicate negate() {
                    return IntPredicate$CC.$default$negate(this);
                }

                public final /* synthetic */ IntPredicate or(IntPredicate intPredicate) {
                    return IntPredicate$CC.$default$or(this, intPredicate);
                }

                @Override // java.util.function.IntPredicate
                public final boolean test(int i) {
                    List list = m;
                    return list.get(i) != null && c.equals(((aely) list.get(i)).k().w());
                }
            }).findFirst().ifPresent(new IntConsumer() { // from class: aeda
                @Override // java.util.function.IntConsumer
                public final void accept(int i) {
                    enin eninVar = new enin();
                    eninVar.c(((aeiv) optional.get()).b());
                    ((aehw) aedb.this.a.p.b()).r(i, new aelt(eninVar.g(), true));
                }

                public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
                    return IntConsumer$CC.$default$andThen(this, intConsumer);
                }
            });
        }
    }

    @Override // defpackage.ejwd
    public final void hB() {
    }
}
