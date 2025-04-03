package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
final class kcj extends ffkk implements ffji {
    final /* synthetic */ kck a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kcj(kck kckVar) {
        super(1);
        this.a = kckVar;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        View a = kch.a(this.a);
        if (a.hasFocus() || a.isFocused()) {
            a.clearFocus();
        }
        return ffcu.a;
    }
}
