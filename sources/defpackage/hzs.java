package defpackage;

import androidx.compose.ui.focus.FocusOwnerImpl;
import androidx.compose.ui.focus.FocusTargetNode;
import androidx.compose.ui.platform.AndroidComposeView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hzs {
    public static final hzt a(FocusTargetNode focusTargetNode) {
        return ((FocusOwnerImpl) ((AndroidComposeView) isx.f(focusTargetNode)).d).d;
    }

    public static final void b(FocusTargetNode focusTargetNode) {
        iui iuiVar;
        iwx iwxVar;
        iwi iwiVar = focusTargetNode.p.v;
        if (iwiVar == null || (iuiVar = iwiVar.r) == null || (iwxVar = iuiVar.l) == null) {
            return;
        }
        hyv hyvVar = ((AndroidComposeView) iwxVar).d;
    }
}
