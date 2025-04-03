package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class ctzr {
    public static final cskc a = cskc.g("BugleRcs", "BasePhenotypeHelper");
    static final String[] b = {"ANDROID_MESSAGING", "ANDROID_MESSAGING_PRIMES", "BUGLE_COUNTERS", "CARRIER_SERVICES", "EXPRESSION", "EXPRESSION_COUNTERS", "BUGLE_SPAM", "MESSAGES"};
    public final csjk c;
    private final Executor d;

    public ctzr(cfuu cfuuVar, csjk csjkVar, Executor executor) {
        this.c = csjkVar;
        this.d = executor;
        cfuuVar.a();
    }

    public final void a(String str, dhlk dhlkVar) {
        csjb a2 = a.a();
        a2.A("Committing for package", str);
        a2.r();
        new ctzq((dhlf) this.c.a(), str).c(this.d, dhlkVar);
    }
}
