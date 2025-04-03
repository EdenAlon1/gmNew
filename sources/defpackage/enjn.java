package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class enjn extends enqs {
    final /* synthetic */ emwl a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public enjn(Iterator it, emwl emwlVar) {
        super(it);
        this.a = emwlVar;
    }

    @Override // defpackage.enqs
    public final Object a(Object obj) {
        return this.a.apply(obj);
    }
}
