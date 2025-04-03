package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import j$.util.stream.Stream;
import java.util.concurrent.ConcurrentMap;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abtr {
    public static final entd a = entd.c("RcsGroupIdUpdateChecker");
    public final errl b;
    public final errl c;
    public final abuy d;
    public final abtd e;

    public abtr(errl errlVar, errl errlVar2, abuy abuyVar, abtd abtdVar) {
        this.b = errlVar;
        this.c = errlVar2;
        this.d = abuyVar;
        this.e = abtdVar;
    }

    public static ConcurrentMap a() {
        final ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        bsob e = bsom.e();
        e.z("getConversationIdsToRcsGroupIds");
        e.i(new Function() { // from class: abtn
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bsol bsolVar = (bsol) obj;
                entd entdVar = abtr.a;
                bsolVar.F();
                bsolVar.H();
                return bsolVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        e.f(new Function() { // from class: abto
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bskp bskpVar = (bskp) obj;
                entd entdVar = abtr.a;
                return new bskq[]{bskpVar.a, bskpVar.aa};
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        Stream D = e.b().D();
        try {
            D.forEach(new Consumer() { // from class: abtp
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj) {
                    bseh bsehVar = (bseh) obj;
                    entd entdVar = abtr.a;
                    ConversationIdType C = bsehVar.C();
                    String ad = bsehVar.ad();
                    ad.getClass();
                    concurrentHashMap.putIfAbsent(C, ad);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            if (D != null) {
                D.close();
            }
            return concurrentHashMap;
        } catch (Throwable th) {
            if (D != null) {
                try {
                    D.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }
}
