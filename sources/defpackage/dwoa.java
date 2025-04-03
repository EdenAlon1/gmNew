package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dwoa extends Exception {
    public final engw a;

    private dwoa(String str, Throwable th, engw engwVar) {
        super(str, th);
        this.a = engwVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static dwoa a(engw engwVar, String str, Object... objArr) {
        String format = String.format(Locale.US, str, objArr);
        int i = ((enou) engwVar).c;
        if (i > 1) {
            String str2 = format + "\n" + i + " failure(s) in total:\n";
            try {
                StringWriter stringWriter = new StringWriter();
                try {
                    PrintWriter printWriter = new PrintWriter(stringWriter);
                    try {
                        printWriter.println(str2);
                        int i2 = 0;
                        while (i2 < ((enou) engwVar).c) {
                            Throwable th = (Throwable) engwVar.get(i2);
                            i2++;
                            printWriter.printf("--- Failure %d ----------------------------\n", Integer.valueOf(i2));
                            printWriter.println(f(th, 1));
                        }
                        printWriter.println("-------------------------------------------");
                        format = stringWriter.toString();
                        printWriter.close();
                        stringWriter.close();
                    } finally {
                    }
                } finally {
                }
            } catch (Throwable th2) {
                format = "Failed to build string from throwables: ".concat(th2.toString());
            }
        }
        return new dwoa(format, (Throwable) engwVar.get(0), engwVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static ListenableFuture b(Collection collection, String str, Object... objArr) {
        try {
            d(collection, str, objArr);
            return erre.a;
        } catch (dwoa e) {
            engw engwVar = e.a;
            return ((enou) engwVar).c == 1 ? erqt.h((Throwable) engwVar.get(0)) : erqt.h(e);
        }
    }

    static Throwable c(Throwable th) {
        Throwable cause = th.getCause();
        return (cause != null && th.getClass().equals(ExecutionException.class)) ? c(cause) : th;
    }

    public static void d(Collection collection, String str, Object... objArr) {
        e(collection, emux.a, str, objArr);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [erqj, java.lang.Object] */
    public static void e(Collection collection, emxc emxcVar, String str, Object... objArr) {
        Iterator it = collection.iterator();
        engr engrVar = null;
        while (it.hasNext()) {
            try {
                Object q = erqt.q((ListenableFuture) it.next());
                if (emxcVar.g()) {
                    emxcVar.c();
                }
            } catch (CancellationException | ExecutionException e) {
                if (engrVar == null) {
                    int i = engw.d;
                    engrVar = new engr();
                }
                Throwable c = c(e);
                engrVar.h(c);
                if (emxcVar.g()) {
                    emxcVar.c().hx(c);
                }
            }
        }
        if (engrVar != null) {
            throw a(engrVar.g(), str, objArr);
        }
    }

    private static String f(Throwable th, int i) {
        String str = th.getClass().getName() + ": " + th.getMessage();
        Throwable cause = th.getCause();
        if (cause == null) {
            return str;
        }
        if (i >= 5) {
            return str.concat("\n(...)");
        }
        return str + "\nCaused by: " + f(cause, i + 1);
    }
}
