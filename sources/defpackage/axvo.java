package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class axvo extends ffhv implements ffjm {
    int a;
    final /* synthetic */ axvq b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public axvo(ffgu ffguVar, axvq axvqVar) {
        super(2, ffguVar);
        this.b = axvqVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((axvo) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        if (this.a != 0) {
            ffci.b(obj);
        } else {
            ffci.b(obj);
            this.a = 1;
            bsob e = bsom.e();
            e.z("ContactsSyncRecurringMetricsLoggerImpl");
            bsol bsolVar = new bsol();
            bsolVar.p();
            bsolVar.c(byyt.UNARCHIVED);
            e.h(bsolVar);
            e.e(new bsny(bsom.c.r, false));
            e.x(10);
            obj = ((bskr) e.b().o()).cW();
            obj.getClass();
            if (obj == ffhhVar) {
                return ffhhVar;
            }
        }
        Iterable iterable = (Iterable) obj;
        ArrayList arrayList = new ArrayList(ffdx.n(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            List L = ((bczy) this.b.b.b()).L(((bseh) it.next()).C());
            L.getClass();
            ArrayList arrayList2 = new ArrayList();
            enqv it2 = ((engw) L).iterator();
            while (it2.hasNext()) {
                E next = it2.next();
                if (((ParticipantsTable.BindData) next).r() == -2) {
                    arrayList2.add(next);
                }
            }
            arrayList.add(arrayList2);
        }
        return arrayList;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        axvo axvoVar = new axvo(ffguVar, this.b);
        axvoVar.c = obj;
        return axvoVar;
    }
}
