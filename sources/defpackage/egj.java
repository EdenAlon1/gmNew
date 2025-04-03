package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class egj extends ffkk implements ffji {
    final /* synthetic */ hho a;
    final /* synthetic */ List b;
    final /* synthetic */ List c;
    final /* synthetic */ boolean d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public egj(hho hhoVar, List list, List list2, boolean z) {
        super(1);
        this.a = hhoVar;
        this.b = list;
        this.c = list2;
        this.d = z;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        ((iqj) obj).j(new egi(this.b, this.c, this.d));
        elq.a(this.a);
        return ffcu.a;
    }
}
