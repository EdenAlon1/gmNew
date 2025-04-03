package defpackage;

import com.android.vcard.VCardConfig;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Collection;
import j$.util.Optional;
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
/* loaded from: classes3.dex */
public final class cvft implements cvfe {
    public static final cskc a = cskc.g("Bugle", "VideoCalling");
    public final ffbr b;
    public final ffbr c;
    public final ffbr d;
    private final errl e;
    private final ffbr f;
    private final ffbr g;
    private final ffbr h;
    private final ffbr i;

    public cvft(errl errlVar, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, ffbr ffbrVar6, ffbr ffbrVar7) {
        this.e = errlVar;
        this.f = ffbrVar;
        this.b = ffbrVar2;
        this.g = ffbrVar3;
        this.c = ffbrVar4;
        this.h = ffbrVar5;
        this.i = ffbrVar6;
        this.d = ffbrVar7;
    }

    private static boolean n(int i) {
        return (i == 6 || i == 2 || i == 0) ? false : true;
    }

    private static boolean o(int i) {
        return i == 1 || i == 3;
    }

    @Override // defpackage.cvfe
    public final elfl a(ParticipantsTable.BindData bindData) {
        elfl c;
        final int t = bindData.t();
        if (t == 6) {
            throw new IllegalStateException("Video calling: participant in unsupported state");
        }
        aoku q = ((aolr) this.d.b()).q(bindData);
        switch (t) {
            case 1:
            case 3:
            case 4:
            case 5:
            case 8:
            case 10:
                a.q("Launching (DuoKit) via setupDuo()...");
                c = ((cveh) this.c.b()).c();
                break;
            case 2:
                a.q("Launching video call (ViLTE)...");
                c = elfo.e(Boolean.valueOf(((cvgd) this.g.b()).c(q)));
                break;
            case 6:
            default:
                c = elfo.e(false);
                break;
            case 7:
            case 9:
            case 11:
                a.q("Launching (DuoKit) via startCallAsync()...");
                c = ((cveh) this.c.b()).a(q);
                break;
        }
        if (j(bindData)) {
            ((adsd) this.i.b()).a(14);
        }
        return c.h(new emwl() { // from class: cvfr
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                Boolean bool = (Boolean) obj;
                if (bool == null || !bool.booleanValue()) {
                    cvft.a.n("Start call failure, not logging click.");
                    return bool;
                }
                cvft.this.m(t);
                return bool;
            }
        }, this.e).e(Throwable.class, new emwl() { // from class: cvfs
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                cvft.a.o("Start call failure, not logging click.", (Throwable) obj);
                return false;
            }
        }, this.e);
    }

    @Override // defpackage.cvfe
    public final elfl b(List list) {
        elfl c;
        Iterator it = list.iterator();
        final int i = 6;
        while (it.hasNext()) {
            i = ((ParticipantsTable.BindData) it.next()).t();
            if (i == 6) {
                throw new IllegalStateException("Video calling: participant in unsupported state");
            }
        }
        engw y = ((aolr) this.d.b()).y(list);
        switch (i) {
            case 1:
            case 3:
            case 4:
            case 5:
            case 8:
            case 10:
                a.q("Launching (DuoKit) via setupDuo()...");
                c = ((cveh) this.c.b()).c();
                break;
            case 2:
            case 6:
            default:
                c = elfo.e(false);
                break;
            case 7:
            case 9:
            case 11:
                a.q("Launching (DuoKit) via startCallAsync()...");
                c = ((cveh) this.c.b()).b(y);
                break;
        }
        ((adsd) this.i.b()).a(32);
        return c.h(new emwl() { // from class: cvfp
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                Boolean bool = (Boolean) obj;
                if (bool == null || !bool.booleanValue()) {
                    cvft.a.r("Start group call failure, not logging click.");
                    return bool;
                }
                cvft.this.m(i);
                return bool;
            }
        }, this.e).e(Throwable.class, new emwl() { // from class: cvfq
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                cvft.a.s("Start group call failure, not logging click.", (Throwable) obj);
                return false;
            }
        }, this.e);
    }

    @Override // defpackage.cvfe
    public final Optional c() {
        return Optional.of(Integer.valueOf(R.drawable.quantum_gm_ic_meet_vd_theme_24));
    }

    @Override // defpackage.cvfe
    public final void d(ParticipantsTable.BindData bindData) {
        e(engw.r(bindData));
    }

    @Override // defpackage.cvfe
    public final void e(List list) {
        if (((Boolean) cvfg.a.e()).booleanValue()) {
            List list2 = (List) Collection.EL.stream(list).filter(new Predicate() { // from class: cvfi
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
                    ParticipantsTable.BindData bindData = (ParticipantsTable.BindData) obj;
                    cfva cfvaVar = aoqm.a;
                    boolean booleanValue = ((Boolean) new aopz().get()).booleanValue();
                    cvft cvftVar = cvft.this;
                    if (booleanValue) {
                        return ((aolr) cvftVar.d.b()).q(bindData).s();
                    }
                    String U = bindData.U();
                    return U != null && ((ctvb) cvftVar.b.b()).L(U);
                }
            }).collect(Collectors.toCollection(new Supplier() { // from class: cvfj
                @Override // java.util.function.Supplier
                public final Object get() {
                    return new ArrayList();
                }
            }));
            axnw.h((((Boolean) cvfg.h.e()).booleanValue() ? ((cveh) this.c.b()).e(engw.n(list2)) : ((cvgd) this.g.b()).a(engw.n(list2)).i(new eroh() { // from class: cvfh
                @Override // defpackage.eroh
                public final ListenableFuture a(Object obj) {
                    return ((cveh) cvft.this.c.b()).e(engw.n((List) obj));
                }
            }, this.e)).h(new emwl() { // from class: cvfk
                @Override // defpackage.emwl
                public final Object apply(Object obj) {
                    Stream map = Collection.EL.stream((List) obj).map(new Function() { // from class: cvfm
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo448andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj2) {
                            return ((ParticipantsTable.BindData) obj2).S();
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    int i = engw.d;
                    final engw engwVar = (engw) map.collect(endq.a);
                    bvvr f = ParticipantsTable.f();
                    f.ap("updateReachabilityOnlyForDuoKitAndViLTE");
                    f.T(6);
                    f.V(new Function() { // from class: cvfn
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo448andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj2) {
                            bvvw bvvwVar = (bvvw) obj2;
                            bvvwVar.m(engw.this);
                            return bvvwVar;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    f.b().e();
                    return null;
                }
            }, this.e));
        }
    }

    @Override // defpackage.cvfe
    public final boolean f(ParticipantsTable.BindData bindData) {
        int t = bindData.t();
        return (t == 6 || t == 0) ? false : true;
    }

    @Override // defpackage.cvfe
    public final boolean g(List list) {
        return Collection.EL.stream(list).noneMatch(new Predicate() { // from class: cvfl
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
                return !cvft.this.f((ParticipantsTable.BindData) obj);
            }
        });
    }

    @Override // defpackage.cvfe
    public final boolean h(ParticipantsTable.BindData bindData) {
        return n(bindData.t());
    }

    @Override // defpackage.cvfe
    public final boolean i(ParticipantsTable.BindData bindData) {
        return o(bindData.t());
    }

    @Override // defpackage.cvfe
    public final boolean j(ParticipantsTable.BindData bindData) {
        int t = bindData.t();
        return o(t) || n(t) || t == 4 || t == 5;
    }

    @Override // defpackage.cvfe
    public final boolean k(List list) {
        return Collection.EL.stream(list).noneMatch(new Predicate() { // from class: cvfo
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
                return !cvft.this.j((ParticipantsTable.BindData) obj);
            }
        });
    }

    @Override // defpackage.cvfe
    public final boolean l(boolean z, boolean z2, String str) {
        return ((((Boolean) cvfg.c.e()).booleanValue() && z) || (str.equals("52") && ((Boolean) cvfg.f.e()).booleanValue())) && !z2 && ctid.e && ((cvgd) this.g.b()).b();
    }

    public final void m(int i) {
        ((akzt) this.f.b()).e("Bugle.UI.VideoCallButton.Clicked", i);
        eolu eoluVar = (eolu) eolv.a.createBuilder();
        eolt eoltVar = eolt.BUGLE_VIDEO_CALL_EVENT;
        eoluVar.copyOnWrite();
        eolv eolvVar = (eolv) eoluVar.instance;
        eolvVar.j = eoltVar.dk;
        eolvVar.b |= 1;
        eovs eovsVar = (eovs) eovu.a.createBuilder();
        eovsVar.copyOnWrite();
        eovu eovuVar = (eovu) eovsVar.instance;
        eovuVar.c = cvfc.a(i) - 1;
        eovuVar.b |= 1;
        eovu eovuVar2 = (eovu) eovsVar.build();
        eoluVar.copyOnWrite();
        eolv eolvVar2 = (eolv) eoluVar.instance;
        eovuVar2.getClass();
        eolvVar2.ac = eovuVar2;
        eolvVar2.c |= VCardConfig.FLAG_APPEND_TYPE_PARAM;
        ((akxl) this.h.b()).j(eoluVar);
    }
}
