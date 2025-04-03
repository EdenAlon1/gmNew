package defpackage;

import java.util.Comparator;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cyye implements Comparator {
    final /* synthetic */ cjwi a;

    public cyye(cjwi cjwiVar) {
        this.a = cjwiVar;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return ffgh.a(Integer.valueOf(((czai) obj).b == this.a ? 0 : 1), Integer.valueOf(((czai) obj2).b != this.a ? 1 : 0));
    }
}
