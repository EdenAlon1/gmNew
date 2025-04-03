package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eghu {
    public final egct a;
    public final egdg b;
    private final eghs h;
    private final errl i;
    private final egdu j;
    public final List c = new ArrayList();
    public final List d = new ArrayList();
    public final llg e = new llg();
    private int k = 0;
    private boolean l = false;
    public boolean f = false;
    public boolean g = true;

    public eghu(eghs eghsVar, errl errlVar, egdu egduVar, egct egctVar, egdg egdgVar) {
        this.h = eghsVar;
        this.i = errlVar;
        this.j = egduVar;
        this.a = egctVar;
        this.b = egdgVar;
    }

    public final void a(int i) {
        synchronized (this) {
            this.k = Math.max(i, this.k);
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
                if (!this.l && this.k > this.c.size()) {
                    this.l = true;
                    egdt a = this.j.a(fapt.OBAKE_GOOGLE_PHOTOS_CLUSTER_SUGGESTIONS);
                    a.d();
                    final eghs eghsVar = this.h;
                    if (eghsVar.e) {
                        ewle ewleVar = (ewle) ewlf.a.createBuilder();
                        ewjg ewjgVar = eghsVar.c;
                        ewleVar.copyOnWrite();
                        ewlf ewlfVar = (ewlf) ewleVar.instance;
                        ewjgVar.getClass();
                        ewlfVar.c = ewjgVar;
                        ewlfVar.b = 1 | ewlfVar.b;
                        if (eghsVar.d.g()) {
                            Object c = eghsVar.d.c();
                            ewleVar.copyOnWrite();
                            ewlf ewlfVar2 = (ewlf) ewleVar.instance;
                            ewlfVar2.b |= 2;
                            ewlfVar2.d = (String) c;
                        }
                        g = erny.g(erqc.o(eghsVar.a.i((ewlf) ewleVar.build())), new eroh() { // from class: eghr
                            @Override // defpackage.eroh
                            public final ListenableFuture a(Object obj) {
                                ewlh ewlhVar = (ewlh) obj;
                                ewiy ewiyVar = ewlhVar.b;
                                if (ewiyVar == null) {
                                    ewiyVar = ewiy.a;
                                }
                                emxc j = (ewiyVar.b & 1) != 0 ? emxc.j(ewiyVar.c) : emux.a;
                                eghs eghsVar2 = eghs.this;
                                eghsVar2.d = j;
                                eghsVar2.e = 1 == (ewiyVar.b & 1);
                                return erqt.i(ewlhVar);
                            }
                        }, eghsVar.b);
                    } else {
                        g = erqt.h(new IllegalStateException("No more cluster pages."));
                    }
                    erqt.r(g, new eght(this, a), this.i);
                }
            }
        }
    }

    public final void c() {
        this.f = false;
        b();
    }
}
