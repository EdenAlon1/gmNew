package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.MessageData;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class uxg extends ffhv implements ffjm {
    final /* synthetic */ Collection a;
    final /* synthetic */ uxi b;
    final /* synthetic */ eonx c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uxg(Collection collection, uxi uxiVar, eonx eonxVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = collection;
        this.b = uxiVar;
        this.c = eonxVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((uxg) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        final int a = bdmq.a(((bcyh) ffdx.J(this.a)).t());
        Collection<bcyh> collection = this.a;
        final ArrayList arrayList = new ArrayList(ffdx.n(collection, 10));
        for (bcyh bcyhVar : collection) {
            uxi uxiVar = this.b;
            eoop eoopVar = (eoop) eopq.a.createBuilder();
            eoopVar.getClass();
            boolean az = bcyhVar.az();
            eoopVar.copyOnWrite();
            eopq eopqVar = (eopq) eoopVar.instance;
            eopqVar.c |= 128;
            eopqVar.L = az;
            eohm.c(bcyhVar.n(), eoopVar);
            eohm.b(((akvz) uxiVar.a.b()).b(bcyhVar.t()), eoopVar);
            eohm.h(MessageData.dp(bcyhVar.c()), eoopVar);
            String V = bcyhVar.V(uxiVar.b);
            int length = V == null ? 0 : (V.length() / 50) * 50;
            eoopVar.copyOnWrite();
            eopq eopqVar2 = (eopq) eoopVar.instance;
            eopqVar2.c |= 256;
            eopqVar2.M = length;
            arrayList.add(eohm.a(eoopVar));
        }
        uxi uxiVar2 = this.b;
        final eonx eonxVar = this.c;
        uxiVar2.o(new Supplier() { // from class: uxf
            @Override // java.util.function.Supplier
            public final Object get() {
                epiv epivVar = (epiv) epiw.a.createBuilder();
                epivVar.getClass();
                epivVar.copyOnWrite();
                epiw epiwVar = (epiw) epivVar.instance;
                epiwVar.c = eonx.this.k;
                epiwVar.b |= 1;
                DesugarCollections.unmodifiableList(epiwVar.e).getClass();
                epivVar.copyOnWrite();
                epiw epiwVar2 = (epiw) epivVar.instance;
                eygr eygrVar = epiwVar2.e;
                if (!eygrVar.c()) {
                    epiwVar2.e = eyfy.mutableCopy(eygrVar);
                }
                int i = a;
                eydl.addAll(arrayList, epiwVar2.e);
                epivVar.copyOnWrite();
                epiw epiwVar3 = (epiw) epivVar.instance;
                epiwVar3.b |= 2;
                epiwVar3.d = i;
                eyfy build = epivVar.build();
                build.getClass();
                return (epiw) build;
            }
        });
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new uxg(this.a, this.b, this.c, ffguVar);
    }
}
