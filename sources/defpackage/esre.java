package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class esre extends esrh {
    public String a;
    public Optional b = Optional.empty();
    public Optional c = Optional.empty();
    private final Optional d = Optional.empty();
    private int e;

    @Override // defpackage.esrh
    public final esri a() {
        String str;
        int i = this.e;
        if (i != 0 && (str = this.a) != null) {
            return new esrf(i, str, this.b, this.c, this.d);
        }
        StringBuilder sb = new StringBuilder();
        if (this.e == 0) {
            sb.append(" severity");
        }
        if (this.a == null) {
            sb.append(" text");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.esrh
    public final esrh b(int i) {
        this.e = i;
        return this;
    }
}
