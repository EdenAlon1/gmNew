package defpackage;

import androidx.compose.ui.platform.AndroidComposeView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class izh extends ffkk implements ffix {
    final /* synthetic */ AndroidComposeView a;
    final /* synthetic */ kbs b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public izh(AndroidComposeView androidComposeView, kbs kbsVar) {
        super(0);
        this.a = androidComposeView;
        this.b = kbsVar;
    }

    @Override // defpackage.ffix
    public final /* bridge */ /* synthetic */ Object invoke() {
        this.a.F().removeViewInLayout(this.b);
        this.a.F().b.remove(this.a.F().a.remove(this.b));
        this.b.setImportantForAccessibility(0);
        return ffcu.a;
    }
}
