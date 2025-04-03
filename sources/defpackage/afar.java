package defpackage;

import com.google.android.apps.messaging.label.data.classification.SuperSortLabel;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.function.Function$CC;
import java.util.concurrent.Callable;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class afar {
    public static final cskc a = cskc.g("BugleSuperSort", "SuperSortReady");
    public final ffbr b;
    public final ffbr c;
    public final errl d;
    private final errl e;

    public afar(ffbr ffbrVar, ffbr ffbrVar2, errl errlVar, errl errlVar2) {
        this.b = ffbrVar;
        this.c = ffbrVar2;
        this.e = errlVar;
        this.d = errlVar2;
    }

    static long a(String str) {
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return 0L;
        }
    }

    public final elfl b() {
        if (!aewg.h()) {
            return elfo.e(false);
        }
        ekzz f = eleg.f("SuperSortReady#getIsFeatureReady");
        try {
            elfl i = elfo.g(new Callable() { // from class: afao
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    boolean z;
                    Object apply;
                    float f2;
                    Object apply2;
                    boolean g = aewg.g(SuperSortLabel.BUSINESS_UPDATE);
                    afar afarVar = afar.this;
                    if (g || !aewg.g(SuperSortLabel.TRANSACTION)) {
                        efbd.b();
                        agzb a2 = agze.a();
                        a2.z("getMessageReadyPercentage");
                        z = false;
                        agze.c().intValue();
                        a2.m(new agyy[0]);
                        a2.n(new dtzq("SUM(CASE WHEN $V IS NOT NULL THEN 1 END)", new Object[]{agze.c.a}), "ready_expression");
                        a2.n(new dtzq("COUNT(1)", new Object[0]), "count_expression");
                        apply = new Function() { // from class: afam
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo448andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj) {
                                agzd agzdVar = (agzd) obj;
                                agzdVar.aq(new dtrw("messages.message_status", 3, agzd.au(new int[]{1, 2, 11, 15, 14, 100}), true));
                                return agzdVar;
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        }.apply(new agzd());
                        a2.k(new agzc((agzd) apply));
                        agyz agyzVar = (agyz) a2.b().o();
                        try {
                            if (agyzVar.moveToNext()) {
                                long a3 = afar.a(agyzVar.dd("ready_expression"));
                                long a4 = afar.a(agyzVar.dd("count_expression"));
                                if (a4 == 0) {
                                    agyzVar.close();
                                    f2 = 2.0f;
                                } else {
                                    float f3 = a3 / a4;
                                    csjb c = afar.a.c();
                                    c.I("Percentage of messages processed for supersort is");
                                    c.A("Percentage", Float.valueOf(f3));
                                    c.A("threshold", Float.valueOf(aewg.b()));
                                    c.A("sorting notice ui threshold", Float.valueOf(aewg.a()));
                                    c.r();
                                    ((aexq) afarVar.b.b()).b(f3);
                                    agyzVar.close();
                                    f2 = f3;
                                }
                            } else {
                                agyzVar.close();
                                f2 = -1.0f;
                            }
                        } finally {
                        }
                    } else {
                        efbd.b();
                        afkc a5 = afkd.a();
                        a5.z("getConversationReadyPercentage");
                        apply2 = new Function() { // from class: afan
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo448andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj) {
                                return ((afjy) obj).a;
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        }.apply(afkd.c);
                        afjz[] afjzVarArr = {(afjz) apply2};
                        int intValue = afkd.c().intValue();
                        if (((Integer) afkd.b.getOrDefault(afjzVarArr[0].toString(), -1)).intValue() > intValue) {
                            dtub.w("columnReference.toString()", intValue);
                        }
                        a5.m(afjzVarArr);
                        a5.n(new dtzq("SUM(CASE WHEN $V IS NOT NULL THEN 1 END)", new Object[]{afkd.c.b}), "ready_expression");
                        a5.n(new dtzq("COUNT(1)", new Object[0]), "count_expression");
                        afka afkaVar = (afka) a5.b().o();
                        try {
                            if (afkaVar.moveToNext()) {
                                long a6 = afar.a(afkaVar.dd("ready_expression"));
                                long a7 = afar.a(afkaVar.dd("count_expression"));
                                if (a7 == 0) {
                                    afkaVar.close();
                                    z = false;
                                    f2 = 2.0f;
                                } else {
                                    float f4 = a6 / a7;
                                    csjb c2 = afar.a.c();
                                    c2.I("Percentage of conversations processed for supersort is");
                                    c2.A("Percentage", Float.valueOf(f4));
                                    c2.A("threshold", Float.valueOf(aewg.b()));
                                    c2.A("sorting notice ui threshold", Float.valueOf(aewg.a()));
                                    c2.r();
                                    ((aexq) afarVar.b.b()).b(f4);
                                    afkaVar.close();
                                    f2 = f4;
                                    z = false;
                                }
                            } else {
                                afkaVar.close();
                                z = false;
                                f2 = -1.0f;
                            }
                        } finally {
                        }
                    }
                    return Boolean.valueOf(f2 < aewg.b() ? z : true);
                }
            }, this.e).i(new eroh() { // from class: afap
                @Override // defpackage.eroh
                public final ListenableFuture a(Object obj) {
                    final Boolean bool = (Boolean) obj;
                    if (!bool.booleanValue()) {
                        return elfo.e(bool);
                    }
                    afar afarVar = afar.this;
                    return ((ahik) afarVar.c.b()).j().h(new emwl() { // from class: afaq
                        @Override // defpackage.emwl
                        public final Object apply(Object obj2) {
                            return bool;
                        }
                    }, afarVar.d);
                }
            }, this.d);
            f.b(i);
            f.close();
            return i;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
