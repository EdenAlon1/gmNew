package defpackage;

import android.app.Activity;
import java.lang.reflect.Method;

/* compiled from: PG */
/* loaded from: classes.dex */
final class pkk extends ffkk implements ffix {
    final /* synthetic */ pla a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pkk(pla plaVar) {
        super(0);
        this.a = plaVar;
    }

    @Override // defpackage.ffix
    public final /* bridge */ /* synthetic */ Object invoke() {
        Method method = this.a.b().getMethod("isActivityEmbedded", Activity.class);
        method.getClass();
        return Boolean.valueOf(pnz.f(method) && pnz.c(method, Boolean.TYPE));
    }
}
