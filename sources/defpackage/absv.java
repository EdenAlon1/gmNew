package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class absv extends dtrs {
    public static final entd a = entd.c("NewConvCreatedListener");
    public static final emyl b = cfvl.x(235366139, "enable_conversation_creation_check");
    public static final emyl c = cfvl.w("enable_forked_conversation_check");
    public final ffbr d;
    public final ffbr e;
    public final ffbr f;
    public final asvb g;
    public final bsnz h;
    private final dtuu k;
    private final asnw l;

    public absv(dtuu dtuuVar, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, asvb asvbVar, asnw asnwVar) {
        bsob e = bsom.e();
        e.z("conversationCreatedQuery");
        e.g(new Function() { // from class: absq
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                entd entdVar = absv.a;
                return ((bskp) obj).a;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        this.h = e.b();
        this.k = dtuuVar;
        this.d = ffbrVar;
        this.e = ffbrVar2;
        this.f = ffbrVar3;
        this.g = asvbVar;
        this.l = asnwVar;
    }

    @Override // defpackage.dtrs
    public final /* bridge */ /* synthetic */ void b(dtyq dtyqVar, dtuk dtukVar) {
        final bseh bsehVar = (bseh) dtukVar.b();
        if (bsehVar != null) {
            if (((Boolean) ((cfup) b.get()).e()).booleanValue()) {
                ((ensz) a.n().h("com/google/android/apps/messaging/custodian/inspectors/forking/conversationstable/NewConversationCreatedChangeListener", "onChangeInTransaction", 97, "NewConversationCreatedChangeListener.java")).t("onChangeInTransaction for New Conversation created: %s", bsehVar.C());
                this.k.g(new dtut() { // from class: absr
                    @Override // defpackage.dtut
                    public final ekzz a() {
                        entd entdVar = absv.a;
                        return eleg.f("NCCCL::convoCreated::runAfterCommit");
                    }
                }, this.l.a() ? String.format("NewConversationCreatedChangeListener::%s", bsehVar.C()) : bsehVar.C().toString(), new Runnable() { // from class: abss
                    @Override // java.lang.Runnable
                    public final void run() {
                        bseh bsehVar2 = bsehVar;
                        Optional of = Optional.of(Integer.valueOf(bsehVar2.k()));
                        abrc abrcVar = (abrc) absv.this.d.b();
                        ffbr ffbrVar = abrcVar.a;
                        ConversationIdType C = bsehVar2.C();
                        errl errlVar = (errl) ffbrVar.b();
                        errlVar.getClass();
                        errl errlVar2 = (errl) abrcVar.b.b();
                        errlVar2.getClass();
                        abuy abuyVar = (abuy) abrcVar.c.b();
                        abuyVar.getClass();
                        C.getClass();
                        final abrb abrbVar = new abrb(errlVar, errlVar2, abuyVar, C, of);
                        elfo.f(new Runnable() { // from class: abqz
                            @Override // java.lang.Runnable
                            public final void run() {
                                ensz enszVar = (ensz) abrb.a.n().h("com/google/android/apps/messaging/custodian/inspectors/forking/conversationstable/ConversationCreatedActivityReporter", "evaluate", 54, "ConversationCreatedActivityReporter.java");
                                abrb abrbVar2 = abrb.this;
                                enszVar.t("Starting conversation(ID: %s) insert notification for Normalization metric", abrbVar2.e);
                                final abut abutVar = new abut();
                                abutVar.d(epwn.NEW_CONVERSATION_CREATED);
                                abutVar.c(abrbVar2.e);
                                abrbVar2.f.ifPresent(new Consumer() { // from class: abra
                                    @Override // java.util.function.Consumer
                                    /* renamed from: accept */
                                    public final void o(Object obj) {
                                        Integer num = (Integer) obj;
                                        num.intValue();
                                        ((abut) abuw.this).a = Optional.of(num);
                                    }

                                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                        return Consumer$CC.$default$andThen(this, consumer);
                                    }
                                });
                                abrbVar2.d.b(abutVar.e());
                            }
                        }, abrbVar.b).k(axnw.b(), abrbVar.c);
                    }
                });
            }
            if (((Boolean) ((cfup) c.get()).e()).booleanValue()) {
                ((ensz) a.n().h("com/google/android/apps/messaging/custodian/inspectors/forking/conversationstable/NewConversationCreatedChangeListener", "onChangeInTransaction", 111, "NewConversationCreatedChangeListener.java")).t("onChangeInTransaction for Forked Conversation Inspector: %s", bsehVar.C());
                this.k.g(new dtut() { // from class: abst
                    @Override // defpackage.dtut
                    public final ekzz a() {
                        entd entdVar = absv.a;
                        return eleg.f("NCCCL::forkedConvo::runAfterCommit");
                    }
                }, null, new Runnable() { // from class: absu
                    @Override // java.lang.Runnable
                    public final void run() {
                        bseh bsehVar2 = bsehVar;
                        absv absvVar = absv.this;
                        bseh r = absvVar.g.a() ? ((bczy) absvVar.f.b()).r(bsehVar2.C()) : bsehVar2;
                        if (r == null) {
                            ((ensz) ((ensz) absv.a.j()).h("com/google/android/apps/messaging/custodian/inspectors/forking/conversationstable/NewConversationCreatedChangeListener", "onChangeInTransaction", 124, "NewConversationCreatedChangeListener.java")).t("Failed to get conversation data from bugle DB for conversation id: %s", bsehVar2.C());
                            return;
                        }
                        absk abskVar = (absk) absvVar.e.b();
                        ayyn ayynVar = (ayyn) abskVar.a.b();
                        ayynVar.getClass();
                        abrh abrhVar = (abrh) abskVar.b.b();
                        abrhVar.getClass();
                        ayvn ayvnVar = (ayvn) abskVar.c.b();
                        ayvnVar.getClass();
                        ffbr ffbrVar = abskVar.d;
                        aolr aolrVar = (aolr) abskVar.e.b();
                        aolrVar.getClass();
                        abuy abuyVar = (abuy) abskVar.f.b();
                        abuyVar.getClass();
                        ffbr ffbrVar2 = abskVar.g;
                        ffbr ffbrVar3 = abskVar.h;
                        ayxm ayxmVar = (ayxm) abskVar.i.b();
                        ayxmVar.getClass();
                        ffsk ffskVar = (ffsk) abskVar.j.b();
                        ffskVar.getClass();
                        emar emarVar = (emar) abskVar.k.b();
                        emarVar.getClass();
                        akzt akztVar = (akzt) abskVar.l.b();
                        akztVar.getClass();
                        albq albqVar = (albq) abskVar.m.b();
                        albqVar.getClass();
                        absj absjVar = new absj(ayynVar, abrhVar, ayvnVar, ffbrVar, aolrVar, abuyVar, ffbrVar2, ffbrVar3, ayxmVar, ffskVar, emarVar, akztVar, albqVar, abskVar.n, abskVar.o, abskVar.p, r);
                        axol.a(emau.a(absjVar.c, absjVar.d, new abrq(absjVar, null))).k(axnw.b(), erpp.a);
                    }
                });
            }
        }
    }
}
