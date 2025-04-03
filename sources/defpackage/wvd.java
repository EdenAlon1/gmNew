package defpackage;

import android.content.Context;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wvd implements wqq {
    public final Context a;
    public final alye b;
    public final cuxz c;
    public final deaj d;
    public final zdo e;
    private final ffxx f;
    private final Set g;

    public wvd(Context context, aawu aawuVar, alye alyeVar, zdo zdoVar, cuxz cuxzVar, deaj deajVar) {
        context.getClass();
        aawuVar.getClass();
        alyeVar.getClass();
        zdoVar.getClass();
        cuxzVar.getClass();
        deajVar.getClass();
        this.a = context;
        this.b = alyeVar;
        this.e = zdoVar;
        this.c = cuxzVar;
        this.d = deajVar;
        this.f = new wvc(aawuVar.a(), this);
        this.g = fffi.b(aaxf.b);
    }

    @Override // defpackage.wqq
    public final Set a() {
        return this.g;
    }

    @Override // defpackage.wqq
    public final ffxx b() {
        return this.f;
    }
}
