package defpackage;

import android.content.ContentValues;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.Collection;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class amtz extends ceut {
    public final ffbr a;
    private final dtuu b;

    public amtz(dtuu dtuuVar, ffbr ffbrVar) {
        this.b = dtuuVar;
        this.a = ffbrVar;
    }

    @Override // defpackage.ceve
    public final ekzz b() {
        return eleg.f("CreateOrUpdateLighterConversationHandler");
    }

    @Override // defpackage.ceve
    public final eyhz d() {
        return amts.a.getParserForType();
    }

    @Override // defpackage.ceut
    protected final /* bridge */ /* synthetic */ elfl j(ceuw ceuwVar, eyhs eyhsVar) {
        final amts amtsVar = (amts) eyhsVar;
        if (((Boolean) this.a.b()).booleanValue()) {
            int i = amtsVar.b;
            if ((i & 2) == 0 || (i & 1) == 0 || (i & 1024) == 0) {
                throw new IllegalStateException("Cannot create or update a conversation without LighterConversationId, BusinessId, SyncTimestamp.");
            }
        }
        this.b.d("LighterConversationManager#createConversation", new Runnable() { // from class: amtv
            @Override // java.lang.Runnable
            public final void run() {
                Object apply;
                cskc cskcVar = amtz.D;
                final amts amtsVar2 = amtsVar;
                cskcVar.m("Updating Lighter conversation with business_id:".concat(String.valueOf(amtsVar2.c)));
                final String str = amtsVar2.c;
                btmp a = btmu.a();
                a.z("CreateOrUpdateLighterConversationHandler#getExistingConversation");
                a.c(new Function() { // from class: amtt
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        btmt btmtVar = (btmt) obj;
                        btmtVar.b(str);
                        return btmtVar;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                apply = new Function() { // from class: amtu
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return ((btly) obj).b;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }.apply(btmu.c);
                btlz[] btlzVarArr = {(btlz) apply};
                int intValue = btmu.c().intValue();
                if (((Integer) btmu.b.getOrDefault(btlzVarArr[0].toString(), -1)).intValue() > intValue) {
                    dtub.w("columnReference.toString()", intValue);
                }
                a.m(btlzVarArr);
                btma btmaVar = (btma) a.b().p(btmu.c.b);
                try {
                    engw c = btmaVar.c();
                    amtz amtzVar = amtz.this;
                    btmaVar.close();
                    final ConversationIdType conversationIdType = (ConversationIdType) Collection.EL.stream(c).findFirst().orElse(bdgq.a);
                    if (conversationIdType.b()) {
                        if (!((Boolean) amtzVar.a.b()).booleanValue()) {
                            int i2 = amtsVar2.b;
                            if ((i2 & 2) == 0 || (i2 & 1) == 0) {
                                throw new IllegalStateException("Cannot create a conversation without LighterConversationId or BusinessId.");
                            }
                        }
                        String[] strArr = bsom.a;
                        bsem bsemVar = new bsem();
                        bsemVar.as(new cpxu());
                        bsemVar.Y(1);
                        bsemVar.av(4);
                        bsemVar.c(byyt.UNARCHIVED);
                        bsemVar.i(0);
                        if ((amtsVar2.b & 4) != 0) {
                            bsemVar.M(amtsVar2.e);
                        }
                        if ((amtsVar2.b & 8) != 0) {
                            bsemVar.at(amtsVar2.f);
                        }
                        if ((amtsVar2.b & 16) != 0) {
                            bsemVar.A(emxe.a(amtsVar2.g));
                        }
                        int i3 = amtsVar2.b;
                        if ((i3 & 32) != 0) {
                            bsemVar.au(amtsVar2.h);
                        } else if ((i3 & 512) != 0) {
                            bsemVar.au(amtsVar2.l);
                        }
                        if ((amtsVar2.b & 256) != 0) {
                            bsemVar.c(amtsVar2.k ? byyt.BLOCKED_FOLDER : byyt.UNARCHIVED);
                        }
                        ConversationIdType D = bsemVar.a().D();
                        btle btleVar = new btle();
                        btleVar.c(D);
                        if (((Boolean) amtzVar.a.b()).booleanValue()) {
                            btleVar.b(amtsVar2.c);
                            btleVar.e(amtsVar2.d);
                            btleVar.g(amtsVar2.m);
                        } else {
                            if ((amtsVar2.b & 1) != 0) {
                                btleVar.b(amtsVar2.c);
                            }
                            if ((amtsVar2.b & 2) != 0) {
                                btleVar.e(amtsVar2.d);
                            }
                        }
                        if ((amtsVar2.b & 64) != 0) {
                            btleVar.f(amtsVar2.i);
                        }
                        if ((amtsVar2.b & 128) != 0) {
                            btleVar.d(amtsVar2.j);
                        }
                        final btlb a2 = btleVar.a();
                        final dtve b = btmu.b();
                        dtub.b(btmu.b(), "lighter_conversations_table", a2, new Function() { // from class: btky
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo448andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj) {
                                return Long.valueOf(dtve.this.S("lighter_conversations_table", (ContentValues) obj));
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        }, new Consumer() { // from class: btkz
                            @Override // java.util.function.Consumer
                            /* renamed from: accept */
                            public final void o(Object obj) {
                                Long l = (Long) obj;
                                if (l.longValue() >= 0) {
                                    btlb btlbVar = btlb.this;
                                    btlbVar.a = new btkx(l).a.longValue();
                                    btlbVar.fY(0);
                                }
                            }

                            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                return Consumer$CC.$default$andThen(this, consumer);
                            }
                        });
                        return;
                    }
                    if (((Boolean) amtzVar.a.b()).booleanValue()) {
                        btmr btmrVar = new btmr();
                        btmrVar.al();
                        btmrVar.ap("CreateOrUpdateLighterConversationHandler#updateConversation1");
                        btmrVar.f(new Function() { // from class: amtw
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo448andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj) {
                                amts amtsVar3 = amts.this;
                                btmt btmtVar = (btmt) obj;
                                btmtVar.b(amtsVar3.c);
                                long j = amtsVar3.m;
                                int intValue2 = btmu.c().intValue();
                                if (intValue2 < 59100) {
                                    dtub.w("sync_timestamp_ms", intValue2);
                                }
                                btmtVar.aq(new dtwe("lighter_conversations_table.sync_timestamp_ms", 10, Long.valueOf(j)));
                                return btmtVar;
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        });
                        long j = amtsVar2.m;
                        int intValue2 = btmu.c().intValue();
                        int intValue3 = btmu.c().intValue();
                        if (intValue3 < 59100) {
                            dtub.w("sync_timestamp_ms", intValue3);
                        }
                        if (intValue2 >= 59100) {
                            btmrVar.a.put("sync_timestamp_ms", Long.valueOf(j));
                        }
                        btmrVar.d(amtsVar2.d);
                        if ((amtsVar2.b & 64) != 0) {
                            btmrVar.e(amtsVar2.i);
                        }
                        if ((amtsVar2.b & 128) != 0) {
                            btmrVar.c(amtsVar2.j);
                        }
                        if (btmrVar.a().e() <= 0) {
                            return;
                        }
                    }
                    String[] strArr2 = bsom.a;
                    bsoe bsoeVar = new bsoe();
                    bsoeVar.ap("CreateOrUpdateLighterConversationHandler#updateConversation2");
                    bsoeVar.e.d(true);
                    bsoeVar.ad(new Function() { // from class: amtx
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo448andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            bsol bsolVar = (bsol) obj;
                            bsolVar.q(ConversationIdType.this);
                            bsolVar.l();
                            return bsolVar;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    if ((amtsVar2.b & 4) != 0) {
                        bsoeVar.C(amtsVar2.e);
                    }
                    if ((amtsVar2.b & 8) != 0) {
                        bsoeVar.Y(amtsVar2.f);
                    }
                    if ((amtsVar2.b & 16) != 0) {
                        bsoeVar.z(emxe.a(amtsVar2.g));
                    }
                    if ((amtsVar2.b & 32) != 0) {
                        bsoeVar.Z(amtsVar2.h);
                    }
                    if ((amtsVar2.b & 256) != 0) {
                        bsoeVar.h(amtsVar2.k ? byyt.BLOCKED_FOLDER : byyt.UNARCHIVED);
                    }
                    bsoeVar.b().e();
                    if (((Boolean) amtzVar.a.b()).booleanValue()) {
                        return;
                    }
                    btmr btmrVar2 = new btmr();
                    btmrVar2.ap("CreateOrUpdateLighterConversationHandler#updateConversation3");
                    btmrVar2.f(new Function() { // from class: amty
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo448andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            btmt btmtVar = (btmt) obj;
                            btmtVar.b(amts.this.c);
                            return btmtVar;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    int i4 = amtsVar2.b;
                    if ((i4 & 64) != 0) {
                        btmrVar2.e(amtsVar2.i);
                    } else if ((i4 & 2) == 0 && (i4 & 128) == 0) {
                        return;
                    }
                    if ((amtsVar2.b & 2) != 0) {
                        btmrVar2.d(amtsVar2.d);
                    }
                    if ((amtsVar2.b & 128) != 0) {
                        btmrVar2.c(amtsVar2.j);
                    }
                    btmrVar2.a().e();
                } catch (Throwable th) {
                    try {
                        btmaVar.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
        });
        return elfo.e(ceyt.i());
    }
}
