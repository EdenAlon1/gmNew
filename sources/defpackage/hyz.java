package defpackage;

import androidx.compose.ui.focus.FocusTargetNode;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hyz extends ffkk implements ffji {
    final /* synthetic */ fflb a;
    final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hyz(fflb fflbVar, int i) {
        super(1);
        this.a = fflbVar;
        this.b = i;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Boolean valueOf = Boolean.valueOf(((FocusTargetNode) obj).b(this.b));
        fflb fflbVar = this.a;
        fflbVar.a = valueOf;
        Boolean bool = (Boolean) fflbVar.a;
        return Boolean.valueOf(bool != null ? bool.booleanValue() : false);
    }
}
