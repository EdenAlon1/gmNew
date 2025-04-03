package defpackage;

import java.util.Comparator;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eniy extends enhj {
    private static final long serialVersionUID = 0;
    private final Comparator a;

    public eniy(eniz enizVar) {
        super(enizVar);
        this.a = enizVar.comparator();
    }

    @Override // defpackage.enhj
    public final /* bridge */ /* synthetic */ enhd a(int i) {
        return new enix(this.a);
    }
}
