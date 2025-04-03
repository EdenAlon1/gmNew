package defpackage;

import android.net.Uri;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.IOException;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dxjk implements dxih {
    public final dxnf a;
    public final Executor b;
    private final dxsy c;
    private final dxpt d;
    private final dxnf e;
    private final dxnh f;
    private final Uri g;
    private final Uri h;
    private final efbm i;
    private final dwqy j;

    public dxjk(dxsy dxsyVar, dxpt dxptVar, dxnf dxnfVar, dxnf dxnfVar2, Uri uri, Uri uri2, dxnh dxnhVar, efbm efbmVar, Executor executor, dwqy dwqyVar) {
        this.c = dxsyVar;
        this.d = dxptVar;
        this.e = dxnfVar2;
        this.a = dxnfVar;
        this.g = uri;
        this.h = uri2;
        this.f = dxnhVar;
        this.i = efbmVar;
        this.b = executor;
        this.j = dwqyVar;
    }

    private static ListenableFuture q() {
        return erqt.h(new IllegalStateException("Migration flag had unexpected state"));
    }

    private final void r(Uri uri) {
        if (this.i.h(uri)) {
            this.i.f(uri);
        }
    }

    @Override // defpackage.dxih
    public final ListenableFuture a(final dwso dwsoVar) {
        int ordinal = this.f.a().ordinal();
        return ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? q() : this.e.a(dwsoVar) : elfr.k(n(this.d.a(dwsoVar)), new eroh() { // from class: dxjh
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                final dxjk dxjkVar = dxjk.this;
                final dxvj dxvjVar = (dxvj) obj;
                return elfr.k(dxjkVar.n(dxjkVar.a.a(dwsoVar)), new eroh() { // from class: dxim
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj2) {
                        return dxjk.this.o(dxvjVar, (dxvj) obj2, 1096);
                    }
                }, dxjkVar.b);
            }
        }, this.b) : this.d.a(dwsoVar);
    }

    @Override // defpackage.dxih
    public final ListenableFuture b() {
        int ordinal = this.f.a().ordinal();
        return ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? q() : this.e.b() : elfr.k(n(this.d.b()), new eroh() { // from class: dxiq
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                final dxjk dxjkVar = dxjk.this;
                final dxvj dxvjVar = (dxvj) obj;
                return elfr.k(dxjkVar.n(dxjkVar.a.b()), new eroh() { // from class: dxiy
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj2) {
                        return dxjk.this.o(dxvjVar, (dxvj) obj2, 1099);
                    }
                }, dxjkVar.b);
            }
        }, this.b) : this.d.b();
    }

    @Override // defpackage.dxih
    public final ListenableFuture c() {
        final Comparator comparator = new Comparator() { // from class: dxjj
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return dxvw.e(((dxqb) obj).b()).compareTo(dxvw.e(((dxqb) obj2).b()));
            }
        };
        int ordinal = this.f.a().ordinal();
        return ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? q() : this.e.c() : elfr.k(n(this.d.c()), new eroh() { // from class: dxij
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                final dxjk dxjkVar = dxjk.this;
                final dxvj dxvjVar = (dxvj) obj;
                ListenableFuture n = dxjkVar.n(dxjkVar.a.c());
                final Comparator comparator2 = comparator;
                return elfr.k(n, new eroh() { // from class: dxix
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj2) {
                        return dxjk.this.p(dxvjVar, (dxvj) obj2, comparator2, 1093);
                    }
                }, dxjkVar.b);
            }
        }, this.b) : this.d.c();
    }

    @Override // defpackage.dxih
    public final ListenableFuture d() {
        final Comparator comparator = new Comparator() { // from class: dxit
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return dxvw.e((dwtm) obj).compareTo(dxvw.e((dwtm) obj2));
            }
        };
        int ordinal = this.f.a().ordinal();
        return ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? q() : this.e.d() : elfr.k(n(this.d.d()), new eroh() { // from class: dxjc
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                final dxjk dxjkVar = dxjk.this;
                final dxvj dxvjVar = (dxvj) obj;
                ListenableFuture n = dxjkVar.n(dxjkVar.a.d());
                final Comparator comparator2 = comparator;
                return elfr.k(n, new eroh() { // from class: dxjb
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj2) {
                        return dxjk.this.p(dxvjVar, (dxvj) obj2, comparator2, 1092);
                    }
                }, dxjkVar.b);
            }
        }, this.b) : this.d.d();
    }

    @Override // defpackage.dxih
    public final ListenableFuture e() {
        int ordinal = this.f.a().ordinal();
        return ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? q() : this.e.e() : elfr.k(n(this.d.e()), new eroh() { // from class: dxjg
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                final dxjk dxjkVar = dxjk.this;
                final dxvj dxvjVar = (dxvj) obj;
                return elfr.k(dxjkVar.n(dxjkVar.a.e()), new eroh() { // from class: dxio
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj2) {
                        return dxjk.this.o(dxvjVar, (dxvj) obj2, 1095);
                    }
                }, dxjkVar.b);
            }
        }, this.b) : this.d.e();
    }

    @Override // defpackage.dxih
    public final ListenableFuture f() {
        int ordinal = this.f.a().ordinal();
        if (ordinal == 1) {
            try {
                try {
                    r(this.g);
                    r(this.h);
                    return erre.a;
                } catch (Throwable th) {
                    r(this.h);
                    throw th;
                }
            } catch (IOException e) {
                return erqt.h(e);
            }
        }
        if (ordinal == 2) {
            try {
                r(this.h);
                return erre.a;
            } catch (IOException e2) {
                return erqt.h(e2);
            }
        }
        if (ordinal != 3) {
            return q();
        }
        try {
            r(this.g);
            return erre.a;
        } catch (IOException e3) {
            return erqt.h(e3);
        }
    }

    @Override // defpackage.dxih
    public final ListenableFuture g(final dwtm dwtmVar) {
        int ordinal = this.f.a().ordinal();
        return ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? q() : this.e.g(dwtmVar) : elfr.k(n(this.d.g(dwtmVar)), new eroh() { // from class: dxjf
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                final dxjk dxjkVar = dxjk.this;
                final dxvj dxvjVar = (dxvj) obj;
                return elfr.k(dxjkVar.n(dxjkVar.a.g(dwtmVar)), new eroh() { // from class: dxii
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj2) {
                        return dxjk.this.o(dxvjVar, (dxvj) obj2, 1087);
                    }
                }, dxjkVar.b);
            }
        }, this.b) : this.d.g(dwtmVar);
    }

    @Override // defpackage.dxih
    public final ListenableFuture h(final dwtm dwtmVar) {
        int ordinal = this.f.a().ordinal();
        return ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? q() : this.e.h(dwtmVar) : elfr.k(n(this.d.h(dwtmVar)), new eroh() { // from class: dxiu
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                final dxjk dxjkVar = dxjk.this;
                final dxvj dxvjVar = (dxvj) obj;
                return elfr.k(dxjkVar.n(dxjkVar.a.h(dwtmVar)), new eroh() { // from class: dxji
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj2) {
                        return dxjk.this.o(dxvjVar, (dxvj) obj2, 1090);
                    }
                }, dxjkVar.b);
            }
        }, this.b) : this.d.h(dwtmVar);
    }

    @Override // defpackage.dxih
    public final ListenableFuture i(final dwtm dwtmVar) {
        int ordinal = this.f.a().ordinal();
        return ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? q() : this.e.i(dwtmVar) : elfr.k(n(this.d.i(dwtmVar)), new eroh() { // from class: dxis
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                final dxjk dxjkVar = dxjk.this;
                final dxvj dxvjVar = (dxvj) obj;
                return elfr.k(dxjkVar.n(dxjkVar.a.i(dwtmVar)), new eroh() { // from class: dxje
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj2) {
                        return dxjk.this.o(dxvjVar, (dxvj) obj2, 1089);
                    }
                }, dxjkVar.b);
            }
        }, this.b) : this.d.i(dwtmVar);
    }

    @Override // defpackage.dxih
    public final ListenableFuture j(final List list) {
        int ordinal = this.f.a().ordinal();
        return ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? q() : this.e.j(list) : elfr.k(n(this.d.j(list)), new eroh() { // from class: dxjd
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                final dxjk dxjkVar = dxjk.this;
                final dxvj dxvjVar = (dxvj) obj;
                return elfr.k(dxjkVar.n(dxjkVar.a.j(list)), new eroh() { // from class: dxik
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj2) {
                        return dxjk.this.o(dxvjVar, (dxvj) obj2, 1094);
                    }
                }, dxjkVar.b);
            }
        }, this.b) : this.d.j(list);
    }

    @Override // defpackage.dxih
    public final ListenableFuture k() {
        int ordinal = this.f.a().ordinal();
        return ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? q() : this.e.k() : elfr.k(n(this.d.k()), new eroh() { // from class: dxiz
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                final dxjk dxjkVar = dxjk.this;
                final dxvj dxvjVar = (dxvj) obj;
                return elfr.k(dxjkVar.n(dxjkVar.a.k()), new eroh() { // from class: dxil
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj2) {
                        return dxjk.this.o(dxvjVar, (dxvj) obj2, 1098);
                    }
                }, dxjkVar.b);
            }
        }, this.b) : this.d.k();
    }

    @Override // defpackage.dxih
    public final ListenableFuture l(final dwtm dwtmVar, final dwso dwsoVar) {
        int ordinal = this.f.a().ordinal();
        return ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? q() : this.e.l(dwtmVar, dwsoVar) : elfr.k(n(this.d.l(dwtmVar, dwsoVar)), new eroh() { // from class: dxja
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                final dxjk dxjkVar = dxjk.this;
                final dxvj dxvjVar = (dxvj) obj;
                return elfr.k(dxjkVar.n(dxjkVar.a.l(dwtmVar, dwsoVar)), new eroh() { // from class: dxip
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj2) {
                        return dxjk.this.o(dxvjVar, (dxvj) obj2, 1088);
                    }
                }, dxjkVar.b);
            }
        }, this.b) : this.d.l(dwtmVar, dwsoVar);
    }

    @Override // defpackage.dxih
    public final ListenableFuture m(final List list) {
        int ordinal = this.f.a().ordinal();
        return ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? q() : this.e.m(list) : elfr.k(n(this.d.m(list)), new eroh() { // from class: dxin
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                final dxjk dxjkVar = dxjk.this;
                final dxvj dxvjVar = (dxvj) obj;
                return elfr.k(dxjkVar.n(dxjkVar.a.m(list)), new eroh() { // from class: dxir
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj2) {
                        return dxjk.this.o(dxvjVar, (dxvj) obj2, 1097);
                    }
                }, dxjkVar.b);
            }
        }, this.b) : this.d.m(list);
    }

    public final ListenableFuture n(ListenableFuture listenableFuture) {
        return elfr.e(elfr.j(listenableFuture, new emwl() { // from class: dxiv
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return new dxvj(true, obj, null);
            }
        }, this.b), Exception.class, new emwl() { // from class: dxiw
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return new dxvj(false, null, (Exception) obj);
            }
        }, this.b);
    }

    public final ListenableFuture o(dxvj dxvjVar, dxvj dxvjVar2, int i) {
        int n = this.j.n();
        if (dxth.a(n)) {
            if (dxvjVar.equals(dxvjVar2)) {
                this.c.k(1107, n);
            } else {
                this.c.k(i, n);
            }
        }
        return dxvjVar.a ? erqt.i(dxvjVar.a()) : erqt.h((Throwable) dxvjVar.b());
    }

    public final ListenableFuture p(dxvj dxvjVar, dxvj dxvjVar2, Comparator comparator, int i) {
        int n = this.j.n();
        if (dxth.a(n)) {
            if (dxvj.e(dxvjVar, dxvjVar2, comparator)) {
                this.c.k(1106, n);
            } else {
                this.c.k(i, n);
            }
        }
        if (dxvjVar.a) {
            List list = (List) dxvjVar.a();
            list.getClass();
            return erqt.i(list);
        }
        Object b = dxvjVar.b();
        b.getClass();
        return erqt.h((Throwable) b);
    }
}
