package defpackage;

import android.view.ActionMode;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.home.select.SelectedConversation;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Predicate$CC;
import java.util.function.Consumer;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aebz extends orc {
    final /* synthetic */ aedh a;

    public aebz(aedh aedhVar) {
        this.a = aedhVar;
    }

    @Override // defpackage.orc
    public final /* bridge */ /* synthetic */ void a(Object obj, final boolean z) {
        final String str = (String) obj;
        if (((aube) this.a.bv.b()).a()) {
            ensk e = aedh.a.e();
            e.Y(ente.a, "HomeFragmentFlogger");
            ((enrr) ((enrr) e).h("com/google/android/apps/messaging/home/HomeFragmentPeer$11", "onItemStateChanged", 1802, "HomeFragmentPeer.java")).E("onItemStateChanged: key=%s, selected=%s", str, z);
        } else {
            csjb a = aeaa.a.a();
            a.I("onItemStateChanged");
            a.A("key", str);
            a.B("selected", z);
            a.r();
        }
        final aedh aedhVar = this.a;
        if (aedhVar.b.G() != null && aedhVar.aN.l(str) == z) {
            if (z && !aedhVar.D()) {
                aedhVar.n();
            }
            if (aedhVar.D()) {
                final czyz k = aedh.k(aedhVar.b.fe());
                if (k.e(bdgq.b(str)) != z) {
                    oiv m = ((aehw) aedhVar.p.b()).m();
                    (m == null ? Optional.empty() : Collection.EL.stream(m).filter(new Predicate() { // from class: aeht
                        public final /* synthetic */ Predicate and(Predicate predicate) {
                            return Predicate$CC.$default$and(this, predicate);
                        }

                        @Override // java.util.function.Predicate
                        /* renamed from: negate */
                        public final /* synthetic */ Predicate mo439negate() {
                            return Predicate$CC.$default$negate(this);
                        }

                        public final /* synthetic */ Predicate or(Predicate predicate) {
                            return Predicate$CC.$default$or(this, predicate);
                        }

                        @Override // java.util.function.Predicate
                        public final boolean test(Object obj2) {
                            aely aelyVar = (aely) obj2;
                            entd entdVar = aehw.d;
                            return aelyVar != null && str.equals(aelyVar.k().w().a());
                        }
                    }).findFirst()).ifPresent(new Consumer() { // from class: aeak
                        @Override // java.util.function.Consumer
                        /* renamed from: accept */
                        public final void o(Object obj2) {
                            entd entdVar = aehw.d;
                            SelectedConversation a2 = aehx.a((aely) obj2);
                            ConversationIdType conversationIdType = a2.a;
                            if (conversationIdType == null) {
                                return;
                            }
                            aedh aedhVar2 = aedh.this;
                            boolean z2 = z;
                            czyz czyzVar = k;
                            czyzVar.b = aedhVar2.aV;
                            if (z2) {
                                czyzVar.a.put(conversationIdType, a2);
                            } else {
                                czyzVar.a.remove(conversationIdType);
                            }
                            czyzVar.d();
                        }

                        public final /* synthetic */ Consumer andThen(Consumer consumer) {
                            return Consumer$CC.$default$andThen(this, consumer);
                        }
                    });
                    if (aedhVar.aM.a().isPresent()) {
                        ((ActionMode) aedhVar.aM.a().get()).setTitle(((auyb) aedhVar.bz.b()).a() ? Integer.toString(k.a()) : aedhVar.b.B().getQuantityString(R.plurals.selected_count, k.a(), Integer.valueOf(k.a())));
                    }
                    aedhVar.aM.c();
                }
            }
        }
    }
}
