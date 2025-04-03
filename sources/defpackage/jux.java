package defpackage;

import android.view.inputmethod.InputMethodManager;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jux extends ffkk implements ffix {
    final /* synthetic */ juy a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jux(juy juyVar) {
        super(0);
        this.a = juyVar;
    }

    @Override // defpackage.ffix
    public final /* bridge */ /* synthetic */ Object invoke() {
        Object systemService = this.a.a.getContext().getSystemService("input_method");
        systemService.getClass();
        return (InputMethodManager) systemService;
    }
}
