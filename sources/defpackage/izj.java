package defpackage;

import androidx.compose.ui.focus.FocusTargetNode;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class izj extends ffkk implements ffji {
    final /* synthetic */ ffkx a;
    final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public izj(ffkx ffkxVar, int i) {
        super(1);
        this.a = ffkxVar;
        this.b = i;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        this.a.a = true;
        return Boolean.valueOf(((FocusTargetNode) obj).b(this.b));
    }
}
