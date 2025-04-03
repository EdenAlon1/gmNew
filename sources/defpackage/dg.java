package defpackage;

import android.view.View;
import java.util.Collection;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dg extends ffkk implements ffji {
    final /* synthetic */ Collection a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dg(Collection collection) {
        super(1);
        this.a = collection;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        entry.getClass();
        View view = (View) entry.getValue();
        int[] iArr = kvo.a;
        return Boolean.valueOf(ffdx.au(this.a, kvd.f(view)));
    }
}
