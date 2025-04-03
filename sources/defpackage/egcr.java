package defpackage;

import android.accounts.Account;
import android.text.TextUtils;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class egcr implements egco {
    private static final String f = Locale.US.getLanguage();
    public final feau a;
    public final egcm b;
    public final emxc c;
    public final AtomicBoolean d = new AtomicBoolean(false);
    public emxc e = emux.a;
    private final errl g;
    private final egcs h;

    public egcr(feau feauVar, errl errlVar, egcm egcmVar, emxc emxcVar, egcs egcsVar) {
        this.a = feauVar;
        this.g = errlVar;
        this.b = egcmVar;
        this.c = emxcVar;
        this.h = egcsVar;
    }

    public static febo c() {
        febo feboVar = new febo();
        febf febfVar = febo.c;
        int i = febj.d;
        febe febeVar = new febe("Accept-Language", febfVar);
        Locale locale = Locale.getDefault();
        String language = TextUtils.isEmpty(locale.getLanguage()) ? f : locale.getLanguage();
        if (!TextUtils.isEmpty(locale.getCountry())) {
            language = language + "-" + locale.getCountry();
        }
        feboVar.g(febeVar, language);
        return feboVar;
    }

    @Override // defpackage.egco
    public final synchronized ListenableFuture a() {
        if (this.c.g()) {
            return erqt.m(new Callable() { // from class: egcp
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    egcr egcrVar = egcr.this;
                    ewji ewjiVar = (ewji) ewjj.a(egcrVar.a).j(fdrm.d(), TimeUnit.SECONDS);
                    if (egcrVar.d.compareAndSet(true, false) && egcrVar.e.g()) {
                        egcrVar.b.a((String) egcrVar.e.c());
                        egcrVar.e = emux.a;
                    }
                    if (!egcrVar.e.g()) {
                        egcm egcmVar = egcrVar.b;
                        egcrVar.e = emxc.j(dfac.d(egcmVar.a, (Account) egcrVar.c.c(), egcmVar.b));
                    }
                    return (ewji) ((ewji) ewjiVar.i(new feee(emby.d(new embm((String) egcrVar.e.c(), null))))).l(new ffaw(egcr.c()));
                }
            }, this.g);
        }
        return erny.f(erqc.o(duin.a(this.h.a.a())), new emwl() { // from class: egcq
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                febo c = egcr.c();
                febf febfVar = febo.c;
                int i = febj.d;
                c.g(new febe("X-Goog-Spatula", febfVar), (String) obj);
                return (ewji) ((ewji) ewjj.a(egcr.this.a).j(fdrm.d(), TimeUnit.SECONDS)).l(new ffaw(c));
            }
        }, this.g);
    }

    @Override // defpackage.egco
    public final synchronized void b() {
        this.d.set(true);
    }
}
