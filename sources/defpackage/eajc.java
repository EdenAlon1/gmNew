package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class eajc {
    public abstract Exception a();

    public abstract Integer b();

    public abstract Map c();

    public abstract byte[] d();

    public abstract byte[] e();

    public abstract void f();

    public final Throwable g() {
        return (a() != null || b() == null || b().intValue() == 200) ? a() : new eajd(b().intValue());
    }
}
