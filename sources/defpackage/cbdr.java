package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.VmtTable;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cbdr extends dtrs {
    public static final /* synthetic */ int b = 0;
    final /* synthetic */ cbds a;

    public cbdr(cbds cbdsVar) {
        this.a = cbdsVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.dtrs
    public final /* synthetic */ void b(dtyq dtyqVar, dtuk dtukVar) {
        Object apply;
        duaj d = dtukVar.d();
        if (d != null) {
            ekzz f = eleg.f("TranscriptionChangeListener::onChangeInTransaction::update");
            try {
                String[] strArr = VmtTable.a;
                byyg byygVar = new byyg(VmtTable.a);
                byygVar.z("VmtTableChangeObserver#onChangeInTransaction-transcriptions2");
                apply = new Function() { // from class: cbdp
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        int i = cbdr.b;
                        return ((byxv) obj).a;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }.apply(VmtTable.c);
                byygVar.c((byxw) apply);
                byygVar.e(new Function() { // from class: cbdq
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        byyk byykVar = (byyk) obj;
                        int i = cbdr.b;
                        byykVar.c(ardn.VMT_STATUS_COMPLETE);
                        return byykVar;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                enqv it = d.e.iterator();
                while (it.hasNext()) {
                    byygVar.k((byyj) ((duap) it.next()));
                }
                cbdo cbdoVar = new cbdo(this.a.a);
                try {
                    byxx byxxVar = (byxx) byygVar.b().o();
                    while (byxxVar.moveToNext()) {
                        try {
                            String c = byxxVar.c();
                            ensk o = cbdoVar.a.o();
                            o.Y(new ensn("operation", String.class, false, false), "UPDATE");
                            o.Y(new ensn("table_type", Integer.class, false, false), 11);
                            o.Y(new ensn("item_id", String.class, false, false), c);
                            ((ensz) o.h("com/google/android/apps/messaging/shared/datamodel/observer/VmtTableContentChangeObserver$ClosableBatchScheduler", "queue", 165, "VmtTableContentChangeObserver.java")).q("Voice transcriptions change in transaction is observed. Queues work item.");
                            cbdoVar.b.add(c);
                            if (cbdoVar.b.size() >= ((Integer) cbcl.a.e()).intValue()) {
                                cbdoVar.a();
                            }
                        } finally {
                        }
                    }
                    byxxVar.close();
                    cbdoVar.a();
                    f.close();
                } finally {
                }
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

    @Override // defpackage.dtrs
    public final /* bridge */ /* synthetic */ void c(dtyq dtyqVar, dtuk dtukVar) {
    }
}
