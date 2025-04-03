package defpackage;

import java.util.ListIterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class enjy extends enqt {
    final /* synthetic */ enkd a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public enjy(ListIterator listIterator, enkd enkdVar) {
        super(listIterator);
        this.a = enkdVar;
    }

    @Override // defpackage.enqs
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        return ((Map.Entry) obj).getValue();
    }

    @Override // defpackage.enqt, java.util.ListIterator
    public final void set(Object obj) {
        enkd enkdVar = this.a;
        emxf.l(enkdVar.c != null);
        enkdVar.c.b = obj;
    }
}
