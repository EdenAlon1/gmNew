package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.queries.MediaSearchQuery;
import j$.util.DesugarArrays;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class blra extends dtyx<blqw, blqy, blra, MediaSearchQuery.BindData, blqv> {
    public blra(String[] strArr) {
        super("parts INNER JOIN messages ON (messages._id=parts.message_id) INNER JOIN participants ON (participants._id=messages.sender_id) LEFT JOIN message_star ON (message_star.message_id=messages._id) LEFT JOIN parent_disallowed_conversations ON (parent_disallowed_conversations.conversation_id=parts.conversation_id) LEFT JOIN conversations ON (conversations._id=parts.conversation_id)", strArr, null, null, "image_display_state IN (0, 1, 3)", "$primary");
    }

    @Override // defpackage.dtyx
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final blqy b() {
        l();
        return new blqy(this.a.a());
    }

    public final void c(blqx... blqxVarArr) {
        C((String) DesugarArrays.stream(blqxVarArr).map(new Function() { // from class: blqz
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((blqx) obj).a();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).collect(Collectors.joining(", ")));
    }

    public final void d(blrc blrcVar) {
        k(new blrb(blrcVar));
    }

    public final void e(Function function) {
        Object apply;
        String[] strArr = MediaSearchQuery.a;
        apply = function.apply(new blrc());
        k(new blrb((blrc) apply));
    }
}
