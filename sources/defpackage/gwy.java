package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gwy extends ffkk implements ffix {
    final /* synthetic */ List a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gwy(List list) {
        super(0);
        this.a = list;
    }

    @Override // defpackage.ffix
    public final /* bridge */ /* synthetic */ Object invoke() {
        Object obj = this.a.get(2);
        obj.getClass();
        return (Integer) obj;
    }
}
