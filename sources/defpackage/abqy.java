package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abqy implements abqv {
    private static final entd a = entd.c("Forking");
    private final abqx b;
    private final absp c;
    private final ffbr d;

    public abqy(abqx abqxVar, absp abspVar, ffbr ffbrVar) {
        this.b = abqxVar;
        this.c = abspVar;
        this.d = ffbrVar;
    }

    @Override // defpackage.abqv
    public final synchronized void a() {
        if (this.b.b()) {
            this.b.a();
            ((ensz) ((ensz) a.h()).h("com/google/android/apps/messaging/custodian/inspectors/forking/Forking", "startAnalysis", 41, "Forking.java")).q("Starting analysis.");
            absp abspVar = this.c;
            abspVar.b.L(abspVar);
            absv absvVar = (absv) this.d.b();
            ((ensz) absv.a.n().h("com/google/android/apps/messaging/custodian/inspectors/forking/conversationstable/NewConversationCreatedChangeListener", "startListening", 79, "NewConversationCreatedChangeListener.java")).q("Starting New Conversation created change listener.");
            if (((Boolean) ((cfup) absv.b.get()).e()).booleanValue() || ((Boolean) ((cfup) absv.c.get()).e()).booleanValue()) {
                absvVar.h.L(absvVar);
            }
        }
    }
}
