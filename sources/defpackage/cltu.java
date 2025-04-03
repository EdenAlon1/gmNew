package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cltu {
    public static final cskc a = cskc.g("BugleRcs", "MessagingServiceGenericMethod");
    public final cltt b;
    private final errl c;
    private final clmf d;

    public cltu(errl errlVar, cltt clttVar, clmf clmfVar) {
        this.c = errlVar;
        this.b = clttVar;
        this.d = clmfVar;
    }

    public final elfl a(final Object obj) {
        cltt clttVar = this.b;
        return clttVar.c(clttVar.f(obj)).h(new emwl() { // from class: cltq
            @Override // defpackage.emwl
            public final Object apply(Object obj2) {
                return cltu.this.b.g(obj);
            }
        }, this.c).e(Throwable.class, new emwl() { // from class: cltr
            @Override // defpackage.emwl
            public final Object apply(Object obj2) {
                csjb e = cltu.a.e();
                e.I("Call to Messaging service failed");
                cltu cltuVar = cltu.this;
                e.A("methodName", cltuVar.b.i());
                cltt clttVar2 = cltuVar.b;
                Object obj3 = obj;
                e.I(clttVar2.h(obj3));
                e.s((Throwable) obj2);
                return cltuVar.b.j(obj3);
            }
        }, this.c);
    }

    public final elfl b(Object obj) {
        cltt clttVar = this.b;
        awud a2 = clttVar.a(obj);
        final Object e = clttVar.e(obj);
        Optional d = clttVar.d(obj);
        return (d.isEmpty() ? this.b.b(e) : this.d.a(a2, (String) d.get()).h(new emwl() { // from class: clto
            @Override // defpackage.emwl
            public final Object apply(Object obj2) {
                awud awudVar = (awud) obj2;
                awuc awucVar = awuc.OK;
                awuc b = awuc.b(awudVar.c);
                if (b == null) {
                    b = awuc.UNKNOWN_STATUS;
                }
                cltu cltuVar = cltu.this;
                if (awucVar.equals(b)) {
                    csjb a3 = cltu.a.a();
                    a3.I("Emitted GroupEvent processing succeeded");
                    a3.A("method", cltuVar.b.i());
                    a3.r();
                    return awudVar;
                }
                csjb b2 = cltu.a.b();
                b2.I("Emitted GroupEvent processing failed");
                b2.A("method", cltuVar.b.i());
                b2.r();
                return awudVar;
            }
        }, this.c).i(new eroh() { // from class: cltp
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj2) {
                return cltu.this.b.b(e);
            }
        }, this.c)).h(new emwl() { // from class: clts
            @Override // defpackage.emwl
            public final Object apply(Object obj2) {
                awud awudVar = (awud) obj2;
                awuc awucVar = awuc.OK;
                awuc b = awuc.b(awudVar.c);
                if (b == null) {
                    b = awuc.UNKNOWN_STATUS;
                }
                cltu cltuVar = cltu.this;
                if (awucVar.equals(b)) {
                    csjb c = cltu.a.c();
                    c.I("Response notification delivered to Incoming Chat API");
                    c.A("method", cltuVar.b.i());
                    c.r();
                    return awudVar;
                }
                csjb b2 = cltu.a.b();
                b2.I("Failed to process response notification");
                b2.A("method", cltuVar.b.i());
                b2.r();
                return awudVar;
            }
        }, this.c);
    }
}
