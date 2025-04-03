package defpackage;

import java.util.Comparator;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ewxu implements Comparator {
    final /* synthetic */ ewxv a;

    public ewxu(ewxv ewxvVar) {
        this.a = ewxvVar;
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        return Float.compare(((Float) this.a.a.get((String) obj2)).floatValue(), ((Float) this.a.a.get((String) obj)).floatValue());
    }
}
