package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class egem implements egei {
    public final egct a;
    public final egdg b;
    private final errl h;
    private final egdu i;
    private final egeg j;
    public final llg c = new llg();
    public final List d = new ArrayList();
    public final List e = new ArrayList();
    private int k = 0;
    private boolean l = false;
    public boolean f = false;
    public boolean g = true;

    public egem(errl errlVar, egdu egduVar, egct egctVar, egdg egdgVar, egeh egehVar, long j) {
        this.h = errlVar;
        this.i = egduVar;
        this.a = egctVar;
        this.b = egdgVar;
        egcn egcnVar = (egcn) egehVar.a.b();
        egcnVar.getClass();
        errl errlVar2 = (errl) egehVar.b.b();
        errlVar2.getClass();
        ewjg ewjgVar = (ewjg) egehVar.c.b();
        ewjgVar.getClass();
        ewiq ewiqVar = (ewiq) egehVar.d.b();
        ewiqVar.getClass();
        this.j = new egeg(egcnVar, errlVar2, ewjgVar, ewiqVar, j);
    }

    @Override // defpackage.egei
    public final lld a() {
        return this.c;
    }

    @Override // defpackage.egei
    public final void b(int i) {
        synchronized (this) {
            this.k = Math.max(i, this.k);
        }
        d();
    }

    @Override // defpackage.egei
    public final void c() {
        this.f = false;
        d();
    }

    public final void d() {
        ListenableFuture g;
        synchronized (this) {
            if (this.f) {
                return;
            }
            if (this.g) {
                if (!this.l && this.k > this.d.size()) {
                    this.l = true;
                    egdt a = this.i.a(fapt.OBAKE_ART_COLLECTION_PHOTOS);
                    a.d();
                    final egeg egegVar = this.j;
                    if (egegVar.f) {
                        ewjo ewjoVar = (ewjo) ewjp.a.createBuilder();
                        ewjg ewjgVar = egegVar.c;
                        ewjoVar.copyOnWrite();
                        ewjp ewjpVar = (ewjp) ewjoVar.instance;
                        ewjpVar.c = ewjgVar;
                        ewjpVar.b = 1 | ewjpVar.b;
                        long j = egegVar.g;
                        ewjoVar.copyOnWrite();
                        ewjp ewjpVar2 = (ewjp) ewjoVar.instance;
                        ewjpVar2.b |= 2;
                        ewjpVar2.d = j;
                        ewjoVar.copyOnWrite();
                        ewjp ewjpVar3 = (ewjp) ewjoVar.instance;
                        ewjpVar3.b |= 8;
                        ewjpVar3.f = 100;
                        if (!egegVar.d.equals(ewiq.a)) {
                            ewiq ewiqVar = egegVar.d;
                            ewjoVar.copyOnWrite();
                            ewjp ewjpVar4 = (ewjp) ewjoVar.instance;
                            ewjpVar4.g = ewiqVar;
                            ewjpVar4.b |= 16;
                        }
                        if (egegVar.e.g()) {
                            Object c = egegVar.e.c();
                            ewjoVar.copyOnWrite();
                            ewjp ewjpVar5 = (ewjp) ewjoVar.instance;
                            ewjpVar5.b |= 4;
                            ewjpVar5.e = (eyee) c;
                        }
                        g = erny.g(erqc.o(egegVar.a.b((ewjp) ewjoVar.build())), new eroh() { // from class: egef
                            @Override // defpackage.eroh
                            public final ListenableFuture a(Object obj) {
                                ewjr ewjrVar = (ewjr) obj;
                                int i = ewjrVar.b & 4;
                                boolean z = i != 0;
                                egeg egegVar2 = egeg.this;
                                egegVar2.f = z;
                                egegVar2.e = i != 0 ? emxc.j(ewjrVar.d) : emux.a;
                                return erqt.i(ewjrVar);
                            }
                        }, egegVar.b);
                    } else {
                        g = erqt.h(new IllegalStateException("No more collection pages."));
                    }
                    erqt.r(g, new egel(this, a), this.h);
                }
            }
        }
    }
}
