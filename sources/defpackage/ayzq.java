package defpackage;

import android.content.ContentValues;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.util.concurrent.Callable;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ayzq implements ayzk {
    public static final /* synthetic */ int a = 0;
    private static final cfup b = cfvl.k(cfvl.b, "phone_number_min_match_guesser_max_length", 15);
    private final errl c;
    private final dtuu d;

    public ayzq(errl errlVar, dtuu dtuuVar) {
        this.c = errlVar;
        this.d = dtuuVar;
    }

    @Override // defpackage.ayzk
    public final elfl a() {
        return elfo.g(new Callable() { // from class: ayzp
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return ayzq.this.b();
            }
        }, this.c);
    }

    @Override // defpackage.ayzk
    public final Optional b() {
        final int intValue = ((Integer) b.e()).intValue();
        return (Optional) this.d.c("guessPhoneNumber", new emyl() { // from class: ayzo
            @Override // defpackage.emyl
            public final Object get() {
                int i = ayzq.a;
                String[] strArr = bwhy.a;
                bwhr bwhrVar = new bwhr();
                bwhrVar.f("guessPhoneNumberCompareMinMatchValueSync");
                bwhrVar.e();
                bwhrVar.d();
                int i2 = intValue;
                StringBuilder sb = new StringBuilder(i2);
                sb.append('4');
                for (int i3 = 1; i3 < i2; i3++) {
                    String sb2 = sb.toString();
                    bwhf bwhfVar = new bwhf();
                    bwhfVar.b(sb2);
                    final bwhc a2 = bwhfVar.a();
                    final dtve a3 = bwhy.a();
                    dtub.b(bwhy.a(), "phone_number_min_match_guesser", a2, new Function() { // from class: bwhb
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo448andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            return Long.valueOf(dtve.this.S("phone_number_min_match_guesser", (ContentValues) obj));
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    }, new Consumer() { // from class: bwgz
                        @Override // java.util.function.Consumer
                        public final void accept(Object obj) {
                            Long l = (Long) obj;
                            if (l.longValue() >= 0) {
                                bwhc bwhcVar = bwhc.this;
                                bwhcVar.a = new bwha(l).a.longValue();
                                bwhcVar.fY(0);
                            }
                        }

                        public final /* synthetic */ Consumer andThen(Consumer consumer) {
                            return Consumer$CC.$default$andThen(this, consumer);
                        }
                    });
                    sb.append('4');
                    String sb3 = sb.toString();
                    bwhx bwhxVar = new bwhx();
                    bwhxVar.as(new dtzq("PHONE_NUMBERS_EQUAL($V, $V, $V)", new Object[]{bwhy.b.b, sb3, 0}));
                    bwhw bwhwVar = new bwhw(bwhxVar);
                    bwhv bwhvVar = new bwhv(bwhy.a);
                    bwhvVar.z("guessPhoneNumberCompareMinMatchValueSync");
                    bwhvVar.k(bwhwVar);
                    if (bwhvVar.b().i() > 0) {
                        return Optional.of(Integer.valueOf(i3));
                    }
                }
                return Optional.empty();
            }
        });
    }
}
