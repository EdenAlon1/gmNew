package defpackage;

import android.content.Context;
import android.os.Build;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dkuv {
    private final Context b;
    public Optional a = Optional.empty();
    private Optional c = Optional.empty();

    public dkuv(Context context) {
        this.b = context;
    }

    public static String c(String str) {
        return d("Goog") + "/" + d(str);
    }

    private static String d(String str) {
        return str == null ? "" : str.replace(' ', '_');
    }

    public final String a() {
        if (this.c.isEmpty()) {
            final StringBuilder sb = new StringBuilder("IM-client/OMA1.0");
            sb.append(" ");
            sb.append(d(Build.MANUFACTURER));
            sb.append("/");
            sb.append(d(Build.MODEL));
            sb.append("-");
            sb.append(d(Build.VERSION.RELEASE));
            sb.append(" ");
            sb.append(c(b()));
            this.a.ifPresent(new Consumer() { // from class: dkuu
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    sb.append((String) obj);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            this.c = Optional.of(sb.toString());
        }
        return (String) this.c.get();
    }

    public final String b() {
        Context context = this.b;
        return dkvy.e(context, dkvy.a(context), 2);
    }
}
