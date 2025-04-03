package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xip implements fbba {
    public static xim a(llv llvVar) {
        xim ximVar;
        llvVar.getClass();
        Integer num = (Integer) llvVar.b("COMPOSE_ROW_MODE");
        if (num != null) {
            ximVar = xim.values()[num.intValue()];
        } else {
            ximVar = null;
        }
        if (ximVar == null) {
            throw new IllegalStateException("Screen did not set ComposeRowMode");
        }
        ensk e = xio.a.e();
        e.Y(ente.a, "BugleComposeRow2");
        ((enrr) e.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/api/mode/ComposeRowModeModule", "provideComposeRowMode", 25, "ComposeRowModeModule.kt")).t("Using compose row mode %s", ximVar);
        return ximVar;
    }

    @Override // defpackage.ffbr, defpackage.ffbq
    public final /* bridge */ /* synthetic */ Object b() {
        throw null;
    }
}
