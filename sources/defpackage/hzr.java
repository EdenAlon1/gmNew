package defpackage;

import androidx.compose.ui.focus.FocusTargetNode;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hzr extends ffkk implements ffix {
    final /* synthetic */ fflb a;
    final /* synthetic */ FocusTargetNode b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hzr(fflb fflbVar, FocusTargetNode focusTargetNode) {
        super(0);
        this.a = fflbVar;
        this.b = focusTargetNode;
    }

    @Override // defpackage.ffix
    public final /* bridge */ /* synthetic */ Object invoke() {
        FocusTargetNode focusTargetNode = this.b;
        this.a.a = focusTargetNode.f();
        return ffcu.a;
    }
}
