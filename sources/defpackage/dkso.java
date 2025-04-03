package defpackage;

import java.util.concurrent.Executor;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class dkso {
    public static dksn f(dksm dksmVar, Executor executor) {
        dksd dksdVar = new dksd();
        dksdVar.a = dksmVar;
        if (executor == null) {
            throw new NullPointerException("Null executor");
        }
        dksdVar.b = executor;
        dksdVar.b(dksmVar);
        dksdVar.c(true);
        return dksdVar;
    }

    public abstract dksm a();

    public abstract Object b();

    public abstract Executor c();

    public abstract Function d();

    public abstract boolean e();
}
