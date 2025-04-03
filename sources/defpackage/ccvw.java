package defpackage;

import android.database.sqlite.SQLiteConstraintException;
import android.database.sqlite.SQLiteException;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.Collection;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ccvw implements ccun {
    private final dtuu a;

    public ccvw(dtuu dtuuVar) {
        dtuuVar.getClass();
        this.a = dtuuVar;
    }

    @Override // defpackage.ccun
    public final void a(String str, String str2, csgg csggVar) {
        try {
            String[] strArr = bsom.a;
            bsoe bsoeVar = new bsoe();
            bsoeVar.ap("CmsConversationsBackupTableAdapter#setCmsIdAndLifeCycleInTransaction");
            bsoeVar.l(csggVar);
            bsoeVar.k(str2);
            if (bsoeVar.f(bdgq.b(str))) {
            } else {
                throw new ccwp(str);
            }
        } catch (SQLiteConstraintException e) {
            throw new ccwn(e);
        } catch (SQLiteException e2) {
            throw new ccwv("Conversations", str, e2);
        }
    }

    @Override // defpackage.ccun
    public final void b(Iterable iterable, csgg csggVar) {
        Object obj;
        iterable.getClass();
        csggVar.getClass();
        this.a.i();
        String[] strArr = bsom.a;
        bsoe bsoeVar = new bsoe();
        bsoeVar.ap("CmsConversationsBackupTableAdapter#setCmsLifeCyclesInTransaction");
        bsoeVar.l(csggVar);
        bsol bsolVar = new bsol();
        bsolVar.t(bdgq.c(iterable));
        bsoeVar.ac(bsolVar);
        if (bsoeVar.b().e() == ffdx.C(iterable)) {
            return;
        }
        bsob e = bsom.e();
        e.z("+CmsConversationBackupTableAdapter#setCmsLifeCyclesInTransaction");
        e.c(bsom.c.a);
        bsol bsolVar2 = new bsol();
        bsolVar2.t(bdgq.c(iterable));
        e.h(bsolVar2);
        engw f = e.b().f();
        Iterator it = iterable.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (!engw.n((Collection) Collection.EL.stream(f).map(new Function() { // from class: bdgo
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        return ((ConversationIdType) obj2).a();
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }).collect(Collectors.toCollection(new bdgm()))).contains((String) obj)) {
                    break;
                }
            }
        }
        String str = (String) obj;
        if (str == null) {
            str = bdgq.a.a();
        }
        str.getClass();
        throw new ccwp(str);
    }
}
