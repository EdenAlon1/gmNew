package defpackage;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final /* synthetic */ class elpt implements Consumer {
    public final /* synthetic */ elzh a;

    public /* synthetic */ elpt(elzh elzhVar) {
        this.a = elzhVar;
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final void o(Object obj) {
        elzh elzhVar = this.a;
        elzl elzlVar = (elzl) obj;
        elzhVar.copyOnWrite();
        elzi elziVar = (elzi) elzhVar.instance;
        elzi elziVar2 = elzi.a;
        elzlVar.getClass();
        eygr eygrVar = elziVar.c;
        if (!eygrVar.c()) {
            elziVar.c = eyfy.mutableCopy(eygrVar);
        }
        elziVar.c.add(elzlVar);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }
}
