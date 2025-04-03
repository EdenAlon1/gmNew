package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class egie {
    public final egdg a;
    public final egct b;
    private final errl i;
    private final egdu j;
    private final fapt k;
    private final fapt l;
    private final egib m;
    public final List c = new ArrayList();
    public final List d = new ArrayList();
    public final llg e = new llg();
    private int n = 0;
    private boolean o = false;
    public boolean f = false;
    public boolean g = true;
    public int h = 0;

    public egie(errl errlVar, egdu egduVar, egct egctVar, egdg egdgVar, egia egiaVar, int i, emxc emxcVar, fapt faptVar, fapt faptVar2) {
        this.i = errlVar;
        this.j = egduVar;
        this.b = egctVar;
        this.a = egdgVar;
        this.k = faptVar;
        this.l = faptVar2;
        int i2 = i - 1;
        if (i2 == 0) {
            this.m = new egib(egiaVar.a, egiaVar.b, egiaVar.c, emux.a, false);
        } else if (i2 == 1) {
            this.m = new egib(egiaVar.a, egiaVar.b, egiaVar.c, emux.a, true);
        } else {
            this.m = new egib(egiaVar.a, egiaVar.b, egiaVar.c, emxc.j(emxcVar.c()), false);
        }
    }

    public final void a(int i) {
        synchronized (this) {
            this.n = Math.max(i, this.n);
        }
        b();
    }

    public final void b() {
        ListenableFuture g;
        synchronized (this) {
            if (this.f) {
                return;
            }
            if (this.g) {
                if (!this.o && this.n > this.c.size()) {
                    this.o = true;
                    boolean d = d();
                    if (d) {
                        this.h++;
                    }
                    egdt a = this.j.a(d ? this.l : this.k);
                    a.d();
                    final egib egibVar = this.m;
                    if (egibVar.g) {
                        ewli ewliVar = (ewli) ewlj.a.createBuilder();
                        ewjg ewjgVar = egibVar.c;
                        ewliVar.copyOnWrite();
                        ewlj ewljVar = (ewlj) ewliVar.instance;
                        ewjgVar.getClass();
                        ewljVar.e = ewjgVar;
                        ewljVar.b |= 1;
                        ewlq ewlqVar = (ewlq) ewlr.a.createBuilder();
                        ewlqVar.copyOnWrite();
                        ewlr ewlrVar = (ewlr) ewlqVar.instance;
                        ewlrVar.b |= 1;
                        ewlrVar.c = d;
                        ewliVar.copyOnWrite();
                        ewlj ewljVar2 = (ewlj) ewliVar.instance;
                        ewlr ewlrVar2 = (ewlr) ewlqVar.build();
                        ewlrVar2.getClass();
                        ewljVar2.g = ewlrVar2;
                        ewljVar2.b |= 4;
                        if (egibVar.f.g()) {
                            Object c = egibVar.f.c();
                            ewliVar.copyOnWrite();
                            ewlj ewljVar3 = (ewlj) ewliVar.instance;
                            ewljVar3.b |= 2;
                            ewljVar3.f = (String) c;
                        }
                        if (egibVar.e.g()) {
                            Object c2 = egibVar.e.c();
                            ewliVar.copyOnWrite();
                            ewlj ewljVar4 = (ewlj) ewliVar.instance;
                            ewljVar4.c = 3;
                            ewljVar4.d = c2;
                        } else if (egibVar.d) {
                            ewliVar.copyOnWrite();
                            ewlj ewljVar5 = (ewlj) ewliVar.instance;
                            ewljVar5.c = 4;
                            ewljVar5.d = true;
                        }
                        g = erny.g(erqc.o(egibVar.a.j((ewlj) ewliVar.build())), new eroh() { // from class: eghz
                            @Override // defpackage.eroh
                            public final ListenableFuture a(Object obj) {
                                ewll ewllVar = (ewll) obj;
                                ewlt ewltVar = ewllVar.b;
                                if (ewltVar == null) {
                                    ewltVar = ewlt.a;
                                }
                                emxc j = (ewltVar.b & 1) != 0 ? emxc.j(ewltVar.c) : emux.a;
                                egib egibVar2 = egib.this;
                                egibVar2.f = j;
                                int i = ewltVar.b;
                                egibVar2.g = 1 == (i & 1);
                                egibVar2.e = (i & 2) != 0 ? emxc.j(ewltVar.d) : emux.a;
                                return erqt.i(ewllVar);
                            }
                        }, egibVar.b);
                    } else {
                        g = erqt.h(new IllegalStateException("No more photo pages."));
                    }
                    erqt.r(g, new egic(this, a, d), this.i);
                }
            }
        }
    }

    public final void c() {
        this.f = false;
        b();
    }

    public final boolean d() {
        Iterator it = this.c.iterator();
        int i = 0;
        while (it.hasNext()) {
            int a = ewlo.a(((ewlp) it.next()).e);
            if (a != 0 && a == 2) {
                i++;
            }
        }
        return i < 20;
    }
}
