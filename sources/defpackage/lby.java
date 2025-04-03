package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes.dex */
final class lby extends ffkk implements ffjm {
    public static final lby a = new lby();

    public lby() {
        super(2);
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        lct lctVar = (lct) obj;
        Throwable th = (Throwable) obj2;
        lctVar.getClass();
        if (th == null) {
            th = new CancellationException("DataStore scope was cancelled before updateData could complete");
        }
        lctVar.b.a(th);
        return ffcu.a;
    }
}
