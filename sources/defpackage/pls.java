package defpackage;

import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class pls extends ffkk implements ffix {
    final /* synthetic */ plu a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pls(plu pluVar) {
        super(0);
        this.a = pluVar;
    }

    @Override // defpackage.ffix
    public final /* bridge */ /* synthetic */ Object invoke() {
        boolean z = false;
        Method method = this.a.c().getMethod("getDisplayFoldFeatures", new Class[0]);
        Type genericReturnType = method.getGenericReturnType();
        genericReturnType.getClass();
        Type type = ((ParameterizedType) genericReturnType).getActualTypeArguments()[0];
        type.getClass();
        Class cls = (Class) type;
        method.getClass();
        if (pnz.f(method) && pnz.c(method, List.class) && ffkj.e(cls, this.a.b())) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
