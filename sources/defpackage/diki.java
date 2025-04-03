package defpackage;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class diki implements Consumer {
    public final /* synthetic */ ezal a;

    public /* synthetic */ diki(ezal ezalVar) {
        this.a = ezalVar;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        ezal ezalVar = this.a;
        String str = (String) obj;
        ezalVar.copyOnWrite();
        ezau ezauVar = (ezau) ezalVar.instance;
        ezau ezauVar2 = ezau.a;
        str.getClass();
        ezauVar.b |= 64;
        ezauVar.g = str;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }
}
