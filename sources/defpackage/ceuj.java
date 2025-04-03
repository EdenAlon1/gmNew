package defpackage;

import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public abstract class ceuj implements ceve {
    @Override // defpackage.ceve
    public /* synthetic */ cety a() {
        throw null;
    }

    @Override // defpackage.ceve
    public final /* synthetic */ String e() {
        return null;
    }

    @Override // defpackage.ceve
    public /* synthetic */ String f() {
        return null;
    }

    @Override // defpackage.ceve
    public final /* synthetic */ boolean h(eyhs eyhsVar) {
        return true;
    }

    @Override // defpackage.ceve
    public final /* synthetic */ boolean i(byte[] bArr) {
        return cevb.a(this, bArr);
    }

    public abstract elfl j(ceuw ceuwVar, engw engwVar);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ceve
    public final elfl r(ceuw ceuwVar, engw engwVar) {
        eyhz d = d();
        engr engrVar = new engr();
        int size = engwVar.size();
        for (int i = 0; i < size; i++) {
            final ceze cezeVar = (ceze) engwVar.get(i);
            try {
                engrVar.h(d.h(cezeVar.t()));
            } catch (eygu unused) {
                csjb b = D.b();
                b.I("InvalidProtocolBufferException for WorkQueue item of type ");
                b.I(ceuwVar.a().toString());
                b.r();
                String[] strArr = cfbf.a;
                cfau cfauVar = new cfau();
                cfauVar.f("MultiItemWorkHandler#processPendingWorkItemRaw");
                cfauVar.c(new Function() { // from class: ceui
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        cfbe cfbeVar = (cfbe) obj;
                        cfbeVar.c(ceze.this.l());
                        return cfbeVar;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                cfauVar.d();
            }
        }
        return j(ceuwVar, engrVar.g());
    }

    @Override // defpackage.ceve
    public final /* synthetic */ void g() {
    }
}
