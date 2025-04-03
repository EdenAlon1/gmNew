package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
final class nyq extends ffkk implements ffix {
    final /* synthetic */ nyy a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nyq(nyy nyyVar) {
        super(0);
        this.a = nyyVar;
    }

    @Override // defpackage.ffix
    public final /* bridge */ /* synthetic */ Object invoke() {
        nyy nyyVar = this.a;
        String str = nyyVar.c;
        if (str == null || oac.b(str).getFragment() == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        String fragment = oac.b(nyyVar.c).getFragment();
        StringBuilder sb = new StringBuilder();
        fragment.getClass();
        nyy.h(fragment, arrayList, sb);
        return new ffcf(arrayList, sb.toString());
    }
}
