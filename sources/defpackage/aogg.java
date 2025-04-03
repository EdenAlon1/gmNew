package defpackage;

import j$.util.Collection;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aogg implements fbba {
    public static aojk a(Set set) {
        if (set.isEmpty()) {
            return new aojj();
        }
        if (set.size() <= 1) {
            return (aojk) Collection.EL.stream(set).findFirst().get();
        }
        throw new IllegalStateException("@Override CsMessagingIdentityFlags bound multiple times");
    }

    @Override // defpackage.ffbr, defpackage.ffbq
    public final /* bridge */ /* synthetic */ Object b() {
        throw null;
    }
}
