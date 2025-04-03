package defpackage;

import android.net.Uri;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dxkh implements dxpq {
    public final dxsy a;
    public final dxpw b;
    public final dxod c;
    public final Executor d;
    public final dwqy e;
    private final dxod f;
    private final Uri g;
    private final Uri h;
    private final dxnh i;
    private final efbm j;

    public dxkh(dxsy dxsyVar, dxpw dxpwVar, dxod dxodVar, dxod dxodVar2, Uri uri, Uri uri2, dxnh dxnhVar, efbm efbmVar, Executor executor, dwqy dwqyVar) {
        this.a = dxsyVar;
        this.b = dxpwVar;
        this.c = dxodVar;
        this.f = dxodVar2;
        this.g = uri;
        this.h = uri2;
        this.i = dxnhVar;
        this.j = efbmVar;
        this.d = executor;
        this.e = dwqyVar;
    }

    private static ListenableFuture j() {
        return erqt.h(new IllegalStateException("Migration flag had unexpected state"));
    }

    private final void k(Uri uri) {
        if (this.j.h(uri)) {
            this.j.f(uri);
        }
    }

    @Override // defpackage.dxpq
    public final ListenableFuture a() {
        int ordinal = this.i.a().ordinal();
        return ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? j() : this.f.a() : elfr.k(b(this.b.a()), new eroh() { // from class: dxjq
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                final dxkh dxkhVar = dxkh.this;
                final dxvj dxvjVar = (dxvj) obj;
                return elfr.k(dxkhVar.b(dxkhVar.c.a()), new eroh() { // from class: dxjx
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj2) {
                        return dxkh.this.i(dxvjVar, (dxvj) obj2, 1104);
                    }
                }, dxkhVar.d);
            }
        }, this.d) : this.b.a();
    }

    public final ListenableFuture b(ListenableFuture listenableFuture) {
        return elfr.e(elfr.j(listenableFuture, new emwl() { // from class: dxkd
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return new dxvj(true, obj, null);
            }
        }, this.d), Exception.class, new emwl() { // from class: dxke
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return new dxvj(false, null, (Exception) obj);
            }
        }, this.d);
    }

    @Override // defpackage.dxpq
    public final ListenableFuture c() {
        final Comparator comparator = new Comparator() { // from class: dxkb
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return dxvw.e((dwtt) obj).compareTo(dxvw.e((dwtt) obj2));
            }
        };
        int ordinal = this.i.a().ordinal();
        return ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? j() : this.f.c() : elfr.k(b(this.b.c()), new eroh() { // from class: dxkc
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                final dxkh dxkhVar = dxkh.this;
                final dxvj dxvjVar = (dxvj) obj;
                ListenableFuture b = dxkhVar.b(dxkhVar.c.c());
                final Comparator comparator2 = comparator;
                return elfr.k(b, new eroh() { // from class: dxjw
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj2) {
                        dxvj dxvjVar2 = (dxvj) obj2;
                        dxkh dxkhVar2 = dxkh.this;
                        int n = dxkhVar2.e.n();
                        dxvj dxvjVar3 = dxvjVar;
                        if (dxth.a(n)) {
                            if (dxvj.e(dxvjVar3, dxvjVar2, comparator2)) {
                                dxkhVar2.a.k(1106, n);
                            } else {
                                dxkhVar2.a.k(1103, n);
                            }
                        }
                        if (dxvjVar3.a) {
                            List list = (List) dxvjVar3.a();
                            list.getClass();
                            return erqt.i(list);
                        }
                        Object b2 = dxvjVar3.b();
                        b2.getClass();
                        return erqt.h((Throwable) b2);
                    }
                }, dxkhVar.d);
            }
        }, this.d) : this.b.c();
    }

    @Override // defpackage.dxpq
    public final ListenableFuture d() {
        int ordinal = this.i.a().ordinal();
        try {
            if (ordinal == 1) {
                try {
                    k(this.g);
                    return this.b.d();
                } finally {
                    k(this.h);
                }
            }
            if (ordinal == 2) {
                try {
                    return elfr.k(this.b.d(), new eroh() { // from class: dxjm
                        @Override // defpackage.eroh
                        public final ListenableFuture a(Object obj) {
                            final dxkh dxkhVar = dxkh.this;
                            final Boolean bool = (Boolean) obj;
                            return elfr.k(dxkhVar.b.c(), new eroh() { // from class: dxjs
                                @Override // defpackage.eroh
                                public final ListenableFuture a(Object obj2) {
                                    final List list = (List) obj2;
                                    final ArrayList arrayList = new ArrayList();
                                    Iterator it = list.iterator();
                                    while (true) {
                                        final dxkh dxkhVar2 = dxkh.this;
                                        if (!it.hasNext()) {
                                            final Boolean bool2 = bool;
                                            return dycg.a(arrayList).b(new erog() { // from class: dxkf
                                                @Override // defpackage.erog
                                                public final ListenableFuture a() {
                                                    ListenableFuture i = erqt.i(true);
                                                    int i2 = 0;
                                                    while (true) {
                                                        List list2 = list;
                                                        final dxkh dxkhVar3 = dxkh.this;
                                                        if (i2 >= list2.size()) {
                                                            final Boolean bool3 = bool2;
                                                            return elfr.j(i, new emwl() { // from class: dxju
                                                                @Override // defpackage.emwl
                                                                public final Object apply(Object obj3) {
                                                                    boolean z = false;
                                                                    if (((Boolean) obj3).booleanValue() && bool3.booleanValue()) {
                                                                        z = true;
                                                                    }
                                                                    return Boolean.valueOf(z);
                                                                }
                                                            }, dxkhVar3.d);
                                                        }
                                                        List list3 = arrayList;
                                                        final dwtt dwttVar = (dwtt) list2.get(i2);
                                                        final dwtx dwtxVar = (dwtx) erqt.q((Future) list3.get(i2));
                                                        i = elfr.k(i, new eroh() { // from class: dxjt
                                                            @Override // defpackage.eroh
                                                            public final ListenableFuture a(Object obj3) {
                                                                dxkh dxkhVar4 = dxkh.this;
                                                                final Boolean bool4 = (Boolean) obj3;
                                                                return elfr.j(dxkhVar4.c.h(dwttVar, dwtxVar), new emwl() { // from class: dxjn
                                                                    @Override // defpackage.emwl
                                                                    public final Object apply(Object obj4) {
                                                                        boolean z = false;
                                                                        if (((Boolean) obj4).booleanValue() && bool4.booleanValue()) {
                                                                            z = true;
                                                                        }
                                                                        return Boolean.valueOf(z);
                                                                    }
                                                                }, dxkhVar4.d);
                                                            }
                                                        }, dxkhVar3.d);
                                                        i2++;
                                                    }
                                                }
                                            }, dxkhVar2.d);
                                        }
                                        arrayList.add(dxkhVar2.b.e((dwtt) it.next()));
                                    }
                                }
                            }, dxkhVar.d);
                        }
                    }, this.d);
                } catch (IOException e) {
                    return erqt.h(e);
                }
            }
            if (ordinal != 3) {
                return j();
            }
            try {
                k(this.g);
                return this.f.d();
            } catch (IOException e2) {
                return erqt.h(e2);
            }
        } catch (IOException e3) {
            return erqt.h(e3);
        }
    }

    @Override // defpackage.dxpq
    public final ListenableFuture e(final dwtt dwttVar) {
        int ordinal = this.i.a().ordinal();
        return ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? j() : this.f.e(dwttVar) : elfr.k(b(this.b.e(dwttVar)), new eroh() { // from class: dxjr
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                final dxkh dxkhVar = dxkh.this;
                final dxvj dxvjVar = (dxvj) obj;
                return elfr.k(dxkhVar.b(dxkhVar.c.e(dwttVar)), new eroh() { // from class: dxka
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj2) {
                        return dxkh.this.i(dxvjVar, (dxvj) obj2, 1100);
                    }
                }, dxkhVar.d);
            }
        }, this.d) : this.b.e(dwttVar);
    }

    @Override // defpackage.dxpq
    public final ListenableFuture f(final enip enipVar) {
        int ordinal = this.i.a().ordinal();
        return ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? j() : this.f.f(enipVar) : elfr.k(b(this.b.f(enipVar)), new eroh() { // from class: dxjv
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                final dxkh dxkhVar = dxkh.this;
                final dxvj dxvjVar = (dxvj) obj;
                return elfr.k(dxkhVar.b(dxkhVar.c.f(enipVar)), new eroh() { // from class: dxkg
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj2) {
                        return dxkh.this.i(dxvjVar, (dxvj) obj2, 1100);
                    }
                }, dxkhVar.d);
            }
        }, this.d) : this.b.f(enipVar);
    }

    @Override // defpackage.dxpq
    public final ListenableFuture g(final dwtt dwttVar) {
        int ordinal = this.i.a().ordinal();
        return ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? j() : this.f.g(dwttVar) : elfr.k(b(this.b.g(dwttVar)), new eroh() { // from class: dxjy
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                final dxkh dxkhVar = dxkh.this;
                final dxvj dxvjVar = (dxvj) obj;
                return elfr.k(dxkhVar.b(dxkhVar.c.g(dwttVar)), new eroh() { // from class: dxjp
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj2) {
                        return dxkh.this.i(dxvjVar, (dxvj) obj2, 1102);
                    }
                }, dxkhVar.d);
            }
        }, this.d) : this.b.g(dwttVar);
    }

    @Override // defpackage.dxpq
    public final ListenableFuture h(final dwtt dwttVar, final dwtx dwtxVar) {
        int ordinal = this.i.a().ordinal();
        return ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? j() : this.f.h(dwttVar, dwtxVar) : elfr.k(b(this.b.h(dwttVar, dwtxVar)), new eroh() { // from class: dxjz
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                final dxkh dxkhVar = dxkh.this;
                final dxvj dxvjVar = (dxvj) obj;
                return elfr.k(dxkhVar.b(dxkhVar.c.h(dwttVar, dwtxVar)), new eroh() { // from class: dxjo
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj2) {
                        return dxkh.this.i(dxvjVar, (dxvj) obj2, 1101);
                    }
                }, dxkhVar.d);
            }
        }, this.d) : this.b.h(dwttVar, dwtxVar);
    }

    public final ListenableFuture i(dxvj dxvjVar, dxvj dxvjVar2, int i) {
        int n = this.e.n();
        if (dxth.a(n)) {
            if (dxvjVar.equals(dxvjVar2)) {
                this.a.k(1106, n);
            } else {
                this.a.k(i, n);
            }
        }
        return dxvjVar.a ? erqt.i(dxvjVar.a()) : erqt.h((Throwable) dxvjVar.b());
    }
}
