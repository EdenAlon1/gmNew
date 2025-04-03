package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Collection;
import j$.util.Objects;
import j$.util.Optional;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Stream;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cqpk {
    public static final entd a = entd.c("BugleFileTransfer");
    public final errl b;
    public final cqrl c;
    public final ffbr d;
    public final asnv e;
    private final errl f;
    private final cqos g;

    public cqpk(errl errlVar, errl errlVar2, cqrl cqrlVar, cqos cqosVar, ffbr ffbrVar, asnv asnvVar) {
        this.f = errlVar;
        this.b = errlVar2;
        this.c = cqrlVar;
        this.g = cqosVar;
        this.d = ffbrVar;
        this.e = asnvVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v6, types: [com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v6, types: [com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v0, types: [com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData, java.lang.Object] */
    public final elfl a(cqrn cqrnVar) {
        Optional b = cqrnVar.b();
        Optional a2 = cqrnVar.a();
        if (!cqrnVar.c() || !axuh.e.contains(Integer.valueOf(cqrnVar.b().get().k()))) {
            ensk n = a.n();
            n.Y(csux.b, b.get().B());
            n.Y(cqpo.a, ((cqrs) a2.get()).r());
            ((ensz) n.h("com/google/android/apps/messaging/shared/transfer/CancelFileTransferHelper", "cancelOngoingFileTransfer", 210, "CancelFileTransferHelper.java")).q("Message is not sending or downloading. Skipping cancelling upload/download.");
            return null;
        }
        cqtk o = ((cqrs) a2.get()).o();
        entd entdVar = a;
        ensk n2 = entdVar.n();
        n2.Y(csux.b, b.get().B());
        n2.Y(cqpo.a, ((cqrs) a2.get()).r());
        ((ensz) n2.h("com/google/android/apps/messaging/shared/transfer/CancelFileTransferHelper", "cancelOngoingFileTransfer", 219, "CancelFileTransferHelper.java")).t("Attempting to cancel ongoing file transfer. Transfer type: %s", o);
        if (Objects.equals(o, cqtk.UPLOAD)) {
            Object obj = a2.get();
            crdb b2 = this.g.b();
            final cqrs cqrsVar = (cqrs) obj;
            String r = cqrsVar.r();
            r.getClass();
            return b2.a(r).h(new emwl() { // from class: cqpg
                @Override // defpackage.emwl
                public final Object apply(Object obj2) {
                    entd entdVar2 = cqpk.a;
                    return cqrs.this.n();
                }
            }, this.f);
        }
        if (!Objects.equals(o, cqtk.DOWNLOAD)) {
            ensz enszVar = (ensz) entdVar.j();
            enszVar.Y(csux.b, b.get().B());
            enszVar.Y(cqpo.a, ((cqrs) a2.get()).r());
            ((ensz) enszVar.h("com/google/android/apps/messaging/shared/transfer/CancelFileTransferHelper", "cancelOngoingFileTransfer", 233, "CancelFileTransferHelper.java")).t("Transfer type not supported while trying to cancel ongoing file transfer: %s", o);
            return null;
        }
        Object obj2 = a2.get();
        cqvc a3 = this.g.a();
        final cqrs cqrsVar2 = (cqrs) obj2;
        String r2 = cqrsVar2.r();
        r2.getClass();
        return a3.b(r2).h(new emwl() { // from class: cqpf
            @Override // defpackage.emwl
            public final Object apply(Object obj3) {
                entd entdVar2 = cqpk.a;
                return cqrs.this.n();
            }
        }, this.f);
    }

    public final elfl b(List list) {
        Stream filter = Collection.EL.stream(list).flatMap(new Function() { // from class: cqpc
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Stream.CC.ofNullable(cqpk.this.a((cqrn) obj));
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).filter(new Predicate() { // from class: cqpd
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
                return Objects.nonNull((elfl) obj);
            }
        });
        int i = engw.d;
        return elfo.i((Iterable) filter.collect(endq.a)).h(new cqpe(), this.f);
    }

    public final engw c(List list) {
        Stream flatMap = Collection.EL.stream(list).flatMap(new Function() { // from class: cqph
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                elfl a2;
                final MessageCoreData messageCoreData = (MessageCoreData) obj;
                Optional map = Optional.ofNullable(messageCoreData).map(new Function() { // from class: cqow
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        return ((MessageCoreData) obj2).G();
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }).map(new Function() { // from class: cqpb
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        return ((MessagePartCoreData) obj2).z();
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                boolean isPresent = map.isPresent();
                cqpk cqpkVar = cqpk.this;
                if (isPresent) {
                    a2 = ((awah) cqpkVar.d.b()).b((awap) map.get()).i(new eroh() { // from class: cqpa
                        @Override // defpackage.eroh
                        public final ListenableFuture a(Object obj2) {
                            entd entdVar = cqpk.a;
                            return elfo.e(MessageCoreData.this.B());
                        }
                    }, cqpkVar.b);
                } else if (cqpkVar.c.a(messageCoreData.B()).c()) {
                    a2 = cqpkVar.a(cqpkVar.c.a(messageCoreData.B()));
                } else {
                    ensk n = cqpk.a.n();
                    n.Y(csux.b, messageCoreData.B());
                    ((ensz) n.h("com/google/android/apps/messaging/shared/transfer/CancelFileTransferHelper", "cancelFileTransfer", 169, "CancelFileTransferHelper.java")).q("Trying to cancel a file transfer for a message that does not have a valid file transfer.");
                    a2 = null;
                }
                return Stream.CC.ofNullable(a2);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        int i = engw.d;
        return (engw) flatMap.collect(endq.a);
    }
}
