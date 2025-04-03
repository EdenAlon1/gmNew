package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class dwrr {
    public abstract dwrs a();

    public abstract void b(boolean z);

    public final dwrs c() {
        dwrs a = a();
        if (!((dwoi) a).a) {
            emxf.b(false, "Request must provide a group name prefix or a source to filter by");
            return a;
        }
        emxf.a(true);
        emxf.a(true);
        emxf.a(true);
        emxf.a(true);
        emxf.a(true);
        return a;
    }
}
