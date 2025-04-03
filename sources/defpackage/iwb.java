package defpackage;

import androidx.compose.ui.platform.AndroidComposeView;

/* compiled from: PG */
/* loaded from: classes.dex */
final class iwb extends ffkk implements ffji {
    public static final iwb a = new iwb();

    public iwb() {
        super(1);
    }

    @Override // defpackage.ffji
    public final /* synthetic */ Object invoke(Object obj) {
        iwi iwiVar = (iwi) obj;
        if (iwiVar.A() && iwi.aB(iwiVar)) {
            iui iuiVar = iwiVar.r;
            iun iunVar = iuiVar.y;
            if (iunVar.k > 0) {
                if (iunVar.j || iunVar.i) {
                    iuiVar.ae(false);
                }
                iunVar.o.u();
            }
            iwx a2 = ium.a(iuiVar);
            ((AndroidComposeView) a2).k.d(iuiVar);
            a2.z(iuiVar);
        }
        return ffcu.a;
    }
}
