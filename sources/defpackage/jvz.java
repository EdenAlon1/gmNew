package defpackage;

import android.view.inputmethod.BaseInputConnection;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jvz extends ffkk implements ffix {
    final /* synthetic */ jwf a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jvz(jwf jwfVar) {
        super(0);
        this.a = jwfVar;
    }

    @Override // defpackage.ffix
    public final /* bridge */ /* synthetic */ Object invoke() {
        return new BaseInputConnection(this.a.a, false);
    }
}
