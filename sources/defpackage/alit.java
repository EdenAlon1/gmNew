package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class alit {
    private static final enru b = enru.c("com/google/android/apps/messaging/shared/analytics/messagestatus/MessageLogDumper");
    public final errl a;
    private final aliv c;
    private final alir d;

    public alit(errl errlVar, aliv alivVar, alir alirVar) {
        this.a = errlVar;
        this.c = alivVar;
        this.d = alirVar;
    }

    public final byte[] a() {
        try {
            return this.d.h();
        } catch (IOException e) {
            ensk j = b.j();
            j.Y(ente.a, "Bugle");
            ((enrr) ((enrr) ((enrr) j).g(e)).h("com/google/android/apps/messaging/shared/analytics/messagestatus/MessageLogDumper", "getAppEventLogData", 'I', "MessageLogDumper.java")).q("Failed to dump app events");
            return null;
        }
    }

    public final byte[] b() {
        try {
            return this.c.j();
        } catch (IOException e) {
            ensk j = b.j();
            j.Y(ente.a, "Bugle");
            ((enrr) ((enrr) ((enrr) j).g(e)).h("com/google/android/apps/messaging/shared/analytics/messagestatus/MessageLogDumper", "getMessageStatusLogData", ':', "MessageLogDumper.java")).q("Failed to dump message status");
            return null;
        }
    }
}
