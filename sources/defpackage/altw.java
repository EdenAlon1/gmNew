package defpackage;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final /* synthetic */ class altw implements Consumer {
    public final /* synthetic */ eoop a;

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final void o(Object obj) {
        long longValue = ((Long) obj).longValue();
        eoop eoopVar = this.a;
        eoopVar.copyOnWrite();
        eopq eopqVar = (eopq) eoopVar.instance;
        eopq eopqVar2 = eopq.a;
        eopqVar.d |= 131072;
        eopqVar.aC = longValue;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }
}
