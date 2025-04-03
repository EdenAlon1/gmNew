package defpackage;

import android.content.ContentValues;
import android.text.TextUtils;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.common.util.concurrent.ListenableFuture;
import io.grpc.Status;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class trv implements tqz {
    public static final cskc a = cskc.g("BugleCms", "ObjectEventHandler");
    public static final ensn b = new ensn("message_type", esjj.class, false, false);
    public static final ensn c = new ensn("blob_count", Integer.class, false, false);
    static final cfup d = cfvl.i(cfvl.b, "cms_use_block_list", false);
    public final csbt e;
    public final errl f;
    public final errl g;
    public final crty h;
    public final cgrq i;
    public final tqr j;
    public final ffbr k;
    public final dtuu l;
    public final ffbr m;
    public final ffbr n;
    public final asix o;
    public final ccjm p;
    private final cemb q;
    private final arep r;

    public trv(csbt csbtVar, crty crtyVar, cgrq cgrqVar, tqr tqrVar, ffbr ffbrVar, dtuu dtuuVar, ffbr ffbrVar2, errl errlVar, errl errlVar2, ffbr ffbrVar3, asix asixVar, cemb cembVar, ccjm ccjmVar, arep arepVar) {
        this.e = csbtVar;
        this.h = crtyVar;
        this.i = cgrqVar;
        this.j = tqrVar;
        this.k = ffbrVar;
        this.l = dtuuVar;
        this.m = ffbrVar2;
        this.f = errlVar;
        this.g = errlVar2;
        this.n = ffbrVar3;
        this.o = asixVar;
        this.q = cembVar;
        this.p = ccjmVar;
        this.r = arepVar;
    }

    public static bqou b(String str, String str2, csfy csfyVar) {
        String[] strArr = bqpw.a;
        bqox bqoxVar = new bqox();
        bqoxVar.b(str);
        bqoxVar.c(csfyVar);
        bqoxVar.d(str2);
        return bqoxVar.a();
    }

    @Override // defpackage.tqz
    public final /* bridge */ /* synthetic */ ListenableFuture a(eszk eszkVar) {
        elfl c2;
        if (eszkVar.b != 1) {
            csjb e = a.e();
            e.A(cdii.u.a, eszj.a(eszkVar.b));
            e.I("Cannot handle event");
            e.r();
            return elfo.e(null);
        }
        final etac etacVar = (etac) eszkVar.c;
        int i = etacVar.b;
        int b2 = etab.b(i);
        if (b2 == 0) {
            b2 = 1;
        }
        int i2 = b2 - 2;
        if (i2 != 3) {
            if (i2 == 4) {
                return elfo.g(new Callable() { // from class: trh
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        cskc cskcVar = trv.a;
                        return Optional.ofNullable(MessagesTable.a(etac.this.c));
                    }
                }, this.f).i(new eroh() { // from class: tri
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj) {
                        Optional optional = (Optional) obj;
                        boolean isEmpty = optional.isEmpty();
                        final trv trvVar = trv.this;
                        final etac etacVar2 = etacVar;
                        if (!isEmpty) {
                            final MessageIdType D = ((MessagesTable.BindData) optional.get()).D();
                            return elfl.g(trvVar.o.a() ? trvVar.i.b(D, cgrr.OBJECT_EVENT_TACHYON_DELETION) : trvVar.i.a(D)).h(new emwl() { // from class: trg
                                @Override // defpackage.emwl
                                public final Object apply(Object obj2) {
                                    int a2 = cgrs.a((ceyt) obj2);
                                    trv trvVar2 = trv.this;
                                    etac etacVar3 = etacVar2;
                                    MessageIdType messageIdType = D;
                                    if (a2 > 0) {
                                        csjb c3 = trv.a.c();
                                        String str = cdii.t.a;
                                        int b3 = etab.b(etacVar3.b);
                                        c3.A(str, etab.a(b3 != 0 ? b3 : 1));
                                        c3.A(cdii.v.a, "Delete message from db");
                                        c3.A(cdii.w.a, etacVar3.c);
                                        c3.A(cdii.c.a, messageIdType);
                                        c3.I("ObjectEvent received");
                                        c3.r();
                                        ((cryg) trvVar2.k.b()).f(messageIdType.b(), etacVar3.c, axue.CMS_EVENT_TYPE_DELETE_EVENT_RECEIVED, "success");
                                        return null;
                                    }
                                    csjb e2 = trv.a.e();
                                    String str2 = cdii.t.a;
                                    int b4 = etab.b(etacVar3.b);
                                    e2.A(str2, etab.a(b4 != 0 ? b4 : 1));
                                    e2.A(cdii.v.a, "Failed to delete message from db");
                                    e2.A(cdii.w.a, etacVar3.c);
                                    e2.A(cdii.c.a, messageIdType);
                                    e2.I("ObjectEvent received");
                                    e2.r();
                                    ((cryg) trvVar2.k.b()).f(messageIdType.b(), etacVar3.c, axue.CMS_EVENT_TYPE_DELETE_EVENT_RECEIVED, "Failed to delete message");
                                    throw new IllegalStateException("Failed to delete message. CmsId: ".concat(String.valueOf(etacVar3.c)));
                                }
                            }, trvVar.f);
                        }
                        if (((Boolean) trvVar.l.c("CmsDeletObjectFromNotificationsTable", new emyl() { // from class: tro
                            @Override // defpackage.emyl
                            public final Object get() {
                                etac etacVar3 = etacVar2;
                                final String str = etacVar3.c;
                                String[] strArr = bqrp.a;
                                bqri bqriVar = new bqri();
                                bqriVar.f("deleteObjectFromNotificationsTableIfExists#cmsNotificationsTable");
                                bqriVar.a(new Function() { // from class: tra
                                    @Override // java.util.function.Function
                                    /* renamed from: andThen */
                                    public final /* synthetic */ Function mo448andThen(Function function) {
                                        return Function$CC.$default$andThen(this, function);
                                    }

                                    @Override // java.util.function.Function
                                    public final Object apply(Object obj2) {
                                        bqro bqroVar = (bqro) obj2;
                                        cskc cskcVar = trv.a;
                                        bqroVar.b(str);
                                        return bqroVar;
                                    }

                                    public final /* synthetic */ Function compose(Function function) {
                                        return Function$CC.$default$compose(this, function);
                                    }
                                });
                                int d2 = bqriVar.d();
                                String[] strArr2 = bqpw.a;
                                bqpp bqppVar = new bqpp();
                                bqppVar.f("deleteObjectFromNotificationsTableIfExists#cmsMediaNotificationsTable");
                                bqppVar.a(new Function() { // from class: trl
                                    @Override // java.util.function.Function
                                    /* renamed from: andThen */
                                    public final /* synthetic */ Function mo448andThen(Function function) {
                                        return Function$CC.$default$andThen(this, function);
                                    }

                                    @Override // java.util.function.Function
                                    public final Object apply(Object obj2) {
                                        bqpv bqpvVar = (bqpv) obj2;
                                        cskc cskcVar = trv.a;
                                        bqpvVar.b(str);
                                        return bqpvVar;
                                    }

                                    public final /* synthetic */ Function compose(Function function) {
                                        return Function$CC.$default$compose(this, function);
                                    }
                                });
                                if (d2 + bqppVar.d() <= 0) {
                                    return false;
                                }
                                csjb c3 = trv.a.c();
                                String str2 = cdii.t.a;
                                int b3 = etab.b(etacVar3.b);
                                if (b3 == 0) {
                                    b3 = 1;
                                }
                                trv trvVar2 = trv.this;
                                c3.A(str2, etab.a(b3));
                                c3.A(cdii.v.a, "DeleteObjectNotifications");
                                c3.A(cdii.w.a, str);
                                c3.A(cdii.x.a, "Delete unassociated message notifications");
                                c3.I("ObjectEvent received");
                                c3.r();
                                ((cryg) trvVar2.k.b()).f("", etacVar3.c, axue.CMS_EVENT_TYPE_DELETE_EVENT_RECEIVED, "CmsId found in notifications table");
                                return true;
                            }
                        })).booleanValue()) {
                            return elfo.e(null);
                        }
                        ((cryg) trvVar.k.b()).f("", etacVar2.c, axue.CMS_EVENT_TYPE_DELETE_EVENT_RECEIVED, "CmsId not found in Db");
                        csjb c3 = trv.a.c();
                        String str = cdii.t.a;
                        int b3 = etab.b(etacVar2.b);
                        if (b3 == 0) {
                            b3 = 1;
                        }
                        c3.A(str, etab.a(b3));
                        c3.A(cdii.v.a, "Ignore");
                        c3.A(cdii.w.a, etacVar2.c);
                        c3.A(cdii.x.a, "CmsId not found in DB");
                        c3.I("ObjectEvent received");
                        c3.r();
                        return elfo.e(null);
                    }
                }, this.f);
            }
            csjb a2 = a.a();
            String str = cdii.t.a;
            int b3 = etab.b(etacVar.b);
            a2.A(str, etab.a(b3 != 0 ? b3 : 1));
            a2.A(cdii.v.a, "Ignore");
            a2.A(cdii.w.a, etacVar.c);
            a2.A(cdii.x.a, "Not implemented");
            a2.I("ObjectEvent received");
            a2.r();
            return elfo.e(null);
        }
        int b4 = etab.b(i);
        int i3 = b4 != 0 ? b4 : 1;
        boolean contains = etacVar.g.contains("key_content@message.cms.google");
        final String a3 = etab.a(i3);
        if (contains) {
            csjb a4 = a.a();
            a4.A(cdii.t.a, a3);
            a4.A(cdii.v.a, "Ignore key_content event");
            a4.A(cdii.w.a, etacVar.c);
            a4.I("ObjectEvent received");
            a4.r();
            return elfo.e(null);
        }
        if (!this.r.a() || !etacVar.f.contains("TBDBSD")) {
            final String str2 = etacVar.c;
            final String str3 = etacVar.e;
            return elfo.g(new Callable() { // from class: trm
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    cskc cskcVar = trv.a;
                    buxo d2 = MessagesTable.d();
                    d2.z("findMessageInDatabase");
                    final String str4 = str2;
                    final String str5 = str3;
                    d2.h(new Function() { // from class: trn
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo448andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            buxz buxzVar = (buxz) obj;
                            cskc cskcVar2 = trv.a;
                            final String str6 = str4;
                            final String str7 = str5;
                            buxzVar.b(new Function() { // from class: trj
                                @Override // java.util.function.Function
                                /* renamed from: andThen */
                                public final /* synthetic */ Function mo448andThen(Function function) {
                                    return Function$CC.$default$andThen(this, function);
                                }

                                @Override // java.util.function.Function
                                public final Object apply(Object obj2) {
                                    buxz buxzVar2 = (buxz) obj2;
                                    cskc cskcVar3 = trv.a;
                                    buxzVar2.f(str6);
                                    return buxzVar2;
                                }

                                public final /* synthetic */ Function compose(Function function) {
                                    return Function$CC.$default$compose(this, function);
                                }
                            }, new Function() { // from class: trk
                                @Override // java.util.function.Function
                                /* renamed from: andThen */
                                public final /* synthetic */ Function mo448andThen(Function function) {
                                    return Function$CC.$default$andThen(this, function);
                                }

                                @Override // java.util.function.Function
                                public final Object apply(Object obj2) {
                                    buxz buxzVar2 = (buxz) obj2;
                                    cskc cskcVar3 = trv.a;
                                    int intValue = MessagesTable.g().intValue();
                                    if (intValue < 46010) {
                                        dtub.w("cms_correlation_id", intValue);
                                    }
                                    buxzVar2.aq(new dtrt("messages.cms_correlation_id", 1, String.valueOf(str7)));
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
                    buuo buuoVar = (buuo) d2.b().o();
                    try {
                        if (buuoVar.getCount() <= 1) {
                            if (!buuoVar.moveToFirst()) {
                                buuoVar.close();
                                return bdhb.a;
                            }
                            MessageIdType q = buuoVar.q();
                            buuoVar.close();
                            return q;
                        }
                        csjb e2 = trv.a.e();
                        e2.A(cdii.w.a, str4);
                        e2.A(cdii.l.a, str5);
                        e2.I("Find more than one message in Bugle db based on unique ids");
                        e2.r();
                        throw new IllegalStateException();
                    } catch (Throwable th) {
                        try {
                            buuoVar.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
            }, this.f).i(new eroh() { // from class: trp
                @Override // defpackage.eroh
                public final ListenableFuture a(Object obj) {
                    MessageIdType messageIdType = (MessageIdType) obj;
                    boolean c3 = messageIdType.c();
                    trv trvVar = trv.this;
                    String str4 = str2;
                    if (c3) {
                        return trvVar.h.q(str4).h(new emwl() { // from class: trc
                            @Override // defpackage.emwl
                            public final Object apply(Object obj2) {
                                return Optional.ofNullable((eszz) obj2);
                            }
                        }, trvVar.g);
                    }
                    etac etacVar2 = etacVar;
                    String str5 = a3;
                    csjb c4 = trv.a.c();
                    c4.A(cdii.t.a, str5);
                    c4.A(cdii.v.a, "Ignore");
                    c4.A(cdii.w.a, str4);
                    c4.A(cdii.x.a, "CmsId is in DB");
                    c4.I("ObjectEvent received");
                    c4.r();
                    ((cryg) trvVar.k.b()).f(messageIdType.b(), etacVar2.c, axue.CMS_EVENT_TYPE_CREATE_EVENT_RECEIVED, "CmsId is in DB");
                    return elfo.e(Optional.empty());
                }
            }, this.f).i(new eroh() { // from class: trq
                @Override // defpackage.eroh
                public final ListenableFuture a(Object obj) {
                    final esjh a5;
                    int ordinal;
                    String str4;
                    Optional optional = (Optional) obj;
                    if (optional.isEmpty()) {
                        return elfo.e(null);
                    }
                    String str5 = str2;
                    String str6 = a3;
                    final trv trvVar = trv.this;
                    final eszz eszzVar = (eszz) optional.get();
                    if (((Boolean) trv.d.e()).booleanValue()) {
                        eszh eszhVar = eszzVar.f;
                        if (eszhVar == null) {
                            eszhVar = eszh.a;
                        }
                        eszs eszsVar = eszhVar.f;
                        if (eszsVar == null) {
                            eszsVar = eszs.a;
                        }
                        String str7 = eszsVar.b;
                        if (!bdrw.c(str7) && ((crrm) trvVar.m.b()).e(str7)) {
                            csjb c3 = trv.a.c();
                            c3.A(cdii.t.a, str6);
                            c3.A(cdii.w.a, str5);
                            c3.I("Deleting message due to blocked contact");
                            c3.r();
                            return trvVar.h.g(str5, false).h(new emwl() { // from class: tru
                                @Override // defpackage.emwl
                                public final Object apply(Object obj2) {
                                    cskc cskcVar = trv.a;
                                    return null;
                                }
                            }, trvVar.g);
                        }
                    }
                    etac etacVar2 = etacVar;
                    if (!emuz.e(eszzVar.d, "inbox")) {
                        csjb a6 = trv.a.a();
                        a6.A(cdii.t.a, str6);
                        a6.A(cdii.v.a, "Ignore");
                        a6.A(cdii.w.a, etacVar2.c);
                        a6.A(cdii.x.a, "Object outside desired folder");
                        a6.A(cdii.y.a, eszzVar.d);
                        a6.I("ObjectEvent received");
                        a6.r();
                        ((cryg) trvVar.k.b()).f("", etacVar2.c, axue.CMS_EVENT_TYPE_CREATE_EVENT_RECEIVED, "Object outside desired folder");
                        return elfo.e(null);
                    }
                    if (!teq.a(eszzVar)) {
                        csjb c4 = trv.a.c();
                        c4.A(cdii.t.a, str6);
                        c4.A(cdii.v.a, "Create object in db");
                        c4.A(cdii.w.a, str5);
                        c4.I("ObjectEvent received");
                        c4.r();
                        emxf.b(!eszzVar.m.isEmpty(), "Conversation id not expected to be empty");
                        return trvVar.j.a(eszzVar.m, str6).i(new eroh() { // from class: trb
                            @Override // defpackage.eroh
                            public final ListenableFuture a(Object obj2) {
                                return trv.this.p.a(eszzVar);
                            }
                        }, trvVar.f);
                    }
                    csjb c5 = trv.a.c();
                    c5.A(cdii.t.a, str6);
                    c5.A(cdii.v.a, "Inbound message: Store notification in db");
                    c5.A(cdii.w.a, str5);
                    c5.I("ObjectEvent received");
                    c5.r();
                    final String str8 = eszzVar.c;
                    int b5 = etab.b(etacVar2.b);
                    if (b5 == 0) {
                        b5 = 1;
                    }
                    final String a7 = etab.a(b5);
                    try {
                        a5 = trvVar.e.a(eszzVar);
                        esjj b6 = esjj.b(a5.j);
                        if (b6 == null) {
                            b6 = esjj.UNRECOGNIZED;
                        }
                        ordinal = b6.ordinal();
                    } catch (eygu e2) {
                        csjb e3 = trv.a.e();
                        e3.A(cdii.t.a, a7);
                        e3.A(cdii.w.a, str8);
                        e3.I("Error parsing Cms Object payload");
                        e3.s(e2);
                        ((cryg) trvVar.k.b()).f("", str8, axue.CMS_EVENT_TYPE_CREATE_EVENT_RECEIVED, "Error parsing Cms Object payload");
                    }
                    if (ordinal == 1) {
                        Optional findFirst = Collection.EL.stream(a5.p).filter(new Predicate() { // from class: tre
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
                            public final boolean test(Object obj2) {
                                return ((esjl) obj2).b == 3;
                            }
                        }).findFirst();
                        if (findFirst.isEmpty()) {
                            csjb e4 = trv.a.e();
                            e4.A(cdii.t.a, a7);
                            e4.A(cdii.w.a, str8);
                            e4.I("Ignoring ObjectEvent - SMS is missing TextMessagePartModel");
                            e4.r();
                            ((cryg) trvVar.k.b()).f("", str8, axue.CMS_EVENT_TYPE_CREATE_EVENT_RECEIVED, "SMS is missing TextMessagePartModel");
                            return elfo.e(null);
                        }
                        esjl esjlVar = (esjl) findFirst.get();
                        str4 = (esjlVar.b == 3 ? (esjt) esjlVar.c : esjt.a).c;
                    } else {
                        if (ordinal != 2) {
                            csjb c6 = trv.a.c();
                            c6.A(cdii.t.a, a7);
                            c6.A(cdii.v.a, "Ignore");
                            c6.A(cdii.w.a, str8);
                            c6.A(cdii.x.a, "Unknown MessageType");
                            String str9 = trv.b.a;
                            esjj b7 = esjj.b(a5.j);
                            if (b7 == null) {
                                b7 = esjj.UNRECOGNIZED;
                            }
                            c6.A(str9, b7);
                            c6.I("ObjectEvent received");
                            c6.r();
                            ((cryg) trvVar.k.b()).f("", str8, axue.CMS_EVENT_TYPE_CREATE_EVENT_RECEIVED, "Unknown message type");
                            return elfo.e(null);
                        }
                        esjr esjrVar = a5.s;
                        if (esjrVar == null) {
                            esjrVar = esjr.a;
                        }
                        if (esjrVar.b.isEmpty()) {
                            str4 = eszzVar.l;
                        } else {
                            esjr esjrVar2 = a5.s;
                            if (esjrVar2 == null) {
                                esjrVar2 = esjr.a;
                            }
                            str4 = esjrVar2.b;
                        }
                    }
                    final String str10 = str4;
                    trvVar.l.d("ObjectEventHandler#storeNotificationInDb", new Runnable() { // from class: trf
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // java.lang.Runnable
                        public final void run() {
                            cskc cskcVar = trv.a;
                            String[] strArr = bqrp.a;
                            bqqe bqqeVar = new bqqe();
                            eszz eszzVar2 = eszz.this;
                            bqqeVar.c(eszzVar2.c);
                            bqqeVar.b(eszzVar2.k);
                            bqqeVar.d(eszzVar2.j);
                            eszh eszhVar2 = eszzVar2.f;
                            if (eszhVar2 == null) {
                                eszhVar2 = eszh.a;
                            }
                            eszs eszsVar2 = eszhVar2.f;
                            if (eszsVar2 == null) {
                                eszsVar2 = eszs.a;
                            }
                            bqqeVar.f(eszsVar2.b);
                            eszh eszhVar3 = eszzVar2.f;
                            if (eszhVar3 == null) {
                                eszhVar3 = eszh.a;
                            }
                            String str11 = a7;
                            final String str12 = str8;
                            esjh esjhVar = a5;
                            String str13 = str10;
                            bqqeVar.i(((eszs) eszhVar3.g.get(0)).b);
                            bqqeVar.e(str13);
                            bqqeVar.h(esjhVar.h);
                            bqqeVar.g(esjhVar.h);
                            bqqb a8 = bqqeVar.a();
                            final dtve b8 = bqrp.b();
                            dtub.b(bqrp.b(), "cms_notifications", a8, new Function() { // from class: bqpz
                                @Override // java.util.function.Function
                                /* renamed from: andThen */
                                public final /* synthetic */ Function mo448andThen(Function function) {
                                    return Function$CC.$default$andThen(this, function);
                                }

                                @Override // java.util.function.Function
                                public final Object apply(Object obj2) {
                                    return Long.valueOf(dtve.this.R("cms_notifications", (ContentValues) obj2));
                                }

                                public final /* synthetic */ Function compose(Function function) {
                                    return Function$CC.$default$compose(this, function);
                                }
                            }, new Consumer() { // from class: bqqa
                                @Override // java.util.function.Consumer
                                /* renamed from: accept */
                                public final void o(Object obj2) {
                                }

                                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                    return Consumer$CC.$default$andThen(this, consumer);
                                }
                            });
                            eygr eygrVar = esjhVar.p;
                            final ArrayList arrayList = new ArrayList();
                            if (eygrVar.isEmpty()) {
                                csjb e5 = trv.a.e();
                                e5.A(cdii.t.a, str11);
                                e5.A(cdii.v.a, "Inbound message: investigate parts");
                                e5.A(cdii.w.a, str12);
                                e5.I("Message does not have parts");
                                e5.r();
                            } else {
                                Collection.EL.stream(eygrVar).filter(new Predicate() { // from class: trs
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
                                    public final boolean test(Object obj2) {
                                        cskc cskcVar2 = trv.a;
                                        esjm b9 = esjm.b(((esjl) obj2).e);
                                        if (b9 == null) {
                                            b9 = esjm.UNRECOGNIZED;
                                        }
                                        return b9 == esjm.ATTACHMENT || b9 == esjm.AUDIO || b9 == esjm.IMAGE || b9 == esjm.VIDEO || b9 == esjm.RICH_CARD;
                                    }
                                }).forEach(new Consumer() { // from class: trt
                                    @Override // java.util.function.Consumer
                                    /* renamed from: accept */
                                    public final void o(Object obj2) {
                                        esjl esjlVar2 = (esjl) obj2;
                                        cskc cskcVar2 = trv.a;
                                        esio esioVar = esjlVar2.b == 4 ? (esio) esjlVar2.c : esio.a;
                                        String str14 = str12;
                                        List list = arrayList;
                                        String str15 = esioVar.d;
                                        if (!TextUtils.isEmpty(str15)) {
                                            list.add(trv.b(str15, str14, csfy.FULL_SIZE));
                                        }
                                        String str16 = esioVar.g;
                                        if (TextUtils.isEmpty(str16)) {
                                            return;
                                        }
                                        list.add(trv.b(str16, str14, csfy.COMPRESSED));
                                    }

                                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                        return Consumer$CC.$default$andThen(this, consumer);
                                    }
                                });
                                if (!arrayList.isEmpty()) {
                                    csjb c7 = trv.a.c();
                                    c7.A(cdii.t.a, str11);
                                    c7.A(cdii.v.a, "Store media notifications in db");
                                    c7.A(cdii.w.a, str12);
                                    c7.y(trv.c.a, arrayList.size());
                                    c7.r();
                                }
                            }
                            Collection.EL.stream(arrayList).forEach(new Consumer() { // from class: trd
                                @Override // java.util.function.Consumer
                                /* renamed from: accept */
                                public final void o(Object obj2) {
                                    final bqou bqouVar = (bqou) obj2;
                                    final dtve a9 = bqpw.a();
                                    dtub.b(bqpw.a(), "cms_media_notifications", bqouVar, new Function() { // from class: bqor
                                        @Override // java.util.function.Function
                                        /* renamed from: andThen */
                                        public final /* synthetic */ Function mo448andThen(Function function) {
                                            return Function$CC.$default$andThen(this, function);
                                        }

                                        @Override // java.util.function.Function
                                        public final Object apply(Object obj3) {
                                            return Long.valueOf(dtve.this.R("cms_media_notifications", (ContentValues) obj3));
                                        }

                                        public final /* synthetic */ Function compose(Function function) {
                                            return Function$CC.$default$compose(this, function);
                                        }
                                    }, new Consumer() { // from class: bqos
                                        @Override // java.util.function.Consumer
                                        /* renamed from: accept */
                                        public final void o(Object obj3) {
                                            Long l = (Long) obj3;
                                            if (l.longValue() >= 0) {
                                                bqou bqouVar2 = bqou.this;
                                                bqouVar2.a = new bqot(l).a.longValue();
                                                bqouVar2.fY(0);
                                            }
                                        }

                                        public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                            return Consumer$CC.$default$andThen(this, consumer);
                                        }
                                    });
                                }

                                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                    return Consumer$CC.$default$andThen(this, consumer);
                                }
                            });
                        }
                    });
                    ((cryg) trvVar.k.b()).f("", etacVar2.c, axue.CMS_EVENT_TYPE_CREATE_EVENT_RECEIVED, "Stored notification in DB");
                    return elfo.e(null);
                }
            }, this.f).f(Throwable.class, new eroh() { // from class: trr
                @Override // defpackage.eroh
                public final ListenableFuture a(Object obj) {
                    Throwable th = (Throwable) obj;
                    boolean equals = Status.c(th).getCode().equals(Status.Code.NOT_FOUND);
                    trv trvVar = trv.this;
                    String str4 = a3;
                    String str5 = str2;
                    if (equals) {
                        csjb c3 = trv.a.c();
                        c3.A(cdii.t.a, str4);
                        c3.A(cdii.v.a, "Ignore: Object not found in CMS");
                        c3.A(cdii.w.a, str5);
                        c3.I("ObjectEvent received");
                        c3.r();
                        ((cryg) trvVar.k.b()).f("", str5, axue.CMS_EVENT_TYPE_CREATE_EVENT_RECEIVED, "Object not found in CMS");
                        return elfo.e(null);
                    }
                    csjb e2 = trv.a.e();
                    e2.A(cdii.t.a, str4);
                    e2.A(cdii.v.a, "Exception while processing event");
                    e2.A(cdii.w.a, str5);
                    e2.I("ObjectEvent received");
                    e2.s(th);
                    ((cryg) trvVar.k.b()).f("", str5, axue.CMS_EVENT_TYPE_CREATE_EVENT_RECEIVED, th.toString());
                    return elfo.d(th);
                }
            }, erpp.a);
        }
        csjb a5 = a.a();
        a5.A(cdii.w.a, etacVar.c);
        a5.I("Delivering message labeled with TO_BE_DELIVERED_BY_SIM_DEVICE_LABEL");
        a5.r();
        cemb cembVar = this.q;
        etacVar.getClass();
        c2 = axol.c(cembVar.c, ffhe.a, ffsm.a, new cema(cembVar, etacVar, null));
        return c2;
    }
}
