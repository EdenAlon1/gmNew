package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import j$.util.function.Function$CC;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aqaa implements apuh {
    private final apzn a;

    public aqaa(apzn apznVar) {
        apznVar.getClass();
        this.a = apznVar;
    }

    @Override // defpackage.apuh
    public final buxo a(buxo buxoVar) {
        bwvt b = bwvy.b();
        b.z("+loadReadReports");
        b.c(new Function() { // from class: apzz
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bwvg bwvgVar = (bwvg) obj;
                bwvgVar.getClass();
                return new bwvh[]{bwvgVar.a, bwvgVar.b, bwvgVar.c, bwvgVar.e, bwvgVar.f};
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        buxoVar.G(dtvz.i(b.b(), bwvy.c.b, MessagesTable.c.a).g());
        return buxoVar;
    }

    @Override // defpackage.apuh
    public final boolean c() {
        return true;
    }

    @Override // defpackage.apuh
    public final void d(apuf apufVar, MessagesTable.BindData bindData, aoug aougVar, enhk enhkVar, amfx amfxVar, aptd aptdVar) {
        bindData.getClass();
        aougVar.getClass();
        enhkVar.getClass();
        amfxVar.getClass();
        if (bindData.l() == 3) {
            String[] strArr = bwvy.a;
            bwuo[] bwuoVarArr = (bwuo[]) bindData.aG("read_reports", new bwuo[0]);
            bwuoVarArr.getClass();
            List L = ffdo.L(bwuoVarArr);
            ArrayList arrayList = new ArrayList();
            for (Object obj : L) {
                if (((bwuo) obj).l() > 0) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(ffdx.n(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(aougVar.b(String.valueOf(((bwuo) it.next()).k())));
            }
            apufVar.d(engq.a(ffdx.aa(arrayList2)));
            List L2 = ffdo.L(bwuoVarArr);
            ArrayList arrayList3 = new ArrayList();
            for (Object obj2 : L2) {
                if (((bwuo) obj2).q().isPresent()) {
                    arrayList3.add(obj2);
                }
            }
            ArrayList arrayList4 = new ArrayList(ffdx.n(arrayList3, 10));
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                arrayList4.add(aougVar.b(String.valueOf(((bwuo) it2.next()).k())));
            }
            apufVar.c(engq.a(ffdx.aa(arrayList4)));
        }
    }

    @Override // defpackage.apuh
    public final aptb e() {
        return this.a;
    }

    @Override // defpackage.apuh
    public final /* synthetic */ bwdf b(bwdf bwdfVar) {
        return bwdfVar;
    }
}
