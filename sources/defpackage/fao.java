package defpackage;

import android.view.inputmethod.BaseInputConnection;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fao extends ffkk implements ffix {
    final /* synthetic */ fas a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fao(fas fasVar) {
        super(0);
        this.a = fasVar;
    }

    @Override // defpackage.ffix
    public final /* bridge */ /* synthetic */ Object invoke() {
        return new BaseInputConnection(this.a.a, false);
    }
}
