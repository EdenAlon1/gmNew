package defpackage;

import com.google.android.rcs.client.messaging.data.AutoValue_LocationInformation;
import com.google.android.rcs.client.messaging.data.LocationInformation;
import j$.time.Instant;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class eigg {
    public abstract LocationInformation a();

    public abstract void b(String str);

    public abstract void c(Instant instant);

    public abstract void d(String str);

    public abstract void e(String str);

    public abstract void f(double d);

    public abstract void g(double d);

    public abstract void h(double d);

    public abstract void i(Instant instant);

    public final LocationInformation j() {
        LocationInformation a = a();
        AutoValue_LocationInformation autoValue_LocationInformation = (AutoValue_LocationInformation) a;
        double d = autoValue_LocationInformation.b;
        emxf.m(d >= -180.0d && d <= 180.0d, "Latitude must be between -180 and 180.");
        double d2 = autoValue_LocationInformation.a;
        emxf.m(d2 >= -180.0d && d2 <= 180.0d, "Longitude must be between -180 and 180.");
        autoValue_LocationInformation.c.ifPresent(new Consumer() { // from class: eigf
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                emxf.m(((Double) obj).doubleValue() >= eobe.a, "Radius must be non-negative.");
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        return a;
    }
}
