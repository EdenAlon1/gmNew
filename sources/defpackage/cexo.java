package defpackage;

import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cexo {
    public static final boolean a(final String str) {
        cfba a = cfbf.a();
        a.z("hasScheduledWork");
        a.e(new Function() { // from class: cexn
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                cfbe cfbeVar = (cfbe) obj;
                cfbeVar.j(str);
                int intValue = cfbf.c().intValue();
                if (intValue < 46060) {
                    dtub.w("workmanager_id", intValue);
                }
                cfbeVar.aq(new dtrx("work_queue.workmanager_id", 6));
                return cfbeVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        return a.b().T();
    }
}
