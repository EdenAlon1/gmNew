package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.scheduledsend.database.ScheduledSendTable;
import j$.util.DesugarArrays;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class aglz {
    public static ahgc k(ahgc ahgcVar, ctsx ctsxVar, boolean z, cqoh cqohVar) {
        if (z) {
            ahgcVar.c(new ahfz(ahgi.c.b, true), new ahfz(ahgi.c.a, true));
            return ahgcVar;
        }
        if (!ctjd.e()) {
            ahfw ahfwVar = ahgi.c;
            ahgcVar.c(new ahfz(ahgi.c.d, true), new ahfz(ahfwVar.b, true), new ahfz(ahfwVar.a, true));
            return ahgcVar;
        }
        ahfx ahfxVar = ahgi.c.b;
        ahfw ahfwVar2 = ahgi.c;
        bpzt.a(ahgcVar, true, ctsxVar, cqohVar, ahfxVar, ahfwVar2.c, ahfwVar2.a, ahfwVar2.d);
        return ahgcVar;
    }

    public static void m(ahgc ahgcVar, final agzh agzhVar, cqoh cqohVar) {
        if (((afcr) agzhVar).d) {
            ahgcVar.e(new Function() { // from class: aglt
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    ahgh ahghVar = (ahgh) obj;
                    final agzh agzhVar2 = agzh.this;
                    ahghVar.b(new Function() { // from class: aglp
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo448andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj2) {
                            ahgh ahghVar2 = (ahgh) obj2;
                            ahghVar2.g(((afcr) agzh.this).a);
                            return ahghVar2;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    }, new Function() { // from class: aglq
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo448andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj2) {
                            afcr afcrVar = (afcr) agzh.this;
                            ahgh ahghVar2 = (ahgh) obj2;
                            ahghVar2.f(afcrVar.a);
                            ahghVar2.c(afcrVar.b.a);
                            return ahghVar2;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    return ahghVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
        } else {
            if (!ctjd.e()) {
                ahgcVar.e(new Function() { // from class: aglv
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        ahgh ahghVar = (ahgh) obj;
                        final agzh agzhVar2 = agzh.this;
                        ahghVar.b(new Function() { // from class: agkq
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo448andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj2) {
                                ahgh ahghVar2 = (ahgh) obj2;
                                ahghVar2.as(agzf.b(((afcr) agzh.this).c));
                                return ahghVar2;
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        }, new Function() { // from class: aglb
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo448andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj2) {
                                afcr afcrVar = (afcr) agzh.this;
                                ahgh ahghVar2 = (ahgh) obj2;
                                ahghVar2.as(agzf.a(afcrVar.c));
                                ahghVar2.g(afcrVar.a);
                                return ahghVar2;
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        }, new Function() { // from class: aglm
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo448andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj2) {
                                afcr afcrVar = (afcr) agzh.this;
                                ahgh ahghVar2 = (ahgh) obj2;
                                ahghVar2.as(agzf.a(afcrVar.c));
                                ahghVar2.f(afcrVar.a);
                                ahghVar2.c(afcrVar.b.a);
                                return ahghVar2;
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        });
                        return ahghVar;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                return;
            }
            final dtzj p = p(agzhVar, ">", cqohVar);
            final dtzj p2 = p(agzhVar, "=", cqohVar);
            ahgcVar.e(new Function() { // from class: aglu
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    ahgh ahghVar = (ahgh) obj;
                    final agzh agzhVar2 = agzh.this;
                    final dtzj dtzjVar = p;
                    final dtzj dtzjVar2 = p2;
                    ahghVar.b(new Function() { // from class: aglj
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo448andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj2) {
                            ahgh ahghVar2 = (ahgh) obj2;
                            ahghVar2.as(agzf.b(((afcr) agzh.this).c));
                            return ahghVar2;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    }, new Function() { // from class: aglk
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo448andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj2) {
                            ahgh ahghVar2 = (ahgh) obj2;
                            ahghVar2.as(agzf.a(((afcr) agzh.this).c));
                            ahghVar2.as(dtzjVar);
                            return ahghVar2;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    }, new Function() { // from class: agll
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo448andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj2) {
                            afcr afcrVar = (afcr) agzh.this;
                            ahgh ahghVar2 = (ahgh) obj2;
                            ahghVar2.as(agzf.a(afcrVar.c));
                            ahghVar2.as(dtzjVar2);
                            ahghVar2.c(afcrVar.b.a);
                            return ahghVar2;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    return ahghVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
        }
    }

    private static agkk n(ahga ahgaVar, ctsx ctsxVar, boolean z, cqoh cqohVar) {
        String[] strArr = agkp.a;
        agko agkoVar = new agko();
        agkoVar.aq(new dtru("conversations._id", 3, ahgaVar));
        agkm a = agkp.a();
        a.z("makeBuilder");
        a.n(bflb.f, "conversation_contains_vsms_participant");
        a.n(bflb.g, "earliest_reminder_trigger_time");
        a.n(cogw.a, "scheduled_messages_count");
        a.n(cbem.a, "unread_message_count");
        coil b = ScheduledSendTable.b().b();
        cohz cohzVar = ScheduledSendTable.c.c;
        agkh agkhVar = agkp.b.a;
        coit coitVar = new coit();
        coitVar.as(bpzs.e(agkp.b.a));
        dtvy s = b.s(cohzVar, agkhVar, new cois(coitVar));
        ((dtrd) s).e = "scheduled_send_nudge";
        a.G(s.g());
        String[] strArr2 = bvin.a;
        bvik bvikVar = new bvik(bvin.a);
        bvikVar.c(bvin.c.a);
        dtvy i = dtvz.i(bvikVar.b(), bvin.c.a, agkp.b.a);
        ((dtrd) i).e = "parental_approval_join_tag";
        a.G(i.g());
        if (ddjr.c()) {
            bxcm b2 = bxct.c().b();
            bxbz bxbzVar = bxct.c.c;
            agkh agkhVar2 = agkp.b.a;
            bxcs bxcsVar = new bxcs();
            agkg agkgVar = agkp.b;
            bxcsVar.as(bpzs.d(agkgVar.a, agkgVar.e, cqohVar));
            dtvy s2 = b2.s(bxbzVar, agkhVar2, new bxcr(bxcsVar));
            ((dtrd) s2).e = "reminder_nudge";
            a.G(s2.g());
        }
        btvr b3 = btvy.a().b();
        btvg btvgVar = btvy.c.b;
        agkh agkhVar3 = agkp.b.d;
        btvx btvxVar = new btvx();
        btvxVar.b(fbrc.NUDGE_CLASSIFICATION);
        agkg agkgVar2 = agkp.b;
        btvxVar.as(bpzs.b(agkgVar2.e, agkgVar2.c, ctsxVar, cqohVar));
        dtvy s3 = b3.s(btvgVar, agkhVar3, new btvt(btvxVar));
        ((dtrd) s3).e = "nudge_classification";
        a.G(s3.g());
        brbm b4 = brbs.a().b();
        bray brayVar = brbs.c.b;
        agkh agkhVar4 = agkp.b.a;
        brbr brbrVar = new brbr();
        brbrVar.c(axcl.CONVERSATION_CLASSIFICATION_TYPE_BIRTHDAY);
        brbrVar.b(axcj.CONVERSATION_CLASSIFICATION_STATE_DISMISSED);
        brbrVar.as(bpzs.c(agkp.b.a, cqohVar, ctsxVar));
        dtvy s4 = b4.s(brayVar, agkhVar4, new brbq(brbrVar));
        ((dtrd) s4).e = "conversation_classification_type";
        a.G(s4.g());
        a.o(bflb.e, bflb.d);
        a.o(bflb.c, ((Boolean) ((cfup) stl.l.get()).e()).booleanValue() ? bflb.b : "0");
        if (cgma.a()) {
            a.n(cgly.a, "conversation_contains_matrix_participant");
        }
        a.k(new agkn(agkoVar));
        if (z) {
            a.c(new agkj(agkp.b.b), new agkj(agkp.b.a));
        } else if (ctjd.e()) {
            agkh agkhVar5 = agkp.b.b;
            agkg agkgVar3 = agkp.b;
            bpzt.a(a, false, ctsxVar, cqohVar, agkhVar5, agkgVar3.c, agkgVar3.a, ahgi.c.d);
        } else {
            agkg agkgVar4 = agkp.b;
            a.c(new agkj(agkp.b.f), new agkj(agkgVar4.b), new agkj(agkgVar4.a));
        }
        a.z("Bugle.D26R.Query.SuperSortQueryPaged.Duration");
        return a.b();
    }

    private final ahgc o(agzh agzhVar, cqoh cqohVar) {
        ahgc r = r(agzhVar, 1, cqohVar);
        m(r, agzhVar, cqohVar);
        return r;
    }

    private static dtzj p(agzh agzhVar, String str, cqoh cqohVar) {
        ahfx ahfxVar = ahgi.c.b;
        ahfw ahfwVar = ahgi.c;
        afcr afcrVar = (afcr) agzhVar;
        return new dtzr(dtzi.a(bpzs.f(ahfxVar, ahfwVar.c, ahfwVar.a, afcrVar.f, cqohVar)) + str + afcrVar.a);
    }

    private static boolean q(Boolean bool) {
        if (bool == null) {
            return false;
        }
        bool.booleanValue();
        return true;
    }

    private final ahgc r(agzh agzhVar, int i, cqoh cqohVar) {
        afcr afcrVar = (afcr) agzhVar;
        int i2 = afcrVar.e;
        ahgc l = l();
        l.x(i2);
        if (i == 1) {
            return k(l, afcrVar.f, afcrVar.d, cqohVar);
        }
        ctsx ctsxVar = afcrVar.f;
        if (afcrVar.d) {
            l.c(new ahfz(ahgi.c.b, false), new ahfz(ahgi.c.a, false));
            return l;
        }
        if (!ctjd.e()) {
            ahfw ahfwVar = ahgi.c;
            l.c(new ahfz(ahgi.c.d, false), new ahfz(ahfwVar.b, false), new ahfz(ahfwVar.a, false));
            return l;
        }
        ahfx ahfxVar = ahgi.c.b;
        ahfw ahfwVar2 = ahgi.c;
        bpzt.a(l, false, ctsxVar, cqohVar, ahfxVar, ahfwVar2.c, ahfwVar2.a, ahfwVar2.d);
        return l;
    }

    public abstract Boolean a();

    public abstract Boolean b();

    public abstract Boolean c();

    public abstract Boolean d();

    public abstract Boolean e();

    public abstract Boolean f();

    public final agkk g(agzh agzhVar, cqoh cqohVar) {
        ahga b = r(agzhVar, 2, cqohVar).b();
        afcr afcrVar = (afcr) agzhVar;
        return n(b, afcrVar.f, afcrVar.d, cqohVar);
    }

    public final agkk h(agzh agzhVar, cqoh cqohVar) {
        afcr afcrVar = (afcr) agzhVar;
        boolean z = afcrVar.d;
        final ConversationIdType conversationIdType = afcrVar.b;
        final long j = afcrVar.a;
        ahgc r = r(agzhVar, 2, cqohVar);
        if (z) {
            r.e(new Function() { // from class: agkt
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    ahgh ahghVar = (ahgh) obj;
                    final long j2 = j;
                    final ConversationIdType conversationIdType2 = conversationIdType;
                    ahghVar.b(new Function() { // from class: agle
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo448andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj2) {
                            ahgh ahghVar2 = (ahgh) obj2;
                            ahghVar2.h(j2);
                            return ahghVar2;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    }, new Function() { // from class: aglf
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo448andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj2) {
                            ahgh ahghVar2 = (ahgh) obj2;
                            ahghVar2.f(j2);
                            ahghVar2.d(conversationIdType2.a);
                            return ahghVar2;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    return ahghVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
        } else {
            final boolean z2 = afcrVar.c;
            if (ctjd.e()) {
                final dtzj p = p(agzhVar, "<", cqohVar);
                final dtzj p2 = p(agzhVar, "=", cqohVar);
                r.e(new Function() { // from class: agku
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        ahgh ahghVar = (ahgh) obj;
                        final boolean z3 = z2;
                        final dtzj dtzjVar = p;
                        final dtzj dtzjVar2 = p2;
                        final ConversationIdType conversationIdType2 = conversationIdType;
                        ahghVar.b(new Function() { // from class: aglg
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo448andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj2) {
                                ahgh ahghVar2 = (ahgh) obj2;
                                ahghVar2.as(agzf.c(z3));
                                return ahghVar2;
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        }, new Function() { // from class: aglh
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo448andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj2) {
                                ahgh ahghVar2 = (ahgh) obj2;
                                ahghVar2.as(agzf.a(z3));
                                ahghVar2.as(dtzjVar);
                                return ahghVar2;
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        }, new Function() { // from class: agli
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo448andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj2) {
                                ahgh ahghVar2 = (ahgh) obj2;
                                ahghVar2.as(agzf.a(z3));
                                ahghVar2.as(dtzjVar2);
                                ahghVar2.d(conversationIdType2.a);
                                return ahghVar2;
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        });
                        return ahghVar;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
            } else {
                r.e(new Function() { // from class: agkv
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        ahgh ahghVar = (ahgh) obj;
                        final boolean z3 = z2;
                        final long j2 = j;
                        final ConversationIdType conversationIdType2 = conversationIdType;
                        ahghVar.b(new Function() { // from class: agkw
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo448andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj2) {
                                ahgh ahghVar2 = (ahgh) obj2;
                                ahghVar2.as(agzf.c(z3));
                                return ahghVar2;
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        }, new Function() { // from class: agkx
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo448andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj2) {
                                ahgh ahghVar2 = (ahgh) obj2;
                                ahghVar2.as(agzf.a(z3));
                                ahghVar2.h(j2);
                                return ahghVar2;
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        }, new Function() { // from class: agky
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo448andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj2) {
                                ahgh ahghVar2 = (ahgh) obj2;
                                ahghVar2.as(agzf.a(z3));
                                ahghVar2.f(j2);
                                ahghVar2.d(conversationIdType2.a);
                                return ahghVar2;
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        });
                        return ahghVar;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
            }
        }
        return n(r.b(), afcrVar.f, afcrVar.d, cqohVar);
    }

    public final agkk i(agzh agzhVar, cqoh cqohVar) {
        ahgc r;
        afcq afcqVar = new afcq(agzhVar);
        afcr afcrVar = (afcr) agzhVar;
        int i = afcrVar.e;
        int i2 = i / 2;
        afcqVar.d(i2);
        ahgc o = o(afcqVar.a(), cqohVar);
        afcq afcqVar2 = new afcq(agzhVar);
        afcqVar2.d(i - i2);
        final agzh a = afcqVar2.a();
        if (((afcr) a).d) {
            r = r(a, 2, cqohVar);
            r.e(new Function() { // from class: agkz
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    ahgh ahghVar = (ahgh) obj;
                    final agzh agzhVar2 = agzh.this;
                    ahghVar.b(new Function() { // from class: aglr
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo448andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj2) {
                            ahgh ahghVar2 = (ahgh) obj2;
                            ahghVar2.h(((afcr) agzh.this).a);
                            return ahghVar2;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    }, new Function() { // from class: agls
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo448andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj2) {
                            afcr afcrVar2 = (afcr) agzh.this;
                            ahgh ahghVar2 = (ahgh) obj2;
                            ahghVar2.f(afcrVar2.a);
                            ahghVar2.aq(new dtwe("conversations._id", 10, Long.valueOf(afcrVar2.b.a)));
                            return ahghVar2;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    return ahghVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
        } else if (ctjd.e()) {
            final dtzj p = p(a, "<=", cqohVar);
            ahgc r2 = r(a, 2, cqohVar);
            String[] strArr = ahgi.a;
            ahgh ahghVar = new ahgh();
            ahghVar.b(new Function() { // from class: agla
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    ahgh ahghVar2 = (ahgh) obj;
                    ahghVar2.as(agzf.c(((afcr) agzh.this).c));
                    return ahghVar2;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }, new Function() { // from class: aglc
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    ahgh ahghVar2 = (ahgh) obj;
                    ahghVar2.as(agzf.a(((afcr) agzh.this).c));
                    ahghVar2.as(p);
                    return ahghVar2;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            r2.d(ahghVar);
            r = r2;
        } else {
            r = r(a, 2, cqohVar);
            r.e(new Function() { // from class: agld
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    ahgh ahghVar2 = (ahgh) obj;
                    final agzh agzhVar2 = agzh.this;
                    ahghVar2.b(new Function() { // from class: agln
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo448andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj2) {
                            ahgh ahghVar3 = (ahgh) obj2;
                            ahghVar3.as(agzf.c(((afcr) agzh.this).c));
                            return ahghVar3;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    }, new Function() { // from class: aglo
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo448andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj2) {
                            afcr afcrVar2 = (afcr) agzh.this;
                            ahgh ahghVar3 = (ahgh) obj2;
                            ahghVar3.as(agzf.a(afcrVar2.c));
                            ahghVar3.aq(new dtwe("conversations.sort_timestamp", 10, Long.valueOf(afcrVar2.a)));
                            return ahghVar3;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    return ahghVar2;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
        }
        o.p(r.b());
        return n(o.b(), afcrVar.f, afcrVar.d, cqohVar);
    }

    public final agkk j(agzh agzhVar, cqoh cqohVar) {
        ahga b = o(agzhVar, cqohVar).b();
        afcr afcrVar = (afcr) agzhVar;
        return n(b, afcrVar.f, afcrVar.d, cqohVar);
    }

    public final ahgc l() {
        String[] strArr = ahgi.a;
        ahgc ahgcVar = new ahgc(ahgi.a);
        ahgcVar.z("newInnerQueryBuilderNoLimitNoOrder");
        ahfx[] ahfxVarArr = {ahgi.c.a};
        int intValue = ahgi.b().intValue();
        if (((Integer) ahgi.b.getOrDefault(ahfxVarArr[0].toString(), -1)).intValue() > intValue) {
            dtub.w("columnReference.toString()", intValue);
        }
        ahgcVar.m(ahfxVarArr);
        ahgh ahghVar = new ahgh();
        int intValue2 = ahgi.b().intValue();
        if (intValue2 < 29020) {
            dtub.w("delete_timestamp", intValue2);
        }
        ahghVar.aq(new dtwe("conversations.delete_timestamp", 1, 0L));
        if (q(a())) {
            ahghVar.aq(new dtrw("conversations.archive_status", 3, ahgh.at((Iterable) DesugarArrays.stream(new byyt[]{byyt.ARCHIVED, byyt.KEEP_ARCHIVED}).map(new Function() { // from class: ahgg
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return Integer.valueOf(((byyt) obj).h);
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }).collect(Collectors.toCollection(new Supplier() { // from class: ahgf
                @Override // java.util.function.Supplier
                public final Object get() {
                    return new ArrayList();
                }
            }))), true));
        }
        if (q(b())) {
            byyt byytVar = byyt.UNARCHIVED;
            ahghVar.aq(new dtwe("conversations.archive_status", 1, Integer.valueOf(byytVar == null ? 0 : byytVar.h)));
        }
        if (q(f())) {
            ahghVar.aq(new dtrw("conversations.archive_status", 3, ahgh.at((Iterable) enqc.a(byyt.g).map(new Function() { // from class: ahge
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return Integer.valueOf(((byyt) obj).h);
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }).collect(Collectors.toCollection(new Supplier() { // from class: ahgf
                @Override // java.util.function.Supplier
                public final Object get() {
                    return new ArrayList();
                }
            }))), true));
        }
        if (q(e())) {
            int intValue3 = ahgi.b().intValue();
            if (intValue3 < 12001) {
                dtub.w("has_ea2p_bot_recipient", intValue3);
            }
            ahghVar.aq(new dtwe("conversations.has_ea2p_bot_recipient", 2, 1));
        }
        if (((Boolean) ((cfup) ctjd.ak.get()).e()).booleanValue() && q(d())) {
            ahghVar.b(new Function() { // from class: aglw
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    ahgh ahghVar2 = (ahgh) obj;
                    ahghVar2.e();
                    return ahghVar2;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }, new Function() { // from class: aglx
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    ahgh ahghVar2 = (ahgh) obj;
                    ahghVar2.aq(new dtrt("conversations.participant_normalized_destination", 2, "+18339913448"));
                    return ahghVar2;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
        }
        if (asma.a() && q(c())) {
            ahghVar.b(new Function() { // from class: agkr
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    ahgh ahghVar2 = (ahgh) obj;
                    ahghVar2.e();
                    return ahghVar2;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }, new Function() { // from class: agks
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    ahgh ahghVar2 = (ahgh) obj;
                    ahghVar2.aq(new dtrw("conversations.participant_normalized_destination", 4, ahgh.av("EMERGENCY+SERVICE+PROVIDER", "EMERGENCY+SERVICE+PROVIDER+DEMO"), false));
                    return ahghVar2;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
        }
        ahgcVar.d(ahghVar);
        ahgcVar.v(ahgi.c.a);
        return ahgcVar;
    }
}
