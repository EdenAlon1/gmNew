package defpackage;

import android.telephony.ims.SipDelegateConfiguration;
import android.text.TextUtils;
import j$.util.Collection;
import j$.util.Objects;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Stream;
import java.util.function.Function;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class djnd {
    public static final dktn a = new dktn("SipDelegateConfigurationProcessor");

    final engw a(SipDelegateConfiguration sipDelegateConfiguration) {
        String sipAssociatedUriHeader = sipDelegateConfiguration.getSipAssociatedUriHeader();
        if (TextUtils.isEmpty(sipAssociatedUriHeader)) {
            dkty.r(a, "Associated URI in configuration is null or empty", new Object[0]);
            int i = engw.d;
            return enou.a;
        }
        Stream filter = Collection.EL.stream(emye.b(',').f().i(sipAssociatedUriHeader)).map(new Function() { // from class: djmx
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                String str = (String) obj;
                eehk eehkVar = dkut.a;
                try {
                    return eehk.b(str).b.toString();
                } catch (eeje e) {
                    dkty.i(e, "Error while parsing %s", dktx.GENERIC.c(str));
                    return null;
                }
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).filter(new Predicate() { // from class: djmy
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
                return Objects.nonNull((String) obj);
            }
        });
        int i2 = engw.d;
        return (engw) filter.collect(endq.a);
    }
}
