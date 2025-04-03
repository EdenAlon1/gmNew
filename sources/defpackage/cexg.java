package defpackage;

import j$.util.DesugarArrays;
import j$.util.function.Function$CC;
import java.util.Arrays;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cexg {
    public static final cfva a;
    public final cqoh b;
    public final ceww c;
    public final Object d = new Object();
    public enev e = new enev(((Integer) a.e()).intValue());

    static {
        a = cfvl.k(cfvl.b, "WorkQueueDebugHistoryCount", true != csjc.d() ? 100 : 5000);
    }

    public cexg(cqoh cqohVar, ceww cewwVar) {
        this.b = cqohVar;
        this.c = cewwVar;
    }

    public static long a(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr == null) {
            return 0L;
        }
        return Arrays.hashCode(DesugarArrays.stream(stackTraceElementArr).map(new Function() { // from class: cexc
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                cfva cfvaVar = cexg.a;
                return ((StackTraceElement) obj).toString();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).toArray());
    }

    public static String c(int i) {
        int i2 = i - 1;
        return i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? i2 != 5 ? "EXECUTION_RESULT" : "INITIATE_HANDLER_EXECUTION" : "JANITOR_DISCOVER" : "SUBMIT_TO_WORK_MANAGER" : "SUBMIT_TO_EXECUTOR" : "WORK_MANAGER_WORK_STARTED";
    }

    public final void b(String str) {
        synchronized (this.d) {
            this.e.add(new cexf(this.b.f().toEpochMilli(), 3, str));
        }
    }
}
