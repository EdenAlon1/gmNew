package defpackage;

import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ajxz implements Function {
    public static final ajxz a = new ajxz();

    @Override // java.util.function.Function
    /* renamed from: andThen */
    public final /* synthetic */ Function mo448andThen(Function function) {
        return Function$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        bxmt bxmtVar = (bxmt) obj;
        bxmtVar.b(bxmw.b);
        bxmv bxmvVar = bxmv.b;
        bxmtVar.aq(new dtwe("restore_workflow_files.status", 2, Integer.valueOf(bxmvVar == null ? 0 : bxmvVar.ordinal())));
        return bxmtVar;
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function$CC.$default$compose(this, function);
    }
}
