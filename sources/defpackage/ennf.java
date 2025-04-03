package defpackage;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ennf extends ennj {
    final /* synthetic */ Comparator a;

    public ennf(Comparator comparator) {
        this.a = comparator;
    }

    @Override // defpackage.ennj
    public final Map a() {
        return new TreeMap(this.a);
    }
}
