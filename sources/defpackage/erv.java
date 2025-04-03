package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class erv extends ffkk implements ffji {
    final /* synthetic */ hho a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public erv(hho hhoVar) {
        super(1);
        this.a = hhoVar;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        hho hhoVar = this.a;
        List list = (List) obj;
        if (hhoVar != null) {
            hhoVar.b(list);
        }
        return ffcu.a;
    }
}
