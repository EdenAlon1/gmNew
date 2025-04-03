package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.function.Function$CC;
import java.util.concurrent.Callable;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cern extends ceut {
    private final avgr a;

    public cern(avgr avgrVar) {
        this.a = avgrVar;
    }

    private static int k(int i) {
        int i2 = i - 2;
        if (i2 == 1) {
            return 4;
        }
        if (i2 == 2) {
            return 3;
        }
        if (i2 == 3 || i2 == 4) {
            return 5;
        }
        throw new IllegalArgumentException("Unrecognized proto enum");
    }

    @Override // defpackage.ceut, defpackage.ceve
    public final cety a() {
        cetx l = cety.l();
        poh pohVar = new poh();
        pohVar.c(2);
        ((ceti) l).a = pohVar.a();
        l.c(((Integer) avic.b.e()).intValue());
        l.f(((Boolean) ((cfup) avic.d.get()).e()).booleanValue() ? poa.EXPONENTIAL : poa.LINEAR);
        return l.a();
    }

    @Override // defpackage.ceve
    public final ekzz b() {
        return eleg.f("RbmBusinessInfoRetrievalHandler");
    }

    @Override // defpackage.ceve
    public final eyhz d() {
        return cerr.a.getParserForType();
    }

    @Override // defpackage.ceut
    protected final /* bridge */ /* synthetic */ elfl j(ceuw ceuwVar, eyhs eyhsVar) {
        cerr cerrVar = (cerr) eyhsVar;
        int i = cerrVar.c;
        char c = i != 0 ? i != 1 ? i != 2 ? (char) 0 : (char) 4 : (char) 3 : (char) 2;
        if (c == 0 || c != 4) {
            avgr avgrVar = this.a;
            String str = cerrVar.b;
            int b = cerq.b(cerrVar.d);
            return avgrVar.f(new avgs(str, k(b != 0 ? b : 1)));
        }
        final avgr avgrVar2 = this.a;
        String str2 = cerrVar.b;
        int b2 = cerq.b(cerrVar.d);
        final avgs avgsVar = new avgs(str2, k(b2 != 0 ? b2 : 1));
        final String str3 = avgsVar.a;
        avgr.a.p("Request made for ".concat(str3));
        csjb c2 = avgr.a.c();
        c2.I("Initiating business info retrieval handler...");
        c2.A("RBM bot id", str3);
        c2.r();
        return elfo.g(new Callable() { // from class: avfl
            @Override // java.util.concurrent.Callable
            public final Object call() {
                csjb a = avgr.a.a();
                a.I("Checking for pre-existing business info...");
                final String str4 = str3;
                a.A("RBM bot id", str4);
                a.r();
                final avgr avgrVar3 = avgr.this;
                return (Boolean) bwso.e(str4, new Function() { // from class: avfj
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        bwqm bwqmVar = (bwqm) obj;
                        if (bwqmVar.k() >= avgr.this.n.f().toEpochMilli()) {
                            return false;
                        }
                        String str5 = str4;
                        csjb c3 = avgr.a.c();
                        c3.I("Business info in database has expired");
                        c3.A("RBM bot id", str5);
                        c3.H(bwqmVar.k());
                        c3.r();
                        return true;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }, new Supplier() { // from class: avfk
                    @Override // java.util.function.Supplier
                    public final Object get() {
                        csjb c3 = avgr.a.c();
                        c3.I("Business info does not exist in database");
                        c3.A("RBM bot id", str4);
                        c3.r();
                        return true;
                    }
                });
            }
        }, avgrVar2.h).i(new eroh() { // from class: avgh
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                if (Boolean.TRUE.equals((Boolean) obj)) {
                    avgs avgsVar2 = avgsVar;
                    avgr avgrVar3 = avgr.this;
                    avgrVar3.p.b("Bugle.Rbm.ChatbotDirectory.BotInfoDownloadLatency");
                    return avgrVar3.j(avgsVar2);
                }
                String str4 = str3;
                csjb c3 = avgr.a.c();
                c3.I("Business info already exists and not expired. Skipping download of business info.");
                c3.A("RBM bot id", str4);
                c3.r();
                return elfo.e(avgr.c(str4));
            }
        }, avgrVar2.g).h(new emwl() { // from class: avgi
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                ceyt ceytVar = (ceyt) obj;
                avgr.this.p.n("Bugle.Rbm.ChatbotDirectory.BotInfoDownloadLatency");
                return ceytVar;
            }
        }, avgrVar2.g);
    }
}
