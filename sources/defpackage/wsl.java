package defpackage;

import android.content.Context;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wsl implements wqq {
    public final cuxz a;
    private final ffxx b;
    private final Set c;

    public wsl(Context context, aawu aawuVar, cuxz cuxzVar) {
        context.getClass();
        aawuVar.getClass();
        cuxzVar.getClass();
        this.a = cuxzVar;
        this.b = new wsk(aawuVar.a(), context, this, aawuVar);
        this.c = fffi.d(aaxf.b, aaxf.c);
    }

    @Override // defpackage.wqq
    public final Set a() {
        return this.c;
    }

    @Override // defpackage.wqq
    public final ffxx b() {
        return this.b;
    }
}
