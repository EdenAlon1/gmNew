package defpackage;

import java.util.ListIterator;

/* compiled from: PG */
/* loaded from: classes.dex */
final class abq extends ffkk implements ffji {
    final /* synthetic */ aca a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public abq(aca acaVar) {
        super(1);
        this.a = acaVar;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object obj2;
        aak aakVar = (aak) obj;
        aakVar.getClass();
        aca acaVar = this.a;
        abo aboVar = acaVar.b;
        if (aboVar == null) {
            ffdn ffdnVar = acaVar.a;
            ListIterator<E> listIterator = ffdnVar.listIterator(ffdnVar.a);
            while (true) {
                if (!listIterator.hasPrevious()) {
                    obj2 = null;
                    break;
                }
                obj2 = listIterator.previous();
                if (((abo) obj2).b) {
                    break;
                }
            }
            aboVar = (abo) obj2;
        }
        if (aboVar != null) {
            aboVar.c(aakVar);
        }
        return ffcu.a;
    }
}
