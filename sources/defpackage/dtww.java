package defpackage;

import j$.util.DesugarCollections;
import java.util.List;
import java.util.Map;
import java.util.function.Supplier;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dtww implements dtwf {
    final /* synthetic */ dtve a;
    final /* synthetic */ engw b;
    final /* synthetic */ dtuk c;

    public dtww(dtve dtveVar, engw engwVar, dtuk dtukVar) {
        this.a = dtveVar;
        this.b = engwVar;
        this.c = dtukVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.dtwf
    public final void a(boolean z) {
        int i;
        int i2 = 0;
        while (true) {
            engw engwVar = this.b;
            if (i2 >= ((enou) engwVar).c) {
                return;
            }
            engw engwVar2 = (engw) engwVar.get(i2);
            int size = engwVar2.size();
            int i3 = 0;
            while (true) {
                i = i2 + 1;
                if (i3 < size) {
                    dtyk dtykVar = (dtyk) engwVar2.get(i3);
                    if (z) {
                        final dtuk dtukVar = this.c;
                        dtve dtveVar = this.a;
                        final dtyq c = dtykVar.c();
                        List d = dtykVar.d();
                        final dtrs b = dtykVar.b();
                        final List unmodifiableList = DesugarCollections.unmodifiableList(d);
                        dtyq.E(new Supplier() { // from class: dtxr
                            @Override // java.util.function.Supplier
                            public final Object get() {
                                dtrs dtrsVar = dtrs.this;
                                try {
                                    dtrsVar.e(c, dtukVar, enjk.j(unmodifiableList));
                                    return null;
                                } catch (Throwable th) {
                                    ((enrr) ((enrr) dtyq.c.a(Level.SEVERE).g(th)).h("com/google/android/libraries/databaseannotations/support/QueryBase", "notifyPost", 983, "QueryBase.java")).t("got exception invoking onChangeInTransactionWithObject on %s", dtrsVar);
                                    throw th;
                                }
                            }
                        });
                        enrr enrrVar = (enrr) dtyq.c.a(dtyq.d).h("com/google/android/libraries/databaseannotations/support/QueryBase", "notifyPost", 989, "QueryBase.java");
                        dtrj dtrjVar = (dtrj) c.e;
                        enrrVar.J("onChangeInTransactionWithObject: table: %s; loggingTag: %s; listener: %s", dtyq.Z(dtrjVar.a), String.valueOf(dtrjVar.t), b.getClass().getName());
                        String valueOf = String.valueOf(b.i);
                        dtveVar.F(valueOf, new Runnable() { // from class: dtxs
                            @Override // java.lang.Runnable
                            public final void run() {
                                ((Map) dtyq.a.get()).remove(dtrs.this);
                            }
                        });
                        dtveVar.F(valueOf, new Runnable() { // from class: dtxt
                            @Override // java.lang.Runnable
                            public final void run() {
                                final dtyq dtyqVar = dtyq.this;
                                final dtrs dtrsVar = b;
                                dtyq.E(new Supplier() { // from class: dtxk
                                    @Override // java.util.function.Supplier
                                    public final Object get() {
                                        enrr enrrVar2 = (enrr) dtyq.c.a(dtyq.d).h("com/google/android/libraries/databaseannotations/support/QueryBase", "invokeInTransactionAndPostTransaction", 1009, "QueryBase.java");
                                        dtyq dtyqVar2 = dtyq.this;
                                        String str = ((dtrj) dtyqVar2.e).a;
                                        dtrs dtrsVar2 = dtrsVar;
                                        enrrVar2.B("onChangeAfterTransactionWithObject: table: %s; cl: %s", dtyq.Z(str), dtrsVar2.i);
                                        try {
                                            dtrsVar2.gb(dtyqVar2);
                                            return null;
                                        } catch (Throwable th) {
                                            ((enrr) ((enrr) dtyq.c.a(Level.SEVERE).g(th)).h("com/google/android/libraries/databaseannotations/support/QueryBase", "invokeInTransactionAndPostTransaction", 1016, "QueryBase.java")).t("got exception invoking onChangeAfterTransactionWithObject on %s", dtrsVar2);
                                            return null;
                                        }
                                    }
                                });
                            }
                        });
                    } else {
                        dtykVar.d().set(dtykVar.a(), null);
                    }
                    i3++;
                }
            }
            i2 = i;
        }
    }
}
