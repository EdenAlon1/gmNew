package defpackage;

import j$.util.DesugarArrays;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bjji extends dtyx {
    public bjji(String[] strArr) {
        super("messages LEFT JOIN parts ON (parts.message_id=messages._id AND %PARTS_JOIN_TIMESTAMP_CHECK%) LEFT JOIN participants ON (participants._id=messages.sender_id) LEFT JOIN reports_concat_view ON (reports_concat_view.message_id_read_reports=messages._id AND %REPORTS_JOIN_TIMESTAMP_CHECK%) LEFT JOIN user_refs_concat_view ON (user_refs_concat_view.message_id_user_references=messages._id) LEFT JOIN link_preview ON (link_preview.message_id=messages._id) LEFT JOIN verified_sms_senders ON (verified_sms_senders.sender_id=participants.normalized_destination) LEFT JOIN verified_sms_brands ON (verified_sms_brands.brand_id=verified_sms_senders.brand_id) LEFT JOIN conversations ON (conversations._id=messages.conversation_id) LEFT JOIN message_reactions ON (message_reactions.message_id=messages._id) LEFT JOIN file_transfer ON (file_transfer.message_id=messages._id) LEFT JOIN message_star ON (message_star.message_id=messages._id) LEFT JOIN message_photos_sharing ON (message_photos_sharing.message_id=messages._id) LEFT JOIN vmt ON (vmt.part_id=parts._id) LEFT JOIN message_replies_view ON (%REPLIES_VIEW_JOIN%) LEFT JOIN profiles_table ON (profiles_table.participant_id=participants._id) LEFT JOIN message_captions ON (message_captions.message_id=messages._id)", strArr, "messages._id", "messages.received_timestamp DESC, messages._id DESC", null, "$primary");
    }

    @Override // defpackage.dtyx
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final bjjg b() {
        l();
        return new bjjg(this.a.a());
    }

    public final void c(bjjf... bjjfVarArr) {
        C((String) DesugarArrays.stream(bjjfVarArr).map(new Function() { // from class: bjjh
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((bjjf) obj).a();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).collect(Collectors.joining(", ")));
    }

    public final void d(Function function) {
        Object apply;
        apply = function.apply(bjjn.c);
        bjjc[] bjjcVarArr = (bjjc[]) apply;
        int intValue = bjjn.c().intValue();
        for (bjjc bjjcVar : bjjcVarArr) {
            if (((Integer) bjjn.b.getOrDefault(bjjcVar.toString(), -1)).intValue() > intValue) {
                dtub.w("columnReference.toString()", intValue);
            }
        }
        m(bjjcVarArr);
    }

    public final void e(bjjm bjjmVar) {
        k(new bjjj(bjjmVar));
    }

    public final void f(Function function) {
        Object apply;
        String[] strArr = bjjn.a;
        apply = function.apply(new bjjm());
        k(new bjjj((bjjm) apply));
    }
}
