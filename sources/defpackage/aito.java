package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import j$.time.Duration;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aito implements bqab {
    public final aith a;
    public final aiuv b;
    private btsz c;
    private final aisp d = new aisp(new Consumer() { // from class: aitl
        @Override // java.util.function.Consumer
        /* renamed from: accept */
        public final void o(Object obj) {
            MessageIdType messageIdType = (MessageIdType) obj;
            if (((Boolean) aitk.a.e()).booleanValue()) {
                aito aitoVar = aito.this;
                String uuid = UUID.randomUUID().toString();
                aitoVar.b.d(uuid, 2);
                aiti aitiVar = (aiti) aitj.a.createBuilder();
                String b = messageIdType.b();
                aitiVar.copyOnWrite();
                aitj aitjVar = (aitj) aitiVar.instance;
                b.getClass();
                aitjVar.a();
                aitjVar.b.add(b);
                aitiVar.copyOnWrite();
                aitj aitjVar2 = (aitj) aitiVar.instance;
                uuid.getClass();
                aitjVar2.c = uuid;
                aitj aitjVar3 = (aitj) aitiVar.build();
                cetp cetpVar = new cetp();
                cetpVar.c = Duration.ofMillis(((Long) aitk.b.e()).longValue());
                aitoVar.a.a(aitjVar3, cetpVar.a());
            }
        }

        public final /* synthetic */ Consumer andThen(Consumer consumer) {
            return Consumer$CC.$default$andThen(this, consumer);
        }
    });
    private final AtomicBoolean e = new AtomicBoolean(false);

    public aito(aith aithVar, aiuv aiuvVar) {
        this.a = aithVar;
        this.b = aiuvVar;
    }

    @Override // defpackage.bqab
    public final void a() {
        btta b = bttf.b();
        b.z("OtpLabelDataChangeObserver#createQueryObject1");
        b.d(new Function() { // from class: aitm
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((btsl) obj).a;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        b.f(new Function() { // from class: aitn
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                btte btteVar = (btte) obj;
                btteVar.b(1);
                return btteVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        this.c = b.b();
    }

    @Override // defpackage.bqab
    public final void fF() {
        if (this.e.compareAndSet(false, true)) {
            this.c.L(this.d);
        }
    }
}
