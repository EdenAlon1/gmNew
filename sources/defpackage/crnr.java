package defpackage;

import android.content.Context;
import android.view.accessibility.AccessibilityManager;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class crnr {
    public final AccessibilityManager a;
    public final fgdj b;
    private final Context c;
    private final ffsk d;
    private final ffxx e;
    private final ffxx f;

    public crnr(Context context, ffsk ffskVar) {
        context.getClass();
        ffskVar.getClass();
        this.c = context;
        this.d = ffskVar;
        Object systemService = context.getSystemService("accessibility");
        AccessibilityManager accessibilityManager = systemService instanceof AccessibilityManager ? (AccessibilityManager) systemService : null;
        this.a = accessibilityManager;
        ffxx a = ffyy.a(new ffxn(new crnq(this, null)));
        this.e = a;
        ffxx a2 = ffyy.a(new ffxn(new crnm(this, null)));
        this.f = a2;
        fgch fgchVar = new fgch(a, a2, new crnn(null));
        int i = fgcz.a;
        fgcz fgczVar = fgcy.a;
        boolean z = false;
        if (accessibilityManager != null && accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            z = true;
        }
        this.b = fgbn.b(fgchVar, ffskVar, fgczVar, Boolean.valueOf(z));
    }
}
