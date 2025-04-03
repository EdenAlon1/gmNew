package defpackage;

import android.content.Context;
import android.net.Uri;
import android.util.LruCache;
import android.util.Size;
import com.google.android.apps.messaging.shared.api.messaging.MessageId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.api.messaging.message.BugleMessageId;
import com.google.android.apps.messaging.shared.api.messaging.message.internal.CoreBugleMessageId;
import com.google.android.apps.messaging.shared.api.messaging.message.internal.CoreBuglePartialMessageId;
import com.google.android.apps.messaging.shared.datamodel.data.common.statsdata.MessageUsageStatisticsData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.queries.MediaSearchResult;
import com.google.android.apps.messaging.shared.datamodel.databasegen.queries.UrlSearchResult;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;
import com.google.android.apps.messaging.shared.datamodel.search.common.SearchQuery;
import com.google.common.util.concurrent.ListenableFuture;
import j$.time.Instant;
import j$.time.ZoneId;
import j$.util.Collection;
import j$.util.Comparator;
import j$.util.DesugarArrays;
import j$.util.Optional;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Stream;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.ToIntFunction;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aoyd implements aotl, ctbj {
    public static final enru a = enru.c("com/google/android/apps/messaging/shared/api/messaging/message/CoreBugleMessageRepository");
    private final aqff A;
    private final emyl B;
    private final ffbr C;
    private final aotj D;
    private final emyl E;
    private final aqge F;
    private final aqge G;
    private final aqge H;
    private final emyl I;
    private final ffbr J;
    private final ffbr K;
    private final ffbr L;
    private final ffbr M;
    private final ffbr N;
    private apcr O;
    private final apcf P;
    private final aqge Q;
    private final emyl R;
    private final Optional S;
    private final apbq T;
    private final apbq U;
    private final ffbr V;
    private final ffbr W;
    private final ffbr X;
    private final ffbr Y;
    private final emyl Z;
    private final ffbr aa;
    private final ffbr ab;
    private final ffbr ac;
    private final ffbr ad;
    private final ffbr ae;
    private final ffbr af;
    private final ConcurrentHashMap ag = new ConcurrentHashMap();
    private final aoxy ah = new aoxy(this);
    private ctbx ai;
    private final ffbr aj;
    public final errl b;
    public final errl c;
    public final emyl d;
    public final ffbr e;
    public final aoyv f;
    public final aotr g;
    public final emyl h;
    public final ffbr i;
    public final BugleConversationId j;
    public final ffbr k;
    public final ffbr l;
    public final errl m;
    public final emyl n;
    public final aqci o;
    public final ffbr p;
    public final ffbr q;
    public final ffbr r;
    public final emyl s;
    public final boolean t;
    public final ffbr u;
    public boolean v;
    public boolean w;
    private final ctbl x;
    private final aoyy y;
    private final apwf z;

    public aoyd(ctbk ctbkVar, errl errlVar, errl errlVar2, errl errlVar3, final apfv apfvVar, final aqbp aqbpVar, aoyy aoyyVar, apwf apwfVar, ffbr ffbrVar, ffbr ffbrVar2, aoyw aoywVar, aotk aotkVar, aots aotsVar, final ffbr ffbrVar3, final ffbr ffbrVar4, ffbr ffbrVar5, aqgc aqgcVar, final aouh aouhVar, ffbr ffbrVar6, ffbr ffbrVar7, ffbr ffbrVar8, final ffbr ffbrVar9, ffbr ffbrVar10, ffbr ffbrVar11, ffbr ffbrVar12, ffbr ffbrVar13, final ffbr ffbrVar14, apcf apcfVar, aqci aqciVar, final ffbr ffbrVar15, apbr apbrVar, Optional optional, ffbr ffbrVar16, ffbr ffbrVar17, ffbr ffbrVar18, ffbr ffbrVar19, ffbr ffbrVar20, ffbr ffbrVar21, final ffbr ffbrVar22, ffbr ffbrVar23, final ffbr ffbrVar24, ffbr ffbrVar25, ffbr ffbrVar26, ffbr ffbrVar27, ffbr ffbrVar28, ffbr ffbrVar29, ffbr ffbrVar30, aqff aqffVar, ffbr ffbrVar31, ffbr ffbrVar32, final BugleConversationId bugleConversationId, final aqge aqgeVar, final aqge aqgeVar2, aqge aqgeVar3, aorw aorwVar, final boolean z, final boolean z2) {
        this.x = ctbkVar.a(this);
        this.b = errlVar;
        this.c = errlVar2;
        this.m = errlVar3;
        this.y = aoyyVar;
        this.z = apwfVar;
        this.C = ffbrVar;
        this.e = ffbrVar2;
        this.u = ffbrVar32;
        this.D = aotkVar.a(z2);
        aotk aotkVar2 = (aotk) aotsVar.a.b();
        aotkVar2.getClass();
        errl errlVar4 = (errl) aotsVar.b.b();
        errlVar4.getClass();
        this.g = new aotr(aotkVar2, errlVar4, this, z2);
        this.h = emys.a(new emyl() { // from class: aovk
            @Override // defpackage.emyl
            public final Object get() {
                Stream filter = Collection.EL.stream((Set) ffbr.this.b()).filter(new Predicate() { // from class: aowx
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
                        return ((apuh) obj).c();
                    }
                });
                int i = engw.d;
                return (engw) filter.collect(endq.a);
            }
        });
        this.i = ffbrVar5;
        this.r = ffbrVar19;
        this.W = ffbrVar20;
        this.E = emys.a(new emyl() { // from class: aovl
            @Override // defpackage.emyl
            public final Object get() {
                Stream map = Collection.EL.stream((engw) aoyd.this.h.get()).map(new Function() { // from class: aovb
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return ((apuh) obj).e();
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                int i = engw.d;
                return (engw) map.collect(endq.a);
            }
        });
        this.P = apcfVar;
        this.t = z2;
        this.I = emys.a(new emyl() { // from class: aovm
            @Override // defpackage.emyl
            public final Object get() {
                aptw aptwVar = (aptw) ffbrVar4.b();
                aoyd aoydVar = aoyd.this;
                aptv a2 = aptwVar.a(aoydVar);
                boolean booleanValue = ((Boolean) aoyx.b.e()).booleanValue();
                BugleConversationId bugleConversationId2 = bugleConversationId;
                if (!booleanValue || !z) {
                    ensk h = aoyd.a.h();
                    h.Y(ente.a, "BugleMapi");
                    enrr enrrVar = (enrr) h;
                    enrrVar.Y(csux.q, bugleConversationId2);
                    ((enrr) enrrVar.h("com/google/android/apps/messaging/shared/api/messaging/message/CoreBugleMessageRepository", "<init>", 367, "CoreBugleMessageRepository.java")).q("Not using optimistic message pager. OMv1 disabled.");
                    return a2;
                }
                ffbr ffbrVar33 = ffbrVar9;
                ensk h2 = aoyd.a.h();
                h2.Y(ente.a, "BugleMapi");
                enrr enrrVar2 = (enrr) h2;
                enrrVar2.Y(csux.q, bugleConversationId2);
                ((enrr) enrrVar2.h("com/google/android/apps/messaging/shared/api/messaging/message/CoreBugleMessageRepository", "<init>", 372, "CoreBugleMessageRepository.java")).q("Creating optimistic message pager.");
                apvb apvbVar = (apvb) ffbrVar33.b();
                ffhd ffhdVar = (ffhd) apvbVar.a.b();
                ffhdVar.getClass();
                axsr axsrVar = (axsr) apvbVar.b.b();
                axsrVar.getClass();
                apvw apvwVar = (apvw) apvbVar.c.b();
                apvwVar.getClass();
                ((ffsk) apvbVar.d.b()).getClass();
                return new apva(ffhdVar, axsrVar, apvwVar, a2, aoydVar);
            }
        });
        this.j = bugleConversationId;
        this.F = aqgcVar.a(new aqgg(aqgeVar2, new emwl() { // from class: aovo
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                engw engwVar = (engw) obj;
                aqkp aqkpVar = (aqkp) aouh.this.a.b();
                aqkpVar.getClass();
                engwVar.getClass();
                return new aoug(aqkpVar, engwVar);
            }
        }, errlVar));
        this.G = aqgeVar3;
        this.J = ffbrVar6;
        this.K = ffbrVar7;
        this.L = ffbrVar8;
        this.k = ffbrVar10;
        this.M = ffbrVar11;
        this.l = ffbrVar12;
        this.N = ffbrVar13;
        this.S = optional;
        apbq a2 = apbrVar.a();
        this.T = a2;
        this.U = apbrVar.a();
        Optional of = Optional.of(a2);
        Context context = (Context) aoywVar.a.b();
        context.getClass();
        aosh aoshVar = (aosh) aoywVar.b.b();
        aoshVar.getClass();
        ffbr ffbrVar33 = aoywVar.c;
        apnr apnrVar = (apnr) aoywVar.d.b();
        apnrVar.getClass();
        enhk enhkVar = (enhk) aoywVar.e.b();
        enhkVar.getClass();
        ffbr ffbrVar34 = aoywVar.f;
        ffbr ffbrVar35 = aoywVar.g;
        ffbr ffbrVar36 = aoywVar.h;
        ((akjr) aoywVar.i.b()).getClass();
        ((akjs) aoywVar.j.b()).getClass();
        this.f = new aoyv(context, aoshVar, ffbrVar33, apnrVar, enhkVar, ffbrVar34, ffbrVar35, ffbrVar36, aoywVar.k, z2, aorwVar, of);
        this.V = ffbrVar16;
        this.n = emys.a(new emyl() { // from class: aovp
            @Override // defpackage.emyl
            public final Object get() {
                apbt apbtVar = (apbt) ffbr.this.b();
                cqoh cqohVar = (cqoh) apbtVar.a.b();
                cqohVar.getClass();
                ctbk ctbkVar2 = (ctbk) apbtVar.b.b();
                ctbkVar2.getClass();
                return new aoyl(cqohVar, ctbkVar2, bugleConversationId);
            }
        });
        this.o = aqciVar;
        this.Q = aqgeVar;
        this.d = emys.a(new emyl() { // from class: aovq
            /* JADX WARN: Type inference failed for: r11v0, types: [fazb, java.lang.Object] */
            @Override // defpackage.emyl
            public final Object get() {
                apfv apfvVar2 = apfvVar;
                errl errlVar5 = (errl) apfvVar2.a.b();
                errlVar5.getClass();
                ?? b = apfvVar2.h.b();
                b.getClass();
                ffbr ffbrVar37 = apfvVar2.i;
                BugleConversationId bugleConversationId2 = bugleConversationId;
                return new apfu(errlVar5, apfvVar2.b, apfvVar2.c, apfvVar2.d, apfvVar2.e, apfvVar2.f, apfvVar2.g, b, ffbrVar37, bugleConversationId2, aqgeVar, aqgeVar2, aoyd.this);
            }
        });
        this.B = emys.a(new emyl() { // from class: aovr
            @Override // defpackage.emyl
            public final Object get() {
                boolean booleanValue = ((Boolean) aoyx.b.e()).booleanValue();
                aqbp aqbpVar2 = aqbpVar;
                aoyd aoydVar = aoyd.this;
                final emyl emylVar = aoydVar.n;
                final emyl emylVar2 = aoydVar.d;
                if (booleanValue) {
                    Optional of2 = Optional.of(aoydVar);
                    emylVar.getClass();
                    return aqbpVar2.a(of2, new ffbr() { // from class: aouu
                        @Override // defpackage.ffbr, defpackage.ffbq
                        public final Object b() {
                            return (alym) emyl.this.get();
                        }
                    }, new ffbr() { // from class: aouv
                        @Override // defpackage.ffbr, defpackage.ffbq
                        public final Object b() {
                            return ((alxs) emyl.this.get()).a();
                        }
                    });
                }
                Optional empty = Optional.empty();
                emylVar.getClass();
                return aqbpVar2.a(empty, new ffbr() { // from class: aouu
                    @Override // defpackage.ffbr, defpackage.ffbq
                    public final Object b() {
                        return (alym) emyl.this.get();
                    }
                }, new ffbr() { // from class: aouw
                    @Override // defpackage.ffbr, defpackage.ffbq
                    public final Object b() {
                        return ((alxs) emyl.this.get()).a();
                    }
                });
            }
        });
        this.R = emys.a(new emyl() { // from class: aovs
            @Override // defpackage.emyl
            public final Object get() {
                aqen aqenVar = (aqen) ffbrVar15.b();
                aqge c = ((alxs) aoyd.this.d.get()).c();
                ffsk ffskVar = (ffsk) aqenVar.a.b();
                ffskVar.getClass();
                ffsk ffskVar2 = (ffsk) aqenVar.b.b();
                ffskVar2.getClass();
                cbut cbutVar = (cbut) aqenVar.c.b();
                cbutVar.getClass();
                c.getClass();
                return new aqem(ffskVar, ffskVar2, cbutVar, aqenVar.d, aqgeVar, aqgeVar2, c);
            }
        });
        this.p = ffbrVar17;
        this.q = ffbrVar18;
        this.X = ffbrVar21;
        this.s = emys.a(new emyl() { // from class: aovt
            @Override // defpackage.emyl
            public final Object get() {
                return new aozw(z2);
            }
        });
        this.Y = ffbrVar23;
        this.Z = emys.a(new emyl() { // from class: aovu
            @Override // defpackage.emyl
            public final Object get() {
                ((aozx) ((aoue) ffbrVar24.b()).a.b()).getClass();
                return new aoud(bugleConversationId, aoyd.this, z2);
            }
        });
        this.aa = ffbrVar25;
        this.aj = ffbrVar26;
        this.ab = ffbrVar27;
        this.ad = ffbrVar28;
        this.ae = ffbrVar29;
        this.af = ffbrVar30;
        this.H = aqgeVar2;
        this.A = aqffVar;
        this.ac = ffbrVar31;
    }

    static MessageIdType ad(MessageId messageId) {
        if (messageId instanceof apah) {
            return ((apah) messageId).c();
        }
        throw new IllegalStateException("Unsupported message id type.");
    }

    public static String al(MessageId messageId) {
        if (messageId instanceof BugleMessageId) {
            return String.valueOf(((BugleMessageId) messageId).b());
        }
        throw new IllegalStateException("Unsupported message id type.");
    }

    private final elfl ao(dtzj dtzjVar) {
        return ap(dtzjVar, false);
    }

    private final elfl ap(final dtzj dtzjVar, final boolean z) {
        ekzz f = eleg.f("MessageRepository#getMessagesInternal");
        try {
            ensk h = a.h();
            h.Y(ente.a, "BugleMapi");
            enrr enrrVar = (enrr) h;
            enrrVar.Y(csux.q, this.j);
            ((enrr) enrrVar.h("com/google/android/apps/messaging/shared/api/messaging/message/CoreBugleMessageRepository", "getMessagesInternal", 1207, "CoreBugleMessageRepository.java")).q("CoreBugleMessageRepository getMessagesInternal start");
            final engw engwVar = (engw) this.h.get();
            final elfl g = elfo.g(new Callable() { // from class: aosp
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    engw engwVar2 = engw.this;
                    engwVar2.getClass();
                    String[] strArr = PartsTable.a;
                    String[] strArr2 = ParticipantsTable.a;
                    String[] strArr3 = bytk.a;
                    buxo c = apag.c("parts", "participants", "user_references", engwVar2, 16);
                    c.z("+loadMessages");
                    int size = engwVar2.size();
                    for (int i = 0; i < size; i++) {
                        c = ((apuh) engwVar2.get(i)).a(c);
                    }
                    if (z) {
                        c.d((buxl[]) apam.a.c.toArray(new buxl[0]));
                    } else {
                        c.d((buxl[]) apam.a.b.toArray(new buxl[0]));
                    }
                    final dtzj dtzjVar2 = dtzjVar;
                    c.h(new Function() { // from class: aota
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
                    c.v(MessagesTable.c.a);
                    return c.b().y();
                }
            }, this.D.a);
            final elfl b = this.F.b();
            ekzz f2 = eleg.f("MessageRepository#getSelfIdentitiesFuture");
            try {
                try {
                    final elfl h2 = this.G.b().h(new emwl() { // from class: aowb
                        @Override // defpackage.emwl
                        public final Object apply(Object obj) {
                            return (enhk) Collection.EL.stream((engw) obj).collect(endq.a(new Function() { // from class: aovd
                                @Override // java.util.function.Function
                                /* renamed from: andThen */
                                public final /* synthetic */ Function mo448andThen(Function function) {
                                    return Function$CC.$default$andThen(this, function);
                                }

                                @Override // java.util.function.Function
                                public final Object apply(Object obj2) {
                                    return ((aqux) obj2).g().b();
                                }

                                public final /* synthetic */ Function compose(Function function) {
                                    return Function$CC.$default$compose(this, function);
                                }
                            }, new Function() { // from class: aove
                                @Override // java.util.function.Function
                                /* renamed from: andThen */
                                public final /* synthetic */ Function mo448andThen(Function function) {
                                    return Function$CC.$default$andThen(this, function);
                                }

                                @Override // java.util.function.Function
                                public final Object apply(Object obj2) {
                                    return (aqux) obj2;
                                }

                                public final /* synthetic */ Function compose(Function function) {
                                    return Function$CC.$default$compose(this, function);
                                }
                            }));
                        }
                    }, this.b);
                    f2.close();
                    f2 = eleg.f("MessageRepository#getConversationPropertiesFuture");
                    try {
                        final elfl b2 = this.Q.b();
                        f2.b(b2);
                        f2.close();
                        g.k(new aoxr("BugleMessagePagerQueries#loadMessages succeeded.", this.j, "BugleMessagePagerQueries#loadMessages failed."), erpp.a);
                        b.k(new aoxr("recipients#getAsync succeeded.", this.j, "recipients#getAsync failed."), erpp.a);
                        h2.k(new aoxr("getSelfIdentitiesFuture succeeded.", this.j, "getSelfIdentitiesFuture failed."), erpp.a);
                        b2.k(new aoxr("getConversationPropertiesFuture succeeded.", this.j, "getConversationPropertiesFuture failed."), erpp.a);
                        elfl g2 = elfl.g(elfr.d(g, b, h2, b2).a(new Callable() { // from class: aoxj
                            /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                            /* JADX WARN: Multi-variable type inference failed */
                            /* JADX WARN: Removed duplicated region for block: B:102:0x0549  */
                            /* JADX WARN: Removed duplicated region for block: B:141:0x03db  */
                            /* JADX WARN: Removed duplicated region for block: B:152:0x0276  */
                            /* JADX WARN: Removed duplicated region for block: B:153:0x0284  */
                            /* JADX WARN: Removed duplicated region for block: B:183:0x025e  */
                            /* JADX WARN: Removed duplicated region for block: B:50:0x022c  */
                            /* JADX WARN: Removed duplicated region for block: B:63:0x0423  */
                            /* JADX WARN: Removed duplicated region for block: B:85:0x06d7  */
                            /* JADX WARN: Removed duplicated region for block: B:87:0x06fd A[SYNTHETIC] */
                            @Override // java.util.concurrent.Callable
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                                To view partially-correct add '--show-bad-code' argument
                            */
                            public final java.lang.Object call() {
                                /*
                                    Method dump skipped, instructions count: 2308
                                    To view this dump add '--comments-level debug' option
                                */
                                throw new UnsupportedOperationException("Method not decompiled: defpackage.aoxj.call():java.lang.Object");
                            }
                        }, this.c));
                        f.close();
                        return g2;
                    } finally {
                    }
                } catch (Throwable th) {
                    th = th;
                    Throwable th2 = th;
                    try {
                        f.close();
                        throw th2;
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                        throw th2;
                    }
                }
            } finally {
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    private final elfl aq(apyz apyzVar) {
        ekzz f = eleg.f("MessageRepository#react");
        try {
            elfl i = ((alxs) this.d.get()).k(apyzVar).i(new eroh() { // from class: aoxo
                @Override // defpackage.eroh
                public final ListenableFuture a(Object obj) {
                    return aoyd.this.d().b((alxv) obj);
                }
            }, erpp.a);
            f.close();
            return i;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.alye
    public final elfl A(MessageId messageId) {
        ekzz f = eleg.f("MessageRepository#pauseFileTransfer");
        try {
            apqz apqzVar = (apqz) this.k.b();
            elfl g = elfl.g(((bajc) apqzVar.a.b()).a(ad(messageId)).t());
            f.close();
            return g;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.alye
    public final elfl B(MessageId messageId, String str, fjay fjayVar) {
        ekzz f = eleg.f("MessageRepository#remoteDeleteMessage");
        try {
            elfl i = ((alxs) this.d.get()).l(messageId, str, fjayVar).i(new eroh() { // from class: aown
                @Override // defpackage.eroh
                public final ListenableFuture a(Object obj) {
                    return aoyd.this.d().b((alxv) obj);
                }
            }, erpp.a);
            f.close();
            return i;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.alye
    public final elfl C(MessageId messageId) {
        if (!(messageId instanceof BugleMessageId)) {
            return elfo.d(new IllegalArgumentException("BugleMessageId should be provided"));
        }
        final BugleMessageId bugleMessageId = (BugleMessageId) messageId;
        final elfl u = u(messageId);
        final elfl b = this.Q.b();
        return elfl.g(elfl.g(elfr.d(u, b).b(new erog() { // from class: aovn
            @Override // defpackage.erog
            public final ListenableFuture a() {
                elfl c;
                alxr alxrVar = (alxr) erqt.q(u);
                amfx amfxVar = (amfx) erqt.q(b);
                aoyd aoydVar = aoyd.this;
                if (alxrVar != null) {
                    aqux c2 = ((alyn) alxrVar.d()).c();
                    aqci aqciVar = aoydVar.o;
                    amfxVar.getClass();
                    c = axol.c(aqciVar.d, ffhe.a, ffsm.a, new aqcg(c2, amfxVar, aqciVar, null));
                    return c;
                }
                BugleMessageId bugleMessageId2 = bugleMessageId;
                ensk j = aoyd.a.j();
                j.Y(ente.a, "BugleMapi");
                enrr enrrVar = (enrr) j;
                enrrVar.Y(csux.q, aoydVar.j);
                enrrVar.Y(csux.b, bugleMessageId2.c());
                ((enrr) enrrVar.h("com/google/android/apps/messaging/shared/api/messaging/message/CoreBugleMessageRepository", "getMessageUsageStatisticsData", 920, "CoreBugleMessageRepository.java")).q("CoreBugleMessageRepository: Cannot resend, message not found.");
                return elfo.e(null);
            }
        }, this.b)).h(new emwl() { // from class: aowe
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                MessageUsageStatisticsData messageUsageStatisticsData = (MessageUsageStatisticsData) obj;
                if (messageUsageStatisticsData == null) {
                    return null;
                }
                ((ambs) aoyd.this.i.b()).m(bugleMessageId.c(), messageUsageStatisticsData);
                return null;
            }
        }, this.b));
    }

    @Override // defpackage.alye
    public final elfl D(final MessageId messageId) {
        return !(messageId instanceof CoreBugleMessageId) ? elfo.d(new IllegalArgumentException("CoreBugleMessageId should be provided")) : u(messageId).h(new emwl() { // from class: aowd
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                if (((alxr) obj) == null) {
                    return null;
                }
                axnw.h(((aqgl) aoyd.this.r.b()).b(((CoreBugleMessageId) messageId).a, eokl.MANUAL_RETRY_FORCES_FALLBACK));
                return null;
            }
        }, this.b);
    }

    @Override // defpackage.alye
    public final elfl E(final MessageId messageId) {
        ekzz f = eleg.f("MessageRepository#resumeFileTransfer");
        try {
            elfl i = u(messageId).i(new eroh() { // from class: aowp
                @Override // defpackage.eroh
                public final ListenableFuture a(Object obj) {
                    Boolean valueOf;
                    aoyd aoydVar = aoyd.this;
                    MessageId messageId2 = messageId;
                    alxr alxrVar = (alxr) obj;
                    if (alxrVar != null && ((Optional) aoydVar.q.b()).isPresent()) {
                        appj g = alxrVar.g();
                        boolean z = false;
                        if (g instanceof apmq) {
                            apra fk = ((apmq) g).fk();
                            if (fk instanceof apqp) {
                                apqp apqpVar = (apqp) fk;
                                if (apqpVar.d() && !apqpVar.f()) {
                                    z = true;
                                }
                                valueOf = Boolean.valueOf(z);
                            } else {
                                valueOf = false;
                            }
                        } else {
                            valueOf = false;
                        }
                        if (valueOf.booleanValue()) {
                            cdlx cdlxVar = (cdlx) ((Optional) aoydVar.q.b()).get();
                            BugleConversationId bugleConversationId = aoydVar.j;
                            cdlxVar.a(bugleConversationId.a, aoyd.ad(messageId2), aoyd.al(messageId2));
                            return elfo.e(null);
                        }
                    }
                    if (alxrVar == null || alxrVar.d().d() != 2) {
                        apqz apqzVar = (apqz) aoydVar.k.b();
                        return elfl.g(((bbff) apqzVar.b.b()).a(aoyd.ad(messageId2)).t());
                    }
                    apqz apqzVar2 = (apqz) aoydVar.k.b();
                    ((bbfg) apqzVar2.c.b()).b(aoyd.ad(messageId2), null);
                    return elfo.e(null);
                }
            }, erpp.a);
            f.close();
            return i;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.alye
    public final elfl F(alyv alyvVar) {
        if (!(alyvVar instanceof aoup)) {
            return elfo.d(new IllegalArgumentException(String.format("Expected BugleScheduledMessage not %s", alyvVar.getClass())));
        }
        coja cojaVar = (coja) this.S.get();
        String m = ((aoup) alyvVar).a.c.m();
        m.getClass();
        return cojaVar.f(m).h(new emwl() { // from class: aoxp
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return null;
            }
        }, erpp.a);
    }

    @Override // defpackage.alye
    public final elfl G(MessageId messageId) {
        ekzz f = eleg.f("MessageRepository#transcribeAudioMessage");
        try {
            if (!((Optional) this.M.b()).isPresent()) {
                throw new IllegalStateException("AudioMessageTranscriber not provided.");
            }
            apdp apdpVar = (apdp) ((Optional) this.M.b()).get();
            ffsk ffskVar = apdpVar.a;
            ffhe ffheVar = ffhe.a;
            elfl a2 = axol.a(ffra.b(ffskVar, ekxi.a(ffheVar), ffsm.a, new apdo(null, apdpVar, messageId)));
            f.close();
            return a2;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.alye
    public final elfl H(final MessageId messageId, final int i) {
        return elfo.f(new Runnable() { // from class: aoxf
            @Override // java.lang.Runnable
            public final void run() {
                String[] strArr = PartsTable.a;
                bwdi bwdiVar = new bwdi();
                bwdiVar.ap("CoreBugleMessageRepository#updateMediaDisplayState");
                int i2 = i - 1;
                byyz byyzVar = i2 != 1 ? i2 != 2 ? byyz.POSITIVE_VERDICT_REQUIRE_SPEEDBUMP : byyz.POSITIVE_VERDICT_HIDE_IMAGE : byyz.POSITIVE_VERDICT_DISPLAY_IMAGE;
                final MessageId messageId2 = messageId;
                bwdiVar.q(byyzVar);
                bwdiVar.D(new Function() { // from class: aoxm
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        MessageId messageId3 = MessageId.this;
                        bwdm bwdmVar = (bwdm) obj;
                        if (aoyd.al(messageId3).equals("-1")) {
                            bwdmVar.n(aoyd.ad(messageId3));
                            return bwdmVar;
                        }
                        bwdmVar.n(aoyd.ad(messageId3));
                        bwdmVar.j(aoyd.al(messageId3));
                        return bwdmVar;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                bwdiVar.b().e();
            }
        }, this.m);
    }

    @Override // defpackage.alye
    public final void I(MessageId messageId, final int i) {
        ekzz f = eleg.f("MessageRepository#deleteToolstone");
        try {
            final MessageIdType ad = ad(messageId);
            ((Optional) this.ab.b()).ifPresent(new Consumer() { // from class: aoxe
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj) {
                    elfl c;
                    aqfj aqfjVar = (aqfj) obj;
                    MessageIdType messageIdType = MessageIdType.this;
                    messageIdType.getClass();
                    c = axol.c(aqfjVar.a, ffhe.a, ffsm.a, new aqfi(aqfjVar, messageIdType, aqfg.a(2, i), null));
                    axnw.h(c);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
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

    @Override // defpackage.alye
    public final void J(final alxr alxrVar, int i) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 == 2) {
                    ((apcv) this.aa.b()).a(alxrVar.b());
                    return;
                } else if (i2 == 3) {
                    ((apcv) this.aa.b()).a(alxrVar.b());
                    return;
                } else {
                    if (i2 != 4) {
                        return;
                    }
                    ((apcv) this.aa.b()).a(alxrVar.b());
                    return;
                }
            }
            apcv apcvVar = (apcv) this.aa.b();
            LruCache lruCache = apcvVar.d;
            MessageId b = alxrVar.b();
            synchronized (lruCache) {
                if (apcvVar.d.get(b) == null) {
                    synchronized (apcvVar.c) {
                        if (apcvVar.c.get(b) != null) {
                            apcvVar.d.put(b, true);
                            apcvVar.c.remove(b);
                            axol.k(apcvVar.b, null, new apcu(apcvVar, alxrVar, null), 3);
                        }
                    }
                }
            }
            return;
        }
        ekzz f = eleg.f("MessageRepository#reportAnalyticsWithMetricExtension");
        try {
            if (alxrVar instanceof apco) {
                alya d = alxrVar.d();
                apco apcoVar = (apco) alxrVar;
                final int D = apcoVar.D();
                fjay F = apcoVar.F();
                alxrVar.g();
                if (d.d() == 1 && (alxrVar instanceof aork)) {
                    ((aork) alxrVar).E().g(new Consumer() { // from class: aowu
                        @Override // java.util.function.Consumer
                        /* renamed from: accept */
                        public final void o(Object obj) {
                            aoyd aoydVar = aoyd.this;
                            cpev cpevVar = (cpev) aoydVar.l.b();
                            String f2 = ((bdhg) obj).f();
                            ffbr ffbrVar = cpevVar.r;
                            cpevVar.j(f2, ((alry) ffbrVar.b()).c(alxrVar, aoydVar.v, aoydVar.w), D);
                        }

                        public final /* synthetic */ Consumer andThen(Consumer consumer) {
                            return Consumer$CC.$default$andThen(this, consumer);
                        }
                    });
                } else if (d.d() == 2 && F != null) {
                    String str = F.b;
                    cpev cpevVar = (cpev) this.l.b();
                    cpevVar.m(str, ((alry) cpevVar.r.b()).c(alxrVar, this.v, this.w), D);
                    alyn alynVar = (alyn) d;
                    if (alynVar.a() == alxo.SENT) {
                        cpev cpevVar2 = (cpev) this.l.b();
                        cpevVar2.l(str, ((alry) cpevVar2.r.b()).c(alxrVar, this.v, this.w), D);
                        ((algs) this.X.b()).b(F, D);
                    } else if (alynVar.a() == alxo.DELIVERED) {
                        cpev cpevVar3 = (cpev) this.l.b();
                        cpevVar3.k(str, ((alry) cpevVar3.r.b()).c(alxrVar, this.v, this.w), D);
                        ((algs) this.X.b()).a(F, D);
                    }
                    if (!alxrVar.b().a().isEmpty()) {
                        cpev cpevVar4 = (cpev) this.l.b();
                        cpevVar4.n(str, ((alry) cpevVar4.r.b()).c(alxrVar, this.v, this.w), D);
                    }
                    alxo alxoVar = (alxo) this.ag.get(F);
                    alxo a2 = alynVar.a();
                    if (alxoVar != null && alxoVar != a2 && (alxrVar.b() instanceof apah)) {
                        if (a2 == alxo.SENT) {
                            axnw.h(((alrt) this.N.b()).a(alxrVar, 30));
                        } else if (a2 == alxo.DELIVERED) {
                            axnw.h(((alrt) this.N.b()).a(alxrVar, 31));
                        }
                    }
                    if (this.ag.mappingCount() > 300) {
                        ensk j = a.j();
                        j.Y(ente.a, "BugleMapi");
                        enrr enrrVar = (enrr) j;
                        enrrVar.Y(csux.q, this.j);
                        ((enrr) enrrVar.h("com/google/android/apps/messaging/shared/api/messaging/message/CoreBugleMessageRepository", "reportAnalyticsWithMetricExtension", 1507, "CoreBugleMessageRepository.java")).q("Exceeded limit of tracked messages");
                        this.ag.clear();
                    }
                    this.ag.put(F, a2);
                }
            }
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

    @Override // defpackage.alye
    public final elfl K(MessageId messageId, apyv apyvVar, cmrx cmrxVar, fjay fjayVar, apxz apxzVar) {
        return aq(new apyy(messageId, apyvVar, cmrxVar, fjayVar, apxzVar));
    }

    @Override // defpackage.alye
    public final elfl L(final int i) {
        ekzz f = eleg.f("MessageRepository#getEarliestMessages");
        try {
            buxo d = this.D.d(this.j, 0, i);
            d.d((buxl[]) apam.a.c.toArray(new buxl[0]));
            elfl i2 = ap(d.b(), true).i(new eroh() { // from class: aoxd
                @Override // defpackage.eroh
                public final ListenableFuture a(Object obj) {
                    return aoyd.this.g.c((engw) obj, i, true);
                }
            }, erpp.a);
            f.close();
            return i2;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.alye
    public final elfl M(final int i) {
        ekzz f = eleg.f("MessageRepository#getLatestMessages");
        try {
            elfl i2 = ao(this.D.b(this.j, 0, i)).i(new eroh() { // from class: aowm
                @Override // defpackage.eroh
                public final ListenableFuture a(Object obj) {
                    return aoyd.this.g.c((engw) obj, i, false);
                }
            }, erpp.a);
            f.close();
            return i2;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.alye
    public final elfl N() {
        ekzz f = eleg.f("MessageRepository#getLatestMessagesWithReactions");
        try {
            aotj aotjVar = this.D;
            final BugleConversationId bugleConversationId = this.j;
            aozw aozwVar = aotjVar.b;
            buxo d = MessagesTable.d();
            d.z("getIdsWithReactionsOffsetLimitDescendingQuery");
            d.f(new Function() { // from class: aosr
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
            bueb a2 = bueg.a();
            a2.u();
            d.G(dtvz.i(a2.b(), bueg.c.b, MessagesTable.c.a).g());
            d.h(new Function() { // from class: aoss
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    buxz buxzVar = (buxz) obj;
                    final BugleConversationId bugleConversationId2 = BugleConversationId.this;
                    buxzVar.b(new Function() { // from class: aosx
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo448andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj2) {
                            buxz buxzVar2 = (buxz) obj2;
                            aozw.b(buxzVar2, BugleConversationId.this);
                            return buxzVar2;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    }, new Function() { // from class: aosy
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo448andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj2) {
                            buxz buxzVar2 = (buxz) obj2;
                            buxzVar2.m(BugleConversationId.this.a);
                            buxzVar2.as(new dtzq("$V{J:message_reactions} NOTNULL", new Object[]{bueg.c.d}));
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
            d.x(10);
            buxo a3 = aozwVar.a(d);
            a3.d((buxl[]) apam.a.b.toArray(new buxl[0]));
            elfl i = ao(a3.b()).i(new eroh() { // from class: aowf
                @Override // defpackage.eroh
                public final ListenableFuture a(Object obj) {
                    return aoyd.this.g.c((engw) obj, 10, false);
                }
            }, erpp.a);
            f.close();
            return i;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.alye
    public final void O(final MessageId messageId, final int i) {
        ekzz f = eleg.f("MessageRepository#starMessage");
        try {
            final MessageIdType ad = ad(messageId);
            ((Optional) this.C.b()).ifPresent(new Consumer() { // from class: aoxk
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj) {
                    final aqbs aqbsVar = (aqbs) obj;
                    final MessageIdType messageIdType = ad;
                    final aoyd aoydVar = aoyd.this;
                    final int i2 = i;
                    axnw.h(aoydVar.ae(messageId).i(new eroh() { // from class: aovv
                        @Override // defpackage.eroh
                        public final ListenableFuture a(Object obj2) {
                            return aqbsVar.e(aoyd.this.j, messageIdType, (String) obj2, i2);
                        }
                    }, aoydVar.c));
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
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

    @Override // defpackage.alye
    public final void P(final MessageId messageId, final int i) {
        ekzz f = eleg.f("MessageRepository#unstarMessage");
        try {
            final MessageIdType ad = ad(messageId);
            ((Optional) this.C.b()).ifPresent(new Consumer() { // from class: aoxq
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj) {
                    final aqbs aqbsVar = (aqbs) obj;
                    final MessageIdType messageIdType = ad;
                    final aoyd aoydVar = aoyd.this;
                    final int i2 = i;
                    axnw.h(aoydVar.ae(messageId).i(new eroh() { // from class: aoxb
                        @Override // defpackage.eroh
                        public final ListenableFuture a(Object obj2) {
                            return aqbsVar.f(aoyd.this.j, messageIdType, (String) obj2, i2);
                        }
                    }, aoydVar.c));
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
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

    @Override // defpackage.alye
    public final void Q(final int i) {
        ekzz f = eleg.f("MessageRepository#performToolstoneAction");
        try {
            ((Optional) this.ab.b()).ifPresent(new Consumer() { // from class: aowz
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj) {
                    elfl c;
                    aqfj aqfjVar = (aqfj) obj;
                    c = axol.c(aqfjVar.a, ffhe.a, ffsm.a, new aqfh(aqfjVar, aqfg.a(5, i), null));
                    axnw.h(c);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
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

    @Override // defpackage.alye
    public final elfl R(final MessageId messageId) {
        ekzz f = eleg.f("MessageRepository#loadLinkPreview");
        try {
            final MessageIdType ad = ad(messageId);
            ekzz f2 = eleg.f("MessageRepository#getSenderOfMessage");
            try {
                buxo d = MessagesTable.d();
                d.z("CoreBugleMessageRepository#getSenderOfMessage");
                d.e(new Function() { // from class: aovf
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        buum buumVar = (buum) obj;
                        return new buun[]{buumVar.a, buumVar.c};
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                d.h(new Function() { // from class: aovg
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        buxz buxzVar = (buxz) obj;
                        buxzVar.q(MessageIdType.this);
                        return buxzVar;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                elfl h = d.b().w().h(new emwl() { // from class: aovh
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // defpackage.emwl
                    public final Object apply(Object obj) {
                        engw engwVar = (engw) obj;
                        if (engwVar.isEmpty()) {
                            throw new aozi(MessageId.this);
                        }
                        String X = ((MessagesTable.BindData) engwVar.get(0)).X();
                        X.getClass();
                        return X;
                    }
                }, this.m);
                f2.b(h);
                f2.close();
                elfl i = h.i(new eroh() { // from class: aowc
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj) {
                        elfl c;
                        String str = (String) obj;
                        apxd apxdVar = (apxd) aoyd.this.e.b();
                        MessageIdType messageIdType = ad;
                        messageIdType.getClass();
                        str.getClass();
                        ((bdxd) apxdVar.b.b()).b(messageIdType);
                        c = axol.c(apxdVar.c, ffhe.a, ffsm.a, new apxc(apxdVar, str, null));
                        return c;
                    }
                }, this.b);
                f.close();
                return i;
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

    @Override // defpackage.aotl
    public final BugleConversationId S() {
        return this.j;
    }

    @Override // defpackage.aotl
    public final elfl T(String str) {
        ekzz f = eleg.f("MessageRepository#getMessageIdFromRcsMessageId");
        try {
            final bdhg a2 = bdhg.a(str);
            String[] strArr = MessagesTable.a;
            final buxz buxzVar = new buxz();
            buxzVar.O(a2);
            buxzVar.B(false);
            elfl g = elfo.g(new Callable() { // from class: aoxg
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    buxo d = MessagesTable.d();
                    d.z("MessageRepository#getMessageIdFromRcsMessageId");
                    buum buumVar = MessagesTable.c;
                    d.c(buumVar.a, buumVar.R);
                    d.g(buxz.this);
                    d.x(1);
                    bwdf c = PartsTable.c();
                    c.f(new Function() { // from class: aout
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo448andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            return ((bwat) obj).a;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    d.F(dtvz.i(c.b(), PartsTable.d.b, MessagesTable.c.a));
                    MessagesTable.BindData bindData = (MessagesTable.BindData) ((buuo) d.b().o()).cS();
                    if (bindData == null) {
                        return null;
                    }
                    bdhg bdhgVar = a2;
                    MessageIdType D = bindData.D();
                    PartsTable.BindData[] bindDataArr = (PartsTable.BindData[]) bindData.aG("parts", new PartsTable.BindData[0]);
                    return bindDataArr.length == 0 ? new CoreBugleMessageId(D, -1L, bdhgVar, bindData.F()) : new CoreBugleMessageId(D, Long.parseLong(bindDataArr[0].J()), bdhgVar, bindData.F());
                }
            }, this.m);
            f.close();
            return g;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.aotl
    public final elfl U(cnbt cnbtVar) {
        return ((apse) this.u.b()).a(cnbtVar).h(new emwl() { // from class: aoxc
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return null;
            }
        }, this.m);
    }

    @Override // defpackage.aotl
    public final elfl V(Instant instant) {
        return ((aqev) this.R.get()).a(instant);
    }

    @Override // defpackage.aotl
    public final elfl W(int i) {
        return M(i).h(new emwl() { // from class: aovc
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                engw engwVar = (engw) obj;
                if (engwVar == null || engwVar.isEmpty()) {
                    return false;
                }
                return Boolean.valueOf(Collection.EL.stream(engwVar).filter(new Predicate() { // from class: aouz
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
                        return ((alxr) obj2).g() instanceof appw;
                    }
                }).anyMatch(new Predicate() { // from class: aova
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
                        return Collection.EL.stream(((appw) ((alxr) obj2).g()).a()).anyMatch(new Predicate() { // from class: aoxi
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
                                return ((apcy) obj3).c().equals(appv.OTP);
                            }
                        });
                    }
                }));
            }
        }, this.m);
    }

    @Override // defpackage.aotl
    public final elfl X(aqvj aqvjVar) {
        return !((atti) this.ad.b()).a() ? elfo.e(null) : ((aqeo) this.ae.b()).a(aqvjVar, this.j, this.H);
    }

    @Override // defpackage.aotl
    public final void Y() {
        this.x.c(new Supplier() { // from class: aovw
            @Override // java.util.function.Supplier
            public final Object get() {
                return null;
            }
        }, "forceNotifyAllMessagesChanged");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.aotl
    public final elfl Z(aqux aquxVar, appj appjVar, bdhg bdhgVar, Instant instant, Instant instant2, final MessageId messageId) {
        if (appjVar instanceof appw) {
            return ((apse) this.u.b()).c(this.Q, this.j, aquxVar, appjVar, bdhgVar, instant, instant2).i(new eroh() { // from class: aowy
                @Override // defpackage.eroh
                public final ListenableFuture a(Object obj) {
                    MessageIdType messageIdType = (MessageIdType) obj;
                    MessageId messageId2 = messageId;
                    if (!(messageId2 instanceof BugleMessageId)) {
                        return elfo.e(null);
                    }
                    aoyd aoydVar = aoyd.this;
                    return ((apse) aoydVar.u.b()).b(messageIdType, ((BugleMessageId) messageId2).c()).h(new emwl() { // from class: aous
                        @Override // defpackage.emwl
                        public final Object apply(Object obj2) {
                            return null;
                        }
                    }, aoydVar.m);
                }
            }, this.m);
        }
        throw new IllegalArgumentException("Only text message is supported for import.");
    }

    @Override // defpackage.alye
    public final alxs a() {
        return (alxs) this.d.get();
    }

    @Override // defpackage.aptx
    public final alxw aa(MessageId messageId, Instant instant) {
        if (!(messageId instanceof CoreBuglePartialMessageId)) {
            return new aorc(instant.toEpochMilli(), Long.parseLong(messageId.a()), 0L);
        }
        CoreBuglePartialMessageId coreBuglePartialMessageId = (CoreBuglePartialMessageId) messageId;
        long epochMilli = instant.toEpochMilli();
        MessageIdType messageIdType = coreBuglePartialMessageId.a;
        return new aorc(epochMilli, messageIdType.a, coreBuglePartialMessageId.b);
    }

    @Override // defpackage.aptx
    public final apvd ab() {
        return this.g;
    }

    @Override // defpackage.aptx
    public final apvk ac() {
        return (apvk) this.Z.get();
    }

    final elfl ae(MessageId messageId) {
        return u(messageId).h(new emwl() { // from class: aovj
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                alxr alxrVar = (alxr) obj;
                if (alxrVar == null) {
                    ensk j = aoyd.a.j();
                    j.Y(ente.a, "BugleMapi");
                    ((enrr) ((enrr) j).h("com/google/android/apps/messaging/shared/api/messaging/message/CoreBugleMessageRepository", "getAnalyticsStableId", 1326, "CoreBugleMessageRepository.java")).q("Message not found while getting analytics stable id");
                    return null;
                }
                Long p = alxrVar.p();
                if (p != null) {
                    return Long.toString(p.longValue());
                }
                ensk j2 = aoyd.a.j();
                j2.Y(ente.a, "BugleMapi");
                ((enrr) ((enrr) j2).h("com/google/android/apps/messaging/shared/api/messaging/message/CoreBugleMessageRepository", "getAnalyticsStableId", 1331, "CoreBugleMessageRepository.java")).q("Analytics stable ID is null.");
                return null;
            }
        }, this.c);
    }

    @Override // defpackage.aptx
    public final elfl af(MessageId messageId) {
        emxf.l(messageId instanceof apah);
        final MessageIdType c = ((apah) messageId).c();
        final long epochMilli = ak(messageId).toEpochMilli();
        if (messageId instanceof CoreBuglePartialMessageId) {
            return this.D.e(this.j, c, ((CoreBuglePartialMessageId) messageId).b, epochMilli, false);
        }
        aotj aotjVar = this.D;
        final BugleConversationId bugleConversationId = this.j;
        buxo d = MessagesTable.d();
        d.z("fullMessageOffsetQuery");
        d.u();
        d.n(new dtzr("COUNT(*)"), "count");
        d.h(new Function() { // from class: aosq
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                buxz buxzVar = (buxz) obj;
                aozw.b(buxzVar, BugleConversationId.this);
                final long j = epochMilli;
                final MessageIdType messageIdType = c;
                buxzVar.b(new Function() { // from class: aosi
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        return apam.a.f.a((buxz) obj2, Long.valueOf(j));
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }, new Function() { // from class: aost
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        Object a2 = apam.a.e.a((buxz) obj2, Long.valueOf(j));
                        ((buxz) a2).s(messageIdType.a);
                        return a2;
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
        buuo buuoVar = (buuo) aotjVar.b.a(d).b().o();
        try {
            if (!buuoVar.moveToNext()) {
                throw new IllegalStateException("cannot determine the absolute offset of a message");
            }
            Integer valueOf = Integer.valueOf(Integer.parseInt(buuoVar.dd("count")));
            buuoVar.close();
            return elfo.e(valueOf);
        } finally {
        }
    }

    @Override // defpackage.aptx
    public final elfl ag(int i, int i2) {
        return ao(this.D.b(this.j, i, i2));
    }

    @Override // defpackage.aptx
    public final elfl ah(alxw alxwVar, int i) {
        return ao(this.D.c(this.j, (aott) alxwVar, i).b());
    }

    @Override // defpackage.aptx
    public final elfl ai(alxw alxwVar, int i) {
        int i2 = i / 2;
        aotj aotjVar = this.D;
        BugleConversationId bugleConversationId = this.j;
        aott aottVar = (aott) alxwVar;
        buxo c = aotjVar.c(bugleConversationId, aottVar, (i % 2) + i2);
        c.p(aotjVar.a(bugleConversationId, aottVar, i2 + 1));
        return ao(c.b());
    }

    @Override // defpackage.aptx
    public final elfl aj(alxw alxwVar, int i) {
        return ao(this.D.a(this.j, (aott) alxwVar, i));
    }

    @Override // defpackage.aptx
    public final Instant ak(MessageId messageId) {
        Long l;
        emxf.l(messageId instanceof apah);
        final MessageIdType c = ((apah) messageId).c();
        ekzz f = eleg.f("MessageTableOperations#getMessageTimeStamp");
        try {
            buxo d = MessagesTable.d();
            d.z("getMessageTimeStamp");
            d.f(new Function() { // from class: apun
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return ((buum) obj).i;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            d.h(new Function() { // from class: apuo
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    buxz buxzVar = (buxz) obj;
                    buxzVar.q(MessageIdType.this);
                    return buxzVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            buuo buuoVar = (buuo) d.b().o();
            try {
                if (buuoVar.moveToNext()) {
                    l = Long.valueOf(buuoVar.l());
                    buuoVar.close();
                } else {
                    buuoVar.close();
                    l = 0L;
                }
                f.close();
                return Instant.ofEpochMilli(l.longValue());
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

    /* JADX WARN: Removed duplicated region for block: B:29:0x006d A[Catch: all -> 0x0202, TryCatch #0 {all -> 0x0202, blocks: (B:3:0x000a, B:5:0x0012, B:7:0x0016, B:9:0x0032, B:10:0x01e1, B:11:0x01e7, B:14:0x01ee, B:15:0x01ef, B:18:0x01fc, B:19:0x01fd, B:21:0x0039, B:26:0x004d, B:27:0x0062, B:29:0x006d, B:30:0x0077, B:32:0x0080, B:34:0x008e, B:36:0x009d, B:38:0x00aa, B:39:0x010b, B:41:0x011a, B:42:0x014d, B:43:0x015b, B:45:0x0161, B:47:0x0190, B:49:0x0197, B:53:0x01cd, B:54:0x00f3, B:57:0x0056, B:13:0x01e8), top: B:2:0x000a, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0080 A[Catch: all -> 0x0202, TryCatch #0 {all -> 0x0202, blocks: (B:3:0x000a, B:5:0x0012, B:7:0x0016, B:9:0x0032, B:10:0x01e1, B:11:0x01e7, B:14:0x01ee, B:15:0x01ef, B:18:0x01fc, B:19:0x01fd, B:21:0x0039, B:26:0x004d, B:27:0x0062, B:29:0x006d, B:30:0x0077, B:32:0x0080, B:34:0x008e, B:36:0x009d, B:38:0x00aa, B:39:0x010b, B:41:0x011a, B:42:0x014d, B:43:0x015b, B:45:0x0161, B:47:0x0190, B:49:0x0197, B:53:0x01cd, B:54:0x00f3, B:57:0x0056, B:13:0x01e8), top: B:2:0x000a, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0161 A[Catch: all -> 0x0202, TryCatch #0 {all -> 0x0202, blocks: (B:3:0x000a, B:5:0x0012, B:7:0x0016, B:9:0x0032, B:10:0x01e1, B:11:0x01e7, B:14:0x01ee, B:15:0x01ef, B:18:0x01fc, B:19:0x01fd, B:21:0x0039, B:26:0x004d, B:27:0x0062, B:29:0x006d, B:30:0x0077, B:32:0x0080, B:34:0x008e, B:36:0x009d, B:38:0x00aa, B:39:0x010b, B:41:0x011a, B:42:0x014d, B:43:0x015b, B:45:0x0161, B:47:0x0190, B:49:0x0197, B:53:0x01cd, B:54:0x00f3, B:57:0x0056, B:13:0x01e8), top: B:2:0x000a, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0075  */
    @Override // defpackage.aqbr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void am(defpackage.alxv r31) {
        /*
            Method dump skipped, instructions count: 525
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aoyd.am(alxv):void");
    }

    @Override // defpackage.aptx
    public final void an() {
        ekzz f = eleg.f("MessageRepository#startPreload");
        try {
            ensk h = a.h();
            h.Y(ente.a, "BugleMapi");
            enrr enrrVar = (enrr) h;
            enrrVar.Y(csux.q, this.j);
            ((enrr) enrrVar.h("com/google/android/apps/messaging/shared/api/messaging/message/CoreBugleMessageRepository", "startPreload", 1365, "CoreBugleMessageRepository.java")).q("CoreBugleMessageRepository startPreload");
            ((apvl) this.I.get()).k();
            f.close();
            apbq apbqVar = this.T;
            if (((Boolean) aoyx.e.e()).booleanValue()) {
                ctbx ctbxVar = apbqVar.d;
                if (ctbxVar != null) {
                    ctbw.a(ctbxVar);
                }
                apbqVar.d = k(new apbp(apbqVar));
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

    @Override // defpackage.aptx, java.lang.AutoCloseable
    public final void close() {
        ((apvl) this.I.get()).close();
        this.T.close();
        this.U.close();
        if (((atti) this.ad.b()).a()) {
        }
    }

    @Override // defpackage.alye
    public final alxu d() {
        return (alxu) this.B.get();
    }

    @Override // defpackage.alye
    public final alxy e() {
        return (alxy) this.I.get();
    }

    @Override // defpackage.alye
    public final alym f() {
        return (alym) this.n.get();
    }

    @Override // defpackage.ctbj
    public final void fN() {
        ensk h = a.h();
        h.Y(ente.a, "BugleMapi");
        enrr enrrVar = (enrr) h;
        enrrVar.Y(csux.q, this.j);
        ((enrr) enrrVar.h("com/google/android/apps/messaging/shared/api/messaging/message/CoreBugleMessageRepository", "onFirstRegister", 695, "CoreBugleMessageRepository.java")).q("CoreBugleMessageRepository: onFirstRegister, Starting tombstone updater.");
        ((aqev) this.R.get()).c();
        emxf.l(this.ai == null);
        engr engrVar = new engr();
        engw engwVar = (engw) this.E.get();
        int size = engwVar.size();
        for (int i = 0; i < size; i++) {
            aptb aptbVar = (aptb) engwVar.get(i);
            engrVar.h(aptbVar.b(new aoyc(this.j, new aoya(this, aptbVar.a(), this.ah))));
        }
        engrVar.h(this.y.c(new aoyc(this.j, new aoxz(this.T, new aoya(this, "messages table", this.ah)))));
        engrVar.h(this.z.a.b(new aoyc(this.j, new aoya(this, "message parts table", this.ah))));
        engrVar.h(this.F.a(new aoyb(this, "recipients", this.ah)));
        engrVar.h(this.G.a(new aoyb(this, "self identity", this.ah)));
        engrVar.h(f().b(new aoya(this, "reactions cache", this.ah)));
        if (((atzx) this.ac.b()).a()) {
            engrVar.h(this.A.c.b(new aoyc(this.j, new aoya(this, "message user reference table", this.ah))));
        }
        this.ai = ctbt.a(engrVar.g());
    }

    @Override // defpackage.ctbj
    public final void fO() {
        ensk h = a.h();
        h.Y(ente.a, "BugleMapi");
        enrr enrrVar = (enrr) h;
        enrrVar.Y(csux.q, this.j);
        ((enrr) enrrVar.h("com/google/android/apps/messaging/shared/api/messaging/message/CoreBugleMessageRepository", "onLastUnregister", 740, "CoreBugleMessageRepository.java")).q("CoreBugleMessageRepository: onLastUnregister, Stopping tombstone updater.");
        ctbx ctbxVar = this.ai;
        if (ctbxVar != null) {
            ctbxVar.a();
            this.ai = null;
        }
        ((aqev) this.R.get()).d();
    }

    @Override // defpackage.alye
    public final ConversationId g() {
        return this.j;
    }

    @Override // defpackage.alye
    public final aqge h(MessageId messageId) {
        ekzz f = eleg.f("MessageRepository#getMessageObservable");
        try {
            aozk aozkVar = new aozk(this, messageId);
            f.close();
            return aozkVar;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.alye
    public final aqge i() {
        ekzz f = eleg.f("MessageRepository#getNumberOfUnreadMessages");
        try {
            if (this.O == null) {
                this.O = new apcr(this, this.m, this.j);
            }
            apcr apcrVar = this.O;
            f.close();
            return apcrVar;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.alye
    public final aqge j() {
        apcf apcfVar = this.P;
        becj becjVar = (becj) apcfVar.a.b();
        becjVar.getClass();
        aouq aouqVar = (aouq) apcfVar.b.b();
        aouqVar.getClass();
        ffsk ffskVar = (ffsk) apcfVar.c.b();
        ffskVar.getClass();
        BugleConversationId bugleConversationId = this.j;
        bugleConversationId.getClass();
        return new apce(becjVar, aouqVar, ffskVar, bugleConversationId);
    }

    @Override // defpackage.alye
    public final ctbx k(final alyd alydVar) {
        ekzz f = eleg.f("MessageRepository#subscribeToChangesToAllMessages");
        try {
            engr engrVar = new engr();
            engrVar.h(this.x.a(new ctbf() { // from class: aowq
                @Override // defpackage.ctbf
                public final elfl a(Object obj) {
                    return alyd.this.b();
                }
            }, "CoreBugleMessageRepository::register", "CoreBugleMessageRepository::callback", "CoreBugleMessageRepository::unregister"));
            final aoxy aoxyVar = this.ah;
            synchronized (aoxyVar.a) {
                aoxyVar.b.add(alydVar);
            }
            engrVar.h(new ctbx() { // from class: aoxx
                @Override // defpackage.ctbx
                public final void a() {
                    aoxy aoxyVar2 = aoxy.this;
                    Object obj = aoxyVar2.a;
                    alyd alydVar2 = alydVar;
                    synchronized (obj) {
                        aoxyVar2.b.remove(alydVar2);
                    }
                }

                @Override // defpackage.ctbx, java.io.Closeable, java.lang.AutoCloseable
                public final /* synthetic */ void close() {
                    ctbw.a(this);
                }
            });
            aoxs aoxsVar = new aoxs(this, ctbt.a(engrVar.g()));
            f.close();
            return aoxsVar;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.alye
    public final elfl l(MessageId messageId, engw engwVar) {
        return ((Optional) this.aj.b()).isEmpty() ? elfo.d(new IllegalStateException("no messageClassificationPersister.")) : ((cgoo) ((Optional) this.aj.b()).get()).a(((CoreBugleMessageId) messageId).a, engwVar);
    }

    @Override // defpackage.alye
    public final elfl m(MessageId messageId, apyv apyvVar, cmrx cmrxVar, fjay fjayVar) {
        return aq(new apyx(messageId, apyvVar, cmrxVar, fjayVar));
    }

    @Override // defpackage.alye
    public final elfl n(final MessageId messageId) {
        return elfo.f(new Runnable() { // from class: aowo
            @Override // java.lang.Runnable
            public final void run() {
                String[] strArr = bueg.a;
                bued buedVar = new bued();
                buedVar.ap("CoreBugleMessageRepository#clearReactionEffects");
                buedVar.d();
                buedVar.c(aoyd.ad(MessageId.this));
            }
        }, this.c);
    }

    @Override // defpackage.alye
    public final elfl o(final engw engwVar) {
        return elfo.f(new Runnable() { // from class: aoxa
            @Override // java.lang.Runnable
            public final void run() {
                String[] strArr = bueg.a;
                bued buedVar = new bued();
                buedVar.ap("CoreBugleMessageRepository#clearReactionEffects");
                final engw engwVar2 = engw.this;
                buedVar.f(new Function() { // from class: aoxh
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        buef buefVar = (buef) obj;
                        buefVar.c((Iterable) Collection.EL.stream(engw.this).map(new aour()).collect(endq.a));
                        return buefVar;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                buedVar.d();
                buedVar.b().e();
            }
        }, this.c);
    }

    @Override // defpackage.alye
    public final elfl p() {
        if (!((Optional) this.C.b()).isEmpty()) {
            return ((aqbs) ((Optional) this.C.b()).get()).b(this.j);
        }
        ensk i = a.i();
        i.Y(ente.a, "BugleMapi");
        enrr enrrVar = (enrr) i;
        enrrVar.Y(csux.q, this.j);
        ((enrr) enrrVar.h("com/google/android/apps/messaging/shared/api/messaging/message/CoreBugleMessageRepository", "countStarredMessages", 1623, "CoreBugleMessageRepository.java")).q("Message star manager is not available");
        return elfo.d(new UnsupportedOperationException("Message star manager is not available."));
    }

    @Override // defpackage.alye
    public final elfl q(engw engwVar) {
        ekzz f = eleg.f("MessageRepository#deleteMessages");
        try {
            ambs ambsVar = (ambs) this.i.b();
            Stream map = Collection.EL.stream(engwVar).map(new aour());
            int i = engw.d;
            elfl c = ambsVar.c((List) map.collect(endq.a));
            f.close();
            return c;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.alye
    public final elfl r(engw engwVar, cgrr cgrrVar) {
        ekzz f = eleg.f("MessageRepository#deleteMessagesWithReason");
        try {
            ambs ambsVar = (ambs) this.i.b();
            Stream map = Collection.EL.stream(engwVar).map(new aour());
            int i = engw.d;
            elfl d = ambsVar.d((List) map.collect(endq.a), cgrrVar);
            f.close();
            return d;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.alye
    public final elfl s(engw engwVar) {
        if (!((Optional) this.V.b()).isEmpty()) {
            Stream concat = Stream.CC.concat(Collection.EL.stream(engwVar).map(new Function() { // from class: aowr
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    int ordinal = ((appn) obj).ordinal();
                    int i = 2;
                    if (ordinal != 0) {
                        if (ordinal == 1) {
                            i = 4;
                        } else if (ordinal != 2) {
                            i = 3;
                            if (ordinal != 3) {
                                i = 1;
                            }
                        } else {
                            i = 5;
                        }
                    }
                    return Integer.valueOf(i);
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }).map(new Function() { // from class: aows
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return new SearchQuery.ContentSearchFilter(((Integer) obj).intValue());
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }), Stream.CC.of(new SearchQuery.ConversationSearchFilter(this.j.a)));
            int i = engw.d;
            return ((cbnj) ((Optional) this.V.b()).get()).a(SearchQuery.d((engw) concat.collect(endq.a))).h(new emwl() { // from class: aowt
                @Override // defpackage.emwl
                public final Object apply(Object obj) {
                    cbpb cbpbVar = (cbpb) obj;
                    engw engwVar2 = (engw) Stream.CC.concat(Collection.EL.stream(cbpbVar.d()), Collection.EL.stream(cbpbVar.h())).map(new Function() { // from class: aowg
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo448andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj2) {
                            MediaSearchResult mediaSearchResult = (MediaSearchResult) obj2;
                            mediaSearchResult.getClass();
                            String k = mediaSearchResult.k();
                            k.getClass();
                            Uri h = mediaSearchResult.h();
                            h.getClass();
                            Uri h2 = mediaSearchResult.h();
                            h2.getClass();
                            mediaSearchResult.az(4, "width");
                            int i2 = mediaSearchResult.a;
                            mediaSearchResult.az(5, "height");
                            Size size = new Size(i2, mediaSearchResult.b);
                            mediaSearchResult.az(6, "timestamp");
                            return new apoc(k, h, h2, size, mediaSearchResult.c);
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    }).map(new Function() { // from class: aowh
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo448andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj2) {
                            return new alyg((apoc) obj2);
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    }).collect(endq.a);
                    Stream stream = Collection.EL.stream(cbpbVar.e());
                    final aoyd aoydVar = aoyd.this;
                    engw engwVar3 = (engw) Stream.CC.concat(Collection.EL.stream(engwVar2), Stream.CC.concat(Collection.EL.stream((engw) stream.map(new Function() { // from class: aowi
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo448andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj2) {
                            UrlSearchResult urlSearchResult = (UrlSearchResult) obj2;
                            long epochMilli = ((cqoh) aoyd.this.p.b()).f().toEpochMilli();
                            long g = urlSearchResult.g();
                            Uri uri = Uri.EMPTY;
                            if (urlSearchResult.s() != null) {
                                uri = Uri.parse(urlSearchResult.s());
                            }
                            Uri uri2 = Uri.EMPTY;
                            if (urlSearchResult.p() != null) {
                                uri2 = Uri.parse(urlSearchResult.p());
                            }
                            boolean z = epochMilli > g;
                            apwh apwhVar = new apwh();
                            apwhVar.f(urlSearchResult.q());
                            apwhVar.e(uri);
                            apwhVar.c(urlSearchResult.o());
                            apwhVar.d(uri2);
                            apwhVar.b(z);
                            return apwhVar.a();
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    }).map(new Function() { // from class: aowk
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo448andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj2) {
                            return new alyq((apwj) obj2);
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    }).collect(endq.a)), Collection.EL.stream((engw) Collection.EL.stream(cbpbVar.f()).map(new Function() { // from class: aowl
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo448andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj2) {
                            cbni cbniVar = (cbni) obj2;
                            boolean z = false;
                            if (cbniVar.h() != null) {
                                long epochMilli = ((cqoh) aoyd.this.p.b()).f().toEpochMilli();
                                Long h = cbniVar.h();
                                h.getClass();
                                if (epochMilli > h.longValue()) {
                                    z = true;
                                }
                            }
                            Uri uri = Uri.EMPTY;
                            if (cbniVar.n() != null) {
                                String n = cbniVar.n();
                                n.getClass();
                                uri = Uri.parse(n);
                            }
                            Uri uri2 = Uri.EMPTY;
                            if (cbniVar.l() != null) {
                                String l = cbniVar.l();
                                l.getClass();
                                uri2 = Uri.parse(l);
                            }
                            apwh apwhVar = new apwh();
                            apwhVar.f(cbniVar.m());
                            apwhVar.e(uri);
                            apwhVar.c(cbniVar.k());
                            apwhVar.d(uri2);
                            apwhVar.b(z);
                            return apwhVar.a();
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    }).map(new Function() { // from class: aowk
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo448andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj2) {
                            return new alyq((apwj) obj2);
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    }).collect(endq.a)))).collect(endq.a);
                    return new aotn(engwVar3.size(), engwVar3);
                }
            }, erpp.a);
        }
        ensk i2 = a.i();
        i2.Y(ente.a, "BugleMapi");
        enrr enrrVar = (enrr) i2;
        enrrVar.Y(csux.q, this.j);
        ((enrr) enrrVar.h("com/google/android/apps/messaging/shared/api/messaging/message/CoreBugleMessageRepository", "getContentSummary", 1521, "CoreBugleMessageRepository.java")).q("Message search API is not available");
        return elfo.d(new UnsupportedOperationException("Message search API is not available."));
    }

    @Override // defpackage.alye
    public final elfl t() {
        ekzz f = eleg.f("MessageRepository#getLatestReadMessage");
        try {
            aotj aotjVar = this.D;
            final BugleConversationId bugleConversationId = this.j;
            buxo d = MessagesTable.d();
            d.z("getLatestReadMessage");
            d.f(new Function() { // from class: aotg
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
            d.d((buxl[]) apam.a.b.toArray(new buxl[0]));
            d.h(new Function() { // from class: aoth
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    buxz buxzVar = (buxz) obj;
                    buxzVar.m(BugleConversationId.this.a);
                    buxzVar.P(true);
                    return buxzVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            d.x(1);
            elfl h = ao(aotjVar.b.a(d).b()).h(new emwl() { // from class: aovz
                @Override // defpackage.emwl
                public final Object apply(Object obj) {
                    return (alxr) Collection.EL.stream((engw) obj).filter(new Predicate() { // from class: aoxn
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
                            return ((alxr) obj2).x();
                        }
                    }).findFirst().orElse(null);
                }
            }, erpp.a);
            f.close();
            return h;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.alye
    public final elfl u(final MessageId messageId) {
        ekzz f = eleg.f("MessageRepository#getMessage");
        try {
            elfl h = ((messageId instanceof CoreBugleMessageId) || (messageId instanceof CoreBuglePartialMessageId)) ? ao(new dtzq("($V)", new Object[]{ad(messageId).b()})).h(new emwl() { // from class: aoux
                @Override // defpackage.emwl
                public final Object apply(Object obj) {
                    Stream stream = Collection.EL.stream((engw) obj);
                    final MessageId messageId2 = MessageId.this;
                    return (alxr) stream.filter(new Predicate() { // from class: aoxl
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
                            return ((alxr) obj2).b().equals(MessageId.this);
                        }
                    }).findFirst().orElse(null);
                }
            }, erpp.a) : elfo.d(new IllegalArgumentException("CoreBugleMessageId or CoreBuglePartialMessageId should be provided"));
            f.close();
            return h;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.alye
    public final elfl v() {
        ekzz f = eleg.f("MessageRepository#getMessageSendingL7");
        try {
            elfl g = elfo.g(new Callable() { // from class: aowa
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    final aoyd aoydVar = aoyd.this;
                    final long epochMilli = ((cqoh) aoydVar.p.b()).g().minusDays(7L).q(ZoneId.systemDefault()).toInstant().toEpochMilli();
                    buxo d = MessagesTable.d();
                    d.z("getMessageSendingL7");
                    d.c(MessagesTable.c.g);
                    d.h(new Function() { // from class: aovi
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo448andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            buxz buxzVar = (buxz) obj;
                            buxzVar.m(aoyd.this.j.a);
                            buxzVar.ak(1, 25);
                            buxzVar.aa(epochMilli);
                            return buxzVar;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    buuo buuoVar = (buuo) d.b().o();
                    HashSet hashSet = new HashSet();
                    while (buuoVar.moveToNext()) {
                        hashSet.add(Instant.ofEpochMilli(buuoVar.m()).atZone(ZoneId.systemDefault()).b());
                    }
                    return Integer.valueOf(hashSet.size());
                }
            }, this.m);
            f.close();
            return g;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.alye
    public final elfl w() {
        return elfo.g(new Callable() { // from class: aouy
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Object coreBugleMessageId;
                ensk h = aoyd.a.h();
                h.Y(ente.a, "BugleMapi");
                enrr enrrVar = (enrr) h;
                aoyd aoydVar = aoyd.this;
                enrrVar.Y(csux.q, aoydVar.j);
                ((enrr) enrrVar.h("com/google/android/apps/messaging/shared/api/messaging/message/CoreBugleMessageRepository", "getOldestUnreadMessageId", 628, "CoreBugleMessageRepository.java")).q("getOldestUnreadMessageId started");
                buxo b = cbem.b(aoydVar.j.a);
                b.f(new Function() { // from class: aovx
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
                b.d((buxl[]) apam.a.c.toArray(new buxl[0]));
                b.v(MessagesTable.c.a);
                b.x(1);
                MessagesTable.BindData bindData = (MessagesTable.BindData) ((buuo) ((aozw) aoydVar.s.get()).a(b).b().o()).cS();
                if (bindData == null) {
                    coreBugleMessageId = null;
                } else {
                    boolean z = aoydVar.t;
                    final MessageIdType D = bindData.D();
                    if (z) {
                        String[] strArr = PartsTable.a;
                        coreBugleMessageId = (MessageId) DesugarArrays.stream((PartsTable.BindData[]) bindData.aG("parts", new PartsTable.BindData[0])).min(Comparator.CC.comparingInt(new ToIntFunction() { // from class: aovy
                            @Override // java.util.function.ToIntFunction
                            public final int applyAsInt(Object obj) {
                                return Integer.parseInt(((PartsTable.BindData) obj).J());
                            }
                        })).map(new Function() { // from class: aowj
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo448andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj) {
                                return new CoreBugleMessageId(MessageIdType.this, Long.parseLong(((PartsTable.BindData) obj).J()));
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        }).orElse(new CoreBugleMessageId(D, -1L));
                    } else {
                        coreBugleMessageId = new CoreBugleMessageId(D, -1L);
                    }
                }
                ensk h2 = aoyd.a.h();
                h2.Y(ente.a, "BugleMapi");
                enrr enrrVar2 = (enrr) h2;
                enrrVar2.Y(csux.q, aoydVar.j);
                ((enrr) enrrVar2.h("com/google/android/apps/messaging/shared/api/messaging/message/CoreBugleMessageRepository", "getOldestUnreadMessageId", 634, "CoreBugleMessageRepository.java")).t("getOldestUnreadMessageId completed. Returning: %s", coreBugleMessageId);
                return coreBugleMessageId;
            }
        }, this.m);
    }

    @Override // defpackage.alye
    public final elfl x() {
        return elfo.g(new Callable() { // from class: aoww
            @Override // java.util.concurrent.Callable
            public final Object call() {
                buxo d = MessagesTable.d();
                d.z("MessageRepository.isEmptyConversation");
                final aoyd aoydVar = aoyd.this;
                d.h(new Function() { // from class: aowv
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        buxz buxzVar = (buxz) obj;
                        buxzVar.m(aoyd.this.j.a);
                        return buxzVar;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                return Boolean.valueOf(d.b().V());
            }
        }, this.m);
    }

    @Override // defpackage.alye
    public final elfl y() {
        ekzz f = eleg.f("MessageRepository#markAllMessagesAsRead");
        try {
            ((ciwj) this.J.b()).b(cixf.NT_INCOMING_MESSAGE, ((cjcj) this.K.b()).a(this.j.a));
            elfl a2 = ((bbfd) this.L.b()).a(this.j.a);
            f.close();
            return a2;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.alye
    public final elfl z(MessageId messageId) {
        ekzz f = eleg.f("MessageRepository#markMessageAsRead");
        try {
            elfl b = ((bbfd) this.L.b()).b(this.j.a, ((CoreBugleMessageId) messageId).a);
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
}
