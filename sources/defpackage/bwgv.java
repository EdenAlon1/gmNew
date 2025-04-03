package defpackage;

import j$.util.DesugarArrays;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bwgv extends duav {
    @Override // defpackage.duav
    public final /* synthetic */ duap a() {
        return new bwgs(this);
    }

    public final void b(byze byzeVar) {
        aq(new dtwe("pending_incoming_message_rcs_table.message_status", 1, Integer.valueOf(byzeVar == null ? 0 : byzeVar.ordinal())));
    }

    public final void c(byze... byzeVarArr) {
        aq(new dtrw("pending_incoming_message_rcs_table.message_status", 3, at((Iterable) DesugarArrays.stream(byzeVarArr).map(new Function() { // from class: bwgu
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Integer.valueOf(((byze) obj).ordinal());
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).collect(Collectors.toCollection(new Supplier() { // from class: bwgt
            @Override // java.util.function.Supplier
            public final Object get() {
                return new ArrayList();
            }
        }))), true));
    }

    public final void d(bdhg bdhgVar) {
        aq(new dtrt("pending_incoming_message_rcs_table.rcs_message_id", 1, bdhg.d(bdhgVar)));
    }

    public final void e(String str) {
        aq(new dtrt("pending_incoming_message_rcs_table.remote_user_id", 1, String.valueOf(str)));
    }
}
