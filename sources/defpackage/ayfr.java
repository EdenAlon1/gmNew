package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ayfr extends ceut {
    public static final /* synthetic */ int a = 0;
    private static final entd b = entd.c("BugleBCM");
    private final ffbr c;

    public ayfr(ffbr ffbrVar) {
        this.c = ffbrVar;
    }

    @Override // defpackage.ceut, defpackage.ceve
    public final cety a() {
        cetx l = cety.l();
        l.b(cevc.WAKELOCK);
        return l.h();
    }

    @Override // defpackage.ceve
    public final ekzz b() {
        return eleg.f("ConversationThreadIdUpdaterWorker");
    }

    @Override // defpackage.ceve
    public final eyhz d() {
        return ezgh.a.getParserForType();
    }

    @Override // defpackage.ceut
    public final /* bridge */ /* synthetic */ elfl j(ceuw ceuwVar, eyhs eyhsVar) {
        elfl b2;
        ezgh ezghVar = (ezgh) eyhsVar;
        entd entdVar = b;
        ((ensz) ((ensz) entdVar.h()).h("com/google/android/apps/messaging/shared/conversation/ConversationThreadIdUpdaterWorker", "processPendingWorkItemAsync", 64, "ConversationThreadIdUpdaterWorker.java")).C("ConversationThreadIdUpdaterWorker: Processing conversation=%s, newThreadId=%s", ezghVar.b, ezghVar.c);
        final bseh b3 = bsom.b(bdgq.b(ezghVar.b));
        if (b3 == null) {
            ((ensz) ((ensz) entdVar.j()).h("com/google/android/apps/messaging/shared/conversation/ConversationThreadIdUpdaterWorker", "processPendingWorkItemAsync", 71, "ConversationThreadIdUpdaterWorker.java")).t("ConversationThreadIdUpdaterWorker: Conversation does no longer exist. conversation_id=%s", ezghVar.b);
            return elfo.e(ceyt.i());
        }
        ayfp ayfpVar = (ayfp) this.c.b();
        final cpxu cpxuVar = new cpxu(ezghVar.c);
        if (!((Boolean) ayfp.c.e()).booleanValue()) {
            b2 = elfo.e(null);
        } else if (cpxuVar.d()) {
            ((ensz) ((ensz) ayfp.a.j()).h("com/google/android/apps/messaging/shared/conversation/ConversationThreadIdGetterImpl", "logMismatchAndUpdateThreadId", 305, "ConversationThreadIdGetterImpl.java")).D("BCM updating thread id for conversation failed. resolvedThread is unknown. conversationId=%s, existingThreadId=%s", b3.C(), b3.M());
            b2 = ((ayza) ayfpVar.d.b()).b(b3.C(), new Runnable() { // from class: ayfj
                @Override // java.lang.Runnable
                public final void run() {
                    entd entdVar2 = ayfp.a;
                }
            }, epvo.GET_OR_CREATE_THREAD_ID_FOR_CONVERSATION);
        } else if (b3.M().d()) {
            ayfp.c(b3, cpxuVar);
            b2 = elfo.e(null);
        } else {
            b2 = ((ayza) ayfpVar.d.b()).b(b3.C(), new Runnable() { // from class: ayfk
                @Override // java.lang.Runnable
                public final void run() {
                    ayfp.c(bseh.this, cpxuVar);
                }
            }, epvo.GET_OR_CREATE_THREAD_ID_FOR_CONVERSATION);
        }
        return b2.h(new emwl() { // from class: ayfq
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                int i = ayfr.a;
                return ceyt.i();
            }
        }, erpp.a);
    }
}
