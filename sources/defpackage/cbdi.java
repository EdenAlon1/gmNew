package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cbdi extends dtrs {
    public static final /* synthetic */ int b = 0;
    final /* synthetic */ cbdj a;

    public cbdi(cbdj cbdjVar) {
        this.a = cbdjVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.dtrs
    public final /* synthetic */ void b(dtyq dtyqVar, dtuk dtukVar) {
        ekzz f;
        cbcx a;
        ekzz f2 = eleg.f("ParticipantChangeListener::onChangeInTransaction");
        try {
            ParticipantsTable.BindData bindData = (ParticipantsTable.BindData) dtukVar.b();
            if (bindData != null) {
                f = eleg.f("ParticipantChangeListener::onChangeInTransaction::insert");
                try {
                    a = this.a.a(3);
                    try {
                        a.c(1, bindData.S());
                        a.b();
                        f.close();
                    } finally {
                    }
                } finally {
                }
            } else {
                duaj d = dtukVar.d();
                if (d != null) {
                    f = eleg.f("ParticipantChangeListener::onChangeInTransaction::update");
                    try {
                        bvvn e = ParticipantsTable.e();
                        e.z("ParticipantChangeListener#onChangeInTransaction");
                        e.f(new Function() { // from class: cbdg
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo448andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj) {
                                int i = cbdi.b;
                                return ((bvtg) obj).a;
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        });
                        enqv it = d.e.iterator();
                        while (it.hasNext()) {
                            e.k((bvvs) ((duap) it.next()));
                        }
                        a = this.a.a(3);
                        try {
                            bvti bvtiVar = (bvti) e.b().o();
                            while (bvtiVar.moveToNext()) {
                                try {
                                    a.c(2, bvtiVar.p());
                                } finally {
                                }
                            }
                            bvtiVar.close();
                            a.b();
                            f.close();
                        } finally {
                            try {
                                a.b();
                            } catch (Throwable th) {
                                th.addSuppressed(th);
                            }
                        }
                    } finally {
                    }
                }
            }
            f2.close();
        } catch (Throwable th2) {
            try {
                f2.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    @Override // defpackage.dtrs
    public final /* synthetic */ void c(dtyq dtyqVar, dtuk dtukVar) {
        ekzz f = eleg.f("ParticipantChangeListener::preChangeInTransaction");
        try {
            duap e = dtukVar.e();
            if (e != null) {
                ekzz f2 = eleg.f("ParticipantChangeListener::preChangeInTransaction::delete");
                try {
                    bvvn e2 = ParticipantsTable.e();
                    e2.z("ParticipantChangeListener#preChangeInTransaction");
                    e2.f(new Function() { // from class: cbdh
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo448andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            int i = cbdi.b;
                            return ((bvtg) obj).a;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    e2.k((bvvs) e);
                    bvvl b2 = e2.b();
                    cbcx a = this.a.a(3);
                    try {
                        bvti bvtiVar = (bvti) b2.o();
                        while (bvtiVar.moveToNext()) {
                            try {
                                a.c(3, bvtiVar.p());
                            } finally {
                            }
                        }
                        bvtiVar.close();
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
}
