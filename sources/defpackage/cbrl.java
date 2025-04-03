package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.api.messaging.message.internal.CoreBugleMessageId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import j$.time.Instant;
import j$.util.DesugarArrays;
import j$.util.function.Function$CC;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cbrl extends dtrs {
    public static final /* synthetic */ int b = 0;
    public final Consumer a;
    private final dtuu c;
    private final List d = new ArrayList();

    public cbrl(dtuu dtuuVar, Consumer consumer) {
        this.c = dtuuVar;
        this.a = consumer;
    }

    @Override // defpackage.dtrs
    public final /* bridge */ /* synthetic */ void b(dtyq dtyqVar, dtuk dtukVar) {
        final bulm bulmVar = (bulm) dtukVar.b();
        if (bulmVar != null) {
            buxo d = MessagesTable.d();
            d.z("MessageStarChangeQueryListener#onChangeInTransaction1");
            d.e(new Function() { // from class: cbrf
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    buum buumVar = (buum) obj;
                    int i = cbrl.b;
                    return new buun[]{buumVar.a, buumVar.b, buumVar.i};
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            d.h(new Function() { // from class: cbrg
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    buxz buxzVar = (buxz) obj;
                    int i = cbrl.b;
                    buxzVar.q(bulm.this.k());
                    return buxzVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            buuo buuoVar = (buuo) d.b().o();
            while (buuoVar.moveToNext()) {
                try {
                    MessagesTable.BindData bindData = (MessagesTable.BindData) buuoVar.cO();
                    List list = this.d;
                    alxd alxdVar = alxd.UPDATE;
                    CoreBugleMessageId coreBugleMessageId = new CoreBugleMessageId(bulmVar.k(), -1L);
                    ConversationIdType C = bindData.C();
                    C.getClass();
                    list.add(new apsl(alxdVar, coreBugleMessageId, new BugleConversationId(C), Instant.ofEpochMilli(bindData.w()), 0));
                } finally {
                }
            }
            buuoVar.close();
        }
        final bulm[] bulmVarArr = (bulm[]) dtukVar.a();
        if (bulmVarArr != null) {
            buxo d2 = MessagesTable.d();
            d2.z("MessageStarChangeQueryListener#onChangeInTransaction2");
            d2.e(new Function() { // from class: cbrh
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    buum buumVar = (buum) obj;
                    int i = cbrl.b;
                    return new buun[]{buumVar.a, buumVar.b, buumVar.i};
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            d2.h(new Function() { // from class: cbri
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    buxz buxzVar = (buxz) obj;
                    int i = cbrl.b;
                    buxzVar.u((Iterable) DesugarArrays.stream(bulmVarArr).map(new Function() { // from class: cbre
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo448andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj2) {
                            int i2 = cbrl.b;
                            return ((bulm) obj2).k();
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    }).collect(endq.b));
                    return buxzVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            buuo buuoVar2 = (buuo) d2.b().o();
            while (buuoVar2.moveToNext()) {
                MessagesTable.BindData bindData2 = (MessagesTable.BindData) buuoVar2.cO();
                List list2 = this.d;
                alxd alxdVar2 = alxd.UPDATE;
                CoreBugleMessageId coreBugleMessageId2 = new CoreBugleMessageId(bindData2.D(), -1L);
                ConversationIdType C2 = bindData2.C();
                C2.getClass();
                list2.add(new apsl(alxdVar2, coreBugleMessageId2, new BugleConversationId(C2), Instant.ofEpochMilli(bindData2.w()), 0));
            }
        }
        if (this.d.isEmpty()) {
            return;
        }
        List list3 = this.d;
        dtuu dtuuVar = this.c;
        final engw n = engw.n(list3);
        dtuuVar.g(new dtut() { // from class: cbrj
            @Override // defpackage.dtut
            public final ekzz a() {
                int i = cbrl.b;
                return eleg.f("MSCQL::onChangeInTransaction::runAfterCommit");
            }
        }, String.valueOf(n.hashCode()), new Runnable() { // from class: cbrk
            @Override // java.lang.Runnable
            public final void run() {
                cbrl.this.a.o(n);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.dtrs
    public final /* bridge */ /* synthetic */ void c(dtyq dtyqVar, dtuk dtukVar) {
        this.d.clear();
        duap e = dtukVar.e();
        if (e != null) {
            String[] strArr = bumm.a;
            bumh bumhVar = new bumh(bumm.a);
            bumhVar.z("MessageStarChangeQueryListener#preChangeInTransaction");
            bumhVar.d(new Function() { // from class: cbrc
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    bulv bulvVar = (bulv) obj;
                    int i = cbrl.b;
                    return new bulw[]{bulvVar.a, bulvVar.b};
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            buxo d = MessagesTable.d();
            d.e(new Function() { // from class: cbrd
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    buum buumVar = (buum) obj;
                    int i = cbrl.b;
                    return new buun[]{buumVar.a, buumVar.b, buumVar.i};
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            bumhVar.G(dtvz.i(d.b(), MessagesTable.c.a, bumm.c.b).g());
            bumhVar.k((bumk) e);
            bulx bulxVar = (bulx) bumhVar.b().o();
            while (bulxVar.moveToNext()) {
                try {
                    engw p = engw.p((MessagesTable.BindData[]) ((bulm) bulxVar.cO()).aG("messages", new MessagesTable.BindData[0]));
                    if (!p.isEmpty()) {
                        List list = this.d;
                        alxd alxdVar = alxd.UPDATE;
                        CoreBugleMessageId coreBugleMessageId = new CoreBugleMessageId(((MessagesTable.BindData) p.get(0)).D(), -1L);
                        ConversationIdType C = ((MessagesTable.BindData) p.get(0)).C();
                        C.getClass();
                        list.add(new apsl(alxdVar, coreBugleMessageId, new BugleConversationId(C), Instant.ofEpochMilli(((MessagesTable.BindData) p.get(0)).w()), 0));
                    }
                } finally {
                }
            }
            bulxVar.close();
        }
    }
}
