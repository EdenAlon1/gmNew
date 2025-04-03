package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vez implements ejxi {
    final /* synthetic */ vfa a;

    public vez(vfa vfaVar) {
        this.a = vfaVar;
    }

    @Override // defpackage.ejxi
    public final /* synthetic */ ejuj a() {
        return vfa.a;
    }

    @Override // defpackage.ejxi
    public final /* bridge */ /* synthetic */ ListenableFuture b() {
        return elfo.h(new erog() { // from class: vex
            @Override // defpackage.erog
            public final ListenableFuture a() {
                vez vezVar = vez.this;
                if (((ves) vezVar.a.c.l()).c) {
                    return elfo.e(Boolean.valueOf(!r1.e));
                }
                return vezVar.a.c.j(new emwl() { // from class: vev
                    @Override // defpackage.emwl
                    public final Object apply(Object obj) {
                        Object apply;
                        boolean z;
                        ejui ejuiVar = vfa.a;
                        if (((Boolean) ((cfup) veq.a.get()).e()).booleanValue()) {
                            buxo d = MessagesTable.d();
                            d.z("outgoingReactionsPresentNew");
                            d.f(new Function() { // from class: vem
                                @Override // java.util.function.Function
                                /* renamed from: andThen */
                                public final /* synthetic */ Function mo448andThen(Function function) {
                                    return Function$CC.$default$andThen(this, function);
                                }

                                @Override // java.util.function.Function
                                public final Object apply(Object obj2) {
                                    int i = veq.b;
                                    return ((buum) obj2).a;
                                }

                                public final /* synthetic */ Function compose(Function function) {
                                    return Function$CC.$default$compose(this, function);
                                }
                            });
                            d.v(MessagesTable.c.a);
                            d.h(new Function() { // from class: ven
                                @Override // java.util.function.Function
                                /* renamed from: andThen */
                                public final /* synthetic */ Function mo448andThen(Function function) {
                                    return Function$CC.$default$andThen(this, function);
                                }

                                @Override // java.util.function.Function
                                public final Object apply(Object obj2) {
                                    buxz buxzVar = (buxz) obj2;
                                    int i = veq.b;
                                    buxzVar.ak(1, 25);
                                    return buxzVar;
                                }

                                public final /* synthetic */ Function compose(Function function) {
                                    return Function$CC.$default$compose(this, function);
                                }
                            });
                            bueb a = bueg.a();
                            a.e(new Function() { // from class: veo
                                @Override // java.util.function.Function
                                /* renamed from: andThen */
                                public final /* synthetic */ Function mo448andThen(Function function) {
                                    return Function$CC.$default$andThen(this, function);
                                }

                                @Override // java.util.function.Function
                                public final Object apply(Object obj2) {
                                    int i = veq.b;
                                    return ((budk) obj2).a;
                                }

                                public final /* synthetic */ Function compose(Function function) {
                                    return Function$CC.$default$compose(this, function);
                                }
                            });
                            a.f(new Function() { // from class: vep
                                @Override // java.util.function.Function
                                /* renamed from: andThen */
                                public final /* synthetic */ Function mo448andThen(Function function) {
                                    return Function$CC.$default$andThen(this, function);
                                }

                                @Override // java.util.function.Function
                                public final Object apply(Object obj2) {
                                    buef buefVar = (buef) obj2;
                                    int i = veq.b;
                                    buefVar.e();
                                    return buefVar;
                                }

                                public final /* synthetic */ Function compose(Function function) {
                                    return Function$CC.$default$compose(this, function);
                                }
                            });
                            d.G(dtvz.i(a.b(), bueg.c.b, MessagesTable.c.a).g());
                            z = d.b().T();
                        } else {
                            String[] strArr = vek.a;
                            veh vehVar = new veh(vek.a);
                            vehVar.z("outgoingReactionsPresentOld");
                            vehVar.x(1);
                            apply = new Function() { // from class: vel
                                @Override // java.util.function.Function
                                /* renamed from: andThen */
                                public final /* synthetic */ Function mo448andThen(Function function) {
                                    return Function$CC.$default$andThen(this, function);
                                }

                                @Override // java.util.function.Function
                                public final Object apply(Object obj2) {
                                    vej vejVar = (vej) obj2;
                                    int i = veq.b;
                                    int a2 = vek.a().P().a();
                                    Integer.valueOf(a2).getClass();
                                    if (a2 < 46020) {
                                        dtub.w("reacted_message_id", a2);
                                    }
                                    vejVar.aq(new dtrx("message_reactions.reacted_message_id", 6));
                                    vejVar.aq(new dtzc("messages.message_status", "1", "25"));
                                    return vejVar;
                                }

                                public final /* synthetic */ Function compose(Function function) {
                                    return Function$CC.$default$compose(this, function);
                                }
                            }.apply(new vej());
                            vehVar.k(new vei((vej) apply));
                            z = vehVar.a().i() > 0;
                        }
                        ver verVar = (ver) ves.a.createBuilder();
                        verVar.copyOnWrite();
                        ves vesVar = (ves) verVar.instance;
                        vesVar.b |= 1;
                        vesVar.c = true;
                        verVar.copyOnWrite();
                        ves vesVar2 = (ves) verVar.instance;
                        vesVar2.b |= 2;
                        vesVar2.d = 0;
                        verVar.copyOnWrite();
                        ves vesVar3 = (ves) verVar.instance;
                        vesVar3.b |= 4;
                        vesVar3.e = z;
                        return (ves) verVar.build();
                    }
                }).h(new emwl() { // from class: vey
                    @Override // defpackage.emwl
                    public final Object apply(Object obj) {
                        return Boolean.valueOf(!((ves) obj).e);
                    }
                }, erpp.a);
            }
        }, this.a.b);
    }
}
