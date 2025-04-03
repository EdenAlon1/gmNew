package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eiyx {
    public final ffbr a;
    public final eiyk b;
    public final effy c;
    public final dlpw d;
    public final ffbr e;
    public final int f;
    public final Executor g;
    private final erqa h = new erqa();

    public eiyx(ffbr ffbrVar, eiyk eiykVar, effy effyVar, dlpw dlpwVar, ffbr ffbrVar2, int i, Executor executor) {
        this.a = ffbrVar;
        this.b = eiykVar;
        this.c = effyVar;
        this.d = dlpwVar;
        this.e = ffbrVar2;
        this.f = i;
        this.g = executor;
    }

    public final ListenableFuture a() {
        final long epochMilli = this.d.f().toEpochMilli();
        return this.h.b(eldl.c(new erog() { // from class: eiyo
            @Override // defpackage.erog
            public final ListenableFuture a() {
                final eiyx eiyxVar = eiyx.this;
                boolean isEmpty = enip.o(((eiza) eiyxVar.a.b()).a().values()).isEmpty();
                final long j = epochMilli;
                if (isEmpty) {
                    return eiyxVar.c(j);
                }
                eiza eizaVar = (eiza) eiyxVar.a.b();
                enhk a = eizaVar.a();
                ArrayList arrayList = new ArrayList();
                enqu listIterator = a.entrySet().listIterator();
                while (listIterator.hasNext()) {
                    Map.Entry entry = (Map.Entry) listIterator.next();
                    arrayList.add(eizaVar.c((String) entry.getKey(), (eiyl) entry.getValue()));
                }
                return erny.g(erny.g(erqc.o(eizaVar.b(arrayList)), eldl.d(new eroh() { // from class: eiyt
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj) {
                        return eiyx.this.b.k((engw) obj);
                    }
                }), eiyxVar.g), eldl.d(new eroh() { // from class: eiyu
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj) {
                        return eiyx.this.c(j);
                    }
                }), eiyxVar.g);
            }
        }), this.g);
    }

    public final ListenableFuture b(final enip enipVar) {
        return this.h.b(eldl.c(new erog() { // from class: eiyq
            @Override // defpackage.erog
            public final ListenableFuture a() {
                final eiyx eiyxVar = eiyx.this;
                eiza eizaVar = (eiza) eiyxVar.a.b();
                enhk a = eizaVar.a();
                ArrayList arrayList = new ArrayList(1);
                final enip enipVar2 = enipVar;
                enqu listIterator = enipVar2.listIterator();
                while (listIterator.hasNext()) {
                    String str = (String) listIterator.next();
                    emxf.f(a.containsKey(str), "No AccountProvider found for type: %s", str);
                    arrayList.add(eizaVar.c(str, (eiyl) a.get(str)));
                }
                return erny.g(eizaVar.b(arrayList), eldl.d(new eroh() { // from class: eiyv
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj) {
                        return eiyx.this.b.l((engw) obj, enipVar2);
                    }
                }), eiyxVar.g);
            }
        }), this.g);
    }

    public final ListenableFuture c(final long j) {
        return this.c.b(new emwl() { // from class: eiyr
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                eize eizeVar = (eize) obj;
                int i = eizeVar.b;
                int i2 = i & 1;
                long j2 = j;
                if (i2 == 0 && (i & 2) != 0 && eizeVar.d > j2) {
                    return eizeVar;
                }
                eiyx eiyxVar = eiyx.this;
                eizd eizdVar = (eizd) eizeVar.toBuilder();
                eizdVar.copyOnWrite();
                eize eizeVar2 = (eize) eizdVar.instance;
                eizeVar2.b |= 1;
                eizeVar2.c = j2;
                eizdVar.copyOnWrite();
                eize eizeVar3 = (eize) eizdVar.instance;
                eizeVar3.b |= 4;
                eizeVar3.e = eiyxVar.f;
                eizdVar.copyOnWrite();
                eize eizeVar4 = (eize) eizdVar.instance;
                eizeVar4.b &= -3;
                eizeVar4.d = 0L;
                return (eize) eizdVar.build();
            }
        }, erpp.a);
    }

    public final void d(ListenableFuture listenableFuture) {
        erqt.r(listenableFuture, eldl.i(new eiyw(this)), this.g);
    }

    public final ListenableFuture e() {
        return this.c.a();
    }

    public final ListenableFuture f() {
        return this.c.b(new emwl() { // from class: eiys
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                eizd eizdVar = (eizd) ((eize) obj).toBuilder();
                eizdVar.clear();
                long epochMilli = eiyx.this.d.f().toEpochMilli();
                eizdVar.copyOnWrite();
                eize eizeVar = (eize) eizdVar.instance;
                eizeVar.b |= 2;
                eizeVar.d = epochMilli;
                return (eize) eizdVar.build();
            }
        }, erpp.a);
    }
}
