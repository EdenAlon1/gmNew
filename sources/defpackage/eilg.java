package defpackage;

import com.google.android.rcs.client.messaging.data.GroupInformation;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes5.dex */
abstract class eilg implements Function {
    @Override // java.util.function.Function
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final clov apply(GroupInformation groupInformation) {
        clou clouVar = (clou) clov.a.createBuilder();
        String e = groupInformation.e();
        clouVar.copyOnWrite();
        clov clovVar = (clov) clouVar.instance;
        clovVar.b |= 1;
        clovVar.c = e;
        e(groupInformation, clouVar);
        b(groupInformation, clouVar);
        c(groupInformation, clouVar);
        d(groupInformation, clouVar);
        if (groupInformation.c().isPresent()) {
            f(groupInformation, clouVar);
        }
        return (clov) clouVar.build();
    }

    @Override // java.util.function.Function
    /* renamed from: andThen */
    public final /* synthetic */ Function mo448andThen(Function function) {
        return Function$CC.$default$andThen(this, function);
    }

    public abstract void b(GroupInformation groupInformation, clou clouVar);

    public void c(GroupInformation groupInformation, clou clouVar) {
        throw null;
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function$CC.$default$compose(this, function);
    }

    public abstract void d(GroupInformation groupInformation, clou clouVar);

    public void e(GroupInformation groupInformation, clou clouVar) {
        throw null;
    }

    public abstract void f(GroupInformation groupInformation, clou clouVar);
}
