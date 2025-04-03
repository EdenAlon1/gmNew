package defpackage;

import android.content.ContentValues;
import android.net.Uri;
import androidx.car.app.model.Alert;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;
import j$.util.Collection;
import j$.util.DesugarArrays;
import j$.util.Objects;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Collectors;
import j$.util.stream.Stream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bdmq {
    public static final cskc a = cskc.g("BugleDataModel", "MessageDatabaseOperations");
    public static final emyl b = cfvl.x(206679830, "refactor_get_latest_message_by_conversation_and_sender");
    static final emyl c = cfvl.x(209309856, "new_read_user_reference_data");
    public final ffbr d;
    public final ffbr e;
    public final ffbr f;
    public final ffbr g;
    public final ffbr h;
    public final ffbr i;
    public final ffbr j;
    public final ffbr k;
    public final ffbr l;
    private final ffbr m;
    private final ffbr n;
    private final ffbr o;
    private final ffbr p;
    private final ffbr q;
    private final ffbr r;

    public bdmq(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, ffbr ffbrVar6, ffbr ffbrVar7, ffbr ffbrVar8, ffbr ffbrVar9, ffbr ffbrVar10, ffbr ffbrVar11, ffbr ffbrVar12, ffbr ffbrVar13, ffbr ffbrVar14, ffbr ffbrVar15) {
        this.m = ffbrVar;
        this.e = ffbrVar2;
        this.f = ffbrVar3;
        this.n = ffbrVar4;
        this.o = ffbrVar5;
        this.g = ffbrVar6;
        this.p = ffbrVar7;
        this.h = ffbrVar8;
        this.q = ffbrVar9;
        this.d = ffbrVar10;
        this.i = ffbrVar11;
        this.j = ffbrVar12;
        this.k = ffbrVar13;
        this.l = ffbrVar14;
        this.r = ffbrVar15;
    }

    public static buxr B(final MessageIdType messageIdType, int i, long j, Uri uri) {
        String[] strArr = MessagesTable.a;
        buxr buxrVar = new buxr();
        buxrVar.ap("getUpdateBuilderForResending");
        buxrVar.z(i);
        buxrVar.I(j);
        buxrVar.Y(new Function() { // from class: bdkn
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                buxz buxzVar = (buxz) obj;
                cskc cskcVar = bdmq.a;
                buxzVar.q(MessageIdType.this);
                return buxzVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        if (uri != null) {
            buxrVar.S(uri);
        }
        buxrVar.C(0);
        return buxrVar;
    }

    public static buxz C(ConversationIdType conversationIdType, boolean z) {
        String[] strArr = MessagesTable.a;
        buxz buxzVar = new buxz();
        buxzVar.m(conversationIdType);
        buxzVar.an(axuh.b);
        if (!z) {
            buxzVar.B(false);
        }
        return buxzVar;
    }

    public static buxz D(ConversationIdType conversationIdType) {
        buxz C = C(conversationIdType, false);
        C.b(new Function() { // from class: bdlm
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                buxz buxzVar = (buxz) obj;
                cskc cskcVar = bdmq.a;
                buxzVar.al();
                return buxzVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }, new Function() { // from class: bdln
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                buxz buxzVar = (buxz) obj;
                cskc cskcVar = bdmq.a;
                buxzVar.ag();
                return buxzVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        return C;
    }

    public static void V(MessageCoreData messageCoreData, bsoe bsoeVar, String str) {
        ekzz f = eleg.f("MessageDatabaseOperations#addSnippetTextAndPreviewToContentValues");
        try {
            bsoeVar.W(false);
            if (!ctjd.b() || str == null) {
                bsoeVar.Y(messageCoreData.ar());
            } else {
                bsoeVar.Y(str);
            }
            dtub.u(bsoeVar.a, "subject_text", cuxs.a(messageCoreData.au()));
            MessagePartCoreData I = messageCoreData.I();
            if (I != null) {
                bdot C = I.C();
                bsoeVar.L(((bdos) C).a);
                bsoeVar.M(((bdos) C).b);
            } else {
                bsoeVar.L(null);
                bsoeVar.M(null);
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

    public static final bytf Z(final MessageIdType messageIdType) {
        bvvn e = ParticipantsTable.e();
        e.e(new Function() { // from class: bdkj
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bvtg bvtgVar = (bvtg) obj;
                cskc cskcVar = bdmq.a;
                return new bvth[]{bvtgVar.a, bvtgVar.f, bvtgVar.g, bvtgVar.z, bvtgVar.h, bvtgVar.t, bvtgVar.s, bvtgVar.u, bvtgVar.o, bvtgVar.Q, bvtgVar.m, bvtgVar.n, bvtgVar.r};
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        bvvl b2 = e.b();
        String[] strArr = bytk.a;
        byth bythVar = new byth(bytk.a);
        bythVar.z("queryUserRefs");
        bythVar.v(bytk.c.b);
        bythVar.c(new Function() { // from class: bdkk
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bysq bysqVar = (bysq) obj;
                cskc cskcVar = bdmq.a;
                return new bysr[]{bysqVar.b, bysqVar.c, bysqVar.d};
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        bythVar.d(new Function() { // from class: bdkl
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bytj bytjVar = (bytj) obj;
                cskc cskcVar = bdmq.a;
                bytjVar.aq(new dtrt("user_references.message_id", 1, Long.valueOf(bdhb.a(MessageIdType.this))));
                return bytjVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        bythVar.C((String) DesugarArrays.stream(new bytd[]{new bytd(bytk.c.d)}).map(new Function() { // from class: bytg
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((bytd) obj).a();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).collect(Collectors.joining(", ")));
        bythVar.G(dtvz.i(b2, ParticipantsTable.c.a, bytk.c.c).g());
        return bythVar.b();
    }

    public static int a(ConversationIdType conversationIdType) {
        ekzz f = eleg.f("MessageDatabaseOperations#getCountOfAllMessagesInConversation");
        try {
            String[] strArr = MessagesTable.a;
            buxz buxzVar = new buxz();
            buxzVar.m(conversationIdType);
            buxzVar.b(new Function() { // from class: bdmp
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    buxz buxzVar2 = (buxz) obj;
                    cskc cskcVar = bdmq.a;
                    buxzVar2.al();
                    return buxzVar2;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }, new Function() { // from class: bdju
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    buxz buxzVar2 = (buxz) obj;
                    cskc cskcVar = bdmq.a;
                    buxzVar2.ag();
                    return buxzVar2;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            int d = d(new buxs(buxzVar));
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

    private final MessageCoreData ab(buxs buxsVar, boolean z) {
        ekzz f = eleg.f("MessageDatabaseOperations#getEarliestOrLatestMessage");
        String str = z ? "earliest" : "latest";
        try {
            engw ac = ac(buxsVar, 1, z);
            MessageCoreData messageCoreData = null;
            if (ac == null) {
                a.n(a.a(str, "The returned list of ", " messages is null."));
            } else if (ac.size() != 1) {
                csjb e = a.e();
                e.I("Unexpected list of");
                e.L(str, ac);
                e.I("is returned.");
                e.r();
            } else {
                messageCoreData = (MessageCoreData) ac.get(0);
            }
            f.close();
            return messageCoreData;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private final engw ac(buxs buxsVar, int i, boolean z) {
        ekzz f = eleg.f("MessageDatabaseOperations#getEarliestOrLatestMessages");
        try {
            String num = Integer.toString(i);
            buxo d = MessagesTable.d();
            d.z("getEarliestOrLatestMessages");
            d.k(buxsVar);
            buxl[] buxlVarArr = new buxl[1];
            buxlVarArr[0] = z ? new buxl(MessagesTable.c.i, true) : new buxl(MessagesTable.c.i, false);
            d.d(buxlVarArr);
            d.y(num);
            engw J = J(d.b());
            f.close();
            return J;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static int b(ConversationIdType conversationIdType, String str) {
        ekzz f = eleg.f("MessageDatabaseOperations#getCountOfIncomingMessagesInConversation");
        try {
            String[] strArr = MessagesTable.a;
            buxz buxzVar = new buxz();
            buxzVar.m(conversationIdType);
            buxzVar.X(str);
            buxzVar.ak(100, 117);
            int d = d(new buxs(buxzVar));
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

    public static int c(ConversationIdType conversationIdType) {
        ekzz f = eleg.f("MessageDatabaseOperations#getCountOfOutgoingMessagesInConversation");
        try {
            String[] strArr = MessagesTable.a;
            buxz buxzVar = new buxz();
            buxzVar.m(conversationIdType);
            buxzVar.ak(1, 25);
            int d = d(new buxs(buxzVar));
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

    public static int d(buxs buxsVar) {
        ekzz f = eleg.f("MessageDatabaseOperations#getMessageCount");
        try {
            csix.h();
            buxo d = MessagesTable.d();
            d.z("MessageDatabaseOperations#getMessageCount");
            d.k(buxsVar);
            int i = d.b().i();
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

    public final MessageCoreData A(buxs buxsVar) {
        MessageCoreData messageCoreData;
        ekzz f = eleg.f("MessageDatabaseOperations#readMessageNoParts where");
        try {
            csix.h();
            buxo d = MessagesTable.d();
            d.z("+readMessageData2");
            d.k(buxsVar);
            MessagesTable.BindData bindData = (MessagesTable.BindData) ((buuo) d.b().o()).cS();
            if (bindData != null) {
                messageCoreData = ((byzp) this.e.b()).a();
                messageCoreData.aM(bindData);
            } else {
                messageCoreData = null;
            }
            f.close();
            return messageCoreData;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final byyt E(long j, String str, boolean z, boolean z2) {
        return F(((bczy) this.g.b()).m(j), str, z, z2);
    }

    public final byyt F(ConversationIdType conversationIdType, String str, boolean z, boolean z2) {
        ekzz f = eleg.f("MessageDatabaseOperations#getArchiveStatusForIncomingMessage");
        try {
            efbd.b();
            ParticipantsTable.BindData d = ((bdrr) this.o.b()).d(str);
            boolean z3 = true;
            boolean z4 = d != null && d.ab() && cuky.a(d.n()).c();
            if (!conversationIdType.b()) {
                if (p(conversationIdType) != null) {
                    z3 = false;
                }
                z4 &= z3;
            }
            byyt byytVar = z4 ? byyt.SPAM_FOLDER : z ? z2 ? byyt.ARCHIVED : byyt.BLOCKED_FOLDER : byyt.UNARCHIVED;
            f.close();
            return byytVar;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final engw G(ConversationIdType conversationIdType, int i) {
        ekzz f = eleg.f("MessageDatabaseOperations#getLatestIncomingMessagesForConversation");
        try {
            String[] strArr = MessagesTable.a;
            buxz buxzVar = new buxz();
            buxzVar.m(conversationIdType);
            buxzVar.ak(100, 117);
            engw H = H(new buxs(buxzVar), i);
            f.close();
            return H;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final engw H(buxs buxsVar, int i) {
        ekzz f = eleg.f("MessageDatabaseOperations#getLatestMessages");
        try {
            engw ac = ac(buxsVar, i, false);
            f.close();
            return ac;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final engw I(buxz buxzVar, int i) {
        ekzz f = eleg.f("MessageDatabaseOperations#getMessageIdsDescending");
        try {
            efbd.b();
            buxo e = MessagesTable.e("getMessageIdsDescending#query");
            e.g(buxzVar);
            e.d(new buxl(MessagesTable.c.a, false));
            e.c(MessagesTable.c.a);
            e.x(i);
            buuo buuoVar = (buuo) e.b().o();
            try {
                engw v = buuoVar.v();
                buuoVar.close();
                f.close();
                return v;
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

    public final engw J(buxm buxmVar) {
        ekzz f = eleg.f("MessageDatabaseOperations#getMessages");
        try {
            csix.h();
            ArrayList arrayList = new ArrayList();
            buuo buuoVar = (buuo) buxmVar.o();
            while (buuoVar.moveToNext()) {
                try {
                    MessageCoreData a2 = ((byzp) this.e.b()).a();
                    a2.aN(buuoVar);
                    ((bdpt) this.f.b()).c(a2, false);
                    N(a2);
                    arrayList.add(a2);
                } finally {
                }
            }
            buuoVar.close();
            engw n = engw.n(arrayList);
            f.close();
            return n;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final engw K(final List list) {
        ekzz f = eleg.f("MessageDatabaseOperations#getMessagesByIds");
        try {
            buxo d = MessagesTable.d();
            d.z("+getMessagesByIds");
            d.h(new Function() { // from class: bdjx
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    buxz buxzVar = (buxz) obj;
                    cskc cskcVar = bdmq.a;
                    buxzVar.u(list);
                    return buxzVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            engw J = J(d.b());
            f.close();
            return J;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final List L(ConversationIdType conversationIdType, int i) {
        ekzz f = eleg.f("MessageDatabaseOperations#getLatestMessagesForConversation");
        try {
            String[] strArr = MessagesTable.a;
            buxz buxzVar = new buxz();
            buxzVar.m(conversationIdType);
            engw H = H(new buxs(buxzVar), i);
            if (H == null) {
                int i2 = engw.d;
                H = enou.a;
            }
            f.close();
            return H;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final List M(ConversationIdType conversationIdType, int i) {
        ekzz f = eleg.f("MessageDatabaseOperations#getLatestVisibleMessagesForConversation");
        try {
            engw H = H(new buxs(D(conversationIdType)), i);
            if (H == null) {
                int i2 = engw.d;
                H = enou.a;
            }
            f.close();
            return H;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void N(MessageCoreData messageCoreData) {
        if (((Boolean) ((cfup) c.get()).e()).booleanValue()) {
            ekzz f = eleg.f("MessageDatabaseOperations#readUserReferenceData");
            try {
                if (!cbvv.h(messageCoreData.k())) {
                    f.close();
                    return;
                }
                String aA = messageCoreData.aA();
                aA.getClass();
                ParticipantsTable.BindData b2 = ParticipantsTable.b(aA);
                b2.getClass();
                bysc byscVar = (bysc) ((byss) Z(messageCoreData.B()).o()).cS();
                if (byscVar != null) {
                    messageCoreData.bY(((bdrt) this.n.b()).a(b2, false), bcyy.i(byscVar, this.m, this.d));
                } else {
                    a.q("Tombstone user reference list is empty");
                    messageCoreData.bY(((bdrt) this.n.b()).a(b2, false), new ArrayList());
                }
                f.close();
                return;
            } catch (Throwable th) {
                try {
                    f.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        ekzz f2 = eleg.f("MessageDatabaseOperations#readUserReferenceData");
        try {
            if (!cbvv.h(messageCoreData.k())) {
                f2.close();
                return;
            }
            String aA2 = messageCoreData.aA();
            aA2.getClass();
            ParticipantsTable.BindData b3 = ParticipantsTable.b(aA2);
            b3.getClass();
            bysc byscVar2 = (bysc) ((byss) Z(messageCoreData.B()).o()).cS();
            if (byscVar2 != null) {
                messageCoreData.bY(((bdrt) this.n.b()).a(b3, false), bcyy.i(byscVar2, this.m, this.d));
            } else {
                a.q("Tombstone user reference list is empty");
                messageCoreData.bY(((bdrt) this.n.b()).a(b3, false), new ArrayList());
            }
            f2.close();
        } catch (Throwable th3) {
            try {
                f2.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    public final void O(final MessageCoreData messageCoreData) {
        csix.h();
        ((dtuu) this.p.b()).d("MessageDatabaseOperations#updateMessage", new Runnable() { // from class: bdmg
            @Override // java.lang.Runnable
            public final void run() {
                bdmq bdmqVar = bdmq.this;
                MessageCoreData messageCoreData2 = messageCoreData;
                final MessageIdType B = messageCoreData2.B();
                if (bdmqVar.v(B) != null) {
                    String[] strArr = PartsTable.a;
                    bwcy bwcyVar = new bwcy();
                    bwcyVar.f("deletePartsForMessage");
                    bwcyVar.a(new Function() { // from class: bdmb
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo448andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            bwdm bwdmVar = (bwdm) obj;
                            cskc cskcVar = bdmq.a;
                            bwdmVar.n(MessageIdType.this);
                            return bwdmVar;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    csix.d(bwcyVar.d(), 0, Alert.DURATION_SHOW_INDEFINITELY);
                    for (MessagePartCoreData messagePartCoreData : messageCoreData2.ab()) {
                        messagePartCoreData.aQ(B);
                        ((bdjr) bdmqVar.j.b()).c(messagePartCoreData, messageCoreData2.z());
                    }
                    bdmqVar.U(messageCoreData2.z(), B, messageCoreData2.K());
                }
            }
        });
    }

    public final void P(final MessageCoreData messageCoreData, final List list) {
        csix.h();
        ((dtuu) this.p.b()).d("MessageDatabaseOperations#updateMessageAndParts", new Runnable() { // from class: bdkh
            @Override // java.lang.Runnable
            public final void run() {
                Iterator it = list.iterator();
                while (true) {
                    MessageCoreData messageCoreData2 = messageCoreData;
                    bdmq bdmqVar = bdmq.this;
                    if (!it.hasNext()) {
                        bdmqVar.U(messageCoreData2.z(), messageCoreData2.B(), messageCoreData2.K());
                        return;
                    }
                    MessagePartCoreData messagePartCoreData = (MessagePartCoreData) it.next();
                    String[] strArr = PartsTable.a;
                    bwdi bwdiVar = new bwdi();
                    bwdiVar.ap("updateMessageAndParts");
                    ContentValues r = messagePartCoreData.r();
                    bwdiVar.a.clear();
                    bwdiVar.a.putAll(r);
                    ((bdpt) bdmqVar.f.b()).f(messageCoreData2.z(), messageCoreData2.B(), messagePartCoreData.aa(), bwdiVar);
                }
            }
        });
    }

    public final void Q(ConversationIdType conversationIdType, MessageIdType messageIdType, buxr buxrVar) {
        ekzz f = eleg.f("MessageDatabaseOperations#updateMessageRow");
        try {
            csix.h();
            U(conversationIdType, messageIdType, buxrVar);
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

    public final boolean R(final ConversationIdType conversationIdType) {
        ekzz f = eleg.f("MessageDatabaseOperations#hasUnreadMessagesForConversation");
        try {
            buxo d = MessagesTable.d();
            d.z("hasUnreadMessagesForConversation1");
            d.h(new Function() { // from class: bdle
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    buxz buxzVar = (buxz) obj;
                    cskc cskcVar = bdmq.a;
                    final ConversationIdType conversationIdType2 = ConversationIdType.this;
                    buxzVar.m(conversationIdType2);
                    buxo d2 = MessagesTable.d();
                    d2.z("hasUnreadMessagesForConversation2");
                    d2.h(new Function() { // from class: bdlh
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo448andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj2) {
                            buxz buxzVar2 = (buxz) obj2;
                            cskc cskcVar2 = bdmq.a;
                            buxzVar2.m(ConversationIdType.this);
                            buxzVar2.P(false);
                            return buxzVar2;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    buxzVar.as(new dtym(d2.b()));
                    return buxzVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            boolean T = d.b().T();
            f.close();
            return T;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final boolean S(buxq buxqVar, ConversationIdType conversationIdType, MessageIdType messageIdType) {
        if (buxqVar.e() <= 0) {
            return false;
        }
        ((cbgf) this.h.b()).l(conversationIdType, messageIdType, buxqVar.p());
        return true;
    }

    public final boolean T(MessageCoreData messageCoreData) {
        ekzz f = eleg.f("MessageDatabaseOperationsImpl#updateMessageMetadata");
        try {
            ConversationIdType z = messageCoreData.z();
            MessageIdType B = messageCoreData.B();
            String[] strArr = MessagesTable.a;
            buxr buxrVar = new buxr();
            buxrVar.ap("updateMessageMetadata");
            buxrVar.U(messageCoreData.k());
            buxrVar.F(messageCoreData.cO());
            buxrVar.v(messageCoreData.cN());
            buxrVar.G(messageCoreData.o());
            buxrVar.O(messageCoreData.r());
            buxrVar.R(messageCoreData.s());
            buxrVar.t(messageCoreData.l());
            buxrVar.D(messageCoreData.n());
            boolean U = U(z, B, buxrVar);
            f.close();
            return U;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final boolean U(final ConversationIdType conversationIdType, final MessageIdType messageIdType, final buxr buxrVar) {
        csix.h();
        return ((Boolean) ((dtuu) this.p.b()).c("MessageDatabaseOperationsImpl#updateMessageRowIfExists", new emyl() { // from class: bdkw
            @Override // defpackage.emyl
            public final Object get() {
                buxr buxrVar2 = buxrVar;
                buxrVar2.ap("updateMessageRowIfExists");
                final MessageIdType messageIdType2 = messageIdType;
                buxrVar2.Y(new Function() { // from class: bdmo
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        buxz buxzVar = (buxz) obj;
                        cskc cskcVar = bdmq.a;
                        buxzVar.q(MessageIdType.this);
                        return buxzVar;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                buxq b2 = buxrVar2.b();
                if (b2.e() <= 0) {
                    return false;
                }
                ConversationIdType conversationIdType2 = conversationIdType;
                bdmq bdmqVar = bdmq.this;
                ((cbgf) bdmqVar.h.b()).l(conversationIdType2, messageIdType2, b2.p());
                if (b2.n("message_status")) {
                    int a2 = b2.a();
                    if (!axuh.b.contains(Integer.valueOf(a2)) && !bcse.aA(a2)) {
                        ((bczy) bdmqVar.g.b()).U(conversationIdType2, null, false);
                    }
                }
                return true;
            }
        })).booleanValue();
    }

    public final engw W(ConversationIdType conversationIdType, String str, boolean z) {
        ekzz f = eleg.f("MessageDatabaseOperations#getEarliestOrLatestIncomingMessagesByConversationAndSender");
        try {
            String[] strArr = MessagesTable.a;
            buxz buxzVar = new buxz();
            buxzVar.m(conversationIdType);
            buxzVar.X(str);
            buxzVar.ak(100, 117);
            engw ac = ac(new buxs(buxzVar), 1, z);
            f.close();
            return ac;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final engw X(ConversationIdType conversationIdType, int i) {
        ekzz f = eleg.f("MessageDatabaseOperations#getLatestIncomingMessagesPerProtocolForConversation");
        try {
            String[] strArr = MessagesTable.a;
            buxz buxzVar = new buxz();
            buxzVar.m(conversationIdType);
            buxzVar.ak(100, 117);
            buxzVar.K(i);
            engw H = H(new buxs(buxzVar), 1);
            if (H == null) {
                int i2 = engw.d;
                H = enou.a;
            }
            f.close();
            return H;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void Y(ConversationIdType conversationIdType, final MessageIdType messageIdType) {
        ekzz f = eleg.f("MessageDatabaseOperations#markUndeliveredAsFallbackReady");
        try {
            String[] strArr = MessagesTable.a;
            buxr buxrVar = new buxr();
            buxrVar.ap("markUndeliveredAsFallbackReady");
            buxrVar.U(14);
            buxrVar.Y(new Function() { // from class: bdli
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    buxz buxzVar = (buxz) obj;
                    cskc cskcVar = bdmq.a;
                    buxzVar.q(MessageIdType.this);
                    buxzVar.K(3);
                    buxzVar.af(1);
                    return buxzVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            if (buxrVar.b().e() > 0) {
                ((cbgf) this.h.b()).l(conversationIdType, messageIdType, "message_status");
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

    public final void aa(final ConversationIdType conversationIdType, final MessageCoreData messageCoreData, final int i, final boolean z) {
        ekzz f = eleg.f("MessageDatabaseOperations#updateDraftMessageData");
        try {
            csix.h();
            csix.d(i, 1, 2);
            f.close();
        } finally {
        }
    }

    public final long e(final ConversationIdType conversationIdType) {
        long j;
        ekzz f = eleg.f("MessageDatabaseOperations#getLatestIncomingReadMessageTimestampMs");
        try {
            buxo d = MessagesTable.d();
            d.z("getLatestIncomingReadMessageTimestampMs");
            d.n(new dtzq("MAX($V)", new Object[]{MessagesTable.c.i}), "max_timestamp_expression");
            d.h(new Function() { // from class: bdmd
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    buxz buxzVar = (buxz) obj;
                    cskc cskcVar = bdmq.a;
                    buxzVar.m(ConversationIdType.this);
                    buxzVar.B(false);
                    buxzVar.ak(100, 117);
                    buxzVar.P(true);
                    return buxzVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            buuo buuoVar = (buuo) d.b().o();
            try {
                if (buuoVar.moveToFirst()) {
                    j = buuoVar.l();
                    buuoVar.close();
                } else {
                    buuoVar.close();
                    j = 0;
                }
                f.close();
                return j;
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

    public final MessageCoreData f(ConversationIdType conversationIdType) {
        ekzz f = eleg.f("MessageDatabaseOperations#getEarliestIncomingMessageForConversation");
        try {
            String[] strArr = MessagesTable.a;
            buxz buxzVar = new buxz();
            buxzVar.m(conversationIdType);
            buxzVar.ak(100, 117);
            MessageCoreData g = g(new buxs(buxzVar));
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

    public final MessageCoreData g(buxs buxsVar) {
        ekzz f = eleg.f("MessageDatabaseOperations#getEarliestMessage");
        try {
            MessageCoreData ab = ab(buxsVar, true);
            f.close();
            return ab;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final MessageCoreData h(ConversationIdType conversationIdType, String str, boolean z) {
        ekzz f = eleg.f("MessageDatabaseOperations#getEarliestOrLatestIncomingMessageByConversationAndSender");
        try {
            engw W = W(conversationIdType, str, z);
            MessageCoreData messageCoreData = null;
            if (W != null && W.size() == 1) {
                messageCoreData = (MessageCoreData) W.get(0);
            }
            f.close();
            return messageCoreData;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final MessageCoreData i(ConversationIdType conversationIdType) {
        ekzz f = eleg.f("MessageDatabaseOperations#getEarliestVisibleMessageForConversation");
        try {
            MessageCoreData g = g(new buxs(D(conversationIdType)));
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

    public final MessageCoreData j(ConversationIdType conversationIdType, long j) {
        ekzz f = eleg.f("MessageDatabaseOperations#getFirstVisibleMessageOrTombstoneAfterTimestamp");
        try {
            buxz C = C(conversationIdType, false);
            C.R(j);
            MessageCoreData g = g(new buxs(C));
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

    public final MessageCoreData k(ConversationIdType conversationIdType, long j) {
        ekzz f = eleg.f("MessageDatabaseOperations#getLastVisibleMessageOrTombstoneBeforeTimestamp");
        try {
            buxz C = C(conversationIdType, false);
            C.T(j);
            MessageCoreData m = m(new buxs(C));
            f.close();
            return m;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final MessageCoreData l(ConversationIdType conversationIdType) {
        ekzz f = eleg.f("MessageDatabaseOperations#getLatestInitializingEtouffeeTombstoneForConversation");
        try {
            String[] strArr = MessagesTable.a;
            buxz buxzVar = new buxz();
            buxzVar.m(conversationIdType);
            buxzVar.B(false);
            buxzVar.aj(213, 219, 226, 229);
            MessageCoreData m = m(new buxs(buxzVar));
            f.close();
            return m;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final MessageCoreData m(buxs buxsVar) {
        ekzz f = eleg.f("MessageDatabaseOperations#getLatestMessage");
        try {
            MessageCoreData ab = ab(buxsVar, false);
            f.close();
            return ab;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final MessageCoreData n(ConversationIdType conversationIdType) {
        ekzz f = eleg.f("MessageDatabaseOperations#getLatestMessageForConversation");
        try {
            String[] strArr = MessagesTable.a;
            buxz buxzVar = new buxz();
            buxzVar.m(conversationIdType);
            MessageCoreData m = m(new buxs(buxzVar));
            f.close();
            return m;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final MessageCoreData o(ConversationIdType conversationIdType) {
        ekzz f = eleg.f("MessageDatabaseOperations#getLatestProtocoledMessageForConversation");
        try {
            String[] strArr = MessagesTable.a;
            buxz buxzVar = new buxz();
            buxzVar.m(conversationIdType);
            buxzVar.an(axuh.b);
            buxzVar.B(false);
            MessageCoreData m = m(new buxs(buxzVar));
            f.close();
            return m;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final MessageCoreData p(ConversationIdType conversationIdType) {
        ekzz f = eleg.f("MessageDatabaseOperations#getLatestOutgoingMessageForConversation");
        try {
            String[] strArr = MessagesTable.a;
            buxz buxzVar = new buxz();
            buxzVar.m(conversationIdType);
            buxzVar.ak(1, 25);
            buxzVar.an(axuh.b);
            MessageCoreData m = m(new buxs(buxzVar));
            f.close();
            return m;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final MessageCoreData q(ConversationIdType conversationIdType) {
        ekzz f = eleg.f("MessageDatabaseOperations#getLatestSatelliteMessageForConversation");
        try {
            String[] strArr = MessagesTable.a;
            buxz buxzVar = new buxz();
            buxzVar.m(conversationIdType);
            buxzVar.aj(251, 239);
            MessageCoreData m = m(new buxs(buxzVar));
            f.close();
            return m;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final MessageCoreData r(ConversationIdType conversationIdType) {
        ekzz f = eleg.f("MessageDatabaseOperations#getLatestVisibleMessageForConversation");
        try {
            MessageCoreData m = m(new buxs(D(conversationIdType)));
            f.close();
            return m;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final MessageCoreData s(ConversationIdType conversationIdType, MessageIdType messageIdType) {
        ekzz f = eleg.f("MessageDatabaseOperations#getLatestVisibleMessageOrEtouffeeTombstoneExcludingMessage");
        try {
            String[] strArr = MessagesTable.a;
            buxz buxzVar = new buxz();
            buxzVar.m(conversationIdType);
            buxzVar.A(messageIdType);
            buxzVar.an(axuh.b);
            buxzVar.B(false);
            if (((auol) this.r.b()).a()) {
                buxzVar.an(axuh.c);
            }
            if (((Boolean) ((cfup) ctjd.ak.get()).e()).booleanValue()) {
                buxzVar.b(new Function() { // from class: bdmh
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        buxz buxzVar2 = (buxz) obj;
                        cskc cskcVar = bdmq.a;
                        buxzVar2.al();
                        return buxzVar2;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }, new Function() { // from class: bdmi
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        buxz buxzVar2 = (buxz) obj;
                        cskc cskcVar = bdmq.a;
                        buxzVar2.ag();
                        return buxzVar2;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }, new Function() { // from class: bdmj
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        buxz buxzVar2 = (buxz) obj;
                        cskc cskcVar = bdmq.a;
                        buxzVar2.ai(axuh.a);
                        return buxzVar2;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }, new Function() { // from class: bdmk
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        buxz buxzVar2 = (buxz) obj;
                        cskc cskcVar = bdmq.a;
                        buxzVar2.af(242);
                        return buxzVar2;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
            } else {
                buxzVar.b(new Function() { // from class: bdml
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        buxz buxzVar2 = (buxz) obj;
                        cskc cskcVar = bdmq.a;
                        buxzVar2.al();
                        return buxzVar2;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }, new Function() { // from class: bdmm
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        buxz buxzVar2 = (buxz) obj;
                        cskc cskcVar = bdmq.a;
                        buxzVar2.ag();
                        return buxzVar2;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }, new Function() { // from class: bdmn
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        buxz buxzVar2 = (buxz) obj;
                        cskc cskcVar = bdmq.a;
                        buxzVar2.ai(axuh.a);
                        return buxzVar2;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
            }
            MessageCoreData m = m(new buxs(buxzVar));
            f.close();
            return m;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final MessageCoreData t(final MessageIdType messageIdType) {
        ekzz f = eleg.f("MessageDatabaseOperations#getMessageWithoutParts");
        try {
            MessageCoreData messageCoreData = (MessageCoreData) MessagesTable.j(messageIdType, new Function() { // from class: bdjz
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    bdmq bdmqVar = bdmq.this;
                    MessageCoreData a2 = ((byzp) bdmqVar.e.b()).a();
                    a2.aM((MessagesTable.BindData) obj);
                    bdmqVar.N(a2);
                    return a2;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }, new Supplier() { // from class: bdka
                @Override // java.util.function.Supplier
                public final Object get() {
                    csjb e = bdmq.a.e();
                    e.I("no message found for");
                    e.d(MessageIdType.this);
                    e.r();
                    return null;
                }
            });
            f.close();
            return messageCoreData;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final MessageCoreData u(String str) {
        ekzz f = eleg.f("MessageDatabaseOperations#readCloudSyncMessageData");
        try {
            String[] strArr = MessagesTable.a;
            buxz buxzVar = new buxz();
            buxzVar.d(str);
            MessageCoreData A = A(new buxs(buxzVar));
            f.close();
            return A;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final MessageCoreData v(MessageIdType messageIdType) {
        ekzz f = eleg.f("MessageDatabaseOperations#readMessageAndParts");
        try {
            csix.h();
            MessageCoreData z = z(messageIdType);
            if (z != null) {
                ((bdpt) this.f.b()).c(z, false);
                N(z);
            }
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

    public final MessageCoreData w(bdhg bdhgVar) {
        ekzz f = eleg.f("MessageDatabaseOperations#readMessageByRcsId");
        try {
            csix.h();
            MessageCoreData x = x(bdhgVar);
            if (x != null) {
                ((bdpt) this.f.b()).c(x, false);
                N(x);
            }
            f.close();
            return x;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final MessageCoreData x(bdhg bdhgVar) {
        ekzz f = eleg.f("MessageDatabaseOperations#readMessageDataByRcsId");
        try {
            String[] strArr = MessagesTable.a;
            buxz buxzVar = new buxz();
            buxzVar.O(bdhgVar);
            buxs buxsVar = new buxs(buxzVar);
            buxo d = MessagesTable.d();
            d.z("readMessageDataByRcsId");
            d.k(buxsVar);
            Stream map = Collection.EL.stream(d.b().y()).filter(new Predicate() { // from class: bdlk
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
                    return Objects.nonNull((MessagesTable.BindData) obj);
                }
            }).map(new Function() { // from class: bdll
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    MessageCoreData a2 = ((byzp) bdmq.this.e.b()).a();
                    a2.aM((MessagesTable.BindData) obj);
                    return a2;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            int i = engw.d;
            engw engwVar = (engw) map.collect(endq.a);
            if (engwVar.size() <= 1) {
                MessageCoreData messageCoreData = engwVar.isEmpty() ? null : (MessageCoreData) engwVar.get(0);
                f.close();
                return messageCoreData;
            }
            emyw.c(engwVar.size() == 2, "Violation of the unique rcs_message_id_and_seen_index on the MessagesTable", new Object[0]);
            cpxc cpxcVar = (cpxc) this.q.b();
            MessageCoreData messageCoreData2 = (MessageCoreData) engwVar.get(0);
            MessageCoreData messageCoreData3 = (MessageCoreData) engwVar.get(1);
            emxf.a(messageCoreData2.E().equals(messageCoreData3.E()));
            eqow a2 = messageCoreData2.B().a < messageCoreData3.B().a ? cpxc.a(messageCoreData2, messageCoreData3) : cpxc.a(messageCoreData3, messageCoreData2);
            akxl akxlVar = (akxl) cpxcVar.b.b();
            eolu eoluVar = (eolu) eolv.a.createBuilder();
            eolt eoltVar = eolt.DUPLICATE_RCS_MESSAGE_ID_EVENT;
            eoluVar.copyOnWrite();
            eolv eolvVar = (eolv) eoluVar.instance;
            eolvVar.j = eoltVar.dk;
            eolvVar.b = 1 | eolvVar.b;
            a2.copyOnWrite();
            eqpa eqpaVar = (eqpa) a2.instance;
            eqpa eqpaVar2 = eqpa.a;
            eqpaVar.g = 2;
            eqpaVar.b |= 16;
            eoluVar.copyOnWrite();
            eolv eolvVar2 = (eolv) eoluVar.instance;
            eqpa eqpaVar3 = (eqpa) a2.build();
            eqpaVar3.getClass();
            eolvVar2.bq = eqpaVar3;
            eolvVar2.f |= 131072;
            akxlVar.j(eoluVar);
            throw new IllegalStateException("Expected 1 message but found 2 with the same RCS message ID");
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final MessageCoreData y(final Uri uri) {
        MessageCoreData messageCoreData;
        ekzz f = eleg.f("MessageDatabaseOperations#readMessageNoParts Uri");
        try {
            csix.h();
            buxo d = MessagesTable.d();
            d.z("readMessageData1");
            d.h(new Function() { // from class: bdjy
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    buxz buxzVar = (buxz) obj;
                    cskc cskcVar = bdmq.a;
                    buxzVar.ab(uri);
                    return buxzVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            MessagesTable.BindData bindData = (MessagesTable.BindData) ((buuo) d.b().o()).cS();
            if (bindData != null) {
                messageCoreData = ((byzp) this.e.b()).a();
                messageCoreData.aM(bindData);
            } else {
                messageCoreData = null;
            }
            f.close();
            return messageCoreData;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final MessageCoreData z(MessageIdType messageIdType) {
        ekzz f = eleg.f("MessageDatabaseOperations#readMessageNoParts messageId");
        try {
            String[] strArr = MessagesTable.a;
            buxz buxzVar = new buxz();
            buxzVar.q(messageIdType);
            MessageCoreData A = A(new buxs(buxzVar));
            f.close();
            return A;
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
