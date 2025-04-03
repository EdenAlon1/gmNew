package defpackage;

import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qwp extends Exception {
    private static final StackTraceElement[] a = new StackTraceElement[0];
    private static final long serialVersionUID = 1;
    private final List b;
    private qtp c;
    private qsy d;
    private Class e;
    private String f;

    public qwp(String str) {
        this(str, Collections.EMPTY_LIST);
    }

    private final void c(Throwable th, List list) {
        if (!(th instanceof qwp)) {
            list.add(th);
            return;
        }
        Iterator it = ((qwp) th).b.iterator();
        while (it.hasNext()) {
            c((Throwable) it.next(), list);
        }
    }

    private static void d(Throwable th, Appendable appendable) {
        try {
            appendable.append(th.getClass().toString()).append(": ").append(th.getMessage()).append('\n');
        } catch (IOException unused) {
            throw new RuntimeException(th);
        }
    }

    private final void e(Appendable appendable) {
        d(this, appendable);
        qwo qwoVar = new qwo(appendable);
        List list = this.b;
        try {
            int size = list.size();
            int i = 0;
            while (i < size) {
                qwoVar.append("Cause (");
                int i2 = i + 1;
                qwoVar.append(String.valueOf(i2));
                qwoVar.append(" of ");
                qwoVar.append(String.valueOf(size));
                qwoVar.append("): ");
                Throwable th = (Throwable) list.get(i);
                if (th instanceof qwp) {
                    ((qwp) th).e(qwoVar);
                } else {
                    d(th, qwoVar);
                }
                i = i2;
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public final List a() {
        ArrayList arrayList = new ArrayList();
        c(this, arrayList);
        return arrayList;
    }

    final void b(qtp qtpVar, qsy qsyVar, Class cls) {
        this.c = qtpVar;
        this.d = qsyVar;
        this.e = cls;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        StringBuilder sb = new StringBuilder(71);
        sb.append(this.f);
        Class cls = this.e;
        sb.append(cls != null ? ", ".concat(cls.toString()) : "");
        qsy qsyVar = this.d;
        sb.append(qsyVar != null ? ", ".concat(qsyVar.toString()) : "");
        qtp qtpVar = this.c;
        sb.append(qtpVar != null ? ", ".concat(qtpVar.toString()) : "");
        List<Throwable> a2 = a();
        if (a2.isEmpty()) {
            return sb.toString();
        }
        if (a2.size() == 1) {
            sb.append("\nThere was 1 root cause:");
        } else {
            sb.append("\nThere were ");
            sb.append(a2.size());
            sb.append(" root causes:");
        }
        for (Throwable th : a2) {
            sb.append('\n');
            sb.append(th.getClass().getName());
            sb.append('(');
            sb.append(th.getMessage());
            sb.append(')');
        }
        sb.append("\n call GlideException#logRootCauses(String) for more detail");
        return sb.toString();
    }

    @Override // java.lang.Throwable
    public final void printStackTrace() {
        e(System.err);
    }

    public qwp(String str, List list) {
        this.f = str;
        setStackTrace(a);
        this.b = list;
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintStream printStream) {
        e(printStream);
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintWriter printWriter) {
        e(printWriter);
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        return this;
    }
}
