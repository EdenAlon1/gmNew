package defpackage;

import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ayga extends cpdo {
    final /* synthetic */ ffbr a;
    final /* synthetic */ ffbr b;
    final /* synthetic */ errl c;

    public ayga(ffbr ffbrVar, ffbr ffbrVar2, errl errlVar) {
        this.a = ffbrVar;
        this.b = ffbrVar2;
        this.c = errlVar;
    }

    @Override // defpackage.cqor
    public final ekzz a() {
        return eleg.f("CleanupConversationStartupTask");
    }

    @Override // defpackage.cpdo
    public final elfl b() {
        final ffbr ffbrVar = this.a;
        final ffbr ffbrVar2 = this.b;
        return elfo.f(new Runnable() { // from class: ayfz
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Runnable
            public final void run() {
                ekzz f = eleg.f("DeleteDatabaseOperations#getSoftDeletedConversations");
                try {
                    csix.h();
                    bsob e = bsom.e();
                    e.z("getSoftDeletedConversations");
                    e.i(new Function() { // from class: cgpk
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo448andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            bsol bsolVar = (bsol) obj;
                            int intValue = bsom.g().intValue();
                            if (intValue < 29020) {
                                dtub.w("delete_timestamp", intValue);
                            }
                            bsolVar.aq(new dtwe("conversations.delete_timestamp", 7, 0L));
                            return bsolVar;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    engw y = e.b().y();
                    f.close();
                    enqv it = y.iterator();
                    while (it.hasNext()) {
                        ffbr ffbrVar3 = ffbrVar2;
                        bseh bsehVar = (bseh) it.next();
                        csix.k(bsehVar.u() > 0);
                        ayfy ayfyVar = (ayfy) ffbrVar3.b();
                        aygb f2 = aygc.f();
                        f2.f(eoko.CONVERSATION_FROM_BG_STARTUP_TASK);
                        f2.b(bsehVar.C());
                        f2.c(bsehVar.u());
                        ayfyVar.b(f2.a());
                    }
                } catch (Throwable th) {
                    try {
                        f.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
        }, this.c);
    }

    @Override // defpackage.cpeh
    public final boolean c() {
        return true;
    }
}
