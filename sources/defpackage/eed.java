package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class eed extends ffkk implements ffji {
    final /* synthetic */ List a;
    final /* synthetic */ List b;
    final /* synthetic */ boolean c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eed(List list, List list2, boolean z) {
        super(1);
        this.a = list;
        this.b = list2;
        this.c = z;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        List list = this.a;
        iqj iqjVar = (iqj) obj;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((eei) list.get(i)).j(iqjVar, this.c);
        }
        List list2 = this.b;
        boolean z = this.c;
        int size2 = list2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((eei) list2.get(i2)).j(iqjVar, z);
        }
        return ffcu.a;
    }
}
