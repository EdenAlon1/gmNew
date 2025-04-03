package defpackage;

import java.util.Collection;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class enqh extends enqs {
    final /* synthetic */ enqi a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public enqh(enqi enqiVar, Iterator it) {
        super(it);
        this.a = enqiVar;
    }

    @Override // defpackage.enqs
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        return enqr.a((Collection) obj, this.a.g);
    }
}
