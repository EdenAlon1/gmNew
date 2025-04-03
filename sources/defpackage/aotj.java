package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;
import j$.util.function.Function$CC;
import java.util.concurrent.Callable;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class aotj {
    public final errl a;
    public final aozw b;

    public aotj(errl errlVar, boolean z) {
        this.a = errlVar;
        this.b = new aozw(z);
    }

    final buxm a(final BugleConversationId bugleConversationId, final aott aottVar, int i) {
        buxo d = MessagesTable.d();
        d.z("getIdsBeforeKeyQuery");
        d.f(new Function() { // from class: aosn
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
        d.h(new Function() { // from class: aoso
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                buxz buxzVar = (buxz) obj;
                aozw.b(buxzVar, BugleConversationId.this);
                aozw.d(buxzVar, aottVar);
                return buxzVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        d.d((buxl[]) apam.a.c.toArray(new buxl[0]));
        d.x(i);
        return this.b.a(d).b();
    }

    final buxm b(BugleConversationId bugleConversationId, int i, int i2) {
        buxo d = d(bugleConversationId, i, i2);
        d.d((buxl[]) apam.a.b.toArray(new buxl[0]));
        return d.b();
    }

    public final buxo c(final BugleConversationId bugleConversationId, final aott aottVar, int i) {
        buxo d = MessagesTable.d();
        d.z("getIdsAfterKeyQueryInternal");
        d.f(new Function() { // from class: aote
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
        d.h(new Function() { // from class: aotf
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                buxz buxzVar = (buxz) obj;
                aozw.b(buxzVar, BugleConversationId.this);
                aozw.c(buxzVar, aottVar);
                return buxzVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        d.d((buxl[]) apam.a.b.toArray(new buxl[0]));
        d.x(i);
        return this.b.a(d);
    }

    public final buxo d(final BugleConversationId bugleConversationId, int i, int i2) {
        buxo d = MessagesTable.d();
        d.z("getIdsWithOffsetLimitQuery");
        d.f(new Function() { // from class: aosl
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
        d.h(new Function() { // from class: aosm
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                buxz buxzVar = (buxz) obj;
                aozw.b(buxzVar, BugleConversationId.this);
                return buxzVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        d.x(i2);
        buxo a = this.b.a(d);
        if (i > 0) {
            a.A(i);
        }
        return a;
    }

    final elfl e(final BugleConversationId bugleConversationId, final MessageIdType messageIdType, final long j, final long j2, final boolean z) {
        return elfo.g(new Callable() { // from class: aosz
            @Override // java.util.concurrent.Callable
            public final Object call() {
                buxo d = MessagesTable.d();
                d.z("partOffsetQuery");
                d.u();
                d.n(new dtzr("COUNT(*)"), "count");
                bwdf c = PartsTable.c();
                c.f(new Function() { // from class: aosu
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
                d.G(dtvz.i(c.b(), PartsTable.d.b, MessagesTable.c.a).g());
                final BugleConversationId bugleConversationId2 = BugleConversationId.this;
                final long j3 = j2;
                final MessageIdType messageIdType2 = messageIdType;
                final long j4 = j;
                if (z) {
                    d.h(new Function() { // from class: aosv
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo448andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            buxz buxzVar = (buxz) obj;
                            aozw.b(buxzVar, BugleConversationId.this);
                            final long j5 = j3;
                            final MessageIdType messageIdType3 = messageIdType2;
                            final long j6 = j4;
                            buxzVar.b(new Function() { // from class: aotb
                                @Override // java.util.function.Function
                                /* renamed from: andThen */
                                public final /* synthetic */ Function mo448andThen(Function function) {
                                    return Function$CC.$default$andThen(this, function);
                                }

                                @Override // java.util.function.Function
                                public final Object apply(Object obj2) {
                                    return apam.a.d.a((buxz) obj2, Long.valueOf(j5));
                                }

                                public final /* synthetic */ Function compose(Function function) {
                                    return Function$CC.$default$compose(this, function);
                                }
                            }, new Function() { // from class: aotc
                                @Override // java.util.function.Function
                                /* renamed from: andThen */
                                public final /* synthetic */ Function mo448andThen(Function function) {
                                    return Function$CC.$default$andThen(this, function);
                                }

                                @Override // java.util.function.Function
                                public final Object apply(Object obj2) {
                                    Object a = apam.a.e.a((buxz) obj2, Long.valueOf(j5));
                                    ((buxz) a).w(messageIdType3.a);
                                    return a;
                                }

                                public final /* synthetic */ Function compose(Function function) {
                                    return Function$CC.$default$compose(this, function);
                                }
                            }, new Function() { // from class: aotd
                                @Override // java.util.function.Function
                                /* renamed from: andThen */
                                public final /* synthetic */ Function mo448andThen(Function function) {
                                    return Function$CC.$default$andThen(this, function);
                                }

                                @Override // java.util.function.Function
                                public final Object apply(Object obj2) {
                                    Object a = apam.a.e.a((buxz) obj2, Long.valueOf(j5));
                                    ((buxz) a).q(messageIdType3);
                                    ((duav) a).as(new dtzq("$V{J:parts} < $V", new Object[]{PartsTable.d.a, Long.valueOf(j6)}));
                                    return a;
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
                } else {
                    d.h(new Function() { // from class: aosw
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo448andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            buxz buxzVar = (buxz) obj;
                            aozw.b(buxzVar, BugleConversationId.this);
                            final long j5 = j3;
                            final MessageIdType messageIdType3 = messageIdType2;
                            final long j6 = j4;
                            buxzVar.b(new Function() { // from class: aoti
                                @Override // java.util.function.Function
                                /* renamed from: andThen */
                                public final /* synthetic */ Function mo448andThen(Function function) {
                                    return Function$CC.$default$andThen(this, function);
                                }

                                @Override // java.util.function.Function
                                public final Object apply(Object obj2) {
                                    return apam.a.f.a((buxz) obj2, Long.valueOf(j5));
                                }

                                public final /* synthetic */ Function compose(Function function) {
                                    return Function$CC.$default$compose(this, function);
                                }
                            }, new Function() { // from class: aosj
                                @Override // java.util.function.Function
                                /* renamed from: andThen */
                                public final /* synthetic */ Function mo448andThen(Function function) {
                                    return Function$CC.$default$andThen(this, function);
                                }

                                @Override // java.util.function.Function
                                public final Object apply(Object obj2) {
                                    Object a = apam.a.e.a((buxz) obj2, Long.valueOf(j5));
                                    ((buxz) a).s(messageIdType3.a);
                                    return a;
                                }

                                public final /* synthetic */ Function compose(Function function) {
                                    return Function$CC.$default$compose(this, function);
                                }
                            }, new Function() { // from class: aosk
                                @Override // java.util.function.Function
                                /* renamed from: andThen */
                                public final /* synthetic */ Function mo448andThen(Function function) {
                                    return Function$CC.$default$andThen(this, function);
                                }

                                @Override // java.util.function.Function
                                public final Object apply(Object obj2) {
                                    Object a = apam.a.e.a((buxz) obj2, Long.valueOf(j5));
                                    ((buxz) a).q(messageIdType3);
                                    ((duav) a).as(new dtzq("$V{J:parts} > $V", new Object[]{PartsTable.d.a, Long.valueOf(j6)}));
                                    return a;
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
                }
                buuo buuoVar = (buuo) d.b().o();
                try {
                    if (!buuoVar.moveToNext()) {
                        throw new IllegalStateException("cannot determine the absolute offset of a message part");
                    }
                    Integer valueOf = Integer.valueOf(Integer.parseInt(buuoVar.dd("count")));
                    buuoVar.close();
                    return valueOf;
                } finally {
                }
            }
        }, this.a);
    }
}
