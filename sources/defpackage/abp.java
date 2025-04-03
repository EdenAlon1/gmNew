package defpackage;

import java.util.ListIterator;

/* compiled from: PG */
/* loaded from: classes.dex */
final class abp extends ffkk implements ffji {
    final /* synthetic */ aca a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public abp(aca acaVar) {
        super(1);
        this.a = acaVar;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object obj2;
        ((aak) obj).getClass();
        aca acaVar = this.a;
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
        abo aboVar = (abo) obj2;
        if (acaVar.b != null) {
            acaVar.c();
        }
        acaVar.b = aboVar;
        if (aboVar != null) {
            aboVar.d();
        }
        return ffcu.a;
    }
}
