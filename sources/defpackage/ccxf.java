package defpackage;

import android.database.sqlite.SQLiteConstraintException;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import j$.util.Collection;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ccxf implements ccun {
    private final dtuu a;
    private final ffbr b;
    private final ffbr c;

    public ccxf(dtuu dtuuVar, ffbr ffbrVar, ffbr ffbrVar2) {
        dtuuVar.getClass();
        ffbrVar.getClass();
        ffbrVar2.getClass();
        this.a = dtuuVar;
        this.b = ffbrVar;
        this.c = ffbrVar2;
    }

    private final void c(String str) {
        if (!((asix) this.c.b()).a()) {
            throw new ccwp(str);
        }
        throw new ccwp(str, this.b);
    }

    @Override // defpackage.ccun
    public final void a(String str, String str2, csgg csggVar) {
        try {
            String[] strArr = MessagesTable.a;
            buxr buxrVar = new buxr();
            buxrVar.ap("CmsMessagesBackupTableAdapter#setCmsIdAndLifeCycleInTransaction");
            buxrVar.m(csggVar);
            buxrVar.k(str2);
            if (buxrVar.e(bdhb.b(str))) {
                return;
            }
            c(str);
        } catch (SQLiteConstraintException e) {
            throw new ccwv("Messages", str, e);
        }
    }

    @Override // defpackage.ccun
    public final void b(Iterable iterable, csgg csggVar) {
        Object obj;
        iterable.getClass();
        csggVar.getClass();
        this.a.i();
        String[] strArr = MessagesTable.a;
        buxr buxrVar = new buxr();
        buxrVar.ap("setCmsLifeCyclesInTransaction");
        buxrVar.m(csggVar);
        buxz buxzVar = new buxz();
        ArrayList arrayList = new ArrayList(ffdx.n(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(bdhb.b((String) it.next()));
        }
        buxzVar.u(arrayList);
        buxrVar.X(buxzVar);
        if (buxrVar.b().e() == ffdx.C(iterable)) {
            return;
        }
        buxo d = MessagesTable.d();
        d.z("CmsMessagesBackupTableAdapter#setCmsLifeCyclesInTransaction");
        d.c(MessagesTable.c.a);
        buxz buxzVar2 = new buxz();
        ArrayList arrayList2 = new ArrayList(ffdx.n(iterable, 10));
        Iterator it2 = iterable.iterator();
        while (it2.hasNext()) {
            arrayList2.add(bdhb.b((String) it2.next()));
        }
        buxzVar2.u(arrayList2);
        d.g(buxzVar2);
        engw g = d.b().g();
        Iterator it3 = iterable.iterator();
        while (true) {
            if (!it3.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it3.next();
                if (!((List) Collection.EL.stream(g).map(new Function() { // from class: bdha
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        return ((MessageIdType) obj2).b();
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }).collect(Collectors.toCollection(new bdgz()))).contains((String) obj)) {
                    break;
                }
            }
        }
        String str = (String) obj;
        if (str == null) {
            str = "unknown";
        }
        c(str);
    }
}
