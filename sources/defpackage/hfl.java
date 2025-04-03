package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hfl extends ffkk implements ffji {
    final /* synthetic */ Object a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hfl(Object obj) {
        super(1);
        this.a = obj;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object obj2 = this.a;
        boolean z = true;
        if (obj != obj2) {
            hjl hjlVar = obj instanceof hjl ? (hjl) obj : null;
            if ((hjlVar != null ? hjlVar.a : null) != obj2) {
                z = false;
            }
        }
        return Boolean.valueOf(z);
    }
}
