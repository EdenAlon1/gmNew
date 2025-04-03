package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Collection;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cgqz extends ceut {
    public static final enru a = enru.c("com/google/android/apps/messaging/shared/message/delete/DeleteMessageHandler");
    public final Context b;
    public final errl c;
    public final errl d;
    public final ffbr e;
    public final cbut f;
    public final akzt g;
    public final axmw h;
    public final ffbr i;
    public final ffbr j;
    public final ffbr k;
    public final bzpz l;
    public final ffbr m;
    public final ffbr n;
    public final ffbr o;
    private final cqpk p;

    public cgqz(Context context, errl errlVar, errl errlVar2, ffbr ffbrVar, cbut cbutVar, akzt akztVar, axmw axmwVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, cqpk cqpkVar, bzpz bzpzVar, ffbr ffbrVar5, ffbr ffbrVar6, ffbr ffbrVar7) {
        this.b = context;
        this.c = errlVar;
        this.d = errlVar2;
        this.e = ffbrVar;
        this.f = cbutVar;
        this.g = akztVar;
        this.h = axmwVar;
        this.i = ffbrVar3;
        this.j = ffbrVar2;
        this.k = ffbrVar4;
        this.p = cqpkVar;
        this.l = bzpzVar;
        this.m = ffbrVar5;
        this.n = ffbrVar6;
        this.o = ffbrVar7;
    }

    @Override // defpackage.ceve
    public final ekzz b() {
        return eleg.f("DeleteMessageHandler");
    }

    @Override // defpackage.ceve
    public final eyhz d() {
        return cgrb.a.getParserForType();
    }

    @Override // defpackage.ceut
    protected final /* bridge */ /* synthetic */ elfl j(ceuw ceuwVar, eyhs eyhsVar) {
        final cgrb cgrbVar = (cgrb) eyhsVar;
        final ecda ecdaVar = cgrbVar.c.size() == 1 ? alrv.k : alrv.l;
        return elfo.f(new Runnable() { // from class: cgpx
            @Override // java.lang.Runnable
            public final void run() {
                ((alrv) cgqz.this.e.b()).e(ecdaVar);
            }
        }, this.c).i(new eroh() { // from class: cgpy
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                final cgqz cgqzVar = cgqz.this;
                final cgrb cgrbVar2 = cgrbVar;
                final elfl h = elfo.h(new erog() { // from class: cgqd
                    @Override // defpackage.erog
                    public final ListenableFuture a() {
                        final cgrb cgrbVar3 = cgrbVar2;
                        return elfo.g(new Callable() { // from class: cgpw
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                final cgrb cgrbVar4 = cgrb.this;
                                if (cgrbVar4.d.size() == 0) {
                                    int i = engw.d;
                                    return enou.a;
                                }
                                buxo d = MessagesTable.d();
                                d.z("getCloudSyncMessageIds");
                                d.h(new Function() { // from class: cgqb
                                    @Override // java.util.function.Function
                                    /* renamed from: andThen */
                                    public final /* synthetic */ Function mo448andThen(Function function) {
                                        return Function$CC.$default$andThen(this, function);
                                    }

                                    @Override // java.util.function.Function
                                    public final Object apply(Object obj2) {
                                        buxz buxzVar = (buxz) obj2;
                                        eygr eygrVar = cgrb.this.d;
                                        int intValue = MessagesTable.g().intValue();
                                        if (intValue < 8500) {
                                            dtub.w("cloud_sync_id", intValue);
                                        }
                                        buxzVar.aq(new dtrw("messages.cloud_sync_id", 3, buxz.at(eygrVar), false));
                                        return buxzVar;
                                    }

                                    public final /* synthetic */ Function compose(Function function) {
                                        return Function$CC.$default$compose(this, function);
                                    }
                                });
                                return d.b().g();
                            }
                        }, cgqz.this.d);
                    }
                }, cgqzVar.c).i(new eroh() { // from class: cgqe
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj2) {
                        return cgqz.this.k((engw) obj2);
                    }
                }, cgqzVar.c).h(new emwl() { // from class: cgqf
                    @Override // defpackage.emwl
                    public final Object apply(Object obj2) {
                        engw engwVar;
                        final engw engwVar2 = (engw) obj2;
                        if (engwVar2.isEmpty()) {
                            return enou.a;
                        }
                        cgqz cgqzVar2 = cgqz.this;
                        enin eninVar = new enin();
                        eninVar.j(engwVar2);
                        buxo d = MessagesTable.d();
                        d.z("+DeleteMessageHandler#getMessageIdsWithSameOriginalRcsMessageId-subquery");
                        d.f(new Function() { // from class: cgqs
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo448andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj3) {
                                return ((buum) obj3).R;
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        });
                        d.h(new Function() { // from class: cgqt
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo448andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj3) {
                                buxz buxzVar = (buxz) obj3;
                                buxzVar.u(engw.this);
                                return buxzVar;
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        });
                        final buxm b = d.b();
                        buxo d2 = MessagesTable.d();
                        d2.z("+DeleteMessageHandler#getMessageIdsWithSameOriginalRcsMessageId");
                        d2.c(MessagesTable.c.a);
                        d2.h(new Function() { // from class: cgqu
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo448andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj3) {
                                buxz buxzVar = (buxz) obj3;
                                buxzVar.H(buxm.this);
                                buxzVar.z(engwVar2);
                                return buxzVar;
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        });
                        eninVar.j(d2.b().g());
                        bueb a2 = bueg.a();
                        a2.z("+DeleteMessageHandler#getMessageIdsWithReactions");
                        a2.f(new Function() { // from class: cgqx
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo448andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj3) {
                                buef buefVar = (buef) obj3;
                                buefVar.d(engw.this);
                                return buefVar;
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        });
                        eninVar.j(a2.b().f());
                        if (((Boolean) cgqzVar2.o.b()).booleanValue()) {
                            String[] strArr = btza.a;
                            btyv btyvVar = new btyv(btza.a);
                            btyvVar.z("+DeleteMessageHandler#getMessageIdsOfEdits");
                            btyvVar.c(btza.c.a);
                            btyvVar.g(new Function() { // from class: cgqh
                                @Override // java.util.function.Function
                                /* renamed from: andThen */
                                public final /* synthetic */ Function mo448andThen(Function function) {
                                    return Function$CC.$default$andThen(this, function);
                                }

                                @Override // java.util.function.Function
                                public final Object apply(Object obj3) {
                                    btyz btyzVar = (btyz) obj3;
                                    engr engrVar = new engr();
                                    Iterator it = engwVar2.iterator();
                                    while (it.hasNext()) {
                                        engrVar.h(String.valueOf(bdhb.a((MessageIdType) it.next())));
                                    }
                                    btyzVar.aq(new dtrw("message_edits.latest_message_id", 3, btyz.at(engrVar.g()), true));
                                    return btyzVar;
                                }

                                public final /* synthetic */ Function compose(Function function) {
                                    return Function$CC.$default$compose(this, function);
                                }
                            });
                            btyj btyjVar = (btyj) btyvVar.b().p(btza.c.a);
                            try {
                                engwVar = btyjVar.e();
                                btyjVar.close();
                            } catch (Throwable th) {
                                try {
                                    btyjVar.close();
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                                throw th;
                            }
                        } else {
                            engwVar = enou.a;
                        }
                        eninVar.j(engwVar);
                        return ((bdmq) cgqzVar2.i.b()).K(eninVar.g().g());
                    }
                }, cgqzVar.d);
                final elfl h2 = elfo.h(new erog() { // from class: cgqg
                    @Override // defpackage.erog
                    public final ListenableFuture a() {
                        return cgqz.this.k(bdhb.c(cgrbVar2.c));
                    }
                }, cgqzVar.c).h(new emwl() { // from class: cgqf
                    @Override // defpackage.emwl
                    public final Object apply(Object obj2) {
                        engw engwVar;
                        final List engwVar2 = (engw) obj2;
                        if (engwVar2.isEmpty()) {
                            return enou.a;
                        }
                        cgqz cgqzVar2 = cgqz.this;
                        enin eninVar = new enin();
                        eninVar.j(engwVar2);
                        buxo d = MessagesTable.d();
                        d.z("+DeleteMessageHandler#getMessageIdsWithSameOriginalRcsMessageId-subquery");
                        d.f(new Function() { // from class: cgqs
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo448andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj3) {
                                return ((buum) obj3).R;
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        });
                        d.h(new Function() { // from class: cgqt
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo448andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj3) {
                                buxz buxzVar = (buxz) obj3;
                                buxzVar.u(engw.this);
                                return buxzVar;
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        });
                        final buxm b = d.b();
                        buxo d2 = MessagesTable.d();
                        d2.z("+DeleteMessageHandler#getMessageIdsWithSameOriginalRcsMessageId");
                        d2.c(MessagesTable.c.a);
                        d2.h(new Function() { // from class: cgqu
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo448andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj3) {
                                buxz buxzVar = (buxz) obj3;
                                buxzVar.H(buxm.this);
                                buxzVar.z(engwVar2);
                                return buxzVar;
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        });
                        eninVar.j(d2.b().g());
                        bueb a2 = bueg.a();
                        a2.z("+DeleteMessageHandler#getMessageIdsWithReactions");
                        a2.f(new Function() { // from class: cgqx
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo448andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj3) {
                                buef buefVar = (buef) obj3;
                                buefVar.d(engw.this);
                                return buefVar;
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        });
                        eninVar.j(a2.b().f());
                        if (((Boolean) cgqzVar2.o.b()).booleanValue()) {
                            String[] strArr = btza.a;
                            btyv btyvVar = new btyv(btza.a);
                            btyvVar.z("+DeleteMessageHandler#getMessageIdsOfEdits");
                            btyvVar.c(btza.c.a);
                            btyvVar.g(new Function() { // from class: cgqh
                                @Override // java.util.function.Function
                                /* renamed from: andThen */
                                public final /* synthetic */ Function mo448andThen(Function function) {
                                    return Function$CC.$default$andThen(this, function);
                                }

                                @Override // java.util.function.Function
                                public final Object apply(Object obj3) {
                                    btyz btyzVar = (btyz) obj3;
                                    engr engrVar = new engr();
                                    Iterator it = engwVar2.iterator();
                                    while (it.hasNext()) {
                                        engrVar.h(String.valueOf(bdhb.a((MessageIdType) it.next())));
                                    }
                                    btyzVar.aq(new dtrw("message_edits.latest_message_id", 3, btyz.at(engrVar.g()), true));
                                    return btyzVar;
                                }

                                public final /* synthetic */ Function compose(Function function) {
                                    return Function$CC.$default$compose(this, function);
                                }
                            });
                            btyj btyjVar = (btyj) btyvVar.b().p(btza.c.a);
                            try {
                                engwVar = btyjVar.e();
                                btyjVar.close();
                            } catch (Throwable th) {
                                try {
                                    btyjVar.close();
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                                throw th;
                            }
                        } else {
                            engwVar = enou.a;
                        }
                        eninVar.j(engwVar);
                        return ((bdmq) cgqzVar2.i.b()).K(eninVar.g().g());
                    }
                }, cgqzVar.d);
                final elfl b = elfo.m(h, h2).b(new erog() { // from class: cgqi
                    @Override // defpackage.erog
                    public final ListenableFuture a() {
                        engw engwVar = (engw) erqt.q(elfl.this);
                        if (engwVar == null) {
                            throw new NullPointerException("Null nonCloudSyncMessagesToDelete");
                        }
                        engw engwVar2 = (engw) erqt.q(h);
                        if (engwVar2 != null) {
                            return elfo.e(new cgor(engwVar, engwVar2));
                        }
                        throw new NullPointerException("Null cloudSyncMessagesToDelete");
                    }
                }, cgqzVar.d);
                final elfl h3 = elfo.k(b, b.i(new eroh() { // from class: cgqj
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj2) {
                        elfl c;
                        final enip enipVar = (enip) Collection.EL.stream(((cgqy) obj2).c()).filter(new Predicate() { // from class: cgqq
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
                            public final boolean test(Object obj3) {
                                return ((MessageCoreData) obj3).cB();
                            }
                        }).map(new cgqr()).collect(endq.b);
                        enipVar.getClass();
                        buxo d = MessagesTable.d();
                        d.z("BugleEtouffee");
                        d.h(new Function() { // from class: cagk
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo448andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj3) {
                                buxz buxzVar = (buxz) obj3;
                                int intValue = MessagesTable.g().intValue();
                                if (intValue < 48030) {
                                    dtub.w("original_message_id", intValue);
                                }
                                Set set = enipVar;
                                engr engrVar = new engr();
                                Iterator it = set.iterator();
                                while (it.hasNext()) {
                                    engrVar.h(String.valueOf(bdhb.a((MessageIdType) it.next())));
                                }
                                buxzVar.aq(new dtrw("messages.original_message_id", 3, buxz.at(engrVar.g()), true));
                                buxzVar.B(true);
                                buxzVar.N(2);
                                return buxzVar;
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        });
                        buxm b2 = d.b();
                        cagm cagmVar = (cagm) cgqz.this.l;
                        List a2 = cagmVar.a(b2);
                        buxo d2 = MessagesTable.d();
                        d2.z("BugleEtouffee");
                        d2.h(new Function() { // from class: cagj
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo448andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj3) {
                                buxz buxzVar = (buxz) obj3;
                                buxzVar.u(enipVar);
                                buxzVar.N(2);
                                return buxzVar;
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        });
                        Set ar = ffdx.ar(ffdx.ad(a2, cagmVar.a(d2.b())));
                        if (ar.isEmpty()) {
                            elfl e = elfo.e(false);
                            e.getClass();
                            return e;
                        }
                        csjb c2 = cagm.a.c();
                        c2.I("Deleting etouffee data for messages.");
                        c2.y("size", ar.size());
                        c2.r();
                        c = axol.c(cagmVar.c, ffhe.a, ffsm.a, new cagl(cagmVar, ar, null));
                        return c;
                    }
                }, cgqzVar.d)).a(new Callable() { // from class: cgqk
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return (cgqy) erqt.q(elfl.this);
                    }
                }, cgqzVar.c).h(new emwl() { // from class: cgql
                    @Override // defpackage.emwl
                    public final Object apply(Object obj2) {
                        Integer valueOf;
                        cgrr cgrrVar;
                        cgqy cgqyVar = (cgqy) obj2;
                        engw c = cgqyVar.c();
                        boolean isEmpty = c.isEmpty();
                        cgqz cgqzVar2 = cgqz.this;
                        if (isEmpty) {
                            cgqz.D.r("No messages retrieved to delete");
                            valueOf = 0;
                        } else {
                            cgqzVar2.f.n(c);
                            ConversationIdType z = ((MessageCoreData) c.get(0)).z();
                            valueOf = Integer.valueOf(((cgpv) cgqzVar2.j.b()).b((engw) Collection.EL.stream(c).map(new cgqr()).collect(endq.a), z));
                        }
                        ffbr ffbrVar = cgqzVar2.n;
                        valueOf.intValue();
                        if (((asix) ffbrVar.b()).a()) {
                            switch (cgrbVar2.e) {
                                case 0:
                                    cgrrVar = cgrr.UNSPECIFIED_DELETION;
                                    break;
                                case 1:
                                    cgrrVar = cgrr.TOOLSTONE_DELETION;
                                    break;
                                case 2:
                                    cgrrVar = cgrr.MESSAGE_NOT_DELIVERED_WEAR_DELETION;
                                    break;
                                case 3:
                                    cgrrVar = cgrr.MESSAGE_NOT_DELIVERED_PHONE_DELETION;
                                    break;
                                case 4:
                                    cgrrVar = cgrr.RICH_CARD_DELETION;
                                    break;
                                case 5:
                                    cgrrVar = cgrr.EXTERNAL_API_DELETION;
                                    break;
                                case 6:
                                    cgrrVar = cgrr.MESSAGE_LIST_MANUAL_DELETION;
                                    break;
                                case 7:
                                    cgrrVar = cgrr.MESSAGE_LIST_CONVO_V2_MANUAL_DELETION;
                                    break;
                                case 8:
                                    cgrrVar = cgrr.METATEXT_MESSAGE_MANUAL_DELETION;
                                    break;
                                case 9:
                                    cgrrVar = cgrr.EMERGENCY_MESSAGE_MANUAL_DELETION;
                                    break;
                                case 10:
                                    cgrrVar = cgrr.OTP_DELETION;
                                    break;
                                case 11:
                                    cgrrVar = cgrr.OBJECT_EVENT_TACHYON_DELETION;
                                    break;
                                case 12:
                                    cgrrVar = cgrr.DUPLICATE_MESSAGE_RESTORE_DELETION;
                                    break;
                                case 13:
                                    cgrrVar = cgrr.DITTO_DELETION;
                                    break;
                                case 14:
                                    cgrrVar = cgrr.ATT_CLOUD_SYNC_DELETION;
                                    break;
                                case 15:
                                    cgrrVar = cgrr.SET_PROTOCOL_CHANGE_TOMBSTONE_DELETION;
                                    break;
                                case 16:
                                    cgrrVar = cgrr.AFTER_MESSAGE_MOVE_TOMBSTONE_DELETION;
                                    break;
                                case 17:
                                    cgrrVar = cgrr.PREVIOUS_TOMBSTONE_DELETION;
                                    break;
                                case 18:
                                    cgrrVar = cgrr.UPDATE_CONVERSATION_CREATION_TOMBSTONE_DELETION;
                                    break;
                                case 19:
                                    cgrrVar = cgrr.INSERT_OR_UPDATE_AT_BOTTOM_TOMBSTONE_DELETION;
                                    break;
                                default:
                                    cgrrVar = null;
                                    break;
                            }
                            if (cgrrVar == null) {
                                cgrrVar = cgrr.UNRECOGNIZED;
                            }
                            bqmn a2 = new tep().apply(cgrrVar);
                            engw c2 = cgqyVar.c();
                            int i = ((enou) c2).c;
                            for (int i2 = 0; i2 < i; i2++) {
                                ((ccix) cgqzVar2.m.b()).a(((MessageCoreData) c2.get(i2)).B().b(), a2);
                            }
                        }
                        return valueOf;
                    }
                }, cgqzVar.d);
                return elfo.m(h3, b).b(new erog() { // from class: cgqm
                    @Override // defpackage.erog
                    public final ListenableFuture a() {
                        final cgqy cgqyVar = (cgqy) erqt.q(b);
                        final int intValue = ((Integer) erqt.q(h3)).intValue();
                        final cgqz cgqzVar2 = cgqz.this;
                        return elfo.g(new Callable() { // from class: cgqw
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                cgqz cgqzVar3;
                                int i;
                                ceqk ceqkVar = (ceqk) ceql.a.createBuilder();
                                cgrg cgrgVar = (cgrg) cgrh.a.createBuilder();
                                cepa cepaVar = (cepa) cepb.a.createBuilder();
                                cgqy cgqyVar2 = cgqyVar;
                                engw c = cgqyVar2.c();
                                int i2 = ((enou) c).c;
                                int i3 = 0;
                                while (true) {
                                    cgqzVar3 = cgqz.this;
                                    if (i3 >= i2) {
                                        break;
                                    }
                                    MessageCoreData messageCoreData = (MessageCoreData) c.get(i3);
                                    MessageIdType B = messageCoreData.B();
                                    csjb c2 = cgqz.D.c();
                                    c2.I("Deleted local");
                                    c2.d(B);
                                    c2.r();
                                    if (messageCoreData.cY() && !messageCoreData.de()) {
                                        cgqzVar3.g.c("Bugle.Rcs.Files.Transfer.Outgoing.Cancelled.Counts");
                                    }
                                    Uri u = messageCoreData.u();
                                    if (u != null) {
                                        ceqkVar.a(u.toString());
                                    }
                                    Iterator it = messageCoreData.ab().iterator();
                                    while (true) {
                                        i = i3 + 1;
                                        if (it.hasNext()) {
                                            Uri t = ((MessagePartCoreData) it.next()).t();
                                            if (t != null) {
                                                if (cgrd.a(t)) {
                                                    cgrgVar.a(t.toString());
                                                } else {
                                                    String uri = t.toString();
                                                    ceqkVar.copyOnWrite();
                                                    ceql ceqlVar = (ceql) ceqkVar.instance;
                                                    uri.getClass();
                                                    eygr eygrVar = ceqlVar.b;
                                                    if (!eygrVar.c()) {
                                                        ceqlVar.b = eyfy.mutableCopy(eygrVar);
                                                    }
                                                    ceqlVar.b.add(uri);
                                                }
                                            }
                                        }
                                    }
                                    i3 = i;
                                }
                                cgqzVar3.h.b(cgqzVar3.b, (String[]) Collection.EL.stream(cgqyVar2.b()).map(new Function() { // from class: cgqn
                                    @Override // java.util.function.Function
                                    /* renamed from: andThen */
                                    public final /* synthetic */ Function mo448andThen(Function function) {
                                        return Function$CC.$default$andThen(this, function);
                                    }

                                    @Override // java.util.function.Function
                                    public final Object apply(Object obj2) {
                                        return ((MessageCoreData) obj2).ai();
                                    }

                                    public final /* synthetic */ Function compose(Function function) {
                                        return Function$CC.$default$compose(this, function);
                                    }
                                }).filter(new Predicate() { // from class: cgqo
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
                                        return !emxe.c((String) obj2);
                                    }
                                }).toArray(new IntFunction() { // from class: cgqp
                                    @Override // java.util.function.IntFunction
                                    public final Object apply(int i4) {
                                        return new String[i4];
                                    }
                                }));
                                engr engrVar = new engr();
                                if (!cgqyVar2.a().isEmpty()) {
                                    engrVar.h(cish.b());
                                    engrVar.h(cisl.c());
                                }
                                if (((ceql) ceqkVar.instance).c.size() > 0 || ((ceql) ceqkVar.instance).b.size() > 0) {
                                    engrVar.h(ceyr.g("delete_message_from_telephony", (ceql) ceqkVar.build()));
                                }
                                if (((cgrh) cgrgVar.instance).b.size() > 0) {
                                    engrVar.h(ceyr.g("delete_part_cms_attachment", (cgrh) cgrgVar.build()));
                                }
                                if (((cepb) cepaVar.instance).b.size() > 0) {
                                    engrVar.h(ceyr.g("cancel_rcs_file_transfer", (cepb) cepaVar.build()));
                                }
                                ensk h4 = cgqz.a.h();
                                h4.Y(ente.a, "BugleNotifications");
                                ((enrr) ((enrr) h4).h("com/google/android/apps/messaging/shared/message/delete/DeleteMessageHandler", "getPostProcessingWorkQueueRequests", 398, "DeleteMessageHandler.java")).q("Creating notification from DeleteMessageHandler");
                                ((cjbc) cgqzVar3.k.b()).e();
                                return engrVar.g();
                            }
                        }, cgqzVar2.d).i(new eroh() { // from class: cgqc
                            @Override // defpackage.eroh
                            public final ListenableFuture a(Object obj2) {
                                engw engwVar = (engw) obj2;
                                ceys h4 = ceyt.h();
                                h4.b(true);
                                h4.c(false);
                                Bundle bundle = new Bundle();
                                bundle.putInt("delete_count", intValue);
                                cetn cetnVar = (cetn) h4;
                                cetnVar.c = bundle;
                                if (!engwVar.isEmpty()) {
                                    cetnVar.a = engwVar;
                                }
                                return elfo.e(h4.a());
                            }
                        }, cgqzVar2.c);
                    }
                }, cgqzVar.c);
            }
        }, this.c).h(new emwl() { // from class: cgpz
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                ceyt ceytVar = (ceyt) obj;
                ((alrv) cgqz.this.e.b()).f(ecdaVar);
                return ceytVar;
            }
        }, this.c).f(Exception.class, new eroh() { // from class: cgqa
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                ((alrv) cgqz.this.e.b()).f(ecdaVar);
                return elfo.d((Exception) obj);
            }
        }, this.c);
    }

    public final elfl k(final engw engwVar) {
        final cqpk cqpkVar = this.p;
        return (cqpkVar.e.a() ? elfo.h(new erog() { // from class: cqox
            @Override // defpackage.erog
            public final ListenableFuture a() {
                cqpk cqpkVar2 = cqpk.this;
                bdmq bdmqVar = (bdmq) cqpkVar2.c.c.b();
                buxo d = MessagesTable.d();
                d.z("FileTransferDatabaseOperations#retrieveOngoingFileTransferMessages");
                final Iterable iterable = engwVar;
                d.h(new Function() { // from class: cqqv
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        buxz buxzVar = (buxz) obj;
                        entd entdVar = cqrl.a;
                        buxzVar.u(iterable);
                        buxzVar.K(3);
                        buxzVar.ai(axuh.e);
                        return buxzVar;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                return elfo.i(cqpkVar2.c(bdmqVar.J(d.b())));
            }
        }, cqpkVar.b).h(new cqpe(), cqpkVar.b) : elfo.g(new Callable() { // from class: cqoy
            @Override // java.util.concurrent.Callable
            public final Object call() {
                int i = engw.d;
                engr engrVar = new engr();
                for (MessageIdType messageIdType : engwVar) {
                    cqpk cqpkVar2 = cqpk.this;
                    cqrn a2 = cqpkVar2.c.a(messageIdType);
                    if (a2.c()) {
                        engrVar.h(a2);
                    } else {
                        ensk n = cqpk.a.n();
                        n.Y(csux.b, messageIdType);
                        ((ensz) n.h("com/google/android/apps/messaging/shared/transfer/CancelFileTransferHelper", "cancelOngoingFileTransfersByMessageIds", 126, "CancelFileTransferHelper.java")).q("Trying to cancel a file transfer for a message that does not have a valid file transfer.");
                    }
                }
                return engrVar.g();
            }
        }, cqpkVar.b).i(new eroh() { // from class: cqoz
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                return cqpk.this.b((engw) obj);
            }
        }, cqpkVar.b)).h(new emwl() { // from class: cgqv
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                csjb a2 = cgqz.D.a();
                a2.I(String.format("Message ID of file transfers cancelled due to message deletion: %s", (engw) obj));
                a2.r();
                return engw.this;
            }
        }, this.c);
    }
}
