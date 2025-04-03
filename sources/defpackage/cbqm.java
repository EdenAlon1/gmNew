package defpackage;

import android.database.Cursor;
import android.text.TextUtils;
import androidx.car.app.model.Alert;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.queries.AnnotationSearchResult;
import com.google.android.apps.messaging.shared.datamodel.databasegen.queries.ConversationIdsQuery;
import com.google.android.apps.messaging.shared.datamodel.databasegen.queries.LocationAndLinkAnnotationIdsQuery;
import com.google.android.apps.messaging.shared.datamodel.databasegen.queries.LocationSearchQuery;
import com.google.android.apps.messaging.shared.datamodel.databasegen.queries.MediaSearchQuery;
import com.google.android.apps.messaging.shared.datamodel.databasegen.queries.MessageWithTextIdsQuery;
import com.google.android.apps.messaging.shared.datamodel.databasegen.queries.ParticipantIdsQuery;
import com.google.android.apps.messaging.shared.datamodel.databasegen.queries.UrlSearchQuery;
import com.google.android.apps.messaging.shared.datamodel.databasegen.queries.UrlSearchResult;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;
import j$.util.Collection;
import j$.util.DesugarArrays;
import j$.util.Map;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Collectors;
import j$.util.stream.Stream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cbqm implements cbpl {
    public static final /* synthetic */ int a = 0;
    private static final String b = "case when (" + bfkq.b.a.toString() + " in (%s)) then 0 else 1 end, " + bfkq.b.b.toString() + " DESC";
    private final cbqu c;
    private final ffbr d;

    public cbqm(cbqu cbquVar, ffbr ffbrVar) {
        this.c = cbquVar;
        this.d = ffbrVar;
    }

    public static dtzj u(dtry dtryVar, long j, long j2) {
        return new dtzq("$V >= $V AND $V < $V", new Object[]{dtryVar, Long.valueOf(j), dtryVar, Long.valueOf(j2)});
    }

    static List v(ConversationIdType conversationIdType, String str, Collection collection, boolean z) {
        ekzz f = eleg.f("DatabaseSearchOperationsImpl#getUrlsForSearch");
        try {
            csix.h();
            btsz w = w(fbqt.LINK_ANNOTATION, conversationIdType, collection);
            final btsz w2 = w(fbqt.ADDRESS_ANNOTATION, conversationIdType, null);
            final btsz w3 = w(fbqt.ASSISTANT_ANNOTATION, conversationIdType, null);
            btta b2 = bttf.b();
            b2.d(new Function() { // from class: cbqb
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    int i = cbqm.a;
                    return ((btsl) obj).c;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            b2.f(new Function() { // from class: cbqc
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    btte btteVar = (btte) obj;
                    int i = cbqm.a;
                    btteVar.g(btsz.this);
                    btteVar.g(w2);
                    return btteVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            btsz b3 = b2.b();
            bpyf a2 = UrlSearchQuery.a();
            a2.z("+getUrlsForSearch");
            bpyh bpyhVar = new bpyh();
            int intValue = UrlSearchQuery.c().intValue();
            if (intValue < 20040) {
                dtub.w("message_id", intValue);
            }
            bpyhVar.aq(new dtru("messages_annotations.message_id", 3, w));
            bpyhVar.aq(new dtwe("messages_annotations.annotation_type", 1, Integer.valueOf(fbqt.LINK_ANNOTATION.a())));
            int intValue2 = UrlSearchQuery.c().intValue();
            if (intValue2 < 20040) {
                dtub.w("message_id", intValue2);
            }
            bpyhVar.aq(new dtru("messages_annotations.message_id", 4, b3));
            if (!TextUtils.isEmpty(str)) {
                StringBuilder sb = new StringBuilder();
                cbqn.b(sb, str);
                bpyhVar.as(new dtzr(sb.toString()));
            }
            if (z) {
                bpyhVar.aq(new dtrx("message_star._id", 6));
            }
            bpyhVar.aq(new dtrx("parent_disallowed_conversations.conversation_id", 5));
            a2.r();
            a2.k(new bpyg(bpyhVar));
            bpxz bpxzVar = UrlSearchQuery.b;
            a2.C((String) DesugarArrays.stream(new bpyc[]{new bpyc(bpxzVar.a), new bpyc(bpxzVar.b)}).map(new Function() { // from class: bpye
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return ((bpyc) obj).a();
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }).collect(Collectors.joining(", ")));
            engw z2 = a2.b().z(new Supplier() { // from class: cbqd
                @Override // java.util.function.Supplier
                public final Object get() {
                    return new UrlSearchResult();
                }
            });
            f.close();
            return z2;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private static btsz w(fbqt fbqtVar, ConversationIdType conversationIdType, Collection collection) {
        ekzz f = eleg.f("DatabaseSearchOperationsImpl#getMessageIdsForSearchQuery");
        try {
            String[] strArr = bttf.a;
            btte btteVar = new btte();
            btteVar.b(fbqtVar.a());
            if (!conversationIdType.b()) {
                btteVar.aq(new dtrt("messages_annotations.conversation_id", 1, Long.valueOf(bdgq.a(conversationIdType))));
            }
            if (collection != null && !collection.isEmpty()) {
                btteVar.aq(new dtrw("messages_annotations._id", 3, btte.av((String[]) ((ArrayList) Collection.EL.stream(collection).map(new Function() { // from class: cbpq
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        int i = cbqm.a;
                        return ((Long) obj).toString();
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }).collect(Collectors.toCollection(new cbqg()))).toArray(new String[0])), false));
            }
            btta b2 = bttf.b();
            b2.z("getMessageIdsForSearchQuery");
            b2.d(new Function() { // from class: cbpr
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    int i = cbqm.a;
                    return ((btsl) obj).c;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            b2.v(bttf.c.c);
            b2.e(btteVar);
            btsz b3 = b2.b();
            f.close();
            return b3;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private static cbnb x(final String str, cbne cbneVar, int i) {
        cbmd cbmdVar;
        ekzz f = eleg.f("DatabaseSearchOperationsImpl#getConversations");
        try {
            if (cbneVar.f() && TextUtils.isEmpty(str)) {
                cbmdVar = null;
            } else {
                enip enipVar = (enip) Collection.EL.stream(cbneVar.d().entrySet()).filter(new Predicate() { // from class: cbpu
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
                        int i2 = cbqm.a;
                        return ((Long) ((Map.Entry) obj).getValue()).longValue() == -1;
                    }
                }).map(new Function() { // from class: cbpv
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return (ConversationIdType) ((Map.Entry) obj).getKey();
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }).collect(endq.b);
                java.util.Collection c = cbneVar.c();
                ekzz f2 = eleg.f("DatabaseSearchOperationsImpl#getConversationsForSearch");
                try {
                    csix.h();
                    String[] strArr = MessagesTable.a;
                    buxz buxzVar = new buxz();
                    buxzVar.an(axuh.b);
                    final ConversationIdType[] conversationIdTypeArr = (ConversationIdType[]) ((ArrayList) Collection.EL.stream(enipVar).collect(Collectors.toCollection(new cbqg()))).toArray(new ConversationIdType[0]);
                    String[] strArr2 = bons.a;
                    bonp bonpVar = new bonp(bons.a);
                    bonpVar.d(new Function() { // from class: cbqh
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo448andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            bonr bonrVar = (bonr) obj;
                            int i2 = cbqm.a;
                            bonrVar.b(str);
                            return bonrVar;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    bonpVar.c(new Function() { // from class: cbqi
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo448andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            int i2 = cbqm.a;
                            return ((bonl) obj).a;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    bono b2 = bonpVar.b();
                    if (!c.isEmpty() || !enipVar.isEmpty()) {
                        final MessageIdType[] messageIdTypeArr = (MessageIdType[]) ((ArrayList) Collection.EL.stream(c).collect(Collectors.toCollection(new cbqg()))).toArray(new MessageIdType[0]);
                        buxzVar.b(new Function() { // from class: cbqj
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo448andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj) {
                                buxz buxzVar2 = (buxz) obj;
                                int i2 = cbqm.a;
                                buxzVar2.v(messageIdTypeArr);
                                return buxzVar2;
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        }, new Function() { // from class: cbqk
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo448andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj) {
                                buxz buxzVar2 = (buxz) obj;
                                int i2 = cbqm.a;
                                buxzVar2.aq(new dtrw("messages.conversation_id", 3, buxz.at((Iterable) DesugarArrays.stream(conversationIdTypeArr).map(new Function() { // from class: buxv
                                    @Override // java.util.function.Function
                                    /* renamed from: andThen */
                                    public final /* synthetic */ Function mo448andThen(Function function) {
                                        return Function$CC.$default$andThen(this, function);
                                    }

                                    @Override // java.util.function.Function
                                    public final Object apply(Object obj2) {
                                        return String.valueOf(bdgq.a((ConversationIdType) obj2));
                                    }

                                    public final /* synthetic */ Function compose(Function function) {
                                        return Function$CC.$default$compose(this, function);
                                    }
                                }).collect(Collectors.toCollection(new buxw()))), true));
                                return buxzVar2;
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        });
                    }
                    if (!TextUtils.isEmpty(str)) {
                        buxzVar.o(b2);
                    }
                    buxo d = MessagesTable.d();
                    d.c(MessagesTable.c.a);
                    d.n(new dtzq("MAX($V)", new Object[]{MessagesTable.c.i}), "max_received_timestamp_expression");
                    d.g(buxzVar);
                    d.v(MessagesTable.c.b);
                    buxm b3 = d.b();
                    String[] strArr3 = bfkq.a;
                    bfkp bfkpVar = new bfkp();
                    bfkpVar.aq(new dtru("messages._id", 3, new dtzq(" (SELECT $R FROM ($R)) ", new Object[]{"_id", b3.I()})));
                    buxo d2 = MessagesTable.d();
                    d2.c(MessagesTable.c.b);
                    d2.h(new Function() { // from class: cbql
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo448andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            buxz buxzVar2 = (buxz) obj;
                            int i2 = cbqm.a;
                            buxzVar2.n(new dtzq("$V", new Object[]{bsom.c.a}));
                            buxzVar2.b(new Function() { // from class: cbpy
                                @Override // java.util.function.Function
                                /* renamed from: andThen */
                                public final /* synthetic */ Function mo448andThen(Function function) {
                                    return Function$CC.$default$andThen(this, function);
                                }

                                @Override // java.util.function.Function
                                public final Object apply(Object obj2) {
                                    buxz buxzVar3 = (buxz) obj2;
                                    int i3 = cbqm.a;
                                    buxzVar3.al();
                                    return buxzVar3;
                                }

                                public final /* synthetic */ Function compose(Function function) {
                                    return Function$CC.$default$compose(this, function);
                                }
                            }, new Function() { // from class: cbpz
                                @Override // java.util.function.Function
                                /* renamed from: andThen */
                                public final /* synthetic */ Function mo448andThen(Function function) {
                                    return Function$CC.$default$andThen(this, function);
                                }

                                @Override // java.util.function.Function
                                public final Object apply(Object obj2) {
                                    buxz buxzVar3 = (buxz) obj2;
                                    int i3 = cbqm.a;
                                    buxzVar3.ag();
                                    return buxzVar3;
                                }

                                public final /* synthetic */ Function compose(Function function) {
                                    return Function$CC.$default$compose(this, function);
                                }
                            });
                            return buxzVar2;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    d2.v(MessagesTable.c.b);
                    d2.w(new dtzq("COUNT($V{p}) > 0", new Object[]{MessagesTable.c.b}));
                    final buxm b4 = d2.b();
                    bfkpVar.b(new Function() { // from class: cbpn
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo448andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            bfkp bfkpVar2 = (bfkp) obj;
                            int i2 = cbqm.a;
                            int intValue = bfkq.d().intValue();
                            if (intValue < 10007) {
                                dtub.w("conv_type", intValue);
                            }
                            buxm buxmVar = buxm.this;
                            bfkpVar2.aq(new dtwe("conversations.conv_type", 1, 0));
                            bfkpVar2.e(new dtzq("($R)", new Object[]{buxmVar.I()}));
                            return bfkpVar2;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    }, new Function() { // from class: cbpo
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo448andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            bfkp bfkpVar2 = (bfkp) obj;
                            int i2 = cbqm.a;
                            int intValue = bfkq.d().intValue();
                            if (intValue < 10007) {
                                dtub.w("conv_type", intValue);
                            }
                            bfkpVar2.aq(new dtwe("conversations.conv_type", 2, 0));
                            return bfkpVar2;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    bfkk b5 = bejc.b();
                    b5.v(bfkq.b.a);
                    b5.C(String.format(Locale.US, b, new emww(",").f(conversationIdTypeArr)));
                    b5.d(bfkpVar);
                    b5.x(i);
                    bfkf bfkfVar = (bfkf) b5.b().o();
                    f2.close();
                    Cursor a2 = bfkfVar.a();
                    azyd.l(a2);
                    cbnb cbnbVar = cbnb.c;
                    cbmdVar = new cbmd(a2, enipVar);
                } finally {
                }
            }
            f.close();
            return cbmdVar;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.cbpl
    public final long a(int i) {
        ekzz f;
        ekzz f2 = eleg.f("DatabaseSearchOperationsImpl#getLastId");
        long j = 0;
        try {
            if (i == 1) {
                ekzz f3 = eleg.f("messages");
                try {
                    String[] strArr = MessageWithTextIdsQuery.a;
                    bofb bofbVar = new bofb(MessageWithTextIdsQuery.a);
                    bofbVar.z("getLastId-messages");
                    bofbVar.x(1);
                    bofbVar.C((String) DesugarArrays.stream(new boey[]{new boey(MessageWithTextIdsQuery.b.a)}).map(new Function() { // from class: bofa
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo448andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            return ((boey) obj).a();
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    }).collect(Collectors.joining(", ")));
                    boex boexVar = (boex) bofbVar.b().o();
                    try {
                        if (boexVar.moveToNext()) {
                            j = boexVar.getLong(0);
                            boexVar.close();
                        } else {
                            boexVar.close();
                        }
                        f3.close();
                    } finally {
                    }
                } finally {
                    try {
                        f3.close();
                    } catch (Throwable th) {
                        th.addSuppressed(th);
                    }
                }
            } else if (i == 2) {
                f = eleg.f("conversations");
                try {
                    bsob e = bsom.e();
                    e.z("getLastId-conversations");
                    e.d();
                    e.r();
                    e.x(1);
                    e.g(new Function() { // from class: cbqe
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo448andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            int i2 = cbqm.a;
                            return ((bskp) obj).a;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    e.e(new bsny(bsom.c.a, false));
                    bskr bskrVar = (bskr) e.b().o();
                    try {
                        if (bskrVar.moveToNext()) {
                            j = bskrVar.h().a;
                            bskrVar.close();
                        } else {
                            bskrVar.close();
                        }
                        f.close();
                    } finally {
                    }
                } finally {
                    try {
                        f.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
            } else if (i == 3) {
                f = eleg.f("participants");
                try {
                    String[] strArr2 = ParticipantIdsQuery.a;
                    boje bojeVar = new boje(ParticipantIdsQuery.a);
                    bojeVar.z("getLastId-participants");
                    bojeVar.r();
                    bojeVar.x(1);
                    bojeVar.C((String) DesugarArrays.stream(new bojb[]{new bojb(ParticipantIdsQuery.b.a)}).map(new Function() { // from class: bojd
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo448andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            return ((bojb) obj).a();
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    }).collect(Collectors.joining(", ")));
                    boja bojaVar = (boja) bojeVar.b().o();
                    try {
                        if (bojaVar.moveToNext()) {
                            j = bojaVar.getLong(0);
                            bojaVar.close();
                        } else {
                            bojaVar.close();
                        }
                        f.close();
                    } finally {
                    }
                } finally {
                }
            } else if (i != 4) {
                emxf.m(false, "Unknown table type");
            } else {
                f = eleg.f("annotations");
                try {
                    String[] strArr3 = LocationAndLinkAnnotationIdsQuery.a;
                    bkgb bkgbVar = new bkgb(LocationAndLinkAnnotationIdsQuery.a);
                    bkgbVar.z("getLastId-messages_annotations");
                    bkgbVar.x(1);
                    bkgbVar.C((String) DesugarArrays.stream(new bkfy[]{new bkfy(LocationAndLinkAnnotationIdsQuery.b.a)}).map(new Function() { // from class: bkga
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo448andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            return ((bkfy) obj).a();
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    }).collect(Collectors.joining(", ")));
                    bkfx bkfxVar = (bkfx) bkgbVar.b().o();
                    try {
                        if (bkfxVar.moveToNext()) {
                            j = bkfxVar.getLong(0);
                            bkfxVar.close();
                        } else {
                            bkfxVar.close();
                        }
                        f.close();
                    } finally {
                    }
                } finally {
                }
            }
            f2.close();
            return j;
        } catch (Throwable th3) {
            try {
                f2.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    @Override // defpackage.cbpl
    public final bseh b(final ConversationIdType conversationIdType) {
        ekzz f = eleg.f("DatabaseSearchOperationsImpl#getConversation");
        try {
            bsob e = bsom.e();
            e.z("DatabaseSearchOperations#getConversation");
            e.d();
            e.i(new Function() { // from class: cbqa
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    bsol bsolVar = (bsol) obj;
                    int i = cbqm.a;
                    bsolVar.q(ConversationIdType.this);
                    return bsolVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            bskr bskrVar = (bskr) e.b().o();
            try {
                bseh bsehVar = (bseh) bskrVar.cQ();
                bskrVar.close();
                f.close();
                return bsehVar;
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

    @Override // defpackage.cbpl
    public final btrw c(String str) {
        ekzz f = eleg.f("DatabaseSearchOperationsImpl#getMessageAnnotation");
        try {
            btta b2 = bttf.b();
            b2.z("messages_annotations.queryOnId");
            b2.q();
            btte btteVar = new btte();
            btteVar.d(str);
            b2.e(btteVar);
            btrw btrwVar = (btrw) dtub.c(b2.b());
            f.close();
            return btrwVar;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.cbpl
    public final MessagesTable.BindData d(MessageIdType messageIdType) {
        ekzz f = eleg.f("DatabaseSearchOperationsImpl#getMessage");
        try {
            MessagesTable.BindData b2 = MessagesTable.b(messageIdType);
            f.close();
            return b2;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.cbpl
    public final ParticipantsTable.BindData e(String str) {
        ekzz f = eleg.f("DatabaseSearchOperationsImpl#getParticipant");
        try {
            ParticipantsTable.BindData b2 = ParticipantsTable.b(str);
            f.close();
            return b2;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.cbpl
    public final cbnb f(bfkp bfkpVar) {
        bfkk c = bejc.c();
        c.v(bfkq.b.a);
        c.c(new bfkh(bfkq.b.b, false));
        c.d(bfkpVar);
        Cursor a2 = ((bfkf) c.b().o()).a();
        azyd.l(a2);
        enpd enpdVar = enpd.a;
        cbnb cbnbVar = cbnb.c;
        return new cbmd(a2, enpdVar);
    }

    @Override // defpackage.cbpl
    public final cbnb g(String str, cbne cbneVar) {
        return x(str, cbneVar, Alert.DURATION_SHOW_INDEFINITELY);
    }

    @Override // defpackage.cbpl
    public final cbnb h(String str, cbne cbneVar, int i) {
        return x(str, cbneVar, i);
    }

    @Override // defpackage.cbpl
    public final cbnb i(ConversationIdType conversationIdType, final String str, java.util.Collection collection, int i) {
        String[] strArr = bfkq.a;
        bfkp bfkpVar = new bfkp();
        bfkpVar.aq(new dtrt("parts.content_type", 1, "text/plain"));
        bfkpVar.aq(new dtrx("message_star._id", 6));
        if (!conversationIdType.b()) {
            bfkpVar.aq(new dtrt("messages.conversation_id", 1, Long.valueOf(bdgq.a(conversationIdType))));
        }
        if (!collection.isEmpty()) {
            engr engrVar = new engr();
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                engrVar.h(String.valueOf(bdhb.a((MessageIdType) it.next())));
            }
            bfkpVar.aq(new dtrw("messages._id", 3, bfkp.at(engrVar.g()), true));
        }
        if (!TextUtils.isEmpty(str)) {
            String[] strArr2 = bons.a;
            bonp bonpVar = new bonp(bons.a);
            bonpVar.z("subqueryForParticipants");
            bonpVar.d(new Function() { // from class: cbps
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    bonr bonrVar = (bonr) obj;
                    int i2 = cbqm.a;
                    bonrVar.b(str);
                    return bonrVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            bonpVar.c(new Function() { // from class: cbpt
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    int i2 = cbqm.a;
                    return ((bonl) obj).a;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            bfkpVar.e(bonpVar.b());
        }
        bfkk b2 = bejc.b();
        b2.c(new bfkh(bfkq.b.c, false));
        b2.d(bfkpVar);
        b2.x(i);
        Cursor a2 = ((bfkf) b2.b().o()).a();
        azyd.l(a2);
        enpd enpdVar = enpd.a;
        cbnb cbnbVar = cbnb.c;
        return new cbmd(a2, enpdVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.cbpl
    public final List j(ConversationIdType conversationIdType, String str, cbne cbneVar, boolean z) {
        java.util.Collection b2;
        ekzz f = eleg.f("DatabaseSearchOperationsImpl#getLocations");
        if (cbneVar != null) {
            try {
                b2 = cbneVar.b();
            } catch (Throwable th) {
                try {
                    f.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } else {
            b2 = null;
        }
        ekzz f2 = eleg.f("DatabaseSearchOperationsImpl#getAddressAnnotationForSearch");
        try {
            csix.h();
            btsz w = w(fbqt.ADDRESS_ANNOTATION, conversationIdType, b2);
            String[] strArr = LocationSearchQuery.a;
            bkwt bkwtVar = new bkwt();
            int intValue = LocationSearchQuery.c().intValue();
            if (intValue < 20040) {
                dtub.w("message_id", intValue);
            }
            bkwtVar.aq(new dtru("messages_annotations.message_id", 3, w));
            if (!TextUtils.isEmpty(str)) {
                StringBuilder sb = new StringBuilder();
                cbqn.b(sb, str);
                bkwtVar.as(new dtzr(sb.toString()));
            }
            if (z) {
                bkwtVar.aq(new dtrx("message_star._id", 6));
            }
            bkwtVar.aq(new dtrx("parent_disallowed_conversations.conversation_id", 5));
            bkwr a2 = LocationSearchQuery.a();
            a2.z("+getAddressAnnotationForSearch");
            a2.k(new bkws(bkwtVar));
            a2.r();
            bkwl bkwlVar = LocationSearchQuery.b;
            a2.C((String) DesugarArrays.stream(new bkwo[]{new bkwo(bkwlVar.b), new bkwo(bkwlVar.a)}).map(new Function() { // from class: bkwq
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return ((bkwo) obj).a();
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }).collect(Collectors.joining(", ")));
            List z2 = a2.b().z(new Supplier() { // from class: cbqf
                @Override // java.util.function.Supplier
                public final Object get() {
                    return new AnnotationSearchResult();
                }
            });
            f2.close();
            List v = v(conversationIdType, str, b2, z);
            cbqu cbquVar = this.c;
            if (z2 == null) {
                z2 = new ArrayList();
            }
            if (v == null) {
                v = new ArrayList();
            }
            ArrayList arrayList = new ArrayList();
            Map a3 = cbqu.a(z2, new Function() { // from class: cbqo
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    String b3 = ((AnnotationSearchResult) obj).f().b();
                    b3.getClass();
                    return b3;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }, new Predicate() { // from class: cbqp
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
                    fbuk g = ((AnnotationSearchResult) obj).g();
                    if (g == null || g.c != 7) {
                        return false;
                    }
                    fbrx fbrxVar = (fbrx) g.d;
                    int i = fbrxVar.b;
                    int i2 = i & 4;
                    if ((i & 1) == 0 && i2 == 0) {
                        return false;
                    }
                    if (i2 != 0) {
                        return true;
                    }
                    fbvn fbvnVar = fbrxVar.c;
                    if (fbvnVar == null) {
                        fbvnVar = fbvn.a;
                    }
                    return (fbvnVar.b.isEmpty() && fbvnVar.c.isEmpty() && fbvnVar.d.isEmpty()) ? false : true;
                }
            });
            Map a4 = cbqu.a(v, new Function() { // from class: cbqq
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    String b3 = ((UrlSearchResult) obj).k().b();
                    b3.getClass();
                    return b3;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }, new Predicate() { // from class: cbqr
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
                    return cbqu.b((UrlSearchResult) obj);
                }
            });
            enqu it = enpw.d(a3.keySet(), a4.keySet()).iterator();
            while (it.hasNext()) {
                String str2 = (String) it.next();
                int i = engw.d;
                engw engwVar = (engw) Map.EL.getOrDefault(a3, str2, enou.a);
                engwVar.getClass();
                engw<UrlSearchResult> engwVar2 = (engw) Map.EL.getOrDefault(a4, str2, enou.a);
                engwVar2.getClass();
                if (!engwVar2.isEmpty() && engwVar.isEmpty()) {
                    for (UrlSearchResult urlSearchResult : engwVar2) {
                        cbmg cbmgVar = new cbmg();
                        cbmgVar.s(urlSearchResult, cbquVar.a);
                        arrayList.add(cbmgVar.b());
                    }
                } else if (engwVar2.isEmpty()) {
                    Iterator<E> it2 = engwVar.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(new cbmg().r((AnnotationSearchResult) it2.next(), cbquVar.a).b());
                    }
                } else {
                    if (engwVar.size() == 1 && engwVar2.size() == 1) {
                        fbuk l = ((UrlSearchResult) engwVar2.get(0)).l();
                        fbuk g = ((AnnotationSearchResult) engwVar.get(0)).g();
                        g.getClass();
                        if (l != null) {
                            if (!(l.c == 8 ? (fbue) l.d : fbue.a).c.isEmpty()) {
                                String str3 = (l.c == 8 ? (fbue) l.d : fbue.a).c;
                                fbvl fbvlVar = (g.c == 7 ? (fbrx) g.d : fbrx.a).e;
                                if (fbvlVar == null) {
                                    fbvlVar = fbvl.a;
                                }
                                if (str3.equalsIgnoreCase(fbvlVar.f)) {
                                    cbmg cbmgVar2 = new cbmg();
                                    cbmgVar2.s((UrlSearchResult) engwVar2.get(0), cbquVar.a);
                                    arrayList.add(cbmgVar2.r((AnnotationSearchResult) engwVar.get(0), cbquVar.a).b());
                                }
                            }
                        }
                    }
                    for (UrlSearchResult urlSearchResult2 : engwVar2) {
                        cbmg cbmgVar3 = new cbmg();
                        cbmgVar3.s(urlSearchResult2, cbquVar.a);
                        arrayList.add(cbmgVar3.b());
                    }
                }
            }
            Collections.sort(arrayList, new Comparator() { // from class: cbqs
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    cbni cbniVar = (cbni) obj;
                    cbni cbniVar2 = (cbni) obj2;
                    return cbniVar.b() != cbniVar2.b() ? Long.compare(cbniVar2.b(), cbniVar.b()) : Long.compare(cbniVar2.d().a, cbniVar.d().a);
                }
            });
            f.close();
            return arrayList;
        } finally {
        }
    }

    @Override // defpackage.cbpl
    public final List k(ConversationIdType conversationIdType, java.util.Collection collection) {
        ekzz f = eleg.f("DatabaseSearchOperationsImpl#getMessageIdsOrderedByTimeExcludingDraft");
        try {
            ArrayList arrayList = new ArrayList();
            if (!collection.isEmpty()) {
                ArrayList arrayList2 = new ArrayList(collection);
                String str = blyg.a;
                String[] strArr = bmpy.a;
                bmpt bmptVar = new bmpt(bmpy.a);
                bmptVar.z("+queryConversationMessageIdsByTimeQuerySql");
                bmptVar.o(blyg.d, "messages.received_timestamp");
                bmptVar.o(blyg.b, "ASC");
                bmptVar.o(blyg.a, conversationIdType.a());
                bmptVar.o(blyg.c, "messages.message_status <> 3");
                if (!arrayList2.isEmpty()) {
                    int size = arrayList2.size();
                    final MessageIdType[] messageIdTypeArr = new MessageIdType[size];
                    for (int i = 0; i < size; i++) {
                        messageIdTypeArr[i] = (MessageIdType) arrayList2.get(i);
                    }
                    bmptVar.d(new Function() { // from class: blyd
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo448andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            bmpx bmpxVar = (bmpx) obj;
                            String str2 = blyg.a;
                            bmpxVar.aq(new dtrw("messages._id", 3, bmpx.at((Iterable) DesugarArrays.stream(messageIdTypeArr).map(new Function() { // from class: bmpw
                                @Override // java.util.function.Function
                                /* renamed from: andThen */
                                public final /* synthetic */ Function mo448andThen(Function function) {
                                    return Function$CC.$default$andThen(this, function);
                                }

                                @Override // java.util.function.Function
                                public final Object apply(Object obj2) {
                                    return String.valueOf(bdhb.a((MessageIdType) obj2));
                                }

                                public final /* synthetic */ Function compose(Function function) {
                                    return Function$CC.$default$compose(this, function);
                                }
                            }).collect(Collectors.toCollection(new Supplier() { // from class: bmpv
                                @Override // java.util.function.Supplier
                                public final Object get() {
                                    return new ArrayList();
                                }
                            }))), true));
                            return bmpxVar;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                }
                bmpp bmppVar = (bmpp) bmptVar.b().o();
                while (bmppVar.moveToNext()) {
                    try {
                        arrayList.add(bmppVar.c());
                    } finally {
                    }
                }
                bmppVar.close();
            }
            f.close();
            return arrayList;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.cbpl
    public final List l(java.util.Collection collection, final ConversationIdType conversationIdType) {
        engw y;
        ekzz f = eleg.f("DatabaseSearchOperationsImpl#getParticipants");
        try {
            if (collection.isEmpty()) {
                int i = engw.d;
                y = enou.a;
            } else {
                String[] strArr = new String[collection.size()];
                Iterator it = collection.iterator();
                int i2 = 0;
                while (it.hasNext()) {
                    strArr[i2] = String.valueOf(((Long) it.next()).longValue());
                    i2++;
                }
                String[] strArr2 = ParticipantsTable.a;
                bvvw bvvwVar = new bvvw();
                bvvwVar.aq(new dtrw("participants._id", 3, bvvw.av(strArr), false));
                if (!conversationIdType.b()) {
                    String[] strArr3 = bsdr.a;
                    bsdm bsdmVar = new bsdm(bsdr.a);
                    bsdmVar.f(new Function() { // from class: cbpw
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo448andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            bsdq bsdqVar = (bsdq) obj;
                            int i3 = cbqm.a;
                            bsdqVar.b(ConversationIdType.this);
                            return bsdqVar;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    bsdmVar.c(bsdr.c.b);
                    bvvwVar.l(bsdmVar.b());
                }
                bvvn e = ParticipantsTable.e();
                e.z("+DatabaseSearchOperations#getParticipants");
                e.g(bvvwVar);
                e.v(ParticipantsTable.c.r);
                e.d(new bvvk(ParticipantsTable.c.m, true));
                y = e.b().y();
            }
            f.close();
            return y;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.cbpl
    public final List m(final MessageIdType messageIdType) {
        ekzz f = eleg.f("DatabaseSearchOperationsImpl#getParts");
        try {
            bwdf c = PartsTable.c();
            c.z("DatabaseSearchOperations#getParts");
            c.h(new Function() { // from class: cbpx
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    bwdm bwdmVar = (bwdm) obj;
                    int i = cbqm.a;
                    bwdmVar.n(MessageIdType.this);
                    return bwdmVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            engw y = c.b().y();
            f.close();
            return y;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.cbpl
    public final List n(ConversationIdType conversationIdType, String str, cbne cbneVar, boolean z, int i) {
        java.util.Collection a2;
        ekzz f = eleg.f("DatabaseSearchOperationsImpl#getUrls");
        if (cbneVar != null) {
            try {
                a2 = cbneVar.a();
            } catch (Throwable th) {
                try {
                    f.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } else {
            a2 = null;
        }
        Stream limit = Collection.EL.stream(v(conversationIdType, str, a2, z)).filter(new Predicate() { // from class: cbpp
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
                int i2 = cbqm.a;
                return !cbqu.b((UrlSearchResult) obj);
            }
        }).limit(i);
        int i2 = engw.d;
        List list = (List) limit.collect(endq.a);
        f.close();
        return list;
    }

    @Override // defpackage.cbpl
    public final Set o(int i, final long j, final long j2) {
        Object apply;
        ekzz f;
        ekzz f2 = eleg.f("DatabaseSearchOperationsImpl#getIndexableIdsInRange");
        try {
            cmj cmjVar = new cmj();
            if (i == 1) {
                ekzz f3 = eleg.f("messages");
                try {
                    String[] strArr = MessageWithTextIdsQuery.a;
                    bofb bofbVar = new bofb(MessageWithTextIdsQuery.a);
                    bofbVar.z("getIndexableIdsInRangeOld-messages");
                    apply = new Function() { // from class: cbpm
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo448andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            bofd bofdVar = (bofd) obj;
                            int i2 = cbqm.a;
                            bofdVar.as(cbqm.u(MessageWithTextIdsQuery.b.a, j, j2));
                            return bofdVar;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    }.apply(new bofd());
                    bofbVar.k(new bofc((bofd) apply));
                    boex boexVar = (boex) bofbVar.b().o();
                    while (boexVar.moveToNext()) {
                        try {
                            cmjVar.add(Long.valueOf(boexVar.c().a));
                        } finally {
                        }
                    }
                    boexVar.close();
                    f3.close();
                } finally {
                    try {
                        f3.close();
                    } catch (Throwable th) {
                        th.addSuppressed(th);
                    }
                }
            } else if (i == 2) {
                f = eleg.f("conversations");
                try {
                    String[] strArr2 = ConversationIdsQuery.a;
                    beiy beiyVar = new beiy(ConversationIdsQuery.a);
                    beiyVar.z("getIndexableIdsInRangeOld-conversations");
                    ((dtri) beiyVar.a).o = true;
                    beja bejaVar = new beja();
                    bejaVar.as(u(ConversationIdsQuery.b.a, j, j2));
                    beiyVar.k(new beiz(bejaVar));
                    beiw beiwVar = (beiw) beiyVar.b().o();
                    while (beiwVar.moveToNext()) {
                        try {
                            cmjVar.add(Long.valueOf(beiwVar.c().a));
                        } finally {
                        }
                    }
                    beiwVar.close();
                    f.close();
                } finally {
                    try {
                        f.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
            } else if (i == 3) {
                f = eleg.f("participants");
                try {
                    String[] strArr3 = ParticipantIdsQuery.a;
                    boje bojeVar = new boje(ParticipantIdsQuery.a);
                    bojeVar.z("getIndexableIdsInRangeOld-participants");
                    bojg bojgVar = new bojg();
                    bojgVar.as(u(ParticipantIdsQuery.b.a, j, j2));
                    bojeVar.k(new bojf(bojgVar));
                    boja bojaVar = (boja) bojeVar.b().o();
                    while (bojaVar.moveToNext()) {
                        try {
                            cmjVar.add(Long.valueOf(bojaVar.c()));
                        } finally {
                        }
                    }
                    bojaVar.close();
                    f.close();
                } finally {
                }
            } else {
                if (i != 4) {
                    throw new IllegalArgumentException("Unknown table type");
                }
                f = eleg.f("annotations");
                try {
                    String[] strArr4 = LocationAndLinkAnnotationIdsQuery.a;
                    bkgb bkgbVar = new bkgb(LocationAndLinkAnnotationIdsQuery.a);
                    bkgbVar.z("getIndexableIdsInRangeOld-messages_annotations");
                    bkgd bkgdVar = new bkgd();
                    bkgdVar.as(u(LocationAndLinkAnnotationIdsQuery.b.a, j, j2));
                    bkgbVar.k(new bkgc(bkgdVar));
                    bkfx bkfxVar = (bkfx) bkgbVar.b().o();
                    while (bkfxVar.moveToNext()) {
                        try {
                            cmjVar.add(Long.valueOf(bkfxVar.c()));
                        } finally {
                        }
                    }
                    bkfxVar.close();
                    f.close();
                } finally {
                }
            }
            f2.close();
            return cmjVar;
        } catch (Throwable th3) {
            try {
                f2.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    @Override // defpackage.cbpl
    public final void p(String str, fbuk fbukVar) {
        ekzz f = eleg.f("DatabaseSearchOperationsImpl#replaceAnnotation");
        try {
            ekzz f2 = eleg.f("MessageAnnotationDatabaseOperations#updateAnnotationDetails");
            try {
                csix.h();
                String[] strArr = bttf.a;
                bttc bttcVar = new bttc();
                bttcVar.ap("updateAnnotationDetails");
                if (fbukVar == null) {
                    bttcVar.a.putNull("annotation_details");
                } else {
                    bttcVar.a.put("annotation_details", fbukVar.toByteArray());
                }
                bttcVar.am();
                btte btteVar = new btte();
                btteVar.d(str);
                bttcVar.aj(new bttd(btteVar), "messages_annotations-buildAndUpdateForId");
                f2.close();
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

    @Override // defpackage.cbpl
    public final blqw q(ConversationIdType conversationIdType, String str, boolean z) {
        return r(conversationIdType, str, z, Alert.DURATION_SHOW_INDEFINITELY);
    }

    @Override // defpackage.cbpl
    public final blqw r(ConversationIdType conversationIdType, String str, boolean z, int i) {
        ekzz f = eleg.f("DatabaseSearchOperationsImpl#getImages");
        try {
            ekzz f2 = eleg.f("DatabaseSearchOperationsImpl#getPhotosForSearch");
            try {
                csix.h();
                String[] strArr = MediaSearchQuery.a;
                blrc blrcVar = new blrc();
                blrcVar.as(new dtzr(cbqn.a(str, conversationIdType, ((avek) this.d.b()).a() ? Arrays.asList(le.b) : Arrays.asList("image/jpeg", "image/jpg", "image/png", "image/gif"))));
                if (z) {
                    blrcVar.c();
                }
                blrcVar.b();
                blra a2 = MediaSearchQuery.a();
                a2.z("+getPhotosForSearch");
                a2.d(blrcVar);
                a2.r();
                a2.c(new blqx(MediaSearchQuery.b.a));
                a2.x(i);
                blqw blqwVar = (blqw) a2.b().o();
                f2.close();
                f.close();
                return blqwVar;
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

    @Override // defpackage.cbpl
    public final blqw s(ConversationIdType conversationIdType, String str, boolean z) {
        return t(conversationIdType, str, z, Alert.DURATION_SHOW_INDEFINITELY);
    }

    @Override // defpackage.cbpl
    public final blqw t(ConversationIdType conversationIdType, String str, boolean z, int i) {
        ekzz f = eleg.f("DatabaseSearchOperationsImpl#getVideos");
        try {
            ekzz f2 = eleg.f("DatabaseSearchOperationsImpl#getVideosForSearch");
            try {
                csix.h();
                String[] strArr = MediaSearchQuery.a;
                blrc blrcVar = new blrc();
                blrcVar.as(new dtzr(cbqn.a(str, conversationIdType, Arrays.asList(le.a))));
                if (z) {
                    blrcVar.c();
                }
                blrcVar.b();
                blra a2 = MediaSearchQuery.a();
                a2.z("+getVideosForSearch");
                a2.d(blrcVar);
                a2.r();
                a2.c(new blqx(MediaSearchQuery.b.a));
                a2.x(i);
                blqw blqwVar = (blqw) a2.b().o();
                f2.close();
                f.close();
                return blqwVar;
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
