package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import j$.time.Instant;
import j$.util.function.Function$CC;
import java.util.ArrayList;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cmky {
    private final cbgf a;

    public cmky(cbgf cbgfVar) {
        cbgfVar.getClass();
        this.a = cbgfVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Instant b(final bdhg bdhgVar, final String str) {
        String[] strArr = btza.a;
        btyv btyvVar = new btyv(btza.a);
        btyvVar.z("queryReceivedTimestamps");
        btyvVar.u();
        btyvVar.g(new Function() { // from class: cmkv
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                btyz btyzVar = (btyz) obj;
                btyzVar.b(bdhg.this);
                return btyzVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        buxo d = MessagesTable.d();
        d.f(new Function() { // from class: cmkw
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
        d.h(new Function() { // from class: cmke
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                buxz buxzVar = (buxz) obj;
                buxzVar.X(str);
                return buxzVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        btyvVar.G(dtvz.i(d.b(), MessagesTable.c.a, btza.c.a).g());
        engw y = btyvVar.b().y();
        y.getClass();
        ArrayList arrayList = new ArrayList();
        enqv it = y.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            dtro[] aG = ((btxp) it.next()).aG("messages", new MessagesTable.BindData[0]);
            aG.getClass();
            MessagesTable.BindData bindData = (MessagesTable.BindData) ffdo.H(aG);
            Long valueOf = bindData != null ? Long.valueOf(bindData.w()) : null;
            if (valueOf != null) {
                arrayList.add(valueOf);
            }
        }
        if (!arrayList.isEmpty()) {
            return Instant.ofEpochMilli(((Number) ffdx.G(arrayList)).longValue() + 1);
        }
        buxo d2 = MessagesTable.d();
        d2.z("timestampsByRcsMessageId");
        d2.f(new Function() { // from class: cmkf
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
        d2.h(new Function() { // from class: cmkg
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                buxz buxzVar = (buxz) obj;
                final bdhg bdhgVar2 = bdhgVar;
                buxzVar.b(new Function() { // from class: cmko
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        buxz buxzVar2 = (buxz) obj2;
                        buxzVar2.O(bdhg.this);
                        return buxzVar2;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }, new Function() { // from class: cmkp
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        buxz buxzVar2 = (buxz) obj2;
                        buxzVar2.G(bdhg.this);
                        return buxzVar2;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                buxzVar.X(str);
                return buxzVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        d2.x(1);
        buuo buuoVar = (buuo) d2.b().p(MessagesTable.c.i);
        try {
            engw y2 = buuoVar.y();
            buuoVar.close();
            y2.getClass();
            if (y2.isEmpty()) {
                return null;
            }
            return Instant.ofEpochMilli(((Number) ffdx.G(y2)).longValue() + 1);
        } catch (Throwable th) {
            try {
                buuoVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static final cmkx c(final bdhg bdhgVar, final String str) {
        String[] strArr = btza.a;
        btyv btyvVar = new btyv(btza.a);
        btyvVar.z("queryLatestEditVersion");
        btyvVar.e(new Function() { // from class: cmks
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                btyh btyhVar = (btyh) obj;
                return new btyi[]{btyhVar.b, btyhVar.d};
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        btyvVar.g(new Function() { // from class: cmkt
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                btyz btyzVar = (btyz) obj;
                btyzVar.b(bdhg.this);
                return btyzVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        btyvVar.x(1);
        buxo d = MessagesTable.d();
        d.u();
        d.h(new Function() { // from class: cmku
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                buxz buxzVar = (buxz) obj;
                buxzVar.X(str);
                buxzVar.B(false);
                return buxzVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        btyvVar.G(dtvz.i(d.b(), MessagesTable.c.a, btza.c.a).g());
        dtsu o = btyvVar.b().o();
        try {
            btyj btyjVar = (btyj) o;
            if (!btyjVar.moveToFirst()) {
                ffig.a(o, null);
                return null;
            }
            MessageIdType c = btyjVar.c();
            Instant f = btyjVar.f();
            f.getClass();
            cmkx cmkxVar = new cmkx(c, f);
            ffig.a(o, null);
            return cmkxVar;
        } finally {
        }
    }

    private final void d(ConversationIdType conversationIdType, MessageIdType messageIdType, MessageIdType messageIdType2) {
        String[] strArr = MessagesTable.a;
        buxr buxrVar = new buxr();
        buxrVar.ap("hideMessage");
        buxrVar.q(true);
        buxrVar.e(messageIdType);
        String[] strArr2 = bueg.a;
        bued buedVar = new bued();
        if (messageIdType2.equals(bdhb.a)) {
            buedVar.a.putNull("message_id");
        } else {
            buedVar.a.put("message_id", Long.valueOf(bdhb.a(messageIdType2)));
        }
        buedVar.c(messageIdType);
        String[] strArr3 = bumm.a;
        bumj bumjVar = new bumj();
        if (messageIdType2.equals(bdhb.a)) {
            bumjVar.a.putNull("message_id");
        } else {
            bumjVar.a.put("message_id", Long.valueOf(bdhb.a(messageIdType2)));
        }
        buml bumlVar = new buml();
        bumlVar.b(messageIdType);
        bumjVar.aj(new bumk(bumlVar), "message_star-buildAndUpdateForMessageId");
        String[] strArr4 = bufy.a;
        bufv bufvVar = new bufv();
        bufvVar.c(messageIdType2);
        bufx bufxVar = new bufx();
        bufxVar.b(messageIdType);
        bufvVar.ae(new bufw(bufxVar), "message_replies-buildAndUpdateForRepliedToMessageId");
        bufv bufvVar2 = new bufv();
        if (messageIdType2.equals(bdhb.a)) {
            bufvVar2.a.putNull("message_id");
        } else {
            bufvVar2.a.put("message_id", Long.valueOf(bdhb.a(messageIdType2)));
        }
        bufx bufxVar2 = new bufx();
        bufxVar2.aq(new dtrt("message_replies.message_id", 1, Long.valueOf(bdhb.a(messageIdType))));
        bufvVar2.aj(new bufw(bufxVar2), "message_replies-buildAndUpdateForMessageId");
        this.a.l(conversationIdType, messageIdType, new String[0]);
    }

    public final void a(ConversationIdType conversationIdType, MessageIdType messageIdType, final String str, final bdhg bdhgVar, Instant instant, Instant instant2, cmkx cmkxVar) {
        Object apply;
        MessageIdType messageIdType2;
        if (cmkxVar == null || !cmkxVar.b.isAfter(instant)) {
            String[] strArr = btza.a;
            btyx btyxVar = new btyx();
            btyxVar.ap("updateLatestMessageId");
            if (messageIdType.equals(bdhb.a)) {
                btyxVar.a.putNull("latest_message_id");
            } else {
                btyxVar.a.put("latest_message_id", Long.valueOf(bdhb.a(messageIdType)));
            }
            apply = new Function() { // from class: cmkd
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    btyz btyzVar = (btyz) obj;
                    String[] strArr2 = btza.a;
                    btyv btyvVar = new btyv(btza.a);
                    btyvVar.f(new Function() { // from class: cmkj
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo448andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj2) {
                            return ((btyh) obj2).a;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    final bdhg bdhgVar2 = bdhg.this;
                    btyvVar.g(new Function() { // from class: cmkk
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo448andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj2) {
                            btyz btyzVar2 = (btyz) obj2;
                            btyzVar2.b(bdhg.this);
                            return btyzVar2;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    buxo d = MessagesTable.d();
                    d.u();
                    final String str2 = str;
                    d.h(new Function() { // from class: cmkl
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo448andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj2) {
                            buxz buxzVar = (buxz) obj2;
                            buxzVar.X(str2);
                            return buxzVar;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    btyvVar.G(dtvz.i(d.b(), MessagesTable.c.a, btza.c.a).g());
                    btyzVar.aq(new dtru("message_edits.message_id", 3, btyvVar.b()));
                    return btyzVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }.apply(new btyz());
            btyxVar.af(new btyy((btyz) apply));
            btyxVar.b().e();
            if (cmkxVar != null) {
                d(conversationIdType, cmkxVar.a, messageIdType);
            } else {
                buxo d = MessagesTable.d();
                d.z("insertOriginalMessageIfPresent");
                d.e(new Function() { // from class: cmkh
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        buum buumVar = (buum) obj;
                        return new buun[]{buumVar.b, buumVar.a, buumVar.i};
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                d.h(new Function() { // from class: cmki
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        buxz buxzVar = (buxz) obj;
                        final bdhg bdhgVar2 = bdhgVar;
                        buxzVar.b(new Function() { // from class: cmkq
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo448andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj2) {
                                buxz buxzVar2 = (buxz) obj2;
                                buxzVar2.O(bdhg.this);
                                return buxzVar2;
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        }, new Function() { // from class: cmkr
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo448andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj2) {
                                buxz buxzVar2 = (buxz) obj2;
                                buxzVar2.G(bdhg.this);
                                return buxzVar2;
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        });
                        buxzVar.X(str);
                        buxzVar.B(false);
                        return buxzVar;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                d.x(1);
                dtsu o = d.b().o();
                try {
                    buuo buuoVar = (buuo) o;
                    if (buuoVar.moveToFirst()) {
                        btxu btxuVar = new btxu();
                        btxuVar.e(buuoVar.q());
                        btxuVar.d(messageIdType);
                        btxuVar.f(bdhgVar);
                        btxuVar.c(Instant.ofEpochMilli(-1L));
                        btxuVar.g(Instant.ofEpochMilli(buuoVar.l()));
                        btxuVar.b();
                        d(buuoVar.p(), buuoVar.q(), messageIdType);
                    }
                    ffig.a(o, null);
                } finally {
                }
            }
            messageIdType2 = messageIdType;
        } else {
            messageIdType2 = cmkxVar.a;
        }
        String[] strArr2 = btza.a;
        btxu btxuVar2 = new btxu();
        btxuVar2.e(messageIdType);
        btxuVar2.d(messageIdType2);
        btxuVar2.f(bdhgVar);
        btxuVar2.c(instant);
        btxuVar2.g(instant2);
        btxuVar2.b();
    }
}
