package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejeg {
    public final eiyk a;
    public final eiyx b;
    private final errl c;

    public ejeg(eiyk eiykVar, eiyx eiyxVar, errl errlVar) {
        this.a = eiykVar;
        this.b = eiyxVar;
        this.c = errlVar;
    }

    public final ListenableFuture a() {
        final eiyx eiyxVar = this.b;
        return erny.g(erny.g(erqc.o(erny.f(eiyxVar.c.a(), eldl.a(new emwl() { // from class: eiyp
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                eize eizeVar = (eize) obj;
                boolean z = false;
                if ((eizeVar.b & 4) != 0) {
                    if (eizeVar.e == eiyx.this.f) {
                        z = true;
                    }
                }
                return Boolean.valueOf(z);
            }
        }), erpp.a)), eldl.d(new eroh() { // from class: ejee
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                if (((Boolean) obj).booleanValue()) {
                    return erqt.i(null);
                }
                ejeg ejegVar = ejeg.this;
                enpx enpxVar = new enpx("pseudonymous");
                emxf.a(!enpxVar.isEmpty());
                enqu listIterator = enpxVar.listIterator();
                while (listIterator.hasNext()) {
                    ((String) listIterator.next()).getClass();
                    emxf.a(!r2.isEmpty());
                }
                eiyx eiyxVar2 = ejegVar.b;
                ListenableFuture b = eiyxVar2.b(enpxVar);
                eiyxVar2.d(b);
                return b;
            }
        }), this.c), eldl.d(new eroh() { // from class: ejef
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                return ejeg.this.a.b("pseudonymous", "pseudonymous");
            }
        }), this.c);
    }
}
