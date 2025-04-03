package defpackage;

import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class brbp extends duak {
    public brbp() {
        super("conversation_classifications_table");
    }

    @Override // defpackage.duak
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final brbo b() {
        ah();
        return new brbo(this.c, this.a, this.b, this.d.g(), this.e.g());
    }

    public final void c(axcj axcjVar) {
        int intValue = brbs.c().intValue();
        int intValue2 = brbs.c().intValue();
        if (intValue2 < 58690) {
            dtub.w("classification_state", intValue2);
        }
        if (intValue >= 58690) {
            if (axcjVar == null) {
                this.a.putNull("classification_state");
            } else {
                this.a.put("classification_state", Integer.valueOf(axcjVar.a()));
            }
        }
    }

    public final void d(axcl axclVar) {
        if (axclVar == null) {
            this.a.putNull("classification_type");
        } else {
            this.a.put("classification_type", Integer.valueOf(axclVar.a()));
        }
    }

    public final void e(long j) {
        int intValue = brbs.c().intValue();
        int intValue2 = brbs.c().intValue();
        if (intValue2 < 58840) {
            dtub.w("impression_count", intValue2);
        }
        if (intValue >= 58840) {
            this.a.put("impression_count", Long.valueOf(j));
        }
    }

    public final void f(Function function) {
        Object apply;
        String[] strArr = brbs.a;
        apply = function.apply(new brbr());
        af(new brbq((brbr) apply));
    }
}
