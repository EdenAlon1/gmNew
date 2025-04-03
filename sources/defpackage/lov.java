package defpackage;

import android.content.Context;
import android.os.AsyncTask;
import android.os.SystemClock;
import java.io.PrintWriter;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class lov extends lox {
    public volatile lou a;
    private Executor j;
    private volatile lou k;

    public lov(Context context) {
        super(context);
    }

    public abstract Object a();

    protected Object b() {
        return a();
    }

    final void c(lou louVar, Object obj) {
        e(obj);
        if (this.k == louVar) {
            if (this.h) {
                k();
            }
            SystemClock.uptimeMillis();
            this.k = null;
            d();
        }
    }

    final void d() {
        if (this.k != null || this.a == null) {
            return;
        }
        boolean z = this.a.a;
        if (this.j == null) {
            this.j = AsyncTask.THREAD_POOL_EXECUTOR;
        }
        lou louVar = this.a;
        Executor executor = this.j;
        if (louVar.f == 1) {
            louVar.f = 2;
            executor.execute(louVar.c);
            return;
        }
        int i = louVar.f;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        if (i2 == 1) {
            throw new IllegalStateException("Cannot execute task: the task is already running.");
        }
        if (i2 == 2) {
            throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
        }
        throw new IllegalStateException("We should never reach this state");
    }

    @Override // defpackage.lox
    protected final void f() {
        h();
        this.a = new lou(this);
        d();
    }

    @Override // defpackage.lox
    @Deprecated
    public final void g(String str, PrintWriter printWriter) {
        printWriter.print(str);
        printWriter.print("mId=");
        printWriter.print(this.b);
        printWriter.print(" mListener=");
        printWriter.println(this.i);
        if (this.d || this.g || this.h) {
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.print(this.d);
            printWriter.print(" mContentChanged=");
            printWriter.print(this.g);
            printWriter.print(" mProcessingChange=");
            printWriter.println(this.h);
        }
        if (this.e || this.f) {
            printWriter.print(str);
            printWriter.print("mAbandoned=");
            printWriter.print(this.e);
            printWriter.print(" mReset=");
            printWriter.println(this.f);
        }
        if (this.a != null) {
            printWriter.print(str);
            printWriter.print("mTask=");
            printWriter.print(this.a);
            printWriter.print(" waiting=");
            boolean z = this.a.a;
            printWriter.println(false);
        }
        if (this.k != null) {
            printWriter.print(str);
            printWriter.print("mCancellingTask=");
            printWriter.print(this.k);
            printWriter.print(" waiting=");
            boolean z2 = this.k.a;
            printWriter.println(false);
        }
    }

    @Override // defpackage.lox
    public final void h() {
        if (this.a != null) {
            if (!this.d) {
                k();
            }
            if (this.k != null) {
                boolean z = this.a.a;
            } else {
                boolean z2 = this.a.a;
                lou louVar = this.a;
                louVar.d.set(true);
                if (louVar.c.cancel(false)) {
                    this.k = this.a;
                }
            }
            this.a = null;
        }
    }

    public void e(Object obj) {
    }
}
