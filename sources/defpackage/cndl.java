package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cndl implements cndk {
    private static final entd a = entd.c("BugleReactions");
    private final Map b;

    public cndl(Map map) {
        this.b = map;
    }

    @Override // defpackage.cndk
    public final void a(cndn cndnVar, cndi cndiVar, cmrl cmrlVar, cmrm cmrmVar) {
        ffbr ffbrVar = (ffbr) this.b.get(cndnVar);
        if (ffbrVar == null) {
            ((ensz) ((ensz) a.j()).h("com/google/android/apps/messaging/shared/reactions/transport/sender/ReactionsSenderImpl", "sendReaction", 32, "ReactionsSenderImpl.java")).q("Abandoning sendReaction() due to missing transport.");
            return;
        }
        int ordinal = cmrmVar.ordinal();
        if (ordinal != 1) {
            if (ordinal == 2) {
                ((cndm) ffbrVar.b()).b(cndiVar, cmrlVar);
                return;
            } else if (ordinal != 3) {
                throw new IllegalArgumentException("Coud not perform reaction action: " + cmrmVar.a());
            }
        }
        ((cndm) ffbrVar.b()).a(cndiVar, cmrlVar);
    }
}
