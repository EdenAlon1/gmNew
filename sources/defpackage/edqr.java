package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class edqr extends edrr {
    public String a;
    public dhqd b;
    private List c;

    @Override // defpackage.edrr
    public final edrs a() {
        List list;
        String str = this.a;
        if (str != null && (list = this.c) != null) {
            return new edqs(str, list, this.b);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" placeId");
        }
        if (this.c == null) {
            sb.append(" placeFields");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.edrr
    public final void b(List list) {
        if (list == null) {
            throw new NullPointerException("Null placeFields");
        }
        this.c = list;
    }
}
