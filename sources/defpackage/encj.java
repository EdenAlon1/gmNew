package defpackage;

import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
class encj extends ennp {
    final /* synthetic */ encm a;

    public encj(encm encmVar) {
        this.a = encmVar;
    }

    @Override // defpackage.ennp
    public final ennd a() {
        return this.a;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator<Map.Entry> iterator() {
        return this.a.l();
    }
}
