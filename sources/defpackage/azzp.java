package defpackage;

import android.content.ContentValues;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class azzp {
    public static final enru a = enru.c("com/google/android/apps/messaging/shared/datamodel/ParticipantsColumnSetter");
    public final ffbr b;
    public final ffbr c;
    private final aunh d;

    public azzp(ffbr ffbrVar, ffbr ffbrVar2, aunh aunhVar) {
        this.b = ffbrVar;
        this.c = ffbrVar2;
        this.d = aunhVar;
    }

    public static long a(final bxro bxroVar) {
        final dtve b = bxth.b();
        long b2 = dtub.b(bxth.b(), "self_participants", bxroVar, new Function() { // from class: bxrj
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Long.valueOf(dtve.this.S("self_participants", (ContentValues) obj));
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }, new Consumer() { // from class: bxrk
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                final Long l = (Long) obj;
                if (l.longValue() >= 0) {
                    bxro bxroVar2 = bxro.this;
                    bxroVar2.a = (String) new dtuj() { // from class: bxrm
                        @Override // defpackage.dtuj
                        public final Object a() {
                            return String.valueOf(l);
                        }
                    }.a();
                    bxroVar2.fY(0);
                }
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        Long.valueOf(b2).getClass();
        return b2;
    }

    public static void c() {
        bvvr f = ParticipantsTable.f();
        f.ap("resetIsValidPhoneNumberData");
        int intValue = ParticipantsTable.i().intValue();
        int intValue2 = ParticipantsTable.i().intValue();
        if (intValue2 < 55010) {
            dtub.w("is_valid_phone_number_data", intValue2);
        }
        if (intValue >= 55010) {
            f.a.put("is_valid_phone_number_data", (Boolean) false);
        }
        f.V(new Function() { // from class: azzg
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bvvw bvvwVar = (bvvw) obj;
                bvvwVar.b(new Function() { // from class: azzj
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        bvvw bvvwVar2 = (bvvw) obj2;
                        bvvwVar2.aq(new dtrx("participants.normalized_destination", 5));
                        return bvvwVar2;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }, new Function() { // from class: azzk
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        bvvw bvvwVar2 = (bvvw) obj2;
                        bvvwVar2.r("");
                        return bvvwVar2;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }, new Function() { // from class: azzl
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        bvvw bvvwVar2 = (bvvw) obj2;
                        bvvwVar2.aq(new dtrx("participants.send_destination", 5));
                        return bvvwVar2;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }, new Function() { // from class: azzm
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        bvvw bvvwVar2 = (bvvw) obj2;
                        bvvwVar2.aq(new dtrt("participants.send_destination", 1, ""));
                        return bvvwVar2;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }, new Function() { // from class: azzn
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        bvvw bvvwVar2 = (bvvw) obj2;
                        bvvwVar2.aq(new dtrx("participants.display_destination", 5));
                        return bvvwVar2;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }, new Function() { // from class: azzo
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        bvvw bvvwVar2 = (bvvw) obj2;
                        bvvwVar2.aq(new dtrt("participants.display_destination", 1, ""));
                        return bvvwVar2;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                return bvvwVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        f.b().e();
    }

    public final long b(ParticipantsTable.BindData bindData) {
        emxf.a(bindData.r() >= -1);
        return bindData.J().longValue();
    }

    public final void d(bvpo bvpoVar, Optional optional) {
        int i = bvpoVar.d;
        Optional map = optional.map(new Function() { // from class: azzi
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return (String) ((emyl) obj).get();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        emxf.a(i >= -1);
        azsu g = ((azpl) this.c.b()).g(i, (String) map.orElse(null), null);
        if (this.d.a()) {
            ensk h = a.h();
            h.Y(ente.a, "BugleDataModel");
            enrr enrrVar = (enrr) h;
            enrrVar.Y(csux.t, Integer.valueOf(i));
            enrrVar.Y(csux.u, map.isPresent() ? dktx.SIM_ICCID.c(map.get()) : "null");
            enrrVar.Y(csux.w, g);
            ((enrr) enrrVar.h("com/google/android/apps/messaging/shared/datamodel/ParticipantsColumnSetter", "supplementFieldsForSelfBeforeBuild", 192, "ParticipantsColumnSetter.java")).q("set token for new self participant");
        } else {
            ensk h2 = a.h();
            h2.Y(ente.a, "BugleDataModel");
            enrr enrrVar2 = (enrr) h2;
            enrrVar2.Y(csux.t, Integer.valueOf(i));
            enrrVar2.Y(csux.u, (String) map.orElse(null));
            enrrVar2.Y(csux.w, g);
            ((enrr) enrrVar2.h("com/google/android/apps/messaging/shared/datamodel/ParticipantsColumnSetter", "supplementFieldsForSelfBeforeBuild", 199, "ParticipantsColumnSetter.java")).q("set token for new self participant");
        }
        bvpoVar.E(g);
    }

    public final void e(bvpo bvpoVar) {
        d(bvpoVar, Optional.empty());
    }
}
