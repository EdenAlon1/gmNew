package defpackage;

import androidx.compose.ui.focus.FocusOwnerImpl;
import androidx.compose.ui.focus.FocusTargetNode;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hyy extends ffkk implements ffji {
    final /* synthetic */ FocusTargetNode a;
    final /* synthetic */ FocusOwnerImpl b;
    final /* synthetic */ ffji c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hyy(FocusTargetNode focusTargetNode, FocusOwnerImpl focusOwnerImpl, ffji ffjiVar) {
        super(1);
        this.a = focusTargetNode;
        this.b = focusOwnerImpl;
        this.c = ffjiVar;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        boolean booleanValue;
        FocusTargetNode focusTargetNode = (FocusTargetNode) obj;
        if (ffkj.e(focusTargetNode, this.a)) {
            booleanValue = false;
        } else {
            if (ffkj.e(focusTargetNode, this.b.b)) {
                throw new IllegalStateException("Focus search landed at the root.");
            }
            booleanValue = ((Boolean) this.c.invoke(focusTargetNode)).booleanValue();
        }
        return Boolean.valueOf(booleanValue);
    }
}
