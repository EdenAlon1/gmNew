package defpackage;

import j$.util.DesugarArrays;
import j$.util.concurrent.ConcurrentLinkedQueue;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cauw {
    public caux a;
    final /* synthetic */ cauy b;
    private final ConcurrentLinkedQueue c = new ConcurrentLinkedQueue();

    public cauw(cauy cauyVar) {
        this.b = cauyVar;
    }

    public static String a(Thread thread) {
        return (String) DesugarArrays.stream(thread.getStackTrace()).map(new Function() { // from class: cauv
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return "   ".concat(String.valueOf(((StackTraceElement) obj).toString()));
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).collect(Collectors.joining("\n"));
    }

    public final void b(dtui dtuiVar, boolean z) {
        this.c.offer(new carl(dtuiVar, Thread.currentThread().getId(), this.b.d.f().toEpochMilli(), z));
        while (this.c.size() > 50) {
            this.c.poll();
        }
    }
}
