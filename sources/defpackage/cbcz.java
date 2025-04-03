package defpackage;

import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cbcz extends dtrs {
    public static final /* synthetic */ int b = 0;
    final /* synthetic */ cbdj a;

    public cbcz(cbdj cbdjVar) {
        this.a = cbdjVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.dtrs
    public final /* synthetic */ void b(dtyq dtyqVar, dtuk dtukVar) {
        ekzz f = eleg.f("ConversationChangeListener::onChangeInTransaction");
        try {
            duaj d = dtukVar.d();
            if (d != null) {
                ekzz f2 = eleg.f("ConversationChangeListener::onChangeInTransaction::update");
                try {
                    bsob e = bsom.e();
                    e.z("ConversationChangeListener#onChangeInTransaction");
                    enqv it = d.e.iterator();
                    while (it.hasNext()) {
                        e.k((bsof) ((duap) it.next()));
                    }
                    cbcx a = this.a.a(2);
                    try {
                        e.d();
                        bskr bskrVar = (bskr) e.b().o();
                        while (bskrVar.moveToNext()) {
                            try {
                                a.c(2, bskrVar.h().a());
                            } finally {
                            }
                        }
                        bskrVar.close();
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

    @Override // defpackage.dtrs
    public final /* synthetic */ void c(dtyq dtyqVar, dtuk dtukVar) {
        ekzz f = eleg.f("ConversationChangeListener::preChangeInTransaction");
        try {
            duap e = dtukVar.e();
            if (e != null) {
                ekzz f2 = eleg.f("ConversationChangeListener::preChangeInTransaction::delete");
                try {
                    bsob e2 = bsom.e();
                    e2.z("ConversationChangeListener#preChangeInTransaction");
                    e2.d();
                    e2.g(new Function() { // from class: cbcy
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo448andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            int i = cbcz.b;
                            return ((bskp) obj).a;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    e2.k((bsof) e);
                    bsnz b2 = e2.b();
                    cbcx a = this.a.a(2);
                    try {
                        bskr bskrVar = (bskr) b2.o();
                        while (bskrVar.moveToNext()) {
                            try {
                                a.c(3, bskrVar.h().a());
                            } finally {
                            }
                        }
                        bskrVar.close();
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
