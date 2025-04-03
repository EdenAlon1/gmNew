package defpackage;

import java.util.Collection;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dlpa implements dloz {
    final /* synthetic */ Collection a;

    public dlpa(Collection collection) {
        this.a = collection;
    }

    @Override // defpackage.dloz
    public final boolean b(String str) {
        return this.a.contains(str);
    }
}
