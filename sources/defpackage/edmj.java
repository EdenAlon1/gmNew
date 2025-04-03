package defpackage;

import android.os.Parcelable;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class edmj implements Parcelable {
    public static edmi d(String str, List list) {
        edku edkuVar = new edku();
        if (str == null) {
            throw new NullPointerException("Null name");
        }
        edkuVar.a = str;
        edkuVar.b(list);
        return edkuVar;
    }

    public abstract String a();

    public abstract String b();

    public abstract List c();
}
