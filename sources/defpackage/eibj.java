package defpackage;

import android.text.TextUtils;
import j$.util.Optional;
import java.util.Arrays;

/* compiled from: PG */
@Deprecated
/* loaded from: classes5.dex */
public abstract class eibj {
    public abstract double a();

    public abstract double b();

    public abstract Optional c();

    public abstract Optional d();

    public abstract Optional e();

    public abstract Optional f();

    public abstract Optional g();

    public abstract Optional h();

    public abstract String i();

    public final String toString() {
        return String.format("LocationInformation {%s}", TextUtils.join(",", Arrays.asList(String.format("id=%s", i()), String.format("timestamp=%s", h()), String.format("label=%s", dktx.LOCATION.c(e())), String.format("location=%s", dktx.LOCATION.c(f())), String.format("longitude=%s", dktx.LOCATION.c(Double.valueOf(b()))), String.format("latitude=%s", dktx.LOCATION.c(Double.valueOf(a()))), String.format("radius=%s", dktx.LOCATION.c(g())), String.format("entity=%s", dktx.LOCATION.c(c())))));
    }
}
