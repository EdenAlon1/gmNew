package defpackage;

import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class brwt extends duak {
    public brwt() {
        super("conversation_participants");
    }

    @Override // defpackage.duak
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final brws b() {
        ah();
        return new brws(this.c, this.a, this.b, this.d.g(), this.e.g());
    }

    public final void c(long j) {
        dtub.t(this.a, "participant_id", j);
    }

    public final void d(awwp awwpVar) {
        int intValue = brww.d().intValue();
        int intValue2 = brww.d().intValue();
        if (intValue2 < 58570) {
            dtub.w("rcs_group_join_status", intValue2);
        }
        if (intValue >= 58570) {
            if (awwpVar == null) {
                this.a.putNull("rcs_group_join_status");
            } else {
                this.a.put("rcs_group_join_status", Integer.valueOf(awwpVar.e));
            }
        }
    }

    public final void e(Function function) {
        Object apply;
        String[] strArr = brww.a;
        apply = function.apply(new brwv());
        af(new brwu((brwv) apply));
    }
}
