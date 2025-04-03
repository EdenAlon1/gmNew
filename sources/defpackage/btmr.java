package defpackage;

import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class btmr extends duak {
    public btmr() {
        super("lighter_conversations_table");
    }

    @Override // defpackage.duak
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final btmq b() {
        ah();
        return new btmq(this.c, this.a, this.b, this.d.g(), this.e.g());
    }

    public final void c(boolean z) {
        int intValue = btmu.c().intValue();
        int intValue2 = btmu.c().intValue();
        if (intValue2 < 58810) {
            dtub.w("is_last_message_outgoing", intValue2);
        }
        if (intValue >= 58810) {
            this.a.put("is_last_message_outgoing", Boolean.valueOf(z));
        }
    }

    public final void d(String str) {
        dtub.u(this.a, "lighter_conversation_id_json", str);
    }

    public final void e(boolean z) {
        int intValue = btmu.c().intValue();
        int intValue2 = btmu.c().intValue();
        if (intValue2 < 58700) {
            dtub.w("read", intValue2);
        }
        if (intValue >= 58700) {
            this.a.put("read", Boolean.valueOf(z));
        }
    }

    public final void f(Function function) {
        Object apply;
        String[] strArr = btmu.a;
        apply = function.apply(new btmt());
        af(new btms((btmt) apply));
    }
}
