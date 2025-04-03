package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import java.util.Collection;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ayfp implements ayfi {
    public static final entd a = entd.c("BugleBCM");
    public static final cfup b = cfvl.i(cfvl.b, "update_thread_id_for_conversation", true);
    public static final cfup c = cfvl.i(cfvl.b, "log_update_thread_id_for_conversation", true);
    public final ffbr d;
    private final ffbr e;
    private final ffbr f;
    private final ffbr g;
    private final ffbr h;
    private final ffbr i;
    private final Optional j;
    private final asmj k;
    private final ffbr l;
    private final Context m;

    public ayfp(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, ffbr ffbrVar6, Optional optional, asmj asmjVar, ffbr ffbrVar7, Context context) {
        this.e = ffbrVar;
        this.f = ffbrVar2;
        this.g = ffbrVar3;
        this.d = ffbrVar4;
        this.h = ffbrVar5;
        this.i = ffbrVar6;
        this.j = optional;
        this.k = asmjVar;
        this.l = ffbrVar7;
        this.m = context;
    }

    public static void c(bseh bsehVar, cpxu cpxuVar) {
        entd entdVar = a;
        ((ensz) entdVar.n().h("com/google/android/apps/messaging/shared/conversation/ConversationThreadIdGetterImpl", "updateThreadIdForConversationInternal", 279, "ConversationThreadIdGetterImpl.java")).J("BCM updating conversationId=%s, existingThreadId=%s, newThreadId=%s", bsehVar.C(), bsehVar.M(), cpxuVar);
        if (cpxuVar.d()) {
            ((ensz) ((ensz) entdVar.j()).h("com/google/android/apps/messaging/shared/conversation/ConversationThreadIdGetterImpl", "updateThreadIdForConversationInternal", 284, "ConversationThreadIdGetterImpl.java")).J("BCM updating conversationId=%s error, telephony did not return a valid thread, existingThreadId=%s, newThreadId=%s", bsehVar.C(), bsehVar.M(), cpxuVar);
            return;
        }
        String[] strArr = bsom.a;
        bsoe bsoeVar = new bsoe();
        bsoeVar.ap("updateThreadIdForConversationInternal");
        bsoeVar.X(cpxuVar);
        bsoeVar.f(bsehVar.C());
    }

    private final cpxu d(String str) {
        return new cpxu(((coxk) this.f.b()).f(this.m, coto.a, str));
    }

    private final cpxu e(String str) {
        return new cpxu(((coxk) this.f.b()).f(this.m, coto.a, str));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v15, types: [cpxu] */
    /* JADX WARN: Type inference failed for: r8v16, types: [cpxu] */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v18 */
    private final cpxu f(String str, boolean z, bseh bsehVar) {
        if (((Boolean) ayhv.a.e()).booleanValue()) {
            try {
                str = z ? d(str) : e(str);
            } catch (RuntimeException e) {
                ((akzt) this.i.b()).e("Bugle.ConversationThreadIdGetterImpl.FindThreadForConversation.TelephonyLookupRetry.Count", 1);
                ensz enszVar = (ensz) ((ensz) a.j()).g(e);
                enszVar.aa(ensy.FULL);
                ensz enszVar2 = (ensz) enszVar.h("com/google/android/apps/messaging/shared/conversation/ConversationThreadIdGetterImpl", "getRcsThreadId", 367, "ConversationThreadIdGetterImpl.java");
                String str2 = true != z ? "RCS group" : "RBM";
                enszVar2.t("getOrCreateThreadId for %s failed with exception, attempting retry", str2);
                try {
                    str = z ? d(str) : e(str);
                    ((akzt) this.i.b()).e("Bugle.ConversationThreadIdGetterImpl.FindThreadForConversation.TelephonyLookupRetry.Count", 2);
                } catch (RuntimeException e2) {
                    ensz enszVar3 = (ensz) ((ensz) a.j()).g(e2);
                    enszVar3.aa(ensy.FULL);
                    ((ensz) enszVar3.h("com/google/android/apps/messaging/shared/conversation/ConversationThreadIdGetterImpl", "getRcsThreadId", 376, "ConversationThreadIdGetterImpl.java")).t("getOrCreateThreadId retry failed for %s failed with exception. Returning threadId from conversation", str2);
                    str = bsehVar.M();
                    h(str);
                }
            }
        } else {
            str = z ? d(str) : e(str);
        }
        ((ensz) a.n().h("com/google/android/apps/messaging/shared/conversation/ConversationThreadIdGetterImpl", "getRcsThreadId", 389, "ConversationThreadIdGetterImpl.java")).D("RCS group conversationId=%s, threadId=%s", bsehVar.C(), str);
        return str;
    }

    private final cpxu g(engw engwVar) {
        return new cpxu(((coxk) this.f.b()).g(this.m, coto.a, (Collection) Collection.EL.stream(engwVar).filter(new Predicate() { // from class: ayfn
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
            public final boolean test(Object obj) {
                entd entdVar = ayfp.a;
                return ((ParticipantsTable.BindData) obj).U() != null;
            }
        }).map(new Function() { // from class: ayfo
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                entd entdVar = ayfp.a;
                String U = ((ParticipantsTable.BindData) obj).U();
                emyw.e(U);
                return U;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).collect(endq.b)));
    }

    private static void h(cpxu cpxuVar) {
        if (cpxuVar.d()) {
            ((ensz) ((ensz) a.j()).h("com/google/android/apps/messaging/shared/conversation/ConversationThreadIdGetterImpl", "checkThreadIdIsKnown", 474, "ConversationThreadIdGetterImpl.java")).q("getOrCreateThreadId resolved threadId to -1");
        }
    }

    @Override // defpackage.ayfi
    public final cpxu a(ConversationIdType conversationIdType) {
        emxf.l(!efbd.g());
        bseh b2 = bsom.b(conversationIdType);
        if (b2 == null) {
            ((ensz) ((ensz) a.j()).h("com/google/android/apps/messaging/shared/conversation/ConversationThreadIdGetterImpl", "getOrCreateThreadIdForConversation", 144, "ConversationThreadIdGetterImpl.java")).t("Conversation query returned null for conversation [%s]", conversationIdType);
            return new cpxu();
        }
        emyw.e(b2);
        return b(b2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ayfi
    public final cpxu b(final bseh bsehVar) {
        final cpxu M;
        emxf.l(!efbd.g());
        int k = bsehVar.k();
        if (byyr.c(k) || byyr.e(k)) {
            engw y = bcui.d(bsehVar.C()).y();
            if (bsehVar.am()) {
                emyw.a(!y.isEmpty());
                emyw.a(((enou) y).c < 2);
                emyw.a(((ParticipantsTable.BindData) y.get(0)).o() == 1);
                M = f(((ckdn) this.e.b()).b(cowe.a((ParticipantsTable.BindData) y.get(0))), true, bsehVar);
            } else if (((Boolean) ayhv.a.e()).booleanValue()) {
                try {
                    M = g(y);
                } catch (RuntimeException e) {
                    ((akzt) this.i.b()).e("Bugle.ConversationThreadIdGetterImpl.FindThreadForConversation.TelephonyLookupRetry.Count", 1);
                    ensz enszVar = (ensz) ((ensz) a.j()).g(e);
                    enszVar.aa(ensy.FULL);
                    ((ensz) enszVar.h("com/google/android/apps/messaging/shared/conversation/ConversationThreadIdGetterImpl", "findThreadForXmsConversation", 411, "ConversationThreadIdGetterImpl.java")).q("getOrCreateThreadId for XMS failed with exception, attempting retry");
                    try {
                        M = g(y);
                        ((akzt) this.i.b()).e("Bugle.ConversationThreadIdGetterImpl.FindThreadForConversation.TelephonyLookupRetry.Count", 2);
                    } catch (RuntimeException e2) {
                        ensz enszVar2 = (ensz) ((ensz) a.j()).g(e2);
                        enszVar2.aa(ensy.FULL);
                        ((ensz) enszVar2.h("com/google/android/apps/messaging/shared/conversation/ConversationThreadIdGetterImpl", "findThreadForXmsConversation", 419, "ConversationThreadIdGetterImpl.java")).q("getOrCreateThreadId retry failed for XMS failed with exception. Returning threadId from conversation");
                        M = bsehVar.M();
                    }
                    ((ensz) a.n().h("com/google/android/apps/messaging/shared/conversation/ConversationThreadIdGetterImpl", "findThreadForXmsConversation", 426, "ConversationThreadIdGetterImpl.java")).D("XMS conversationId=%s, threadId=%s", bsehVar.C(), M);
                    h(M);
                }
            } else {
                M = g(y);
            }
        } else {
            if (!byyr.d(k)) {
                throw new UnsupportedOperationException("Unknown conversation type, type=" + k + ", conversationId=" + String.valueOf(bsehVar.C()));
            }
            M = f(((clbb) this.g.b()).a(emxe.b(bsehVar.ae()), emxe.b(bsehVar.ad()), bsehVar.X()), false, bsehVar);
        }
        if (((Boolean) b.e()).booleanValue() && !M.equals(bsehVar.M())) {
            if (this.k.a()) {
                ((azei) this.l.b()).d(new Consumer() { // from class: ayfl
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void o(Object obj) {
                        cpdd cpddVar = (cpdd) obj;
                        entd entdVar = ayfp.a;
                        bseh bsehVar2 = bseh.this;
                        boolean d = byyr.d(bsehVar2.k());
                        cpxu cpxuVar = M;
                        if (d) {
                            cpddVar.e(cpxuVar);
                        } else if (bsehVar2.q() > 1) {
                            cpddVar.b(cpxuVar);
                        } else {
                            cpddVar.d(cpxuVar);
                        }
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
            } else {
                this.j.ifPresent(new Consumer() { // from class: ayfm
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void o(Object obj) {
                        cpdd cpddVar = (cpdd) obj;
                        entd entdVar = ayfp.a;
                        bseh bsehVar2 = bseh.this;
                        boolean d = byyr.d(bsehVar2.k());
                        cpxu cpxuVar = M;
                        if (d) {
                            cpddVar.e(cpxuVar);
                        } else if (bsehVar2.q() > 1) {
                            cpddVar.b(cpxuVar);
                        } else {
                            cpddVar.d(cpxuVar);
                        }
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
            }
            if (!((Boolean) c.e()).booleanValue()) {
                c(bsehVar, M);
            } else if (!M.equals(bsehVar.M())) {
                ((ensz) a.n().h("com/google/android/apps/messaging/shared/conversation/ConversationThreadIdGetterImpl", "updateThreadIdForConversation", 259, "ConversationThreadIdGetterImpl.java")).J("Scheduling ConversationThreadIdUpdaterWorker. conversationId=%s, existingThreadId=%s, newThreadId=%s", bsehVar.C(), bsehVar.M(), M);
                ayfs ayfsVar = (ayfs) this.h.b();
                ezgg ezggVar = (ezgg) ezgh.a.createBuilder();
                String a2 = bsehVar.C().a();
                ezggVar.copyOnWrite();
                ezgh ezghVar = (ezgh) ezggVar.instance;
                a2.getClass();
                ezghVar.b = a2;
                long a3 = M.a();
                ezggVar.copyOnWrite();
                ((ezgh) ezggVar.instance).c = a3;
                ((cevh) ayfsVar.a.b()).a(ceyr.g("conversation_thread_id_updater_worker", (ezgh) ezggVar.build()));
            }
        }
        return M;
    }
}
