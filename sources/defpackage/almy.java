package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class almy extends ffhv implements ffjm {
    final /* synthetic */ alnb a;
    private /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public almy(ffgu ffguVar, alnb alnbVar) {
        super(2, ffguVar);
        this.a = alnbVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((almy) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        bvvn e = ParticipantsTable.e();
        e.z("SelfParticipantsMetricsLogger#log");
        e.r();
        e.h(new Function() { // from class: almx
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj2) {
                bvvw bvvwVar = (bvvw) obj2;
                bvvwVar.x(-1);
                return bvvwVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        engw y = e.b().y();
        y.getClass();
        return y;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        almy almyVar = new almy(ffguVar, this.a);
        almyVar.b = obj;
        return almyVar;
    }
}
