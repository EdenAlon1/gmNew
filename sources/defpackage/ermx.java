package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ermx extends RuntimeException {
    private static final long serialVersionUID = 1;
    public final List a;

    public ermx(List list) {
        super("Cyclical graphs can not be topologically sorted.");
        this.a = list;
    }
}
