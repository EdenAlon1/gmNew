package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class eamy implements eami {
    final /* synthetic */ List a;

    public eamy(List list) {
        this.a = list;
    }

    @Override // defpackage.eami
    public final int a(eagt eagtVar) {
        eagtVar.getClass();
        if (this.a.contains(eagtVar.s())) {
            return 2;
        }
        return eagtVar.b() == 4 ? 4 : 5;
    }
}
