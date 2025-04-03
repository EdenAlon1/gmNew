package defpackage;

import android.content.Context;
import androidx.preference.Preference;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.label.data.classification.SuperSortLabel;
import j$.util.Collection;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Stream;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahhd extends cwuk {
    public static final cskc a = cskc.g("BugleSuperSort", "DefaultLabelDialog");
    public static final enhk b;
    public final engw c;
    public final ejwl d;
    public final ejlq e;
    public final ahik f;
    public Preference g;
    public a h;

    static {
        enhd enhdVar = new enhd();
        enhdVar.k(SuperSortLabel.ALL, Integer.valueOf(R.string.conversation_label_all));
        enhdVar.k(SuperSortLabel.PERSONAL, Integer.valueOf(R.string.conversation_label_personal));
        enhdVar.k(SuperSortLabel.TRANSACTION, Integer.valueOf(R.string.conversation_label_transactions));
        enhdVar.k(SuperSortLabel.UPDATE, Integer.valueOf(R.string.conversation_label_updates));
        enhdVar.k(SuperSortLabel.OTP, Integer.valueOf(R.string.conversation_label_otp));
        enhdVar.k(SuperSortLabel.PROMOTION, Integer.valueOf(R.string.conversation_label_promotions));
        enhdVar.k(SuperSortLabel.BUSINESS_UPDATE, Integer.valueOf(R.string.conversation_label_business_updates));
        b = enhdVar.c();
    }

    public ahhd(final Context context, ejwl ejwlVar, ejlq ejlqVar, ahik ahikVar) {
        super(context);
        this.d = ejwlVar;
        this.e = ejlqVar;
        this.f = ahikVar;
        Stream filter = Collection.EL.stream(b.keySet()).filter(new Predicate() { // from class: ahhb
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
                SuperSortLabel superSortLabel = (SuperSortLabel) obj;
                cskc cskcVar = ahhd.a;
                if (aewg.g(SuperSortLabel.BUSINESS_UPDATE) && superSortLabel == SuperSortLabel.BUSINESS_UPDATE) {
                    return false;
                }
                if (aewg.g(SuperSortLabel.TRANSACTION) && superSortLabel == SuperSortLabel.TRANSACTION) {
                    return false;
                }
                if (aewg.g(SuperSortLabel.UPDATE) && superSortLabel == SuperSortLabel.UPDATE) {
                    return false;
                }
                if (aewg.g(SuperSortLabel.OTP) && superSortLabel == SuperSortLabel.OTP) {
                    return false;
                }
                return (aewg.g(SuperSortLabel.PROMOTION) && superSortLabel == SuperSortLabel.PROMOTION) ? false : true;
            }
        });
        int i = engw.d;
        engw engwVar = (engw) filter.collect(endq.a);
        this.c = engwVar;
        this.k = (CharSequence[]) Collection.EL.stream(engwVar).map(new Function() { // from class: ahgz
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return context.getString(((Integer) ahhd.b.get((SuperSortLabel) obj)).intValue());
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).toArray(new IntFunction() { // from class: ahha
            @Override // java.util.function.IntFunction
            public final Object apply(int i2) {
                cskc cskcVar = ahhd.a;
                return new String[i2];
            }
        });
        this.j = context.getString(R.string.default_label_title);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.cwuk
    protected final void a(int i) {
        SuperSortLabel superSortLabel = (SuperSortLabel) this.c.get(i);
        ejlp b2 = ejlp.b(this.f.i(superSortLabel));
        ejlm ejlmVar = new ejlm(superSortLabel);
        a aVar = this.h;
        aVar.getClass();
        this.e.i(b2, ejlmVar, aVar);
    }

    public final void b() {
        super.c();
    }

    /* compiled from: PG */
    final class b implements ejwd<SuperSortLabel> {
        private final Consumer a;

        public b(Consumer consumer) {
            this.a = consumer;
        }

        @Override // defpackage.ejwd
        public final void a(Throwable th) {
            csjb e = ahhd.a.e();
            e.v("Error getting default label value");
            e.s(th);
        }

        @Override // defpackage.ejwd
        public final /* bridge */ /* synthetic */ void b(Object obj) {
            this.a.o((SuperSortLabel) obj);
        }

        @Override // defpackage.ejwd
        public final /* synthetic */ void hB() {
        }
    }

    /* compiled from: PG */
    final class a implements ejlr<SuperSortLabel, Void> {
        private final Consumer a;

        public a(Consumer consumer) {
            this.a = consumer;
        }

        @Override // defpackage.ejlr
        public final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
            this.a.o((SuperSortLabel) obj);
        }

        @Override // defpackage.ejlr
        public final /* bridge */ /* synthetic */ void m(Object obj, Throwable th) {
            csjb e = ahhd.a.e();
            e.v("Error setting new default label value");
            e.A("new-label", (SuperSortLabel) obj);
            e.s(th);
        }

        @Override // defpackage.ejlr
        public final /* synthetic */ void b(Object obj) {
        }
    }
}
