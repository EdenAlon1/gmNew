package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class enml extends enqs {
    final /* synthetic */ emwl a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public enml(Iterator it, emwl emwlVar) {
        super(it);
        this.a = emwlVar;
    }

    @Override // defpackage.enqs
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        return new engj(obj, this.a.apply(obj));
    }
}
