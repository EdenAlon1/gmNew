package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class dvwp {
    public abstract dvwq a();

    public abstract void b(String str);

    public abstract void c(eyhs eyhsVar);

    public abstract void d(faxs faxsVar);

    public final dvwq e() {
        dvwq a = a();
        dfli dfliVar = ((dvwo) a).h;
        if (dfliVar != null) {
            faxv b = dfliVar.b();
            boolean z = true;
            if (b != faxv.EVENT_OVERRIDE && b != faxv.EVENT_DEFERRING) {
                z = false;
            }
            emyw.a(z);
        }
        return a;
    }
}
