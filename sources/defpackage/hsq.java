package defpackage;

import java.util.Collection;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hsq extends ffkk implements ffji {
    final /* synthetic */ int a;
    final /* synthetic */ Collection b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hsq(int i, Collection collection) {
        super(1);
        this.a = i;
        this.b = collection;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return Boolean.valueOf(((List) obj).addAll(this.a, this.b));
    }
}
