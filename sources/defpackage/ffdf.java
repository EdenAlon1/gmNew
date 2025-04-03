package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class ffdf extends ffkk implements ffji {
    final /* synthetic */ ffdg a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ffdf(ffdg ffdgVar) {
        super(1);
        this.a = ffdgVar;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        entry.getClass();
        Object key = entry.getKey();
        ffdg ffdgVar = this.a;
        return ffdgVar.j(key) + "=" + ffdgVar.j(entry.getValue());
    }
}
