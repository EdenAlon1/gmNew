package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.function.Function$CC;
import j$.util.stream.Stream;
import java.util.concurrent.Callable;
import java.util.function.Function;
import java.util.function.ToIntFunction;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final /* synthetic */ class clea implements Function {
    public final /* synthetic */ cleh a;

    public /* synthetic */ clea(cleh clehVar) {
        this.a = clehVar;
    }

    @Override // java.util.function.Function
    /* renamed from: andThen */
    public final /* synthetic */ Function mo448andThen(Function function) {
        return Function$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        final aoku aokuVar = (aoku) obj;
        final cleh clehVar = this.a;
        return elfl.g(clehVar.d.b(eldl.c(new erog() { // from class: cldv
            @Override // defpackage.erog
            public final ListenableFuture a() {
                return cleh.this.l.a(aokuVar);
            }
        }), clehVar.f)).i(new eroh() { // from class: cldx
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj2) {
                if (!((avtb) obj2).equals(avtb.NOT_RCS)) {
                    return elfo.e(0);
                }
                final aoku aokuVar2 = aokuVar;
                final cleh clehVar2 = cleh.this;
                return elfo.g(new Callable() { // from class: cldu
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        final cleh clehVar3 = cleh.this;
                        bdga bdgaVar = (bdga) clehVar3.h.b();
                        aoku aokuVar3 = aokuVar2;
                        final ConversationIdType a = bdgaVar.a(aokuVar3.h());
                        if (a.b()) {
                            csjb e = cleh.a.e();
                            e.I("Could not get conversation from recipient destination");
                            e.I(aokuVar3.toString());
                            e.r();
                            return 0;
                        }
                        buxo d = MessagesTable.d();
                        d.z("updateStatusForMessagesInLimbo");
                        d.h(new Function() { // from class: cldm
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo448andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj3) {
                                buxz buxzVar = (buxz) obj3;
                                cskc cskcVar = cleh.a;
                                buxzVar.m(ConversationIdType.this);
                                buxzVar.K(3);
                                buxzVar.ai(cleh.c);
                                return buxzVar;
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        });
                        Stream D = d.b().D();
                        try {
                            Integer valueOf = Integer.valueOf(D.mapToInt(new ToIntFunction() { // from class: cldn
                                @Override // java.util.function.ToIntFunction
                                public final int applyAsInt(Object obj3) {
                                    amdh amdhVar = (amdh) cleh.this.n.b();
                                    amdd p = amdg.p();
                                    p.c(((MessagesTable.BindData) obj3).D());
                                    p.g(epdh.RECIPIENT_LOST_RCS);
                                    p.h(17);
                                    return amdhVar.c(p.a()) ? 1 : 0;
                                }
                            }).sum());
                            if (D == null) {
                                return valueOf;
                            }
                            D.close();
                            return valueOf;
                        } catch (Throwable th) {
                            if (D != null) {
                                try {
                                    D.close();
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                            }
                            throw th;
                        }
                    }
                }, clehVar2.f);
            }
        }, clehVar.g).e(avlo.class, new emwl() { // from class: cldy
            @Override // defpackage.emwl
            public final Object apply(Object obj2) {
                csjb e = cleh.a.e();
                e.I("Cannot get recipient limbo message count because OnlineStatus query failed");
                e.s((avlo) obj2);
                return 0;
            }
        }, clehVar.g);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function$CC.$default$compose(this, function);
    }
}
