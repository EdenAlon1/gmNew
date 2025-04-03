package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.time.Instant;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejgi implements ejuh {
    public final emxc a;
    public final Executor b;
    private final eizl c;

    public ejgi(eizl eizlVar, emxc emxcVar, Executor executor) {
        this.c = eizlVar;
        this.a = emxcVar;
        this.b = executor;
    }

    @Override // defpackage.ejuh
    public final erph a() {
        final eizp eizpVar = (eizp) this.c;
        final ListenableFuture k = elfr.k(eizpVar.a.e(), new eroh() { // from class: eizo
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                return (((eize) obj).b & 1) != 0 ? elfr.j(eizp.this.b.e(), new emwl() { // from class: eizm
                    @Override // defpackage.emwl
                    public final Object apply(Object obj2) {
                        return emxc.j((List) obj2);
                    }
                }, erpp.a) : erqt.i(emux.a);
            }
        }, erpp.a);
        final ListenableFuture j = elfr.j(((eizp) this.c).a.e(), new emwl() { // from class: eizn
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                eize eizeVar = (eize) obj;
                return (eizeVar.b & 1) != 0 ? emxc.j(Long.valueOf(eizeVar.c)) : emux.a;
            }
        }, erpp.a);
        return new erph(erqt.d(k, j).b(eldl.c(new erog() { // from class: ejgg
            /* JADX WARN: Type inference failed for: r3v1, types: [ejgl, java.lang.Object] */
            @Override // defpackage.erog
            public final ListenableFuture a() {
                emxc emxcVar = (emxc) erqt.q(k);
                final emxc emxcVar2 = (emxc) erqt.q(j);
                if (!emxcVar.g() || !emxcVar2.g()) {
                    return erqt.i(ejug.a);
                }
                ejgi ejgiVar = ejgi.this;
                final engw n = engw.n((Collection) emxcVar.c());
                emxc emxcVar3 = ejgiVar.a;
                if (emxcVar3.g()) {
                    return erny.f(emxcVar3.c().a(n), eldl.a(new emwl() { // from class: ejgh
                        @Override // defpackage.emwl
                        public final Object apply(Object obj) {
                            enhk enhkVar = (enhk) obj;
                            emxf.m(enip.o(engw.this).equals(enhkVar.keySet()), "EligibilityMapper returned different accounts from the original list");
                            return ejug.a(enhkVar, Instant.ofEpochMilli(((Long) emxcVar2.c()).longValue()));
                        }
                    }), ejgiVar.b);
                }
                enhd enhdVar = new enhd();
                int size = n.size();
                for (int i = 0; i < size; i++) {
                    enhdVar.k((eixn) n.get(i), ejgk.ELIGIBLE);
                }
                return erqt.i(ejug.a(enhdVar.c(), Instant.ofEpochMilli(((Long) emxcVar2.c()).longValue())));
            }
        }), this.b));
    }

    @Override // defpackage.ejuh
    public final ListenableFuture b() {
        return ((eizp) this.c).a.a();
    }

    @Override // defpackage.ejuh
    public final Object c() {
        return "com.google.apps.tiktok.account.data.AllAccounts";
    }
}
