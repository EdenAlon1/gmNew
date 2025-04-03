package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class aqzg extends ffhv implements ffjm {
    final /* synthetic */ aqzh a;
    final /* synthetic */ SelfIdentityId b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aqzg(aqzh aqzhVar, SelfIdentityId selfIdentityId, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = aqzhVar;
        this.b = selfIdentityId;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aqzg) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        Optional ofNullable = Optional.ofNullable(this.a.b.d(this.b));
        final aqzh aqzhVar = this.a;
        final SelfIdentityId selfIdentityId = this.b;
        final ffji ffjiVar = new ffji() { // from class: aqze
            @Override // defpackage.ffji
            public final Object invoke(Object obj2) {
                return aqzh.this.c.a(aqvf.b(selfIdentityId.b()));
            }
        };
        Optional map = ofNullable.map(new Function() { // from class: aqzf
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj2) {
                return ffji.this.invoke(obj2);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        map.getClass();
        return map;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new aqzg(this.a, this.b, ffguVar);
    }
}
