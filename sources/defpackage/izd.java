package defpackage;

import androidx.compose.ui.focus.FocusTargetNode;

/* compiled from: PG */
/* loaded from: classes.dex */
final class izd extends ffkk implements ffji {
    final /* synthetic */ hyh a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public izd(hyh hyhVar) {
        super(1);
        this.a = hyhVar;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return Boolean.valueOf(((FocusTargetNode) obj).b(this.a.a));
    }
}
