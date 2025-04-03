package defpackage;

import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public abstract class ceut implements ceve {
    @Override // defpackage.ceve
    public /* synthetic */ cety a() {
        return cevb.b();
    }

    @Override // defpackage.ceve
    public /* synthetic */ String e() {
        return null;
    }

    @Override // defpackage.ceve
    public /* synthetic */ String f() {
        return null;
    }

    @Override // defpackage.ceve
    public /* synthetic */ boolean h(eyhs eyhsVar) {
        return true;
    }

    @Override // defpackage.ceve
    public final /* synthetic */ boolean i(byte[] bArr) {
        return cevb.a(this, bArr);
    }

    protected abstract elfl j(ceuw ceuwVar, eyhs eyhsVar);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [eyhs, java.lang.Object] */
    @Override // defpackage.ceve
    public final elfl r(ceuw ceuwVar, final engw engwVar) {
        emxf.l(engwVar.size() == 1);
        try {
            return j(ceuwVar, d().h(((ceze) engwVar.get(0)).t()));
        } catch (eygu unused) {
            csjb b = D.b();
            b.I("InvalidProtocolBufferException for WorkQueue item of type ");
            b.I(ceuwVar.a().toString());
            b.r();
            String[] strArr = cfbf.a;
            cfau cfauVar = new cfau();
            cfauVar.f("SingleItemWorkHandler#processPendingWorkItemRaw");
            cfauVar.c(new Function() { // from class: ceus
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    cfbe cfbeVar = (cfbe) obj;
                    cfbeVar.c(((ceze) engw.this.get(0)).l());
                    return cfbeVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            cfauVar.d();
            return elfo.e(ceyt.k());
        }
    }

    @Override // defpackage.ceve
    public /* synthetic */ void g() {
    }
}
