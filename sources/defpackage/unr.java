package defpackage;

import android.view.View;
import j$.time.Duration;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class unr extends ffhv implements ffjm {
    int a;
    final /* synthetic */ View b;
    final /* synthetic */ uns c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public unr(View view, uns unsVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = view;
        this.c = unsVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((unr) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            View view = this.b;
            kli b = kli.b(view, view.getWidth(), view.getHeight());
            uns unsVar = this.c;
            unsVar.f.a(unsVar.d.invoke(), b);
            uns unsVar2 = this.c;
            eptv b2 = unsVar2.b();
            Instant instant = unsVar2.g;
            if (instant == null) {
                ffkj.c("openTime");
                instant = null;
            }
            Duration.between(instant, this.c.a.f()).toMillis();
            epto eptoVar = epto.LOADED;
            eptm eptmVar = eptm.CATEGORY_HEADER;
            enrr enrrVar = (enrr) alct.a.j();
            enrrVar.aa(ensy.MEDIUM);
            ((enrr) enrrVar.h("com/google/android/apps/messaging/shared/analytics/compose/ComposeNavigationEventLogger", "deprecatedLogScreenOpenedAsync", 95, "ComposeNavigationEventLogger.java")).J("ComposeNavigationEventLogger.deprecatedLogScreenOpenedAsync 1 %s, %s, %s", b2, eptoVar, Integer.valueOf(eptmVar.r));
            elfl e = elfo.e(false);
            e.getClass();
            this.a = 1;
            if (fgfz.c(e, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new unr(this.b, this.c, ffguVar);
    }
}
