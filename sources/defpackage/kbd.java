package defpackage;

import androidx.compose.ui.platform.AndroidComposeView;

/* compiled from: PG */
/* loaded from: classes.dex */
final class kbd extends ffkk implements ffji {
    final /* synthetic */ kbs a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kbd(kbs kbsVar) {
        super(1);
        this.a = kbsVar;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        iwx iwxVar = (iwx) obj;
        if (this.a.hasFocus()) {
            iwxVar.j().a(true);
        }
        AndroidComposeView androidComposeView = iwxVar instanceof AndroidComposeView ? (AndroidComposeView) iwxVar : null;
        if (androidComposeView != null) {
            androidComposeView.y(new izh(androidComposeView, this.a));
        }
        this.a.removeAllViewsInLayout();
        return ffcu.a;
    }
}
