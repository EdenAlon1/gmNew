package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Pair;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dyle implements dyil {
    public final dyyt a;
    public final dzdd f;
    private final Context g;
    private final dyqz i;
    public final Object b = new Object();
    private final Object j = new Object();
    final Map d = new HashMap();
    final Map e = new HashMap();
    private final errl h = dyia.b().a;
    public final Random c = new Random();

    public dyle(Context context, dyqz dyqzVar, dzdd dzddVar, dyyt dyytVar) {
        this.g = context;
        this.i = dyqzVar;
        this.f = dzddVar;
        this.a = dyytVar;
    }

    @Override // defpackage.dyil
    public final dzwu a(dzja dzjaVar, dzpg dzpgVar) {
        return e(dzjaVar, dzpgVar, new emxg() { // from class: dylc
            @Override // defpackage.emxg
            public final boolean a(Object obj) {
                dyhj.a();
                return System.currentTimeMillis() > ((dzpb) obj).a();
            }
        });
    }

    @Override // defpackage.dyil
    public final void b(final dzja dzjaVar, final dzpb dzpbVar) {
        if (dzpbVar.g().g()) {
            dyyt dyytVar = this.a;
            dzhl r = dzhm.r();
            r.g(37);
            r.n(dzjaVar.c().f());
            r.o(dzjaVar.d().E());
            r.c(dzpbVar.d());
            dyytVar.b(r.a());
            ListenableFuture submit = this.h.submit(new dyjh(this.g, (String) dzpbVar.g().c()));
            erqt.r(submit, new dyld(this, dzjaVar, dzpbVar), erpp.a);
            erny.f(submit, new emwl() { // from class: dykx
                @Override // defpackage.emwl
                public final Object apply(Object obj) {
                    dzpb a;
                    dyle dyleVar = dyle.this;
                    dzpb dzpbVar2 = dzpbVar;
                    dzja dzjaVar2 = dzjaVar;
                    Bitmap bitmap = (Bitmap) obj;
                    if (bitmap != null) {
                        dzpa c = dzpbVar2.c();
                        c.h(false);
                        c.f(bitmap);
                        a = c.a();
                        dyyt dyytVar2 = dyleVar.a;
                        dzhl r2 = dzhm.r();
                        r2.g(38);
                        r2.n(dzjaVar2.c().f());
                        r2.o(dzjaVar2.d().E());
                        r2.c(dzpbVar2.d());
                        dyytVar2.b(r2.a());
                    } else {
                        dzpa c2 = dzpbVar2.c();
                        c2.h(true);
                        a = c2.a();
                        dyyt dyytVar3 = dyleVar.a;
                        dzhl r3 = dzhm.r();
                        r3.g(39);
                        r3.n(dzjaVar2.c().f());
                        r3.o(dzjaVar2.d().E());
                        r3.c(dzpbVar2.d());
                        dyytVar3.b(r3.a());
                    }
                    dyleVar.d(dzjaVar2).aj(a);
                    return a;
                }
            }, erpp.a);
        }
    }

    public final dzpb c(final dzja dzjaVar, final dzpg dzpgVar, emxc emxcVar, emxg emxgVar) {
        final ListenableFuture listenableFuture;
        if (!emxcVar.g()) {
            dzpa k = dzpb.k();
            k.c(dzpgVar);
            k.e(-1L);
            int i = engw.d;
            k.j(enou.a);
            k.m(enou.a);
            emxcVar = emxc.j(k.a());
        }
        boolean a = emxgVar.a((dzpb) emxcVar.c());
        dyhr.a("LitContactCtrlr", a.q(a, "shouldUpdateContact "));
        final dzpb dzpbVar = (dzpb) emxcVar.c();
        if (a) {
            synchronized (this.b) {
                listenableFuture = (ListenableFuture) this.d.get(Pair.create(dzjaVar, dzpgVar));
                if (listenableFuture != null && !listenableFuture.isDone()) {
                    dyhr.a("LitContactCtrlr", "ContactSync already pending for contact");
                }
                dyhr.a("LitContactCtrlr", "sync contact profile");
                dyxa c = dyxb.c();
                ((dyww) c).a = "sync contact profile";
                c.b(dyxf.g);
                final dyxb a2 = c.a();
                final ListenableFuture n = erqt.n(new erog() { // from class: dykz
                    @Override // defpackage.erog
                    public final ListenableFuture a() {
                        dzdd dzddVar = dyle.this.f;
                        Context context = dzddVar.b;
                        dzja dzjaVar2 = dzjaVar;
                        dzpg d = dzpbVar.d();
                        return dzddVar.a.b(UUID.randomUUID(), new dzff(context, dzjaVar2, d), dzddVar.a.d.b(), dzjaVar2, a2, true);
                    }
                }, this.h);
                listenableFuture = erny.f(erqt.b(n).a(new Callable() { // from class: dyla
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r1v19, types: [dzpu, java.lang.Object] */
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        byte[] bArr;
                        int length;
                        long b = fdql.b();
                        int c2 = (int) fdql.c();
                        dyhr.a("LitContactCtrlr", "maybeApplyUpdateAndSaveSyncedContact called");
                        dyql dyqlVar = (dyql) erqt.q(n);
                        dyhj.a();
                        dyle dyleVar = dyle.this;
                        long currentTimeMillis = System.currentTimeMillis() + dyleVar.c.nextInt(c2) + b;
                        int b2 = dyqlVar.b() - 1;
                        dzpb dzpbVar2 = dzpbVar;
                        if (b2 != 1) {
                            dyhr.e("LitContactCtrlr", "contact profile is not supported.");
                            dzpa c3 = dzpbVar2.c();
                            c3.e(currentTimeMillis);
                            return c3.a();
                        }
                        dyhr.a("LitContactCtrlr", "Got contact profile");
                        if (!dyqlVar.a().g()) {
                            dyhr.c("LitContactCtrlr", "Got empty contact profile.");
                            return dzpbVar2;
                        }
                        final dzpa k2 = dzpb.k();
                        k2.c(dzpbVar2.d());
                        k2.k(((dyzy) dyqlVar.a().c()).a);
                        k2.e(currentTimeMillis);
                        k2.j(((dyzy) dyqlVar.a().c()).f);
                        k2.m(((dyzy) dyqlVar.a().c()).g);
                        if (((dyzy) dyqlVar.a().c()).b.g()) {
                            k2.b((String) ((dyzy) dyqlVar.a().c()).b.c());
                        }
                        if (((dyzy) dyqlVar.a().c()).h.g()) {
                            k2.i((dzqf) ((dyzy) dyqlVar.a().c()).h.c());
                        }
                        if (((dyzy) dyqlVar.a().c()).c.g()) {
                            k2.g((String) ((dyzy) dyqlVar.a().c()).c.c());
                            dyht.b(dzpbVar2.f(), new ksp() { // from class: dykv
                                @Override // defpackage.ksp
                                public final void accept(Object obj) {
                                    dzpa.this.f((Bitmap) obj);
                                }
                            });
                            if (!dzpbVar2.g().equals(((dyzy) dyqlVar.a().c()).c)) {
                                k2.h(true);
                            }
                        } else if (((dyzy) dyqlVar.a().c()).d.g() && (length = (bArr = (byte[]) ((dyzy) dyqlVar.a().c()).d.c()).length) > 0) {
                            k2.f(BitmapFactory.decodeByteArray(bArr, 0, length));
                        }
                        emxc emxcVar2 = ((dyzy) dyqlVar.a().c()).i;
                        if (emxcVar2.g()) {
                            k2.d(emxcVar2.c());
                        }
                        dzja dzjaVar2 = dzjaVar;
                        dzpb a3 = k2.a();
                        dyleVar.d(dzjaVar2).aj(a3);
                        return a3;
                    }
                }, erpp.a), new emwl() { // from class: dylb
                    @Override // defpackage.emwl
                    public final Object apply(Object obj) {
                        dzpb dzpbVar2 = (dzpb) obj;
                        if (dzpbVar.g().equals(dzpbVar2.g()) && dzpbVar2.f().g()) {
                            return dzpbVar2;
                        }
                        dyle.this.b(dzjaVar, dzpbVar2);
                        return dzpbVar2;
                    }
                }, erpp.a);
                this.d.put(Pair.create(dzjaVar, dzpgVar), listenableFuture);
            }
        } else {
            listenableFuture = null;
            if (dzpbVar.j() && dzpbVar.g().g()) {
                dyhr.a("LitContactCtrlr", "refetch profile image");
                synchronized (this.j) {
                    listenableFuture = (ListenableFuture) this.e.get(Pair.create(dzjaVar, dzpbVar.d()));
                    if (listenableFuture != null && !listenableFuture.isDone() && !listenableFuture.isCancelled()) {
                        dyhr.a("LitContactCtrlr", "contactSync or contactImageFetch already pending for contact");
                    }
                    listenableFuture = this.h.submit(new Callable() { // from class: dyku
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            dyle dyleVar = dyle.this;
                            dzja dzjaVar2 = dzjaVar;
                            dzpb dzpbVar2 = dzpbVar;
                            dyleVar.b(dzjaVar2, dzpbVar2);
                            return dzpbVar2;
                        }
                    });
                    this.e.put(Pair.create(dzjaVar, dzpbVar.d()), listenableFuture);
                }
            }
        }
        if (listenableFuture != null) {
            this.h.submit(new Runnable() { // from class: dykt
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.lang.Runnable
                public final void run() {
                    dzja dzjaVar2 = dzjaVar;
                    dyle dyleVar = dyle.this;
                    ListenableFuture listenableFuture2 = listenableFuture;
                    dzpg dzpgVar2 = dzpgVar;
                    try {
                        synchronized (dyleVar.b) {
                            dyleVar.d.remove(Pair.create(dzjaVar2, dzpgVar2));
                        }
                    } catch (InterruptedException | ExecutionException e) {
                        dyhr.d("LitContactCtrlr", "Failed to sync contact profile", e);
                    }
                }
            });
        }
        return dzpbVar;
    }

    public final dzwo d(dzja dzjaVar) {
        return this.i.b(dzjaVar);
    }

    public final dzwu e(final dzja dzjaVar, final dzpg dzpgVar, final emxg emxgVar) {
        dyhr.a("LitContactCtrlr", "getContactAndMaybeSync called");
        return dzwn.d(d(dzjaVar).p(dzpgVar), new emwl() { // from class: dyks
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return dyle.this.c(dzjaVar, dzpgVar, (emxc) obj, emxgVar);
            }
        });
    }
}
