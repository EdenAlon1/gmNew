package defpackage;

import java.util.Collection;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hnw extends ffkk implements ffji {
    final /* synthetic */ Collection a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hnw(Collection collection) {
        super(1);
        this.a = collection;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return Boolean.valueOf(this.a.contains(obj));
    }
}
