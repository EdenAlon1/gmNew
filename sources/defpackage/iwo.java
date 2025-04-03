package defpackage;

import androidx.compose.ui.platform.AndroidComposeView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iwo {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(hvh hvhVar, ffix ffixVar) {
        iwq iwqVar = hvhVar.u;
        if (iwqVar == null) {
            iwqVar = new iwq((iwn) hvhVar);
            hvhVar.u = iwqVar;
        }
        ((AndroidComposeView) isx.f(hvhVar)).v.d(iwqVar, iwq.a, ffixVar);
    }
}
