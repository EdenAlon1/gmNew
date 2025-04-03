package defpackage;

import android.view.ViewGroup;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kvt implements ffnl {
    final /* synthetic */ ViewGroup a;

    public kvt(ViewGroup viewGroup) {
        this.a = viewGroup;
    }

    @Override // defpackage.ffnl
    public final Iterator a() {
        return new kvv(this.a);
    }
}
