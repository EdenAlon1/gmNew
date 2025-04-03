package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class eux extends ffkk implements ffji {
    final /* synthetic */ eva a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eux(eva evaVar) {
        super(1);
        this.a = evaVar;
    }

    @Override // defpackage.ffji
    public final /* synthetic */ Object invoke(Object obj) {
        ffji ffjiVar;
        jdt jdtVar;
        int i = ((juu) obj).a;
        boolean b = juu.b(i, 7);
        eut eutVar = this.a.m;
        ffcu ffcuVar = null;
        if (b) {
            ffjiVar = eutVar.a().b;
        } else {
            if (juu.b(i, 2)) {
                eutVar.a();
            } else if (juu.b(i, 6)) {
                ffjiVar = eutVar.a().c;
            } else if (juu.b(i, 5)) {
                eutVar.a();
            } else if (juu.b(i, 3)) {
                ffjiVar = eutVar.a().d;
            } else if (juu.b(i, 4)) {
                ffjiVar = eutVar.a().e;
            } else if (!juu.b(i, 1) && !juu.b(i, 0)) {
                throw new IllegalStateException("invalid ImeAction");
            }
            ffjiVar = null;
        }
        if (ffjiVar != null) {
            ffjiVar.invoke(eutVar);
            ffcuVar = ffcu.a;
        }
        if (ffcuVar == null) {
            if (juu.b(i, 6)) {
                eutVar.b().b(1);
            } else if (juu.b(i, 5)) {
                eutVar.b().b(2);
            } else if (juu.b(i, 7) && (jdtVar = eutVar.c) != null) {
                jdtVar.a();
            }
        }
        return ffcu.a;
    }
}
