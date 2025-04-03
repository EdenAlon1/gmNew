package defpackage;

import java.util.Collection;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ctza implements ctzc {
    final /* synthetic */ dloz a;
    final /* synthetic */ dloz b;
    final /* synthetic */ Collection c;

    public ctza(dloz dlozVar, dloz dlozVar2, Collection collection) {
        this.a = dlozVar;
        this.b = dlozVar2;
        this.c = collection;
    }

    @Override // defpackage.ctzc
    public final boolean a(String str) {
        return this.a.b(str) || this.b.b(str) || this.c.contains(str);
    }

    @Override // defpackage.dloz
    public final boolean b(String str) {
        return this.a.b(str);
    }
}
