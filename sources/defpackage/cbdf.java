package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cbdf extends dtrs {
    public static final /* synthetic */ int b = 0;
    final /* synthetic */ cbdj a;

    public cbdf(cbdj cbdjVar) {
        this.a = cbdjVar;
    }

    @Override // defpackage.dtrs
    public final /* synthetic */ void b(dtyq dtyqVar, dtuk dtukVar) {
        ekzz f = eleg.f("MessageChangeListener::onChangeInTransaction");
        try {
            MessagesTable.BindData bindData = (MessagesTable.BindData) dtukVar.b();
            if (bindData != null) {
                ekzz f2 = eleg.f("MessageChangeListener::insert");
                try {
                    cbcx a = this.a.a(1);
                    try {
                        a.c(1, bindData.D().b());
                        a.b();
                        f2.close();
                    } finally {
                    }
                } finally {
                }
            }
            f.close();
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.dtrs
    public final /* synthetic */ void c(dtyq dtyqVar, dtuk dtukVar) {
        ekzz f;
        cbcx a;
        buuo buuoVar;
        ekzz f2 = eleg.f("MessageChangeListener::preChangeInTransaction");
        try {
            duap e = dtukVar.e();
            if (e != null) {
                f = eleg.f("MessageChangeListener::preChangeInTransaction::delete");
                try {
                    buxo d = MessagesTable.d();
                    d.z("TableChangeObserver#preChangeInTransaction-messages1");
                    d.f(new Function() { // from class: cbdd
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo448andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            int i = cbdf.b;
                            return ((buum) obj).a;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    d.k((buxs) e);
                    buxm b2 = d.b();
                    a = this.a.a(1);
                    try {
                        buuoVar = (buuo) b2.o();
                        while (buuoVar.moveToNext()) {
                            try {
                                a.c(3, buuoVar.q().b());
                            } finally {
                            }
                        }
                        buuoVar.close();
                        a.b();
                        f.close();
                    } finally {
                    }
                } finally {
                }
            } else {
                duaj d2 = dtukVar.d();
                if (d2 != null) {
                    f = eleg.f("MessageChangeListener::preChangeInTransaction::update");
                    try {
                        buxo d3 = MessagesTable.d();
                        d3.z("TableChangeObserver#preChangeInTransaction-messages2");
                        d3.f(new Function() { // from class: cbde
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo448andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj) {
                                int i = cbdf.b;
                                return ((buum) obj).a;
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        });
                        enqv it = d2.e.iterator();
                        while (it.hasNext()) {
                            d3.k((buxs) ((duap) it.next()));
                        }
                        a = this.a.a(1);
                        try {
                            buuoVar = (buuo) d3.b().o();
                            while (buuoVar.moveToNext()) {
                                try {
                                    a.c(2, buuoVar.q().b());
                                } finally {
                                    try {
                                        buuoVar.close();
                                    } catch (Throwable th) {
                                        th.addSuppressed(th);
                                    }
                                }
                            }
                            buuoVar.close();
                            a.b();
                            f.close();
                        } finally {
                            try {
                                a.b();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                        }
                    } finally {
                    }
                }
            }
            f2.close();
        } catch (Throwable th3) {
            try {
                f2.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }
}
