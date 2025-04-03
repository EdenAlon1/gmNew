package defpackage;

import android.net.Uri;
import android.os.Bundle;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Collection;
import j$.util.DesugarArrays;
import j$.util.Optional;
import j$.util.function.BiConsumer$CC;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Collectors;
import j$.util.stream.Stream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.LongFunction;
import java.util.function.Predicate;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ccpg {
    static final cfup a = cfvl.e(cfvl.b, "max_message_deletion_failure_retry_count", 10);
    public static final enru b = enru.c("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/CmsMessageObjectConsumerDelegate");
    private final asio A;
    public final csal c;
    public final cdsq d;
    public final errl e;
    public final errl f;
    public final dtuu g;
    public final axkm h;
    public final cbgf i;
    public final ffbr j;
    public final eisx k;
    public final cgrq l;
    public final ffbr m;
    public final cqoh n;
    public final cefl o;
    public final ashs p;
    public final asix q;
    public final cdlx r;
    public final ashm s;
    public final asik t;
    public final asji u;
    public final ccub v;
    public final asim w;
    public final axdf x;
    public final aszw y;
    private final ccpr z;

    public ccpg(csal csalVar, cdsq cdsqVar, errl errlVar, errl errlVar2, ccpr ccprVar, axkm axkmVar, ffbr ffbrVar, cbgf cbgfVar, dtuu dtuuVar, cgrq cgrqVar, eisx eisxVar, ffbr ffbrVar2, cqoh cqohVar, cefl ceflVar, ashs ashsVar, asix asixVar, cdlx cdlxVar, ashm ashmVar, asik asikVar, asji asjiVar, asio asioVar, ccub ccubVar, asim asimVar, axdf axdfVar, aszw aszwVar) {
        this.c = csalVar;
        this.d = cdsqVar;
        this.e = errlVar;
        this.f = errlVar2;
        this.j = ffbrVar;
        this.i = cbgfVar;
        this.g = dtuuVar;
        this.z = ccprVar;
        this.h = axkmVar;
        this.l = cgrqVar;
        this.k = eisxVar;
        this.m = ffbrVar2;
        this.n = cqohVar;
        this.o = ceflVar;
        this.p = ashsVar;
        this.q = asixVar;
        this.r = cdlxVar;
        this.s = ashmVar;
        this.t = asikVar;
        this.u = asjiVar;
        this.A = asioVar;
        this.v = ccubVar;
        this.w = asimVar;
        this.x = axdfVar;
        this.y = aszwVar;
    }

    public static void l(Map map, Map map2, Map map3, int i, int i2, Map map4, long j) {
        for (Map.Entry entry : map3.entrySet()) {
            String str = (String) entry.getKey();
            map4.put(str, new cbzf(Optional.ofNullable((MessagesTable.BindData) entry.getValue()), true, i2, i, j));
            map.remove(str);
            if (map2 != null) {
                map2.remove(str);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ccin a(final MessagesTable.BindData bindData, engw engwVar, long j) {
        Optional ofNullable;
        efbd.b();
        ashx ashxVar = ((cdvd) this.d).k;
        Optional g = cdvd.g(engwVar);
        if (ashxVar.a() && bindData.l() == 2) {
            String R = bindData.R();
            R.getClass();
            enhk f = cdvd.f(enhk.l(R, bindData));
            if (f.isEmpty()) {
                ofNullable = Optional.empty();
            } else {
                String R2 = bindData.R();
                R2.getClass();
                ofNullable = Optional.ofNullable((MessagesTable.BindData) f.get(R2));
            }
        } else if (g.isPresent()) {
            final String K = ((PartsTable.BindData) g.get()).K();
            if (K == null) {
                throw new cduz(String.format("XMS text part does not have a text for cms id = %s", bindData.R()));
            }
            buxo d = MessagesTable.d();
            d.z("findDuplicationWithText");
            d.h(new Function() { // from class: cdtb
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    buxz buxzVar = (buxz) obj;
                    cskc cskcVar = cdvd.a;
                    buxzVar.m(MessagesTable.BindData.this.C());
                    return buxzVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            d.h(cdvd.i(bindData));
            d.h(new Function() { // from class: cdtd
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    buxz buxzVar = (buxz) obj;
                    cskc cskcVar = cdvd.a;
                    buxzVar.b(new Function() { // from class: cduu
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo448andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj2) {
                            buxz buxzVar2 = (buxz) obj2;
                            cskc cskcVar2 = cdvd.a;
                            buxzVar2.i(csgg.UNKNOWN);
                            return buxzVar2;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    }, new Function() { // from class: cduv
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo448andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj2) {
                            buxz buxzVar2 = (buxz) obj2;
                            cskc cskcVar2 = cdvd.a;
                            buxzVar2.i(csgg.RESTORED_FROM_TELEPHONY);
                            return buxzVar2;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    return buxzVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            bwdf c = PartsTable.c();
            c.h(new Function() { // from class: cdte
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    bwdm bwdmVar = (bwdm) obj;
                    cskc cskcVar = cdvd.a;
                    bwdmVar.aq(new dtrt("parts.text", 1, K));
                    return bwdmVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            d.D(dtvz.i(c.b(), PartsTable.d.b, MessagesTable.c.a).g());
            engw y = d.b().y();
            if (y.isEmpty()) {
                csjb c2 = cdvd.a.c();
                c2.I("Found no duplicate messages with matching text");
                c2.r();
                ofNullable = Optional.empty();
            } else {
                if (((enou) y).c > 1) {
                    csjb c3 = cdvd.a.c();
                    c3.I("Found multiple duplicate messages with matching text");
                    c3.A("conversation id", bindData.C());
                    c3.z("timestamp", bindData.w());
                    c3.r();
                }
                MessagesTable.BindData bindData2 = (MessagesTable.BindData) y.get(0);
                csjb c4 = cdvd.a.c();
                c4.I("Found duplicate message in Bugle Db with matching text");
                c4.A("message id", bindData2.D());
                c4.A("conversation id", bindData2.C());
                c4.z("timestamp", bindData2.w());
                c4.r();
                ofNullable = Optional.ofNullable(bindData2);
            }
        } else {
            long count = Collection.EL.stream(engwVar).filter(new Predicate() { // from class: cdss
                public final /* synthetic */ Predicate and(Predicate predicate) {
                    return Predicate$CC.$default$and(this, predicate);
                }

                @Override // java.util.function.Predicate
                /* renamed from: negate */
                public final /* synthetic */ Predicate mo439negate() {
                    return Predicate$CC.$default$negate(this);
                }

                public final /* synthetic */ Predicate or(Predicate predicate) {
                    return Predicate$CC.$default$or(this, predicate);
                }

                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    cskc cskcVar = cdvd.a;
                    return le.f.contains(((PartsTable.BindData) obj).H());
                }
            }).count();
            bwau bwauVar = PartsTable.d.b;
            Integer valueOf = Integer.valueOf(engwVar.size());
            bwau bwauVar2 = PartsTable.d.e;
            dtzq dtzqVar = new dtzq("COUNT($V{p})=$V AND SUM(CASE WHEN $V{p} IS NULL THEN 1 WHEN $V{p} IN ($R) THEN 1 ELSE 0 END) = $V", new Object[]{bwauVar, valueOf, bwauVar2, bwauVar2, Collection.EL.stream(le.f).map(new cdst()).collect(Collectors.joining(",")), Long.valueOf(count)});
            buxo d2 = MessagesTable.d();
            d2.z("findDuplicationForMedia");
            d2.v(MessagesTable.c.a);
            d2.w(dtzqVar);
            bwdf c5 = PartsTable.c();
            c5.c(PartsTable.d.b);
            dtvy i = dtvz.i(c5.b(), PartsTable.d.b, MessagesTable.c.a);
            ((dtrd) i).e = "p";
            d2.G(i.g());
            d2.h(new Function() { // from class: cdsu
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    buxz buxzVar = (buxz) obj;
                    cskc cskcVar = cdvd.a;
                    buxzVar.m(MessagesTable.BindData.this.C());
                    return buxzVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            d2.h(cdvd.i(bindData));
            d2.h(new Function() { // from class: cdsv
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    buxz buxzVar = (buxz) obj;
                    cskc cskcVar = cdvd.a;
                    buxzVar.b(new Function() { // from class: cdtp
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo448andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj2) {
                            buxz buxzVar2 = (buxz) obj2;
                            cskc cskcVar2 = cdvd.a;
                            buxzVar2.i(csgg.UNKNOWN);
                            return buxzVar2;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    }, new Function() { // from class: cdtq
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo448andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj2) {
                            buxz buxzVar2 = (buxz) obj2;
                            cskc cskcVar2 = cdvd.a;
                            buxzVar2.i(csgg.RESTORED_FROM_TELEPHONY);
                            return buxzVar2;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    return buxzVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            engw y2 = d2.b().y();
            if (y2.isEmpty()) {
                ofNullable = Optional.empty();
            } else {
                MessagesTable.BindData bindData3 = (MessagesTable.BindData) y2.get(0);
                csjb c6 = cdvd.a.c();
                c6.I("Found duplicate textless message in Bugle Db");
                c6.A("message id", bindData3.D());
                c6.A("conversation id", bindData3.C());
                c6.z("timestamp", bindData3.w());
                c6.y("parts count", engwVar.size());
                c6.z("media parts count", engwVar.size() - count);
                c6.r();
                ofNullable = Optional.ofNullable(bindData3);
            }
        }
        Optional optional = ofNullable;
        return optional.isPresent() ? new cbzf(optional, true, 5, 6, j) : ccin.f(j);
    }

    public final elfl b(final int i, final MessageIdType messageIdType) {
        return (elfl) MessagesTable.h(messageIdType, new Function() { // from class: ccos
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                int intValue = ((Integer) ccpg.a.e()).intValue();
                final int i2 = i;
                if (i2 <= intValue) {
                    final MessageIdType messageIdType2 = messageIdType;
                    final ccpg ccpgVar = ccpg.this;
                    return (ccpgVar.q.a() ? ccpgVar.l.b(messageIdType2, cgrr.DUPLICATE_MESSAGE_RESTORE_DELETION) : ccpgVar.l.a(messageIdType2)).i(new eroh() { // from class: ccmt
                        @Override // defpackage.eroh
                        public final ListenableFuture a(Object obj2) {
                            ceyt ceytVar = (ceyt) obj2;
                            Bundle a2 = ceytVar.a();
                            if ((a2 == null || a2.getInt("delete_count") == 1) && !ceytVar.equals(ceyt.k())) {
                                return elfo.e(true);
                            }
                            MessageIdType messageIdType3 = messageIdType2;
                            int i3 = i2;
                            ccpg ccpgVar2 = ccpg.this;
                            ensk j = ccpg.b.j();
                            j.Y(ente.a, "BugleCms");
                            ((enrr) ((enrr) j).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/CmsMessageObjectConsumerDelegate", "deleteLocalMessage", 1428, "CmsMessageObjectConsumerDelegate.java")).q("Delete duplicate message failed, will try to retry again");
                            return ccpgVar2.b(i3 + 1, messageIdType3);
                        }
                    }, ccpgVar.e);
                }
                ensk j = ccpg.b.j();
                j.Y(ente.a, "BugleCms");
                ((enrr) ((enrr) j).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/CmsMessageObjectConsumerDelegate", "deleteLocalMessage", 1407, "CmsMessageObjectConsumerDelegate.java")).r("Delete message failed after retried %d times", i2);
                return elfo.e(false);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }, new Supplier() { // from class: ccot
            @Override // java.util.function.Supplier
            public final Object get() {
                enru enruVar = ccpg.b;
                return elfo.e(true);
            }
        });
    }

    public final elfl c(final MessageIdType messageIdType, final MessagesTable.BindData bindData, final List list, final eshh eshhVar, final String str, final boolean z) {
        elfl h;
        ekzz f = eleg.f("CmsMessageObjectConsumerDelegate#deleteLocalMessageAndInsertCmsMessage");
        try {
            buxo d = MessagesTable.d();
            d.z("deleteLocalMessageAndInsertCmsMessage");
            d.h(new Function() { // from class: ccpb
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    buxz buxzVar = (buxz) obj;
                    enru enruVar = ccpg.b;
                    buxzVar.m(MessagesTable.BindData.this.C());
                    return buxzVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            if (d.b().i() == 1) {
                ensk j = b.j();
                j.Y(ente.a, "BugleCms");
                ((enrr) ((enrr) j).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/CmsMessageObjectConsumerDelegate", "reinsertThenDelete", 1383, "CmsMessageObjectConsumerDelegate.java")).q("This is the only message in Conversation, we do insert-then-delete");
                i(bindData, list, eshhVar, str, z);
                h = b(0, messageIdType).h(new emwl() { // from class: ccms
                    @Override // defpackage.emwl
                    public final Object apply(Object obj) {
                        enru enruVar = ccpg.b;
                        if (((Boolean) obj).booleanValue()) {
                            return null;
                        }
                        ensk j2 = ccpg.b.j();
                        j2.Y(ente.a, "BugleCms");
                        ((enrr) ((enrr) j2).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/CmsMessageObjectConsumerDelegate", "reinsertThenDelete", 1391, "CmsMessageObjectConsumerDelegate.java")).q("Delete duplicate message failed after insert, will not retry");
                        throw new ccpj(csgx.NO_RETRY);
                    }
                }, this.f);
                f.b(h);
            } else {
                ensk h2 = b.h();
                h2.Y(ente.a, "BugleCms");
                ((enrr) ((enrr) h2).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/CmsMessageObjectConsumerDelegate", "deleteThenReinsert", 1358, "CmsMessageObjectConsumerDelegate.java")).t("Removing and re-adding message msgid=%s", messageIdType);
                h = b(0, messageIdType).h(new emwl() { // from class: ccnh
                    @Override // defpackage.emwl
                    public final Object apply(Object obj) {
                        if (!((Boolean) obj).booleanValue()) {
                            ensk j2 = ccpg.b.j();
                            j2.Y(ente.a, "BugleCms");
                            ((enrr) ((enrr) j2).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/CmsMessageObjectConsumerDelegate", "deleteThenReinsert", 1369, "CmsMessageObjectConsumerDelegate.java")).q("Delete duplicate message failed before insert, will not retry");
                            throw new ccpk(csgx.NO_RETRY);
                        }
                        boolean z2 = z;
                        String str2 = str;
                        eshh eshhVar2 = eshhVar;
                        List list2 = list;
                        MessagesTable.BindData bindData2 = bindData;
                        MessageIdType messageIdType2 = messageIdType;
                        ccpg ccpgVar = ccpg.this;
                        ensk h3 = ccpg.b.h();
                        h3.Y(ente.a, "BugleCms");
                        ((enrr) ((enrr) h3).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/CmsMessageObjectConsumerDelegate", "deleteThenReinsert", 1363, "CmsMessageObjectConsumerDelegate.java")).t("Removed message, re-adding msgid=%s", messageIdType2);
                        ccpgVar.i(bindData2, list2, eshhVar2, str2, z2);
                        ensk h4 = ccpg.b.h();
                        h4.Y(ente.a, "BugleCms");
                        ((enrr) ((enrr) h4).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/CmsMessageObjectConsumerDelegate", "deleteThenReinsert", 1366, "CmsMessageObjectConsumerDelegate.java")).t("Re-added message msgid=%s", messageIdType2);
                        return null;
                    }
                }, this.e);
                f.b(h);
            }
            f.close();
            return h;
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

    /* JADX WARN: Can't wrap try/catch for region: R(7:0|1|(4:4|(1:6)|7|(5:9|(1:11)(1:19)|12|13|(2:15|16)(1:18)))|20|21|13|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005b, code lost:
    
        r4 = e(r3.c.a(r4), r4, r5, r6);
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.elfl d(final defpackage.eszz r4, final boolean r5, final boolean r6) {
        /*
            r3 = this;
            asik r0 = r3.t
            boolean r0 = r0.a()
            if (r0 == 0) goto L49
            if (r5 == 0) goto L49
            eyja r0 = r4.o
            if (r0 != 0) goto L10
            eyja r0 = defpackage.eyja.a
        L10:
            eyja r1 = defpackage.eykm.c
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L49
            java.lang.String r5 = r4.c
            com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable$BindData r5 = com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable.a(r5)
            if (r5 == 0) goto L36
            cgrq r6 = r3.l
            com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType r5 = r5.D()
            elfl r5 = r6.a(r5)
            ccoy r6 = new ccoy
            r6.<init>()
            erpp r0 = defpackage.erpp.a
            elfl r5 = r5.h(r6, r0)
            goto L3b
        L36:
            r5 = 0
            elfl r5 = defpackage.elfo.e(r5)
        L3b:
            ccnt r6 = new ccnt
            r6.<init>()
            erpp r4 = defpackage.erpp.a
            java.lang.Class<java.lang.RuntimeException> r0 = java.lang.RuntimeException.class
            elfl r4 = r5.f(r0, r6, r4)
            goto L65
        L49:
            axkm r0 = r3.h     // Catch: java.lang.Exception -> L5b
            elfl r0 = r0.q()     // Catch: java.lang.Exception -> L5b
            ccoe r1 = new ccoe     // Catch: java.lang.Exception -> L5b
            r1.<init>()     // Catch: java.lang.Exception -> L5b
            errl r2 = r3.e     // Catch: java.lang.Exception -> L5b
            elfl r4 = r0.i(r1, r2)     // Catch: java.lang.Exception -> L5b
            goto L65
        L5b:
            csal r0 = r3.c
            csbe r0 = r0.a(r4)
            elfl r4 = r3.e(r0, r4, r5, r6)
        L65:
            asim r5 = r3.w
            boolean r5 = r5.a()
            if (r5 == 0) goto L83
            ccof r5 = new ccof
            r5.<init>()
            erpp r6 = defpackage.erpp.a
            elfl r4 = r4.i(r5, r6)
            ccog r5 = new ccog
            r5.<init>()
            erpp r6 = defpackage.erpp.a
            elfl r4 = r4.h(r5, r6)
        L83:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ccpg.d(eszz, boolean, boolean):elfl");
    }

    public final elfl e(csak csakVar, final eszz eszzVar, final boolean z, boolean z2) {
        ashs ashsVar = this.p;
        final MessagesTable.BindData a2 = csakVar.a();
        final List c = csakVar.c();
        final eshh b2 = (ashsVar.a() && csgj.a()) ? csakVar.b() : eshh.a;
        if (this.w.a() && csakVar.d()) {
            this.v.f(eszzVar.c);
        }
        final String str = eszzVar.c;
        final engw n = engw.n(c);
        ekzz f = eleg.f("CmsMessageObjectConsumerDelegate#deduplicateCmsMessageAsync");
        try {
            elfl g = elfo.g(new Callable() { // from class: ccna
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:18:0x00df A[Catch: all -> 0x02ea, TryCatch #1 {all -> 0x02ea, blocks: (B:3:0x000a, B:6:0x0020, B:8:0x0034, B:10:0x0048, B:13:0x005e, B:15:0x0068, B:16:0x00d8, B:18:0x00df, B:22:0x006d, B:24:0x008c, B:25:0x0091, B:27:0x0098, B:28:0x00ad, B:29:0x00d4, B:30:0x00e9, B:32:0x00f3, B:34:0x0128, B:36:0x012e, B:37:0x0138, B:38:0x00f9, B:40:0x0118, B:41:0x011d, B:42:0x013e, B:45:0x014a, B:46:0x0173, B:48:0x0179, B:50:0x0191, B:52:0x01a5, B:53:0x01ab, B:55:0x01b8, B:56:0x01bd, B:58:0x01dc, B:59:0x01e1, B:61:0x01e8, B:62:0x01fd, B:63:0x0223, B:65:0x0229, B:66:0x0234, B:69:0x0242, B:71:0x0248, B:73:0x024e, B:75:0x0257, B:78:0x025e, B:80:0x027d, B:81:0x02c3, B:83:0x02ca, B:84:0x02d3, B:85:0x0282, B:88:0x028b, B:89:0x029c, B:90:0x02bf, B:91:0x02d8, B:92:0x02dd, B:93:0x014f, B:95:0x0155, B:96:0x016f), top: B:2:0x000a }] */
                /* JADX WARN: Removed duplicated region for block: B:83:0x02ca A[Catch: all -> 0x02ea, TryCatch #1 {all -> 0x02ea, blocks: (B:3:0x000a, B:6:0x0020, B:8:0x0034, B:10:0x0048, B:13:0x005e, B:15:0x0068, B:16:0x00d8, B:18:0x00df, B:22:0x006d, B:24:0x008c, B:25:0x0091, B:27:0x0098, B:28:0x00ad, B:29:0x00d4, B:30:0x00e9, B:32:0x00f3, B:34:0x0128, B:36:0x012e, B:37:0x0138, B:38:0x00f9, B:40:0x0118, B:41:0x011d, B:42:0x013e, B:45:0x014a, B:46:0x0173, B:48:0x0179, B:50:0x0191, B:52:0x01a5, B:53:0x01ab, B:55:0x01b8, B:56:0x01bd, B:58:0x01dc, B:59:0x01e1, B:61:0x01e8, B:62:0x01fd, B:63:0x0223, B:65:0x0229, B:66:0x0234, B:69:0x0242, B:71:0x0248, B:73:0x024e, B:75:0x0257, B:78:0x025e, B:80:0x027d, B:81:0x02c3, B:83:0x02ca, B:84:0x02d3, B:85:0x0282, B:88:0x028b, B:89:0x029c, B:90:0x02bf, B:91:0x02d8, B:92:0x02dd, B:93:0x014f, B:95:0x0155, B:96:0x016f), top: B:2:0x000a }] */
                /* JADX WARN: Removed duplicated region for block: B:84:0x02d3 A[Catch: all -> 0x02ea, TryCatch #1 {all -> 0x02ea, blocks: (B:3:0x000a, B:6:0x0020, B:8:0x0034, B:10:0x0048, B:13:0x005e, B:15:0x0068, B:16:0x00d8, B:18:0x00df, B:22:0x006d, B:24:0x008c, B:25:0x0091, B:27:0x0098, B:28:0x00ad, B:29:0x00d4, B:30:0x00e9, B:32:0x00f3, B:34:0x0128, B:36:0x012e, B:37:0x0138, B:38:0x00f9, B:40:0x0118, B:41:0x011d, B:42:0x013e, B:45:0x014a, B:46:0x0173, B:48:0x0179, B:50:0x0191, B:52:0x01a5, B:53:0x01ab, B:55:0x01b8, B:56:0x01bd, B:58:0x01dc, B:59:0x01e1, B:61:0x01e8, B:62:0x01fd, B:63:0x0223, B:65:0x0229, B:66:0x0234, B:69:0x0242, B:71:0x0248, B:73:0x024e, B:75:0x0257, B:78:0x025e, B:80:0x027d, B:81:0x02c3, B:83:0x02ca, B:84:0x02d3, B:85:0x0282, B:88:0x028b, B:89:0x029c, B:90:0x02bf, B:91:0x02d8, B:92:0x02dd, B:93:0x014f, B:95:0x0155, B:96:0x016f), top: B:2:0x000a }] */
                @Override // java.util.concurrent.Callable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object call() {
                    /*
                        Method dump skipped, instructions count: 757
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.ccna.call():java.lang.Object");
                }
            }, this.e);
            f.b(g);
            f.close();
            ekzz f2 = eleg.f("CmsMessageObjectConsumerDelegate#resolveDuplication");
            try {
                f2.b(g);
                try {
                    elfl f3 = g.i(new eroh() { // from class: ccnb
                        @Override // defpackage.eroh
                        public final ListenableFuture a(Object obj) {
                            final ccin ccinVar = (ccin) obj;
                            boolean c2 = ccinVar.c();
                            final MessagesTable.BindData bindData = a2;
                            final String str2 = str;
                            final ccpg ccpgVar = ccpg.this;
                            if (!c2) {
                                ccpgVar.k(ccinVar, bindData, str2, Optional.empty());
                                return elfo.e(ccinVar);
                            }
                            eshh eshhVar = b2;
                            engw engwVar = n;
                            int d = ccinVar.d() - 1;
                            if (d == 1) {
                                return ccpgVar.d.a((MessagesTable.BindData) ccinVar.b().get(), bindData, engwVar, eshhVar).i(new eroh() { // from class: ccmu
                                    @Override // defpackage.eroh
                                    public final ListenableFuture a(Object obj2) {
                                        ccin ccinVar2 = ccinVar;
                                        Optional of = Optional.of(((MessagesTable.BindData) ccinVar2.b().get()).D());
                                        ccpg.this.k(ccinVar2, bindData, str2, of);
                                        return elfo.e(ccinVar2);
                                    }
                                }, ccpgVar.e);
                            }
                            if (d == 2) {
                                MessagesTable.BindData bindData2 = (MessagesTable.BindData) ccinVar.b().get();
                                ekzz f4 = eleg.f("CmsMessageObjectConsumerDelegate#deduplicateByCmsIdAsync");
                                try {
                                    final MessageIdType D = bindData2.D();
                                    ensk h = ccpg.b.h();
                                    h.Y(ente.a, "BugleCms");
                                    ((enrr) ((enrr) h).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/CmsMessageObjectConsumerDelegate", "deduplicateByCmsIdAsync", 1802, "CmsMessageObjectConsumerDelegate.java")).D("Deduplicating message with message id: %s, cmsId: %s", D, bindData.R());
                                    elfl a3 = ccpgVar.d.a(bindData2, bindData, engwVar, eshhVar);
                                    f4.b(a3);
                                    elfl h2 = a3.h(new emwl() { // from class: ccod
                                        @Override // defpackage.emwl
                                        public final Object apply(Object obj2) {
                                            enru enruVar = ccpg.b;
                                            return MessageIdType.this;
                                        }
                                    }, ccpgVar.f);
                                    f4.close();
                                    return h2.h(new emwl() { // from class: ccmv
                                        @Override // defpackage.emwl
                                        public final Object apply(Object obj2) {
                                            Optional of = Optional.of((MessageIdType) obj2);
                                            ccpg ccpgVar2 = ccpg.this;
                                            ccin ccinVar2 = ccinVar;
                                            ccpgVar2.k(ccinVar2, bindData, str2, of);
                                            return ccinVar2;
                                        }
                                    }, ccpgVar.e);
                                } catch (Throwable th) {
                                    try {
                                        f4.close();
                                    } catch (Throwable th2) {
                                        th.addSuppressed(th2);
                                    }
                                    throw th;
                                }
                            }
                            if (d == 3) {
                                MessagesTable.BindData bindData3 = (MessagesTable.BindData) ccinVar.b().get();
                                ekzz f5 = eleg.f("CmsMessageObjectConsumerDelegate#deduplicateByMessagePersistenceIdAsync");
                                try {
                                    final MessageIdType D2 = bindData3.D();
                                    ensk h3 = ccpg.b.h();
                                    h3.Y(ente.a, "BugleCms");
                                    ((enrr) ((enrr) h3).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/CmsMessageObjectConsumerDelegate", "deduplicateByMessagePersistenceIdAsync", 1843, "CmsMessageObjectConsumerDelegate.java")).J("Deduplicating message with message id: %s, cmsId: %s, persistence ID: %s", D2, bindData.R(), bindData.O());
                                    elfl a4 = ccpgVar.d.a(bindData3, bindData, engwVar, eshhVar);
                                    f5.b(a4);
                                    elfl h4 = a4.h(new emwl() { // from class: ccmp
                                        @Override // defpackage.emwl
                                        public final Object apply(Object obj2) {
                                            enru enruVar = ccpg.b;
                                            return MessageIdType.this;
                                        }
                                    }, ccpgVar.e);
                                    f5.close();
                                    return h4.h(new emwl() { // from class: ccmw
                                        @Override // defpackage.emwl
                                        public final Object apply(Object obj2) {
                                            Optional of = Optional.of((MessageIdType) obj2);
                                            ccpg ccpgVar2 = ccpg.this;
                                            ccin ccinVar2 = ccinVar;
                                            ccpgVar2.k(ccinVar2, bindData, str2, of);
                                            return ccinVar2;
                                        }
                                    }, ccpgVar.e);
                                } catch (Throwable th3) {
                                    try {
                                        f5.close();
                                    } catch (Throwable th4) {
                                        th3.addSuppressed(th4);
                                    }
                                    throw th3;
                                }
                            }
                            if (d == 4) {
                                MessagesTable.BindData bindData4 = (MessagesTable.BindData) ccinVar.b().get();
                                ekzz f6 = eleg.f("CmsMessageObjectConsumerDelegate#deduplicateByRcsIdAsync");
                                try {
                                    final MessageIdType D3 = bindData4.D();
                                    ensk h5 = ccpg.b.h();
                                    h5.Y(ente.a, "BugleCms");
                                    ((enrr) ((enrr) h5).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/CmsMessageObjectConsumerDelegate", "deduplicateByRcsIdAsync", 1822, "CmsMessageObjectConsumerDelegate.java")).J("Deduplicating RCS message with message id: %s, cmsId: %s, rcsId: %s", D3, bindData.R(), bindData.G());
                                    elfl a5 = ccpgVar.d.a(bindData4, bindData, engwVar, eshhVar);
                                    f6.b(a5);
                                    elfl h6 = a5.h(new emwl() { // from class: ccng
                                        @Override // defpackage.emwl
                                        public final Object apply(Object obj2) {
                                            enru enruVar = ccpg.b;
                                            return MessageIdType.this;
                                        }
                                    }, ccpgVar.e);
                                    f6.close();
                                    return h6.h(new emwl() { // from class: ccmy
                                        @Override // defpackage.emwl
                                        public final Object apply(Object obj2) {
                                            Optional of = Optional.of((MessageIdType) obj2);
                                            ccpg ccpgVar2 = ccpg.this;
                                            ccin ccinVar2 = ccinVar;
                                            ccpgVar2.k(ccinVar2, bindData, str2, of);
                                            return ccinVar2;
                                        }
                                    }, ccpgVar.e);
                                } catch (Throwable th5) {
                                    try {
                                        f6.close();
                                    } catch (Throwable th6) {
                                        th5.addSuppressed(th6);
                                    }
                                    throw th5;
                                }
                            }
                            if (d != 5) {
                                ccpgVar.k(ccinVar, bindData, str2, Optional.empty());
                                return elfo.e(ccinVar);
                            }
                            MessagesTable.BindData bindData5 = (MessagesTable.BindData) ccinVar.b().get();
                            ekzz f7 = eleg.f("CmsMessageObjectConsumerDelegate#deduplicateForXmsAsync");
                            try {
                                final MessageIdType D4 = bindData5.D();
                                ensk h7 = ccpg.b.h();
                                h7.Y(ente.a, "BugleCms");
                                ((enrr) ((enrr) h7).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/CmsMessageObjectConsumerDelegate", "deduplicateForXmsAsync", 1882, "CmsMessageObjectConsumerDelegate.java")).D("Deduplicating XMS message with message id: %s, cmsId: %s", D4, bindData.R());
                                elfl a6 = ccpgVar.d.a(bindData5, bindData, engwVar, eshhVar);
                                f7.b(a6);
                                elfl h8 = a6.h(new emwl() { // from class: ccoh
                                    @Override // defpackage.emwl
                                    public final Object apply(Object obj2) {
                                        enru enruVar = ccpg.b;
                                        return MessageIdType.this;
                                    }
                                }, ccpgVar.e);
                                f7.close();
                                return h8.h(new emwl() { // from class: ccmz
                                    @Override // defpackage.emwl
                                    public final Object apply(Object obj2) {
                                        Optional of = Optional.of((MessageIdType) obj2);
                                        ccpg ccpgVar2 = ccpg.this;
                                        ccin ccinVar2 = ccinVar;
                                        ccpgVar2.k(ccinVar2, bindData, str2, of);
                                        return ccinVar2;
                                    }
                                }, ccpgVar.e);
                            } catch (Throwable th7) {
                                try {
                                    f7.close();
                                } catch (Throwable th8) {
                                    th7.addSuppressed(th8);
                                }
                                throw th7;
                            }
                        }
                    }, this.e).h(new emwl() { // from class: ccnc
                        @Override // defpackage.emwl
                        public final Object apply(Object obj) {
                            return Boolean.valueOf(((ccin) obj).c());
                        }
                    }, this.f).f(cduy.class, new eroh() { // from class: ccnd
                        @Override // defpackage.eroh
                        public final ListenableFuture a(Object obj) {
                            MessageIdType messageIdType = ((cduy) obj).a;
                            MessagesTable.BindData bindData = a2;
                            engw engwVar = n;
                            eshh eshhVar = b2;
                            String str2 = str;
                            ccpg ccpgVar = ccpg.this;
                            return ccpgVar.c(messageIdType, bindData, engwVar, eshhVar, str2, z).h(new emwl() { // from class: ccns
                                @Override // defpackage.emwl
                                public final Object apply(Object obj2) {
                                    enru enruVar = ccpg.b;
                                    return true;
                                }
                            }, ccpgVar.f);
                        }
                    }, this.e);
                    f2.close();
                    elfl h = f3.h(new emwl() { // from class: ccop
                        @Override // defpackage.emwl
                        public final Object apply(Object obj) {
                            if (((Boolean) obj).booleanValue()) {
                                return null;
                            }
                            boolean z3 = z;
                            eszz eszzVar2 = eszzVar;
                            eshh eshhVar = b2;
                            List list = c;
                            ccpg.this.i(a2, list, eshhVar, eszzVar2.c, z3);
                            return null;
                        }
                    }, this.e);
                    boolean z3 = true;
                    boolean z4 = csgj.a() && ((Boolean) ((cfup) csgj.o.get()).e()).booleanValue() && !z2 && !this.A.a();
                    if (!csgj.a()) {
                        z3 = z4;
                    } else if (!z4 || !z) {
                        z3 = false;
                    }
                    return z3 ? h.i(new eroh() { // from class: ccoz
                        @Override // defpackage.eroh
                        public final ListenableFuture a(Object obj) {
                            return ccpg.this.h.s();
                        }
                    }, this.f).i(new eroh() { // from class: ccpa
                        @Override // defpackage.eroh
                        public final ListenableFuture a(Object obj) {
                            return ((Boolean) obj).booleanValue() ? ccpg.this.h.u(1L) : elfo.e(null);
                        }
                    }, this.f) : h;
                } catch (Throwable th) {
                    th = th;
                    Throwable th2 = th;
                    try {
                        f2.close();
                        throw th2;
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                        throw th2;
                    }
                }
            } catch (Throwable th4) {
                th = th4;
            }
        } finally {
        }
    }

    public final elfl f(final String str, final Optional optional, final engw engwVar, final Map map, final Map map2, final Map map3, final Map map4, final Map map5, final enhd enhdVar) {
        return elfo.h(new erog() { // from class: ccnr
            @Override // defpackage.erog
            public final ListenableFuture a() {
                int i = engw.d;
                final engr engrVar = new engr();
                final ccpg ccpgVar = ccpg.this;
                final engw engwVar2 = engwVar;
                final String str2 = str;
                final Optional optional2 = optional;
                final Map map6 = map;
                final Map map7 = map2;
                final Map map8 = map3;
                final Map map9 = map4;
                final Map map10 = map5;
                final enhd enhdVar2 = enhdVar;
                ((Boolean) ccpgVar.g.b(new emyl() { // from class: ccmo
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Removed duplicated region for block: B:157:0x0a75 A[Catch: all -> 0x0b56, TRY_LEAVE, TryCatch #29 {all -> 0x0b56, blocks: (B:187:0x0b09, B:188:0x0b11, B:190:0x0b17, B:224:0x04c0, B:227:0x04c7, B:286:0x0821, B:285:0x081e, B:304:0x078c, B:154:0x0a61, B:155:0x0a6f, B:157:0x0a75, B:159:0x0a7c, B:164:0x0a95, B:167:0x0aa5, B:172:0x0ab3, B:175:0x0af6, B:185:0x0b04, B:184:0x0b01, B:186:0x0b05, B:216:0x0a45, B:312:0x0805, B:143:0x0844, B:146:0x0866, B:147:0x08d7, B:149:0x08dd, B:151:0x08f9, B:195:0x0945, B:198:0x0955, B:199:0x0957, B:200:0x09b7, B:202:0x09bd, B:204:0x09d6, B:207:0x0a07, B:209:0x0a0f, B:174:0x0ab9, B:180:0x0afc), top: B:131:0x047b, inners: #14, #19, #21 }] */
                    /* JADX WARN: Removed duplicated region for block: B:172:0x0ab3 A[Catch: all -> 0x0b56, TRY_LEAVE, TryCatch #29 {all -> 0x0b56, blocks: (B:187:0x0b09, B:188:0x0b11, B:190:0x0b17, B:224:0x04c0, B:227:0x04c7, B:286:0x0821, B:285:0x081e, B:304:0x078c, B:154:0x0a61, B:155:0x0a6f, B:157:0x0a75, B:159:0x0a7c, B:164:0x0a95, B:167:0x0aa5, B:172:0x0ab3, B:175:0x0af6, B:185:0x0b04, B:184:0x0b01, B:186:0x0b05, B:216:0x0a45, B:312:0x0805, B:143:0x0844, B:146:0x0866, B:147:0x08d7, B:149:0x08dd, B:151:0x08f9, B:195:0x0945, B:198:0x0955, B:199:0x0957, B:200:0x09b7, B:202:0x09bd, B:204:0x09d6, B:207:0x0a07, B:209:0x0a0f, B:174:0x0ab9, B:180:0x0afc), top: B:131:0x047b, inners: #14, #19, #21 }] */
                    /* JADX WARN: Removed duplicated region for block: B:190:0x0b17 A[Catch: all -> 0x0b56, LOOP:4: B:188:0x0b11->B:190:0x0b17, LOOP_END, TRY_LEAVE, TryCatch #29 {all -> 0x0b56, blocks: (B:187:0x0b09, B:188:0x0b11, B:190:0x0b17, B:224:0x04c0, B:227:0x04c7, B:286:0x0821, B:285:0x081e, B:304:0x078c, B:154:0x0a61, B:155:0x0a6f, B:157:0x0a75, B:159:0x0a7c, B:164:0x0a95, B:167:0x0aa5, B:172:0x0ab3, B:175:0x0af6, B:185:0x0b04, B:184:0x0b01, B:186:0x0b05, B:216:0x0a45, B:312:0x0805, B:143:0x0844, B:146:0x0866, B:147:0x08d7, B:149:0x08dd, B:151:0x08f9, B:195:0x0945, B:198:0x0955, B:199:0x0957, B:200:0x09b7, B:202:0x09bd, B:204:0x09d6, B:207:0x0a07, B:209:0x0a0f, B:174:0x0ab9, B:180:0x0afc), top: B:131:0x047b, inners: #14, #19, #21 }] */
                    /* JADX WARN: Type inference failed for: r10v0, types: [java.util.Map] */
                    /* JADX WARN: Type inference failed for: r21v0, types: [long] */
                    /* JADX WARN: Type inference failed for: r21v14 */
                    /* JADX WARN: Type inference failed for: r21v15 */
                    /* JADX WARN: Type inference failed for: r21v16 */
                    /* JADX WARN: Type inference failed for: r21v17 */
                    /* JADX WARN: Type inference failed for: r21v18 */
                    /* JADX WARN: Type inference failed for: r21v19 */
                    /* JADX WARN: Type inference failed for: r21v28 */
                    /* JADX WARN: Type inference failed for: r21v29 */
                    /* JADX WARN: Type inference failed for: r21v4 */
                    /* JADX WARN: Type inference failed for: r21v5 */
                    /* JADX WARN: Type inference failed for: r21v9 */
                    /* JADX WARN: Type inference failed for: r28v0 */
                    /* JADX WARN: Type inference failed for: r28v1 */
                    /* JADX WARN: Type inference failed for: r28v10 */
                    /* JADX WARN: Type inference failed for: r28v21 */
                    /* JADX WARN: Type inference failed for: r28v9 */
                    /* JADX WARN: Type inference failed for: r29v2 */
                    /* JADX WARN: Type inference failed for: r29v3, types: [engr] */
                    /* JADX WARN: Type inference failed for: r29v31 */
                    /* JADX WARN: Type inference failed for: r9v10 */
                    /* JADX WARN: Type inference failed for: r9v11 */
                    /* JADX WARN: Type inference failed for: r9v14 */
                    /* JADX WARN: Type inference failed for: r9v4, types: [engr] */
                    /* JADX WARN: Type inference failed for: r9v7 */
                    /* JADX WARN: Type inference failed for: r9v8 */
                    /* JADX WARN: Type inference failed for: r9v9 */
                    @Override // defpackage.emyl
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Object get() {
                        /*
                            Method dump skipped, instructions count: 2950
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: defpackage.ccmo.get():java.lang.Object");
                    }
                })).booleanValue();
                return elfo.e(engrVar.g());
            }
        }, this.e);
    }

    public final elfl g() {
        return this.h.q().i(new eroh() { // from class: ccnq
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                if (!((Boolean) obj).booleanValue()) {
                    return elfo.e("");
                }
                final tfw tfwVar = (tfw) ccpg.this.j.b();
                return tfwVar.e.g().i(new eroh() { // from class: tfo
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj2) {
                        axei axeiVar = (axei) obj2;
                        long longValue = axeiVar.d + ((Long) tfw.a.e()).longValue();
                        tfw tfwVar2 = tfw.this;
                        return longValue > tfwVar2.f.f().toEpochMilli() ? erqt.i(axeiVar.c) : tfwVar2.b();
                    }
                }, tfwVar.g);
            }
        }, this.f);
    }

    public final elfl h() {
        return this.h.q().i(new eroh() { // from class: ccpc
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                if (!((Boolean) obj).booleanValue()) {
                    return elfo.e(Optional.empty());
                }
                ccpg ccpgVar = ccpg.this;
                final tfw tfwVar = (tfw) ccpgVar.j.b();
                return tfwVar.e.g().i(new eroh() { // from class: tfp
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj2) {
                        axei axeiVar = (axei) obj2;
                        long longValue = axeiVar.d + ((Long) tfw.a.e()).longValue();
                        final tfw tfwVar2 = tfw.this;
                        return longValue > tfwVar2.f.f().toEpochMilli() ? erqt.i(tfwVar2.j.n(axeiVar.c)) : tfwVar2.c.a().h(new emwl() { // from class: tfn
                            /* JADX WARN: Type inference failed for: r2v4, types: [comc, java.lang.Object] */
                            @Override // defpackage.emwl
                            public final Object apply(Object obj3) {
                                tfw tfwVar3 = tfw.this;
                                aoku a2 = tfwVar3.a((fbew) obj3);
                                String o = a2.o();
                                efbd.b();
                                axeh axehVar = (axeh) axei.a.createBuilder();
                                axehVar.copyOnWrite();
                                axei axeiVar2 = (axei) axehVar.instance;
                                axeiVar2.b |= 1;
                                axeiVar2.c = o;
                                axkm axkmVar = tfwVar3.e;
                                long epochMilli = axkmVar.d.f().toEpochMilli();
                                axehVar.copyOnWrite();
                                axei axeiVar3 = (axei) axehVar.instance;
                                axeiVar3.b |= 2;
                                axeiVar3.d = epochMilli;
                                final axei axeiVar4 = (axei) axehVar.build();
                                axkmVar.e.get().m(new emwl() { // from class: axih
                                    @Override // defpackage.emwl
                                    public final Object apply(Object obj4) {
                                        cskc cskcVar = axkm.a;
                                        axep builder = ((axez) obj4).toBuilder();
                                        builder.copyOnWrite();
                                        axez axezVar = (axez) builder.instance;
                                        axei axeiVar5 = axei.this;
                                        axeiVar5.getClass();
                                        axezVar.u = axeiVar5;
                                        axezVar.b |= 131072;
                                        return builder.build();
                                    }
                                });
                                axkmVar.N();
                                return a2;
                            }
                        }, tfwVar2.h);
                    }
                }, tfwVar.g).h(new emwl() { // from class: ccnk
                    @Override // defpackage.emwl
                    public final Object apply(Object obj2) {
                        return Optional.of((aoku) obj2);
                    }
                }, ccpgVar.f);
            }
        }, this.f);
    }

    public final void i(MessagesTable.BindData bindData, final List list, final eshh eshhVar, final String str, final boolean z) {
        if (!z && !cbvv.h(bindData.s())) {
            Uri a2 = this.z.a(bindData, engw.n(list));
            if (a2 == null) {
                throw new ccpq(csgx.RETRY);
            }
            buoy H = bindData.H();
            H.am(a2);
            bindData = H.a();
        }
        final MessagesTable.BindData bindData2 = bindData;
    }

    public final elfl j(final engw engwVar, final Optional optional) {
        final enhk enhkVar = (enhk) Collection.EL.stream(engwVar).collect(endq.a(new Function() { // from class: ccok
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((eszz) obj).c;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }, Function$CC.identity()));
        final HashMap hashMap = new HashMap();
        final HashMap hashMap2 = new HashMap();
        final HashMap hashMap3 = new HashMap();
        final HashMap hashMap4 = new HashMap();
        final HashMap hashMap5 = new HashMap();
        final enhd enhdVar = new enhd();
        final elfl i = this.h.q().i(new eroh() { // from class: ccol
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                boolean booleanValue = ((Boolean) obj).booleanValue();
                final ccpg ccpgVar = ccpg.this;
                final engw engwVar2 = engwVar;
                final Map map = hashMap;
                final Map map2 = hashMap2;
                final Map map3 = hashMap3;
                final Map map4 = hashMap4;
                final Map map5 = hashMap5;
                final enhd enhdVar2 = enhdVar;
                if (!booleanValue) {
                    return ccpgVar.f("", Optional.empty(), engwVar2, map, map2, map3, map4, map5, enhdVar2);
                }
                cfva cfvaVar = aoqm.a;
                return ((Boolean) new aoqd().get()).booleanValue() ? ccpgVar.h().i(new eroh() { // from class: ccmx
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj2) {
                        return ccpg.this.f("", (Optional) obj2, engwVar2, map, map2, map3, map4, map5, enhdVar2);
                    }
                }, erpp.a) : ccpgVar.g().i(new eroh() { // from class: ccni
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj2) {
                        return ccpg.this.f((String) obj2, Optional.empty(), engwVar2, map, map2, map3, map4, map5, enhdVar2);
                    }
                }, erpp.a);
            }
        }, erpp.a);
        elfl i2 = i.i(new eroh() { // from class: ccom
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                enru enruVar = ccpg.b;
                Consumer consumer = new Consumer() { // from class: ccnm
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void o(Object obj2) {
                        enru enruVar2 = ccpg.b;
                        ((cenp) obj2).a("getLists and deduplication results");
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer2) {
                        return Consumer$CC.$default$andThen(this, consumer2);
                    }
                };
                Optional optional2 = Optional.this;
                optional2.ifPresent(consumer);
                Stream map = Collection.EL.stream((engw) obj).map(new ccnn());
                int i3 = engw.d;
                engw engwVar2 = (engw) map.collect(endq.a);
                optional2.ifPresent(new Consumer() { // from class: ccno
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void o(Object obj2) {
                        enru enruVar2 = ccpg.b;
                        ((cenp) obj2).a("Deduplication logic");
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer2) {
                        return Consumer$CC.$default$andThen(this, consumer2);
                    }
                });
                return elfo.e(engwVar2);
            }
        }, this.e).h(new emwl() { // from class: ccon
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                final ccpg ccpgVar;
                eshh eshhVar;
                engw engwVar2 = (engw) obj;
                boolean isEmpty = engwVar2.isEmpty();
                enhd enhdVar2 = enhdVar;
                if (isEmpty) {
                    ensk h = ccpg.b.h();
                    h.Y(ente.a, "BugleCms");
                    ((enrr) ((enrr) h).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/CmsMessageObjectConsumerDelegate", "executeRestoreCmsItemDataList", 483, "CmsMessageObjectConsumerDelegate.java")).q("0 messages to be inserted in BugleDb.");
                    return enhdVar2.c();
                }
                ensk h2 = ccpg.b.h();
                h2.Y(ente.a, "BugleCms");
                ((enrr) ((enrr) h2).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/CmsMessageObjectConsumerDelegate", "executeRestoreCmsItemDataList", 486, "CmsMessageObjectConsumerDelegate.java")).w("Bulk inserting %d messages in BugleDb. Messages CMS Id's=%s", engwVar2.size(), engwVar2);
                engr engrVar = new engr();
                int size = engwVar2.size();
                int i3 = 0;
                while (true) {
                    ccpgVar = ccpg.this;
                    if (i3 >= size) {
                        break;
                    }
                    Map map = hashMap3;
                    Map map2 = hashMap;
                    String str = (String) engwVar2.get(i3);
                    MessagesTable.BindData bindData = (MessagesTable.BindData) map2.get(str);
                    bindData.getClass();
                    engw engwVar3 = (engw) map.get(str);
                    engwVar3.getClass();
                    ashs ashsVar = ccpgVar.p;
                    Optional empty = Optional.empty();
                    if (ashsVar.a() && csgj.a() && (eshhVar = (eshh) hashMap4.get(str)) != null) {
                        empty = Optional.of(eshhVar);
                    }
                    Map map3 = hashMap2;
                    final cbzm cbzmVar = new cbzm();
                    cbzmVar.c(str);
                    cbzmVar.a = bindData;
                    cbzmVar.b = engwVar3;
                    empty.ifPresent(new Consumer() { // from class: ccnu
                        @Override // java.util.function.Consumer
                        /* renamed from: accept */
                        public final void o(Object obj2) {
                            ccuc.this.b((eshh) obj2);
                        }

                        public final /* synthetic */ Consumer andThen(Consumer consumer) {
                            return Consumer$CC.$default$andThen(this, consumer);
                        }
                    });
                    bton btonVar = (bton) map3.get(str);
                    if (btonVar != null) {
                        cbzmVar.c = btonVar;
                    }
                    engrVar.h(cbzmVar.a());
                    i3++;
                }
                final engw g = engrVar.g();
                if (!g.isEmpty()) {
                    try {
                        ccpgVar.g.d("CmsMessageObjectConsumer#bulkRestoreCmsMessageToBugleDb", new Runnable() { // from class: ccnp
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // java.lang.Runnable
                            public final void run() {
                                engw engwVar4;
                                int i4;
                                engw engwVar5 = g;
                                long[] A = dtub.A(MessagesTable.f(), 0, true, new BiConsumer() { // from class: buof
                                    @Override // java.util.function.BiConsumer
                                    public final void accept(Object obj2, Object obj3) {
                                        MessagesTable.BindData bindData2 = (MessagesTable.BindData) obj2;
                                        final Long l = (Long) obj3;
                                        String[] strArr = MessagesTable.a;
                                        if (l.longValue() >= 0) {
                                            bindData2.a = (MessageIdType) new dtuj() { // from class: buoh
                                                @Override // defpackage.dtuj
                                                public final Object a() {
                                                    String[] strArr2 = MessagesTable.a;
                                                    return new MessageIdType(l.longValue());
                                                }
                                            }.a();
                                            bindData2.fY(0);
                                        }
                                    }

                                    public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                                        return BiConsumer$CC.$default$andThen(this, biConsumer);
                                    }
                                }, (MessagesTable.BindData[]) Collection.EL.stream(engwVar5).map(new Function() { // from class: ccnx
                                    @Override // java.util.function.Function
                                    /* renamed from: andThen */
                                    public final /* synthetic */ Function mo448andThen(Function function) {
                                        return Function$CC.$default$andThen(this, function);
                                    }

                                    @Override // java.util.function.Function
                                    public final Object apply(Object obj2) {
                                        enru enruVar = ccpg.b;
                                        buoy H = ((ccud) obj2).b().H();
                                        H.l(csgg.CMS_RESTORE_IN_PROGRESS);
                                        return H.a();
                                    }

                                    public final /* synthetic */ Function compose(Function function) {
                                        return Function$CC.$default$compose(this, function);
                                    }
                                }).toArray(new IntFunction() { // from class: ccny
                                    @Override // java.util.function.IntFunction
                                    public final Object apply(int i5) {
                                        enru enruVar = ccpg.b;
                                        return new MessagesTable.BindData[i5];
                                    }
                                }));
                                if (A == null) {
                                    throw new csgt(79, "Returned message ids list from bugle bulk insertion is null!", csgx.NO_RETRY);
                                }
                                enou enouVar = (enou) engwVar5;
                                emxf.b(enouVar.c == A.length, "Container list's size is not equal to length of returned message ids!");
                                final engw engwVar6 = (engw) DesugarArrays.stream(A).mapToObj(new LongFunction() { // from class: ccnz
                                    @Override // java.util.function.LongFunction
                                    public final Object apply(long j) {
                                        enru enruVar = ccpg.b;
                                        return new MessageIdType(j);
                                    }
                                }).collect(endq.a);
                                cbzj cbzjVar = new cbzj();
                                cbzjVar.a(enou.a);
                                engr engrVar2 = new engr();
                                engr engrVar3 = new engr();
                                for (int i5 = 0; i5 < enouVar.c; i5++) {
                                    ccud ccudVar = (ccud) engwVar5.get(i5);
                                    engw c = ccudVar.c();
                                    int size2 = c.size();
                                    for (int i6 = 0; i6 < size2; i6++) {
                                        bvwp w = ((PartsTable.BindData) c.get(i6)).w();
                                        w.J((MessageIdType) engwVar6.get(i5));
                                        engrVar2.h(new cbzl(ccudVar.b(), w.a()));
                                    }
                                    bton a2 = ccudVar.a();
                                    if (a2 != null) {
                                        btos btosVar = new btos();
                                        btosVar.c(a2, false, a2.cJ);
                                        btosVar.m((MessageIdType) engwVar6.get(i5));
                                        engrVar3.h(btosVar.a());
                                    }
                                }
                                engw g2 = engrVar2.g();
                                if (g2 == null) {
                                    throw new NullPointerException("Null partAndAssociatedMessageList");
                                }
                                cbzjVar.a = g2;
                                cbzjVar.a(engrVar3.g());
                                engw engwVar7 = cbzjVar.a;
                                if (engwVar7 == null || (engwVar4 = cbzjVar.b) == null) {
                                    StringBuilder sb = new StringBuilder();
                                    if (cbzjVar.a == null) {
                                        sb.append(" partAndAssociatedMessageList");
                                    }
                                    if (cbzjVar.b == null) {
                                        sb.append(" linkPreviewList");
                                    }
                                    throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
                                }
                                ccpg ccpgVar2 = ccpg.this;
                                cbzk cbzkVar = new cbzk(engwVar7, engwVar4);
                                engw engwVar8 = cbzkVar.a;
                                long[] A2 = dtub.A(PartsTable.d(), 0, true, new BiConsumer() { // from class: bvwb
                                    @Override // java.util.function.BiConsumer
                                    public final void accept(Object obj2, Object obj3) {
                                        PartsTable.BindData bindData2 = (PartsTable.BindData) obj2;
                                        final Long l = (Long) obj3;
                                        String[] strArr = PartsTable.a;
                                        if (l.longValue() >= 0) {
                                            bindData2.a = (String) new dtuj() { // from class: bvwa
                                                @Override // defpackage.dtuj
                                                public final Object a() {
                                                    String[] strArr2 = PartsTable.a;
                                                    return String.valueOf(l);
                                                }
                                            }.a();
                                            bindData2.fY(0);
                                        }
                                    }

                                    public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                                        return BiConsumer$CC.$default$andThen(this, biConsumer);
                                    }
                                }, (PartsTable.BindData[]) Collection.EL.stream(engwVar8).map(new Function() { // from class: ccoa
                                    @Override // java.util.function.Function
                                    /* renamed from: andThen */
                                    public final /* synthetic */ Function mo448andThen(Function function) {
                                        return Function$CC.$default$andThen(this, function);
                                    }

                                    @Override // java.util.function.Function
                                    public final Object apply(Object obj2) {
                                        return ((ccpf) obj2).b();
                                    }

                                    public final /* synthetic */ Function compose(Function function) {
                                        return Function$CC.$default$compose(this, function);
                                    }
                                }).toArray(new IntFunction() { // from class: ccob
                                    @Override // java.util.function.IntFunction
                                    public final Object apply(int i7) {
                                        enru enruVar = ccpg.b;
                                        return new PartsTable.BindData[i7];
                                    }
                                }));
                                if (ccpgVar2.p.a() && csgj.a()) {
                                    final engr engrVar4 = new engr();
                                    for (final int i7 = 0; i7 < enouVar.c; i7++) {
                                        final ccud ccudVar2 = (ccud) engwVar5.get(i7);
                                        ccudVar2.d().ifPresent(new Consumer() { // from class: ccoj
                                            /* JADX WARN: Multi-variable type inference failed */
                                            @Override // java.util.function.Consumer
                                            /* renamed from: accept */
                                            public final void o(Object obj2) {
                                                enru enruVar = ccpg.b;
                                                engr.this.h(new cefk(((MessageIdType) engwVar6.get(i7)).b(), ccudVar2.e(), (eshh) obj2));
                                            }

                                            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                                return Consumer$CC.$default$andThen(this, consumer);
                                            }
                                        });
                                    }
                                    ccpgVar2.o.a(engrVar4.g(), 2);
                                    cefl ceflVar = ccpgVar2.o;
                                    engw engwVar9 = (engw) Collection.EL.stream(engwVar5).map(new ccnn()).collect(endq.a);
                                    engwVar9.getClass();
                                    engw<bqrw> a3 = csct.a(engwVar9);
                                    ArrayList arrayList = new ArrayList(ffdx.n(a3, 10));
                                    for (bqrw bqrwVar : a3) {
                                        String valueOf = String.valueOf(bqrwVar.k());
                                        String m = bqrwVar.m();
                                        m.getClass();
                                        eshf eshfVar = (eshf) eshh.a.createBuilder();
                                        eshfVar.a(bqrwVar.l().name(), eyee.x(bqrwVar.n()));
                                        eyfy build = eshfVar.build();
                                        build.getClass();
                                        arrayList.add(new cefk(valueOf, m, (eshh) build));
                                    }
                                    ceflVar.a(arrayList, 2);
                                }
                                engw engwVar10 = cbzkVar.b;
                                if (engwVar10.isEmpty()) {
                                    i4 = 0;
                                } else {
                                    i4 = 0;
                                    dtub.A(btqq.c(), 5, false, new BiConsumer() { // from class: btoe
                                        @Override // java.util.function.BiConsumer
                                        public final void accept(Object obj2, Object obj3) {
                                            bton btonVar2 = (bton) obj2;
                                            Long l = (Long) obj3;
                                            String[] strArr = btqq.a;
                                            if (l.longValue() >= 0) {
                                                btonVar2.a = new btof(l).a.longValue();
                                                btonVar2.fY(0);
                                            }
                                        }

                                        public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                                            return BiConsumer$CC.$default$andThen(this, biConsumer);
                                        }
                                    }, (bton[]) Collection.EL.stream(engwVar10).toArray(new IntFunction() { // from class: ccoc
                                        @Override // java.util.function.IntFunction
                                        public final Object apply(int i8) {
                                            enru enruVar = ccpg.b;
                                            return new bton[i8];
                                        }
                                    }));
                                }
                                buxr buxrVar = new buxr();
                                buxrVar.m(csgg.RESTORED_FROM_CMS);
                                buxz buxzVar = new buxz();
                                buxzVar.u(engwVar6);
                                buxrVar.X(buxzVar);
                                buxrVar.ap("bulkRestoreCmsMessageToBugleDb-cmsLifeCycle-restored");
                                buxrVar.b().e();
                                if (A2 == null) {
                                    throw new csgt(80, "Returned part ids list from bugle bulk insertion is null!", csgx.NO_RETRY);
                                }
                                enou enouVar2 = (enou) engwVar8;
                                if (A2.length != enouVar2.c) {
                                    throw new csgt(81, "Returned parts id size is different from Part data list size!", csgx.NO_RETRY);
                                }
                                if (ccpgVar2.s.a()) {
                                    return;
                                }
                                for (int i8 = i4; i8 < enouVar2.c; i8++) {
                                    long j = A2[i8];
                                    ccpf ccpfVar = (ccpf) engwVar8.get(i8);
                                    if (le.q(ccpfVar.b().H())) {
                                        ccpgVar2.r.b(ccpfVar.b().v(), ccpfVar.a().R(), String.valueOf(j), ccpgVar2.k.a(), true);
                                    }
                                }
                            }
                        });
                    } catch (RuntimeException e) {
                        if ((e instanceof csgt) && ((csgt) e).b == csgx.RETRY) {
                            throw e;
                        }
                        ensk j = ccpg.b.j();
                        j.Y(ente.a, "BugleCms");
                        ((enrr) ((enrr) ((enrr) j).g(e)).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/CmsMessageObjectConsumerDelegate", "bulkRestoreCmsMessagesWithIterativeFallback", (char) 623, "CmsMessageObjectConsumerDelegate.java")).q("Bulk insert failed with non retriable exception. Falling back to iterative insert.");
                        if (((ersq) ((asyz) ccpgVar.y).a.b()).a("bugle.log_restore_failure_for_iterative_fallback")) {
                            ccpgVar.x.w(2, true, 0, e, 0, null);
                        }
                        int i4 = ((enou) g).c;
                        for (int i5 = 0; i5 < i4; i5++) {
                            ccud ccudVar = (ccud) g.get(i5);
                            try {
                                ccpgVar.i(ccudVar.b(), ccudVar.c(), (eshh) (ccudVar.d().isPresent() ? ccudVar.d().get() : eshh.a), ccudVar.e(), true);
                            } catch (RuntimeException e2) {
                                eszz eszzVar = (eszz) enhkVar.get(ccudVar.e());
                                eszzVar.getClass();
                                enhdVar2.k(eszzVar, e2);
                            }
                        }
                    }
                }
                optional.ifPresent(new Consumer() { // from class: ccnv
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void o(Object obj2) {
                        enru enruVar = ccpg.b;
                        ((cenp) obj2).a("BugleDb bulk insert");
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
                return enhdVar2.c();
            }
        }, this.e).i(new eroh() { // from class: ccoo
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                enhk enhkVar2 = (enhk) obj;
                if (enhkVar2.isEmpty()) {
                    return elfo.e(enhkVar2);
                }
                ArrayList arrayList = new ArrayList();
                final enhd enhdVar2 = new enhd();
                enqu listIterator = enhkVar2.entrySet().listIterator();
                while (true) {
                    ccpg ccpgVar = ccpg.this;
                    if (!listIterator.hasNext()) {
                        return elfo.j(arrayList).a(new Callable() { // from class: ccnf
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                return enhd.this.c();
                            }
                        }, ccpgVar.f);
                    }
                    Map.Entry entry = (Map.Entry) listIterator.next();
                    if (entry.getValue() instanceof cduy) {
                        Map map = hashMap4;
                        Map map2 = hashMap3;
                        Map map3 = hashMap;
                        final eszz eszzVar = (eszz) entry.getKey();
                        String str = eszzVar.c;
                        MessageIdType messageIdType = ((cduy) entry.getValue()).a;
                        MessagesTable.BindData bindData = (MessagesTable.BindData) map3.get(str);
                        bindData.getClass();
                        engw engwVar2 = (engw) map2.get(str);
                        engwVar2.getClass();
                        eshh eshhVar = (eshh) map.get(str);
                        eshhVar.getClass();
                        arrayList.add(ccpgVar.c(messageIdType, bindData, engwVar2, eshhVar, str, true).e(Exception.class, new emwl() { // from class: ccne
                            @Override // defpackage.emwl
                            public final Object apply(Object obj2) {
                                enru enruVar = ccpg.b;
                                enhd.this.k(eszzVar, (Exception) obj2);
                                return null;
                            }
                        }, ccpgVar.f));
                    } else {
                        enhdVar2.i(entry);
                    }
                }
            }
        }, this.e);
        if (this.t.a()) {
            i2 = i2.i(new eroh() { // from class: ccoq
                @Override // defpackage.eroh
                public final ListenableFuture a(Object obj) {
                    final enhk enhkVar2 = (enhk) obj;
                    final Map map = hashMap5;
                    final ccpg ccpgVar = ccpg.this;
                    final enhk enhkVar3 = enhkVar;
                    return i.h(new emwl() { // from class: ccou
                        @Override // defpackage.emwl
                        public final Object apply(Object obj2) {
                            ekzz f = eleg.f("CmsMessageObjectConsumerDelegate#deleteMessagesWithPartsFromSameConversation");
                            enhk enhkVar4 = enhkVar3;
                            Map map2 = map;
                            enhk enhkVar5 = enhkVar2;
                            ccpg ccpgVar2 = ccpg.this;
                            try {
                                enhd enhdVar2 = new enhd();
                                enhdVar2.g(enhkVar5);
                                for (Map.Entry entry : map2.entrySet()) {
                                    String str = (String) entry.getKey();
                                    final enip g = ((enin) entry.getValue()).g();
                                    if (!g.isEmpty()) {
                                        buxo d = MessagesTable.d();
                                        d.z("CmsMessageObjectConsumerDelegate#deleteMessagesWithPartsFromSameConversation");
                                        d.h(new Function() { // from class: ccnj
                                            @Override // java.util.function.Function
                                            /* renamed from: andThen */
                                            public final /* synthetic */ Function mo448andThen(Function function) {
                                                return Function$CC.$default$andThen(this, function);
                                            }

                                            @Override // java.util.function.Function
                                            public final Object apply(Object obj3) {
                                                buxz buxzVar = (buxz) obj3;
                                                enru enruVar = ccpg.b;
                                                buxzVar.g(enip.this);
                                                return buxzVar;
                                            }

                                            public final /* synthetic */ Function compose(Function function) {
                                                return Function$CC.$default$compose(this, function);
                                            }
                                        });
                                        engw g2 = d.b().g();
                                        try {
                                            ensk h = ccpg.b.h();
                                            h.Y(ente.a, "BugleCms");
                                            ((enrr) ((enrr) h).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/CmsMessageObjectConsumerDelegate", "deleteMessagesWithPartsFromSameConversation", 1981, "CmsMessageObjectConsumerDelegate.java")).D("%s: Deleting messages with parts from same conversation: %s", "CmsMessageObjectConsumerDelegate", str);
                                            ccpgVar2.l.h(g2);
                                        } catch (RuntimeException e) {
                                            ensk j = ccpg.b.j();
                                            j.Y(ente.a, "BugleCms");
                                            ((enrr) ((enrr) ((enrr) j).g(e)).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/CmsMessageObjectConsumerDelegate", "deleteMessagesWithPartsFromSameConversation", 1988, "CmsMessageObjectConsumerDelegate.java")).D("%s: Failed to delete messages with parts from same conversation: %s", "CmsMessageObjectConsumerDelegate", str);
                                            enqu listIterator = g.listIterator();
                                            while (listIterator.hasNext()) {
                                                eszz eszzVar = (eszz) enhkVar4.get((String) listIterator.next());
                                                eszzVar.getClass();
                                                enhdVar2.k(eszzVar, e);
                                            }
                                        }
                                    }
                                }
                                f.close();
                                return enhdVar2;
                            } finally {
                            }
                        }
                    }, ccpgVar.e).h(new emwl() { // from class: ccov
                        @Override // defpackage.emwl
                        public final Object apply(Object obj2) {
                            return ((enhd) obj2).b();
                        }
                    }, ccpgVar.f).e(Exception.class, new emwl() { // from class: ccow
                        @Override // defpackage.emwl
                        public final Object apply(Object obj2) {
                            ensk j = ccpg.b.j();
                            j.Y(ente.a, "BugleCms");
                            ((enrr) ((enrr) ((enrr) j).g((Exception) obj2)).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/CmsMessageObjectConsumerDelegate", "deleteMessagesWithPartsFromSameConversation", 2005, "CmsMessageObjectConsumerDelegate.java")).t("%s: Failed to deleteMessagesWithPartsFromSameConversation", "CmsMessageObjectConsumerDelegate");
                            return enhk.this;
                        }
                    }, ccpgVar.f);
                }
            }, this.e);
        }
        return this.w.a() ? i2.i(new eroh() { // from class: ccor
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                final enhk enhkVar2 = (enhk) obj;
                return ccpg.this.v.b().h(new emwl() { // from class: ccmn
                    @Override // defpackage.emwl
                    public final Object apply(Object obj2) {
                        enru enruVar = ccpg.b;
                        return enhk.this;
                    }
                }, erpp.a);
            }
        }, erpp.a) : i2;
    }

    public final void k(ccin ccinVar, MessagesTable.BindData bindData, String str, Optional optional) {
        if (ccinVar.c()) {
            ConversationIdType C = bindData.C();
            if (optional.isEmpty()) {
                throw new ccpl(String.format("duplicate message found, but the duplicate message id is not set. cmsId: %s", str), csgx.NO_RETRY);
            }
            if (C.b()) {
                throw new ccph(String.format("ConversationId is not set for message: %s, cmsId: %s", optional.get(), str), csgx.NO_RETRY);
            }
            cbgf cbgfVar = this.i;
            Object obj = optional.get();
            String[] strArr = MessagesTable.a;
            cbgfVar.l(C, (MessageIdType) obj, "messages");
        }
        ((akzt) this.m.b()).e("Bugle.Cms.Restore.Message.Outcome", ccinVar.e() - 1);
        ((akzt) this.m.b()).g("Bugle.Cms.Restore.Message.DuplicateSearchDuration", this.n.a() - ccinVar.a());
    }
}
