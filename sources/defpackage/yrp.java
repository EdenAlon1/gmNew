package defpackage;

import android.view.View;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class yrp implements ysi {
    private static final enru b = enru.c("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/inputs/shortcuts/LoggingShortcutHandler");
    private final xgw c;
    private final ysi d;
    private final yrz e;

    public yrp(xgw xgwVar, ysi ysiVar, yrz yrzVar) {
        xgwVar.getClass();
        yrzVar.getClass();
        this.c = xgwVar;
        this.d = ysiVar;
        this.e = yrzVar;
    }

    @Override // defpackage.ysi
    public final int a() {
        return this.d.a();
    }

    @Override // defpackage.ysi
    public final dsaq b() {
        return this.d.b();
    }

    @Override // defpackage.ysi
    public final List c() {
        return this.d.c();
    }

    @Override // defpackage.ysi
    @ffbs
    public final void d(View view) {
        ensk e = b.e();
        e.Y(ente.a, "BugleComposeRow2");
        ((enrr) e.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/inputs/shortcuts/LoggingShortcutHandler", "deprecatedHandleShortcutClick", 31, "LoggingShortcutHandler.kt")).t("Handling shortcut click for %s", this.e);
        this.d.d(view);
        this.c.c(this.e);
    }

    @Override // defpackage.ysi
    public final boolean e() {
        return this.d.e();
    }
}
