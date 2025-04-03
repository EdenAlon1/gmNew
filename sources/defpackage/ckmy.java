package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Function$CC;
import j$.util.stream.Stream;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class ckmy {
    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean a(aoku aokuVar, List list) {
        Optional e;
        awui awuiVar;
        String str = null;
        if (aokuVar != null && (e = aokuVar.e()) != null && (awuiVar = (awui) fflm.b(e)) != null) {
            str = awuiVar.d;
        }
        if (aokuVar == null || list.isEmpty()) {
            return false;
        }
        enqv it = ((engw) list).iterator();
        while (it.hasNext()) {
            if (ffkj.e(((ParticipantsTable.BindData) it.next()).U(), str)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final int b(List list, Set set) {
        Stream stream = Collection.EL.stream(set);
        final ffji ffjiVar = new ffji() { // from class: ckms
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                awui awuiVar = (awui) obj;
                awuiVar.getClass();
                return awuiVar.d;
            }
        };
        enip enipVar = (enip) stream.map(new Function() { // from class: ckmt
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ffji.this.invoke(obj);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).collect(endq.b);
        int i = 0;
        if (list.isEmpty()) {
            return 0;
        }
        enqv it = ((engw) list).iterator();
        while (it.hasNext()) {
            if (enipVar.contains(((ParticipantsTable.BindData) it.next()).U()) && (i = i + 1) < 0) {
                ffdx.k();
            }
        }
        return i;
    }

    public static final boolean c(aoku aokuVar, List list) {
        Optional e;
        awui awuiVar;
        String str = null;
        if (aokuVar != null && (e = aokuVar.e()) != null && (awuiVar = (awui) fflm.b(e)) != null) {
            str = awuiVar.d;
        }
        if (aokuVar == null || list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (ffkj.e(((awui) it.next()).d, str)) {
                return true;
            }
        }
        return false;
    }

    public static final int d(List list, Set set) {
        int i = 0;
        if (list.isEmpty()) {
            return 0;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (set.contains((awui) it.next()) && (i = i + 1) < 0) {
                ffdx.k();
            }
        }
        return i;
    }
}
