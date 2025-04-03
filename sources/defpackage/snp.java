package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import androidx.car.app.messaging.model.CarMessage;
import androidx.car.app.messaging.model.ConversationCallbackDelegateImpl;
import androidx.car.app.messaging.model.ConversationItem;
import androidx.car.app.model.Action;
import androidx.car.app.model.CarIcon;
import androidx.car.app.model.CarText;
import androidx.car.app.model.Row;
import androidx.core.graphics.drawable.IconCompat;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.api.messaging.Conversation;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Collection;
import j$.util.Objects;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Stream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class snp extends cfl {
    public static final enru d = enru.c("com/google/android/apps/messaging/auto/MessagingTemplateScreen");
    static final ecda e = new ecda("Auto.LoadConversationScreenLatency");
    public final Context f;
    public ctbx g;
    public final ffbr h;
    public final ffbr i;
    public final ffbr j;
    public final ffbr k;
    public final ffbr l;
    public final errl m;
    public final AtomicReference n;
    public final AtomicBoolean o;
    public final sno p;
    public final ffbr q;
    private final ffbr r;
    private final ffbr s;
    private final aqge t;

    public snp(Context context, ffbr ffbrVar, errl errlVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, ffbr ffbrVar6, ffbr ffbrVar7, ffbr ffbrVar8, cex cexVar) {
        super(cexVar);
        this.n = new AtomicReference(Optional.empty());
        this.o = new AtomicBoolean(false);
        this.f = context;
        this.h = ffbrVar;
        this.m = errlVar;
        this.k = ffbrVar2;
        this.l = ffbrVar3;
        this.r = ffbrVar4;
        this.i = ffbrVar5;
        this.q = ffbrVar6;
        this.j = ffbrVar7;
        this.s = ffbrVar8;
        ensk e2 = d.e();
        e2.Y(ente.a, "BugleAppOnAuto");
        ((enrr) ((enrr) e2).h("com/google/android/apps/messaging/auto/MessagingTemplateScreen", "<init>", 155, "MessagingTemplateScreen.java")).q("Creating a MessagingTemplateScreen and getting top convos");
        aqge D = ((alxl) ffbrVar2.b()).D(10);
        this.t = D;
        sno snoVar = new sno(this);
        this.p = snoVar;
        this.g = D.a(snoVar);
    }

    private final void f() {
        axnw.h(this.t.b().i(new eroh() { // from class: smy
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                final engw engwVar = (engw) obj;
                final ArrayList arrayList = new ArrayList();
                Stream stream = Collection.EL.stream(engwVar);
                final snp snpVar = snp.this;
                stream.forEach(new Consumer() { // from class: sne
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void o(Object obj2) {
                        alxn alxnVar = (alxn) obj2;
                        final ConversationId c = alxnVar.c();
                        final snp snpVar2 = snp.this;
                        Conversation a = ((alxl) snpVar2.k.b()).a(c, alxk.MINIMAL);
                        List list = arrayList;
                        try {
                            final snm snmVar = new snm(snpVar2, a);
                            final String e2 = alxnVar.e();
                            final Uri b = alxnVar.b();
                            final elfl h = a.h().b().h(new emwl() { // from class: sng
                                @Override // defpackage.emwl
                                public final Object apply(Object obj3) {
                                    alxj alxjVar = (alxj) obj3;
                                    alxi b2 = alxjVar.b();
                                    alxi alxiVar = alxi.GROUP;
                                    aqux f = alxjVar.f();
                                    knq knqVar = new knq();
                                    if (f == null) {
                                        ensk j = snp.d.j();
                                        j.Y(ente.a, "BugleAppOnAuto");
                                        ((enrr) ((enrr) j).h("com/google/android/apps/messaging/auto/MessagingTemplateScreen", "convertPropertiesToPropertiesMetadata", 491, "MessagingTemplateScreen.java")).q("Unable to retrieve selfId from ConversationProperties, using fallback");
                                        knqVar.d = "-1";
                                    } else {
                                        knqVar.d = f.g().b();
                                    }
                                    snp snpVar3 = snp.this;
                                    boolean z = b2 == alxiVar;
                                    knqVar.a = snpVar3.e(f);
                                    return new snn(z, new knr(knqVar), f);
                                }
                            }, snpVar2.m);
                            final elfl h2 = a.c().N().h(new emwl() { // from class: snh
                                @Override // defpackage.emwl
                                public final Object apply(Object obj3) {
                                    Stream filter = Collection.EL.stream(((engw) obj3).a()).filter(new Predicate() { // from class: snb
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
                                        public final boolean test(Object obj4) {
                                            alxr alxrVar = (alxr) obj4;
                                            return (alxrVar.g() instanceof appw) || (alxrVar.g() instanceof apmq);
                                        }
                                    });
                                    final snp snpVar3 = snp.this;
                                    return (engw) filter.map(new Function() { // from class: snc
                                        @Override // java.util.function.Function
                                        /* renamed from: andThen */
                                        public final /* synthetic */ Function mo448andThen(Function function) {
                                            return Function$CC.$default$andThen(this, function);
                                        }

                                        @Override // java.util.function.Function
                                        public final Object apply(Object obj4) {
                                            alxr alxrVar = (alxr) obj4;
                                            cgq cgqVar = new cgq();
                                            appj g = alxrVar.g();
                                            boolean z = g instanceof apmq;
                                            snp snpVar4 = snp.this;
                                            if (z) {
                                                apmq apmqVar = (apmq) g;
                                                String b2 = apmqVar.b();
                                                String string = snpVar4.f.getString(cuww.a(b2));
                                                cgqVar.c = b2;
                                                cgqVar.d = apmqVar.e();
                                                cgqVar.b = CarText.create(string);
                                            } else if (g instanceof appw) {
                                                cgqVar.b = CarText.create(((appw) g).c());
                                            }
                                            alya d2 = alxrVar.d();
                                            int d3 = d2.d();
                                            knq knqVar = new knq();
                                            if (d3 == 2 && (d2 instanceof alyn)) {
                                                aqux c2 = ((alyn) d2).c();
                                                knqVar.a = snpVar4.e(c2);
                                                knqVar.d = c2.g().b();
                                            } else {
                                                if (!(d2 instanceof alxp)) {
                                                    ensk e3 = snp.d.e();
                                                    e3.Y(ente.a, "BugleAppOnAuto");
                                                    ((enrr) ((enrr) e3).h("com/google/android/apps/messaging/auto/MessagingTemplateScreen", "convertMessageToCarMessage", 546, "MessagingTemplateScreen.java")).q("Skipping system generated message");
                                                    return null;
                                                }
                                                alxp alxpVar = (alxp) d2;
                                                knqVar.a = alxpVar.a().x(true);
                                                knqVar.d = alxpVar.a().F().a;
                                            }
                                            cgqVar.a = new knr(knqVar);
                                            cgqVar.e = alxrVar.n().toEpochMilli();
                                            cgqVar.f = alxrVar.x();
                                            String str = cgqVar.c;
                                            if ((cgqVar.d == null) ^ (str == null)) {
                                                throw new IllegalStateException("Incomplete multimedia data detected in CarMessage. Please be sure to provide both MIME type and URI for multimedia messages.");
                                            }
                                            if (cgqVar.b == null && str == null) {
                                                throw new IllegalStateException("Message must have content. Please provide body text, multimedia data (URI + MIME type), or both.");
                                            }
                                            return new CarMessage(cgqVar);
                                        }

                                        public final /* synthetic */ Function compose(Function function) {
                                            return Function$CC.$default$compose(this, function);
                                        }
                                    }).filter(new Predicate() { // from class: snd
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
                                        public final boolean test(Object obj4) {
                                            return Objects.nonNull((CarMessage) obj4);
                                        }
                                    }).collect(endq.a);
                                }
                            }, snpVar2.m);
                            list.add(elfo.m(h2, h).a(new Callable() { // from class: sni
                                @Override // java.util.concurrent.Callable
                                public final Object call() {
                                    Uri uri = b;
                                    cgr cgrVar = snmVar;
                                    ConversationId conversationId = c;
                                    elfl elflVar = h2;
                                    elfl elflVar2 = h;
                                    snp snpVar3 = snp.this;
                                    try {
                                        snn snnVar = (snn) erqt.q(elflVar2);
                                        List list2 = (List) erqt.q(elflVar);
                                        if (list2.isEmpty()) {
                                            return Optional.empty();
                                        }
                                        cgw cgwVar = new cgw();
                                        aqux aquxVar = snnVar.c;
                                        Optional m = aquxVar != null ? aquxVar.m() : Optional.empty();
                                        boolean isPresent = m.isPresent();
                                        String str = e2;
                                        if (isPresent) {
                                            Bitmap b2 = ((crpr) snpVar3.i.b()).b(snpVar3.f, ((crji) snpVar3.j.b()).g(uri, str, (aoku) m.get(), null, false, false, false), 224, 224, 0, true);
                                            if (b2 != null) {
                                                IconCompat g = IconCompat.g(b2);
                                                cjm.a.b(g);
                                                cgwVar.d = new CarIcon(g, null, 1);
                                            }
                                        }
                                        cgwVar.f = list2;
                                        cgwVar.b = CarText.create(str);
                                        cgwVar.e = snnVar.a;
                                        cgwVar.g = new ConversationCallbackDelegateImpl(cgrVar);
                                        cgwVar.a = conversationId.b();
                                        cgwVar.c = snnVar.b;
                                        return Optional.of(new ConversationItem(cgwVar));
                                    } catch (ExecutionException e3) {
                                        throw new IllegalStateException("Failed to retrieve ConversationPropertiesMetaData or CarMessages", e3);
                                    }
                                }
                            }, snpVar2.m));
                            a.close();
                        } finally {
                        }
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
                return elfo.l(arrayList).a(new Callable() { // from class: snf
                    /* JADX WARN: Removed duplicated region for block: B:43:0x0151  */
                    /* JADX WARN: Removed duplicated region for block: B:49:0x015e  */
                    @Override // java.util.concurrent.Callable
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Object call() {
                        /*
                            Method dump skipped, instructions count: 452
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: defpackage.snf.call():java.lang.Object");
                    }
                }, snpVar.m);
            }
        }, this.m).h(new emwl() { // from class: smz
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                snp snpVar = snp.this;
                snpVar.n.set((Optional) obj);
                snpVar.c();
                return (Optional) snpVar.n.get();
            }
        }, this.m));
    }

    /* JADX WARN: Type inference failed for: r0v27, types: [cjg, java.lang.Object] */
    @Override // defpackage.cfl
    public final cjg a() {
        boolean z;
        try {
            if (((asgw) this.s.b()).a()) {
                ((akzt) this.h.b()).c("Bugle.Auto.App.TemplateRetrieval");
            }
            cht d2 = d();
            d2.a = true;
            Optional of = Optional.of(d2.a());
            AtomicReference atomicReference = this.n;
            Optional empty = Optional.empty();
            while (true) {
                if (atomicReference.compareAndSet(empty, of)) {
                    z = true;
                    break;
                }
                if (atomicReference.get() != empty) {
                    z = false;
                    break;
                }
            }
            ensk e2 = d.e();
            e2.Y(ente.a, "BugleAppOnAuto");
            ((enrr) ((enrr) e2).h("com/google/android/apps/messaging/auto/MessagingTemplateScreen", "getTemplateInternal", 209, "MessagingTemplateScreen.java")).I("Retrieving a car template isRefresh: %b isLoading %b", this.o.get(), z);
            if (z) {
                ((ecrj) this.r.b()).e(e);
                f();
                return of.get();
            }
            if (this.o.compareAndSet(true, false)) {
                f();
            }
            ecrj ecrjVar = (ecrj) this.r.b();
            ecda ecdaVar = e;
            ecrjVar.g(ecdaVar, ecdaVar, null, ecrh.SUCCESS);
            return (cjg) ((Optional) this.n.get()).get();
        } catch (Exception e3) {
            ensk j = d.j();
            j.Y(ente.a, "BugleAppOnAuto");
            ((enrr) ((enrr) ((enrr) j).g(e3)).h("com/google/android/apps/messaging/auto/MessagingTemplateScreen", "onGetTemplate", (char) 189, "MessagingTemplateScreen.java")).q("Failed to load conversations for Auto");
            ((akzt) this.h.b()).c("Bugle.Auto.App.ErrorScreen");
            cht d3 = d();
            d3.a = false;
            chq chqVar = new chq();
            cip cipVar = new cip();
            String string = this.f.getString(R.string.error_screen);
            string.getClass();
            CarText create = CarText.create(string);
            if (create.isEmpty()) {
                throw new IllegalArgumentException("The title cannot be null or empty");
            }
            cjn.e.a(create);
            cipVar.b = create;
            if (cipVar.b == null) {
                throw new IllegalStateException("A title must be set on the row");
            }
            chqVar.b(new Row(cipVar));
            d3.b(chqVar.a());
            return d3.a();
        }
    }

    public final cht d() {
        cht chtVar = new cht();
        Action action = Action.APP_ICON;
        cjk cjkVar = cjk.a;
        action.getClass();
        cjkVar.a(Collections.singletonList(action));
        chtVar.e = action;
        String string = this.f.getResources().getString(R.string.app_name);
        string.getClass();
        chtVar.d = CarText.create(string);
        cjn.d.a(chtVar.d);
        return chtVar;
    }

    public final String e(aqux aquxVar) {
        if (aquxVar == null || aquxVar.q() == null) {
            return this.f.getString(R.string.self_name_fallback);
        }
        String q = aquxVar.q();
        q.getClass();
        return q;
    }
}
