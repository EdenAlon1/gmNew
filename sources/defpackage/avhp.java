package defpackage;

import android.content.Context;
import org.chromium.net.CronetEngine;

/* compiled from: PG */
@Deprecated
/* loaded from: classes6.dex */
public final class avhp {
    public static final cskc a = cskc.g("Bugle", "RbmBusinessInfoUrlHelper");
    public final CronetEngine b;
    public final errl c;
    public final ctvb d;
    public final Context e;
    public final ffbr f;
    private final ezgw g;
    private final ezgw h;

    public avhp(CronetEngine cronetEngine, errl errlVar, ctvb ctvbVar, Context context, ffbr ffbrVar, ezgw ezgwVar, ezgw ezgwVar2) {
        this.b = cronetEngine;
        this.c = errlVar;
        this.d = ctvbVar;
        this.e = context;
        this.f = ffbrVar;
        this.g = ezgwVar;
        this.h = ezgwVar2;
    }

    public static aveo a(String str) {
        return new aveo((String) new eoev(eofa.a()).b(str).orElse(str), new eoew(eofa.a()).b(str));
    }

    public final boolean b(String str) {
        return this.g.b.contains(str) || this.h.b.contains(str);
    }
}
