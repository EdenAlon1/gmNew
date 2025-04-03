package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hfh extends ffkk implements ffix {
    final /* synthetic */ hfm a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hfh(hfm hfmVar) {
        super(0);
        this.a = hfmVar;
    }

    @Override // defpackage.ffix
    public final /* bridge */ /* synthetic */ Object invoke() {
        List d;
        RandomAccess randomAccess;
        hfm hfmVar = this.a;
        if (!hfmVar.q) {
            return ffel.a;
        }
        ArrayList arrayList = new ArrayList();
        d = htu.d(r2, hfmVar.u.q, null);
        arrayList.addAll(d);
        hjq hjqVar = hfmVar.s;
        if (hjqVar.e || hjqVar.c == 0) {
            randomAccess = ffel.a;
        } else {
            randomAccess = new ArrayList();
            int i = hjqVar.h;
            Object valueOf = Integer.valueOf(hjqVar.j - hjt.e(hjqVar.b, i));
            while (i >= 0) {
                htt.a(hjqVar.a.b(i), valueOf);
                valueOf = hjqVar.g(i);
                i = hjqVar.e(i);
            }
        }
        arrayList.addAll(randomAccess);
        arrayList.addAll(hfmVar.S());
        return arrayList;
    }
}
