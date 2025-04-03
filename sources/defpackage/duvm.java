package defpackage;

import android.graphics.Bitmap;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class duvm extends qmx {
    public final duvj a;
    public final Bitmap b;

    public duvm(duvj duvjVar, Bitmap bitmap) {
        this.a = duvjVar;
        this.b = bitmap;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof duvm)) {
            return false;
        }
        duvm duvmVar = (duvm) obj;
        return Objects.equals(this.a, duvmVar.a) && Objects.equals(this.b, duvmVar.b);
    }

    public final int hashCode() {
        return (Objects.hashCode(this.a) * 31) + Objects.hashCode(this.b);
    }

    public final String toString() {
        int i = 0;
        Object[] objArr = {this.a, this.b};
        String[] split = "drawParams;bitmap".split(";");
        StringBuilder sb = new StringBuilder("duvm[");
        while (true) {
            int length = split.length;
            if (i >= length) {
                sb.append("]");
                return sb.toString();
            }
            sb.append(split[i]);
            sb.append("=");
            sb.append(objArr[i]);
            if (i != length - 1) {
                sb.append(", ");
            }
            i++;
        }
    }
}
