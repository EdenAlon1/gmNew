package defpackage;

import android.os.Bundle;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class nya extends ffkk implements ffji {
    final /* synthetic */ ffkx a;
    final /* synthetic */ List b;
    final /* synthetic */ ffkz c;
    final /* synthetic */ nyj d;
    final /* synthetic */ Bundle e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nya(ffkx ffkxVar, List list, ffkz ffkzVar, nyj nyjVar, Bundle bundle) {
        super(1);
        this.a = ffkxVar;
        this.b = list;
        this.c = ffkzVar;
        this.d = nyjVar;
        this.e = bundle;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        List list;
        nxm nxmVar = (nxm) obj;
        nxmVar.getClass();
        this.a.a = true;
        int indexOf = this.b.indexOf(nxmVar);
        if (indexOf != -1) {
            int i = indexOf + 1;
            list = this.b.subList(this.c.a, i);
            this.c.a = i;
        } else {
            list = ffel.a;
        }
        this.d.i(nxmVar.b, this.e, nxmVar, list);
        return ffcu.a;
    }
}
