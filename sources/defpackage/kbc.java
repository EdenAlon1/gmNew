package defpackage;

import androidx.compose.ui.platform.AndroidComposeView;

/* compiled from: PG */
/* loaded from: classes.dex */
final class kbc extends ffkk implements ffji {
    final /* synthetic */ kbs a;
    final /* synthetic */ iui b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kbc(kbs kbsVar, iui iuiVar) {
        super(1);
        this.a = kbsVar;
        this.b = iuiVar;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        iwx iwxVar = (iwx) obj;
        AndroidComposeView androidComposeView = iwxVar instanceof AndroidComposeView ? (AndroidComposeView) iwxVar : null;
        if (androidComposeView != null) {
            kbs kbsVar = this.a;
            iui iuiVar = this.b;
            androidComposeView.F().a.put(kbsVar, iuiVar);
            androidComposeView.F().addView(kbsVar);
            androidComposeView.F().b.put(iuiVar, kbsVar);
            kbsVar.setImportantForAccessibility(1);
            kvo.p(kbsVar, new iyr(androidComposeView, iuiVar, androidComposeView));
        }
        kbs kbsVar2 = this.a;
        if (kbsVar2.c.getParent() != kbsVar2) {
            kbsVar2.addView(kbsVar2.c);
        }
        return ffcu.a;
    }
}
