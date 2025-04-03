package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.database.ContentObserver;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.api.messaging.recipient.DefaultRecipient;
import com.google.android.apps.messaging.shared.api.messaging.recipient.Recipient;
import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;
import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ProfilesTable;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Collection;
import j$.util.Objects;
import j$.util.Optional;
import j$.util.function.BiFunction$CC;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Collectors;
import j$.util.stream.Stream;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aqjw implements aqkp, ctbj {
    public static final enru a = enru.c("com/google/android/apps/messaging/shared/api/messaging/recipient/DefaultRecipientRepository");
    public final Context b;
    public final errl c;
    public final ctbl d;
    public final aolr e;
    public final aqhl f;
    public final ffbr g;
    public final ffbr h;
    public final ffbr i;
    public final Optional j;
    public final ffbr k;
    private final errl l;
    private final arai m;
    private final aqky n;
    private final ffbr o;
    private final ffbr p;
    private final ffbr q;
    private final ffbr r;
    private final ffbr s;
    private final ffbr t;
    private final Optional u;

    public aqjw(Context context, errl errlVar, errl errlVar2, arai araiVar, ctbk ctbkVar, aolr aolrVar, aqhl aqhlVar, aqky aqkyVar, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, ffbr ffbrVar6, ffbr ffbrVar7, ffbr ffbrVar8, ffbr ffbrVar9, Optional optional, Optional optional2, ffbr ffbrVar10) {
        this.b = context;
        this.c = errlVar;
        this.l = errlVar2;
        this.m = araiVar;
        this.d = ctbkVar.a(this);
        this.e = aolrVar;
        this.f = aqhlVar;
        this.n = aqkyVar;
        this.o = ffbrVar;
        this.q = ffbrVar2;
        this.r = ffbrVar3;
        this.s = ffbrVar4;
        this.t = ffbrVar5;
        this.g = ffbrVar6;
        this.h = ffbrVar7;
        this.p = ffbrVar8;
        this.i = ffbrVar9;
        this.j = optional;
        this.u = optional2;
        this.k = ffbrVar10;
    }

    public static bvvl i(ConversationId conversationId) {
        final BugleConversationId bugleConversationId = new BugleConversationId(conversationId.b());
        bvvn e = ParticipantsTable.e();
        e.z("getActiveRecipientParticipantsQuery");
        dtvy i = dtvz.i(ProfilesTable.a().b(), ProfilesTable.c.b, ParticipantsTable.c.a);
        ((dtrd) i).e = "profiles_table_join_tag";
        e.G(i.g());
        bqzs a2 = bqzv.a();
        a2.d(new Function() { // from class: aqiy
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bqyn bqynVar = (bqyn) obj;
                return new bqyo[]{bqynVar.h, bqynVar.b, bqynVar.a, bqynVar.i};
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        dtvy i2 = dtvz.i(a2.b(), bqzv.c.b, ParticipantsTable.c.q);
        ((dtrd) i2).e = "contacts_table_join_tag";
        e.G(i2.g());
        e.h(new Function() { // from class: aqiz
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bvvw bvvwVar = (bvvw) obj;
                bvvwVar.w(-2);
                buxo d = MessagesTable.d();
                d.f(new Function() { // from class: aqjb
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        return ((buum) obj2).c;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                final BugleConversationId bugleConversationId2 = BugleConversationId.this;
                d.h(new Function() { // from class: aqjc
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        buxz buxzVar = (buxz) obj2;
                        buxzVar.m(BugleConversationId.this.a);
                        return buxzVar;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                bvvwVar.l(d.b());
                return bvvwVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        return e.b();
    }

    public static bvvl j(final engw engwVar) {
        bvvn e = ParticipantsTable.e();
        e.z("getAllRecipientParticipantsByIdQuery");
        e.h(new Function() { // from class: aqiw
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bvvw bvvwVar = (bvvw) obj;
                bvvwVar.w(-2);
                Stream map = Collection.EL.stream(engw.this).map(new Function() { // from class: aqhw
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        return ((aqkv) obj2).a;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                int i = engw.d;
                bvvwVar.m((Iterable) map.collect(endq.a));
                return bvvwVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        dtvy i = dtvz.i(ProfilesTable.a().b(), ProfilesTable.c.b, ParticipantsTable.c.a);
        ((dtrd) i).e = "profiles_table_join_tag";
        e.G(i.g());
        return e.b();
    }

    public static bvvl k(ConversationId conversationId) {
        final BugleConversationId bugleConversationId = new BugleConversationId(conversationId.b());
        bvvn e = ParticipantsTable.e();
        e.z("getAllRecipientParticipantsForConversationQuery");
        dtvy i = dtvz.i(ProfilesTable.a().b(), ProfilesTable.c.b, ParticipantsTable.c.a);
        ((dtrd) i).e = "profiles_table_join_tag";
        e.G(i.g());
        bqzs a2 = bqzv.a();
        a2.d(new Function() { // from class: aqim
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bqyn bqynVar = (bqyn) obj;
                return new bqyo[]{bqynVar.h, bqynVar.b, bqynVar.a, bqynVar.i};
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        dtvy i2 = dtvz.i(a2.b(), bqzv.c.b, ParticipantsTable.c.q);
        ((dtrd) i2).e = "contacts_table_join_tag";
        e.G(i2.g());
        e.h(new Function() { // from class: aqin
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bvvw bvvwVar = (bvvw) obj;
                bvvwVar.w(-2);
                String[] strArr = bsdr.a;
                bsdm bsdmVar = new bsdm(bsdr.a);
                bsdmVar.e(new Function() { // from class: aqjh
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        return ((bscz) obj2).b;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                final BugleConversationId bugleConversationId2 = BugleConversationId.this;
                bsdmVar.f(new Function() { // from class: aqji
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        bsdq bsdqVar = (bsdq) obj2;
                        bsdqVar.b(BugleConversationId.this.a);
                        return bsdqVar;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                bvvwVar.l(bsdmVar.b());
                return bvvwVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        return e.b();
    }

    @Override // defpackage.aqkp
    public final elfl A(final eisx eisxVar, final aqkv aqkvVar, final cjwe cjweVar) {
        final ekzz f = eleg.f("updatePhotoPreference");
        try {
            elfl elflVar = (elfl) this.j.map(new Function() { // from class: aqhr
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    final aqrf aqrfVar = (aqrf) obj;
                    bvvr f2 = ParticipantsTable.f();
                    f2.ap("updatePhotoPreference");
                    final aqkv aqkvVar2 = aqkvVar;
                    f2.V(new Function() { // from class: aqjj
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo448andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj2) {
                            bvvw bvvwVar = (bvvw) obj2;
                            bvvwVar.k(aqkv.this.a);
                            return bvvwVar;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    int intValue = ParticipantsTable.i().intValue();
                    int intValue2 = ParticipantsTable.i().intValue();
                    if (intValue2 < 60060) {
                        dtub.w("profile_photo_user_preference", intValue2);
                    }
                    if (intValue >= 60060) {
                        cjwe cjweVar2 = cjweVar;
                        if (cjweVar2 == null) {
                            f2.a.putNull("profile_photo_user_preference");
                        } else {
                            f2.a.put("profile_photo_user_preference", Integer.valueOf(cjweVar2.a()));
                        }
                    }
                    final eisx eisxVar2 = eisxVar;
                    ekzz ekzzVar = f;
                    final aqjw aqjwVar = aqjw.this;
                    elfl i = f2.b().i().i(new eroh() { // from class: aqjk
                        @Override // defpackage.eroh
                        public final ListenableFuture a(Object obj2) {
                            Integer num = (Integer) obj2;
                            if (num == null || num.intValue() != 1) {
                                return elfo.e(false);
                            }
                            aqkv aqkvVar3 = aqkvVar2;
                            return aqrfVar.a(eisxVar2, aqjw.this, aqkvVar3);
                        }
                    }, aqjwVar.c);
                    ekzzVar.b(i);
                    return i;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }).orElseGet(new Supplier() { // from class: aqhs
                @Override // java.util.function.Supplier
                public final Object get() {
                    return elfo.e(false);
                }
            });
            f.close();
            return elflVar;
        } finally {
        }
    }

    @Override // defpackage.aqkp
    public final elfl B(final aqkv aqkvVar, cjvu cjvuVar) {
        try {
            ekzz f = eleg.f("updatePhotoUriAndSource");
            try {
                Uri uri = cjvuVar.a;
                if (uri != null && !uri.toString().isEmpty() && cjvuVar.b == cjwi.PROFILE_PEOPLE_SHARING_SOURCE) {
                    uri = ((dulp) this.t.b()).a(160, uri);
                }
                bvvr f2 = ParticipantsTable.f();
                f2.ap("updatePhotoUriAndSource");
                f2.V(new Function() { // from class: aqht
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        bvvw bvvwVar = (bvvw) obj;
                        bvvwVar.k(aqkv.this.a);
                        return bvvwVar;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                f2.M(uri);
                f2.J(cjvuVar.b);
                elfl h = f2.b().i().h(new emwl() { // from class: aqhu
                    @Override // defpackage.emwl
                    public final Object apply(Object obj) {
                        return Boolean.valueOf(((Integer) obj).intValue() == 1);
                    }
                }, this.c);
                f.b(h);
                f.close();
                return h;
            } finally {
            }
        } catch (duln unused) {
            return elfo.e(false);
        }
    }

    @Override // defpackage.aqkp
    public final elfl C(final aqkv aqkvVar, final aqkl aqklVar) {
        ekzz f = eleg.f("updateProfileReceivingMetadata");
        try {
            elfl g = elfo.g(new Callable() { // from class: aqjo
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    final aqjw aqjwVar = aqjw.this;
                    dtuu dtuuVar = (dtuu) aqjwVar.h.b();
                    final aqkv aqkvVar2 = aqkvVar;
                    final aqkl aqklVar2 = aqklVar;
                    return (Boolean) dtuuVar.c("updateProfileReceivingMetadata", new emyl() { // from class: aqhv
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // defpackage.emyl
                        public final Object get() {
                            aqjw aqjwVar2 = aqjw.this;
                            final ParticipantsTable.BindData bindData = (ParticipantsTable.BindData) ((bdrr) aqjwVar2.g.b()).f(aqkvVar2.a).get(0);
                            ProfilesTable.BindData a2 = aqli.a(bindData);
                            bwlt s = a2.s();
                            aqkl aqklVar3 = aqklVar2;
                            s.m(aqklVar3.a);
                            s.p(aqklVar3.c);
                            s.j(aqklVar3.b);
                            if (!TextUtils.equals(a2.y(), aqklVar3.b)) {
                                s.o("0");
                            }
                            return Boolean.valueOf(s.a().H(new Function() { // from class: aqja
                                @Override // java.util.function.Function
                                /* renamed from: andThen */
                                public final /* synthetic */ Function mo448andThen(Function function) {
                                    return Function$CC.$default$andThen(this, function);
                                }

                                @Override // java.util.function.Function
                                public final Object apply(Object obj) {
                                    bwor bworVar = (bwor) obj;
                                    bworVar.b(Long.parseLong(ParticipantsTable.BindData.this.S()));
                                    return bworVar;
                                }

                                public final /* synthetic */ Function compose(Function function) {
                                    return Function$CC.$default$compose(this, function);
                                }
                            }));
                        }
                    });
                }
            }, this.l);
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

    @Override // defpackage.aqkp
    public final elfl D(final aqkv aqkvVar, aorb aorbVar) {
        ekzz f = eleg.f("updateUINormStatus");
        try {
            bvvr f2 = ParticipantsTable.f();
            f2.ap("updateUINormStatus");
            f2.V(new Function() { // from class: aqhx
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    bvvw bvvwVar = (bvvw) obj;
                    bvvwVar.k(aqkv.this.a);
                    return bvvwVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            f2.G(aorbVar);
            elfl h = f2.b().i().h(new emwl() { // from class: aqii
                @Override // defpackage.emwl
                public final Object apply(Object obj) {
                    return Boolean.valueOf(((Integer) obj).intValue() == 1);
                }
            }, this.c);
            f.b(h);
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

    @Override // defpackage.aqkp
    public final elfl E(final engw engwVar, final SelfIdentityId selfIdentityId, final int i, final eyja eyjaVar) {
        return elfo.g(new Callable() { // from class: aqhm
            @Override // java.util.concurrent.Callable
            public final Object call() {
                final aqjw aqjwVar = aqjw.this;
                dtuu dtuuVar = (dtuu) aqjwVar.h.b();
                final engw engwVar2 = engwVar;
                final int i2 = i;
                final eyja eyjaVar2 = eyjaVar;
                final SelfIdentityId selfIdentityId2 = selfIdentityId;
                return (Boolean) dtuuVar.c("bulkUpdateProfileSendingState", new emyl() { // from class: aqjf
                    @Override // defpackage.emyl
                    public final Object get() {
                        cjwq cjwqVar;
                        bvvn e = ParticipantsTable.e();
                        e.z("bulkUpdateProfileSendingState");
                        final engw engwVar3 = engwVar2;
                        e.h(new Function() { // from class: aqif
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo448andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj) {
                                bvvw bvvwVar = (bvvw) obj;
                                bvvwVar.m((Iterable) Collection.EL.stream(engw.this).map(new Function() { // from class: aqje
                                    @Override // java.util.function.Function
                                    /* renamed from: andThen */
                                    public final /* synthetic */ Function mo448andThen(Function function) {
                                        return Function$CC.$default$andThen(this, function);
                                    }

                                    @Override // java.util.function.Function
                                    public final Object apply(Object obj2) {
                                        return ((aqkv) obj2).a;
                                    }

                                    public final /* synthetic */ Function compose(Function function) {
                                        return Function$CC.$default$compose(this, function);
                                    }
                                }).collect(endq.a));
                                return bvvwVar;
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        });
                        bvti bvtiVar = (bvti) e.b().o();
                        aqjw aqjwVar2 = aqjw.this;
                        SelfIdentityId selfIdentityId3 = selfIdentityId2;
                        boolean z = true;
                        while (true) {
                            try {
                                final ParticipantsTable.BindData bindData = (ParticipantsTable.BindData) bvtiVar.cQ();
                                if (bindData == null) {
                                    Boolean valueOf = Boolean.valueOf(z);
                                    bvtiVar.close();
                                    return valueOf;
                                }
                                ProfilesTable.BindData a2 = aqli.a(bindData);
                                cjwo cjwoVar = (cjwo) Optional.ofNullable(a2.t()).orElse(cjwo.a);
                                boolean a3 = ((aulk) aqjwVar2.i.b()).a();
                                int i3 = i2;
                                if (a3) {
                                    cjwp cjwpVar = (cjwp) cjwq.a.createBuilder();
                                    cjwpVar.copyOnWrite();
                                    ((cjwq) cjwpVar.instance).c = cjwr.a(i3);
                                    eyja eyjaVar3 = eyjaVar2;
                                    if (eyjaVar3 != null) {
                                        cjwpVar.copyOnWrite();
                                        cjwq cjwqVar2 = (cjwq) cjwpVar.instance;
                                        cjwqVar2.d = eyjaVar3;
                                        cjwqVar2.b |= 1;
                                    }
                                    cjwqVar = (cjwq) cjwpVar.build();
                                } else {
                                    cjwp cjwpVar2 = (cjwp) cjwq.a.createBuilder();
                                    cjwpVar2.copyOnWrite();
                                    ((cjwq) cjwpVar2.instance).c = cjwr.a(i3);
                                    cjwqVar = (cjwq) cjwpVar2.build();
                                }
                                bwlt s = a2.s();
                                cjwm cjwmVar = (cjwm) cjwoVar.toBuilder();
                                String b = selfIdentityId3.b();
                                cjwqVar.getClass();
                                cjwmVar.copyOnWrite();
                                cjwo cjwoVar2 = (cjwo) cjwmVar.instance;
                                eyhm eyhmVar = cjwoVar2.b;
                                if (!eyhmVar.b) {
                                    cjwoVar2.b = eyhmVar.a();
                                }
                                cjwoVar2.b.put(b, cjwqVar);
                                s.n((cjwo) cjwmVar.build());
                                z &= s.a().H(new Function() { // from class: aqig
                                    @Override // java.util.function.Function
                                    /* renamed from: andThen */
                                    public final /* synthetic */ Function mo448andThen(Function function) {
                                        return Function$CC.$default$andThen(this, function);
                                    }

                                    @Override // java.util.function.Function
                                    public final Object apply(Object obj) {
                                        bwor bworVar = (bwor) obj;
                                        bworVar.b(Long.parseLong(ParticipantsTable.BindData.this.S()));
                                        return bworVar;
                                    }

                                    public final /* synthetic */ Function compose(Function function) {
                                        return Function$CC.$default$compose(this, function);
                                    }
                                });
                            } catch (Throwable th) {
                                try {
                                    bvtiVar.close();
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                                throw th;
                            }
                        }
                    }
                });
            }
        }, this.l);
    }

    @Override // defpackage.aqkp
    public final elfl F(int i) {
        if (this.j.isEmpty()) {
            return elfo.e(false);
        }
        aqru aqruVar = (aqru) this.j.get();
        ffsk ffskVar = aqruVar.c;
        ffhe ffheVar = ffhe.a;
        return axol.a(ffra.b(ffskVar, ekxi.a(ffheVar), ffsm.a, new aqro(null, aqruVar, this, i)));
    }

    @Override // defpackage.aqkp
    public final aqge a(final ConversationId conversationId) {
        return ((aqkg) this.r.b()).a(new ffjm() { // from class: aqjn
            @Override // defpackage.ffjm
            public final Object a(Object obj, Object obj2) {
                return Boolean.valueOf(((Set) obj).contains(ConversationId.this));
            }
        }, new aqjv(this, conversationId));
    }

    @Override // defpackage.aqkp
    public final aqge d(final ConversationId conversationId) {
        return ((aqkg) this.r.b()).a(new ffjm() { // from class: aqis
            @Override // defpackage.ffjm
            public final Object a(Object obj, Object obj2) {
                return Boolean.valueOf(((Set) obj).contains(ConversationId.this));
            }
        }, new aqju(this, conversationId));
    }

    @Override // defpackage.aqkp
    public final aqge e(engw engwVar) {
        return ((aqkg) this.q.b()).a(new ffjm() { // from class: aqjg
            @Override // defpackage.ffjm
            public final Object a(Object obj, Object obj2) {
                return Boolean.valueOf(!((Set) obj).isEmpty());
            }
        }, new aqjt(this, engwVar));
    }

    @Override // defpackage.aqkp
    public final Recipient f(aoku aokuVar) {
        return this.f.a(this.n.a(aokuVar), aokuVar);
    }

    @Override // defpackage.ctbj
    public final void fN() {
        boolean z;
        Uri i = bcqc.i(this.b);
        aqhq aqhqVar = new aqhq(this);
        arai araiVar = this.m;
        synchronized (araiVar.d) {
            synchronized (araiVar.d) {
                z = araiVar.e != null;
            }
            emxf.b(!z, "Already registered");
            ContentResolver contentResolver = araiVar.a.getContentResolver();
            araiVar.e = new arah(araiVar, aqhqVar);
            contentResolver.registerContentObserver(i, true, araiVar.e);
        }
    }

    @Override // defpackage.ctbj
    public final void fO() {
        arai araiVar = this.m;
        synchronized (araiVar.d) {
            ContentResolver contentResolver = araiVar.a.getContentResolver();
            ContentObserver contentObserver = araiVar.e;
            if (contentObserver != null) {
                contentResolver.unregisterContentObserver(contentObserver);
                araiVar.e = null;
            }
        }
    }

    @Override // defpackage.aqkp
    public final Recipient g(qmc qmcVar) {
        aolr aolrVar = this.e;
        return this.f.a(this.n.b(qmcVar), aolrVar.s(qmcVar));
    }

    public final ResolvedRecipient h(ParticipantsTable.BindData bindData) {
        return this.f.a(bindData, this.e.q(bindData));
    }

    @Override // defpackage.aqkp
    public final ctbx l(aqko aqkoVar, String str) {
        return this.d.a(aqkoVar, "Subscribe Recipient updates", str, "Unsubscribe Recipient updates");
    }

    @Override // defpackage.aqkp
    public final elfl m(final aoku aokuVar) {
        ekzz f = eleg.f("getRecipientByMessagingIdentity");
        try {
            final engw r = engw.r(aokuVar);
            ekzz f2 = eleg.f("getRecipientsByMessagingIdentity");
            try {
                emxf.b(!r.isEmpty(), "Set of input MIs for getRecipientsByMessagingIdentity cannot be empty.");
                bvvn e = ParticipantsTable.e();
                e.z("getRecipientsByMessagingIdentityQuery");
                e.h(new Function() { // from class: aqix
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        bvvw bvvwVar = (bvvw) obj;
                        bvvwVar.w(-2);
                        final engw engwVar = engw.this;
                        bvvwVar.b(new Function() { // from class: aqip
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo448andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj2) {
                                bvvw bvvwVar2 = (bvvw) obj2;
                                Stream filter = Collection.EL.stream(engw.this).map(new Function() { // from class: aqhy
                                    @Override // java.util.function.Function
                                    /* renamed from: andThen */
                                    public final /* synthetic */ Function mo448andThen(Function function) {
                                        return Function$CC.$default$andThen(this, function);
                                    }

                                    @Override // java.util.function.Function
                                    public final Object apply(Object obj3) {
                                        return ((aoku) obj3).l();
                                    }

                                    public final /* synthetic */ Function compose(Function function) {
                                        return Function$CC.$default$compose(this, function);
                                    }
                                }).filter(new Predicate() { // from class: aqhz
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
                                        return Objects.nonNull((String) obj3);
                                    }
                                });
                                int i = engw.d;
                                bvvwVar2.s((Iterable) filter.collect(endq.a));
                                return bvvwVar2;
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        }, new Function() { // from class: aqiq
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo448andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj2) {
                                bvvw bvvwVar2 = (bvvw) obj2;
                                Stream map = Collection.EL.stream(engw.this).map(new Function() { // from class: aqio
                                    @Override // java.util.function.Function
                                    /* renamed from: andThen */
                                    public final /* synthetic */ Function mo448andThen(Function function) {
                                        return Function$CC.$default$andThen(this, function);
                                    }

                                    @Override // java.util.function.Function
                                    public final Object apply(Object obj3) {
                                        return ((aoku) obj3).j();
                                    }

                                    public final /* synthetic */ Function compose(Function function) {
                                        return Function$CC.$default$compose(this, function);
                                    }
                                });
                                int i = engw.d;
                                bvvwVar2.aq(new dtrw("participants.send_destination", 3, bvvw.at((Iterable) map.collect(endq.a)), false));
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
                dtvy i = dtvz.i(ProfilesTable.a().b(), ProfilesTable.c.b, ParticipantsTable.c.a);
                ((dtrd) i).e = "profiles_table_join_tag";
                e.G(i.g());
                elfl h = e.b().w().h(new emwl() { // from class: aqjs
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // defpackage.emwl
                    public final Object apply(Object obj) {
                        engw engwVar = (engw) obj;
                        if (engwVar.isEmpty()) {
                            return enoz.a;
                        }
                        HashSet hashSet = new HashSet();
                        enhd enhdVar = new enhd();
                        int size = engwVar.size();
                        for (int i2 = 0; i2 < size; i2++) {
                            aqjw aqjwVar = aqjw.this;
                            ParticipantsTable.BindData bindData = (ParticipantsTable.BindData) engwVar.get(i2);
                            aoku q = aqjwVar.e.q(bindData);
                            if (hashSet.add(q)) {
                                enhdVar.k(q, aqjwVar.f.a(bindData, q));
                            } else {
                                ensk j = aqjw.a.j();
                                j.Y(ente.a, "BugleRecipients");
                                ((enrr) ((enrr) j).h("com/google/android/apps/messaging/shared/api/messaging/recipient/DefaultRecipientRepository", "getRecipientsByMessagingIdentityFromParticipantRows", 711, "DefaultRecipientRepository.java")).q("Error: duplicate recipient found using getRecipientsByMessagingIdentityFromParticipantRows");
                            }
                        }
                        return enhdVar.c();
                    }
                }, this.c);
                f2.b(h);
                f2.close();
                elfl h2 = h.h(new emwl() { // from class: aqjm
                    @Override // defpackage.emwl
                    public final Object apply(Object obj) {
                        return (ResolvedRecipient) ((enhk) obj).get(aoku.this);
                    }
                }, this.c);
                f.b(h2);
                f.close();
                return h2;
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

    @Override // defpackage.aqkp
    public final elfl n(Recipient recipient) {
        ekzz f = eleg.f("resolveRecipient");
        try {
            elfl h = o(engw.r(recipient)).h(new emwl() { // from class: aqil
                @Override // defpackage.emwl
                public final Object apply(Object obj) {
                    return (ResolvedRecipient) ((engw) obj).get(0);
                }
            }, this.c);
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

    @Override // defpackage.aqkp
    public final elfl o(final engw engwVar) {
        ekzz f = eleg.f("resolveRecipients");
        try {
            elfl g = elfo.g(new Callable() { // from class: aqho
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    final aqjw aqjwVar = aqjw.this;
                    dtuu dtuuVar = (dtuu) aqjwVar.h.b();
                    final engw engwVar2 = engwVar;
                    return (engw) dtuuVar.c("DefaultRecipientRepository#resolveRecipients", new emyl() { // from class: aqhp
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // defpackage.emyl
                        public final Object get() {
                            int i = engw.d;
                            engr engrVar = new engr();
                            engw engwVar3 = engwVar2;
                            int size = engwVar3.size();
                            for (int i2 = 0; i2 < size; i2++) {
                                aqjw aqjwVar2 = aqjw.this;
                                ParticipantsTable.BindData bindData = (ParticipantsTable.BindData) ((bdrr) aqjwVar2.g.b()).f(((bdrr) aqjwVar2.g.b()).i(((DefaultRecipient) ((Recipient) engwVar3.get(i2))).b)).get(0);
                                engrVar.h(aqjwVar2.f.a(bindData, aqjwVar2.e.q(bindData)));
                            }
                            return engrVar.g();
                        }
                    });
                }
            }, this.l);
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

    @Override // defpackage.aqkp
    public final elfl p() {
        elfl c;
        if (this.j.isEmpty()) {
            return elfo.e(false);
        }
        aqru aqruVar = (aqru) this.j.get();
        c = axol.c(aqruVar.c, ffhe.a, ffsm.a, new aqrn(aqruVar, this, null));
        return c;
    }

    @Override // defpackage.aqkp
    public final elfl q(ConversationId conversationId, engw engwVar) {
        elfl c;
        aqmk aqmkVar = (aqmk) this.o.b();
        BugleConversationId bugleConversationId = new BugleConversationId(conversationId.b());
        engwVar.getClass();
        c = axol.c(aqmkVar.a, ffhe.a, ffsm.a, new aqmj(aqmkVar, bugleConversationId, engwVar, null));
        return c;
    }

    @Override // defpackage.aqkp
    public final elfl r(engw engwVar) {
        ekzz f = eleg.f("syncRecipientsWithChangedContacts");
        try {
            elfl a2 = ((aqqc) this.p.b()).a(engwVar);
            f.b(a2);
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

    @Override // defpackage.aqkp
    public final elfl s(enip enipVar) {
        ekzz f = eleg.f("syncRecipientsWithDeletedContacts");
        try {
            elfl b = ((aqqc) this.p.b()).b(enipVar);
            f.b(b);
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

    public final elfl t(eisx eisxVar, engw engwVar, boolean z) {
        if (this.j.isEmpty()) {
            return elfo.e(enoz.a);
        }
        Object obj = this.j.get();
        engwVar.getClass();
        aqru aqruVar = (aqru) obj;
        ffsk ffskVar = aqruVar.c;
        ffhe ffheVar = ffhe.a;
        return axol.a(ffra.b(ffskVar, ekxi.a(ffheVar), ffsm.a, new aqrs(null, aqruVar, this, eisxVar, engwVar, z)));
    }

    @Override // defpackage.aqkp
    public final elfl u(final eisx eisxVar, ConversationId conversationId) {
        return d(conversationId).b().i(new eroh() { // from class: aqhn
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                return aqjw.this.t(eisxVar, (engw) obj, false);
            }
        }, this.c);
    }

    @Override // defpackage.aqkp
    public final elfl v(final engw engwVar) {
        emxf.a(Collection.EL.stream(engwVar).allMatch(new Predicate() { // from class: aqih
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
                return ((ResolvedRecipient) obj) instanceof aqkx;
            }
        }));
        this.u.ifPresent(new Consumer() { // from class: aqij
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                cvfy cvfyVar = (cvfy) ((ffbr) obj).b();
                Stream map = Collection.EL.stream(engw.this).map(new Function() { // from class: aqjd
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        return ((aqkx) ((ResolvedRecipient) obj2)).n();
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                int i = engw.d;
                cvfyVar.c((List) map.collect(endq.a));
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        return elfo.e(null);
    }

    public final engw w(engw engwVar) {
        Stream map = Collection.EL.stream(((LinkedHashMap) Collection.EL.stream(engwVar).collect(Collectors.toMap(new Function() { // from class: aqib
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((ParticipantsTable.BindData) obj).S();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }, Function$CC.identity(), new BinaryOperator() { // from class: aqic
            public final /* synthetic */ BiFunction andThen(Function function) {
                return BiFunction$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return (ParticipantsTable.BindData) obj;
            }
        }, new Supplier() { // from class: aqid
            @Override // java.util.function.Supplier
            public final Object get() {
                return new LinkedHashMap();
            }
        }))).values()).map(new Function() { // from class: aqie
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return aqjw.this.h((ParticipantsTable.BindData) obj);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        int i = engw.d;
        return (engw) map.collect(endq.a);
    }

    public final enhk x(engw engwVar) {
        final enhd enhdVar = new enhd();
        Collection.EL.stream(engwVar).forEach(new Consumer() { // from class: aqjr
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                ParticipantsTable.BindData bindData = (ParticipantsTable.BindData) obj;
                aqkv aqkvVar = new aqkv(bindData.S());
                bindData.getClass();
                enhdVar.k(aqkvVar, aqjw.this.h(bindData));
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        return enhdVar.c();
    }

    @Override // defpackage.aqkp
    public final aqge y(engw engwVar, int i) {
        Stream map = Collection.EL.stream(engwVar).map(new Function() { // from class: aqiv
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((Recipient) obj).g();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        int i2 = engw.d;
        engw engwVar2 = (engw) map.collect(endq.a);
        aqoo aqooVar = (aqoo) this.s.b();
        errl errlVar = (errl) aqooVar.a.b();
        errlVar.getClass();
        errl errlVar2 = (errl) aqooVar.b.b();
        errlVar2.getClass();
        azei azeiVar = (azei) aqooVar.c.b();
        azeiVar.getClass();
        azaw azawVar = (azaw) aqooVar.d.b();
        azawVar.getClass();
        azaw azawVar2 = (azaw) aqooVar.e.b();
        azawVar2.getClass();
        ctbk ctbkVar = (ctbk) aqooVar.f.b();
        ctbkVar.getClass();
        engwVar2.getClass();
        return new aqon(errlVar, errlVar2, azeiVar, azawVar, azawVar2, ctbkVar, engwVar2, i);
    }

    @Override // defpackage.aqkp
    public final elfl z(final aqkv aqkvVar, cjvt cjvtVar, cjvu cjvuVar) {
        try {
            ekzz f = eleg.f("updatePhotoUriAndSource");
            try {
                Uri uri = cjvuVar.a;
                if (uri != null && !uri.toString().isEmpty() && cjvuVar.b == cjwi.PROFILE_PEOPLE_SHARING_SOURCE) {
                    uri = ((dulp) this.t.b()).a(160, uri);
                }
                bvvr f2 = ParticipantsTable.f();
                f2.ap("updatePhotoUriAndSource");
                f2.V(new Function() { // from class: aqjp
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        bvvw bvvwVar = (bvvw) obj;
                        bvvwVar.k(aqkv.this.a);
                        return bvvwVar;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                f2.M(uri);
                f2.r(cjvtVar.e);
                f2.v(cjvtVar.e);
                f2.J(cjvuVar.b);
                elfl h = f2.b().i().h(new emwl() { // from class: aqjq
                    @Override // defpackage.emwl
                    public final Object apply(Object obj) {
                        return Boolean.valueOf(((Integer) obj).intValue() == 1);
                    }
                }, this.c);
                f.b(h);
                f.close();
                return h;
            } finally {
            }
        } catch (duln unused) {
            return elfo.e(false);
        }
    }
}
