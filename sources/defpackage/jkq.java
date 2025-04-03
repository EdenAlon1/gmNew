package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jkq extends ffkk implements ffji {
    final /* synthetic */ ffix a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jkq(ffix ffixVar) {
        super(1);
        this.a = ffixVar;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        ((List) obj).add(this.a.invoke());
        return true;
    }
}
