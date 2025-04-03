package defpackage;

import j$.util.DesugarCollections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aud {
    public final List a;
    public final List b;
    public final List c;
    public final long d;

    public aud(auc aucVar) {
        this.a = DesugarCollections.unmodifiableList(aucVar.a);
        this.b = DesugarCollections.unmodifiableList(aucVar.b);
        this.c = DesugarCollections.unmodifiableList(aucVar.c);
        this.d = aucVar.d;
    }
}
