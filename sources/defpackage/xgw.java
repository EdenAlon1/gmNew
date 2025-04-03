package defpackage;

import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xgw implements dtac {
    public static final enru a = enru.c("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/analytics/navigation/ComposeRowNavigationListener");
    public final aled b;

    public xgw(aled aledVar) {
        aledVar.getClass();
        this.b = aledVar;
    }

    @Override // defpackage.dtac
    public final void a(dszr dszrVar, int i, Duration duration) {
        epts eptsVar;
        ensk g = a.g();
        g.Y(ente.a, "BugleComposeRow2");
        enrr enrrVar = (enrr) g.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/analytics/navigation/ComposeRowNavigationListener", "onScreenClosed", 111, "ComposeRowNavigationListener.kt");
        Integer valueOf = Integer.valueOf(i);
        enrrVar.J("ComposeRowNavigationListener.onScreenClosed %s, %s, %s", dszrVar, valueOf, duration);
        switch (dszrVar.ordinal()) {
            case 0:
                eptsVar = epts.CAMERA_GALLERY;
                break;
            case 1:
                eptsVar = epts.EMOJI;
                break;
            case 2:
                eptsVar = epts.GIF;
                break;
            case 3:
            case 7:
                eptsVar = epts.UNKNOWN_COMPOSE_SCREEN_CATEGORY;
                break;
            case 4:
                eptsVar = epts.ALL;
                break;
            case 5:
                eptsVar = epts.STICKER;
                break;
            case 6:
                eptsVar = epts.VOICE;
                break;
            case 8:
                eptsVar = epts.EMOTIFY;
                break;
            default:
                throw new ffcd();
        }
        this.b.c(eptsVar, eptu.COLLAPSED, eptk.UNKNOWN_CLOSING_SOURCE, valueOf, duration, null);
    }

    @Override // defpackage.dtac
    public final void b(dszr dszrVar, int i, Duration duration) {
        ensk g = a.g();
        g.Y(ente.a, "BugleComposeRow2");
        ((enrr) g.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/analytics/navigation/ComposeRowNavigationListener", "onScreenOpened", 95, "ComposeRowNavigationListener.kt")).J("ComposeRowNavigationListener.onScreenOpened %s, %s, %s", dszrVar, Integer.valueOf(i), duration);
    }

    public final void c(yrz yrzVar) {
        ensk g = a.g();
        g.Y(ente.a, "BugleComposeRow2");
        epts eptsVar = null;
        ((enrr) g.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/analytics/navigation/ComposeRowNavigationListener", "onShortcutShown", 74, "ComposeRowNavigationListener.kt")).D("ComposeRowNavigationListener.onShortcutShown %s, %s", yrzVar, null);
        if (ffkj.e(yrzVar, yrq.a)) {
            eptsVar = epts.CONTACT;
        } else if (ffkj.e(yrzVar, yrr.a)) {
            eptsVar = epts.FILE;
        } else if (ffkj.e(yrzVar, yrs.a)) {
            eptsVar = epts.CAMERA_GALLERY;
        } else if (ffkj.e(yrzVar, yrt.a)) {
            eptsVar = epts.EMOTIVE;
        } else if (ffkj.e(yrzVar, yru.a)) {
            eptsVar = epts.LOCATION;
        } else if (ffkj.e(yrzVar, yry.a)) {
            eptsVar = epts.EMOTIVE;
        } else if (ffkj.e(yrzVar, yrx.a)) {
            eptsVar = epts.SELFIE_GIF;
        } else if (ffkj.e(yrzVar, yrv.a)) {
            eptsVar = epts.UNKNOWN_COMPOSE_SCREEN_CATEGORY;
        } else if (!ffkj.e(yrzVar, yrw.a)) {
            throw new ffcd();
        }
        epts eptsVar2 = eptsVar;
        if (eptsVar2 == null) {
            return;
        }
        this.b.d(eptsVar2, eptu.EXPANDED, eptm.UNKNOWN_OPENING_SOURCE, epto.UNKNOWN_OPENING_STATE, null, null, null);
    }
}
