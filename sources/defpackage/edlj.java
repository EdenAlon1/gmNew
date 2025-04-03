package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class edlj extends edpf {
    public edph a;
    private List b;
    private List c;
    private List d;

    @Override // defpackage.edpf
    public final edpi a() {
        List list;
        List list2;
        List list3 = this.b;
        if (list3 != null && (list = this.c) != null && (list2 = this.d) != null) {
            return new ednp(this.a, list3, list, list2);
        }
        StringBuilder sb = new StringBuilder();
        if (this.b == null) {
            sb.append(" periods");
        }
        if (this.c == null) {
            sb.append(" specialDays");
        }
        if (this.d == null) {
            sb.append(" weekdayText");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.edpf
    public final void b(List list) {
        if (list == null) {
            throw new NullPointerException("Null periods");
        }
        this.b = list;
    }

    @Override // defpackage.edpf
    public final void c(List list) {
        if (list == null) {
            throw new NullPointerException("Null specialDays");
        }
        this.c = list;
    }

    @Override // defpackage.edpf
    public final void d(List list) {
        if (list == null) {
            throw new NullPointerException("Null weekdayText");
        }
        this.d = list;
    }
}
