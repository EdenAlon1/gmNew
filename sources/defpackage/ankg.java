package defpackage;

import j$.util.DesugarArrays;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ankg extends dtyx {
    public ankg(String[] strArr) {
        super("conversations INNER JOIN conversation_to_participants ON (conversation_to_participants.conversation_id=conversations._id) INNER JOIN participants ON (participants._id=conversation_to_participants.participant_id)", strArr, "conversations._id", null, null, "$primary");
    }

    @Override // defpackage.dtyx
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final anke b() {
        l();
        return new anke(this.a.a());
    }

    public final void c(ankd... ankdVarArr) {
        C((String) DesugarArrays.stream(ankdVarArr).map(new Function() { // from class: ankf
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((ankd) obj).a();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).collect(Collectors.joining(", ")));
    }

    public final void d(anki ankiVar) {
        k(new ankh(ankiVar));
    }

    public final void e(Function function) {
        Object apply;
        String[] strArr = ankj.a;
        apply = function.apply(new anki());
        k(new ankh((anki) apply));
    }
}
