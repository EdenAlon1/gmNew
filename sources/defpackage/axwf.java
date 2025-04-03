package defpackage;

import android.content.ContentValues;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class axwf {
    public final ffhd a;
    private final dtuu b;
    private final aolr c;

    public axwf(ffhd ffhdVar, dtuu dtuuVar, aolr aolrVar) {
        ffhdVar.getClass();
        dtuuVar.getClass();
        aolrVar.getClass();
        this.a = ffhdVar;
        this.b = dtuuVar;
        this.c = aolrVar;
    }

    @ffbs
    public static final void c(final List list) {
        list.getClass();
        ekzz f = eleg.f("ContactsSyncDataService#deleteContacts");
        try {
            if (((Boolean) axum.l.e()).booleanValue()) {
                Object e = axum.m.e();
                e.getClass();
                List<List> W = ffdx.W(list, ((Number) e).intValue());
                ArrayList arrayList = new ArrayList(ffdx.n(W, 10));
                for (final List list2 : W) {
                    String[] strArr = bqzv.a;
                    bqzl bqzlVar = new bqzl();
                    bqzlVar.f("deleteContactsBlockingDeprecated");
                    bqzlVar.a(new Function() { // from class: axwa
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo448andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            bqzu bqzuVar = (bqzu) obj;
                            bqzuVar.b(list2);
                            return bqzuVar;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    arrayList.add(Integer.valueOf(bqzlVar.d()));
                }
            } else {
                String[] strArr2 = bqzv.a;
                bqzl bqzlVar2 = new bqzl();
                bqzlVar2.f("deleteContactsBlockingDeprecated");
                bqzlVar2.a(new Function() { // from class: axwb
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        bqzu bqzuVar = (bqzu) obj;
                        bqzuVar.b(list);
                        return bqzuVar;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                bqzlVar2.d();
            }
            ffig.a(f, null);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                ffig.a(f, th);
                throw th2;
            }
        }
    }

    public final List a(List list) {
        list.getClass();
        ArrayList<axwi> arrayList = new ArrayList();
        for (Object obj : list) {
            axwi axwiVar = (axwi) obj;
            if (axwj.c(axwiVar)) {
                String str = axwiVar.k;
                if (str == null) {
                    str = axwiVar.j;
                }
                if (!bdrw.c(str)) {
                    arrayList.add(obj);
                }
            }
        }
        ArrayList arrayList2 = new ArrayList(ffdx.n(arrayList, 10));
        for (axwi axwiVar2 : arrayList) {
            aolr aolrVar = this.c;
            String str2 = axwiVar2.k;
            if (str2 == null) {
                str2 = axwiVar2.j;
                str2.getClass();
            }
            aoku n = aolrVar.n(str2);
            String obj2 = n.G().toString();
            String l = n.l();
            String[] strArr = bqzv.a;
            bqxa bqxaVar = new bqxa();
            bqxaVar.g(axwiVar2.a);
            bqxaVar.e(axwiVar2.b);
            bqxaVar.h(obj2);
            bqxaVar.n(l);
            bqxaVar.m(axwiVar2.c);
            bqxaVar.i(axwiVar2.d);
            bqxaVar.k(axwiVar2.h);
            bqxaVar.j(axwiVar2.i);
            bqxaVar.q(axwiVar2.o);
            bqxaVar.s(axwiVar2.p);
            bqxaVar.c(axwiVar2.r);
            bqxaVar.b(axwiVar2.s);
            bqxaVar.l(axwiVar2.t);
            bqxaVar.r(axwiVar2.e);
            bqxaVar.p(axwiVar2.f);
            bqxaVar.o(axwiVar2.g);
            bqxaVar.f(axwiVar2.m);
            bqxaVar.t(axwiVar2.n);
            arrayList2.add(bqxaVar.a());
        }
        return arrayList2;
    }

    public final void b(final List list) {
        ekzz f = eleg.f("ContactsSyncDataService#upsertContactsBlocking");
        try {
            this.b.d("ContactsSyncDataService#upsertContactsBlocking", new Runnable() { // from class: axvz
                @Override // java.lang.Runnable
                public final void run() {
                    for (bqwx bqwxVar : list) {
                        final dtve b = bqzv.b();
                        dtub.b(bqzv.b(), "contacts", bqwxVar, new Function() { // from class: bqwv
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo448andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj) {
                                return Long.valueOf(dtve.this.T("contacts", (ContentValues) obj, 5));
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        }, new Consumer() { // from class: bqww
                            @Override // java.util.function.Consumer
                            /* renamed from: accept */
                            public final void o(Object obj) {
                            }

                            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                return Consumer$CC.$default$andThen(this, consumer);
                            }
                        });
                    }
                }
            });
            ffig.a(f, null);
        } finally {
        }
    }
}
