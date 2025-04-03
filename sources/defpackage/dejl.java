package defpackage;

import android.content.Context;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dejl implements dejk {
    private static final enru f = enru.c("com/google/android/apps/messaging/welcome/v1/WelcomeFlowV1ClickHandlerImpl");
    private static final enru g = enru.c("com/google/android/apps/messaging/welcome/v1/WelcomeFlowV1ClickHandlerImpl");
    public final Context a;
    public final ffbr b;
    public final ffbr c;
    public final Optional d;
    public final ffbr e;
    private final ffsk h;
    private final ffbr i;
    private final ffbr j;
    private final ffbr k;
    private final Optional l;
    private final ffbr m;

    /* compiled from: PG */
    public interface a {
        ejnr fE();

        Optional fN();
    }

    public dejl(Context context, ffsk ffskVar, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, Optional optional, ffbr ffbrVar4, ffbr ffbrVar5, ffbr ffbrVar6, Optional optional2, ffbr ffbrVar7) {
        context.getClass();
        ffskVar.getClass();
        ffbrVar.getClass();
        ffbrVar2.getClass();
        ffbrVar4.getClass();
        ffbrVar5.getClass();
        ffbrVar6.getClass();
        optional2.getClass();
        ffbrVar7.getClass();
        this.a = context;
        this.h = ffskVar;
        this.i = ffbrVar;
        this.j = ffbrVar2;
        this.k = ffbrVar3;
        this.l = optional;
        this.m = ffbrVar4;
        this.b = ffbrVar5;
        this.c = ffbrVar6;
        this.d = optional2;
        this.e = ffbrVar7;
    }

    @Override // defpackage.dejk
    public final void a(eisx eisxVar, String str, cvjl cvjlVar, cjtw cjtwVar) {
        cvjlVar.getClass();
        cjtwVar.getClass();
        try {
            ensk h = f.h();
            h.Y(ente.a, "BugleWelcome");
            ((enrr) h.h("com/google/android/apps/messaging/welcome/v1/WelcomeFlowV1ClickHandlerImpl", "onContinueClickedInternal", 115, "WelcomeFlowV1ClickHandlerImpl.kt")).J("onContinueClicked. accountId: %s, tosMessageId: %s, flow: %s", eisxVar, str, cvjlVar);
            ((cvjo) this.i.b()).j(eisxVar, str, cvjj.ACTION_ACCEPT_NOTICE, cvjlVar);
            dekv dekvVar = (dekv) this.m.b();
            Object b = dekvVar.a.b();
            b.getClass();
            axol.k((ffsk) b, null, new dekt(dekvVar, cvjlVar, null), 3);
            axol.k(this.h, null, new dejm(this, eisxVar, cvjlVar, cjtwVar, null), 3);
        } catch (Exception e) {
            ensk i = f.i();
            i.Y(ente.a, "BugleWelcome");
            ((enrr) ((enrr) i).g(e).h("com/google/android/apps/messaging/welcome/v1/WelcomeFlowV1ClickHandlerImpl", "onContinueClicked", 79, "WelcomeFlowV1ClickHandlerImpl.kt")).q("Failed to successfully complete Welcome Flow onContinueClicked.");
        }
    }

    @Override // defpackage.dejk
    public final void b(eisx eisxVar, String str, cvjl cvjlVar) {
        cvjlVar.getClass();
        ensk h = f.h();
        h.Y(ente.a, "BugleWelcome");
        ((enrr) h.h("com/google/android/apps/messaging/welcome/v1/WelcomeFlowV1ClickHandlerImpl", "onUseWithoutAnAccountClicked", 90, "WelcomeFlowV1ClickHandlerImpl.kt")).J("onUseWithoutAnAccountClicked. accountId: %s, tosMessageId: %s, flow: %s", eisxVar, str, cvjlVar);
        ((cvjo) this.i.b()).j(eisxVar, str, cvjj.ACTION_USE_WITHOUT_AN_ACCOUNT, cvjlVar);
        dekv dekvVar = (dekv) this.m.b();
        Object b = dekvVar.a.b();
        b.getClass();
        axol.k((ffsk) b, null, new dekn(dekvVar, null), 3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x019b, code lost:
    
        if (r1 != r3) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0030  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x019b -> B:13:0x019d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.eisx r18, defpackage.cvjl r19, defpackage.ffgu r20) {
        /*
            Method dump skipped, instructions count: 428
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dejl.c(eisx, cvjl, ffgu):java.lang.Object");
    }
}
