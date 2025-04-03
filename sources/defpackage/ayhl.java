package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ayhl implements ayhm {
    private static final enru a = enru.c("com/google/android/apps/messaging/shared/conversation/match/ConversationByThreadIdFinderImpl");
    private final ffbr b;
    private final ffbr c;
    private final ffbr d;
    private final ffbr e;
    private final ffbr f;
    private final ffbr g;

    public ayhl(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, ffbr ffbrVar6) {
        ffbrVar.getClass();
        ffbrVar2.getClass();
        ffbrVar3.getClass();
        ffbrVar5.getClass();
        ffbrVar6.getClass();
        this.b = ffbrVar;
        this.c = ffbrVar2;
        this.d = ffbrVar3;
        this.e = ffbrVar4;
        this.f = ffbrVar5;
        this.g = ffbrVar6;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v33, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v17, types: [java.lang.Object, java.util.Collection] */
    @Override // defpackage.ayhm
    public final ConversationIdType a(cpxu cpxuVar) {
        Optional s;
        efbd.b();
        if (!cpxuVar.c()) {
            throw new IllegalStateException("Check failed.");
        }
        String I = ((coxk) this.b.b()).I(cpxuVar);
        if (I == null) {
            ((enrr) a.j().h("com/google/android/apps/messaging/shared/conversation/match/ConversationByThreadIdFinderImpl", "isRcsGroupConversation", 153, "ConversationByThreadIdFinderImpl.kt")).t("Recipient ID for the given thread not found. Thread ID: %s", cpxuVar);
        } else if (enjk.b(emye.b(' ').g(I)) <= 1) {
            if (((ckdn) this.e.b()).f(((coxk) this.b.b()).E(Long.parseLong(I)))) {
                enru enruVar = a;
                ((enrr) enruVar.h().h("com/google/android/apps/messaging/shared/conversation/match/ConversationByThreadIdFinderImpl", "findConversation", 75, "ConversationByThreadIdFinderImpl.kt")).q("Looking up RCS Group Conversation with Thread ID");
                cpbd a2 = ((cozl) this.f.b()).a(coto.a, cpxuVar.a(), "");
                if (a2.e == null || a2.b.isEmpty()) {
                    ((enrr) enruVar.j().h("com/google/android/apps/messaging/shared/conversation/match/ConversationByThreadIdFinderImpl", "findConversation", 88, "ConversationByThreadIdFinderImpl.kt")).q("Unable to find RCS group conversation because the conference uri is null. Returning conversation based on thread ID");
                    ConversationIdType p = ((bczy) this.c.b()).p(coto.a, cpxuVar);
                    p.getClass();
                    return p;
                }
                ckjy w = ckjz.w();
                w.q(true);
                w.p(false);
                w.u(a2.e);
                w.w(epby.UNKNOWN_TRIGGER_SOURCE);
                w.j(true);
                ArrayList arrayList = a2.b;
                ArrayList arrayList2 = new ArrayList(ffdx.n(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(bdqu.g(-1, (aoku) it.next()).a());
                }
                w.r(arrayList2);
                String str = a2.c;
                if (str != null) {
                    w.n(str);
                }
                return ((ckju) this.g.b()).a(w.D());
            }
        }
        enru enruVar2 = a;
        ((enrr) enruVar2.h().h("com/google/android/apps/messaging/shared/conversation/match/ConversationByThreadIdFinderImpl", "findConversation", 116, "ConversationByThreadIdFinderImpl.kt")).q("Looking up XMS conversation with Thread ID");
        Optional C = ((coxk) this.b.b()).C(cpxuVar);
        if (C.isPresent()) {
            ?? r0 = C.get();
            ArrayList arrayList3 = new ArrayList(ffdx.n(r0, 10));
            Iterator it2 = r0.iterator();
            while (it2.hasNext()) {
                String n = ((aoku) it2.next()).n();
                if (n == null) {
                    n = "";
                }
                arrayList3.add(n);
            }
            engq.f(arrayList3);
            s = ((ayif) this.d.b()).r(C.get());
        } else {
            ((enrr) enruVar2.j().h("com/google/android/apps/messaging/shared/conversation/match/ConversationByThreadIdFinderImpl", "findConversation", 137, "ConversationByThreadIdFinderImpl.kt")).q("No messaging identities found from canonical addresses table to find existing conversation with BCM");
            s = ((ayif) this.d.b()).s(new enpx("ʼUNKNOWN_SENDER!ʼ").g());
        }
        final ffji ffjiVar = new ffji() { // from class: ayhj
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                return ((bseh) obj).C();
            }
        };
        Object orElse = s.map(new Function() { // from class: ayhk
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ffji.this.invoke(obj);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).orElse(bdgq.a);
        orElse.getClass();
        return (ConversationIdType) orElse;
    }
}
