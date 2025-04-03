package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ddpb extends ffhv implements ffjm {
    int a;
    final /* synthetic */ ddpc b;
    final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ddpb(ddpc ddpcVar, int i, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = ddpcVar;
        this.c = i;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ddpb) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            elfl b = this.b.a.a().b();
            b.getClass();
            this.a = 1;
            obj = fgfz.c(b, this);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
        }
        engw engwVar = (engw) obj;
        if (this.b.b >= engwVar.size()) {
            int i2 = this.c;
            ddpc ddpcVar = this.b;
            return new cbsx(i2, "", ddpcVar.e, ddpcVar.f, false, ddpcVar.g, ddpcVar.d);
        }
        final SelfIdentityId g = ((aqux) engwVar.get(this.b.b)).g();
        buxo d = MessagesTable.d();
        d.c(MessagesTable.c.b);
        d.h(new Function() { // from class: ddpa
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj2) {
                buxz buxzVar = (buxz) obj2;
                buxzVar.W(SelfIdentityId.this.b());
                return buxzVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        d.v(MessagesTable.c.b);
        buxm b2 = d.b();
        String[] strArr = bgmn.a;
        bgmm bgmmVar = new bgmm();
        bgmmVar.aq(new dtru("conversations._id", 3, b2));
        String[] strArr2 = bfkq.a;
        bfkp bfkpVar = new bfkp();
        bfkpVar.e(b2);
        int size = engwVar.size();
        int i3 = this.c;
        String o = ((aqux) engwVar.get(this.b.b)).o();
        boolean z = size > 1;
        ddpc ddpcVar2 = this.b;
        return new cbsx(i3, o, bgmmVar, bfkpVar, z, ddpcVar2.g, ddpcVar2.d);
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new ddpb(this.b, this.c, ffguVar);
    }
}
