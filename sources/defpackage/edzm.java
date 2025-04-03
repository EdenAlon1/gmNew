package defpackage;

import android.text.TextUtils;
import android.util.Pair;
import j$.util.Objects;
import java.io.InputStream;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class edzm {
    public static void a(InputStream inputStream, Consumer consumer) {
        String a = dkth.a(inputStream);
        while (!emxe.c(a)) {
            Pair pair = null;
            if (TextUtils.isEmpty(a)) {
                dkty.q("Unable to parse header from an empty line!", new Object[0]);
            } else {
                String[] split = a.split(": ");
                if (split.length != 2) {
                    dkty.q("Invalid CPIM header format: %s", a);
                } else {
                    pair = Pair.create(split[0], split[1]);
                }
            }
            if (Objects.isNull(pair)) {
                dkty.q("Skipping invalid element: %s", a);
            } else {
                consumer.accept(pair);
            }
            a = dkth.a(inputStream);
        }
    }
}
