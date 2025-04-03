package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cyfr implements cxyl {
    public static final cskc a = cskc.g("Bugle", "NudgeBanner");
    public static final emyl b = cfvl.y("enable_nudge_banner");
    public final cyfw c;
    public final cxyg d;
    public final ConversationIdType e;
    public cyag f;
    public Optional g = Optional.empty();
    public MessageIdType h;
    public fbwv i;
    private final cyfy j;
    private final Context k;
    private final lkk l;
    private final cyai m;
    private final cjdj n;
    private final ejwl o;
    private final ctjh p;

    public cyfr(Context context, lkk lkkVar, cyfy cyfyVar, cyfw cyfwVar, cjdj cjdjVar, cyai cyaiVar, ejwl ejwlVar, ctjh ctjhVar, cxyg cxygVar, ConversationIdType conversationIdType) {
        this.k = context;
        this.l = lkkVar;
        this.j = cyfyVar;
        this.c = cyfwVar;
        this.n = cjdjVar;
        this.o = ejwlVar;
        this.m = cyaiVar;
        this.p = ctjhVar;
        this.d = cxygVar;
        this.e = conversationIdType;
    }

    public final void a() {
        this.d.a(this, false);
        this.g.ifPresent(new Consumer() { // from class: cyfo
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                MessageCoreData messageCoreData = (MessageCoreData) obj;
                axnw.h(cyfr.this.c.a(messageCoreData.B(), messageCoreData.z()));
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }

    public final void b(cyag cyagVar, MessageCoreData messageCoreData) {
        messageCoreData.getClass();
        cyagVar.y(this.n.a(messageCoreData.o(), messageCoreData.cI()));
    }

    @Override // defpackage.cxyl
    public final cxyh d() {
        return new cxxy("NudgeBanner", ((Boolean) ((cfup) b.get()).e()).booleanValue());
    }

    @Override // defpackage.cxyl
    public final cxyq e() {
        cyag a2 = this.m.a(this.k);
        this.f = a2;
        a2.p(this.k.getString(R.string.nudge_banner_description));
        this.f.C();
        this.f.y = new cyfp(this);
        this.g.ifPresent(new Consumer() { // from class: cyfm
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                cyfr cyfrVar = cyfr.this;
                cyfrVar.b(cyfrVar.f, (MessageCoreData) obj);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        this.f.z(ehdr.d(this.k, R.attr.colorPrimaryBrandNonIcon, "NudgeBanner"));
        this.f.g.gu(ehdr.d(this.k, R.attr.colorSurface, "NudgeBanner"));
        this.f.u(new cyah() { // from class: cyfn
            @Override // defpackage.cyah
            public final void f(cyag cyagVar) {
                cyfr.this.a();
            }
        });
        return this.f;
    }

    @Override // defpackage.cxyl
    public final void h() {
        fbwv fbwvVar = this.i;
        if (fbwvVar == null || this.e.b() || this.h.c()) {
            return;
        }
        axnw.h(this.p.b(this.h, this.e, fbwvVar, eopx.SHOWN));
    }

    @Override // defpackage.cxyl
    public final void l() {
        this.o.b(this.j.a(this.l, this.e), new AnonymousClass1());
    }

    /* compiled from: PG */
    /* renamed from: cyfr$1, reason: invalid class name */
    class AnonymousClass1 implements ejwd<cygj> {
        public AnonymousClass1() {
        }

        @Override // defpackage.ejwd
        public final void a(Throwable th) {
            cyfr.a.r("Error getting get nudge loaded data, conversationId: ".concat(cyfr.this.e.toString()));
            cyfr cyfrVar = cyfr.this;
            cyfrVar.d.a(cyfrVar, false);
        }

        @Override // defpackage.ejwd
        public final /* bridge */ /* synthetic */ void b(Object obj) {
            cygj cygjVar = (cygj) obj;
            Optional ofNullable = Optional.ofNullable(cygjVar.b);
            cyfr cyfrVar = cyfr.this;
            cyfrVar.g = ofNullable;
            cyfrVar.h = cyfrVar.g.isPresent() ? ((MessageCoreData) cyfr.this.g.get()).B() : bdhb.a;
            cyfr cyfrVar2 = cyfr.this;
            cyfrVar2.i = cygjVar.c;
            if (cyfrVar2.f != null && cygjVar.a) {
                cyfrVar2.g.ifPresent(new Consumer() { // from class: cyfq
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj2) {
                        cyfr cyfrVar3 = cyfr.this;
                        cyfrVar3.b(cyfrVar3.f, (MessageCoreData) obj2);
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
            }
            cyfr cyfrVar3 = cyfr.this;
            cyfrVar3.d.a(cyfrVar3, cygjVar.a);
        }

        @Override // defpackage.ejwd
        public final /* synthetic */ void hB() {
        }
    }

    @Override // defpackage.cxyl
    public final /* synthetic */ void g() {
    }

    @Override // defpackage.cxyl
    public final /* synthetic */ void i() {
    }

    @Override // defpackage.cxyl
    public final /* synthetic */ void j() {
    }

    @Override // defpackage.cxyl
    public final void k() {
    }
}
