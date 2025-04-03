package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.label.data.classification.SuperSortLabel;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import j$.util.Collection;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cgpv {
    public static final cskc a = cskc.g("BugleDataModel", "DeleteDatabaseOperations");
    public final ffbr b;
    public final dtuu c;
    public final ffbr d;
    public final ffbr e;
    public final ffbr f;
    public final ffbr g;
    private final ffbr h;

    public cgpv(ffbr ffbrVar, dtuu dtuuVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, ffbr ffbrVar6) {
        this.b = ffbrVar;
        this.c = dtuuVar;
        this.h = ffbrVar2;
        this.d = ffbrVar3;
        this.e = ffbrVar4;
        this.f = ffbrVar5;
        this.g = ffbrVar6;
    }

    private final cgot i(final ConversationIdType conversationIdType, final long j, final SuperSortLabel superSortLabel, final boolean z) {
        csix.h();
        ((azei) this.h.b()).d(new Consumer() { // from class: cgou
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                ((cpwf) obj).a(ConversationIdType.this);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        csjb c = a.c();
        c.I("Delete conversation in transaction");
        c.c(conversationIdType);
        c.z("CutoffTimestamp", j);
        c.B("ClearCMSId", z);
        c.B("IsSpecific", superSortLabel.b());
        c.r();
        return (cgot) this.c.c("DeleteDatabaseOperations#deleteConversation", new emyl() { // from class: cgpf
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.emyl
            public final Object get() {
                engw a2;
                engw engwVar;
                int i = engw.d;
                engw engwVar2 = enou.a;
                cgop cgopVar = new cgop();
                cgopVar.a(false);
                boolean z2 = z;
                final ConversationIdType conversationIdType2 = conversationIdType;
                if (z2) {
                    csix.h();
                    String[] strArr = bsom.a;
                    bsoe bsoeVar = new bsoe();
                    bsoeVar.ap("setConversationCmsId");
                    bsoeVar.ad(new Function() { // from class: crye
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo448andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            bsol bsolVar = (bsol) obj;
                            bsolVar.q(ConversationIdType.this);
                            bsolVar.g();
                            return bsolVar;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    bsoeVar.k("");
                    boolean z3 = bsoeVar.b().e() > 0;
                    csjb c2 = cgpv.a.c();
                    c2.B("clearCmsIdSuccess", z3);
                    c2.r();
                }
                bseh b = bsom.b(conversationIdType2);
                String R = b != null ? b.R() : null;
                if (R != null && !R.isEmpty()) {
                    ekzz f = eleg.f("DeleteDatabaseOperations#deleteConversation#excludeMessagesFromCms");
                    try {
                        String[] strArr2 = MessagesTable.a;
                        buxr buxrVar = new buxr();
                        buxrVar.ap("DeleteDatabaseOperations#deleteConversation#excludeMessagesFromCms");
                        buxrVar.m(csgg.EXCLUDED);
                        buxrVar.Y(new Function() { // from class: cgpp
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo448andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj) {
                                buxz buxzVar = (buxz) obj;
                                buxzVar.m(ConversationIdType.this);
                                int intValue = MessagesTable.g().intValue();
                                if (intValue < 58210) {
                                    dtub.w("cms_life_cycle", intValue);
                                }
                                buxzVar.aq(new dtrx("messages.cms_life_cycle", 6));
                                return buxzVar;
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        });
                        int e = buxrVar.b().e();
                        csjb c3 = cgpv.a.c();
                        c3.y("excludedMessagesFromCmsCount", e);
                        c3.r();
                        f.close();
                    } finally {
                    }
                }
                final long j2 = j;
                if (j2 == Long.MAX_VALUE || j2 < 0) {
                    csjb c4 = cgpv.a.c();
                    c4.A("Delete messages, ConversationId", conversationIdType2);
                    c4.r();
                    String[] strArr3 = MessagesTable.a;
                    buxh buxhVar = new buxh();
                    buxhVar.c(new Function() { // from class: cgpr
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo448andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            buxz buxzVar = (buxz) obj;
                            buxzVar.m(ConversationIdType.this);
                            return buxzVar;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    a2 = buxhVar.b().a();
                } else {
                    csjb c5 = cgpv.a.c();
                    c5.I("Delete all messages prior to cutoff.");
                    c5.c(conversationIdType2);
                    c5.z("Cut Off", j2);
                    c5.r();
                    buxo d = MessagesTable.d();
                    d.z("deleteConversation");
                    d.f(new Function() { // from class: cgps
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo448andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            return ((buum) obj).a;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    d.h(new Function() { // from class: cgpt
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo448andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            buxz buxzVar = (buxz) obj;
                            buxzVar.m(ConversationIdType.this);
                            buxzVar.U(j2);
                            return buxzVar;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    final buxm b2 = d.b();
                    buxh buxhVar2 = new buxh();
                    buxhVar2.c(new Function() { // from class: cgpu
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo448andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            buxz buxzVar = (buxz) obj;
                            buxzVar.t(dtzj.this);
                            return buxzVar;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    a2 = buxhVar2.b().a();
                }
                csjb c6 = cgpv.a.c();
                c6.I("Messages in conversation were deleted");
                c6.c(conversationIdType2);
                c6.y("DeleteCount", a2.size());
                c6.r();
                cgopVar.a = a2.size();
                cgopVar.d = (byte) (cgopVar.d | 1);
                engw engwVar3 = (engw) Collection.EL.stream(a2).map(new Function() { // from class: cgov
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        Uri B = ((MessagesTable.BindData) obj).B();
                        return B == null ? Uri.EMPTY : B;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }).filter(new Predicate() { // from class: cgow
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
                        return !((Uri) obj).equals(Uri.EMPTY);
                    }
                }).collect(endq.a);
                if (engwVar3 == null) {
                    throw new NullPointerException("Null messageUrisDeleted");
                }
                cgopVar.b = engwVar3;
                if (j2 < Long.MAX_VALUE && j2 > 0) {
                    cgpv.a.p("Look for any messages left in conversation which are restricted.");
                    buxo d2 = MessagesTable.d();
                    d2.z("deleteConversation2");
                    d2.f(new Function() { // from class: cgox
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo448andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            return ((buum) obj).a;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    d2.h(new Function() { // from class: cgoy
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo448andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            buxz buxzVar = (buxz) obj;
                            buxzVar.m(ConversationIdType.this);
                            buxzVar.al();
                            return buxzVar;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    d2.d(new buxl(MessagesTable.c.i, false));
                    d2.x(1);
                    engwVar2 = d2.b().g();
                }
                if (engwVar2.isEmpty()) {
                    bsnt bsntVar = new bsnt();
                    bsntVar.f("deleteConversation");
                    bsntVar.a(new Function() { // from class: cgoz
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo448andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            bsol bsolVar = (bsol) obj;
                            bsolVar.q(ConversationIdType.this);
                            return bsolVar;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    int d3 = bsntVar.d();
                    boolean z4 = d3 > 0;
                    cgopVar.a(z4);
                    csjb c7 = cgpv.a.c();
                    c7.I("Conversations deleted");
                    c7.c(conversationIdType2);
                    c7.y("DeletedCount", d3);
                    c7.B("DeleteSuccess", z4);
                    c7.r();
                } else {
                    SuperSortLabel superSortLabel2 = superSortLabel;
                    cgpv cgpvVar = cgpv.this;
                    if (superSortLabel2.b()) {
                        MessageCoreData v = ((bdmq) cgpvVar.d.b()).v((MessageIdType) engwVar2.get(0));
                        v.getClass();
                        bsoe bsoeVar2 = new bsoe();
                        bsoeVar2.ap("DeleteDatabaseOperations#deleteConversation");
                        bdmq.V(v, bsoeVar2, null);
                        bsoeVar2.ad(new Function() { // from class: cgpq
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo448andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj) {
                                bsol bsolVar = (bsol) obj;
                                bsolVar.q(ConversationIdType.this);
                                return bsolVar;
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        });
                        bsoeVar2.b().e();
                        cgopVar.a(true);
                        csjb c8 = cgpv.a.c();
                        c8.I("Specific conversation delete success");
                        c8.c(conversationIdType2);
                        c8.A("RestrictedLabel", superSortLabel2);
                        c8.r();
                    } else {
                        csjb c9 = cgpv.a.c();
                        c9.I("Conversation delete failure");
                        c9.c(conversationIdType2);
                        c9.B("IsSpecific", superSortLabel2.b());
                        c9.A("LastMessageId", ((MessageIdType) engwVar2.get(0)).b());
                        c9.r();
                        ((akzt) cgpvVar.g.b()).c("Bugle.ConversationDeletion.Failure.Counts");
                    }
                }
                if (cgopVar.d == 3 && (engwVar = cgopVar.b) != null) {
                    return new cgoq(cgopVar.a, engwVar, cgopVar.c);
                }
                StringBuilder sb = new StringBuilder();
                if ((cgopVar.d & 1) == 0) {
                    sb.append(" numberOfDeletedMessages");
                }
                if (cgopVar.b == null) {
                    sb.append(" messageUrisDeleted");
                }
                if ((cgopVar.d & 2) == 0) {
                    sb.append(" isConversationDeleted");
                }
                throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
            }
        });
    }

    public final int a(MessageIdType messageIdType) {
        ekzz f = eleg.f("DeleteDatabaseOperations#deleteMessage");
        try {
            MessageCoreData z = ((bdmq) this.d.b()).z(messageIdType);
            int b = z != null ? b(Collections.singletonList(messageIdType), z.z()) : 0;
            f.close();
            return b;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final int b(List list, ConversationIdType conversationIdType) {
        return c(list, conversationIdType, true);
    }

    public final int c(final List list, final ConversationIdType conversationIdType, final boolean z) {
        int intValue;
        ekzz f = eleg.f("DeleteDatabaseOperations#deleteMessagesInConversation");
        try {
            csix.h();
            if (list.isEmpty()) {
                intValue = 0;
            } else {
                ((azei) this.h.b()).d(new Consumer() { // from class: cgpl
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void o(Object obj) {
                        ((cpwf) obj).b(ConversationIdType.this, engw.n(list));
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
                intValue = ((Integer) this.c.c("DeleteDatabaseOperations#deleteMessagesInConversation", new emyl() { // from class: cgpm
                    @Override // defpackage.emyl
                    public final Object get() {
                        String[] strArr = MessagesTable.a;
                        buxh buxhVar = new buxh();
                        buxhVar.f("deleteMessagesInConversation");
                        final ConversationIdType conversationIdType2 = conversationIdType;
                        final List list2 = list;
                        buxhVar.c(new Function() { // from class: cgpd
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo448andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj) {
                                buxz buxzVar = (buxz) obj;
                                buxzVar.m(ConversationIdType.this);
                                buxzVar.u(list2);
                                return buxzVar;
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        });
                        int d = buxhVar.d();
                        cgpv cgpvVar = cgpv.this;
                        ((cbgf) cgpvVar.b.b()).m(conversationIdType2, list2, new String[0]);
                        if (!z || !cgpvVar.g(conversationIdType2)) {
                            byyt s = ((bczy) cgpvVar.e.b()).s(conversationIdType2);
                            if (s == null) {
                                s = byyt.UNARCHIVED;
                            }
                            ((bdfl) cgpvVar.f.b()).b(conversationIdType2, false, s);
                            ((cbgf) cgpvVar.b.b()).c();
                        }
                        return Integer.valueOf(d);
                    }
                })).intValue();
            }
            f.close();
            return intValue;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final cgot d(ConversationIdType conversationIdType, long j) {
        return e(conversationIdType, SuperSortLabel.ALL, j);
    }

    public final cgot e(ConversationIdType conversationIdType, SuperSortLabel superSortLabel, long j) {
        return i(conversationIdType, j, superSortLabel, false);
    }

    public final cgot f(ConversationIdType conversationIdType, SuperSortLabel superSortLabel, long j) {
        return i(conversationIdType, j, superSortLabel, true);
    }

    public final boolean g(final ConversationIdType conversationIdType) {
        Object apply;
        ekzz f = eleg.f("DeleteDatabaseOperations#deleteConversationIfEmpty");
        try {
            csix.h();
            buxo d = MessagesTable.d();
            d.z("deleteConversationIfEmpty#hasNoMessagesQuery");
            d.h(new Function() { // from class: cgpe
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    buxz buxzVar = (buxz) obj;
                    buxzVar.m(ConversationIdType.this);
                    buxzVar.B(false);
                    buxzVar.b(new Function() { // from class: cgpb
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo448andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj2) {
                            buxz buxzVar2 = (buxz) obj2;
                            buxzVar2.al();
                            return buxzVar2;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    }, new Function() { // from class: cgpc
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo448andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj2) {
                            buxz buxzVar2 = (buxz) obj2;
                            buxzVar2.ag();
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
            boolean z = true;
            d.d(new buxl(MessagesTable.c.i, false));
            d.x(1);
            d.f(new Function() { // from class: cgpg
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return ((buum) obj).a;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            boolean V = d.b().V();
            bsxw a2 = bsyb.a();
            a2.z("deleteConversationIfEmpty");
            apply = new Function() { // from class: cgph
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    bsya bsyaVar = (bsya) obj;
                    bsyaVar.b(ConversationIdType.this);
                    return bsyaVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }.apply(new bsya());
            a2.k(new bsxz((bsya) apply));
            a2.x(1);
            if (!a2.b().V()) {
                csjb c = a.c();
                c.I("Could not delete empty conversation; has draft");
                c.c(conversationIdType);
                c.r();
            } else {
                if (V) {
                    String[] strArr = bsom.a;
                    bsnt bsntVar = new bsnt();
                    bsntVar.f("deleteConversationIfEmpty#deleteConversation");
                    bsntVar.a(new Function() { // from class: cgpi
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo448andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            bsol bsolVar = (bsol) obj;
                            bsolVar.q(ConversationIdType.this);
                            return bsolVar;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    bsntVar.d();
                    csjb c2 = a.c();
                    c2.I("Deleted empty");
                    c2.c(conversationIdType);
                    c2.r();
                    f.close();
                    return z;
                }
                csjb c3 = a.c();
                c3.I("Could not delete empty conversation; has message");
                c3.c(conversationIdType);
                c3.r();
            }
            z = false;
            f.close();
            return z;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void h(ConversationIdType conversationIdType, long j) {
        ekzz f = eleg.f("DeleteDatabaseOperations#resetConversationDeleteTimeStampIfNoOldMessageExists");
        try {
            csix.h();
            String[] strArr = MessagesTable.a;
            buxz buxzVar = new buxz();
            buxzVar.m(conversationIdType);
            buxzVar.T(j);
            buxs buxsVar = new buxs(buxzVar);
            buxo d = MessagesTable.d();
            d.z("resetConversationDeleteTimeStampIfNoOldMessageExists");
            d.f(new Function() { // from class: cgpj
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return ((buum) obj).a;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            d.k(buxsVar);
            buxm b = d.b();
            String[] strArr2 = bsom.a;
            bsol bsolVar = new bsol();
            bsolVar.as(new dtyn(b));
            bsolVar.q(conversationIdType);
            bsof bsofVar = new bsof(bsolVar);
            bsoe bsoeVar = new bsoe();
            bsoeVar.ap("DeleteDatabaseOperations#resetConversationDeleteTimeStampIfNoOldMessageExists.conversations");
            bsoeVar.o(0L);
            bsoeVar.af(bsofVar);
            bsoeVar.b().e();
            f.close();
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
