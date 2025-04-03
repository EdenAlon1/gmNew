package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tbr extends ceuj {
    public static final entd a = entd.c("BugleSuperSort");
    static final cfva b = cfvl.i(cfvl.b, "ss_use_work_manager_specific_msg", false);
    public final tba c;
    private final ffbr d;
    private final errl e;
    private final errl f;

    public tbr(ffbr ffbrVar, tba tbaVar, errl errlVar, errl errlVar2) {
        this.d = ffbrVar;
        this.c = tbaVar;
        this.e = errlVar;
        this.f = errlVar2;
        tbaVar.c(true);
    }

    @Override // defpackage.ceuj, defpackage.ceve
    public final cety a() {
        cetx l = cety.l();
        if (((Boolean) b.e()).booleanValue()) {
            l.b(cevc.WORKMANAGER_ONLY);
        }
        l.d(10);
        return l.h();
    }

    @Override // defpackage.ceve
    public final ekzz b() {
        return eleg.f("ClassifySpecificMessagesHandler");
    }

    @Override // defpackage.ceve
    public final eyhz d() {
        return tbc.a.getParserForType();
    }

    @Override // defpackage.ceuj
    public final elfl j(ceuw ceuwVar, final engw engwVar) {
        elfl h;
        ekzz f = eleg.f("ClassifySpecificMessagesHandler#processPendingWorkItemAsync");
        try {
            entd entdVar = a;
            ((ensz) ((ensz) entdVar.h()).h("com/google/android/apps/messaging/classify/workhandler/ClassifySpecificMessagesHandler", "processPendingWorkItemAsync", 109, "ClassifySpecificMessagesHandler.java")).t("Handler %s invoked", "CLASSIFY_SPECIFIC_MESSAGES");
            if (engwVar.isEmpty()) {
                ((ensz) entdVar.o().h("com/google/android/apps/messaging/classify/workhandler/ClassifySpecificMessagesHandler", "processPendingWorkItemAsync", 111, "ClassifySpecificMessagesHandler.java")).t("%s: empty proto list, no work to do.", "CLASSIFY_SPECIFIC_MESSAGES");
                h = elfo.e(ceyt.i());
                f.b(h);
            } else {
                h = ((ahik) this.d.b()).d().i(new eroh() { // from class: tbo
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj) {
                        Boolean bool = (Boolean) obj;
                        elfl e = elfo.e(true);
                        if (!aewg.h()) {
                            ((ensz) ((ensz) tbr.a.h()).h("com/google/android/apps/messaging/classify/workhandler/ClassifySpecificMessagesHandler", "processPendingWorkItemAsync", 126, "ClassifySpecificMessagesHandler.java")).t("Supersort flag is disabled, skipping %s", "CLASSIFY_SPECIFIC_MESSAGES");
                            return e;
                        }
                        if (!bool.booleanValue()) {
                            ((ensz) ((ensz) tbr.a.h()).h("com/google/android/apps/messaging/classify/workhandler/ClassifySpecificMessagesHandler", "processPendingWorkItemAsync", 131, "ClassifySpecificMessagesHandler.java")).t("Supersort feature is disabled, skipping %s", "CLASSIFY_SPECIFIC_MESSAGES");
                            return e;
                        }
                        engw engwVar2 = engwVar;
                        tbr tbrVar = tbr.this;
                        tbrVar.c.b();
                        for (int i = 0; i < ((enou) engwVar2).c; i++) {
                            e = tbrVar.c.a(e, bdhb.b(((tbc) engwVar2.get(i)).b));
                        }
                        return e.h(new emwl() { // from class: tbq
                            @Override // defpackage.emwl
                            public final Object apply(Object obj2) {
                                entd entdVar2 = tbr.a;
                                return true;
                            }
                        }, erpp.a);
                    }
                }, this.e).h(new emwl() { // from class: tbp
                    @Override // defpackage.emwl
                    public final Object apply(Object obj) {
                        Boolean bool = (Boolean) obj;
                        entd entdVar2 = tbr.a;
                        if (bool == null || !bool.booleanValue()) {
                            ((ensz) ((ensz) tbr.a.h()).h("com/google/android/apps/messaging/classify/workhandler/ClassifySpecificMessagesHandler", "complete", 157, "ClassifySpecificMessagesHandler.java")).t("%s: failed, retrying.", "CLASSIFY_SPECIFIC_MESSAGES");
                            return ceyt.m();
                        }
                        ((ensz) ((ensz) tbr.a.h()).h("com/google/android/apps/messaging/classify/workhandler/ClassifySpecificMessagesHandler", "complete", 153, "ClassifySpecificMessagesHandler.java")).t("%s: completed.", "CLASSIFY_SPECIFIC_MESSAGES");
                        return ceyt.i();
                    }
                }, this.f);
                f.b(h);
            }
            f.close();
            return h;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
