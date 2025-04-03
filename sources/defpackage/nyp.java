package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class nyp extends ffkk implements ffix {
    final /* synthetic */ nyy a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nyp(nyy nyyVar) {
        super(0);
        this.a = nyyVar;
    }

    @Override // defpackage.ffix
    public final /* bridge */ /* synthetic */ Object invoke() {
        List list;
        ffcf c = this.a.c();
        return (c == null || (list = (List) c.a) == null) ? new ArrayList() : list;
    }
}
