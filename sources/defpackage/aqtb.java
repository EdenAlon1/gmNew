package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class aqtb extends ffhv implements ffjm {
    final /* synthetic */ aqte a;
    final /* synthetic */ SelfIdentityId b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aqtb(aqte aqteVar, SelfIdentityId selfIdentityId, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = aqteVar;
        this.b = selfIdentityId;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aqtb) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        final aquw aquwVar = this.a.b;
        Optional map = Optional.ofNullable(aquwVar.b.d(this.b)).map(new Function() { // from class: aquv
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj2) {
                return aquw.this.a((aztg) obj2);
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
        return new aqtb(this.a, this.b, ffguVar);
    }
}
