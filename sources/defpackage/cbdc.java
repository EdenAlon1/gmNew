package defpackage;

import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cbdc extends dtrs {
    public static final /* synthetic */ int b = 0;
    final /* synthetic */ cbdj a;

    public cbdc(cbdj cbdjVar) {
        this.a = cbdjVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.dtrs
    public final /* synthetic */ void b(dtyq dtyqVar, dtuk dtukVar) {
        ekzz f = eleg.f("MessageAnnotationChangeListener::onChangeInTransaction");
        try {
            btrw btrwVar = (btrw) dtukVar.b();
            if (btrwVar != null) {
                ekzz f2 = eleg.f("MessageAnnotationChangeListener::onChangeInTransaction::insert");
                try {
                    cbcx a = this.a.a(4);
                    try {
                        a.c(1, btrwVar.o());
                        a.b();
                        f2.close();
                        f.close();
                        return;
                    } finally {
                    }
                } finally {
                }
            }
            f.close();
            duaj d = dtukVar.d();
            if (d != null) {
                f = eleg.f("MessageAnnotationChangeListener::onChangeInTransaction::update");
                try {
                    btta b2 = bttf.b();
                    b2.z("MessageAnnotationChangeListener#onChangeInTransaction");
                    b2.d(new Function() { // from class: cbdb
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo448andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            int i = cbdc.b;
                            return ((btsl) obj).a;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    enqv it = d.e.iterator();
                    while (it.hasNext()) {
                        b2.k((bttd) ((duap) it.next()));
                    }
                    cbcx a2 = this.a.a(4);
                    try {
                        btsn btsnVar = (btsn) b2.b().o();
                        while (btsnVar.moveToNext()) {
                            try {
                                a2.c(2, btsnVar.e());
                            } finally {
                            }
                        }
                        btsnVar.close();
                        a2.b();
                        f.close();
                    } finally {
                    }
                } finally {
                }
            }
        } finally {
        }
    }

    @Override // defpackage.dtrs
    public final /* synthetic */ void c(dtyq dtyqVar, dtuk dtukVar) {
        ekzz f = eleg.f("MessageAnnotationChangeListener::preChangeInTransaction");
        try {
            duap e = dtukVar.e();
            if (e != null) {
                ekzz f2 = eleg.f("MessageAnnotationChangeListener::preChangeInTransaction::delete");
                try {
                    btta b2 = bttf.b();
                    b2.z("MessageAnnotationChangeListener#preChangeInTransaction");
                    b2.d(new Function() { // from class: cbda
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo448andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            int i = cbdc.b;
                            return ((btsl) obj).a;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    b2.k((bttd) e);
                    btsz b3 = b2.b();
                    cbcx a = this.a.a(4);
                    try {
                        btsn btsnVar = (btsn) b3.o();
                        while (btsnVar.moveToNext()) {
                            try {
                                a.c(3, btsnVar.e());
                            } finally {
                            }
                        }
                        btsnVar.close();
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
