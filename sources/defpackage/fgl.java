package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fgl extends ffkk implements ffji {
    final /* synthetic */ List a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fgl(List list) {
        super(1);
        this.a = list;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        List list = this.a;
        iqj iqjVar = (iqj) obj;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            iqjVar.e((iqk) list.get(i), 0, 0, 0.0f);
        }
        return ffcu.a;
    }
}
