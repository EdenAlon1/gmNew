package defpackage;

import android.text.TextUtils;
import com.google.android.ims.rcsservice.chatsession.message.groupmanagement.GroupManagementContentType;
import com.google.android.rcs.client.messaging.data.AutoValue_Conversation;
import com.google.android.rcs.client.messaging.data.Conversation;
import com.google.android.rcs.client.messaging.data.GroupMember;
import com.google.android.rcs.client.messaging.data.RcsDestinationId;
import com.google.common.util.concurrent.ListenableFuture;
import j$.time.Instant;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import java.io.IOException;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class djcg extends dkji implements dkhk {
    private final errl f;
    private final dkgw g;
    private final ctvb h;
    private final eehz i;
    private final ffbr j;
    private final dkkj k;
    private dilk l;
    private dkhi m;
    public static final diyy a = diyv.b("ignore_group_notifications_with_state_deleted");
    private static final diyy c = dizd.a(177836135);
    private static final diyy d = dizd.a(160405329);
    public static final diyy b = diyv.b("ignore_group_notifications_after_leaving");
    private static final enip e = new enpx("application/conference-info+xml");

    public djcg(errl errlVar, dkgw dkgwVar, ctvb ctvbVar, eehz eehzVar, ffbr ffbrVar, dkkj dkkjVar) {
        this.f = errlVar;
        this.g = dkgwVar;
        this.h = ctvbVar;
        this.i = eehzVar;
        this.j = ffbrVar;
        this.k = dkkjVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final djgb w() {
        Conversation d2 = djhf.d(this.k);
        dilk dilkVar = this.l;
        dilkVar.getClass();
        AutoValue_Conversation autoValue_Conversation = (AutoValue_Conversation) d2;
        String a2 = autoValue_Conversation.a.a();
        String b2 = ((Boolean) c.a()).booleanValue() ? (String) dilkVar.a.flatMap(new Function() { // from class: djcb
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((dilf) obj).b;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).orElse(this.k.q) : dilkVar.a.isPresent() ? emxe.b((String) ((dilf) dilkVar.a.get()).b.orElse(null)) : "";
        final eiei eieiVar = new eiei();
        eieiVar.d(autoValue_Conversation.b);
        eieiVar.b(a2);
        eieiVar.e(b2);
        dilkVar.a.flatMap(new Function() { // from class: djcc
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((dilf) obj).c;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).ifPresent(new Consumer() { // from class: djcd
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                RcsDestinationId a3;
                dimc dimcVar = (dimc) obj;
                diyy diyyVar = djcg.a;
                final eiev eievVar = new eiev();
                try {
                    String str = dimcVar.a;
                    if (str.startsWith("sip:")) {
                        eieu eieuVar = new eieu();
                        eieuVar.b(str);
                        eieuVar.c(2);
                        a3 = eieuVar.a();
                    } else {
                        if (!str.startsWith("tel:")) {
                            throw new IllegalArgumentException("URI format not supported");
                        }
                        eieu eieuVar2 = new eieu();
                        eieuVar2.b(str.substring(4));
                        eieuVar2.c(1);
                        a3 = eieuVar2.a();
                    }
                    eievVar.b(a3);
                } catch (IllegalArgumentException unused) {
                }
                eift eiftVar = eift.this;
                dimcVar.b.ifPresent(new Consumer() { // from class: eihi
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void o(Object obj2) {
                        eihk.this.c(Instant.ofEpochMilli(((dktc) obj2).a));
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
                eiftVar.f(eievVar.a());
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        dimh dimhVar = dilkVar.d;
        int size = dimhVar.size();
        for (int i = 0; i < size; i++) {
            dimg dimgVar = (dimg) dimhVar.get(i);
            final eifv f = GroupMember.f();
            f.b(emxe.b(dimgVar.a));
            f.c(djhf.e(dimgVar.g));
            f.f(dimgVar.b().filter(new Predicate() { // from class: dimf
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
                    dils dilsVar = (dils) obj;
                    if (dilsVar.c.equals(dilt.PENDING)) {
                        return true;
                    }
                    return ((Boolean) dilh.a.a()).booleanValue() && dilsVar.c.equals(dilt.DISCONNECTED) && dilsVar.f.equals(dilr.FAILED);
                }
            }).isPresent() ? eifw.PENDING : dimgVar.g() ? eifw.PRESENT : eifw.ABSENT);
            if (((Boolean) djag.a().a.b.a()).booleanValue()) {
                (dimgVar.f.isEmpty() ? Optional.empty() : ((dils) dimgVar.f.get(0)).b.map(new Function() { // from class: djbx
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        diyy diyyVar = djcg.a;
                        return ((dilu) obj).d;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                })).ifPresent(new Consumer() { // from class: djby
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void o(Object obj) {
                        diyy diyyVar = djcg.a;
                        eifv.this.e(djhf.e((String) obj));
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
            }
            GroupMember a3 = f.a();
            if (eieiVar.a == null) {
                if (eieiVar.b == null) {
                    int i2 = engw.d;
                    eieiVar.a = new engr();
                } else {
                    int i3 = engw.d;
                    eieiVar.a = new engr();
                    eieiVar.a.j(eieiVar.b);
                    eieiVar.b = null;
                }
            }
            eieiVar.a.h(a3);
        }
        if (((Boolean) d.a()).booleanValue()) {
            enip aA = this.k.aA();
            Optional map = dilkVar.a.map(new Function() { // from class: djce
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return ((dilf) obj).e;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            eiel eielVar = new eiel();
            eielVar.d(false);
            eielVar.c(false);
            eielVar.b(false);
            eiel eielVar2 = new eiel(eielVar.a());
            if (map.isPresent()) {
                if (((String) map.get()).contains("rem-admin")) {
                    eielVar2.b(true);
                } else if (((String) map.get()).contains("rem-all")) {
                    eielVar2.c(true);
                }
            }
            eielVar2.d(aA.contains(GroupManagementContentType.CONTENT_TYPE));
            eieiVar.c(eielVar2.a());
        }
        djfy djfyVar = new djfy();
        eiek eiekVar = new eiek();
        eiekVar.b(d2);
        eiekVar.d(eieiVar.a());
        djfyVar.a = eiekVar.e();
        return djfyVar.a();
    }

    private final Optional x(dilk dilkVar, String str, byte[] bArr) {
        Optional of;
        if (((Boolean) a.a()).booleanValue()) {
            dilk a2 = dilg.a(bArr);
            if (dimb.DELETED.equals(a2.h)) {
                dkty.c("Ignoring conference info with status deleted.", new Object[0]);
                of = Optional.empty();
            } else {
                of = Optional.of(dilg.b(Optional.ofNullable(dilkVar), a2, this.h));
            }
        } else {
            of = Optional.of(dilg.c(Optional.ofNullable(dilkVar), str, bArr, this.h));
        }
        if (!djag.d()) {
            of.ifPresent(new Consumer() { // from class: djbz
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj) {
                    ((dilk) obj).c();
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        }
        return of;
    }

    private final void y(ListenableFuture listenableFuture) {
        erqt.r(listenableFuture, new djcf(), this.f);
    }

    private final void z() {
        if (djac.d() && this.k.bf()) {
            return;
        }
        dkkq dkkqVar = (dkkq) this.g.a(dkkq.class);
        dkkqVar.getClass();
        try {
            dkhi dkhiVar = this.m;
            if (dkhiVar != null) {
                dkhiVar.i(this);
                this.m = null;
            }
            dkhi dkhiVar2 = new dkhi(dkkqVar.a, this.i, this.k.I, "conference", dkkqVar.d, dkkqVar.e, dkkqVar.f);
            dkhiVar2.f = "application/conference-info+xml";
            if (dizg.E()) {
                dkhiVar2.j = (String[]) Collection.EL.toArray(this.k.X.d(), new IntFunction() { // from class: djca
                    @Override // java.util.function.IntFunction
                    public final Object apply(int i) {
                        diyy diyyVar = djcg.a;
                        return new String[i];
                    }
                });
            } else {
                dkhiVar2.j = dkut.C(dkkqVar.x());
            }
            dkhiVar2.d(this);
            dkhiVar2.m();
            this.m = dkhiVar2;
        } catch (eejg e2) {
            throw new IllegalStateException("Can't subscribe to conference event.", e2);
        }
    }

    @Override // defpackage.dkji, defpackage.dkjz
    public final void c(dkjt dkjtVar) {
        byte[] I;
        Optional x;
        if (djac.d()) {
            String str = dkjtVar.h;
            if ("message/cpim".equals(str)) {
                try {
                    eidf eidfVar = (eidf) eidw.a(dkjtVar.f);
                    str = (String) eidfVar.c.f().orElse(str);
                    I = ((eidh) eidfVar.c).a.I();
                } catch (IOException e2) {
                    dkty.g("Can't parse CPIM message: %s", e2);
                    return;
                }
            } else {
                I = dkjtVar.f;
            }
            if (e.contains(str)) {
                try {
                    x = x(null, str, I);
                } catch (dilj e3) {
                    dkty.i(e3, "Error while updating conference: %s", e3.getMessage());
                } catch (IOException e4) {
                    e = e4;
                    dkty.i(e, "Error while reading conference subscription: %s", e.getMessage());
                } catch (XmlPullParserException e5) {
                    e = e5;
                    dkty.i(e, "Error while reading conference subscription: %s", e.getMessage());
                }
                if (x.isEmpty()) {
                    return;
                }
                this.l = (dilk) x.get();
                y(((djcs) ((fbbb) this.j).a).a(w()));
            }
        }
    }

    @Override // defpackage.dkhk
    public final void d(dkhi dkhiVar, String str, byte[] bArr) {
        if (((Boolean) a.a()).booleanValue() && !dilg.d(str, bArr)) {
            dkty.g("Received invalid conference information contentType:{%s} content:{%s}", str, bArr);
            return;
        }
        if (((Boolean) b.a()).booleanValue() && this.k.q() && this.k.aw().equals(dkhm.LEAVE)) {
            dkty.k("Received conference info after leaving.", new Object[0]);
            return;
        }
        try {
            Optional x = x(this.l, str, bArr);
            if (x.isEmpty()) {
                return;
            }
            this.l = (dilk) x.get();
            if (((Boolean) djak.a().b.t.a()).booleanValue()) {
                dilk dilkVar = this.l;
                dilkVar.getClass();
                dkkq dkkqVar = (dkkq) this.g.a(dkkq.class);
                dkkqVar.getClass();
                final String e2 = dkkqVar.a.e();
                if (!TextUtils.isEmpty(e2)) {
                    Collection.EL.stream(dilkVar.d).filter(new Predicate() { // from class: djbv
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
                            return ((dimg) obj).i;
                        }
                    }).forEach(new Consumer() { // from class: djbw
                        @Override // java.util.function.Consumer
                        /* renamed from: accept */
                        public final void o(Object obj) {
                            dimg dimgVar = (dimg) obj;
                            diyy diyyVar = djcg.a;
                            String str2 = dimgVar.g;
                            String str3 = e2;
                            if (TextUtils.equals(str2, str3)) {
                                return;
                            }
                            dimgVar.g = str3;
                        }

                        public final /* synthetic */ Consumer andThen(Consumer consumer) {
                            return Consumer$CC.$default$andThen(this, consumer);
                        }
                    });
                }
            }
            y(((djcs) ((fbbb) this.j).a).a(w()));
        } catch (dilj e3) {
            dkty.i(e3, "Error while updating conference: %s", e3.getMessage());
            z();
        } catch (IOException e4) {
            e = e4;
            dkty.i(e, "Error while reading conference subscription: %s", e.getMessage());
        } catch (XmlPullParserException e5) {
            e = e5;
            dkty.i(e, "Error while reading conference subscription: %s", e.getMessage());
        }
    }

    @Override // defpackage.dkji, defpackage.dkhd
    public final void i() {
        z();
    }

    @Override // defpackage.dkji, defpackage.dkhd
    public final void k() {
        dkhi dkhiVar;
        if (!djak.w() || (dkhiVar = this.m) == null) {
            return;
        }
        dkhiVar.n();
    }

    @Override // defpackage.dkji, defpackage.dkhd
    public final void l(dkqs dkqsVar) {
        dkhi dkhiVar;
        if (!djak.w() || (dkhiVar = this.m) == null) {
            return;
        }
        dkhiVar.n();
    }

    @Override // defpackage.dkji, defpackage.dkhd
    public final void m() {
        dkhi dkhiVar;
        if (djak.w() && (dkhiVar = this.m) != null) {
            dkhiVar.n();
        }
        if (djag.n() && this.k.aw() == dkhm.GONE) {
            dkkq dkkqVar = (dkkq) this.g.a(dkkq.class);
            dkkqVar.getClass();
            String e2 = dkkqVar.a.e();
            eifv f = GroupMember.f();
            f.b(e2);
            f.c(djhf.e(e2));
            f.f(eifw.ABSENT);
            f.d(true);
            String str = this.k.H;
            if (str != null) {
                f.e(djhf.e(str));
            }
            djfy djfyVar = new djfy();
            eiek eiekVar = new eiek();
            eiekVar.b(djhf.d(this.k));
            eieh eiehVar = new eieh();
            GroupMember a2 = f.a();
            if (eiehVar.a == null) {
                if (eiehVar.b == null) {
                    int i = engw.d;
                    eiehVar.a = new engr();
                } else {
                    int i2 = engw.d;
                    eiehVar.a = new engr();
                    eiehVar.a.j(eiehVar.b);
                    eiehVar.b = null;
                }
            }
            eiehVar.a.h(a2);
            eiekVar.c(eiehVar.a());
            djfyVar.a = eiekVar.e();
            y(((djcs) ((fbbb) this.j).a).a(djfyVar.a()));
        }
    }

    @Override // defpackage.dkhk
    public final void t() {
    }

    @Override // defpackage.dkhk
    public final void u() {
    }

    @Override // defpackage.dkhk
    public final void r(dkqr dkqrVar) {
    }

    @Override // defpackage.dkhk
    public final void v(dkqr dkqrVar) {
    }

    @Override // defpackage.dkhk
    public final void q(int i, String str) {
    }
}
