package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.message.internal.CoreBugleMessageId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;
import j$.lang.Iterable$EL;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.util.Collection;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cbmx extends ffhv implements ffjm {
    final /* synthetic */ cbmz a;
    final /* synthetic */ cbne b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cbmx(ffgu ffguVar, cbmz cbmzVar, cbne cbneVar) {
        super(2, ffguVar);
        this.a = cbmzVar;
        this.b = cbneVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cbmx) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        int i;
        dtzq dtzqVar;
        final boolean z;
        engw g;
        ffci.b(obj);
        final apuq apuqVar = (apuq) this.a.a.b();
        final Collection c = this.b.c();
        final Function function = new Function() { // from class: cbmw
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function2) {
                return Function$CC.$default$andThen(this, function2);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj2) {
                String str = (String) obj2;
                boolean z2 = true;
                if (!le.x(str) && !le.f(str)) {
                    z2 = false;
                }
                return Boolean.valueOf(z2);
            }

            public final /* synthetic */ Function compose(Function function2) {
                return Function$CC.$default$compose(this, function2);
            }
        };
        Object e = aoyx.a.e();
        e.getClass();
        boolean booleanValue = ((Boolean) e).booleanValue();
        ekzz f = eleg.f("MessageTableOperations#getMessageAbsoluteOffsets");
        try {
            int i2 = engw.d;
            final engr engrVar = new engr();
            if (c.isEmpty()) {
                g = engrVar.g();
            } else {
                buxo d = MessagesTable.d();
                d.z("getMessageAbsoluteOffsets");
                d.e(new Function() { // from class: apuk
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function2) {
                        return Function$CC.$default$andThen(this, function2);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        buum buumVar = (buum) obj2;
                        return new buun[]{buumVar.a, buumVar.i};
                    }

                    public final /* synthetic */ Function compose(Function function2) {
                        return Function$CC.$default$compose(this, function2);
                    }
                });
                if (!aslz.a()) {
                    i = 1;
                    if (booleanValue) {
                        String[] strArr = PartsTable.a;
                        buum buumVar = MessagesTable.c;
                        String dtryVar = buumVar.b.toString();
                        buun buunVar = buumVar.i;
                        String dtryVar2 = buunVar.toString();
                        String dtryVar3 = buunVar.toString();
                        buun buunVar2 = buumVar.a;
                        dtzqVar = new dtzq("SELECT COUNT(*) FROM $R as b LEFT JOIN $R as p ON b.$R = p.$R WHERE  (b.$R = 0) AND (b.$R <> 3) AND (b.$R <> $V) AND (b.$R = $R) AND  ((b.$R > $R) OR ((b.$R = $R)    AND (b.$R > $R)) OR ((b.$R = $R) AND (b.$R = $R) AND (p.$R > $V{J:parts})))", new Object[]{"messages", "parts", "_id", "message_id", "is_hidden", "message_status", "message_status", 16, "conversation_id", dtryVar, "received_timestamp", dtryVar2, "received_timestamp", dtryVar3, "_id", buunVar2.toString(), "received_timestamp", buunVar.toString(), "_id", buunVar2.toString(), "_id", PartsTable.d.a});
                        z = i;
                    } else {
                        buum buumVar2 = MessagesTable.c;
                        String dtryVar4 = buumVar2.b.toString();
                        buun buunVar3 = buumVar2.i;
                        dtzqVar = new dtzq("SELECT COUNT(*) FROM $R as b WHERE (b.$R = 0) AND (b.$R <> 3)  AND (b.$R <> $V) AND (b.$R = $R) AND ((b.$R > $R) OR ((b.$R = $R) AND (b.$R > $R)))", new Object[]{"messages", "is_hidden", "message_status", "message_status", 16, "conversation_id", dtryVar4, "received_timestamp", buunVar3.toString(), "received_timestamp", buunVar3.toString(), "_id", buumVar2.a.toString()});
                        z = 0;
                    }
                } else if (booleanValue) {
                    String[] strArr2 = PartsTable.a;
                    buum buumVar3 = MessagesTable.c;
                    String dtryVar5 = buumVar3.b.toString();
                    buun buunVar4 = buumVar3.i;
                    String dtryVar6 = buunVar4.toString();
                    String dtryVar7 = buunVar4.toString();
                    buun buunVar5 = buumVar3.a;
                    i = 1;
                    dtzqVar = new dtzq("SELECT COUNT(*) FROM $R as b LEFT JOIN $R as p ON b.$R = p.$R WHERE  (b.$R = 0) AND (b.$R <> 3) AND (b.$R NOT IN ($V, $V, $V, $V, $V, $V, $V, $V, $V, $V, $V, $V, $V, $V, $V, $V))  AND (b.$R = $R) AND  ((b.$R > $R) OR ((b.$R = $R)    AND (b.$R > $R)) OR ((b.$R = $R) AND (b.$R = $R) AND (p.$R > $V{J:parts})))", new Object[]{"messages", "parts", "_id", "message_id", "is_hidden", "message_status", "message_status", 16, 214, 215, 216, 233, 234, 252, 235, 236, 237, 238, 219, 208, 223, 224, 222, "conversation_id", dtryVar5, "received_timestamp", dtryVar6, "received_timestamp", dtryVar7, "_id", buunVar5.toString(), "received_timestamp", buunVar4.toString(), "_id", buunVar5.toString(), "_id", PartsTable.d.a});
                    z = i;
                } else {
                    i = 1;
                    buum buumVar4 = MessagesTable.c;
                    String dtryVar8 = buumVar4.b.toString();
                    buun buunVar6 = buumVar4.i;
                    dtzqVar = new dtzq("SELECT COUNT(*) FROM $R as b WHERE (b.$R = 0) AND (b.$R <> 3)  AND (b.$R NOT IN ($V, $V, $V, $V, $V, $V, $V, $V, $V, $V, $V, $V, $V, $V, $V, $V))  AND (b.$R = $R)  AND ((b.$R > $R) OR ((b.$R = $R) AND (b.$R > $R)))", new Object[]{"messages", "is_hidden", "message_status", "message_status", 16, 214, 215, 216, 233, 234, 252, 235, 236, 237, 238, 219, 208, 223, 224, 222, "conversation_id", dtryVar8, "received_timestamp", buunVar6.toString(), "received_timestamp", buunVar6.toString(), "_id", buumVar4.a.toString()});
                    z = 0;
                }
                d.n(dtzqVar, "offset");
                d.h(new Function() { // from class: apul
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function2) {
                        return Function$CC.$default$andThen(this, function2);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        buxz buxzVar = (buxz) obj2;
                        buxzVar.u(c);
                        return buxzVar;
                    }

                    public final /* synthetic */ Function compose(Function function2) {
                        return Function$CC.$default$compose(this, function2);
                    }
                });
                Object[] objArr = new Object[i];
                objArr[0] = "offset";
                d.B(new dtzq("$R", objArr));
                if (z != 0) {
                    bwdf c2 = PartsTable.c();
                    c2.z("fanOutWhenFlatteningIfNeeded");
                    c2.e(new Function() { // from class: apup
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo448andThen(Function function2) {
                            return Function$CC.$default$andThen(this, function2);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj2) {
                            bwat bwatVar = (bwat) obj2;
                            return new bwau[]{bwatVar.a, bwatVar.e};
                        }

                        public final /* synthetic */ Function compose(Function function2) {
                            return Function$CC.$default$compose(this, function2);
                        }
                    });
                    d.G(dtvz.i(c2.b(), PartsTable.d.b, MessagesTable.c.a).g());
                }
                Iterable$EL.forEach(d.b().y(), new Consumer() { // from class: apum
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void o(Object obj2) {
                        int i3;
                        PartsTable.BindData bindData;
                        Object apply;
                        CoreBugleMessageId coreBugleMessageId;
                        MessagesTable.BindData bindData2 = (MessagesTable.BindData) obj2;
                        try {
                            i3 = Integer.parseInt(bindData2.ay("offset"));
                        } catch (NumberFormatException unused) {
                            i3 = 0;
                        }
                        engr engrVar2 = engrVar;
                        if (!z) {
                            engrVar2.h(new cbnd(new CoreBugleMessageId(bindData2.D(), -1L), i3));
                            return;
                        }
                        if (((avel) apuq.this.a.b()).a()) {
                            String[] strArr3 = PartsTable.a;
                            PartsTable.BindData[] bindDataArr = (PartsTable.BindData[]) bindData2.aG("parts", new PartsTable.BindData[0]);
                            if (bindDataArr == null || bindDataArr.length == 0) {
                                return;
                            } else {
                                bindData = bindDataArr[0];
                            }
                        } else {
                            String[] strArr4 = PartsTable.a;
                            bindData = ((PartsTable.BindData[]) bindData2.aG("parts", new PartsTable.BindData[0]))[0];
                        }
                        String H = bindData.H();
                        if (H != null) {
                            apply = function.apply(H);
                            if (((Boolean) apply).booleanValue()) {
                                MessageIdType D = bindData2.D();
                                try {
                                    coreBugleMessageId = new CoreBugleMessageId(D, Long.parseLong(bindData.J()));
                                } catch (NumberFormatException unused2) {
                                    coreBugleMessageId = new CoreBugleMessageId(D, -1L);
                                }
                                engrVar2.h(new cbnd(coreBugleMessageId, i3));
                            }
                        }
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
                g = engrVar.g();
            }
            f.close();
            return g;
        } catch (Throwable th) {
            try {
                f.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        cbmx cbmxVar = new cbmx(ffguVar, this.a, this.b);
        cbmxVar.c = obj;
        return cbmxVar;
    }
}
