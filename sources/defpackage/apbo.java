package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import j$.util.function.Function$CC;
import java.util.List;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class apbo extends ffhv implements ffjm {
    final /* synthetic */ MessageIdType a;
    final /* synthetic */ apbq b;
    final /* synthetic */ List c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public apbo(MessageIdType messageIdType, apbq apbqVar, List list, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = messageIdType;
        this.b = apbqVar;
        this.c = list;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((apbo) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        buxo d = MessagesTable.d();
        d.z("refreshDeliveryStatusFromDb");
        d.f(new Function() { // from class: apbm
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj2) {
                return ((buum) obj2).k;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        final MessageIdType messageIdType = this.a;
        d.h(new Function() { // from class: apbn
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj2) {
                buxz buxzVar = (buxz) obj2;
                buxzVar.q(MessageIdType.this);
                return buxzVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        dtsu o = d.b().o();
        apbq apbqVar = this.b;
        List<aoyh> list = this.c;
        try {
            buuo buuoVar = (buuo) o;
            if (buuoVar.moveToNext()) {
                alxo a = apvu.a(buuoVar.i());
                synchronized (list) {
                    for (aoyh aoyhVar : list) {
                        a.getClass();
                        aoyhVar.e(a);
                    }
                }
            }
            ffig.a(o, null);
            return ffcu.a;
        } finally {
        }
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new apbo(this.a, this.b, this.c, ffguVar);
    }
}
