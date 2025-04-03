package defpackage;

import j$.util.DesugarArrays;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bgmk extends dtyx {
    public bgmk(String[] strArr) {
        super("conversations LEFT JOIN messages ON (%MESSAGES_JOIN%) LEFT JOIN participants ON (participants._id=messages.sender_id) LEFT JOIN conversation_participants ON (%ONE_ON_ONE_JOIN%) LEFT JOIN participants AS one_on_one_participant ON (one_on_one_participant._id=conversation_participants.participant_id) LEFT JOIN profiles_table ON (profiles_table.participant_id=conversation_participants.participant_id) LEFT JOIN parts ON (parts.message_id=messages._id) LEFT JOIN vmt ON (vmt.part_id=parts._id) LEFT JOIN reminders ON (reminders.message_id=conversations.latest_message_id) LEFT JOIN messages_annotations ON (conversations.latest_message_id = messages_annotations.message_id and annotation_type = 1) LEFT JOIN message_star ON (message_star.message_id=messages._id) LEFT JOIN parent_disallowed_conversations ON (parent_disallowed_conversations.conversation_id=conversations._id)", strArr, null, null, null, "$primary");
    }

    @Override // defpackage.dtyx
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final bgmi b() {
        l();
        return new bgmi(this.a.a());
    }

    public final void c(bgmh... bgmhVarArr) {
        C((String) DesugarArrays.stream(bgmhVarArr).map(new Function() { // from class: bgmj
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((bgmh) obj).a();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).collect(Collectors.joining(", ")));
    }

    public final void d(bgmm bgmmVar) {
        k(new bgml(bgmmVar));
    }
}
