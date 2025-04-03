package defpackage;

import android.content.Intent;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eivk implements eivc {
    public static final enru a = enru.c("com/google/apps/tiktok/account/api/controller/AccountRequirementManagerImpl");
    public final List b = new ArrayList();
    private final eiuo c;
    private final errl d;

    public eivk(eiuo eiuoVar, errl errlVar) {
        this.c = eiuoVar;
        this.d = errlVar;
    }

    private final ListenableFuture h(final eisx eisxVar, engw engwVar) {
        engwVar.getClass();
        return erny.f(ernq.f(g(eisxVar, engwVar, null), Throwable.class, eldl.a(new emwl() { // from class: eivi
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                throw new eizq((Throwable) obj);
            }
        }), erpp.a), eldl.a(new emwl() { // from class: eivj
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                if (((eixm) obj).c()) {
                    return eisx.this;
                }
                throw new eizq("Requirements not met for account.");
            }
        }), erpp.a);
    }

    @Override // defpackage.eivc
    public final ListenableFuture a(eisx eisxVar) {
        int i = engw.d;
        return h(eisxVar, enou.a);
    }

    @Override // defpackage.eivc
    public final void b(eivb eivbVar) {
        efbd.c();
        synchronized (this.b) {
            this.b.add(eivbVar);
        }
    }

    @Override // defpackage.eivc
    public final void c(eivb eivbVar) {
        efbd.c();
        synchronized (this.b) {
            this.b.remove(eivbVar);
        }
    }

    @Override // defpackage.eivc
    public final void d() {
        erqt.n(eldl.c(new erog() { // from class: eive
            @Override // defpackage.erog
            public final ListenableFuture a() {
                engw n;
                ListenableFuture i;
                eivk eivkVar = eivk.this;
                synchronized (eivkVar.b) {
                    n = engw.n(eivkVar.b);
                }
                ArrayList arrayList = new ArrayList(n.size());
                int size = n.size();
                for (int i2 = 0; i2 < size; i2++) {
                    try {
                        i = ((eivb) n.get(i2)).g();
                    } catch (Throwable th) {
                        ((enrr) ((enrr) ((enrr) eivk.a.i()).g(th)).h("com/google/apps/tiktok/account/api/controller/AccountRequirementManagerImpl", "notifyRequirementStateChanged", (char) 198, "AccountRequirementManagerImpl.java")).q("OnRequirementStateChanged observer failed.");
                        i = erqt.i(null);
                    }
                    arrayList.add(i);
                }
                return erqt.a(arrayList).a(new eroi(null), erpp.a);
            }
        }), this.d);
    }

    @Override // defpackage.eivc
    public final engw e() {
        int i = engw.d;
        return enou.a;
    }

    @Override // defpackage.eivc
    public final ListenableFuture f(eisx eisxVar, engw engwVar) {
        return h(eisxVar, engwVar);
    }

    @Override // defpackage.eivc
    public final ListenableFuture g(final eisx eisxVar, final List list, final Intent intent) {
        ekzz f = eleg.f("Validate Requirements");
        try {
            ListenableFuture g = erny.g(this.c.a(eisxVar, new eiva(intent)), eldl.d(new eroh() { // from class: eivd
                @Override // defpackage.eroh
                public final ListenableFuture a(Object obj) {
                    List<eiuz> list2 = list;
                    ArrayList arrayList = new ArrayList(list2.size());
                    for (final eiuz eiuzVar : list2) {
                        final Intent intent2 = intent;
                        final eisx eisxVar2 = eisxVar;
                        arrayList.add(new erog() { // from class: eivf
                            @Override // defpackage.erog
                            public final ListenableFuture a() {
                                return eiuz.this.a(eisxVar2, new eiva(intent2));
                            }
                        });
                    }
                    return erny.f(eixg.a(arrayList, new emxg() { // from class: eivg
                        @Override // defpackage.emxg
                        public final boolean a(Object obj2) {
                            return !((eixm) obj2).c();
                        }
                    }, erpp.a), eldl.a(new emwl() { // from class: eivh
                        @Override // defpackage.emwl
                        public final Object apply(Object obj2) {
                            eixm eixmVar = (eixm) obj2;
                            return eixmVar == null ? eixm.d() : eixmVar;
                        }
                    }), erpp.a);
                }
            }), erpp.a);
            f.b(g);
            f.close();
            return g;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
