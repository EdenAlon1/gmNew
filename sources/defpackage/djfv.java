package defpackage;

import com.google.android.rcs.client.messaging.data.AutoOneOf_Message_MessageContent;
import com.google.android.rcs.client.messaging.data.ContentType;
import com.google.android.rcs.client.messaging.data.Conversation;
import com.google.android.rcs.client.messaging.data.Message;
import com.google.android.rcs.client.messaging.data.MessageClass;
import com.google.android.rcs.client.messaging.data.MessageExtensionHeader;
import com.google.android.rcs.client.messaging.data.RcsDestinationId;
import j$.time.Instant;
import j$.util.Collection;
import j$.util.DesugarCollections;
import j$.util.Map;
import j$.util.Objects;
import j$.util.Optional;
import j$.util.function.BiConsumer$CC;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Collectors;
import java.io.IOException;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djfv {
    public static final ContentType e;
    public static final enhk f;
    public static final dktn g;
    public final dlpw h;
    public final dkgw i;
    public final edzf j;
    private final eijy l;
    static final diyy a = dizd.a(169783196);
    static final diyy b = dizd.a(182480073);
    static final diyy c = dizd.a(181336021);
    static final diyy d = dizd.a(185593693);
    private static final diyy k = dizd.a(188541474);

    static {
        eifc d2 = ContentType.d();
        d2.f("message");
        d2.e("cpim");
        e = d2.g();
        f = enhk.l("urn:ietf:params:imdn", "imdn");
        g = new dktn("MessageConverter");
    }

    public djfv(dlpw dlpwVar, dkgw dkgwVar, eijy eijyVar, edzf edzfVar) {
        this.h = dlpwVar;
        this.l = eijyVar;
        this.i = dkgwVar;
        this.j = edzfVar;
    }

    public final dkjt a(Conversation conversation, Message message, MessageClass messageClass) {
        return b(conversation, message, Optional.of(messageClass), eigz.MESSAGING_METHOD_CHAT);
    }

    public final dkjt b(Conversation conversation, Message message, Optional optional, eigz eigzVar) {
        eido c2 = c(conversation, message, optional);
        String f2 = djhf.f((RcsDestinationId) (message.f().isPresent() ? message.f().get() : conversation.a()));
        String f3 = djhf.f(message.a());
        boolean z = optional.isEmpty() || ((MessageClass) optional.get()).b() == eigp.USER;
        dkjt dkjtVar = new dkjt(dkjs.CPIM_MESSAGE, true == eigzVar.equals(eigz.MESSAGING_METHOD_SLM) ? 2 : 1);
        dkjtVar.b = f2;
        dkjtVar.c = f3;
        dkjtVar.k = message.h();
        dkjtVar.j = this.h.f().toEpochMilli();
        dkjtVar.f(e.toString(), c2);
        dkjtVar.r = z;
        return dkjtVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final eido c(Conversation conversation, Message message, Optional optional) {
        String f2 = djhf.f(message.a());
        String str = "sip:anonymous@anonymous.invalid";
        if (conversation.c() != 2) {
            f2 = "sip:anonymous@anonymous.invalid";
        }
        if (conversation.c() == 2 && message.f().isPresent()) {
            str = djhf.f((RcsDestinationId) message.f().get());
        }
        try {
            if (message.b().size() != 1) {
                throw new IllegalArgumentException("Expect one content, found " + message.b().size());
            }
            Message.MessageContent messageContent = (Message.MessageContent) message.b().get(0);
            int ordinal = messageContent.a().ordinal();
            eijp b2 = ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? ordinal != 4 ? this.l.b(messageContent.b()) : this.l.b(messageContent.e()) : this.l.b(messageContent.c()) : this.l.b(messageContent.f()) : this.l.b(messageContent.d());
            String str2 = (String) f.get("urn:ietf:params:imdn");
            str2.getClass();
            final eidn f3 = eido.f();
            f3.g(str2, "urn:ietf:params:imdn");
            f3.e("From", new edzj(f2).toString());
            f3.e("To", new edzj(str).toString());
            f3.e("DateTime", this.h.f().toString());
            f3.f("urn:ietf:params:imdn", "Message-ID", message.h());
            eidq d2 = eidr.d();
            d2.d(new edzc(b2.b(), b2.b().d()));
            d2.f(fhpi.a, b2.a().toString());
            if (((Boolean) d.a()).booleanValue() && optional.isPresent() && MessageClass.f((MessageClass) optional.get())) {
                d2.f(fhpi.c, "notification");
            }
            if (((Boolean) c.a()).booleanValue()) {
                d2.f("Content-Length", String.valueOf(b2.b().d()));
            }
            ((eide) f3).a = d2.e();
            if (((Boolean) b.a()).booleanValue()) {
                optional.flatMap(new Function() { // from class: djfp
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        MessageClass messageClass = (MessageClass) obj;
                        if (!eigp.USER.equals(messageClass.b()) || !eigo.HIGH.equals(messageClass.a()) || (((Boolean) MessageClass.a.a()).booleanValue() && !messageClass.c())) {
                            return Optional.empty();
                        }
                        djfv djfvVar = djfv.this;
                        boolean d3 = messageClass.d();
                        dkkq dkkqVar = (dkkq) djfvVar.i.a(dkkq.class);
                        dkkqVar.getClass();
                        if (!djak.v() || !dkkqVar.x() || !d3) {
                            return Optional.of(dkkj.D);
                        }
                        return Optional.of(dkkj.D + ", " + edzn.INTERWORKING_SMS.p);
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }).ifPresent(new Consumer() { // from class: djfq
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void o(Object obj) {
                        ContentType contentType = djfv.e;
                        eidn.this.f("urn:ietf:params:imdn", "Disposition-Notification", (String) obj);
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
            }
            engw c2 = message.c();
            HashMap hashMap = new HashMap();
            int size = c2.size();
            for (int i = 0; i < size; i++) {
                MessageExtensionHeader messageExtensionHeader = (MessageExtensionHeader) c2.get(i);
                fayx fayxVar = (fayx) hashMap.get(messageExtensionHeader.b());
                if (fayxVar == null) {
                    fayxVar = (fayx) fayz.a.createBuilder();
                    hashMap.put(messageExtensionHeader.b(), fayxVar);
                }
                fayxVar.b(messageExtensionHeader.a(), messageExtensionHeader.c());
            }
            final fayt faytVar = (fayt) fayv.a.createBuilder();
            Map.EL.forEach(hashMap, new BiConsumer() { // from class: djfi
                @Override // java.util.function.BiConsumer
                public final void accept(Object obj, Object obj2) {
                    fayz fayzVar = (fayz) ((fayx) obj2).build();
                    fayt.this.a((String) obj, fayzVar);
                }

                public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                    return BiConsumer$CC.$default$andThen(this, biConsumer);
                }
            });
            int i2 = 1;
            for (Map.Entry entry : DesugarCollections.unmodifiableMap(((fayv) faytVar.build()).b).entrySet()) {
                int i3 = i2 + 1;
                f3.g(String.format(Locale.US, "n%d", Integer.valueOf(i2)), (String) entry.getKey());
                for (Map.Entry entry2 : DesugarCollections.unmodifiableMap(((fayz) entry.getValue()).b).entrySet()) {
                    f3.f((String) entry.getKey(), (String) entry2.getKey(), (String) entry2.getValue());
                }
                i2 = i3;
            }
            return f3.a();
        } catch (eikm e2) {
            throw new IllegalArgumentException("MessageContent could not be serialized", e2);
        }
    }

    public final Message d(Conversation conversation, dkjt dkjtVar) {
        engw g2;
        Instant f2;
        if (dkjtVar.a == dkjs.CPIM_MESSAGE) {
            engr engrVar = new engr();
            try {
                eido a2 = eidw.a(dkjtVar.f);
                if (((Boolean) a.a()).booleanValue()) {
                    engrVar.j(djfl.a(dkjtVar));
                } else {
                    ContentType e2 = ContentType.e((String) ((eidf) a2).c.f().orElseThrow(new Supplier() { // from class: djfo
                        @Override // java.util.function.Supplier
                        public final Object get() {
                            ContentType contentType = djfv.e;
                            return new IllegalArgumentException("No Content-Type given!");
                        }
                    }));
                    eidy eidyVar = new eidy();
                    eidyVar.b(((eidh) ((eidf) a2).c).a);
                    eidyVar.c(e2);
                    engrVar.h(AutoOneOf_Message_MessageContent.a(eidyVar.a()));
                }
                engw g3 = engrVar.g();
                String c2 = ((Boolean) k.a()).booleanValue() ? (String) a2.h("Message-ID").map(new Function() { // from class: djfr
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return ((eidt) obj).c();
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }).orElse("local:".concat(String.valueOf(String.valueOf(UUID.randomUUID())))) : ((eidt) a2.h("Message-ID").orElseThrow(new Supplier() { // from class: djfs
                    @Override // java.util.function.Supplier
                    public final Object get() {
                        ContentType contentType = djfv.e;
                        return new IllegalStateException("No Messageid given in the instant message");
                    }
                })).c();
                RcsDestinationId e3 = conversation.c() == 2 ? djhf.e(edzj.a(((eidt) a2.g("From").orElseThrow(new Supplier() { // from class: djft
                    @Override // java.util.function.Supplier
                    public final Object get() {
                        ContentType contentType = djfv.e;
                        return new IllegalArgumentException("CPIM message has no from header assigned!");
                    }
                })).c()).a) : conversation.a();
                Optional g4 = a2.g("DateTime");
                if (g4.isPresent()) {
                    try {
                        f2 = Instant.ofEpochMilli(dktc.c(((eidt) g4.get()).c()).a);
                    } catch (IllegalArgumentException unused) {
                        dkty.r(g, "Date can't be parsed as RFC3339 date: %s", ((eidt) g4.get()).c());
                        f2 = this.h.f();
                    }
                } else {
                    f2 = this.h.f();
                }
                int i = engw.d;
                final engr engrVar2 = new engr();
                final engr engrVar3 = new engr();
                Collection.EL.stream(((eidf) a2).b).filter(new Predicate() { // from class: eidk
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
                        String b2 = ((eidt) obj).b();
                        return (emxe.c(b2) || emuz.e(b2, "urn:ietf:params:cpim-headers:") || emuz.e(b2, "urn:ietf:params:imdn") || emuz.e(b2, "http://id.messages.google.com")) ? false : true;
                    }
                }).forEach(new Consumer() { // from class: eidl
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void o(Object obj) {
                        engr.this.h((eidt) obj);
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
                Collection.EL.stream(engrVar3.g()).forEach(new Consumer() { // from class: djfu
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void o(Object obj) {
                        eidt eidtVar = (eidt) obj;
                        ContentType contentType = djfv.e;
                        eieq eieqVar = new eieq();
                        eieqVar.c(eidtVar.b());
                        eieqVar.b(eidtVar.a());
                        eieqVar.d(eidtVar.c());
                        engr.this.h(eieqVar.a());
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
                eigi i2 = Message.i();
                i2.f(c2);
                i2.i(e3);
                i2.c(g3);
                i2.j(f2);
                i2.e(engrVar2.g());
                i2.d(enip.o((Set) Collection.EL.stream(emye.d(",").f().a().i((String) a2.h("Disposition-Notification").map(new Function() { // from class: eidm
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return ((eidt) obj).c();
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }).orElse(""))).map(new Function() { // from class: djfm
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        String str = (String) obj;
                        ContentType contentType = djfv.e;
                        if (edzn.DELIVERED.p.equals(str)) {
                            return eigj.POSITIVE_DELIVERY;
                        }
                        if (edzn.DISPLAYED.p.equals(str)) {
                            return eigj.DISPLAY;
                        }
                        if (((Boolean) dizg.o().a.aJ.a()).booleanValue() && edzn.DELIVERY_FAILED.p.equals(str)) {
                            return eigj.NEGATIVE_DELIVERY;
                        }
                        dkty.r(djfv.g, "DispositionNotification %s is not supported.", str);
                        return null;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }).filter(new Predicate() { // from class: djfn
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
                        return Objects.nonNull((eigj) obj);
                    }
                }).collect(Collectors.toSet())));
                return i2.a();
            } catch (IOException e4) {
                throw new IllegalArgumentException("CPIM message could not be parsed.", e4);
            }
        }
        engr engrVar4 = new engr();
        if (((Boolean) a.a()).booleanValue()) {
            engrVar4.j(djfl.a(dkjtVar));
        } else {
            ContentType e5 = ContentType.e(dkjtVar.h);
            eidy eidyVar2 = new eidy();
            eidyVar2.b(eyee.x(dkjtVar.f));
            eidyVar2.c(e5);
            engrVar4.h(AutoOneOf_Message_MessageContent.a(eidyVar2.a()));
        }
        eigi i3 = Message.i();
        i3.f(emxe.b(dkjtVar.k));
        i3.i(conversation.a());
        i3.j(Instant.ofEpochMilli(dkjtVar.j));
        i3.c(engrVar4.g());
        fayv fayvVar = dkjtVar.i;
        if (fayvVar == null) {
            int i4 = engw.d;
            g2 = enou.a;
        } else {
            int i5 = engw.d;
            engr engrVar5 = new engr();
            for (Map.Entry entry : DesugarCollections.unmodifiableMap(fayvVar.b).entrySet()) {
                for (Map.Entry entry2 : DesugarCollections.unmodifiableMap(((fayz) entry.getValue()).b).entrySet()) {
                    eieq eieqVar = new eieq();
                    eieqVar.c((String) entry.getKey());
                    eieqVar.b((String) entry2.getKey());
                    eieqVar.d((String) entry2.getValue());
                    engrVar5.h(eieqVar.a());
                }
            }
            g2 = engrVar5.g();
        }
        i3.e(g2);
        i3.g(dkjtVar.s);
        return i3.a();
    }
}
