package defpackage;

import com.google.android.rcs.client.messaging.MessagingResult;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes4.dex */
class djfg implements Function {
    @Override // java.util.function.Function
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final MessagingResult apply(dkjw dkjwVar) {
        eibw d = MessagingResult.d();
        b(dkjwVar, d);
        d.b(dkjwVar.a());
        d.d(dkjwVar.c());
        return d.e();
    }

    @Override // java.util.function.Function
    /* renamed from: andThen */
    public final /* synthetic */ Function mo448andThen(Function function) {
        return Function$CC.$default$andThen(this, function);
    }

    public void b(dkjw dkjwVar, eibw eibwVar) {
        throw null;
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function$CC.$default$compose(this, function);
    }
}
