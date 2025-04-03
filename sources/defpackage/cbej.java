package defpackage;

import android.content.ContentValues;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import j$.time.Instant;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cbej {
    public final ffbr a;
    public final ffbr b;
    private final ffbr c;

    public cbej(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3) {
        this.a = ffbrVar;
        this.b = ffbrVar2;
        this.c = ffbrVar3;
    }

    public final void a(ConversationIdType conversationIdType, final MessageIdType messageIdType, String str, Instant instant) {
        Object apply;
        final long parseLong = Long.parseLong(str);
        ekzz f = eleg.f("ReportOperations#updateDeliveryReport");
        try {
            bwvt b = bwvy.b();
            b.z("markFailedToDecrypt");
            b.d(new Function() { // from class: cbef
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    bwvx bwvxVar = (bwvx) obj;
                    bwvxVar.b(MessageIdType.this);
                    bwvxVar.c(parseLong);
                    return bwvxVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            bwuo bwuoVar = (bwuo) ((bwvi) b.b().o()).cS();
            if (bwuoVar == null) {
                bwur bwurVar = new bwur();
                bwurVar.d(messageIdType);
                bwurVar.e(parseLong);
                bwurVar.b(Optional.of(instant));
                final bwuo a = bwurVar.a();
                final dtve c = bwvy.c();
                dtub.b(bwvy.c(), "read_reports", a, new Function() { // from class: bwuj
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return Long.valueOf(dtve.this.S("read_reports", (ContentValues) obj));
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }, new Consumer() { // from class: bwuk
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void o(Object obj) {
                        bwuo.this.s((Long) obj);
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
            } else {
                bwuq o = bwuoVar.o();
                o.b(Optional.of(instant));
                final bwuo a2 = o.a();
                apply = new Function() { // from class: cbeg
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        bwvx bwvxVar = (bwvx) obj;
                        bwvxVar.b(MessageIdType.this);
                        bwvxVar.c(parseLong);
                        return bwvxVar;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }.apply(new bwvx());
                final bwvw bwvwVar = new bwvw((bwvx) apply);
                final dtve c2 = bwvy.c();
                ((Boolean) c2.q(new emyl() { // from class: bwul
                    @Override // defpackage.emyl
                    public final Object get() {
                        String[] strArr = bwvy.a;
                        bwvv bwvvVar = new bwvv();
                        final bwuo bwuoVar2 = bwuo.this;
                        Optional q = bwuoVar2.q();
                        int intValue = bwvy.d().intValue();
                        int intValue2 = bwvy.d().intValue();
                        if (intValue2 < 58880) {
                            dtub.w("ftd_time", intValue2);
                        }
                        if (intValue >= 58880) {
                            if (q == null) {
                                bwvvVar.a.putNull("ftd_time");
                            } else {
                                bwvvVar.a.put("ftd_time", Long.valueOf(bdhe.a(q)));
                            }
                        }
                        bwvw bwvwVar2 = bwvwVar;
                        bwvvVar.al();
                        bwvvVar.af(bwvwVar2);
                        bwvvVar.an(new dtui("read_reports", "-updateOrInsert-update"));
                        if (bwvvVar.b().e() != 0) {
                            return true;
                        }
                        final dtve dtveVar = c2;
                        return Boolean.valueOf(dtub.b(bwvy.c(), "read_reports", bwuoVar2, new Function() { // from class: bwud
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo448andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj) {
                                return Long.valueOf(dtve.this.R("read_reports", (ContentValues) obj));
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        }, new Consumer() { // from class: bwuf
                            @Override // java.util.function.Consumer
                            /* renamed from: accept */
                            public final void o(Object obj) {
                                bwuo.this.r((Long) obj);
                            }

                            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                return Consumer$CC.$default$andThen(this, consumer);
                            }
                        }) != -1);
                    }
                })).booleanValue();
            }
            if (((bzqa) this.c.b()).i()) {
                ((cbgf) this.a.b()).l(conversationIdType, messageIdType, "read_reports");
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
}
