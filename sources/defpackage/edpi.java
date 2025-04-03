package defpackage;

import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class edpi implements Parcelable {
    public static edpf e() {
        edlj edljVar = new edlj();
        edljVar.b(new ArrayList());
        edljVar.c(new ArrayList());
        edljVar.d(new ArrayList());
        return edljVar;
    }

    public abstract edph a();

    public abstract List b();

    public abstract List c();

    public abstract List d();
}
