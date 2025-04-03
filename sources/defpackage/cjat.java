package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.apps.messaging.R;
import j$.util.Collection;
import j$.util.Objects;
import j$.util.Optional;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import java.util.function.Function;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjat {
    public final Context a;
    public final cjck b;
    public final aolr c;
    public final crji d;
    public final bcxo e;
    public final ffbr f;
    public final ffbr g;
    public final ffbr h;
    public final ffbr i;
    public final ffbr j;
    public final ffbr k;
    private final cjbb l;
    private final cuxh m;
    private final cttz n;

    public cjat(Context context, cjbb cjbbVar, cjck cjckVar, aolr aolrVar, crji crjiVar, bcxo bcxoVar, ffbr ffbrVar, cuxh cuxhVar, cttz cttzVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, ffbr ffbrVar6) {
        this.a = context;
        this.l = cjbbVar;
        this.b = cjckVar;
        this.c = aolrVar;
        this.d = crjiVar;
        this.e = bcxoVar;
        this.f = ffbrVar;
        this.m = cuxhVar;
        this.n = cttzVar;
        this.g = ffbrVar2;
        this.h = ffbrVar3;
        this.i = ffbrVar4;
        this.j = ffbrVar5;
        this.k = ffbrVar6;
    }

    public final bcyl a(bcyk bcykVar) {
        return new bcyl(Integer.valueOf(bcykVar.X() ? this.n.g().a : this.n.b()), bcykVar.t(), (String) bcykVar.p().map(new Function() { // from class: cjaq
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                cfva cfvaVar = aoqm.a;
                return ((aoku) obj).p(((Boolean) new aopd().get()).booleanValue());
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).orElse(null));
    }

    public final ciwo b(CharSequence charSequence, bcyk bcykVar, bcse bcseVar) {
        cixt e;
        String O;
        if (!bcseVar.az()) {
            CharSequence charSequence2 = (CharSequence) Objects.requireNonNullElse(charSequence, "");
            long k = bcseVar.k();
            cisz ciszVar = new cisz();
            ciszVar.a = Optional.empty();
            ciszVar.b(charSequence2);
            ciszVar.c(k);
            ciszVar.b = Optional.empty();
            ciszVar.c = Optional.empty();
            return ciszVar;
        }
        boolean X = bcykVar.X();
        emxf.l(bcseVar.az());
        String c = this.m.c(bcseVar.R());
        if (bcseVar.A() == byzi.VERIFICATION_IN_PROGRESS) {
            e = cixt.e(this.a.getString(R.string.im_notification_verifying_sender_suffix, c), bcseVar.o(), bcseVar.p());
        } else {
            if (TextUtils.isEmpty(c)) {
                cfva cfvaVar = aoqm.a;
                if (((Boolean) new aooy().get()).booleanValue()) {
                    O = bcseVar.bg().a;
                    O.getClass();
                } else {
                    O = bcseVar.O();
                }
                c = this.m.c(O);
                if (TextUtils.isEmpty(c)) {
                    c = this.a.getString(R.string.unknown_sender);
                }
            }
            String str = null;
            if (TextUtils.isEmpty(bcseVar.R()) && TextUtils.isEmpty(bcseVar.Q())) {
                bgmp bgmpVar = bcseVar.b;
                str = bgmpVar != null ? bgmpVar.g() : bcseVar.a.g();
            }
            if (!TextUtils.isEmpty(str)) {
                if (X) {
                    c = c + " " + cjze.a(str);
                } else {
                    c = this.m.c(cjze.a(str));
                }
            }
            if (!X) {
                c = this.m.c(c);
            }
            e = cixt.e(c, bcseVar.o(), bcseVar.p());
        }
        return ciwp.f(e, (CharSequence) Objects.requireNonNullElse(charSequence, ""), bcseVar.i());
    }

    public final CharSequence c(bcyk bcykVar, bcse bcseVar) {
        String V = bcseVar.V(this.a);
        CharSequence charSequence = ((cixx) this.l.a(this.a, bcseVar, bcykVar.X(), bcykVar.X() ? bcykVar.t() : null)).b;
        return charSequence != null ? charSequence : V;
    }

    public final String d(bcyk bcykVar, engw engwVar) {
        String t = bcykVar.t();
        if (bcykVar.X() || engwVar.isEmpty()) {
            return this.m.c(emxe.b(t));
        }
        bcse bcseVar = (bcse) Collection.EL.stream(engwVar.a()).filter(new Predicate() { // from class: cjar
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
                return ((bcse) obj).az();
            }
        }).findFirst().orElse(null);
        if (bcseVar == null) {
            return this.m.c(emxe.b(t));
        }
        String R = bcseVar.R();
        if (TextUtils.isEmpty(R) && bcseVar.az()) {
            cfva cfvaVar = aoqm.a;
            if (((Boolean) new aooy().get()).booleanValue()) {
                R = bcseVar.bg().a;
                R.getClass();
            } else {
                R = bcseVar.O();
            }
        }
        return this.m.c(emxe.b((String) Objects.requireNonNullElse(R, t)));
    }
}
