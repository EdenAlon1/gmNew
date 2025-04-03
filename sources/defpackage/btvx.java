package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import j$.util.DesugarArrays;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class btvx extends duav {
    @Override // defpackage.duav
    public final /* synthetic */ duap a() {
        return new btvt(this);
    }

    public final void b(fbrc fbrcVar) {
        aq(new dtwe("message_classifications_table.classification_type", 1, Integer.valueOf(fbrcVar == null ? 0 : fbrcVar.a())));
    }

    public final void c(fbrc... fbrcVarArr) {
        aq(new dtrw("message_classifications_table.classification_type", 3, at((Iterable) DesugarArrays.stream(fbrcVarArr).map(new Function() { // from class: btvu
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Integer.valueOf(((fbrc) obj).a());
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).collect(Collectors.toCollection(new btvv()))), true));
    }

    public final void d(MessageIdType messageIdType) {
        aq(new dtrt("message_classifications_table.message_id", 1, Long.valueOf(bdhb.a(messageIdType))));
    }

    public final void e(dtzj dtzjVar) {
        aq(new dtru("message_classifications_table.message_id", 3, dtzjVar));
    }
}
