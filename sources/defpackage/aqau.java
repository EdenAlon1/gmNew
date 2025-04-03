package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.message.internal.CoreBugleMessageId;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import j$.util.function.Function$CC;
import java.util.ArrayList;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class aqau extends ffhv implements ffjm {
    final /* synthetic */ aqaw a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aqau(aqaw aqawVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = aqawVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aqau) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        buxo d = MessagesTable.d();
        d.z("MessageReplyIdsObservableSupplier.getAsync");
        d.x(this.a.b);
        d.f(new Function() { // from class: aqar
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj2) {
                return ((buum) obj2).a;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        d.h(new Function() { // from class: aqas
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj2) {
                buxz buxzVar = (buxz) obj2;
                buxzVar.B(false);
                return buxzVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        String[] strArr = bufy.a;
        bufs bufsVar = new bufs(bufy.a);
        final aqaw aqawVar = this.a;
        bufsVar.e(new Function() { // from class: aqat
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj2) {
                bufx bufxVar = (bufx) obj2;
                bufxVar.b(aqaw.d(aqaw.this.a));
                return bufxVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        d.G(dtvz.i(bufsVar.b(), bufy.c.a, MessagesTable.c.a).g());
        buum buumVar = MessagesTable.c;
        d.d(new buxl(buumVar.i, false), new buxl(buumVar.a, false));
        engw y = d.b().y();
        y.getClass();
        ArrayList arrayList = new ArrayList(ffdx.n(y, 10));
        enqv it = y.iterator();
        while (it.hasNext()) {
            arrayList.add(new CoreBugleMessageId(((MessagesTable.BindData) it.next()).D(), -1L));
        }
        return engq.a(arrayList);
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new aqau(this.a, ffguVar);
    }
}
