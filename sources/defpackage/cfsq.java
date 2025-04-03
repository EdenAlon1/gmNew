package defpackage;

import j$.util.function.Function$CC;
import java.util.ArrayList;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cfsq implements cfsm {
    private final ffsk a;
    private final ffbr b;

    public cfsq(ffsk ffskVar, ffbr ffbrVar) {
        ffskVar.getClass();
        this.a = ffskVar;
        this.b = ffbrVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.cfsm
    public final apkn a(final String str, final aplf aplfVar) {
        str.getClass();
        aplfVar.getClass();
        String[] strArr = bszm.a;
        bszh bszhVar = new bszh(bszm.a);
        bszhVar.z("EmergencySessionManagerImpl.createEmergencySessionsTableQuery");
        bszhVar.c(new Function() { // from class: cfsn
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bszl bszlVar = (bszl) obj;
                bszlVar.b(str);
                bszlVar.c(aplfVar);
                return bszlVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        engw y = bszhVar.b().y();
        y.getClass();
        ArrayList arrayList = new ArrayList();
        enqv it = y.iterator();
        while (it.hasNext()) {
            E next = it.next();
            if (((bsyh) next).m().isAfter(((cqoh) this.b.b()).f())) {
                arrayList.add(next);
            }
        }
        if (arrayList.size() > 1) {
            throw new IllegalStateException("Multiple EmergencySessionsTable entries returned.");
        }
        bsyh bsyhVar = (bsyh) ffdx.M(arrayList);
        if (bsyhVar != null) {
            return apko.a(bsyhVar);
        }
        return null;
    }

    @Override // defpackage.cfsm
    public final elfl b(String str, aplf aplfVar) {
        elfl c;
        str.getClass();
        aplfVar.getClass();
        c = axol.c(this.a, ffhe.a, ffsm.a, new cfsp(this, str, aplfVar, null));
        return c;
    }

    @Override // defpackage.cfsm
    public final Object c(String str, aplf aplfVar, ffgu ffguVar) {
        return ffqy.c(this.a, null, new cfso(this, str, aplfVar, null), 3).c(ffguVar);
    }
}
