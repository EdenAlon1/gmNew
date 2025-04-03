package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cued {
    public static final emyl a;
    public final ffbr b;
    private final ffsk c;

    static {
        emyl y = cfvl.y("enable_chatbot_unsubscribe_logging");
        y.getClass();
        a = y;
    }

    public cued(ffbr ffbrVar, ffsk ffskVar) {
        ffbrVar.getClass();
        ffskVar.getClass();
        this.b = ffbrVar;
        this.c = ffskVar;
    }

    public final void a(String str) {
        if (((Boolean) ((cfup) a.get()).e()).booleanValue()) {
            axol.m(this.c, new cueb(this, str, null));
        }
    }

    public final void b(String str, int i) {
        if (((Boolean) ((cfup) a.get()).e()).booleanValue()) {
            axol.m(this.c, new cuec(this, str, i, null));
        }
    }

    public final void c(int i) {
        b("Bugle.Spam.ChatbotUnsubscribe.BottomSheet.Counts", i);
    }

    public final void d(int i) {
        b("Bugle.Spam.ChatbotUnsubscribe.Tombstone.Counts", i);
    }

    public final void e(int i) {
        b("Bugle.Spam.ChatbotUnsubscribe.Toolstone.Counts", i);
    }
}
