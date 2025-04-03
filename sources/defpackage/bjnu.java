package defpackage;

import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bjnu extends dtyx {
    public bjnu(String[] strArr) {
        super("conversation_to_participants LEFT JOIN participants ON (participants._id=conversation_to_participants.participant_id)", strArr, null, null, null, "$primary");
    }

    @Override // defpackage.dtyx
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final bjnt b() {
        l();
        return new bjnt(this.a.a());
    }

    public final void c(Function function) {
        Object apply;
        String[] strArr = bjnz.a;
        apply = function.apply(new bjny());
        k(new bjnv((bjny) apply));
    }
}
