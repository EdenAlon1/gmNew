package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class els extends ffkk implements ffji {
    final /* synthetic */ fflb a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public els(fflb fflbVar) {
        super(1);
        this.a = fflbVar;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        ixv ixvVar = (ixv) obj;
        ixvVar.getClass();
        ekh ekhVar = ((emd) ixvVar).a;
        fflb fflbVar = this.a;
        List list = (List) fflbVar.a;
        if (list != null) {
            list.add(ekhVar);
        } else {
            list = ffdx.i(ekhVar);
        }
        fflbVar.a = list;
        return ixu.b;
    }
}
