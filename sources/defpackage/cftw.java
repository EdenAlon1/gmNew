package defpackage;

import android.content.Context;
import java.util.Collection;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cftw {
    public static final entd a = entd.c("BuglePhenotype");
    static final emyl b = cfvl.w("sms_permission_enable_add_sms_permission_check");
    public static final String[] c = {"ANDROID_MESSAGING", "ANDROID_MESSAGING_PRIMES", "BUGLE_COUNTERS", "CARRIER_SERVICES", "CLIENT_LOGGING_PROD", "EXPRESSION", "EXPRESSION_COUNTERS", "COMMS_MESSAGES_WEB", "BUGLE_SPAM", "MESSAGES"};
    public final emyl d;
    public final ffbr e;
    public final Context f;
    public final ffbr g;
    private final errl h;
    private final ffbr i;

    public cftw(errl errlVar, final fazb fazbVar, ffbr ffbrVar, ffbr ffbrVar2, Context context, ffbr ffbrVar3) {
        this.h = errlVar;
        this.d = emys.a(new emyl() { // from class: cftt
            @Override // defpackage.emyl
            public final Object get() {
                entd entdVar = cftw.a;
                return new CopyOnWriteArraySet((Collection) fazb.this.b());
            }
        });
        this.i = ffbrVar;
        this.e = ffbrVar2;
        this.f = context;
        this.g = ffbrVar3;
    }

    public static eyhs a() {
        epbn epbnVar = (epbn) epbo.a.createBuilder();
        eovw eovwVar = csjc.a;
        epbnVar.copyOnWrite();
        epbo epboVar = (epbo) epbnVar.instance;
        epboVar.c = eovwVar.x;
        epboVar.b |= 1;
        epbnVar.copyOnWrite();
        epbo epboVar2 = (epbo) epbnVar.instance;
        epboVar2.b |= 2;
        epboVar2.d = 728121172L;
        return epbnVar.build();
    }

    public final void b() {
        cfue cfueVar = (cfue) this.i.b();
        ((ensz) a.o().h("com/google/android/apps/messaging/shared/experiments/BuglePhenotypeHelper", "commitBuglePhenotypeAsync", 169, "BuglePhenotypeHelper.java")).q("Committing bugle phenotype.");
        final emwl a2 = eldl.a(new emwl() { // from class: cftr
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                ekzz f = eleg.f("PhenotypeHelper#onBuglePhenotypeChanged");
                try {
                    boolean booleanValue = ((Boolean) ((cfup) cftw.b.get()).e()).booleanValue();
                    cftw cftwVar = cftw.this;
                    boolean e = !booleanValue ? ((ctvs) cftwVar.e.b()).e() : ((ctvs) cftwVar.e.b()).f() && koa.c(cftwVar.f, "android.permission.READ_PHONE_STATE") == 0;
                    for (cfug cfugVar : (Set) cftwVar.d.get()) {
                        if (!cfugVar.ge() || e) {
                            cfugVar.gg();
                        }
                    }
                    f.close();
                    return null;
                } catch (Throwable th) {
                    try {
                        f.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
        });
        cfueVar.c(this.h, new dhlk() { // from class: cfts
            @Override // defpackage.dhlk
            public final void a(boolean z) {
                emwl.this.apply(Boolean.valueOf(z));
            }
        });
    }
}
