package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aqnx implements aqpe {
    public static final entd a = entd.c("BugleRecipients");
    private final ffbr b;

    public aqnx(ffbr ffbrVar) {
        this.b = ffbrVar;
    }

    public static String b(aoku aokuVar) {
        return cskt.c(aokuVar).toString();
    }

    @Override // defpackage.aqpe
    public final elfl a(final aoku aokuVar) {
        if (!aokuVar.e().isEmpty()) {
            return ((avtc) ((Optional) this.b.b()).get()).c((awui) aokuVar.e().get()).h(new emwl() { // from class: aqnv
                @Override // defpackage.emwl
                public final Object apply(Object obj) {
                    avtb avtbVar = (avtb) obj;
                    ensz enszVar = (ensz) aqnx.a.h();
                    enszVar.Y(csux.D, aqnx.b(aoku.this));
                    ((ensz) enszVar.h("com/google/android/apps/messaging/shared/api/messaging/recipient/rcs/ChatApiRcsRecipientOnlineProvider", "isOnline", 52, "ChatApiRcsRecipientOnlineProvider.java")).t("Recipient Online Status: %s.", avtbVar);
                    return Boolean.valueOf(avtbVar == avtb.ONLINE);
                }
            }, erpp.a).e(Exception.class, new emwl() { // from class: aqnw
                @Override // defpackage.emwl
                public final Object apply(Object obj) {
                    ensz enszVar = (ensz) aqnx.a.j();
                    enszVar.Y(csux.D, aqnx.b(aoku.this));
                    ((ensz) ((ensz) enszVar.g((Exception) obj)).h("com/google/android/apps/messaging/shared/api/messaging/recipient/rcs/ChatApiRcsRecipientOnlineProvider", "isOnline", 63, "ChatApiRcsRecipientOnlineProvider.java")).q("Recipient Online Status: Failed.");
                    return false;
                }
            }, erpp.a);
        }
        ensz enszVar = (ensz) a.h();
        enszVar.Y(csux.D, b(aokuVar));
        ((ensz) enszVar.h("com/google/android/apps/messaging/shared/api/messaging/recipient/rcs/ChatApiRcsRecipientOnlineProvider", "isOnline", 38, "ChatApiRcsRecipientOnlineProvider.java")).q("Recipient Offline: No RCS Identifier.");
        return elfo.e(false);
    }
}
