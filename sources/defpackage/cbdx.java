package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.Iterator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cbdx implements cbek {
    public final ffbr b;
    public final Optional c;
    private final ffbr e;
    private final ffbr f;
    private static final enru d = enru.c("com/google/android/apps/messaging/shared/datamodel/operations/DatabaseThreadOperations");
    static final cfva a = cfvl.i(cfvl.b, "fix_invalid_thread_id", true);

    public cbdx(ffbr ffbrVar, ffbr ffbrVar2, Optional optional, ffbr ffbrVar3) {
        this.b = ffbrVar;
        this.e = ffbrVar2;
        this.c = optional;
        this.f = ffbrVar3;
    }

    private static cpxu c(ConversationIdType conversationIdType) {
        enru enruVar = d;
        enrr enrrVar = (enrr) enruVar.j();
        enrrVar.aa(ensy.FULL);
        ((enrr) enrrVar.h("com/google/android/apps/messaging/shared/datamodel/operations/DatabaseThreadOperations", "getThreadIdFromConversationsTable", 106, "DatabaseThreadOperations.java")).t("GetOrCreateThreadIdForConversation for conversation %s failed. Attempting to recover from Conversations Table", conversationIdType);
        cpxu cpxuVar = new cpxu();
        bseh b = bsom.b(conversationIdType);
        if (b == null || !b.M().c()) {
            ((enrr) ((enrr) enruVar.j()).h("com/google/android/apps/messaging/shared/datamodel/operations/DatabaseThreadOperations", "getThreadIdFromConversationsTable", 117, "DatabaseThreadOperations.java")).q("Failed to retrieve thread ID from conversations table. Setting thread ID as unknown.");
            return cpxuVar;
        }
        cpxu M = b.M();
        ((enrr) ((enrr) enruVar.h()).h("com/google/android/apps/messaging/shared/datamodel/operations/DatabaseThreadOperations", "getThreadIdFromConversationsTable", 115, "DatabaseThreadOperations.java")).q("Retrieved valid thread ID from conversations table.");
        return M;
    }

    @Override // defpackage.cbek
    public final cpxu a(ConversationIdType conversationIdType) {
        cpxu c;
        ekzz f = eleg.f("DatabaseThreadOperations#getThreadId");
        try {
            if (((Boolean) ayhv.a.e()).booleanValue()) {
                try {
                    c = ((ayfi) this.f.b()).a(conversationIdType);
                    if (c.d()) {
                        c = c(conversationIdType);
                    }
                } catch (emyx unused) {
                    c = c(conversationIdType);
                }
            } else {
                csix.h();
                c = (cpxu) bsom.i(conversationIdType, new Function() { // from class: cbdv
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    /* JADX WARN: Type inference failed for: r0v9, types: [ffbr, java.lang.Object] */
                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        bseh bsehVar = (bseh) obj;
                        if (bsehVar.M().c()) {
                            return bsehVar.M();
                        }
                        if (bsehVar.M().c()) {
                            return bsehVar.M();
                        }
                        cbdx cbdxVar = cbdx.this;
                        if (bsehVar.ak()) {
                            ((akzt) cbdxVar.b.b()).c("Bugle.Wipeout.ReverseTelephonySync.GetThreadId.AwaitingSync.InvalidThreadId");
                            if (((Boolean) cbdx.a.e()).booleanValue()) {
                                cbdxVar.c.isPresent();
                                return ((cptb) cbdxVar.c.get().b()).a(bsehVar.C());
                            }
                        } else {
                            ((akzt) cbdxVar.b.b()).c("Bugle.Wipeout.ReverseTelephonySync.GetThreadId.NotAwaitingSync.InvalidThreadId");
                        }
                        return bsehVar.M();
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }, new Supplier() { // from class: cbdw
                    @Override // java.util.function.Supplier
                    public final Object get() {
                        return new cpxu();
                    }
                });
            }
            f.close();
            return c;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.cbek
    public final void b(List list, byyt byytVar) {
        boolean d2 = byytVar.d();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            cpxu a2 = a((ConversationIdType) it.next());
            if (a2.d()) {
                ((enrr) ((enrr) d.j()).h("com/google/android/apps/messaging/shared/datamodel/operations/DatabaseThreadOperations", "setThreadsArchiveStatusInTelephony", 152, "DatabaseThreadOperations.java")).q("Thread Id for conversation not found, skipping telephony archive status update");
            } else {
                ((coxk) this.e.b()).T(a2, d2);
            }
        }
    }
}
