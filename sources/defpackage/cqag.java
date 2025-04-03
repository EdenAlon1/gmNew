package defpackage;

import android.database.sqlite.SQLiteException;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cqag implements cqad {
    public buuo a;
    final /* synthetic */ cqai b;

    public cqag(cqai cqaiVar, final String str) {
        this.b = cqaiVar;
        try {
            csjb d = cqai.a.d();
            d.I("Querying for local messages.");
            d.A("selection", str);
            d.r();
            buxo d2 = MessagesTable.d();
            d2.z("+SyncCursorPair#LocalCursorIterator");
            d2.h(new Function() { // from class: cqae
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    buxz buxzVar = (buxz) obj;
                    buxzVar.as(new dtzr(str));
                    return buxzVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            d2.d(new buxl(MessagesTable.c.i, false));
            buum buumVar = MessagesTable.c;
            d2.c(buumVar.a, buumVar.i, buumVar.o, buumVar.j, buumVar.b, buumVar.x, buumVar.s, buumVar.ap);
            bwdf c = PartsTable.c();
            c.f(new Function() { // from class: cqaf
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return ((bwat) obj).c;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            bwdm bwdmVar = new bwdm();
            bwdmVar.u();
            bwdmVar.aq(new dtru("parts.message_id", 1, MessagesTable.c.a));
            c.g(bwdmVar);
            c.x(1);
            d2.n(c.b(), "parts_expression");
            this.a = (buuo) d2.b().o();
        } catch (SQLiteException e) {
            csjb b = cqai.a.b();
            b.I("failed to query local sms/mms");
            b.s(e);
            throw e;
        }
    }
}
