package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.common.util.concurrent.ListenableFuture;
import j$.time.Duration;
import j$.util.Collection;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aisv {
    public final aitz a;
    public final aith b;
    public final aiuv c;
    private final errl d;
    private final errl e;

    public aisv(errl errlVar, errl errlVar2, aitz aitzVar, aith aithVar, aiuv aiuvVar) {
        this.d = errlVar;
        this.e = errlVar2;
        this.a = aitzVar;
        this.b = aithVar;
        this.c = aiuvVar;
    }

    public final elfl a(boolean z) {
        return !z ? this.a.d(false) : this.a.d(true).i(new eroh() { // from class: aist
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                return aisv.this.a.f();
            }
        }, this.e).h(new emwl() { // from class: aisu
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                btta b = bttf.b();
                b.z("enableOtpAutoDelete2");
                b.f(new Function() { // from class: aisq
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        btte btteVar = (btte) obj2;
                        btteVar.b(1);
                        return btteVar;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                btsn btsnVar = (btsn) b.b().o();
                aisv aisvVar = aisv.this;
                try {
                    List list = (List) Collection.EL.stream(btsnVar.c()).map(new Function() { // from class: aisr
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo448andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj2) {
                            return ((MessageIdType) obj2).b();
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    }).collect(Collectors.toCollection(new Supplier() { // from class: aiss
                        @Override // java.util.function.Supplier
                        public final Object get() {
                            return new ArrayList();
                        }
                    }));
                    String uuid = UUID.randomUUID().toString();
                    aisvVar.c.d(uuid, 2);
                    aith aithVar = aisvVar.b;
                    aiti aitiVar = (aiti) aitj.a.createBuilder();
                    aitiVar.copyOnWrite();
                    aitj aitjVar = (aitj) aitiVar.instance;
                    aitjVar.a();
                    eydl.addAll(list, aitjVar.b);
                    aitiVar.copyOnWrite();
                    aitj aitjVar2 = (aitj) aitiVar.instance;
                    uuid.getClass();
                    aitjVar2.c = uuid;
                    aitj aitjVar3 = (aitj) aitiVar.build();
                    cetp cetpVar = new cetp();
                    cetpVar.c = Duration.ofMillis(((Long) aitk.b.e()).longValue());
                    aithVar.a(aitjVar3, cetpVar.a());
                    btsnVar.close();
                    return null;
                } catch (Throwable th) {
                    try {
                        btsnVar.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
        }, this.d);
    }
}
