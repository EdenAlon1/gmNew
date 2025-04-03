package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import j$.util.Collection;
import j$.util.function.Predicate$CC;
import java.util.function.Predicate;

/* compiled from: PG */
@Deprecated
/* loaded from: classes7.dex */
public final class bcxr {
    public final engw a;
    public final engw b;
    public final bcxq c;

    public bcxr(engw engwVar, bcxq bcxqVar, engw engwVar2) {
        this.b = engwVar;
        this.c = bcxqVar;
        this.a = engwVar2;
    }

    public final bcxq a(final SelfIdentityId selfIdentityId) {
        if (Math.max(this.a.size(), ((enou) this.b).c) > 1) {
            return (bcxq) Collection.EL.stream(this.b).filter(new Predicate() { // from class: bcxn
                public final /* synthetic */ Predicate and(Predicate predicate) {
                    return Predicate$CC.$default$and(this, predicate);
                }

                @Override // java.util.function.Predicate
                /* renamed from: negate */
                public final /* synthetic */ Predicate mo439negate() {
                    return Predicate$CC.$default$negate(this);
                }

                public final /* synthetic */ Predicate or(Predicate predicate) {
                    return Predicate$CC.$default$or(this, predicate);
                }

                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    return emxb.a(((bcxq) obj).e(), SelfIdentityId.this);
                }
            }).findFirst().orElse(null);
        }
        return null;
    }
}
