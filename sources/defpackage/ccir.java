package defpackage;

import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class ccir implements Function {
    final /* synthetic */ long a;

    public ccir(long j) {
        this.a = j;
    }

    @Override // java.util.function.Function
    /* renamed from: andThen */
    public final /* synthetic */ Function mo448andThen(Function function) {
        return Function$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        bqml bqmlVar = (bqml) obj;
        bqmlVar.aq(new dtwe("cms_deleted_messages_buffer.deletion_timestamp", 8, Long.valueOf(this.a)));
        return bqmlVar;
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function$CC.$default$compose(this, function);
    }
}
