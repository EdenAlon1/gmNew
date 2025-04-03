package defpackage;

import j$.util.DesugarArrays;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class agkm extends dtyx {
    public agkm(String[] strArr) {
        super("conversations LEFT JOIN messages ON (%MESSAGES_JOIN%) LEFT JOIN participants ON (participants._id=messages.sender_id) LEFT JOIN conversation_to_participants ON (%ONE_ON_ONE_JOIN%) LEFT JOIN participants AS one_on_one_participant ON (one_on_one_participant._id=conversation_to_participants.participant_id) LEFT JOIN profiles_table ON (profiles_table.participant_id=conversation_to_participants.participant_id) LEFT JOIN parts ON (parts.message_id=messages._id) LEFT JOIN reminders ON (reminders.message_id=messages._id) LEFT JOIN conversation_pin ON (conversation_pin.conversation_id=conversations._id)", strArr, "conversations._id", null, null, "$primary");
    }

    @Override // defpackage.dtyx
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final agkk b() {
        l();
        return new agkk(this.a.a());
    }

    public final void c(agkj... agkjVarArr) {
        C((String) DesugarArrays.stream(agkjVarArr).map(new Function() { // from class: agkl
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((agkj) obj).a();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).collect(Collectors.joining(", ")));
    }
}
