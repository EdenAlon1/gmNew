package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ampm implements arak {
    private final errl a;
    private final bsnz b;
    private final BugleConversationId c;

    public ampm(errl errlVar, bsnz bsnzVar, BugleConversationId bugleConversationId) {
        this.a = errlVar;
        this.b = bsnzVar;
        this.c = bugleConversationId;
    }

    @Override // defpackage.arak
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final ampg d() {
        return b(this.b.y());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ampg b(engw engwVar) {
        if (engwVar.isEmpty()) {
            ensz enszVar = (ensz) ampn.a.j();
            enszVar.Y(csux.o, this.c.a.toString());
            ((ensz) enszVar.h("com/google/android/apps/messaging/shared/api/messaging/conversation/compose/disable/database/DatabaseConversationDisableModeObserver$ConversationDisableModeResultSupplier", "transformToConversationDisableMode", 144, "DatabaseConversationDisableModeObserver.java")).q("No conversation found for ConversationDisableModeResultSupplier");
            return ampg.NONE;
        }
        emxf.p(engwVar.size() == 1, "Multiple conversations with id %s found", this.c);
        ayhd A = ((bseh) engwVar.get(0)).A();
        int ordinal = A.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return ampg.RCS_GROUP_SELF_ONLY;
            }
            if (ordinal == 2) {
                return ampg.RCS_GROUP_CREATED_TOO_LARGE;
            }
            if (ordinal != 3) {
                if (ordinal == 4) {
                    throw new IllegalStateException("UNRECOGNIZED ConversationErrorState");
                }
                throw new AssertionError(A.a() + " is not a defined ConversationErrorState?");
            }
        }
        return ampg.NONE;
    }

    @Override // defpackage.arak
    public final elfl c() {
        return this.b.w().h(new emwl() { // from class: ampl
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return ampm.this.b((engw) obj);
            }
        }, this.a);
    }
}
