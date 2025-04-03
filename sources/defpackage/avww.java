package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class avww implements avwr {
    private static final entd a = entd.c("BugleFileTransfer");
    private final ffbr b;
    private final ffbr c;
    private final avwn d;
    private final ffbr e;

    public avww(ffbr ffbrVar, ffbr ffbrVar2, avwn avwnVar, ffbr ffbrVar3) {
        this.b = ffbrVar;
        this.c = ffbrVar2;
        this.d = avwnVar;
        this.e = ffbrVar3;
    }

    @Override // defpackage.avwr
    public final avwq a() {
        int a2 = epxs.a(((Long) this.e.b()).intValue());
        if (a2 == 0 || a2 == 1) {
            a2 = 2;
        }
        ((ensz) ((ensz) a.h()).h("com/google/android/apps/messaging/shared/chatapi/filetransfer/authentication/RcsHttpAuthControllerFactory", "createForType", 61, "RcsHttpAuthControllerFactory.java")).t("Creating controller for %s", a2 != 1 ? a2 != 2 ? a2 != 3 ? a2 != 4 ? a2 != 5 ? "AUTHENTICATION_TYPE_TACHYON_TOKEN" : "AUTHENTICATION_TYPE_GBA" : "AUTHENTICATION_TYPE_DIGEST" : "AUTHENTICATION_TYPE_BASIC" : "AUTHENTICATION_TYPE_NO_AUTH" : "AUTHENTICATION_TYPE_UNKNOWN");
        int i = a2 - 1;
        if (i == 1) {
            return (avwq) this.b.b();
        }
        if (i == 2) {
            return (avwq) this.c.b();
        }
        if (i != 3) {
            if (i != 4) {
                throw new IllegalStateException(String.format("Unexpected Auth type value received: %s", Integer.valueOf(i)));
            }
            throw new UnsupportedOperationException();
        }
        avwn avwnVar = this.d;
        djry djryVar = (djry) avwnVar.a.b();
        djryVar.getClass();
        ((avwj) avwnVar.b.b()).getClass();
        avwx avwxVar = (avwx) avwnVar.c.b();
        avwxVar.getClass();
        return new avwm(djryVar, avwxVar);
    }
}
