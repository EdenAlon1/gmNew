package defpackage;

import android.content.ContentValues;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bdvu {
    public final ffbr a;
    private final dtuu b;

    public bdvu(dtuu dtuuVar, ffbr ffbrVar) {
        this.b = dtuuVar;
        this.a = ffbrVar;
    }

    public static btnv a(final String str) {
        Object apply;
        Object apply2;
        String[] strArr = btob.a;
        btnw btnwVar = new btnw(btob.a);
        btnwVar.z("getParticipantManualLinkPreviewCount");
        apply = new Function() { // from class: bdvm
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                btoa btoaVar = (btoa) obj;
                btoaVar.b(Long.parseLong(str));
                return btoaVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }.apply(new btoa());
        btnwVar.k(new btnz((btoa) apply));
        apply2 = new Function() { // from class: bdvn
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((btnm) obj).c;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }.apply(btob.c);
        btnn[] btnnVarArr = {(btnn) apply2};
        int a = btob.b().a();
        Integer.valueOf(a).getClass();
        if (((Integer) btob.b.getOrDefault(btnnVarArr[0].toString(), -1)).intValue() > a) {
            dtub.w("columnReference.toString()", a);
        }
        btnwVar.m(btnnVarArr);
        return btnwVar.b();
    }

    public static final Optional c(final MessageIdType messageIdType) {
        Optional empty;
        ekzz f = eleg.f("LinkPreviewDatabaseOperations#getLinkPreviewDataByMessageId");
        try {
            csix.h();
            csix.h();
            btql b = btqq.b();
            b.z("getLinkPreviewData");
            b.e(new Function() { // from class: bdvt
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    btqp btqpVar = (btqp) obj;
                    btqpVar.b(MessageIdType.this);
                    return btqpVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            btps btpsVar = (btps) b.b().o();
            try {
                if (btpsVar.moveToNext()) {
                    empty = Optional.of((bton) btpsVar.cO());
                    btpsVar.close();
                } else {
                    btpsVar.close();
                    empty = Optional.empty();
                }
                f.close();
                return empty;
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

    /* JADX WARN: Multi-variable type inference failed */
    public static final long d(String str) {
        long longValue;
        ekzz f = eleg.f("LinkPreviewDatabaseOperations#getParticipantManualLinkPreviewCount");
        try {
            csix.h();
            if (str == null) {
                longValue = -1;
            } else {
                btno btnoVar = (btno) a(str).p(btob.c.c);
                try {
                    engw c = btnoVar.c();
                    btnoVar.close();
                    longValue = c.isEmpty() ? 0L : ((Long) c.get(0)).longValue();
                } finally {
                }
            }
            f.close();
            return longValue;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void b(final bton btonVar, final ConversationIdType conversationIdType) {
        ekzz f = eleg.f("LinkPreviewDatabaseOperations#insertOrReplaceLinkPreviewData");
        try {
            csix.h();
            this.b.d("LinkPreviewDatabaseOperations#insertOrReplaceLinkPreviewData", new Runnable() { // from class: bdvp
                @Override // java.lang.Runnable
                public final void run() {
                    Object apply;
                    final bton btonVar2 = btonVar;
                    if (bdvu.c(btonVar2.l()).isPresent()) {
                        ekzz f2 = eleg.f("LinkPreviewDatabaseOperations#updateLinkPreview");
                        try {
                            csix.h();
                            String[] strArr = btqq.a;
                            btqn btqnVar = new btqn();
                            btqnVar.ap("updateLinkPreview");
                            dtub.u(btqnVar.a, "trigger_url", btonVar2.s());
                            btqnVar.a.put("expiration_time_millis", Long.valueOf(btonVar2.k()));
                            dtub.u(btqnVar.a, "link_title", cuxs.a(btonVar2.r()));
                            dtub.u(btqnVar.a, "link_description", cuxs.a(btonVar2.n()));
                            dtub.u(btqnVar.a, "link_image_url", btonVar2.q());
                            dtub.u(btqnVar.a, "link_domain", btonVar2.o());
                            dtub.u(btqnVar.a, "link_canonical_url", btonVar2.m());
                            boolean w = btonVar2.w();
                            int intValue = btqq.d().intValue();
                            int intValue2 = btqq.d().intValue();
                            if (intValue2 < 21010) {
                                dtub.w("link_preview_prevented", intValue2);
                            }
                            if (intValue >= 21010) {
                                btqnVar.a.put("link_preview_prevented", Boolean.valueOf(w));
                            }
                            boolean v = btonVar2.v();
                            int intValue3 = btqq.d().intValue();
                            int intValue4 = btqq.d().intValue();
                            if (intValue4 < 22020) {
                                dtub.w("link_preview_failed", intValue4);
                            }
                            if (intValue3 >= 22020) {
                                btqnVar.a.put("link_preview_failed", Boolean.valueOf(v));
                            }
                            apply = new Function() { // from class: bdvo
                                @Override // java.util.function.Function
                                /* renamed from: andThen */
                                public final /* synthetic */ Function mo448andThen(Function function) {
                                    return Function$CC.$default$andThen(this, function);
                                }

                                @Override // java.util.function.Function
                                public final Object apply(Object obj) {
                                    btqp btqpVar = (btqp) obj;
                                    btqpVar.b(bton.this.l());
                                    return btqpVar;
                                }

                                public final /* synthetic */ Function compose(Function function) {
                                    return Function$CC.$default$compose(this, function);
                                }
                            }.apply(new btqp());
                            btqnVar.af(new btqo((btqp) apply));
                            btqnVar.b().e();
                            f2.close();
                        } catch (Throwable th) {
                            try {
                                f2.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    } else {
                        final dtve c = btqq.c();
                        dtub.b(btqq.c(), "link_preview", btonVar2, new Function() { // from class: btol
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo448andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj) {
                                return Long.valueOf(dtve.this.R("link_preview", (ContentValues) obj));
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        }, new Consumer() { // from class: btog
                            @Override // java.util.function.Consumer
                            /* renamed from: accept */
                            public final void o(Object obj) {
                                bton.this.t((Long) obj);
                            }

                            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                return Consumer$CC.$default$andThen(this, consumer);
                            }
                        });
                    }
                    ((cbgf) bdvu.this.a.b()).l(conversationIdType, btonVar2.l(), "link_preview");
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
}
