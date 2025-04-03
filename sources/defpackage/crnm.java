package defpackage;

import android.view.accessibility.AccessibilityManager;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class crnm extends ffhv implements ffjm {
    int a;
    final /* synthetic */ crnr b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public crnm(crnr crnrVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = crnrVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((crnm) c((ffxe) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            final ffxe ffxeVar = (ffxe) this.c;
            AccessibilityManager accessibilityManager = this.b.a;
            if (accessibilityManager == null) {
                ffxeVar.b(false);
            } else {
                ffxeVar.b(Boolean.valueOf(accessibilityManager.isEnabled()));
                final AccessibilityManager.AccessibilityStateChangeListener accessibilityStateChangeListener = new AccessibilityManager.AccessibilityStateChangeListener() { // from class: crnk
                    @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
                    public final void onAccessibilityStateChanged(boolean z) {
                        ffxe.this.b(Boolean.valueOf(z));
                    }
                };
                this.b.a.addAccessibilityStateChangeListener(accessibilityStateChangeListener);
                final crnr crnrVar = this.b;
                ffix ffixVar = new ffix() { // from class: crnl
                    @Override // defpackage.ffix
                    public final Object invoke() {
                        crnr.this.a.removeAccessibilityStateChangeListener(accessibilityStateChangeListener);
                        return ffcu.a;
                    }
                };
                this.a = 1;
                if (ffxd.b(ffxeVar, ffixVar, this) == ffhhVar) {
                    return ffhhVar;
                }
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        crnm crnmVar = new crnm(this.b, ffguVar);
        crnmVar.c = obj;
        return crnmVar;
    }
}
