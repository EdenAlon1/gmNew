package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class edku extends edmi {
    public String a;
    public String b;
    private List c;

    @Override // defpackage.edmi
    public final edmj a() {
        List list;
        String str = this.a;
        if (str != null && (list = this.c) != null) {
            return new edmr(str, this.b, list);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" name");
        }
        if (this.c == null) {
            sb.append(" types");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.edmi
    public final void b(List list) {
        if (list == null) {
            throw new NullPointerException("Null types");
        }
        this.c = list;
    }
}
