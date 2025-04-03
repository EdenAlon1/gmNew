package defpackage;

import android.view.ViewGroup;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kvw implements ffnl {
    final /* synthetic */ ViewGroup a;

    public kvw(ViewGroup viewGroup) {
        this.a = viewGroup;
    }

    @Override // defpackage.ffnl
    public final Iterator a() {
        return new kus(new kvt(this.a).a(), kvu.a);
    }
}
