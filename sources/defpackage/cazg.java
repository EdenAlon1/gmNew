package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.StrictMode;
import java.io.Closeable;
import java.util.Stack;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cazg implements cavm {
    public static final cfup a = cfvl.q(173131903);
    static final ThreadLocal b = new ThreadLocal();
    public final caze c;
    public StrictMode.ThreadPolicy d;
    private int e;

    public cazg(cawi cawiVar) {
        if (!ctid.b) {
            this.c = new cawj();
            return;
        }
        ThreadLocal threadLocal = b;
        ((cawf) cawiVar.a.b()).getClass();
        threadLocal.getClass();
        this.c = new cawh(threadLocal);
    }

    public static void h() {
        ThreadLocal threadLocal = b;
        if (threadLocal.get() == null) {
            threadLocal.set(new Stack());
        }
    }

    static final cazf j() {
        h();
        Stack stack = (Stack) b.get();
        if (stack.empty()) {
            return null;
        }
        return (cazf) stack.peek();
    }

    private final void k() {
        h();
        Stack stack = (Stack) b.get();
        cazf cazfVar = stack.isEmpty() ? null : (cazf) stack.firstElement();
        if (cazfVar != null) {
            int i = this.e;
            this.e = i + 1;
            if (i == 0) {
                StrictMode.ThreadPolicy threadPolicy = cazfVar.c;
                threadPolicy.getClass();
                StrictMode.setThreadPolicy(threadPolicy);
            }
        }
    }

    @Override // defpackage.cavm
    public final Cursor a(Cursor cursor, dtwd dtwdVar) {
        return new cazd(this, cursor);
    }

    @Override // defpackage.cavm
    public final /* synthetic */ int e(Exception exc, int i, dtwd dtwdVar) {
        return 1;
    }

    public final Object f(Supplier supplier) {
        Object obj;
        k();
        try {
            obj = supplier.get();
            return obj;
        } finally {
            g();
        }
    }

    public final void g() {
        if (this.d == null || j() == null) {
            return;
        }
        int i = this.e - 1;
        this.e = i;
        if (i == 0) {
            StrictMode.ThreadPolicy threadPolicy = this.d;
            threadPolicy.getClass();
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public final void i(Runnable runnable) {
        k();
        try {
            runnable.run();
        } finally {
            g();
        }
    }

    @Override // defpackage.cavm
    public final Closeable l(final dtwd dtwdVar) {
        if (!((Boolean) a.e()).booleanValue()) {
            return null;
        }
        dtrg dtrgVar = (dtrg) dtwdVar;
        int ordinal = dtrgVar.b.ordinal();
        if (ordinal == 12) {
            k();
            return new Closeable() { // from class: caxx
                @Override // java.io.Closeable, java.lang.AutoCloseable
                public final void close() {
                    cazg.this.g();
                }
            };
        }
        switch (ordinal) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                k();
                return new Closeable() { // from class: caxx
                    @Override // java.io.Closeable, java.lang.AutoCloseable
                    public final void close() {
                        cazg.this.g();
                    }
                };
            case 6:
            case 7:
                cazf j = j();
                final boolean z = true;
                boolean z2 = false;
                if (j != null) {
                    if (!((dtqy) ((cauy) j.a).e).b.equals(((dtqy) ((cauy) dtrgVar.c).e).b)) {
                        z2 = true;
                    }
                }
                if (j == null) {
                    z = z2;
                } else if (!z2) {
                    return null;
                }
                if (z) {
                    k();
                }
                return new Closeable() { // from class: caxv
                    @Override // java.io.Closeable, java.lang.AutoCloseable
                    public final void close() {
                        cazf cazfVar = new cazf(((dtrg) dtwdVar).c);
                        cazg.h();
                        ((Stack) cazg.b.get()).push(cazfVar);
                        cazg cazgVar = cazg.this;
                        if (cazgVar.d == null) {
                            cazgVar.d = cazgVar.c.a();
                        }
                        boolean z3 = z;
                        StrictMode.setThreadPolicy(cazgVar.d);
                        if (z3) {
                            cazgVar.g();
                        }
                    }
                };
            case 8:
            case 9:
                cazf j2 = j();
                if (j2 != null) {
                    StrictMode.ThreadPolicy threadPolicy = j2.c;
                    threadPolicy.getClass();
                    StrictMode.setThreadPolicy(threadPolicy);
                }
                h();
                Stack stack = (Stack) b.get();
                if (!stack.isEmpty()) {
                    stack.pop();
                }
                k();
                return new Closeable() { // from class: caxw
                    @Override // java.io.Closeable, java.lang.AutoCloseable
                    public final void close() {
                        cazg.this.g();
                    }
                };
            default:
                return null;
        }
    }

    @Override // defpackage.cavm
    public final boolean n() {
        if (((Boolean) a.e()).booleanValue() && !csjc.a()) {
            return !(!csjc.j() || csjc.b() || csjc.f() || csjc.i()) || csjc.c();
        }
        return false;
    }

    @Override // defpackage.cavm
    public final /* synthetic */ void m(SQLiteDatabase sQLiteDatabase) {
    }
}
