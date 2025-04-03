package defpackage;

import android.graphics.Canvas;
import androidx.compose.ui.platform.AndroidComposeView;

/* compiled from: PG */
/* loaded from: classes.dex */
final class kbi extends ffkk implements ffji {
    final /* synthetic */ kbs a;
    final /* synthetic */ iui b;
    final /* synthetic */ kbs c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kbi(kbs kbsVar, iui iuiVar, kbs kbsVar2) {
        super(1);
        this.a = kbsVar;
        this.b = iuiVar;
        this.c = kbsVar2;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        ibt b = ((ifr) obj).t().b();
        kbs kbsVar = this.a;
        if (kbsVar.c.getVisibility() != 8) {
            iui iuiVar = this.b;
            kbsVar.u = true;
            iwx iwxVar = iuiVar.l;
            if (true != (iwxVar instanceof AndroidComposeView)) {
                iwxVar = null;
            }
            if (iwxVar != null) {
                kbs kbsVar2 = this.c;
                Canvas a = iav.a(b);
                ((AndroidComposeView) iwxVar).F();
                kbsVar2.draw(a);
            }
            kbsVar.u = false;
        }
        return ffcu.a;
    }
}
