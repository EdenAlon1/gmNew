package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bczv {
    public final ffbr a;
    public final ffsk b;
    private final ffbr c;

    public bczv(ffbr ffbrVar, ffbr ffbrVar2, ffsk ffskVar) {
        ffbrVar.getClass();
        ffbrVar2.getClass();
        ffskVar.getClass();
        this.c = ffbrVar;
        this.a = ffbrVar2;
        this.b = ffskVar;
    }

    public final void a(final ConversationIdType conversationIdType, final amer amerVar) {
        conversationIdType.getClass();
        amerVar.getClass();
        ((dtuu) this.c.b()).h(new dtut() { // from class: bczs
            @Override // defpackage.dtut
            public final ekzz a() {
                return eleg.f("ConversationCreationNotifier::runAfterCommit");
            }
        }, null, new Runnable() { // from class: bczt
            @Override // java.lang.Runnable
            public final void run() {
                bczv bczvVar = bczv.this;
                axol.k(bczvVar.b, null, new bczu(bczvVar, conversationIdType, amerVar, null), 3);
            }
        }, dtuz.NO_TXN_EXCLUDING_SCOPE);
    }
}
