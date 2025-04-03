package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ert extends ffkk implements ffix {
    final /* synthetic */ hho a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ert(hho hhoVar) {
        super(0);
        this.a = hhoVar;
    }

    @Override // defpackage.ffix
    public final /* bridge */ /* synthetic */ Object invoke() {
        hho hhoVar = this.a;
        if (hhoVar != null) {
            return (List) hhoVar.a();
        }
        return null;
    }
}
