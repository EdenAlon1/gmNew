package defpackage;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final /* synthetic */ class alts implements Consumer {
    public final /* synthetic */ eoop a;

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final void o(Object obj) {
        eoop eoopVar = this.a;
        eoopVar.copyOnWrite();
        eopq eopqVar = (eopq) eoopVar.instance;
        eopq eopqVar2 = eopq.a;
        eopqVar.ak = ((eoov) obj).d;
        eopqVar.c |= Integer.MIN_VALUE;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }
}
