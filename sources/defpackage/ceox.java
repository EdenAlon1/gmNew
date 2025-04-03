package defpackage;

import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import j$.util.function.Function$CC;
import java.util.Map;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ceox extends cpdo {
    final /* synthetic */ ffbr a;
    final /* synthetic */ ffbr b;
    final /* synthetic */ ffbr c;
    final /* synthetic */ ffbr d;
    final /* synthetic */ ffbr e;
    final /* synthetic */ errl f;

    public ceox(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, errl errlVar) {
        this.a = ffbrVar;
        this.b = ffbrVar2;
        this.c = ffbrVar3;
        this.d = ffbrVar4;
        this.e = ffbrVar5;
        this.f = errlVar;
    }

    @Override // defpackage.cqor
    public final ekzz a() {
        return eleg.f("GwqWorkerStartupTask");
    }

    @Override // defpackage.cpdo
    public final elfl b() {
        final ffbr ffbrVar = this.a;
        final ffbr ffbrVar2 = this.b;
        final ffbr ffbrVar3 = this.c;
        final ffbr ffbrVar4 = this.d;
        final ffbr ffbrVar5 = this.e;
        return elfo.f(new Runnable() { // from class: ceow
            @Override // java.lang.Runnable
            public final void run() {
                Object apply;
                ffbr ffbrVar6 = ffbr.this;
                cbze cbzeVar = (cbze) ffbrVar6.b();
                ekzz f = eleg.f("WorkerDatabaseOperations#clearAllInFlightWorkItems");
                try {
                    csix.h();
                    cbzeVar.d.e();
                    f.close();
                    final int a = bbex.a();
                    ekzz f2 = eleg.f("WorkerDatabaseOperations#decrementRetryCountOfMaxRetriedBackupWork");
                    try {
                        efbd.b();
                        String[] strArr = btki.a;
                        btkf btkfVar = new btkf();
                        btkfVar.ap("decrementRetryCountOfMaxRetriedBackupWork");
                        btkfVar.a.put("retry_count", Integer.valueOf(a - 1));
                        btkfVar.d(new Function() { // from class: cbza
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo448andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj) {
                                btkh btkhVar = (btkh) obj;
                                cskc cskcVar = cbze.a;
                                btkhVar.k(32, 64, 128);
                                btkhVar.g(a);
                                return btkhVar;
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        });
                        btkfVar.a().e();
                        ffbr ffbrVar7 = ffbrVar3;
                        ffbr ffbrVar8 = ffbrVar2;
                        f2.close();
                        ((ceos) ffbrVar8.b()).a.set(new ceov(ffbrVar7));
                        if (((Boolean) cbdj.a.e()).booleanValue()) {
                            cbdj cbdjVar = (cbdj) ffbrVar4.b();
                            if (cbdjVar.d.compareAndSet(false, true)) {
                                ((ensz) ((ensz) cbdj.b.h()).h("com/google/android/apps/messaging/shared/datamodel/observer/TableContentChangeObserver", ConversationSuggestion.SUGGESTION_PROPERTY_CALENDAR_START_TIME, 129, "TableContentChangeObserver.java")).q("Starts to observe table change.");
                                ((buxm) cbdjVar.e.get()).L(new cbdf(cbdjVar));
                                ((bsnz) cbdjVar.f.get()).L(new cbcz(cbdjVar));
                                ((bvvl) cbdjVar.g.get()).L(new cbdi(cbdjVar));
                                ((btsz) cbdjVar.h.get()).L(new cbdc(cbdjVar));
                            } else {
                                ((ensz) ((ensz) cbdj.b.j()).h("com/google/android/apps/messaging/shared/datamodel/observer/TableContentChangeObserver", ConversationSuggestion.SUGGESTION_PROPERTY_CALENDAR_START_TIME, 126, "TableContentChangeObserver.java")).q("Already started table content change observer.");
                            }
                        }
                        ((bafi) ffbrVar7.b()).b().G(Action.r);
                        final int a2 = bbex.a();
                        f2 = eleg.f("WorkerDatabaseOperations#getNbrOfWorkItemsExceedingMaxRetry");
                        try {
                            csix.h();
                            cmh cmhVar = new cmh();
                            btkd a3 = btki.a();
                            a3.z("getNbrOfWorkItemsExceedingMaxRetry");
                            apply = new Function() { // from class: cbyr
                                @Override // java.util.function.Function
                                /* renamed from: andThen */
                                public final /* synthetic */ Function mo448andThen(Function function) {
                                    return Function$CC.$default$andThen(this, function);
                                }

                                @Override // java.util.function.Function
                                public final Object apply(Object obj) {
                                    cskc cskcVar = cbze.a;
                                    return ((btjh) obj).b;
                                }

                                public final /* synthetic */ Function compose(Function function) {
                                    return Function$CC.$default$compose(this, function);
                                }
                            }.apply(btki.c);
                            btji[] btjiVarArr = {(btji) apply};
                            int intValue = btki.c().intValue();
                            if (((Integer) btki.b.getOrDefault(btjiVarArr[0].toString(), -1)).intValue() > intValue) {
                                dtub.w("columnReference.toString()", intValue);
                            }
                            a3.m(btjiVarArr);
                            a3.n(new dtzr("COUNT(*)"), "row_count_expression");
                            a3.d(new Function() { // from class: cbys
                                @Override // java.util.function.Function
                                /* renamed from: andThen */
                                public final /* synthetic */ Function mo448andThen(Function function) {
                                    return Function$CC.$default$andThen(this, function);
                                }

                                @Override // java.util.function.Function
                                public final Object apply(Object obj) {
                                    btkh btkhVar = (btkh) obj;
                                    cskc cskcVar = cbze.a;
                                    btkhVar.g(a2);
                                    return btkhVar;
                                }

                                public final /* synthetic */ Function compose(Function function) {
                                    return Function$CC.$default$compose(this, function);
                                }
                            });
                            a3.v(btki.c.b);
                            btjj btjjVar = (btjj) a3.b().o();
                            while (btjjVar.moveToNext()) {
                                try {
                                    cmhVar.put(Integer.valueOf(btjjVar.c()), Integer.valueOf(Integer.parseInt(btjjVar.dd("row_count_expression"))));
                                } finally {
                                }
                            }
                            btjjVar.close();
                            f2.close();
                            for (Map.Entry entry : cmhVar.entrySet()) {
                                ffbr ffbrVar9 = ffbrVar5;
                                if ((((Integer) entry.getKey()).intValue() & 1) == 1) {
                                    ((akzt) ffbrVar9.b()).d("Bugle.GW.Icing.Indexing.Failed", ((Integer) entry.getValue()).intValue());
                                } else if ((((Integer) entry.getKey()).intValue() & 2) == 2) {
                                    ((akzt) ffbrVar9.b()).d("Bugle.GW.Run.All.Annotator.Failed", ((Integer) entry.getValue()).intValue());
                                } else if ((((Integer) entry.getKey()).intValue() & 4) == 4) {
                                    ((akzt) ffbrVar9.b()).d("Bugle.GW.Address.Annotation.Post.Process.Failed", ((Integer) entry.getValue()).intValue());
                                } else if ((((Integer) entry.getKey()).intValue() & 8) == 8) {
                                    ((akzt) ffbrVar9.b()).d("Bugle.GW.Link.Annotation.Post.Process.Failed", ((Integer) entry.getValue()).intValue());
                                } else if ((((Integer) entry.getKey()).intValue() & 16) == 16) {
                                    ((akzt) ffbrVar9.b()).d("Bugle.GW.RCS.Flags.Worker.Failed", ((Integer) entry.getValue()).intValue());
                                } else {
                                    ((akzt) ffbrVar9.b()).d("Bugle.GW.Unknown.Worker.Failed", ((Integer) entry.getValue()).intValue());
                                }
                            }
                        } finally {
                        }
                    } finally {
                    }
                } finally {
                    try {
                        f.close();
                    } catch (Throwable th) {
                        th.addSuppressed(th);
                    }
                }
            }
        }, this.f);
    }

    @Override // defpackage.cpeh
    public final boolean c() {
        return true;
    }
}
