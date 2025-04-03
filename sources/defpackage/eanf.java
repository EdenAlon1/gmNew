package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class eanf implements eami {
    final /* synthetic */ List a;

    public eanf(List list) {
        this.a = list;
    }

    @Override // defpackage.eami
    public final int a(eagt eagtVar) {
        eagtVar.getClass();
        if (this.a.contains(eagtVar.s())) {
            return 3;
        }
        if (eagtVar.b() == 5) {
            return 6;
        }
        return eagtVar.b();
    }
}
