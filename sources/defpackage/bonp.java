package defpackage;

import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bonp extends dtyx {
    public bonp(String[] strArr) {
        super("conversation_to_participants INNER JOIN participants ON (participants._id=conversation_to_participants.participant_id)", strArr, null, null, null, "$primary");
    }

    @Override // defpackage.dtyx
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final bono b() {
        l();
        return new bono(this.a.a());
    }

    public final void c(Function function) {
        Object apply;
        apply = function.apply(bons.c);
        bonm[] bonmVarArr = {(bonm) apply};
        int a = bons.a().P().a();
        Integer.valueOf(a).getClass();
        if (((Integer) bons.b.getOrDefault(bonmVarArr[0].toString(), -1)).intValue() > a) {
            dtub.w("columnReference.toString()", a);
        }
        m(bonmVarArr);
    }

    public final void d(Function function) {
        Object apply;
        String[] strArr = bons.a;
        apply = function.apply(new bonr());
        k(new bonq((bonr) apply));
    }
}
