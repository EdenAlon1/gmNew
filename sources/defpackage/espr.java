package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class espr {
    public abstract enhk a();

    public abstract String b();

    public abstract String c();

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(c() + "/" + b());
        for (Map.Entry entry : a().entrySet()) {
            Object key = entry.getKey();
            key.getClass();
            Object value = entry.getValue();
            value.getClass();
            sb.append("; " + ((String) key) + "=" + ((String) value));
        }
        return sb.toString();
    }
}
