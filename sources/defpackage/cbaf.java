package defpackage;

import android.content.Context;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cbaf extends cbcc {
    public final List a;
    private final Context b;

    public cbaf(Context context, cqoh cqohVar, String str, List list) {
        super(str, cqohVar);
        this.b = context;
        this.a = list;
    }

    @Override // defpackage.cbcc
    public final int a() {
        return 0;
    }

    @Override // defpackage.cbcc
    protected final void b() {
        csld.a(this.b, new cbae(this));
    }
}
