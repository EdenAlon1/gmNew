package defpackage;

import j$.util.DesugarArrays;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bqku extends duav {
    @Override // defpackage.duav
    public final /* synthetic */ duap a() {
        return new bqkq(this);
    }

    public final void b(bqkw... bqkwVarArr) {
        aq(new dtrw("cms_dead_letter_queue.abandoned_action", 3, at((Iterable) DesugarArrays.stream(bqkwVarArr).map(new Function() { // from class: bqkr
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Integer.valueOf(((bqkw) obj).ordinal());
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).collect(Collectors.toCollection(new bqks()))), true));
    }

    public final void c(int i) {
        int intValue = bqkv.c().intValue();
        if (intValue < 57090) {
            dtub.w("bugle_table_type", intValue);
        }
        aq(new dtwe("cms_dead_letter_queue.bugle_table_type", 1, Integer.valueOf(i)));
    }

    public final void d(String str) {
        aq(new dtrt("cms_dead_letter_queue._id", 1, String.valueOf(str)));
    }
}
