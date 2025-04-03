package defpackage;

import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eeij implements eenz {
    public final /* synthetic */ eeim a;

    public eeij(eeim eeimVar) {
        this.a = eeimVar;
    }

    @Override // defpackage.eenz
    public final void a(String str) {
        dkty.d(this.a.a, "Transaction aborted for context id: %s", str);
        eeif f = this.a.f(str);
        if (f != null) {
            f.d(eeie.ABORTED);
        } else {
            dkty.r(this.a.a, "onAbort: No transaction context found for context id: %s", str);
        }
    }

    @Override // defpackage.eenz
    public final void b(eelv eelvVar) {
        String u = eelvVar.s() ? eelvVar.u(2) : (eelvVar.t() && ((eelx) eelvVar).A()) ? eelvVar.v("ACK", 2) : null;
        dkty.d(this.a.a, "onOutgoingMessage for context id: %s", u);
        if (eelvVar.r()) {
            return;
        }
        eeim eeimVar = this.a;
        String i = eelvVar.i();
        if (u == null) {
            dkty.r(eeimVar.a, "Unable to add outgoing context for null context id", new Object[0]);
            return;
        }
        if (i == null) {
            dkty.r(eeimVar.a, "Unable to add outgoing context for null method for context id: %s", u);
            return;
        }
        synchronized (eeimVar.d) {
            if (eeimVar.d.add(u)) {
                int i2 = ((eeiv) eeimVar.b).a * 50;
                dkty.l(eeimVar.a, "Adding transaction context and starting timer with: %d for context id %s, method: %s", Integer.valueOf(i2), u, i);
                eeimVar.f.schedule(new eeil(eeimVar, u, eeimVar.a), i2);
            }
        }
    }

    @Override // defpackage.eenz
    public final void c(eelv eelvVar) {
        Optional empty;
        dkty.d(this.a.a, "onReceiveMessage for context id: %s", eelvVar.u(1));
        if (this.a.i(eelvVar)) {
            if (this.a.h(eelvVar)) {
                return;
            }
            eeim eeimVar = this.a;
            String u = eelvVar.u(1);
            if (u == null) {
                dkty.r(eeimVar.a, "Unable to add incoming context for null context id", new Object[0]);
            } else {
                synchronized (eeimVar.e) {
                    if (eeimVar.e.add(u)) {
                        int i = ((eeiv) eeimVar.b).a * 50;
                        dkty.l(eeimVar.a, "Adding transaction context and starting timer with: %d for context id %s, method %s", Integer.valueOf(i), u, eelvVar.i());
                        eeimVar.f.schedule(new eeik(eeimVar, u, eeimVar.a), i);
                    }
                }
            }
        }
        eeim eeimVar2 = this.a;
        boolean z = eelvVar.t() && ((eelx) eelvVar).z();
        boolean z2 = eelvVar.s() && "ACK".equals(((eelw) eelvVar).i());
        if (z || z2) {
            String u2 = eelvVar.u(2);
            synchronized (eeimVar2.d) {
                eeimVar2.d.remove(u2);
            }
        }
        eeim eeimVar3 = this.a;
        dkty.d(eeimVar3.a, "Receiving message", new Object[0]);
        if (eelvVar.r()) {
            eeimVar3.h.a(eelvVar);
            return;
        }
        diod diodVar = eeimVar3.g;
        if (eelvVar.s()) {
            empty = Optional.empty();
        } else {
            String j = eeif.j(new eenl((eelx) eelvVar).a);
            empty = j == null ? Optional.empty() : Optional.ofNullable(eeimVar3.f(j)).map(new Function() { // from class: eeii
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return ((eeif) obj).a;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
        }
        Optional optional = empty;
        eeno eenoVar = eeimVar3.c;
        if (eelvVar.s()) {
            eenk eenkVar = new eenk((eelw) eelvVar);
            diodVar.c(eenkVar, Optional.empty(), 2, 5, eenoVar);
            synchronized (diodVar.b) {
                diodVar.b.add(eenkVar);
            }
        } else {
            diodVar.c(new eenl((eelx) eelvVar), optional, 2, 5, eenoVar);
        }
        if (eelvVar.t()) {
            eeimVar3.h.a(eelvVar);
            eeimVar3.g(eelvVar);
        } else if (eelvVar.s()) {
            if ("ACK".equals(eelvVar.i())) {
                eeimVar3.g(eelvVar);
            }
            eeimVar3.h.a(eelvVar);
        }
    }

    @Override // defpackage.eenz
    public final void d() {
        dkty.d(this.a.a, "onTeardown", new Object[0]);
        this.a.f.cancel();
        eeim eeimVar = this.a;
        synchronized (eeimVar.d) {
            for (String str : eeimVar.d) {
                dkty.d(eeimVar.a, "Transaction lost due to transport error for context id: %s", str);
                eeif f = eeimVar.f(str);
                if (f == null) {
                    dkty.r(eeimVar.a, "onTransactionLostDueToTransportError: No transaction context found for context id: %s", str);
                } else {
                    dkty.d(eeimVar.a, "Cancelling transaction with context id: %s", str);
                    f.d(eeie.TRANSPORT_ERROR);
                }
            }
            eeimVar.d.clear();
        }
    }
}
