package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kdw extends ffkk implements ffji {
    final /* synthetic */ List a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kdw(List list) {
        super(1);
        this.a = list;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        iqj iqjVar = (iqj) obj;
        int e = ffdx.e(this.a);
        if (e >= 0) {
            int i = 0;
            while (true) {
                iqj.m(iqjVar, (iqk) this.a.get(i), 0, 0);
                if (i == e) {
                    break;
                }
                i++;
            }
        }
        return ffcu.a;
    }
}
