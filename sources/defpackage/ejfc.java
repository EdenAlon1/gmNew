package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.io.File;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejfc implements ekrm {
    public static final enru a = enru.c("com/google/apps/tiktok/account/storage/WipeoutAccountsSynclet");
    static final long b = TimeUnit.DAYS.toMillis(30);
    public final dlpw c;
    public final eiyk d;
    public final eiyx e;
    public final eiyh f;
    public final errl g;
    public final errl h;
    public final ejep i;
    private final erqa j;

    public ejfc(dlpw dlpwVar, eiyk eiykVar, eiyx eiyxVar, eiyh eiyhVar, errl errlVar, errl errlVar2, ejep ejepVar, erqa erqaVar) {
        this.c = dlpwVar;
        this.d = eiykVar;
        this.e = eiyxVar;
        this.f = eiyhVar;
        this.g = errlVar;
        this.h = errlVar2;
        this.i = ejepVar;
        this.j = erqaVar;
    }

    @Override // defpackage.ekrm
    public final ListenableFuture a() {
        return ernq.f(erqt.n(eldl.c(new erog() { // from class: ejey
            @Override // defpackage.erog
            public final ListenableFuture a() {
                final ejfc ejfcVar = ejfc.this;
                eiyx eiyxVar = ejfcVar.e;
                final ListenableFuture b2 = ejfcVar.b();
                final ListenableFuture g = erny.g(erny.g(erqc.o(eiyxVar.e()), eldl.d(new eroh() { // from class: ejeu
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj) {
                        eize eizeVar = (eize) obj;
                        int i = eizeVar.b & 1;
                        ejfc ejfcVar2 = ejfc.this;
                        return (i == 0 || Math.abs(ejfcVar2.c.f().toEpochMilli() - eizeVar.c) >= ejfc.b) ? erny.f(ejfcVar2.f.b(), eldl.a(new emwl() { // from class: ejfb
                            @Override // defpackage.emwl
                            public final Object apply(Object obj2) {
                                enru enruVar = ejfc.a;
                                return true;
                            }
                        }), erpp.a) : erqt.i(false);
                    }
                }), ejfcVar.h), eldl.d(new eroh() { // from class: ejev
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj) {
                        return ((Boolean) obj).booleanValue() ? ejfc.this.b() : erqt.i(null);
                    }
                }), ejfcVar.g);
                return erqt.b(b2, g).a(eldl.m(new Callable() { // from class: ejew
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        enru enruVar = ejfc.a;
                        erqt.q(ListenableFuture.this);
                        erqt.q(g);
                        return null;
                    }
                }), ejfcVar.g);
            }
        }), this.g), Throwable.class, eldl.a(new emwl() { // from class: ejez
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                ((enrr) ((enrr) ((enrr) ejfc.a.i()).g((Throwable) obj)).h("com/google/apps/tiktok/account/storage/WipeoutAccountsSynclet", "sync", 90, "WipeoutAccountsSynclet.java")).q("Wipeout accounts task failed.");
                return null;
            }
        }), this.g);
    }

    final ListenableFuture b() {
        return this.j.b(eldl.c(new erog() { // from class: ejfa
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.erog
            public final ListenableFuture a() {
                final ejfc ejfcVar = ejfc.this;
                engw b2 = ejfcVar.i.b(true);
                enin eninVar = new enin();
                int i = ((enou) b2).c;
                for (int i2 = 0; i2 < i; i2++) {
                    File file = (File) b2.get(i2);
                    try {
                        eninVar.c(Integer.valueOf(Integer.parseInt(file.getName())));
                    } catch (NumberFormatException e) {
                        ((enrr) ((enrr) ((enrr) ejfc.a.i()).g(e)).h("com/google/apps/tiktok/account/storage/WipeoutAccountsSynclet", "cleanUpObseleteAccountDirsInternal", 172, "WipeoutAccountsSynclet.java")).t("Account directory name is malformed. Directory name: %s", file.getName());
                    }
                }
                final enip g = eninVar.g();
                return erny.g(ejfcVar.d.i(), eldl.d(new eroh() { // from class: ejex
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj) {
                        enip d = enpw.b(g, (Set) obj).d();
                        ejep ejepVar = ejfc.this.i;
                        return ejepVar.c(ejepVar.a(d, null, true));
                    }
                }), ejfcVar.h);
            }
        }), this.h);
    }
}
