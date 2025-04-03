package defpackage;

import android.content.Context;
import android.os.Process;
import android.text.format.DateFormat;
import android.util.Log;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Collections;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ekmc extends enuq implements edyw {
    public final ekmp a;
    public final ekmg b;
    public final Context c;

    public ekmc(Context context, errl errlVar, ekmg ekmgVar) {
        super("FileLoggerBackend");
        this.c = context;
        this.b = ekmgVar;
        this.a = new ekmp(new emyl() { // from class: ekmb
            @Override // defpackage.emyl
            public final Object get() {
                ekmc ekmcVar = ekmc.this;
                return new File(ekmcVar.c.getDir(ekmcVar.b.f(), 0), ekmcVar.b.g());
            }
        }, ekmgVar.e(), ekmgVar.d(), new ersb(errlVar));
    }

    @Override // defpackage.edyw
    public final ListenableFuture a() {
        final ekmp ekmpVar = this.a;
        return erqt.n(new erog() { // from class: ekml
            @Override // defpackage.erog
            public final ListenableFuture a() {
                ekmp.b();
                PrintWriter printWriter = ekmp.this.h;
                if (printWriter != null) {
                    printWriter.flush();
                }
                return erqt.i(null);
            }
        }, ekmpVar.e);
    }

    @Override // defpackage.ento
    public final void b(entl entlVar) {
        enuj g = enuj.g(Cenum.f(), this.b.h() ? entlVar.i() : entr.a);
        String str = (String) entlVar.i().d(ente.a);
        int intValue = entlVar.m().intValue();
        String str2 = intValue >= 1000 ? "E " : intValue >= 900 ? "W " : intValue >= 800 ? "I " : "D ";
        if (str == null) {
            str = entlVar.l();
        }
        ensn[] ensnVarArr = {ente.a};
        Set set = enuo.a;
        HashSet hashSet = new HashSet(enuo.a);
        Collections.addAll(hashSet, ensnVarArr);
        String a = new enun(hashSet).a(entlVar, g);
        Throwable th = (Throwable) entlVar.i().d(enrz.a);
        long millis = TimeUnit.NANOSECONDS.toMillis(entlVar.d());
        try {
            StringWriter stringWriter = new StringWriter();
            try {
                stringWriter.append((CharSequence) str2).append((CharSequence) str).append((CharSequence) ": ").append((CharSequence) a);
                if (th != null) {
                    stringWriter.append((CharSequence) " ").append((CharSequence) th.toString());
                    PrintWriter printWriter = new PrintWriter(stringWriter);
                    try {
                        th.printStackTrace(printWriter);
                        printWriter.close();
                    } finally {
                    }
                }
                final ekmp ekmpVar = this.a;
                String stringWriter2 = stringWriter.toString();
                int myPid = Process.myPid();
                int myTid = Process.myTid();
                if (stringWriter2 != null) {
                    final String format = String.format(Locale.US, "%s.%03d %d %d %s", DateFormat.format("MM-dd HH:mm:ss", millis), Long.valueOf(millis % 1000), Integer.valueOf(myPid), Integer.valueOf(myTid), stringWriter2);
                    ekmpVar.e.execute(new Runnable() { // from class: ekmk
                        @Override // java.lang.Runnable
                        public final void run() {
                            ekmp.b();
                            ekmp ekmpVar2 = ekmp.this;
                            String str3 = format;
                            try {
                                long length = str3.getBytes().length;
                                if (length > ekmpVar2.f) {
                                    Log.w(ekmp.a, "The message is too large to log internally.");
                                    return;
                                }
                                ekmp.b();
                                if (ekmpVar2.h == null) {
                                    File file = (File) ekmpVar2.d.get();
                                    if (file.exists() && file.length() + length >= ekmpVar2.f) {
                                        ekmpVar2.d();
                                    }
                                    ekmpVar2.c();
                                }
                                if (ekmpVar2.i.a + length >= ekmpVar2.f) {
                                    ekmpVar2.h.flush();
                                    efay.a(ekmpVar2.h);
                                    ekmpVar2.h = null;
                                    ekmpVar2.d();
                                    ekmpVar2.c();
                                }
                                ekmpVar2.h.println(str3);
                            } catch (IOException e) {
                                Log.e(ekmp.a, "Unable to write to file log.", e);
                            }
                        }
                    });
                }
                stringWriter.close();
            } finally {
            }
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    @Override // defpackage.ento
    public final boolean c(Level level) {
        return this.b.i(level);
    }
}
