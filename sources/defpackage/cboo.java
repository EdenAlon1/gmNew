package defpackage;

import android.database.Cursor;
import android.database.MatrixCursor;
import android.database.MergeCursor;
import android.os.CancellationSignal;
import android.text.TextUtils;
import androidx.car.app.model.Alert;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.search.common.SearchQuery;
import j$.util.Collection;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import j$.util.stream.Stream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cboo implements cbnj {
    public static final entd a = entd.c("BugleSearch");
    public final cbpl b;
    private final cbsf c;
    private final cbmp d;
    private final errl e;

    public cboo(cbsf cbsfVar, cbmp cbmpVar, cbpl cbplVar, errl errlVar) {
        this.c = cbsfVar;
        this.d = cbmpVar;
        this.b = cbplVar;
        this.e = errlVar;
    }

    private final elfl d(cbov cbovVar, final cbpa cbpaVar, CancellationSignal cancellationSignal) {
        elfl g;
        if (!cbovVar.c() && !cbovVar.e() && !cbovVar.f) {
            boolean z = (!cbovVar.d || cbovVar.e == 6) && cbovVar.d();
            boolean z2 = cbovVar.d && cbovVar.e == 6 && !cbovVar.d();
            if (z || z2) {
                int intValue = ((Integer) cbovVar.b().map(new Function() { // from class: cbnx
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return Integer.valueOf(((cboy) obj).b());
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }).orElse(Integer.valueOf(Alert.DURATION_SHOW_INDEFINITELY))).intValue();
                if (cbovVar.d()) {
                    g = this.d.a(cbovVar.a, intValue, cancellationSignal);
                } else if (cbovVar.e()) {
                    cbmp cbmpVar = this.d;
                    final String str = cbovVar.c;
                    if (TextUtils.isEmpty(str)) {
                        int i = engw.d;
                        g = elfo.e(enou.a);
                    } else {
                        final cbmu cbmuVar = (cbmu) cbmpVar;
                        g = elfo.g(new Callable() { // from class: cbmr
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                List singletonList = Collections.singletonList(str);
                                csix.h();
                                cbmu cbmuVar2 = cbmu.this;
                                csqw csqwVar = cbmuVar2.b;
                                Cursor a2 = csqwVar.d(singletonList).a();
                                Cursor a3 = csqwVar.c(singletonList).a();
                                if (a2 != null && a3 != null) {
                                    a2 = new MergeCursor(new Cursor[]{a2, a3});
                                } else if (a2 == null) {
                                    a2 = a3 != null ? a3 : new MatrixCursor(new String[0]);
                                }
                                return cbmuVar2.b(a2, true, Alert.DURATION_SHOW_INDEFINITELY);
                            }
                        }, cbmuVar.c);
                    }
                } else {
                    final cbmu cbmuVar2 = (cbmu) this.d;
                    g = elfo.g(new Callable() { // from class: cbmt
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            cbmu cbmuVar3 = cbmu.this;
                            return cbmuVar3.b(cbmuVar3.b.e().a(), true, Alert.DURATION_SHOW_INDEFINITELY);
                        }
                    }, cbmuVar2.c);
                }
                return g.h(new emwl() { // from class: cbny
                    @Override // defpackage.emwl
                    public final Object apply(Object obj) {
                        entd entdVar = cboo.a;
                        cbpa.this.b((List) obj);
                        return null;
                    }
                }, this.e);
            }
        }
        return elfo.e(null);
    }

    private final elfl e(final cbov cbovVar, final cbpa cbpaVar) {
        return elfo.g(new Callable() { // from class: cbnv
            @Override // java.util.concurrent.Callable
            public final Object call() {
                cbsx cbsxVar = cbovVar.h;
                cbsxVar.getClass();
                cbpaVar.c(cboo.this.b.f(cbsxVar.c));
                return null;
            }
        }, this.e);
    }

    private final elfl f(elfl elflVar, final cbov cbovVar, final cbpa cbpaVar) {
        if ((!cbovVar.d() && !cbovVar.e()) || cbovVar.c() || ((cbovVar.d && cbovVar.e != 1) || cbovVar.f)) {
            return elfo.e(null);
        }
        final Function function = new Function() { // from class: cboa
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function2) {
                return Function$CC.$default$andThen(this, function2);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                cbov cbovVar2 = cbovVar;
                cbne cbneVar = (cbne) obj;
                if ((cbneVar == null || cbneVar.f()) && !TextUtils.isEmpty(cbovVar2.a)) {
                    return null;
                }
                cboo cbooVar = cboo.this;
                cbnb h = cbooVar.b.h(cbovVar2.c, cbneVar, ((Integer) cbovVar2.b().map(new Function() { // from class: cbnp
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function2) {
                        return Function$CC.$default$andThen(this, function2);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        return Integer.valueOf(((cboy) obj2).a());
                    }

                    public final /* synthetic */ Function compose(Function function2) {
                        return Function$CC.$default$compose(this, function2);
                    }
                }).orElse(Integer.valueOf(Alert.DURATION_SHOW_INDEFINITELY))).intValue());
                if (h == null) {
                    return null;
                }
                cbpaVar.c(h);
                return null;
            }

            public final /* synthetic */ Function compose(Function function2) {
                return Function$CC.$default$compose(this, function2);
            }
        };
        return elflVar.h(new cboj(function), this.e).e(cbsr.class, new emwl() { // from class: cbob
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                Object apply;
                entd entdVar = cboo.a;
                apply = Function.this.apply(((cbsr) obj).a);
                return (Void) apply;
            }
        }, this.e);
    }

    private final elfl g(final cbov cbovVar, final cbpa cbpaVar) {
        return (cbovVar.d() || (cbovVar.d && cbovVar.e != 2)) ? elfo.e(null) : elfo.g(new Callable() { // from class: cbnk
            @Override // java.util.concurrent.Callable
            public final Object call() {
                cbov cbovVar2 = cbovVar;
                cbpaVar.d(cboo.this.b.r(cbovVar2.b, cbovVar2.c, cbovVar2.f, ((Integer) cbovVar2.b().map(new Function() { // from class: cboc
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return Integer.valueOf(((cboy) obj).f());
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }).orElse(Integer.valueOf(Alert.DURATION_SHOW_INDEFINITELY))).intValue()).cY(new cbnt()));
                return null;
            }
        }, this.e);
    }

    private final elfl h(elfl elflVar, final cbov cbovVar, final cbpa cbpaVar) {
        if (cbovVar.d && cbovVar.e != 4) {
            return elfo.e(null);
        }
        final Function function = new Function() { // from class: cboi
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function2) {
                return Function$CC.$default$andThen(this, function2);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                cbov cbovVar2 = cbovVar;
                cbne cbneVar = (cbne) obj;
                if ((cbneVar == null || cbneVar.a().isEmpty()) && !TextUtils.isEmpty(cbovVar2.a)) {
                    return null;
                }
                cbpa cbpaVar2 = cbpaVar;
                cboo cbooVar = cboo.this;
                cbpaVar2.e(cbooVar.b.n(cbovVar2.b, cbovVar2.c, cbneVar, cbovVar2.f, ((Integer) cbovVar2.b().map(new Function() { // from class: cbnz
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function2) {
                        return Function$CC.$default$andThen(this, function2);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        return Integer.valueOf(((cboy) obj2).c());
                    }

                    public final /* synthetic */ Function compose(Function function2) {
                        return Function$CC.$default$compose(this, function2);
                    }
                }).orElse(Integer.valueOf(Alert.DURATION_SHOW_INDEFINITELY))).intValue()));
                return null;
            }

            public final /* synthetic */ Function compose(Function function2) {
                return Function$CC.$default$compose(this, function2);
            }
        };
        return elflVar.h(new cboj(function), this.e).e(cbsr.class, new emwl() { // from class: cbok
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                cbsr cbsrVar = (cbsr) obj;
                ((ensz) ((ensz) ((ensz) cboo.a.j()).g(cbsrVar)).h("com/google/android/apps/messaging/shared/datamodel/search/common/MessageSearchApiImpl", "loadLinksAsync", (char) 455, "MessageSearchApiImpl.java")).q("Failure occurred while handling link results from Icing. Continuing with partial results.");
                Function.this.apply(cbsrVar.a);
                return null;
            }
        }, this.e);
    }

    private final elfl i(elfl elflVar, final cbov cbovVar, final cbpa cbpaVar) {
        if (cbovVar.d && cbovVar.e != 5) {
            return elfo.e(null);
        }
        final Function function = new Function() { // from class: cbod
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function2) {
                return Function$CC.$default$andThen(this, function2);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                cbov cbovVar2 = cbovVar;
                cbne cbneVar = (cbne) obj;
                if ((cbneVar == null || cbneVar.b().isEmpty()) && !TextUtils.isEmpty(cbovVar2.a)) {
                    return null;
                }
                cbpa cbpaVar2 = cbpaVar;
                cboo cbooVar = cboo.this;
                cbpaVar2.f(cbooVar.b.j(cbovVar2.b, cbovVar2.c, cbneVar, cbovVar2.f));
                return null;
            }

            public final /* synthetic */ Function compose(Function function2) {
                return Function$CC.$default$compose(this, function2);
            }
        };
        return elflVar.h(new cboj(function), this.e).e(cbsr.class, new emwl() { // from class: cboe
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                cbsr cbsrVar = (cbsr) obj;
                ((ensz) ((ensz) ((ensz) cboo.a.j()).g(cbsrVar)).h("com/google/android/apps/messaging/shared/datamodel/search/common/MessageSearchApiImpl", "loadLocationsAsync", (char) 411, "MessageSearchApiImpl.java")).q("Failure occurred while handling location results from Icing. Continuing with partial results.");
                Function.this.apply(cbsrVar.a);
                return null;
            }
        }, this.e);
    }

    private final elfl j(elfl elflVar, cbov cbovVar, final cbpa cbpaVar) {
        if (!cbovVar.d() || !cbovVar.c()) {
            return elfo.e(null);
        }
        final ConversationIdType conversationIdType = cbovVar.b;
        conversationIdType.getClass();
        final Function function = new Function() { // from class: cbol
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function2) {
                return Function$CC.$default$andThen(this, function2);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                cbne cbneVar = (cbne) obj;
                if (cbneVar == null || cbneVar.f()) {
                    return null;
                }
                cbpa cbpaVar2 = cbpaVar;
                ConversationIdType conversationIdType2 = conversationIdType;
                cboo cbooVar = cboo.this;
                Stream map = Collection.EL.stream((List) Collection.EL.stream(cbooVar.b.k(conversationIdType2, cbneVar.c())).map(new Function() { // from class: cbof
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function2) {
                        return Function$CC.$default$andThen(this, function2);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        entd entdVar = cboo.a;
                        return ((MessageIdType) obj2).b();
                    }

                    public final /* synthetic */ Function compose(Function function2) {
                        return Function$CC.$default$compose(this, function2);
                    }
                }).collect(Collectors.toCollection(new Supplier() { // from class: cbog
                    @Override // java.util.function.Supplier
                    public final Object get() {
                        return new ArrayList();
                    }
                }))).map(new Function() { // from class: cboh
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function2) {
                        return Function$CC.$default$andThen(this, function2);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        return Long.valueOf(Long.parseLong((String) obj2));
                    }

                    public final /* synthetic */ Function compose(Function function2) {
                        return Function$CC.$default$compose(this, function2);
                    }
                });
                int i = engw.d;
                cbpaVar2.g((List) map.collect(endq.a));
                return null;
            }

            public final /* synthetic */ Function compose(Function function2) {
                return Function$CC.$default$compose(this, function2);
            }
        };
        return elflVar.h(new cboj(function), this.e).e(cbsr.class, new emwl() { // from class: cbom
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                cbsr cbsrVar = (cbsr) obj;
                ((ensz) ((ensz) ((ensz) cboo.a.j()).g(cbsrVar)).h("com/google/android/apps/messaging/shared/datamodel/search/common/MessageSearchApiImpl", "loadMessagesInConversationAsync", (char) 251, "MessageSearchApiImpl.java")).q("Failure occurred while handling message results from Icing. Continuing with partial results.");
                Function.this.apply(cbsrVar.a);
                return null;
            }
        }, this.e);
    }

    private final elfl k(elfl elflVar, final cbov cbovVar, final cbpa cbpaVar) {
        if (!cbovVar.f || (cbovVar.d && cbovVar.e != 7)) {
            return elfo.e(null);
        }
        final Function function = new Function() { // from class: cbnq
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function2) {
                return Function$CC.$default$andThen(this, function2);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                java.util.Collection c;
                cbov cbovVar2 = cbovVar;
                cbne cbneVar = (cbne) obj;
                if ((cbneVar == null || cbneVar.c().isEmpty()) && !TextUtils.isEmpty(cbovVar2.a)) {
                    return null;
                }
                cboo cbooVar = cboo.this;
                ConversationIdType conversationIdType = cbovVar2.b;
                String str = cbovVar2.c;
                if (cbneVar == null) {
                    int i = engw.d;
                    c = enou.a;
                } else {
                    c = cbneVar.c();
                }
                cbpaVar.h(cbooVar.b.i(conversationIdType, str, c, ((Integer) cbovVar2.b().map(new Function() { // from class: cbno
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function2) {
                        return Function$CC.$default$andThen(this, function2);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        return Integer.valueOf(((cboy) obj2).g());
                    }

                    public final /* synthetic */ Function compose(Function function2) {
                        return Function$CC.$default$compose(this, function2);
                    }
                }).orElse(Integer.valueOf(Alert.DURATION_SHOW_INDEFINITELY))).intValue()));
                return null;
            }

            public final /* synthetic */ Function compose(Function function2) {
                return Function$CC.$default$compose(this, function2);
            }
        };
        return elflVar.h(new cboj(function), this.e).e(cbsr.class, new emwl() { // from class: cbnr
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                cbsr cbsrVar = (cbsr) obj;
                ((ensz) ((ensz) ((ensz) cboo.a.j()).g(cbsrVar)).h("com/google/android/apps/messaging/shared/datamodel/search/common/MessageSearchApiImpl", "loadStarredTexts", (char) 210, "MessageSearchApiImpl.java")).q("Failure occurred while handling starred results from Icing. Continuing with partial results.");
                Function.this.apply(cbsrVar.a);
                return null;
            }
        }, this.e);
    }

    private final elfl l(final cbov cbovVar, final cbpa cbpaVar) {
        return (cbovVar.d() || (cbovVar.d && cbovVar.e != 3)) ? elfo.e(null) : elfo.g(new Callable() { // from class: cbnn
            @Override // java.util.concurrent.Callable
            public final Object call() {
                cbov cbovVar2 = cbovVar;
                cbpaVar.i(cboo.this.b.t(cbovVar2.b, cbovVar2.c, cbovVar2.f, ((Integer) cbovVar2.b().map(new Function() { // from class: cbns
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return Integer.valueOf(((cboy) obj).h());
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }).orElse(Integer.valueOf(Alert.DURATION_SHOW_INDEFINITELY))).intValue()).cY(new cbnt()));
                return null;
            }
        }, this.e);
    }

    private final elfl m(SearchQuery searchQuery, cbov cbovVar) {
        int i;
        return (!cbovVar.d() || (cbovVar.d && ((i = cbovVar.e) == 2 || i == 3 || i == 6))) ? elfo.e(cbne.e()) : elfl.g(this.c.a(searchQuery));
    }

    @Override // defpackage.cbnj
    public final elfl a(SearchQuery searchQuery) {
        cbov a2 = cbov.a(searchQuery);
        if (a2.f()) {
            return elfo.e(cbpb.j().a());
        }
        boolean z = a2.g;
        final cbpa j = cbpb.j();
        if (z) {
            return e(a2, j).h(new emwl() { // from class: cbnu
                @Override // defpackage.emwl
                public final Object apply(Object obj) {
                    entd entdVar = cboo.a;
                    return cbpa.this.a();
                }
            }, this.e);
        }
        elfl m = m(searchQuery, a2);
        return elfo.b(f(m, a2, j), j(m, a2, j), g(a2, j), l(a2, j), i(m, a2, j), h(m, a2, j), d(a2, j, null), k(m, a2, j)).h(new emwl() { // from class: cbnw
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                entd entdVar = cboo.a;
                return cbpa.this.a();
            }
        }, this.e);
    }

    @Override // defpackage.cbnj
    public final elfl b(SearchQuery searchQuery, CancellationSignal cancellationSignal) {
        cbov a2 = cbov.a(searchQuery);
        if (a2.f()) {
            return elfo.e(cbpb.j().a());
        }
        boolean z = a2.g;
        final cbpa j = cbpb.j();
        if (z) {
            return e(a2, j).h(new emwl() { // from class: cbnl
                @Override // defpackage.emwl
                public final Object apply(Object obj) {
                    entd entdVar = cboo.a;
                    return cbpa.this.a();
                }
            }, this.e);
        }
        elfl m = m(searchQuery, a2);
        return elfo.b(f(m, a2, j), j(m, a2, j), g(a2, j), l(a2, j), i(m, a2, j), h(m, a2, j), d(a2, j, cancellationSignal), k(m, a2, j)).h(new emwl() { // from class: cbnm
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                entd entdVar = cboo.a;
                return cbpa.this.a();
            }
        }, this.e);
    }

    @Override // defpackage.cbnj
    public final cbon c(SearchQuery searchQuery) {
        return new cbon(cbov.a(searchQuery));
    }
}
