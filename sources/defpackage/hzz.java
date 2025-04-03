package defpackage;

import androidx.compose.ui.focus.FocusOwnerImpl;
import androidx.compose.ui.focus.FocusTargetNode;
import androidx.compose.ui.platform.AndroidComposeView;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hzz extends ffkk implements ffji {
    final /* synthetic */ hzt a;
    final /* synthetic */ FocusTargetNode b;
    final /* synthetic */ FocusTargetNode c;
    final /* synthetic */ FocusTargetNode d;
    final /* synthetic */ int e;
    final /* synthetic */ ffji f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hzz(hzt hztVar, FocusTargetNode focusTargetNode, FocusTargetNode focusTargetNode2, FocusTargetNode focusTargetNode3, int i, ffji ffjiVar) {
        super(1);
        this.a = hztVar;
        this.b = focusTargetNode;
        this.c = focusTargetNode2;
        this.d = focusTargetNode3;
        this.e = i;
        this.f = ffjiVar;
    }

    @Override // defpackage.ffji
    public final /* synthetic */ Object invoke(Object obj) {
        inb inbVar = (inb) obj;
        int i = this.a.b;
        if (this.b != ((FocusOwnerImpl) ((AndroidComposeView) isx.f(this.c)).d).g) {
            return true;
        }
        boolean c = iaa.c(this.c, this.d, this.e, this.f);
        Boolean valueOf = Boolean.valueOf(c);
        valueOf.getClass();
        if (c || !inbVar.a()) {
            return valueOf;
        }
        return null;
    }
}
