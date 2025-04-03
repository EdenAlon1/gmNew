package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gsr extends ffkk implements ffji {
    final /* synthetic */ List a;
    final /* synthetic */ iqk b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gsr(List list, iqk iqkVar) {
        super(1);
        this.a = list;
        this.b = iqkVar;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        iqj iqjVar = (iqj) obj;
        iqjVar.e((iqk) this.a.get(0), 0, 0, 0.0f);
        iqjVar.e((iqk) this.a.get(1), ((iqk) this.a.get(0)).a, 0, 0.0f);
        int i = ((iqk) this.a.get(0)).a;
        iqk iqkVar = this.b;
        iqjVar.e(iqkVar, i - (iqkVar.a / 2), 0, 0.0f);
        return ffcu.a;
    }
}
