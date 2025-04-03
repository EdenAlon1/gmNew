package defpackage;

import java.lang.reflect.Method;

/* compiled from: PG */
/* loaded from: classes.dex */
final class pgi extends ffkk implements ffix {
    final /* synthetic */ pgj a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pgi(pgj pgjVar) {
        super(0);
        this.a = pgjVar;
    }

    @Override // defpackage.ffix
    public final /* bridge */ /* synthetic */ Object invoke() {
        Class<?> loadClass = this.a.a.loadClass("androidx.window.extensions.WindowExtensionsProvider");
        loadClass.getClass();
        boolean z = false;
        Method declaredMethod = loadClass.getDeclaredMethod("getWindowExtensions", new Class[0]);
        Class a = this.a.a();
        declaredMethod.getClass();
        if (pnz.c(declaredMethod, a) && pnz.f(declaredMethod)) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
