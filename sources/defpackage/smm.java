package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class smm {
    private final skp a;

    public smm(skp skpVar) {
        skpVar.getClass();
        this.a = skpVar;
    }

    public static final boolean b() {
        if (!((Boolean) ((cfup) shw.b.get()).e()).booleanValue()) {
            return true;
        }
        cfup cfupVar = shv.a;
        return ((Boolean) ((cfup) shv.j.get()).e()).booleanValue();
    }

    public final ffxx a(Uri uri) {
        return new sml(new smi(this.a.a, uri));
    }
}
